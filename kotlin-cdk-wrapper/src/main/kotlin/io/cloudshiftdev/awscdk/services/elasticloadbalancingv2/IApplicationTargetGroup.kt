@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.Port
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A Target Group for Application Load Balancers.
 */
public interface IApplicationTargetGroup : ITargetGroup {
  /**
   * Add a load balancing target to this target group.
   *
   * @param targets 
   */
  public fun addTarget(targets: IApplicationLoadBalancerTarget)

  /**
   * All metrics available for this target group.
   */
  public fun metrics(): IApplicationTargetGroupMetrics

  /**
   * Register a connectable as a member of this target group.
   *
   * Don't call this directly. It will be called by load balancing targets.
   *
   * @param connectable 
   * @param portRange
   */
  public fun registerConnectable(connectable: IConnectable)

  /**
   * Register a connectable as a member of this target group.
   *
   * Don't call this directly. It will be called by load balancing targets.
   *
   * @param connectable 
   * @param portRange
   */
  public fun registerConnectable(connectable: IConnectable, portRange: Port)

  /**
   * Register a connectable as a member of this target group.
   *
   * Don't call this directly. It will be called by load balancing targets.
   *
   * @param connectable 
   * @param portRange
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bcc196a279cd8df29b10150b2d6fcd0fb653d88666d4c7b6871b5f67e18a087a")
  public fun registerConnectable(connectable: IConnectable, portRange: Port.Builder.() -> Unit)

  /**
   * Register a listener that is load balancing to this target group.
   *
   * Don't call this directly. It will be called by listeners.
   *
   * @param listener 
   * @param associatingConstruct
   */
  public fun registerListener(listener: IApplicationListener)

  /**
   * Register a listener that is load balancing to this target group.
   *
   * Don't call this directly. It will be called by listeners.
   *
   * @param listener 
   * @param associatingConstruct
   */
  public fun registerListener(listener: IApplicationListener, associatingConstruct: IConstruct)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup):
        IApplicationTargetGroup = CdkObjectWrappers.wrap(cdkObject) as IApplicationTargetGroup

    internal fun unwrap(wrapped: IApplicationTargetGroup):
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
  }
}
