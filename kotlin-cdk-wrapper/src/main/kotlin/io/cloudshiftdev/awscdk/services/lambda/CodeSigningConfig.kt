@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.signer.ISigningProfile
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Defines a Code Signing Config.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.signer.*;
 * SigningProfile signingProfile = SigningProfile.Builder.create(this, "SigningProfile")
 * .platform(Platform.AWS_LAMBDA_SHA384_ECDSA)
 * .build();
 * CodeSigningConfig codeSigningConfig = CodeSigningConfig.Builder.create(this, "CodeSigningConfig")
 * .signingProfiles(List.of(signingProfile))
 * .build();
 * Function.Builder.create(this, "Function")
 * .codeSigningConfig(codeSigningConfig)
 * .runtime(Runtime.NODEJS_18_X)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * .build();
 * ```
 */
public open class CodeSigningConfig(
  cdkObject: software.amazon.awscdk.services.lambda.CodeSigningConfig,
) : Resource(cdkObject),
    ICodeSigningConfig {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CodeSigningConfigProps,
  ) :
      this(software.amazon.awscdk.services.lambda.CodeSigningConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CodeSigningConfigProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CodeSigningConfigProps.Builder.() -> Unit,
  ) : this(scope, id, CodeSigningConfigProps(props)
  )

  /**
   * The ARN of Code Signing Config.
   */
  public override fun codeSigningConfigArn(): String = unwrap(this).getCodeSigningConfigArn()

  /**
   * The id of Code Signing Config.
   */
  public override fun codeSigningConfigId(): String = unwrap(this).getCodeSigningConfigId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.CodeSigningConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Code signing configuration description.
     *
     * Default: - No description.
     *
     * @param description Code signing configuration description. 
     */
    public fun description(description: String)

    /**
     * List of signing profiles that defines a trusted user who can sign a code package.
     *
     * @param signingProfiles List of signing profiles that defines a trusted user who can sign a
     * code package. 
     */
    public fun signingProfiles(signingProfiles: List<ISigningProfile>)

    /**
     * List of signing profiles that defines a trusted user who can sign a code package.
     *
     * @param signingProfiles List of signing profiles that defines a trusted user who can sign a
     * code package. 
     */
    public fun signingProfiles(vararg signingProfiles: ISigningProfile)

    /**
     * Code signing configuration policy for deployment validation failure.
     *
     * If you set the policy to Enforce, Lambda blocks the deployment request
     * if signature validation checks fail.
     * If you set the policy to Warn, Lambda allows the deployment and
     * creates a CloudWatch log.
     *
     * Default: UntrustedArtifactOnDeployment.WARN
     *
     * @param untrustedArtifactOnDeployment Code signing configuration policy for deployment
     * validation failure. 
     */
    public
        fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: UntrustedArtifactOnDeployment)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CodeSigningConfig.Builder =
        software.amazon.awscdk.services.lambda.CodeSigningConfig.Builder.create(scope, id)

    /**
     * Code signing configuration description.
     *
     * Default: - No description.
     *
     * @param description Code signing configuration description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * List of signing profiles that defines a trusted user who can sign a code package.
     *
     * @param signingProfiles List of signing profiles that defines a trusted user who can sign a
     * code package. 
     */
    override fun signingProfiles(signingProfiles: List<ISigningProfile>) {
      cdkBuilder.signingProfiles(signingProfiles.map(ISigningProfile.Companion::unwrap))
    }

    /**
     * List of signing profiles that defines a trusted user who can sign a code package.
     *
     * @param signingProfiles List of signing profiles that defines a trusted user who can sign a
     * code package. 
     */
    override fun signingProfiles(vararg signingProfiles: ISigningProfile): Unit =
        signingProfiles(signingProfiles.toList())

    /**
     * Code signing configuration policy for deployment validation failure.
     *
     * If you set the policy to Enforce, Lambda blocks the deployment request
     * if signature validation checks fail.
     * If you set the policy to Warn, Lambda allows the deployment and
     * creates a CloudWatch log.
     *
     * Default: UntrustedArtifactOnDeployment.WARN
     *
     * @param untrustedArtifactOnDeployment Code signing configuration policy for deployment
     * validation failure. 
     */
    override
        fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: UntrustedArtifactOnDeployment) {
      cdkBuilder.untrustedArtifactOnDeployment(untrustedArtifactOnDeployment.let(UntrustedArtifactOnDeployment.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.CodeSigningConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.lambda.CodeSigningConfig.PROPERTY_INJECTION_ID

    public fun fromCodeSigningConfigArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      codeSigningConfigArn: String,
    ): ICodeSigningConfig =
        software.amazon.awscdk.services.lambda.CodeSigningConfig.fromCodeSigningConfigArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
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
        software.amazon.awscdk.services.lambda.CodeSigningConfig = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.CodeSigningConfig
  }
}
