@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.Port
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.IDependable
import io.cloudshiftdev.constructs.Node
import kotlin.String
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

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup,
  ) : CdkObject(cdkObject), IApplicationTargetGroup {
    /**
     * Add a load balancing target to this target group.
     *
     * @param targets 
     */
    override fun addTarget(targets: IApplicationLoadBalancerTarget) {
      unwrap(this).addTarget(targets.let(IApplicationLoadBalancerTarget::unwrap))
    }

    /**
     * A token representing a list of ARNs of the load balancers that route traffic to this target
     * group.
     */
    override fun loadBalancerArns(): String = unwrap(this).getLoadBalancerArns()

    /**
     * Return an object to depend on the listeners added to this target group.
     */
    override fun loadBalancerAttached(): IDependable =
        unwrap(this).getLoadBalancerAttached().let(IDependable::wrap)

    /**
     * All metrics available for this target group.
     */
    override fun metrics(): IApplicationTargetGroupMetrics =
        unwrap(this).getMetrics().let(IApplicationTargetGroupMetrics::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * Register a connectable as a member of this target group.
     *
     * Don't call this directly. It will be called by load balancing targets.
     *
     * @param connectable 
     * @param portRange
     */
    override fun registerConnectable(connectable: IConnectable) {
      unwrap(this).registerConnectable(connectable.let(IConnectable::unwrap))
    }

    /**
     * Register a connectable as a member of this target group.
     *
     * Don't call this directly. It will be called by load balancing targets.
     *
     * @param connectable 
     * @param portRange
     */
    override fun registerConnectable(connectable: IConnectable, portRange: Port) {
      unwrap(this).registerConnectable(connectable.let(IConnectable::unwrap),
          portRange.let(Port::unwrap))
    }

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
    override fun registerConnectable(connectable: IConnectable, portRange: Port.Builder.() -> Unit):
        Unit = registerConnectable(connectable, Port(portRange))

    /**
     * Register a listener that is load balancing to this target group.
     *
     * Don't call this directly. It will be called by listeners.
     *
     * @param listener 
     * @param associatingConstruct
     */
    override fun registerListener(listener: IApplicationListener) {
      unwrap(this).registerListener(listener.let(IApplicationListener::unwrap))
    }

    /**
     * Register a listener that is load balancing to this target group.
     *
     * Don't call this directly. It will be called by listeners.
     *
     * @param listener 
     * @param associatingConstruct
     */
    override fun registerListener(listener: IApplicationListener,
        associatingConstruct: IConstruct) {
      unwrap(this).registerListener(listener.let(IApplicationListener::unwrap),
          associatingConstruct.let(IConstruct::unwrap))
    }

    /**
     * ARN of the target group.
     */
    override fun targetGroupArn(): String = unwrap(this).getTargetGroupArn()

    /**
     * The name of the target group.
     */
    override fun targetGroupName(): String = unwrap(this).getTargetGroupName()
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup):
        IApplicationTargetGroup = CdkObjectWrappers.wrap(cdkObject) as? IApplicationTargetGroup ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApplicationTargetGroup):
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
  }
}
