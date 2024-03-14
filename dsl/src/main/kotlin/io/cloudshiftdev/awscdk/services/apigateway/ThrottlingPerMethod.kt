package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ThrottlingPerMethod {
  public fun method(): Method

  public fun throttle(): ThrottleSettings

  public interface Builder {
    public fun method(method: Method) {
    }

    public fun throttle(throttle: ThrottleSettings) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb76cd9a6b35574df0b500df70b6e031e0e5c49c85d132912a5aa2121608cdb0")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ThrottlingPerMethod.Builder =
        software.amazon.awscdk.services.apigateway.ThrottlingPerMethod.builder()

    public override fun method(method: Method) {
      cdkBuilder.method(method.let(Method::unwrap))
    }

    public override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb76cd9a6b35574df0b500df70b6e031e0e5c49c85d132912a5aa2121608cdb0")
    public override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigateway.ThrottlingPerMethod =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.ThrottlingPerMethod,
  ) : ThrottlingPerMethod {
    public override fun method(): Method = unwrap(this).getMethod().let(Method::wrap)

    public override fun throttle(): ThrottleSettings =
        unwrap(this).getThrottle().let(ThrottleSettings::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ThrottlingPerMethod {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ThrottlingPerMethod):
        ThrottlingPerMethod = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ThrottlingPerMethod):
        software.amazon.awscdk.services.apigateway.ThrottlingPerMethod = (wrapped as
        Wrapper).cdkObject
  }
}
