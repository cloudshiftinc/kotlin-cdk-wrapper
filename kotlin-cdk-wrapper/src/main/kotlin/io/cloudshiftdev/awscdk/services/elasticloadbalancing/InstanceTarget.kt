@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.Instance

/**
 * An EC2 instance that is the target for load balancing.
 *
 * Example:
 *
 * ```
 * IVpc vpc;
 * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .build();
 * // instance to add as the target for load balancer.
 * Instance instance = Instance.Builder.create(this, "targetInstance")
 * .vpc(vpc)
 * .instanceType(InstanceType.of(InstanceClass.BURSTABLE2, InstanceSize.MICRO))
 * .machineImage(AmazonLinuxImage.Builder.create().generation(AmazonLinuxGeneration.AMAZON_LINUX_2).build())
 * .build();
 * lb.addTarget(new InstanceTarget(instance));
 * ```
 */
public open class InstanceTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancing.InstanceTarget,
) : CdkObject(cdkObject), ILoadBalancerTarget {
  public constructor(instance: Instance) :
      this(software.amazon.awscdk.services.elasticloadbalancing.InstanceTarget(instance.let(Instance::unwrap))
  )

  /**
   * Attach load-balanced target to a classic ELB.
   *
   * @param loadBalancer 
   */
  public override fun attachToClassicLb(loadBalancer: LoadBalancer) {
    unwrap(this).attachToClassicLB(loadBalancer.let(LoadBalancer::unwrap))
  }

  /**
   * The network connections associated with this resource.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * Instance to register to.
   */
  public open fun instance(): Instance = unwrap(this).getInstance().let(Instance::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.InstanceTarget):
        InstanceTarget = InstanceTarget(cdkObject)

    internal fun unwrap(wrapped: InstanceTarget):
        software.amazon.awscdk.services.elasticloadbalancing.InstanceTarget = wrapped.cdkObject
  }
}
