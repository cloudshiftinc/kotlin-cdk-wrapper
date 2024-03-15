@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface BaseServiceProps {
  public fun customHealthCheck(): HealthCheckCustomConfig? =
      unwrap(this).getCustomHealthCheck()?.let(HealthCheckCustomConfig::wrap)

  public fun description(): String? = unwrap(this).getDescription()

  public fun healthCheck(): HealthCheckConfig? =
      unwrap(this).getHealthCheck()?.let(HealthCheckConfig::wrap)

  public fun name(): String? = unwrap(this).getName()

  @CdkDslMarker
  public interface Builder {
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72e6b83c0e8ae1629814f5b74e8ad5d009b746750cd9037b71f18e953b828b0b")
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig.Builder.() -> Unit)

    public fun description(description: String)

    public fun healthCheck(healthCheck: HealthCheckConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3f501478e6138abbef549cc2ab803805eadec4aa7eeca59c0fdecb247435c2b")
    public fun healthCheck(healthCheck: HealthCheckConfig.Builder.() -> Unit)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.BaseServiceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.BaseServiceProps.builder()

    override fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig) {
      cdkBuilder.customHealthCheck(customHealthCheck.let(HealthCheckCustomConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72e6b83c0e8ae1629814f5b74e8ad5d009b746750cd9037b71f18e953b828b0b")
    override fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig.Builder.() -> Unit):
        Unit = customHealthCheck(HealthCheckCustomConfig(customHealthCheck))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun healthCheck(healthCheck: HealthCheckConfig) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheckConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3f501478e6138abbef549cc2ab803805eadec4aa7eeca59c0fdecb247435c2b")
    override fun healthCheck(healthCheck: HealthCheckConfig.Builder.() -> Unit): Unit =
        healthCheck(HealthCheckConfig(healthCheck))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.BaseServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.BaseServiceProps,
  ) : CdkObject(cdkObject), BaseServiceProps {
    override fun customHealthCheck(): HealthCheckCustomConfig? =
        unwrap(this).getCustomHealthCheck()?.let(HealthCheckCustomConfig::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun healthCheck(): HealthCheckConfig? =
        unwrap(this).getHealthCheck()?.let(HealthCheckConfig::wrap)

    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.BaseServiceProps):
        BaseServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseServiceProps):
        software.amazon.awscdk.services.servicediscovery.BaseServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.BaseServiceProps
  }
}
