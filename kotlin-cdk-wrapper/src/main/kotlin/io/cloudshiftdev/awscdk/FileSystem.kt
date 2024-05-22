@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * File system utilities.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * FileSystem fileSystem = new FileSystem();
 * ```
 */
public open class FileSystem(
  cdkObject: software.amazon.awscdk.FileSystem,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.FileSystem()
  )

  public companion object {
    public fun copyDirectory(srcDir: String, destDir: String) {
      software.amazon.awscdk.FileSystem.copyDirectory(srcDir, destDir)
    }

    public fun copyDirectory(
      srcDir: String,
      destDir: String,
      options: CopyOptions,
    ) {
      software.amazon.awscdk.FileSystem.copyDirectory(srcDir, destDir,
          options.let(CopyOptions.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88780cd9d79078d50b69d6a0c4c2ed50b0c7c5dee8e881abac82f2eb7309429c")
    public fun copyDirectory(
      srcDir: String,
      destDir: String,
      options: CopyOptions.Builder.() -> Unit,
    ): Unit = copyDirectory(srcDir, destDir, CopyOptions(options))

    public fun copyDirectory(
      srcDir: String,
      destDir: String,
      options: CopyOptions,
      rootDir: String,
    ) {
      software.amazon.awscdk.FileSystem.copyDirectory(srcDir, destDir,
          options.let(CopyOptions.Companion::unwrap), rootDir)
    }

    public fun fingerprint(fileOrDirectory: String): String =
        software.amazon.awscdk.FileSystem.fingerprint(fileOrDirectory)

    public fun fingerprint(fileOrDirectory: String, options: FingerprintOptions): String =
        software.amazon.awscdk.FileSystem.fingerprint(fileOrDirectory,
        options.let(FingerprintOptions.Companion::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de2955931eb6d6b92d49ef9f643588fb8b50ae2584a69980054ed7a635971f4f")
    public fun fingerprint(fileOrDirectory: String, options: FingerprintOptions.Builder.() -> Unit):
        String = fingerprint(fileOrDirectory, FingerprintOptions(options))

    public fun isEmpty(dir: String): Boolean = software.amazon.awscdk.FileSystem.isEmpty(dir)

    public fun mkdtemp(prefix: String): String = software.amazon.awscdk.FileSystem.mkdtemp(prefix)

    public fun tmpdir(): String = software.amazon.awscdk.FileSystem.getTmpdir()

    internal fun wrap(cdkObject: software.amazon.awscdk.FileSystem): FileSystem =
        FileSystem(cdkObject)

    internal fun unwrap(wrapped: FileSystem): software.amazon.awscdk.FileSystem = wrapped.cdkObject
        as software.amazon.awscdk.FileSystem
  }
}
