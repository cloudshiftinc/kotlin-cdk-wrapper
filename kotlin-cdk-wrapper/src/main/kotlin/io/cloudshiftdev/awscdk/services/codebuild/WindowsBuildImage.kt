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
 * A CodeBuild image running Windows.
 *
 * This class has a bunch of public constants that represent the most popular images.
 *
 * You can also specify a custom image using one of the static methods:
 *
 * * WindowsBuildImage.fromDockerRegistry(image[, { secretsManagerCredentials }, imageType])
 * * WindowsBuildImage.fromEcrRepository(repo[, tag, imageType])
 * * WindowsBuildImage.fromAsset(parent, id, props, [, imageType])
 *
 * Example:
 *
 * ```
 * Repository ecrRepository;
 * Project.Builder.create(this, "Project")
 * .environment(BuildEnvironment.builder()
 * .buildImage(WindowsBuildImage.fromEcrRepository(ecrRepository, "v1.0",
 * WindowsImageType.SERVER_2019))
 * // optional certificate to include in the build image
 * .certificate(BuildEnvironmentCertificate.builder()
 * .bucket(Bucket.fromBucketName(this, "Bucket", "amzn-s3-demo-bucket"))
 * .objectKey("path/to/cert.pem")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html)
 */
public open class WindowsBuildImage(
  cdkObject: software.amazon.awscdk.services.codebuild.WindowsBuildImage,
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
    public val WIN_SERVER_CORE_2019_BASE: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.WindowsBuildImage.WIN_SERVER_CORE_2019_BASE)

    public val WIN_SERVER_CORE_2019_BASE_2_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.WindowsBuildImage.WIN_SERVER_CORE_2019_BASE_2_0)

    public val WIN_SERVER_CORE_2019_BASE_3_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.WindowsBuildImage.WIN_SERVER_CORE_2019_BASE_3_0)

    public val WIN_SERVER_CORE_2022_BASE_3_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.WindowsBuildImage.WIN_SERVER_CORE_2022_BASE_3_0)

    public val WINDOWS_BASE_2_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.WindowsBuildImage.WINDOWS_BASE_2_0)

    public fun fromAsset(
      scope: Construct,
      id: String,
      props: DockerImageAssetProps,
    ): IBuildImage =
        software.amazon.awscdk.services.codebuild.WindowsBuildImage.fromAsset(scope.let(Construct.Companion::unwrap),
        id, props.let(DockerImageAssetProps.Companion::unwrap)).let(IBuildImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66f4338ab15382a1d0a2efb8183796cd48bca3922530d07a2c878008262c08ef")
    public fun fromAsset(
      scope: Construct,
      id: String,
      props: DockerImageAssetProps.Builder.() -> Unit,
    ): IBuildImage = fromAsset(scope, id, DockerImageAssetProps(props))

    public fun fromAsset(
      scope: Construct,
      id: String,
      props: DockerImageAssetProps,
      imageType: WindowsImageType,
    ): IBuildImage =
        software.amazon.awscdk.services.codebuild.WindowsBuildImage.fromAsset(scope.let(Construct.Companion::unwrap),
        id, props.let(DockerImageAssetProps.Companion::unwrap),
        imageType.let(WindowsImageType.Companion::unwrap)).let(IBuildImage::wrap)

    public fun fromDockerRegistry(name: String): IBuildImage =
        software.amazon.awscdk.services.codebuild.WindowsBuildImage.fromDockerRegistry(name).let(IBuildImage::wrap)

    public fun fromDockerRegistry(name: String, options: DockerImageOptions): IBuildImage =
        software.amazon.awscdk.services.codebuild.WindowsBuildImage.fromDockerRegistry(name,
        options.let(DockerImageOptions.Companion::unwrap)).let(IBuildImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9dfa00b9fda484ff06b60ab8b92ae7805fa8054bf1b7155a5e6cb7e59c4680f")
    public fun fromDockerRegistry(name: String, options: DockerImageOptions.Builder.() -> Unit):
        IBuildImage = fromDockerRegistry(name, DockerImageOptions(options))

    public fun fromDockerRegistry(
      name: String,
      options: DockerImageOptions,
      imageType: WindowsImageType,
    ): IBuildImage =
        software.amazon.awscdk.services.codebuild.WindowsBuildImage.fromDockerRegistry(name,
        options.let(DockerImageOptions.Companion::unwrap),
        imageType.let(WindowsImageType.Companion::unwrap)).let(IBuildImage::wrap)

    public fun fromEcrRepository(repository: IRepository): IBuildImage =
        software.amazon.awscdk.services.codebuild.WindowsBuildImage.fromEcrRepository(repository.let(IRepository.Companion::unwrap)).let(IBuildImage::wrap)

    public fun fromEcrRepository(repository: IRepository, tagOrDigest: String): IBuildImage =
        software.amazon.awscdk.services.codebuild.WindowsBuildImage.fromEcrRepository(repository.let(IRepository.Companion::unwrap),
        tagOrDigest).let(IBuildImage::wrap)

    public fun fromEcrRepository(
      repository: IRepository,
      tagOrDigest: String,
      imageType: WindowsImageType,
    ): IBuildImage =
        software.amazon.awscdk.services.codebuild.WindowsBuildImage.fromEcrRepository(repository.let(IRepository.Companion::unwrap),
        tagOrDigest, imageType.let(WindowsImageType.Companion::unwrap)).let(IBuildImage::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.WindowsBuildImage):
        WindowsBuildImage = WindowsBuildImage(cdkObject)

    internal fun unwrap(wrapped: WindowsBuildImage):
        software.amazon.awscdk.services.codebuild.WindowsBuildImage = wrapped.cdkObject as
        software.amazon.awscdk.services.codebuild.WindowsBuildImage
  }
}
