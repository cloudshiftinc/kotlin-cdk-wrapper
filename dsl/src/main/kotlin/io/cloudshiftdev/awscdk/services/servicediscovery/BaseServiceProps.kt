package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface BaseServiceProps {
  /**
   * Structure containing failure threshold for a custom health checker.
   *
   * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
   * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
   *
   * Default: none
   */
  public fun customHealthCheck(): HealthCheckCustomConfig? =
      unwrap(this).getCustomHealthCheck()?.let(HealthCheckCustomConfig::wrap)

  /**
   * A description of the service.
   *
   * Default: none
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Settings for an optional health check.
   *
   * If you specify health check settings, AWS Cloud Map associates the health
   * check with the records that you specify in DnsConfig. Only one of healthCheckConfig or
   * healthCheckCustomConfig can
   * be specified. Not valid for PrivateDnsNamespaces. If you use healthCheck, you can only register
   * IP instances to
   * this service.
   *
   * Default: none
   */
  public fun healthCheck(): HealthCheckConfig? =
      unwrap(this).getHealthCheck()?.let(HealthCheckConfig::wrap)

  /**
   * A name for the Service.
   *
   * Default: CloudFormation-generated name
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A builder for [BaseServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customHealthCheck Structure containing failure threshold for a custom health checker.
     * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
     * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     */
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig)

    /**
     * @param customHealthCheck Structure containing failure threshold for a custom health checker.
     * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
     * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72e6b83c0e8ae1629814f5b74e8ad5d009b746750cd9037b71f18e953b828b0b")
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig.Builder.() -> Unit)

    /**
     * @param description A description of the service.
     */
    public fun description(description: String)

    /**
     * @param healthCheck Settings for an optional health check.
     * If you specify health check settings, AWS Cloud Map associates the health
     * check with the records that you specify in DnsConfig. Only one of healthCheckConfig or
     * healthCheckCustomConfig can
     * be specified. Not valid for PrivateDnsNamespaces. If you use healthCheck, you can only
     * register IP instances to
     * this service.
     */
    public fun healthCheck(healthCheck: HealthCheckConfig)

    /**
     * @param healthCheck Settings for an optional health check.
     * If you specify health check settings, AWS Cloud Map associates the health
     * check with the records that you specify in DnsConfig. Only one of healthCheckConfig or
     * healthCheckCustomConfig can
     * be specified. Not valid for PrivateDnsNamespaces. If you use healthCheck, you can only
     * register IP instances to
     * this service.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3f501478e6138abbef549cc2ab803805eadec4aa7eeca59c0fdecb247435c2b")
    public fun healthCheck(healthCheck: HealthCheckConfig.Builder.() -> Unit)

    /**
     * @param name A name for the Service.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.BaseServiceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.BaseServiceProps.builder()

    /**
     * @param customHealthCheck Structure containing failure threshold for a custom health checker.
     * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
     * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     */
    override fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig) {
      cdkBuilder.customHealthCheck(customHealthCheck.let(HealthCheckCustomConfig::unwrap))
    }

    /**
     * @param customHealthCheck Structure containing failure threshold for a custom health checker.
     * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
     * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72e6b83c0e8ae1629814f5b74e8ad5d009b746750cd9037b71f18e953b828b0b")
    override fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig.Builder.() -> Unit):
        Unit = customHealthCheck(HealthCheckCustomConfig(customHealthCheck))

    /**
     * @param description A description of the service.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param healthCheck Settings for an optional health check.
     * If you specify health check settings, AWS Cloud Map associates the health
     * check with the records that you specify in DnsConfig. Only one of healthCheckConfig or
     * healthCheckCustomConfig can
     * be specified. Not valid for PrivateDnsNamespaces. If you use healthCheck, you can only
     * register IP instances to
     * this service.
     */
    override fun healthCheck(healthCheck: HealthCheckConfig) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheckConfig::unwrap))
    }

    /**
     * @param healthCheck Settings for an optional health check.
     * If you specify health check settings, AWS Cloud Map associates the health
     * check with the records that you specify in DnsConfig. Only one of healthCheckConfig or
     * healthCheckCustomConfig can
     * be specified. Not valid for PrivateDnsNamespaces. If you use healthCheck, you can only
     * register IP instances to
     * this service.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3f501478e6138abbef549cc2ab803805eadec4aa7eeca59c0fdecb247435c2b")
    override fun healthCheck(healthCheck: HealthCheckConfig.Builder.() -> Unit): Unit =
        healthCheck(HealthCheckConfig(healthCheck))

    /**
     * @param name A name for the Service.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.BaseServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.BaseServiceProps,
  ) : CdkObject(cdkObject), BaseServiceProps {
    /**
     * Structure containing failure threshold for a custom health checker.
     *
     * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
     * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     *
     * Default: none
     */
    override fun customHealthCheck(): HealthCheckCustomConfig? =
        unwrap(this).getCustomHealthCheck()?.let(HealthCheckCustomConfig::wrap)

    /**
     * A description of the service.
     *
     * Default: none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Settings for an optional health check.
     *
     * If you specify health check settings, AWS Cloud Map associates the health
     * check with the records that you specify in DnsConfig. Only one of healthCheckConfig or
     * healthCheckCustomConfig can
     * be specified. Not valid for PrivateDnsNamespaces. If you use healthCheck, you can only
     * register IP instances to
     * this service.
     *
     * Default: none
     */
    override fun healthCheck(): HealthCheckConfig? =
        unwrap(this).getHealthCheck()?.let(HealthCheckConfig::wrap)

    /**
     * A name for the Service.
     *
     * Default: CloudFormation-generated name
     */
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
