@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.assets.Asset
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Extract an archive into a directory.
 *
 * Example:
 *
 * ```
 * Bucket myBucket;
 * InitServiceRestartHandle handle = new InitServiceRestartHandle();
 * CloudFormationInit.fromElements(InitFile.fromString("/etc/nginx/nginx.conf", "...",
 * InitFileOptions.builder().serviceRestartHandles(List.of(handle)).build()),
 * InitSource.fromS3Object("/var/www/html", myBucket, "html.zip",
 * InitSourceOptions.builder().serviceRestartHandles(List.of(handle)).build()),
 * InitService.enable("nginx", InitServiceOptions.builder()
 * .serviceRestartHandle(handle)
 * .build()));
 * ```
 */
public abstract class InitSource(
  cdkObject: software.amazon.awscdk.services.ec2.InitSource,
) : InitElement(cdkObject) {
  /**
   * Returns the init element type for this element.
   */
  public override fun elementType(): String = unwrap(this).getElementType()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.InitSource,
  ) : InitSource(cdkObject)

  public companion object {
    public fun fromAsset(targetDirectory: String, path: String): InitSource =
        software.amazon.awscdk.services.ec2.InitSource.fromAsset(targetDirectory,
        path).let(InitSource::wrap)

    public fun fromAsset(
      targetDirectory: String,
      path: String,
      options: InitSourceAssetOptions,
    ): InitSource = software.amazon.awscdk.services.ec2.InitSource.fromAsset(targetDirectory, path,
        options.let(InitSourceAssetOptions::unwrap)).let(InitSource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1f1fecf2b225234eea1013354428190e2e47778ab0d334d6c4ea21dc2fe34c2")
    public fun fromAsset(
      targetDirectory: String,
      path: String,
      options: InitSourceAssetOptions.Builder.() -> Unit,
    ): InitSource = fromAsset(targetDirectory, path, InitSourceAssetOptions(options))

    public fun fromExistingAsset(targetDirectory: String, asset: Asset): InitSource =
        software.amazon.awscdk.services.ec2.InitSource.fromExistingAsset(targetDirectory,
        asset.let(Asset::unwrap)).let(InitSource::wrap)

    public fun fromExistingAsset(
      targetDirectory: String,
      asset: Asset,
      options: InitSourceOptions,
    ): InitSource =
        software.amazon.awscdk.services.ec2.InitSource.fromExistingAsset(targetDirectory,
        asset.let(Asset::unwrap), options.let(InitSourceOptions::unwrap)).let(InitSource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf703a1bcfb00fd804bf67a313f21a6bcb7ecb8f94ee17a70bef43032312e342")
    public fun fromExistingAsset(
      targetDirectory: String,
      asset: Asset,
      options: InitSourceOptions.Builder.() -> Unit,
    ): InitSource = fromExistingAsset(targetDirectory, asset, InitSourceOptions(options))

    public fun fromGitHub(
      targetDirectory: String,
      owner: String,
      repo: String,
    ): InitSource = software.amazon.awscdk.services.ec2.InitSource.fromGitHub(targetDirectory,
        owner, repo).let(InitSource::wrap)

    public fun fromGitHub(
      targetDirectory: String,
      owner: String,
      repo: String,
      refSpec: String,
    ): InitSource = software.amazon.awscdk.services.ec2.InitSource.fromGitHub(targetDirectory,
        owner, repo, refSpec).let(InitSource::wrap)

    public fun fromGitHub(
      targetDirectory: String,
      owner: String,
      repo: String,
      refSpec: String,
      options: InitSourceOptions,
    ): InitSource = software.amazon.awscdk.services.ec2.InitSource.fromGitHub(targetDirectory,
        owner, repo, refSpec, options.let(InitSourceOptions::unwrap)).let(InitSource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93ce7f85c9388415b5fa894d5fe03f64b8271affc373d56fb2b24b7eb865d8a7")
    public fun fromGitHub(
      targetDirectory: String,
      owner: String,
      repo: String,
      refSpec: String,
      options: InitSourceOptions.Builder.() -> Unit,
    ): InitSource = fromGitHub(targetDirectory, owner, repo, refSpec, InitSourceOptions(options))

    public fun fromS3Object(
      targetDirectory: String,
      bucket: IBucket,
      key: String,
    ): InitSource = software.amazon.awscdk.services.ec2.InitSource.fromS3Object(targetDirectory,
        bucket.let(IBucket::unwrap), key).let(InitSource::wrap)

    public fun fromS3Object(
      targetDirectory: String,
      bucket: IBucket,
      key: String,
      options: InitSourceOptions,
    ): InitSource = software.amazon.awscdk.services.ec2.InitSource.fromS3Object(targetDirectory,
        bucket.let(IBucket::unwrap), key,
        options.let(InitSourceOptions::unwrap)).let(InitSource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1be87ac88191d70e0b5137578a0be878b1001367abbd19c4e9e2f3abea9ddd19")
    public fun fromS3Object(
      targetDirectory: String,
      bucket: IBucket,
      key: String,
      options: InitSourceOptions.Builder.() -> Unit,
    ): InitSource = fromS3Object(targetDirectory, bucket, key, InitSourceOptions(options))

    public fun fromUrl(targetDirectory: String, url: String): InitSource =
        software.amazon.awscdk.services.ec2.InitSource.fromUrl(targetDirectory,
        url).let(InitSource::wrap)

    public fun fromUrl(
      targetDirectory: String,
      url: String,
      options: InitSourceOptions,
    ): InitSource = software.amazon.awscdk.services.ec2.InitSource.fromUrl(targetDirectory, url,
        options.let(InitSourceOptions::unwrap)).let(InitSource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d73aa7bb4f64e38e39ec2da5b6dffe8433b89dde5377872916cd00fc33fd6c4c")
    public fun fromUrl(
      targetDirectory: String,
      url: String,
      options: InitSourceOptions.Builder.() -> Unit,
    ): InitSource = fromUrl(targetDirectory, url, InitSourceOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitSource): InitSource =
        CdkObjectWrappers.wrap(cdkObject) as? InitSource ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: InitSource): software.amazon.awscdk.services.ec2.InitSource =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.InitSource
  }
}
