package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IBuildImage {
  public fun defaultComputeType(): ComputeType

  public fun imageId(): String

  public fun imagePullPrincipalType(): ImagePullPrincipalType? =
      unwrap(this).getImagePullPrincipalType()?.let(ImagePullPrincipalType::wrap)

  public fun repository(): IRepository? = unwrap(this).getRepository()?.let(IRepository::wrap)

  public fun runScriptBuildspec(arg0: String): BuildSpec

  public fun secretsManagerCredentials(): ISecret? =
      unwrap(this).getSecretsManagerCredentials()?.let(ISecret::wrap)

  public fun type(): String

  public fun validate(arg0: BuildEnvironment): List<String>

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff36d333164150adb92277700abb7153d45f26e16fa225966e7bf6fc0bedfcee")
  public fun validate(arg0: BuildEnvironment.Builder.() -> Unit): List<String>

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.IBuildImage,
  ) : IBuildImage {
    public override fun defaultComputeType(): ComputeType =
        unwrap(this).getDefaultComputeType().let(ComputeType::wrap)

    public override fun imageId(): String = unwrap(this).getImageId()

    public override fun imagePullPrincipalType(): ImagePullPrincipalType? =
        unwrap(this).getImagePullPrincipalType()?.let(ImagePullPrincipalType::wrap)

    public override fun repository(): IRepository? =
        unwrap(this).getRepository()?.let(IRepository::wrap)

    public override fun runScriptBuildspec(arg0: String): BuildSpec =
        unwrap(this).runScriptBuildspec(arg0).let(BuildSpec::wrap)

    public override fun secretsManagerCredentials(): ISecret? =
        unwrap(this).getSecretsManagerCredentials()?.let(ISecret::wrap)

    public override fun type(): String = unwrap(this).getType()

    public override fun validate(arg0: BuildEnvironment): List<String> =
        unwrap(this).validate(arg0.let(BuildEnvironment::unwrap)) ?: emptyList()

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff36d333164150adb92277700abb7153d45f26e16fa225966e7bf6fc0bedfcee")
    public override fun validate(arg0: BuildEnvironment.Builder.() -> Unit): List<String> =
        validate(BuildEnvironment(arg0))
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IBuildImage): IBuildImage
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IBuildImage): software.amazon.awscdk.services.codebuild.IBuildImage
        = (wrapped as Wrapper).cdkObject
  }
}
