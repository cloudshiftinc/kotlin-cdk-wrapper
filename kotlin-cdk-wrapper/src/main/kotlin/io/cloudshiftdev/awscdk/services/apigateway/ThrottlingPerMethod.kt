@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ThrottlingPerMethod {
  public fun method(): Method

  public fun throttle(): ThrottleSettings

  @CdkDslMarker
  public interface Builder {
    public fun method(method: Method)

    public fun throttle(throttle: ThrottleSettings)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb76cd9a6b35574df0b500df70b6e031e0e5c49c85d132912a5aa2121608cdb0")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ThrottlingPerMethod.Builder =
        software.amazon.awscdk.services.apigateway.ThrottlingPerMethod.builder()

    override fun method(method: Method) {
      cdkBuilder.method(method.let(Method::unwrap))
    }

    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb76cd9a6b35574df0b500df70b6e031e0e5c49c85d132912a5aa2121608cdb0")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigateway.ThrottlingPerMethod =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ThrottlingPerMethod,
  ) : CdkObject(cdkObject), ThrottlingPerMethod {
    override fun method(): Method = unwrap(this).getMethod().let(Method::wrap)

    override fun throttle(): ThrottleSettings =
        unwrap(this).getThrottle().let(ThrottleSettings::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ThrottlingPerMethod {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ThrottlingPerMethod):
        ThrottlingPerMethod = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ThrottlingPerMethod):
        software.amazon.awscdk.services.apigateway.ThrottlingPerMethod = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.ThrottlingPerMethod
  }
}
