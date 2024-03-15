@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class LinuxLambdaBuildImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.LinuxLambdaBuildImage,
) : CdkObject(cdkObject), IBuildImage {
  public override fun defaultComputeType(): ComputeType =
      unwrap(this).getDefaultComputeType().let(ComputeType::wrap)

  public override fun imageId(): String = unwrap(this).getImageId()

  public override fun runScriptBuildspec(entrypoint: String): BuildSpec =
      unwrap(this).runScriptBuildspec(entrypoint).let(BuildSpec::wrap)

  public override fun type(): String = unwrap(this).getType()

  public override fun validate(buildEnvironment: BuildEnvironment): List<String> =
      unwrap(this).validate(buildEnvironment.let(BuildEnvironment::unwrap))

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff36d333164150adb92277700abb7153d45f26e16fa225966e7bf6fc0bedfcee")
  public override fun validate(buildEnvironment: BuildEnvironment.Builder.() -> Unit): List<String>
      = validate(BuildEnvironment(buildEnvironment))

  public companion object {
    public val AMAZON_LINUX_2_CORRETTO_11: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxLambdaBuildImage.AMAZON_LINUX_2_CORRETTO_11)

    public val AMAZON_LINUX_2_CORRETTO_17: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxLambdaBuildImage.AMAZON_LINUX_2_CORRETTO_17)

    public val AMAZON_LINUX_2_DOTNET_6: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxLambdaBuildImage.AMAZON_LINUX_2_DOTNET_6)

    public val AMAZON_LINUX_2_GO_1_21: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxLambdaBuildImage.AMAZON_LINUX_2_GO_1_21)

    public val AMAZON_LINUX_2_NODE_18: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxLambdaBuildImage.AMAZON_LINUX_2_NODE_18)

    public val AMAZON_LINUX_2_PYTHON_3_11: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxLambdaBuildImage.AMAZON_LINUX_2_PYTHON_3_11)

    public val AMAZON_LINUX_2_RUBY_3_2: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxLambdaBuildImage.AMAZON_LINUX_2_RUBY_3_2)

    public val AMAZON_LINUX_2023_CORRETTO_21: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxLambdaBuildImage.AMAZON_LINUX_2023_CORRETTO_21)

    public val AMAZON_LINUX_2023_NODE_20: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxLambdaBuildImage.AMAZON_LINUX_2023_NODE_20)

    public val AMAZON_LINUX_2023_PYTHON_3_12: IBuildImage =
        IBuildImage.wrap(software.amazon.awscdk.services.codebuild.LinuxLambdaBuildImage.AMAZON_LINUX_2023_PYTHON_3_12)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.LinuxLambdaBuildImage):
        LinuxLambdaBuildImage = LinuxLambdaBuildImage(cdkObject)

    internal fun unwrap(wrapped: LinuxLambdaBuildImage):
        software.amazon.awscdk.services.codebuild.LinuxLambdaBuildImage = wrapped.cdkObject
  }
}
