package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SigningProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.signer.SigningProfile,
) : Resource(cdkObject), ISigningProfile {
  /**
   * The ARN of the signing profile.
   */
  public override fun signingProfileArn(): String = unwrap(this).getSigningProfileArn()

  /**
   * The name of signing profile.
   */
  public override fun signingProfileName(): String = unwrap(this).getSigningProfileName()

  /**
   * The version of signing profile.
   */
  public override fun signingProfileVersion(): String = unwrap(this).getSigningProfileVersion()

  /**
   * The ARN of signing profile version.
   */
  public override fun signingProfileVersionArn(): String =
      unwrap(this).getSigningProfileVersionArn()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.signer.SigningProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Signing Platform available for signing profile.
     *
     * [Documentation](https://docs.aws.amazon.com/signer/latest/developerguide/gs-platform.html)
     * @param platform The Signing Platform available for signing profile. 
     */
    public fun platform(platform: Platform)

    /**
     * The validity period for signatures generated using this signing profile.
     *
     * Default: - 135 months
     *
     * @param signatureValidity The validity period for signatures generated using this signing
     * profile. 
     */
    public fun signatureValidity(signatureValidity: Duration)

    /**
     * Physical name of this Signing Profile.
     *
     * Default: - Assigned by CloudFormation (recommended).
     *
     * @param signingProfileName Physical name of this Signing Profile. 
     */
    public fun signingProfileName(signingProfileName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.signer.SigningProfile.Builder =
        software.amazon.awscdk.services.signer.SigningProfile.Builder.create(scope, id)

    /**
     * The Signing Platform available for signing profile.
     *
     * [Documentation](https://docs.aws.amazon.com/signer/latest/developerguide/gs-platform.html)
     * @param platform The Signing Platform available for signing profile. 
     */
    override fun platform(platform: Platform) {
      cdkBuilder.platform(platform.let(Platform::unwrap))
    }

    /**
     * The validity period for signatures generated using this signing profile.
     *
     * Default: - 135 months
     *
     * @param signatureValidity The validity period for signatures generated using this signing
     * profile. 
     */
    override fun signatureValidity(signatureValidity: Duration) {
      cdkBuilder.signatureValidity(signatureValidity.let(Duration::unwrap))
    }

    /**
     * Physical name of this Signing Profile.
     *
     * Default: - Assigned by CloudFormation (recommended).
     *
     * @param signingProfileName Physical name of this Signing Profile. 
     */
    override fun signingProfileName(signingProfileName: String) {
      cdkBuilder.signingProfileName(signingProfileName)
    }

    public fun build(): software.amazon.awscdk.services.signer.SigningProfile = cdkBuilder.build()
  }

  public companion object {
    public fun fromSigningProfileAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: SigningProfileAttributes,
    ): ISigningProfile =
        software.amazon.awscdk.services.signer.SigningProfile.fromSigningProfileAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(SigningProfileAttributes::unwrap)).let(ISigningProfile::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7ac374b72df751b648ef3dd93a9aca2073cdf94c77389bfa8e98d03374e43a0")
    public fun fromSigningProfileAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: SigningProfileAttributes.Builder.() -> Unit,
    ): ISigningProfile = fromSigningProfileAttributes(scope, id, SigningProfileAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SigningProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SigningProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.SigningProfile):
        SigningProfile = SigningProfile(cdkObject)

    internal fun unwrap(wrapped: SigningProfile):
        software.amazon.awscdk.services.signer.SigningProfile = wrapped.cdkObject
  }
}