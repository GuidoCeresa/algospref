/*
 * Main script to setup algospref on installation
 */

//--utilizza le special variables provided by Gant
String source = "${pluginBasedir}"
String dest = "${basedir}"
source = dest + "/" + source + "/"
dest = dest + "/"

//--directory dell'applicazione
String appDir = "grails-app/"
String confDir = "${appDir}conf/"
String i18Dir = "${appDir}i18n/"

// copy readme into project
moveFile(source, dest, "${appDir}README", "README-Pref")
print('------------')
print('Algospref - creato (o sovrascritto) README-Pref')
print('------------')

// copy LogoBootStrap into project
moveFile(source, dest, "${confDir}PrefBootStrap.groovy")
print('------------')
print('Algospref - creato (NON sovrascritto) PrefBootStrap')
print('------------')

// copy i18n into project
moveFile(source, dest, "${i18Dir}algospref.properties")
print('------------')
print('Algospref - creato (o sovrascritto) grails-app/i18n/algospref.properties')
print('------------')


public static moveFile(String srcDirPath, String dstDirPath, String fileName) {
    moveFile(srcDirPath, dstDirPath, fileName, fileName)
} // fine del metodo

public static moveFile(String srcDirPath, String dstDirPath, String srcFileName, String dstFileName) {
    String srcFile = srcDirPath + srcFileName
    String destFile = dstDirPath + dstFileName

    copyFile(srcFile, destFile)
} // fine del metodo

public static copyFile(String srcFile, String destFile) {
    new AntBuilder().copy(file: srcFile, tofile: destFile, overwrite: true)
} // fine del metodo
