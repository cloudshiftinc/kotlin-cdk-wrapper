@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.servicediscovery.DnsRecordType
import io.cloudshiftdev.awscdk.services.servicediscovery.INamespace
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * The options to enabling AWS Cloud Map for an Amazon ECS service.
 *
 * Example:
 *
 * ```
 * TaskDefinition taskDefinition;
 * Cluster cluster;
 * Ec2Service service = Ec2Service.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .cloudMapOptions(CloudMapOptions.builder()
 * // Create A records - useful for AWSVPC network mode.
 * .dnsRecordType(DnsRecordType.A)
 * .build())
 * .build();
 * ```
 */
public interface CloudMapOptions {
  /**
   * The service discovery namespace for the Cloud Map service to attach to the ECS service.
   *
   * Default: - the defaultCloudMapNamespace associated to the cluster
   */
  public fun cloudMapNamespace(): INamespace? =
      unwrap(this).getCloudMapNamespace()?.let(INamespace::wrap)

  /**
   * The container to point to for a SRV record.
   *
   * Default: - the task definition's default container
   */
  public fun container(): ContainerDefinition? =
      unwrap(this).getContainer()?.let(ContainerDefinition::wrap)

  /**
   * The port to point to for a SRV record.
   *
   * Default: - the default port of the task definition's default container
   */
  public fun containerPort(): Number? = unwrap(this).getContainerPort()

  /**
   * The DNS record type that you want AWS Cloud Map to create.
   *
   * The supported record types are A or SRV.
   *
   * Default: - DnsRecordType.A if TaskDefinition.networkMode = AWS_VPC, otherwise DnsRecordType.SRV
   */
  public fun dnsRecordType(): DnsRecordType? =
      unwrap(this).getDnsRecordType()?.let(DnsRecordType::wrap)

  /**
   * The amount of time that you want DNS resolvers to cache the settings for this record.
   *
   * Default: Duration.minutes(1)
   */
  public fun dnsTtl(): Duration? = unwrap(this).getDnsTtl()?.let(Duration::wrap)

  /**
   * The number of 30-second intervals that you want Cloud Map to wait after receiving an
   * UpdateInstanceCustomHealthStatus request before it changes the health status of a service
   * instance.
   *
   * NOTE: This is used for HealthCheckCustomConfig
   */
  public fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

  /**
   * The name of the Cloud Map service to attach to the ECS service.
   *
   * Default: CloudFormation-generated name
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A builder for [CloudMapOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cloudMapNamespace The service discovery namespace for the Cloud Map service to attach
     * to the ECS service.
     */
    public fun cloudMapNamespace(cloudMapNamespace: INamespace)

    /**
     * @param container The container to point to for a SRV record.
     */
    public fun container(container: ContainerDefinition)

    /**
     * @param containerPort The port to point to for a SRV record.
     */
    public fun containerPort(containerPort: Number)

    /**
     * @param dnsRecordType The DNS record type that you want AWS Cloud Map to create.
     * The supported record types are A or SRV.
     */
    public fun dnsRecordType(dnsRecordType: DnsRecordType)

    /**
     * @param dnsTtl The amount of time that you want DNS resolvers to cache the settings for this
     * record.
     */
    public fun dnsTtl(dnsTtl: Duration)

    /**
     * @param failureThreshold The number of 30-second intervals that you want Cloud Map to wait
     * after receiving an UpdateInstanceCustomHealthStatus request before it changes the health status
     * of a service instance.
     * NOTE: This is used for HealthCheckCustomConfig
     */
    public fun failureThreshold(failureThreshold: Number)

    /**
     * @param name The name of the Cloud Map service to attach to the ECS service.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CloudMapOptions.Builder =
        software.amazon.awscdk.services.ecs.CloudMapOptions.builder()

    /**
     * @param cloudMapNamespace The service discovery namespace for the Cloud Map service to attach
     * to the ECS service.
     */
    override fun cloudMapNamespace(cloudMapNamespace: INamespace) {
      cdkBuilder.cloudMapNamespace(cloudMapNamespace.let(INamespace.Companion::unwrap))
    }

    /**
     * @param container The container to point to for a SRV record.
     */
    override fun container(container: ContainerDefinition) {
      cdkBuilder.container(container.let(ContainerDefinition.Companion::unwrap))
    }

    /**
     * @param containerPort The port to point to for a SRV record.
     */
    override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    /**
     * @param dnsRecordType The DNS record type that you want AWS Cloud Map to create.
     * The supported record types are A or SRV.
     */
    override fun dnsRecordType(dnsRecordType: DnsRecordType) {
      cdkBuilder.dnsRecordType(dnsRecordType.let(DnsRecordType.Companion::unwrap))
    }

    /**
     * @param dnsTtl The amount of time that you want DNS resolvers to cache the settings for this
     * record.
     */
    override fun dnsTtl(dnsTtl: Duration) {
      cdkBuilder.dnsTtl(dnsTtl.let(Duration.Companion::unwrap))
    }

    /**
     * @param failureThreshold The number of 30-second intervals that you want Cloud Map to wait
     * after receiving an UpdateInstanceCustomHealthStatus request before it changes the health status
     * of a service instance.
     * NOTE: This is used for HealthCheckCustomConfig
     */
    override fun failureThreshold(failureThreshold: Number) {
      cdkBuilder.failureThreshold(failureThreshold)
    }

    /**
     * @param name The name of the Cloud Map service to attach to the ECS service.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CloudMapOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.CloudMapOptions,
  ) : CdkObject(cdkObject), CloudMapOptions {
    /**
     * The service discovery namespace for the Cloud Map service to attach to the ECS service.
     *
     * Default: - the defaultCloudMapNamespace associated to the cluster
     */
    override fun cloudMapNamespace(): INamespace? =
        unwrap(this).getCloudMapNamespace()?.let(INamespace::wrap)

    /**
     * The container to point to for a SRV record.
     *
     * Default: - the task definition's default container
     */
    override fun container(): ContainerDefinition? =
        unwrap(this).getContainer()?.let(ContainerDefinition::wrap)

    /**
     * The port to point to for a SRV record.
     *
     * Default: - the default port of the task definition's default container
     */
    override fun containerPort(): Number? = unwrap(this).getContainerPort()

    /**
     * The DNS record type that you want AWS Cloud Map to create.
     *
     * The supported record types are A or SRV.
     *
     * Default: - DnsRecordType.A if TaskDefinition.networkMode = AWS_VPC, otherwise
     * DnsRecordType.SRV
     */
    override fun dnsRecordType(): DnsRecordType? =
        unwrap(this).getDnsRecordType()?.let(DnsRecordType::wrap)

    /**
     * The amount of time that you want DNS resolvers to cache the settings for this record.
     *
     * Default: Duration.minutes(1)
     */
    override fun dnsTtl(): Duration? = unwrap(this).getDnsTtl()?.let(Duration::wrap)

    /**
     * The number of 30-second intervals that you want Cloud Map to wait after receiving an
     * UpdateInstanceCustomHealthStatus request before it changes the health status of a service
     * instance.
     *
     * NOTE: This is used for HealthCheckCustomConfig
     */
    override fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

    /**
     * The name of the Cloud Map service to attach to the ECS service.
     *
     * Default: CloudFormation-generated name
     */
    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudMapOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CloudMapOptions):
        CloudMapOptions = CdkObjectWrappers.wrap(cdkObject) as? CloudMapOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudMapOptions):
        software.amazon.awscdk.services.ecs.CloudMapOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.CloudMapOptions
  }
}
