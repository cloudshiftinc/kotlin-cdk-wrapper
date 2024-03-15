@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnHealthCheckProps {
  public fun healthCheckConfig(): Any

  public fun healthCheckTags(): Any? = unwrap(this).getHealthCheckTags()

  @CdkDslMarker
  public interface Builder {
    public fun healthCheckConfig(healthCheckConfig: IResolvable)

    public fun healthCheckConfig(healthCheckConfig: CfnHealthCheck.HealthCheckConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a49e1b3159cb2ed23d4f2a6ca6db791dceb189e7522f57dceea593a17ff4f463")
    public
        fun healthCheckConfig(healthCheckConfig: CfnHealthCheck.HealthCheckConfigProperty.Builder.() -> Unit)

    public fun healthCheckTags(healthCheckTags: IResolvable)

    public fun healthCheckTags(healthCheckTags: List<Any>)

    public fun healthCheckTags(vararg healthCheckTags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnHealthCheckProps.Builder =
        software.amazon.awscdk.services.route53.CfnHealthCheckProps.builder()

    override fun healthCheckConfig(healthCheckConfig: IResolvable) {
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(IResolvable::unwrap))
    }

    override fun healthCheckConfig(healthCheckConfig: CfnHealthCheck.HealthCheckConfigProperty) {
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(CfnHealthCheck.HealthCheckConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a49e1b3159cb2ed23d4f2a6ca6db791dceb189e7522f57dceea593a17ff4f463")
    override
        fun healthCheckConfig(healthCheckConfig: CfnHealthCheck.HealthCheckConfigProperty.Builder.() -> Unit):
        Unit = healthCheckConfig(CfnHealthCheck.HealthCheckConfigProperty(healthCheckConfig))

    override fun healthCheckTags(healthCheckTags: IResolvable) {
      cdkBuilder.healthCheckTags(healthCheckTags.let(IResolvable::unwrap))
    }

    override fun healthCheckTags(healthCheckTags: List<Any>) {
      cdkBuilder.healthCheckTags(healthCheckTags)
    }

    override fun healthCheckTags(vararg healthCheckTags: Any): Unit =
        healthCheckTags(healthCheckTags.toList())

    public fun build(): software.amazon.awscdk.services.route53.CfnHealthCheckProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.CfnHealthCheckProps,
  ) : CdkObject(cdkObject), CfnHealthCheckProps {
    override fun healthCheckConfig(): Any = unwrap(this).getHealthCheckConfig()

    override fun healthCheckTags(): Any? = unwrap(this).getHealthCheckTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHealthCheckProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHealthCheckProps):
        CfnHealthCheckProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHealthCheckProps):
        software.amazon.awscdk.services.route53.CfnHealthCheckProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.CfnHealthCheckProps
  }
}
