@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * A CodeBuild image running aarch64 Linux.
 *
 * This class has a bunch of public constants that represent the CodeBuild ARM images.
 *
 * You can also specify a custom image using the static method:
 *
 * * LinuxBuildImage.fromEcrRepository(repo[, tag])
 * * LinuxBuildImage.fromDockerRegistry(image[, { secretsManagerCredentials }])
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * IBuildImage linuxArmBuildImage = LinuxArmBuildImage.fromCodeBuildImageId("id");
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html)
 */
public open class LinuxArmBuildImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.LinuxArmBuildImage,
) : CdkObject(cdkObject), IBuildImage {
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
   * Validates by checking the BuildEnvironment computeType as aarch64 images only support
   * ComputeType.SMALL and ComputeType.LARGE.
   *
   * @param buildEnvironment BuildEnvironment. 
   */
  public override fun validate(buildEnvironment: BuildEnvironment): List<String> =
      unwrap(this).validate(buildEnvironment.let(BuildEnvironment::unwrap))

  /**
   * Validates by checking the BuildEnvironment computeType as aarch64 images only support
   * ComputeType.SMALL and ComputeType.LARGE.
   *
   * @param buildEnvironment BuildEnvironment. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff36d333164150adb92277700abb7153d45f26e16fa225966e7bf6fc0bedfcee")
  public override fun validate(buildEnvironment: BuildEnvironment.Builder.() -> Unit): List<String>
      = validate(BuildEnvironment(buildEnvironment))

  public companion object {
    public val AMAZON_LINUX_2_STANDARD_1_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmBuildImage.AMAZON_LINUX_2_STANDARD_1_0)

    public val AMAZON_LINUX_2_STANDARD_2_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmBuildImage.AMAZON_LINUX_2_STANDARD_2_0)

    public val AMAZON_LINUX_2_STANDARD_3_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmBuildImage.AMAZON_LINUX_2_STANDARD_3_0)

    public fun fromCodeBuildImageId(id: String): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxArmBuildImage.fromCodeBuildImageId(id).let(IBuildImage::wrap)

    public fun fromDockerRegistry(name: String): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxArmBuildImage.fromDockerRegistry(name).let(IBuildImage::wrap)

    public fun fromDockerRegistry(name: String, options: DockerImageOptions): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxArmBuildImage.fromDockerRegistry(name,
        options.let(DockerImageOptions::unwrap)).let(IBuildImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9dfa00b9fda484ff06b60ab8b92ae7805fa8054bf1b7155a5e6cb7e59c4680f")
    public fun fromDockerRegistry(name: String, options: DockerImageOptions.Builder.() -> Unit):
        IBuildImage = fromDockerRegistry(name, DockerImageOptions(options))

    public fun fromEcrRepository(repository: IRepository): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxArmBuildImage.fromEcrRepository(repository.let(IRepository::unwrap)).let(IBuildImage::wrap)

    public fun fromEcrRepository(repository: IRepository, tagOrDigest: String): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxArmBuildImage.fromEcrRepository(repository.let(IRepository::unwrap),
        tagOrDigest).let(IBuildImage::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.LinuxArmBuildImage):
        LinuxArmBuildImage = LinuxArmBuildImage(cdkObject)

    internal fun unwrap(wrapped: LinuxArmBuildImage):
        software.amazon.awscdk.services.codebuild.LinuxArmBuildImage = wrapped.cdkObject
  }
}
