@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IBindableBuildImage : IBuildImage {
  public fun bind(
    arg0: Construct,
    arg1: IProject,
    arg2: BuildImageBindOptions,
  ): BuildImageConfig

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2217a711d386432885489a755d119db8cc713f4afd5a62af3c63f8f8f7197cd5")
  public fun bind(
    arg0: Construct,
    arg1: IProject,
    arg2: BuildImageBindOptions.Builder.() -> Unit,
  ): BuildImageConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.IBindableBuildImage,
  ) : CdkObject(cdkObject), IBindableBuildImage {
    override fun bind(
      arg0: Construct,
      arg1: IProject,
      arg2: BuildImageBindOptions,
    ): BuildImageConfig = unwrap(this).bind(arg0.let(Construct::unwrap), arg1.let(IProject::unwrap),
        arg2.let(BuildImageBindOptions::unwrap)).let(BuildImageConfig::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2217a711d386432885489a755d119db8cc713f4afd5a62af3c63f8f8f7197cd5")
    override fun bind(
      arg0: Construct,
      arg1: IProject,
      arg2: BuildImageBindOptions.Builder.() -> Unit,
    ): BuildImageConfig = bind(arg0, arg1, BuildImageBindOptions(arg2))

    override fun defaultComputeType(): ComputeType =
        unwrap(this).getDefaultComputeType().let(ComputeType::wrap)

    override fun imageId(): String = unwrap(this).getImageId()

    override fun imagePullPrincipalType(): ImagePullPrincipalType? =
        unwrap(this).getImagePullPrincipalType()?.let(ImagePullPrincipalType::wrap)

    override fun repository(): IRepository? = unwrap(this).getRepository()?.let(IRepository::wrap)

    override fun runScriptBuildspec(arg0: String): BuildSpec =
        unwrap(this).runScriptBuildspec(arg0).let(BuildSpec::wrap)

    override fun secretsManagerCredentials(): ISecret? =
        unwrap(this).getSecretsManagerCredentials()?.let(ISecret::wrap)

    override fun type(): String = unwrap(this).getType()

    override fun validate(arg0: BuildEnvironment): List<String> =
        unwrap(this).validate(arg0.let(BuildEnvironment::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff36d333164150adb92277700abb7153d45f26e16fa225966e7bf6fc0bedfcee")
    override fun validate(arg0: BuildEnvironment.Builder.() -> Unit): List<String> =
        validate(BuildEnvironment(arg0))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IBindableBuildImage):
        IBindableBuildImage = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IBindableBuildImage):
        software.amazon.awscdk.services.codebuild.IBindableBuildImage = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.IBindableBuildImage
  }
}
