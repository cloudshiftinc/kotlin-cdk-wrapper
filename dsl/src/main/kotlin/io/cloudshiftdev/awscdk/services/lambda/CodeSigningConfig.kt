package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.signer.ISigningProfile
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CodeSigningConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.CodeSigningConfig,
) : Resource(cdkObject), ICodeSigningConfig {
  public override fun codeSigningConfigArn(): String = unwrap(this).getCodeSigningConfigArn()

  public override fun codeSigningConfigId(): String = unwrap(this).getCodeSigningConfigId()

  public interface Builder {
    public fun description(description: String)

    public fun signingProfiles(signingProfiles: List<ISigningProfile>)

    public
        fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: UntrustedArtifactOnDeployment)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CodeSigningConfig.Builder =
        software.amazon.awscdk.services.lambda.CodeSigningConfig.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun signingProfiles(signingProfiles: List<ISigningProfile>) {
      cdkBuilder.signingProfiles(signingProfiles.map(ISigningProfile::unwrap))
    }

    override
        fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: UntrustedArtifactOnDeployment) {
      cdkBuilder.untrustedArtifactOnDeployment(untrustedArtifactOnDeployment.let(UntrustedArtifactOnDeployment::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.CodeSigningConfig =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromCodeSigningConfigArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      codeSigningConfigArn: String,
    ): ICodeSigningConfig =
        software.amazon.awscdk.services.lambda.CodeSigningConfig.fromCodeSigningConfigArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, codeSigningConfigArn).let(ICodeSigningConfig::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CodeSigningConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CodeSigningConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CodeSigningConfig):
        CodeSigningConfig = CodeSigningConfig(cdkObject)

    internal fun unwrap(wrapped: CodeSigningConfig):
        software.amazon.awscdk.services.lambda.CodeSigningConfig = wrapped.cdkObject
  }
}
