@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for a Signing Profile object.
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
public interface SigningProfileProps {
  /**
   * The Signing Platform available for signing profile.
   *
   * [Documentation](https://docs.aws.amazon.com/signer/latest/developerguide/gs-platform.html)
   */
  public fun platform(): Platform

  /**
   * The validity period for signatures generated using this signing profile.
   *
   * Default: - 135 months
   */
  public fun signatureValidity(): Duration? =
      unwrap(this).getSignatureValidity()?.let(Duration::wrap)

  /**
   * Physical name of this Signing Profile.
   *
   * Default: - Assigned by CloudFormation (recommended).
   */
  public fun signingProfileName(): String? = unwrap(this).getSigningProfileName()

  /**
   * A builder for [SigningProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param platform The Signing Platform available for signing profile. 
     */
    public fun platform(platform: Platform)

    /**
     * @param signatureValidity The validity period for signatures generated using this signing
     * profile.
     */
    public fun signatureValidity(signatureValidity: Duration)

    /**
     * @param signingProfileName Physical name of this Signing Profile.
     */
    public fun signingProfileName(signingProfileName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.signer.SigningProfileProps.Builder =
        software.amazon.awscdk.services.signer.SigningProfileProps.builder()

    /**
     * @param platform The Signing Platform available for signing profile. 
     */
    override fun platform(platform: Platform) {
      cdkBuilder.platform(platform.let(Platform.Companion::unwrap))
    }

    /**
     * @param signatureValidity The validity period for signatures generated using this signing
     * profile.
     */
    override fun signatureValidity(signatureValidity: Duration) {
      cdkBuilder.signatureValidity(signatureValidity.let(Duration.Companion::unwrap))
    }

    /**
     * @param signingProfileName Physical name of this Signing Profile.
     */
    override fun signingProfileName(signingProfileName: String) {
      cdkBuilder.signingProfileName(signingProfileName)
    }

    public fun build(): software.amazon.awscdk.services.signer.SigningProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.signer.SigningProfileProps,
  ) : CdkObject(cdkObject),
      SigningProfileProps {
    /**
     * The Signing Platform available for signing profile.
     *
     * [Documentation](https://docs.aws.amazon.com/signer/latest/developerguide/gs-platform.html)
     */
    override fun platform(): Platform = unwrap(this).getPlatform().let(Platform::wrap)

    /**
     * The validity period for signatures generated using this signing profile.
     *
     * Default: - 135 months
     */
    override fun signatureValidity(): Duration? =
        unwrap(this).getSignatureValidity()?.let(Duration::wrap)

    /**
     * Physical name of this Signing Profile.
     *
     * Default: - Assigned by CloudFormation (recommended).
     */
    override fun signingProfileName(): String? = unwrap(this).getSigningProfileName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SigningProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.SigningProfileProps):
        SigningProfileProps = CdkObjectWrappers.wrap(cdkObject) as? SigningProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SigningProfileProps):
        software.amazon.awscdk.services.signer.SigningProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.signer.SigningProfileProps
  }
}
