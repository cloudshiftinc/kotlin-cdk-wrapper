@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface BuildEnvironment {
  public fun buildImage(): IBuildImage? = unwrap(this).getBuildImage()?.let(IBuildImage::wrap)

  public fun certificate(): BuildEnvironmentCertificate? =
      unwrap(this).getCertificate()?.let(BuildEnvironmentCertificate::wrap)

  public fun computeType(): ComputeType? = unwrap(this).getComputeType()?.let(ComputeType::wrap)

  public fun environmentVariables(): Map<String, BuildEnvironmentVariable> =
      unwrap(this).getEnvironmentVariables()?.mapValues{BuildEnvironmentVariable.wrap(it.value)} ?:
      emptyMap()

  public fun privileged(): Boolean? = unwrap(this).getPrivileged()

  @CdkDslMarker
  public interface Builder {
    public fun buildImage(buildImage: IBuildImage)

    public fun certificate(certificate: BuildEnvironmentCertificate)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09017eab37f62dfd6f983cd063f7b91ffaaed137d75b90a84954e0ca86761e58")
    public fun certificate(certificate: BuildEnvironmentCertificate.Builder.() -> Unit)

    public fun computeType(computeType: ComputeType)

    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>)

    public fun privileged(privileged: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.BuildEnvironment.Builder =
        software.amazon.awscdk.services.codebuild.BuildEnvironment.builder()

    override fun buildImage(buildImage: IBuildImage) {
      cdkBuilder.buildImage(buildImage.let(IBuildImage::unwrap))
    }

    override fun certificate(certificate: BuildEnvironmentCertificate) {
      cdkBuilder.certificate(certificate.let(BuildEnvironmentCertificate::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09017eab37f62dfd6f983cd063f7b91ffaaed137d75b90a84954e0ca86761e58")
    override fun certificate(certificate: BuildEnvironmentCertificate.Builder.() -> Unit): Unit =
        certificate(BuildEnvironmentCertificate(certificate))

    override fun computeType(computeType: ComputeType) {
      cdkBuilder.computeType(computeType.let(ComputeType::unwrap))
    }

    override fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
      cdkBuilder.environmentVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)})
    }

    override fun privileged(privileged: Boolean) {
      cdkBuilder.privileged(privileged)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BuildEnvironment =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.BuildEnvironment,
  ) : CdkObject(cdkObject), BuildEnvironment {
    override fun buildImage(): IBuildImage? = unwrap(this).getBuildImage()?.let(IBuildImage::wrap)

    override fun certificate(): BuildEnvironmentCertificate? =
        unwrap(this).getCertificate()?.let(BuildEnvironmentCertificate::wrap)

    override fun computeType(): ComputeType? = unwrap(this).getComputeType()?.let(ComputeType::wrap)

    override fun environmentVariables(): Map<String, BuildEnvironmentVariable> =
        unwrap(this).getEnvironmentVariables()?.mapValues{BuildEnvironmentVariable.wrap(it.value)}
        ?: emptyMap()

    override fun privileged(): Boolean? = unwrap(this).getPrivileged()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BuildEnvironment {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BuildEnvironment):
        BuildEnvironment = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BuildEnvironment):
        software.amazon.awscdk.services.codebuild.BuildEnvironment = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.BuildEnvironment
  }
}
