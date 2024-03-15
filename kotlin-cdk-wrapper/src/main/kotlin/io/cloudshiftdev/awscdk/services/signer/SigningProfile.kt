@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SigningProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.signer.SigningProfile,
) : Resource(cdkObject), ISigningProfile {
  public override fun signingProfileArn(): String = unwrap(this).getSigningProfileArn()

  public override fun signingProfileName(): String = unwrap(this).getSigningProfileName()

  public override fun signingProfileVersion(): String = unwrap(this).getSigningProfileVersion()

  public override fun signingProfileVersionArn(): String =
      unwrap(this).getSigningProfileVersionArn()

  @CdkDslMarker
  public interface Builder {
    public fun platform(platform: Platform)

    public fun signatureValidity(signatureValidity: Duration)

    public fun signingProfileName(signingProfileName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.signer.SigningProfile.Builder =
        software.amazon.awscdk.services.signer.SigningProfile.Builder.create(scope, id)

    override fun platform(platform: Platform) {
      cdkBuilder.platform(platform.let(Platform::unwrap))
    }

    override fun signatureValidity(signatureValidity: Duration) {
      cdkBuilder.signatureValidity(signatureValidity.let(Duration::unwrap))
    }

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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
