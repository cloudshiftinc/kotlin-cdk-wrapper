@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAssetProps
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * A CodeBuild image running ARM MacOS.
 *
 * This class has a bunch of public constants that represent the most popular images.
 *
 * You can also specify a custom image using one of the static methods:
 *
 * * MacBuildImage.fromDockerRegistry(image[, { secretsManagerCredentials }])
 * * MacBuildImage.fromEcrRepository(repo[, tag])
 * * MacBuildImage.fromAsset(parent, id, props)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * import io.cloudshiftdev.awscdk.services.ecr.assets.*;
 * NetworkMode networkMode;
 * Platform platform;
 * IBuildImage macBuildImage = MacBuildImage.fromAsset(this, "MyMacBuildImage",
 * DockerImageAssetProps.builder()
 * .directory("directory")
 * // the properties below are optional
 * .assetName("assetName")
 * .buildArgs(Map.of(
 * "buildArgsKey", "buildArgs"))
 * .buildSecrets(Map.of(
 * "buildSecretsKey", "buildSecrets"))
 * .buildSsh("buildSsh")
 * .cacheDisabled(false)
 * .cacheFrom(List.of(DockerCacheOption.builder()
 * .type("type")
 * // the properties below are optional
 * .params(Map.of(
 * "paramsKey", "params"))
 * .build()))
 * .cacheTo(DockerCacheOption.builder()
 * .type("type")
 * // the properties below are optional
 * .params(Map.of(
 * "paramsKey", "params"))
 * .build())
 * .displayName("displayName")
 * .exclude(List.of("exclude"))
 * .extraHash("extraHash")
 * .file("file")
 * .followSymlinks(SymlinkFollowMode.NEVER)
 * .ignoreMode(IgnoreMode.GLOB)
 * .invalidation(DockerImageAssetInvalidationOptions.builder()
 * .buildArgs(false)
 * .buildSecrets(false)
 * .buildSsh(false)
 * .extraHash(false)
 * .file(false)
 * .networkMode(false)
 * .outputs(false)
 * .platform(false)
 * .repositoryName(false)
 * .target(false)
 * .build())
 * .networkMode(networkMode)
 * .outputs(List.of("outputs"))
 * .platform(platform)
 * .target("target")
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html)
 */
public open class MacBuildImage(
  cdkObject: software.amazon.awscdk.services.codebuild.MacBuildImage,
) : CdkObject(cdkObject),
    IBuildImage {
  /**
   * The default `ComputeType` to use with this image, if one was not specified in
   * `BuildEnvironment#computeType` explicitly.
   */
  public override fun defaultComputeType(): ComputeType =
      unwrap(this).getDefaultComputeType().let(ComputeType::wrap)

  /**
   * The Docker image identifier that the build environment uses.
   */
  public override fun imageId(): String = unwrap(this).getImageId()

  /**
   * The type of principal that CodeBuild will use to pull this build Docker image.
   */
  public override fun imagePullPrincipalType(): ImagePullPrincipalType? =
      unwrap(this).getImagePullPrincipalType()?.let(ImagePullPrincipalType::wrap)

  /**
   * An optional ECR repository that the image is hosted in.
   */
  public override fun repository(): IRepository? =
      unwrap(this).getRepository()?.let(IRepository::wrap)

  /**
   * Make a buildspec to run the indicated script.
   *
   * @param entrypoint 
   */
  public override fun runScriptBuildspec(entrypoint: String): BuildSpec =
      unwrap(this).runScriptBuildspec(entrypoint).let(BuildSpec::wrap)

  /**
   * The secretsManagerCredentials for access to a private registry.
   */
  public override fun secretsManagerCredentials(): ISecret? =
      unwrap(this).getSecretsManagerCredentials()?.let(ISecret::wrap)

  /**
   * The type of build environment.
   */
  public override fun type(): String = unwrap(this).getType()

  /**
   * Allows the image a chance to validate whether the passed configuration is correct.
   *
   * @param buildEnvironment 
   */
  public override fun validate(buildEnvironment: BuildEnvironment): List<String> =
      unwrap(this).validate(buildEnvironment.let(BuildEnvironment.Companion::unwrap))

  /**
   * Allows the image a chance to validate whether the passed configuration is correct.
   *
   * @param buildEnvironment 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff36d333164150adb92277700abb7153d45f26e16fa225966e7bf6fc0bedfcee")
  public override fun validate(buildEnvironment: BuildEnvironment.Builder.() -> Unit): List<String>
      = validate(BuildEnvironment(buildEnvironment))

  public companion object {
    public val BASE_14: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.MacBuildImage.BASE_14)

    public fun fromAsset(
      scope: Construct,
      id: String,
      props: DockerImageAssetProps,
    ): IBuildImage =
        software.amazon.awscdk.services.codebuild.MacBuildImage.fromAsset(scope.let(Construct.Companion::unwrap),
        id, props.let(DockerImageAssetProps.Companion::unwrap)).let(IBuildImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66f4338ab15382a1d0a2efb8183796cd48bca3922530d07a2c878008262c08ef")
    public fun fromAsset(
      scope: Construct,
      id: String,
      props: DockerImageAssetProps.Builder.() -> Unit,
    ): IBuildImage = fromAsset(scope, id, DockerImageAssetProps(props))

    public fun fromDockerRegistry(name: String): IBuildImage =
        software.amazon.awscdk.services.codebuild.MacBuildImage.fromDockerRegistry(name).let(IBuildImage::wrap)

    public fun fromDockerRegistry(name: String, options: DockerImageOptions): IBuildImage =
        software.amazon.awscdk.services.codebuild.MacBuildImage.fromDockerRegistry(name,
        options.let(DockerImageOptions.Companion::unwrap)).let(IBuildImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9dfa00b9fda484ff06b60ab8b92ae7805fa8054bf1b7155a5e6cb7e59c4680f")
    public fun fromDockerRegistry(name: String, options: DockerImageOptions.Builder.() -> Unit):
        IBuildImage = fromDockerRegistry(name, DockerImageOptions(options))

    public fun fromEcrRepository(repository: IRepository): IBuildImage =
        software.amazon.awscdk.services.codebuild.MacBuildImage.fromEcrRepository(repository.let(IRepository.Companion::unwrap)).let(IBuildImage::wrap)

    public fun fromEcrRepository(repository: IRepository, tagOrDigest: String): IBuildImage =
        software.amazon.awscdk.services.codebuild.MacBuildImage.fromEcrRepository(repository.let(IRepository.Companion::unwrap),
        tagOrDigest).let(IBuildImage::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.MacBuildImage):
        MacBuildImage = MacBuildImage(cdkObject)

    internal fun unwrap(wrapped: MacBuildImage):
        software.amazon.awscdk.services.codebuild.MacBuildImage = wrapped.cdkObject as
        software.amazon.awscdk.services.codebuild.MacBuildImage
  }
}
