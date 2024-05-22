@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.assets.Asset
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Create files on the EC2 instance.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * InstanceType instanceType;
 * Instance.Builder.create(this, "Instance")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(MachineImage.latestAmazonLinux2023())
 * .init(CloudFormationInit.fromElements(InitService.systemdConfigFile("simpleserver",
 * SystemdConfigFileOptions.builder()
 * .command("/usr/bin/python3 -m http.server 8080")
 * .cwd("/var/www/html")
 * .build()), InitService.enable("simpleserver", InitServiceOptions.builder()
 * .serviceManager(ServiceManager.SYSTEMD)
 * .build()), InitFile.fromString("/var/www/html/index.html", "Hello! It's working!")))
 * .build();
 * ```
 */
public abstract class InitFile(
  cdkObject: software.amazon.awscdk.services.ec2.InitFile,
) : InitElement(cdkObject) {
  /**
   * Returns the init element type for this element.
   */
  public override fun elementType(): String = unwrap(this).getElementType()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.InitFile,
  ) : InitFile(cdkObject)

  public companion object {
    public fun fromAsset(targetFileName: String, path: String): InitFile =
        software.amazon.awscdk.services.ec2.InitFile.fromAsset(targetFileName,
        path).let(InitFile::wrap)

    public fun fromAsset(
      targetFileName: String,
      path: String,
      options: InitFileAssetOptions,
    ): InitFile = software.amazon.awscdk.services.ec2.InitFile.fromAsset(targetFileName, path,
        options.let(InitFileAssetOptions.Companion::unwrap)).let(InitFile::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0cd84052c5af85eab4abafad0cb4955b8e98fcbabce662031d8126c0cdc4b88c")
    public fun fromAsset(
      targetFileName: String,
      path: String,
      options: InitFileAssetOptions.Builder.() -> Unit,
    ): InitFile = fromAsset(targetFileName, path, InitFileAssetOptions(options))

    public fun fromExistingAsset(targetFileName: String, asset: Asset): InitFile =
        software.amazon.awscdk.services.ec2.InitFile.fromExistingAsset(targetFileName,
        asset.let(Asset.Companion::unwrap)).let(InitFile::wrap)

    public fun fromExistingAsset(
      targetFileName: String,
      asset: Asset,
      options: InitFileOptions,
    ): InitFile = software.amazon.awscdk.services.ec2.InitFile.fromExistingAsset(targetFileName,
        asset.let(Asset.Companion::unwrap),
        options.let(InitFileOptions.Companion::unwrap)).let(InitFile::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0682e870032d4be19d8855aec193f92aa7b2efdbf7f3b392bbd49c301fc76c76")
    public fun fromExistingAsset(
      targetFileName: String,
      asset: Asset,
      options: InitFileOptions.Builder.() -> Unit,
    ): InitFile = fromExistingAsset(targetFileName, asset, InitFileOptions(options))

    public fun fromFileInline(targetFileName: String, sourceFileName: String): InitFile =
        software.amazon.awscdk.services.ec2.InitFile.fromFileInline(targetFileName,
        sourceFileName).let(InitFile::wrap)

    public fun fromFileInline(
      targetFileName: String,
      sourceFileName: String,
      options: InitFileOptions,
    ): InitFile = software.amazon.awscdk.services.ec2.InitFile.fromFileInline(targetFileName,
        sourceFileName, options.let(InitFileOptions.Companion::unwrap)).let(InitFile::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("878f71ef5b9479902b6f46c0620a740d1dd2326dd7d170f10504747a5c1695db")
    public fun fromFileInline(
      targetFileName: String,
      sourceFileName: String,
      options: InitFileOptions.Builder.() -> Unit,
    ): InitFile = fromFileInline(targetFileName, sourceFileName, InitFileOptions(options))

    public fun fromObject(fileName: String, obj: Map<String, Any>): InitFile =
        software.amazon.awscdk.services.ec2.InitFile.fromObject(fileName,
        obj.mapValues{CdkObjectWrappers.unwrap(it.value)}).let(InitFile::wrap)

    public fun fromObject(
      fileName: String,
      obj: Map<String, Any>,
      options: InitFileOptions,
    ): InitFile = software.amazon.awscdk.services.ec2.InitFile.fromObject(fileName,
        obj.mapValues{CdkObjectWrappers.unwrap(it.value)},
        options.let(InitFileOptions.Companion::unwrap)).let(InitFile::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e345663b9fbc8b23594aa30cc8848b9da053d6333bfcfbd85dd18b77055b3770")
    public fun fromObject(
      fileName: String,
      obj: Map<String, Any>,
      options: InitFileOptions.Builder.() -> Unit,
    ): InitFile = fromObject(fileName, obj, InitFileOptions(options))

    public fun fromS3Object(
      fileName: String,
      bucket: IBucket,
      key: String,
    ): InitFile = software.amazon.awscdk.services.ec2.InitFile.fromS3Object(fileName,
        bucket.let(IBucket.Companion::unwrap), key).let(InitFile::wrap)

    public fun fromS3Object(
      fileName: String,
      bucket: IBucket,
      key: String,
      options: InitFileOptions,
    ): InitFile = software.amazon.awscdk.services.ec2.InitFile.fromS3Object(fileName,
        bucket.let(IBucket.Companion::unwrap), key,
        options.let(InitFileOptions.Companion::unwrap)).let(InitFile::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f2f70a96955a6a69821f6e2b7f68daedd0264960b582a110c3ca98032e0efc4")
    public fun fromS3Object(
      fileName: String,
      bucket: IBucket,
      key: String,
      options: InitFileOptions.Builder.() -> Unit,
    ): InitFile = fromS3Object(fileName, bucket, key, InitFileOptions(options))

    public fun fromString(fileName: String, content: String): InitFile =
        software.amazon.awscdk.services.ec2.InitFile.fromString(fileName,
        content).let(InitFile::wrap)

    public fun fromString(
      fileName: String,
      content: String,
      options: InitFileOptions,
    ): InitFile = software.amazon.awscdk.services.ec2.InitFile.fromString(fileName, content,
        options.let(InitFileOptions.Companion::unwrap)).let(InitFile::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a466a510cb9df44b5f954405749e107dcaa57db1fb0afcbb5e451b71e178ea0")
    public fun fromString(
      fileName: String,
      content: String,
      options: InitFileOptions.Builder.() -> Unit,
    ): InitFile = fromString(fileName, content, InitFileOptions(options))

    public fun fromUrl(fileName: String, url: String): InitFile =
        software.amazon.awscdk.services.ec2.InitFile.fromUrl(fileName, url).let(InitFile::wrap)

    public fun fromUrl(
      fileName: String,
      url: String,
      options: InitFileOptions,
    ): InitFile = software.amazon.awscdk.services.ec2.InitFile.fromUrl(fileName, url,
        options.let(InitFileOptions.Companion::unwrap)).let(InitFile::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fa29a032d33c25fa83792a2cbb96ea2ed59be37f14328bc2301abf27ec7b3b7")
    public fun fromUrl(
      fileName: String,
      url: String,
      options: InitFileOptions.Builder.() -> Unit,
    ): InitFile = fromUrl(fileName, url, InitFileOptions(options))

    public fun symlink(fileName: String, target: String): InitFile =
        software.amazon.awscdk.services.ec2.InitFile.symlink(fileName, target).let(InitFile::wrap)

    public fun symlink(
      fileName: String,
      target: String,
      options: InitFileOptions,
    ): InitFile = software.amazon.awscdk.services.ec2.InitFile.symlink(fileName, target,
        options.let(InitFileOptions.Companion::unwrap)).let(InitFile::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("243018c22471ae1eb11927c0b3d7fb02d0d91fdcfb0faab2cf57e3c5d3e3f66b")
    public fun symlink(
      fileName: String,
      target: String,
      options: InitFileOptions.Builder.() -> Unit,
    ): InitFile = symlink(fileName, target, InitFileOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitFile): InitFile =
        CdkObjectWrappers.wrap(cdkObject) as? InitFile ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: InitFile): software.amazon.awscdk.services.ec2.InitFile = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.InitFile
  }
}
