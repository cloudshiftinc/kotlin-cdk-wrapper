package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class LinuxGpuBuildImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage,
) : CdkObject(cdkObject), IBindableBuildImage {
  /**
   * Function that allows the build image access to the construct tree.
   *
   * @param scope 
   * @param project 
   * @param _options 
   */
  public override fun bind(
    scope: Construct,
    project: IProject,
    _options: BuildImageBindOptions,
  ): BuildImageConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      project.let(IProject::unwrap),
      _options.let(BuildImageBindOptions::unwrap)).let(BuildImageConfig::wrap)

  /**
   * Function that allows the build image access to the construct tree.
   *
   * @param scope 
   * @param project 
   * @param _options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2217a711d386432885489a755d119db8cc713f4afd5a62af3c63f8f8f7197cd5")
  public override fun bind(
    scope: Construct,
    project: IProject,
    _options: BuildImageBindOptions.Builder.() -> Unit,
  ): BuildImageConfig = bind(scope, project, BuildImageBindOptions(_options))

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
   * Make a buildspec to run the indicated script.
   *
   * @param entrypoint 
   */
  public override fun runScriptBuildspec(entrypoint: String): BuildSpec =
      unwrap(this).runScriptBuildspec(entrypoint).let(BuildSpec::wrap)

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
      unwrap(this).validate(buildEnvironment.let(BuildEnvironment::unwrap))

  /**
   * Allows the image a chance to validate whether the passed configuration is correct.
   *
   * @param buildEnvironment 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff36d333164150adb92277700abb7153d45f26e16fa225966e7bf6fc0bedfcee")
  public override fun validate(buildEnvironment: BuildEnvironment.Builder.() -> Unit): List<String>
      = validate(BuildEnvironment(buildEnvironment))

  public companion object {
    public val DLC_MXNET_1_4_1: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_MXNET_1_4_1)

    public val DLC_MXNET_1_6_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_MXNET_1_6_0)

    public val DLC_PYTORCH_1_2_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_PYTORCH_1_2_0)

    public val DLC_PYTORCH_1_3_1: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_PYTORCH_1_3_1)

    public val DLC_PYTORCH_1_4_0_INFERENCE: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_PYTORCH_1_4_0_INFERENCE)

    public val DLC_PYTORCH_1_4_0_TRAINING: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_PYTORCH_1_4_0_TRAINING)

    public val DLC_PYTORCH_1_5_0_INFERENCE: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_PYTORCH_1_5_0_INFERENCE)

    public val DLC_PYTORCH_1_5_0_TRAINING: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_PYTORCH_1_5_0_TRAINING)

    public val DLC_TENSORFLOW_1_14_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_TENSORFLOW_1_14_0)

    public val DLC_TENSORFLOW_1_15_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_TENSORFLOW_1_15_0)

    public val DLC_TENSORFLOW_1_15_2_INFERENCE: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_TENSORFLOW_1_15_2_INFERENCE)

    public val DLC_TENSORFLOW_1_15_2_TRAINING: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_TENSORFLOW_1_15_2_TRAINING)

    public val DLC_TENSORFLOW_2_0_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_TENSORFLOW_2_0_0)

    public val DLC_TENSORFLOW_2_0_1: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_TENSORFLOW_2_0_1)

    public val DLC_TENSORFLOW_2_1_0_INFERENCE: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_TENSORFLOW_2_1_0_INFERENCE)

    public val DLC_TENSORFLOW_2_1_0_TRAINING: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_TENSORFLOW_2_1_0_TRAINING)

    public val DLC_TENSORFLOW_2_2_0_TRAINING: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.DLC_TENSORFLOW_2_2_0_TRAINING)

    public fun awsDeepLearningContainersImage(repositoryName: String, tag: String): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.awsDeepLearningContainersImage(repositoryName,
        tag).let(IBuildImage::wrap)

    public fun awsDeepLearningContainersImage(
      repositoryName: String,
      tag: String,
      account: String,
    ): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.awsDeepLearningContainersImage(repositoryName,
        tag, account).let(IBuildImage::wrap)

    public fun fromEcrRepository(repository: IRepository): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.fromEcrRepository(repository.let(IRepository::unwrap)).let(IBuildImage::wrap)

    public fun fromEcrRepository(repository: IRepository, tag: String): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage.fromEcrRepository(repository.let(IRepository::unwrap),
        tag).let(IBuildImage::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage):
        LinuxGpuBuildImage = LinuxGpuBuildImage(cdkObject)

    internal fun unwrap(wrapped: LinuxGpuBuildImage):
        software.amazon.awscdk.services.codebuild.LinuxGpuBuildImage = wrapped.cdkObject
  }
}
