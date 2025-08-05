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
 * A CodeBuild image running x86-64 Linux.
 *
 * This class has a bunch of public constants that represent the most popular images.
 *
 * You can also specify a custom image using one of the static methods:
 *
 * * LinuxBuildImage.fromDockerRegistry(image[, { secretsManagerCredentials }])
 * * LinuxBuildImage.fromEcrRepository(repo[, tag])
 * * LinuxBuildImage.fromAsset(parent, id, props)
 *
 * Example:
 *
 * ```
 * CodePipeline pipeline = CodePipeline.Builder.create(this, "Pipeline")
 * .synth(ShellStep.Builder.create("Synth")
 * .input(CodePipelineSource.connection("my-org/my-app", "main", ConnectionSourceOptions.builder()
 * .connectionArn("arn:aws:codestar-connections:us-east-1:222222222222:connection/7d2469ff-514a-4e4f-9003-5ca4a43cdc41")
 * .build()))
 * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
 * .build())
 * // Turn this on because the pipeline uses Docker image assets
 * .dockerEnabledForSelfMutation(true)
 * .build();
 * pipeline.addWave("MyWave", WaveOptions.builder()
 * .post(List.of(
 * CodeBuildStep.Builder.create("RunApproval")
 * .commands(List.of("command-from-image"))
 * .buildEnvironment(BuildEnvironment.builder()
 * // The user of a Docker image asset in the pipeline requires turning on
 * // 'dockerEnabledForSelfMutation'.
 * .buildImage(LinuxBuildImage.fromAsset(this, "Image", DockerImageAssetProps.builder()
 * .directory("./docker-image")
 * .build()))
 * .build())
 * .build()))
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html)
 */
public open class LinuxBuildImage(
  cdkObject: software.amazon.awscdk.services.codebuild.LinuxBuildImage,
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
   * @param env 
   */
  public override fun validate(env: BuildEnvironment): List<String> =
      unwrap(this).validate(env.let(BuildEnvironment.Companion::unwrap))

  /**
   * Allows the image a chance to validate whether the passed configuration is correct.
   *
   * @param env 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff36d333164150adb92277700abb7153d45f26e16fa225966e7bf6fc0bedfcee")
  public override fun validate(env: BuildEnvironment.Builder.() -> Unit): List<String> =
      validate(BuildEnvironment(env))

  public companion object {
    public val AMAZON_LINUX_2: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2)

    public val AMAZON_LINUX_2_2: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_2)

    public val AMAZON_LINUX_2_3: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_3)

    public val AMAZON_LINUX_2_4: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_4)

    public val AMAZON_LINUX_2_5: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_5)

    public val AMAZON_LINUX_2_ARM: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_ARM)

    public val AMAZON_LINUX_2_ARM_2: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_ARM_2)

    public val AMAZON_LINUX_2_ARM_3: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_ARM_3)

    public val AMAZON_LINUX_2_CORETTO_11: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_CORETTO_11)

    public val AMAZON_LINUX_2_CORETTO_8: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2_CORETTO_8)

    public val AMAZON_LINUX_2023_4: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2023_4)

    public val AMAZON_LINUX_2023_5: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2023_5)

    public val AMAZON_LINUX_2023_CORETTO_11: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2023_CORETTO_11)

    public val AMAZON_LINUX_2023_CORETTO_8: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.AMAZON_LINUX_2023_CORETTO_8)

    public val STANDARD_1_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.STANDARD_1_0)

    public val STANDARD_2_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.STANDARD_2_0)

    public val STANDARD_3_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.STANDARD_3_0)

    public val STANDARD_4_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.STANDARD_4_0)

    public val STANDARD_5_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.STANDARD_5_0)

    public val STANDARD_6_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.STANDARD_6_0)

    public val STANDARD_7_0: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxBuildImage.STANDARD_7_0)

    public fun fromAsset(
      scope: Construct,
      id: String,
      props: DockerImageAssetProps,
    ): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxBuildImage.fromAsset(scope.let(Construct.Companion::unwrap),
        id, props.let(DockerImageAssetProps.Companion::unwrap)).let(IBuildImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66f4338ab15382a1d0a2efb8183796cd48bca3922530d07a2c878008262c08ef")
    public fun fromAsset(
      scope: Construct,
      id: String,
      props: DockerImageAssetProps.Builder.() -> Unit,
    ): IBuildImage = fromAsset(scope, id, DockerImageAssetProps(props))

    public fun fromCodeBuildImageId(id: String): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxBuildImage.fromCodeBuildImageId(id).let(IBuildImage::wrap)

    public fun fromDockerRegistry(name: String): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxBuildImage.fromDockerRegistry(name).let(IBuildImage::wrap)

    public fun fromDockerRegistry(name: String, options: DockerImageOptions): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxBuildImage.fromDockerRegistry(name,
        options.let(DockerImageOptions.Companion::unwrap)).let(IBuildImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9dfa00b9fda484ff06b60ab8b92ae7805fa8054bf1b7155a5e6cb7e59c4680f")
    public fun fromDockerRegistry(name: String, options: DockerImageOptions.Builder.() -> Unit):
        IBuildImage = fromDockerRegistry(name, DockerImageOptions(options))

    public fun fromEcrRepository(repository: IRepository): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxBuildImage.fromEcrRepository(repository.let(IRepository.Companion::unwrap)).let(IBuildImage::wrap)

    public fun fromEcrRepository(repository: IRepository, tagOrDigest: String): IBuildImage =
        software.amazon.awscdk.services.codebuild.LinuxBuildImage.fromEcrRepository(repository.let(IRepository.Companion::unwrap),
        tagOrDigest).let(IBuildImage::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.LinuxBuildImage):
        LinuxBuildImage = LinuxBuildImage(cdkObject)

    internal fun unwrap(wrapped: LinuxBuildImage):
        software.amazon.awscdk.services.codebuild.LinuxBuildImage = wrapped.cdkObject as
        software.amazon.awscdk.services.codebuild.LinuxBuildImage
  }
}
