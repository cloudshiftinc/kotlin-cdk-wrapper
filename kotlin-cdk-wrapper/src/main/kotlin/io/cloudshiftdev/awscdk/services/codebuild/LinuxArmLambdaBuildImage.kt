@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * A CodeBuild image running aarch64 Lambda.
 *
 * This class has a bunch of public constants that represent the CodeBuild aarch64 Lambda images.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * IBuildImage linuxArmLambdaBuildImage = LinuxArmLambdaBuildImage.AMAZON_LINUX_2_CORRETTO_11;
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html)
 */
public open class LinuxArmLambdaBuildImage(
  cdkObject: software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage,
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
    public val AMAZON_LINUX_2_CORRETTO_11: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage.AMAZON_LINUX_2_CORRETTO_11)

    public val AMAZON_LINUX_2_CORRETTO_17: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage.AMAZON_LINUX_2_CORRETTO_17)

    public val AMAZON_LINUX_2_DOTNET_6: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage.AMAZON_LINUX_2_DOTNET_6)

    public val AMAZON_LINUX_2_GO_1_21: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage.AMAZON_LINUX_2_GO_1_21)

    public val AMAZON_LINUX_2_NODE_18: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage.AMAZON_LINUX_2_NODE_18)

    public val AMAZON_LINUX_2_PYTHON_3_11: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage.AMAZON_LINUX_2_PYTHON_3_11)

    public val AMAZON_LINUX_2_RUBY_3_2: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage.AMAZON_LINUX_2_RUBY_3_2)

    public val AMAZON_LINUX_2023_CORRETTO_21: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage.AMAZON_LINUX_2023_CORRETTO_21)

    public val AMAZON_LINUX_2023_DOTNET_8: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage.AMAZON_LINUX_2023_DOTNET_8)

    public val AMAZON_LINUX_2023_GO_1_24: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage.AMAZON_LINUX_2023_GO_1_24)

    public val AMAZON_LINUX_2023_NODE_20: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage.AMAZON_LINUX_2023_NODE_20)

    public val AMAZON_LINUX_2023_NODE_22: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage.AMAZON_LINUX_2023_NODE_22)

    public val AMAZON_LINUX_2023_PYTHON_3_12: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage.AMAZON_LINUX_2023_PYTHON_3_12)

    public val AMAZON_LINUX_2023_PYTHON_3_13: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage.AMAZON_LINUX_2023_PYTHON_3_13)

    public val AMAZON_LINUX_2023_RUBY_3_4: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage.AMAZON_LINUX_2023_RUBY_3_4)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage):
        LinuxArmLambdaBuildImage = LinuxArmLambdaBuildImage(cdkObject)

    internal fun unwrap(wrapped: LinuxArmLambdaBuildImage):
        software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage = wrapped.cdkObject as
        software.amazon.awscdk.services.codebuild.LinuxArmLambdaBuildImage
  }
}
