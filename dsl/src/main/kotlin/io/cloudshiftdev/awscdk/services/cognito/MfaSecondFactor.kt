package io.cloudshiftdev.awscdk.services.cognito

import kotlin.Boolean
import kotlin.Unit

public interface MfaSecondFactor {
  public fun otp(): Boolean

  public fun sms(): Boolean

  public interface Builder {
    public fun otp(otp: Boolean) {
    }

    public fun sms(sms: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.MfaSecondFactor.Builder =
        software.amazon.awscdk.services.cognito.MfaSecondFactor.builder()

    public override fun otp(otp: Boolean) {
      cdkBuilder.otp(otp)
    }

    public override fun sms(sms: Boolean) {
      cdkBuilder.sms(sms)
    }

    public fun build(): software.amazon.awscdk.services.cognito.MfaSecondFactor = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.MfaSecondFactor,
  ) : MfaSecondFactor {
    public override fun otp(): Boolean = unwrap(this).getOtp()

    public override fun sms(): Boolean = unwrap(this).getSms()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MfaSecondFactor {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.MfaSecondFactor):
        MfaSecondFactor = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MfaSecondFactor):
        software.amazon.awscdk.services.cognito.MfaSecondFactor = (wrapped as Wrapper).cdkObject
  }
}
