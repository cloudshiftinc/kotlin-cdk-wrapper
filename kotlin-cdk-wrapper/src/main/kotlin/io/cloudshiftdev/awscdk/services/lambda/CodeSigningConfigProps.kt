@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.signer.ISigningProfile
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CodeSigningConfigProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun signingProfiles(): List<ISigningProfile>

  public fun untrustedArtifactOnDeployment(): UntrustedArtifactOnDeployment? =
      unwrap(this).getUntrustedArtifactOnDeployment()?.let(UntrustedArtifactOnDeployment::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun signingProfiles(signingProfiles: List<ISigningProfile>)

    public fun signingProfiles(vararg signingProfiles: ISigningProfile)

    public
        fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: UntrustedArtifactOnDeployment)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CodeSigningConfigProps.Builder =
        software.amazon.awscdk.services.lambda.CodeSigningConfigProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun signingProfiles(signingProfiles: List<ISigningProfile>) {
      cdkBuilder.signingProfiles(signingProfiles.map(ISigningProfile::unwrap))
    }

    override fun signingProfiles(vararg signingProfiles: ISigningProfile): Unit =
        signingProfiles(signingProfiles.toList())

    override
        fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: UntrustedArtifactOnDeployment) {
      cdkBuilder.untrustedArtifactOnDeployment(untrustedArtifactOnDeployment.let(UntrustedArtifactOnDeployment::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.CodeSigningConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CodeSigningConfigProps,
  ) : CdkObject(cdkObject), CodeSigningConfigProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun signingProfiles(): List<ISigningProfile> =
        unwrap(this).getSigningProfiles().map(ISigningProfile::wrap)

    override fun untrustedArtifactOnDeployment(): UntrustedArtifactOnDeployment? =
        unwrap(this).getUntrustedArtifactOnDeployment()?.let(UntrustedArtifactOnDeployment::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeSigningConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CodeSigningConfigProps):
        CodeSigningConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeSigningConfigProps):
        software.amazon.awscdk.services.lambda.CodeSigningConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CodeSigningConfigProps
  }
}
