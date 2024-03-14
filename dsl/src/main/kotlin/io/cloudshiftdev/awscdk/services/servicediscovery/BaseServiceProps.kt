package io.cloudshiftdev.awscdk.services.servicediscovery

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface BaseServiceProps {
  public fun customHealthCheck(): HealthCheckCustomConfig? =
      unwrap(this).getCustomHealthCheck()?.let(HealthCheckCustomConfig::wrap)

  public fun description(): String? = unwrap(this).getDescription()

  public fun healthCheck(): HealthCheckConfig? =
      unwrap(this).getHealthCheck()?.let(HealthCheckConfig::wrap)

  public fun name(): String? = unwrap(this).getName()

  public interface Builder {
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72e6b83c0e8ae1629814f5b74e8ad5d009b746750cd9037b71f18e953b828b0b")
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig.Builder.() -> Unit)

    public fun description(description: String)

    public fun healthCheck(healthCheck: HealthCheckConfig)

    @Suppress("INAPPLICABLE_JVM_NAME")
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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72e6b83c0e8ae1629814f5b74e8ad5d009b746750cd9037b71f18e953b828b0b")
    override fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig.Builder.() -> Unit):
        Unit = customHealthCheck(HealthCheckCustomConfig(customHealthCheck))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun healthCheck(healthCheck: HealthCheckConfig) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheckConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3f501478e6138abbef549cc2ab803805eadec4aa7eeca59c0fdecb247435c2b")
    override fun healthCheck(healthCheck: HealthCheckConfig.Builder.() -> Unit): Unit =
        healthCheck(HealthCheckConfig(healthCheck))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.BaseServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicediscovery.BaseServiceProps,
  ) : BaseServiceProps {
    override fun customHealthCheck(): HealthCheckCustomConfig? =
        unwrap(this).getCustomHealthCheck()?.let(HealthCheckCustomConfig::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun healthCheck(): HealthCheckConfig? =
        unwrap(this).getHealthCheck()?.let(HealthCheckConfig::wrap)

    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BaseServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.BaseServiceProps):
        BaseServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseServiceProps):
        software.amazon.awscdk.services.servicediscovery.BaseServiceProps = (wrapped as
        Wrapper).cdkObject
  }
}
