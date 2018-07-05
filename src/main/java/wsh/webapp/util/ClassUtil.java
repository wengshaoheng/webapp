package wsh.webapp.util;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ClassUtil {
	
	public static List<Class<?>> findAllClassByPkg(String pkg) {
		List<Class<?>> clzList = new ArrayList<Class<?>>();
		
		try {
			String tmpPkg = pkg.replaceAll("[\\\\\\/]", ".");
			ClassLoader loader = ClassUtil.class.getClassLoader();
			Enumeration<URL> eurl = loader.getResources(pkg);
			while (eurl.hasMoreElements()) {
				System.out.println("xxxx" + eurl.nextElement());
			}
			URL url = loader.getResource(pkg);
			URI uri = url.toURI();
			File pkgDir = new File(uri);
			File[] files = pkgDir.listFiles();
			for (File file : files) {
				String name = file.getName();
				if (file.isFile() && name.endsWith(".class")) {
					String clz = tmpPkg + "." + name.substring(0, name.indexOf(".class"));
					System.out.println(clz);
					clzList.add(Class.forName(clz));
				}
				if (file.isDirectory()) {
					String tmp = file.getPath().replace("" + File.separator, "/");
					String subPkg = tmp.substring(tmp.indexOf("/" + pkg) + 1);
					clzList.addAll(findAllClassByPkg(subPkg));
				}
			}
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
		
		return clzList;
	}
	
	public static List<Class<?>> findAllClassByPkg(ClassLoader loader, String pkg) {
		List<Class<?>> clzList = new ArrayList<Class<?>>();
		
		try {
			String tmpPkg = pkg.replaceAll("[\\\\\\/]", ".");
			URL url = loader.getResource(pkg);
			URI uri = url.toURI();
			File pkgDir = new File(uri);
			File[] files = pkgDir.listFiles();
			for (File file : files) {
				String name = file.getName();
				if (file.isFile() && name.endsWith(".class")) {
					String clz = tmpPkg + "." + name.substring(0, name.indexOf(".class"));
					System.out.println(clz);
					clzList.add(Class.forName(clz));
				}
				if (file.isDirectory()) {
					String tmp = file.getPath().replace("" + File.separator, "/");
					String subPkg = tmp.substring(tmp.indexOf("/" + pkg) + 1);
					clzList.addAll(findAllClassByPkg(subPkg));
				}
			}
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
		
		return clzList;
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(findAllClassByPkg("wsh/webapp"));
	}

}
