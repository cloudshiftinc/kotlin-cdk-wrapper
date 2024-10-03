@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining an ECS target.
 *
 * The port mapping for it must already have been created through addPortMapping().
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * Vpc vpc;
 * Ec2Service service = Ec2Service.Builder.create(this,
 * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
 * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB").vpc(vpc).build();
 * lb.addListener(LoadBalancerListener.builder().externalPort(80).build());
 * lb.addTarget(service.loadBalancerTarget(LoadBalancerTargetOptions.builder()
 * .containerName("MyContainer")
 * .containerPort(80)
 * .build()));
 * ```
 */
public interface LoadBalancerTargetOptions {
  /**
   * The name of the container.
   */
  public fun containerName(): String

  /**
   * The port number of the container.
   *
   * Only applicable when using application/network load balancers.
   *
   * Default: - Container port of the first added port mapping.
   */
  public fun containerPort(): Number? = unwrap(this).getContainerPort()

  /**
   * The protocol used for the port mapping.
   *
   * Only applicable when using application load balancers.
   *
   * Default: Protocol.TCP
   */
  public fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

  /**
   * A builder for [LoadBalancerTargetOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerName The name of the container. 
     */
    public fun containerName(containerName: String)

    /**
     * @param containerPort The port number of the container.
     * Only applicable when using application/network load balancers.
     */
    public fun containerPort(containerPort: Number)

    /**
     * @param protocol The protocol used for the port mapping.
     * Only applicable when using application load balancers.
     */
    public fun protocol(protocol: Protocol)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions.Builder =
        software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions.builder()

    /**
     * @param containerName The name of the container. 
     */
    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    /**
     * @param containerPort The port number of the container.
     * Only applicable when using application/network load balancers.
     */
    override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    /**
     * @param protocol The protocol used for the port mapping.
     * Only applicable when using application load balancers.
     */
    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions,
  ) : CdkObject(cdkObject),
      LoadBalancerTargetOptions {
    /**
     * The name of the container.
     */
    override fun containerName(): String = unwrap(this).getContainerName()

    /**
     * The port number of the container.
     *
     * Only applicable when using application/network load balancers.
     *
     * Default: - Container port of the first added port mapping.
     */
    override fun containerPort(): Number? = unwrap(this).getContainerPort()

    /**
     * The protocol used for the port mapping.
     *
     * Only applicable when using application load balancers.
     *
     * Default: Protocol.TCP
     */
    override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerTargetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions):
        LoadBalancerTargetOptions = CdkObjectWrappers.wrap(cdkObject) as? LoadBalancerTargetOptions
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerTargetOptions):
        software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions
  }
}
