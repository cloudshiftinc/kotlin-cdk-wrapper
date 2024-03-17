@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Interface for Service Connect configuration.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * FargateService customService = FargateService.Builder.create(this, "CustomizedService")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .serviceConnectConfiguration(ServiceConnectProps.builder()
 * .logDriver(LogDrivers.awsLogs(AwsLogDriverProps.builder()
 * .streamPrefix("sc-traffic")
 * .build()))
 * .services(List.of(ServiceConnectService.builder()
 * .portMappingName("api")
 * .dnsName("customized-api")
 * .port(80)
 * .ingressPortOverride(20040)
 * .discoveryName("custom")
 * .build()))
 * .build())
 * .build();
 * ```
 */
public interface ServiceConnectProps {
  /**
   * The log driver configuration to use for the Service Connect agent logs.
   *
   * Default: - none
   */
  public fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

  /**
   * The cloudmap namespace to register this service into.
   *
   * Default: the cloudmap namespace specified on the cluster.
   */
  public fun namespace(): String? = unwrap(this).getNamespace()

  /**
   * The list of Services, including a port mapping, terse client alias, and optional intermediate
   * DNS name.
   *
   * This property may be left blank if the current ECS service does not need to advertise any ports
   * via Service Connect.
   *
   * Default: none
   */
  public fun services(): List<ServiceConnectService> =
      unwrap(this).getServices()?.map(ServiceConnectService::wrap) ?: emptyList()

  /**
   * A builder for [ServiceConnectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logDriver The log driver configuration to use for the Service Connect agent logs.
     */
    public fun logDriver(logDriver: LogDriver)

    /**
     * @param namespace The cloudmap namespace to register this service into.
     */
    public fun namespace(namespace: String)

    /**
     * @param services The list of Services, including a port mapping, terse client alias, and
     * optional intermediate DNS name.
     * This property may be left blank if the current ECS service does not need to advertise any
     * ports via Service Connect.
     */
    public fun services(services: List<ServiceConnectService>)

    /**
     * @param services The list of Services, including a port mapping, terse client alias, and
     * optional intermediate DNS name.
     * This property may be left blank if the current ECS service does not need to advertise any
     * ports via Service Connect.
     */
    public fun services(vararg services: ServiceConnectService)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ServiceConnectProps.Builder =
        software.amazon.awscdk.services.ecs.ServiceConnectProps.builder()

    /**
     * @param logDriver The log driver configuration to use for the Service Connect agent logs.
     */
    override fun logDriver(logDriver: LogDriver) {
      cdkBuilder.logDriver(logDriver.let(LogDriver::unwrap))
    }

    /**
     * @param namespace The cloudmap namespace to register this service into.
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * @param services The list of Services, including a port mapping, terse client alias, and
     * optional intermediate DNS name.
     * This property may be left blank if the current ECS service does not need to advertise any
     * ports via Service Connect.
     */
    override fun services(services: List<ServiceConnectService>) {
      cdkBuilder.services(services.map(ServiceConnectService::unwrap))
    }

    /**
     * @param services The list of Services, including a port mapping, terse client alias, and
     * optional intermediate DNS name.
     * This property may be left blank if the current ECS service does not need to advertise any
     * ports via Service Connect.
     */
    override fun services(vararg services: ServiceConnectService): Unit =
        services(services.toList())

    public fun build(): software.amazon.awscdk.services.ecs.ServiceConnectProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ServiceConnectProps,
  ) : CdkObject(cdkObject), ServiceConnectProps {
    /**
     * The log driver configuration to use for the Service Connect agent logs.
     *
     * Default: - none
     */
    override fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

    /**
     * The cloudmap namespace to register this service into.
     *
     * Default: the cloudmap namespace specified on the cluster.
     */
    override fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * The list of Services, including a port mapping, terse client alias, and optional intermediate
     * DNS name.
     *
     * This property may be left blank if the current ECS service does not need to advertise any
     * ports via Service Connect.
     *
     * Default: none
     */
    override fun services(): List<ServiceConnectService> =
        unwrap(this).getServices()?.map(ServiceConnectService::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceConnectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ServiceConnectProps):
        ServiceConnectProps = CdkObjectWrappers.wrap(cdkObject) as? ServiceConnectProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceConnectProps):
        software.amazon.awscdk.services.ecs.ServiceConnectProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.ServiceConnectProps
  }
}
