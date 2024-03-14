package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ThrottlingPerMethod {
  /**
   * [disable-awslint:ref-via-interface] The method for which you specify the throttling settings.
   *
   * Default: none
   */
  public fun method(): Method

  /**
   * Specifies the overall request rate (average requests per second) and burst capacity.
   *
   * Default: none
   */
  public fun throttle(): ThrottleSettings

  /**
   * A builder for [ThrottlingPerMethod]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param method [disable-awslint:ref-via-interface] The method for which you specify the
     * throttling settings. 
     */
    public fun method(method: Method)

    /**
     * @param throttle Specifies the overall request rate (average requests per second) and burst
     * capacity. 
     */
    public fun throttle(throttle: ThrottleSettings)

    /**
     * @param throttle Specifies the overall request rate (average requests per second) and burst
     * capacity. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb76cd9a6b35574df0b500df70b6e031e0e5c49c85d132912a5aa2121608cdb0")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ThrottlingPerMethod.Builder =
        software.amazon.awscdk.services.apigateway.ThrottlingPerMethod.builder()

    /**
     * @param method [disable-awslint:ref-via-interface] The method for which you specify the
     * throttling settings. 
     */
    override fun method(method: Method) {
      cdkBuilder.method(method.let(Method::unwrap))
    }

    /**
     * @param throttle Specifies the overall request rate (average requests per second) and burst
     * capacity. 
     */
    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    /**
     * @param throttle Specifies the overall request rate (average requests per second) and burst
     * capacity. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb76cd9a6b35574df0b500df70b6e031e0e5c49c85d132912a5aa2121608cdb0")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigateway.ThrottlingPerMethod =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.ThrottlingPerMethod,
  ) : ThrottlingPerMethod {
    /**
     * [disable-awslint:ref-via-interface] The method for which you specify the throttling settings.
     *
     * Default: none
     */
    override fun method(): Method = unwrap(this).getMethod().let(Method::wrap)

    /**
     * Specifies the overall request rate (average requests per second) and burst capacity.
     *
     * Default: none
     */
    override fun throttle(): ThrottleSettings =
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
