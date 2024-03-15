@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface SigningProfileProps {
  public fun platform(): Platform

  public fun signatureValidity(): Duration? =
      unwrap(this).getSignatureValidity()?.let(Duration::wrap)

  public fun signingProfileName(): String? = unwrap(this).getSigningProfileName()

  @CdkDslMarker
  public interface Builder {
    public fun platform(platform: Platform)

    public fun signatureValidity(signatureValidity: Duration)

    public fun signingProfileName(signingProfileName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.signer.SigningProfileProps.Builder =
        software.amazon.awscdk.services.signer.SigningProfileProps.builder()

    override fun platform(platform: Platform) {
      cdkBuilder.platform(platform.let(Platform::unwrap))
    }

    override fun signatureValidity(signatureValidity: Duration) {
      cdkBuilder.signatureValidity(signatureValidity.let(Duration::unwrap))
    }

    override fun signingProfileName(signingProfileName: String) {
      cdkBuilder.signingProfileName(signingProfileName)
    }

    public fun build(): software.amazon.awscdk.services.signer.SigningProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.signer.SigningProfileProps,
  ) : CdkObject(cdkObject), SigningProfileProps {
    override fun platform(): Platform = unwrap(this).getPlatform().let(Platform::wrap)

    override fun signatureValidity(): Duration? =
        unwrap(this).getSignatureValidity()?.let(Duration::wrap)

    override fun signingProfileName(): String? = unwrap(this).getSigningProfileName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SigningProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.SigningProfileProps):
        SigningProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SigningProfileProps):
        software.amazon.awscdk.services.signer.SigningProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.signer.SigningProfileProps
  }
}
