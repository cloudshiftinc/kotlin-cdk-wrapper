@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.signer.ISigningProfile
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Construction properties for a Code Signing Config object.
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
public interface CodeSigningConfigProps {
  /**
   * Code signing configuration description.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * List of signing profiles that defines a trusted user who can sign a code package.
   */
  public fun signingProfiles(): List<ISigningProfile>

  /**
   * Code signing configuration policy for deployment validation failure.
   *
   * If you set the policy to Enforce, Lambda blocks the deployment request
   * if signature validation checks fail.
   * If you set the policy to Warn, Lambda allows the deployment and
   * creates a CloudWatch log.
   *
   * Default: UntrustedArtifactOnDeployment.WARN
   */
  public fun untrustedArtifactOnDeployment(): UntrustedArtifactOnDeployment? =
      unwrap(this).getUntrustedArtifactOnDeployment()?.let(UntrustedArtifactOnDeployment::wrap)

  /**
   * A builder for [CodeSigningConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description Code signing configuration description.
     */
    public fun description(description: String)

    /**
     * @param signingProfiles List of signing profiles that defines a trusted user who can sign a
     * code package. 
     */
    public fun signingProfiles(signingProfiles: List<ISigningProfile>)

    /**
     * @param signingProfiles List of signing profiles that defines a trusted user who can sign a
     * code package. 
     */
    public fun signingProfiles(vararg signingProfiles: ISigningProfile)

    /**
     * @param untrustedArtifactOnDeployment Code signing configuration policy for deployment
     * validation failure.
     * If you set the policy to Enforce, Lambda blocks the deployment request
     * if signature validation checks fail.
     * If you set the policy to Warn, Lambda allows the deployment and
     * creates a CloudWatch log.
     */
    public
        fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: UntrustedArtifactOnDeployment)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CodeSigningConfigProps.Builder =
        software.amazon.awscdk.services.lambda.CodeSigningConfigProps.builder()

    /**
     * @param description Code signing configuration description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param signingProfiles List of signing profiles that defines a trusted user who can sign a
     * code package. 
     */
    override fun signingProfiles(signingProfiles: List<ISigningProfile>) {
      cdkBuilder.signingProfiles(signingProfiles.map(ISigningProfile.Companion::unwrap))
    }

    /**
     * @param signingProfiles List of signing profiles that defines a trusted user who can sign a
     * code package. 
     */
    override fun signingProfiles(vararg signingProfiles: ISigningProfile): Unit =
        signingProfiles(signingProfiles.toList())

    /**
     * @param untrustedArtifactOnDeployment Code signing configuration policy for deployment
     * validation failure.
     * If you set the policy to Enforce, Lambda blocks the deployment request
     * if signature validation checks fail.
     * If you set the policy to Warn, Lambda allows the deployment and
     * creates a CloudWatch log.
     */
    override
        fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: UntrustedArtifactOnDeployment) {
      cdkBuilder.untrustedArtifactOnDeployment(untrustedArtifactOnDeployment.let(UntrustedArtifactOnDeployment.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.CodeSigningConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.CodeSigningConfigProps,
  ) : CdkObject(cdkObject),
      CodeSigningConfigProps {
    /**
     * Code signing configuration description.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * List of signing profiles that defines a trusted user who can sign a code package.
     */
    override fun signingProfiles(): List<ISigningProfile> =
        unwrap(this).getSigningProfiles().map(ISigningProfile::wrap)

    /**
     * Code signing configuration policy for deployment validation failure.
     *
     * If you set the policy to Enforce, Lambda blocks the deployment request
     * if signature validation checks fail.
     * If you set the policy to Warn, Lambda allows the deployment and
     * creates a CloudWatch log.
     *
     * Default: UntrustedArtifactOnDeployment.WARN
     */
    override fun untrustedArtifactOnDeployment(): UntrustedArtifactOnDeployment? =
        unwrap(this).getUntrustedArtifactOnDeployment()?.let(UntrustedArtifactOnDeployment::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeSigningConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CodeSigningConfigProps):
        CodeSigningConfigProps = CdkObjectWrappers.wrap(cdkObject) as? CodeSigningConfigProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeSigningConfigProps):
        software.amazon.awscdk.services.lambda.CodeSigningConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CodeSigningConfigProps
  }
}
