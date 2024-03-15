@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface MfaSecondFactor {
  public fun otp(): Boolean

  public fun sms(): Boolean

  @CdkDslMarker
  public interface Builder {
    public fun otp(otp: Boolean)

    public fun sms(sms: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.MfaSecondFactor.Builder =
        software.amazon.awscdk.services.cognito.MfaSecondFactor.builder()

    override fun otp(otp: Boolean) {
      cdkBuilder.otp(otp)
    }

    override fun sms(sms: Boolean) {
      cdkBuilder.sms(sms)
    }

    public fun build(): software.amazon.awscdk.services.cognito.MfaSecondFactor = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.MfaSecondFactor,
  ) : CdkObject(cdkObject), MfaSecondFactor {
    override fun otp(): Boolean = unwrap(this).getOtp()

    override fun sms(): Boolean = unwrap(this).getSms()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MfaSecondFactor {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.MfaSecondFactor):
        MfaSecondFactor = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MfaSecondFactor):
        software.amazon.awscdk.services.cognito.MfaSecondFactor = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.MfaSecondFactor
  }
}
