package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.Port
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.IDependable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IApplicationTargetGroup : ITargetGroup {
  public fun addTarget(arg0: IApplicationLoadBalancerTarget)

  public fun metrics(): IApplicationTargetGroupMetrics

  public fun registerConnectable(arg0: IConnectable)

  public fun registerConnectable(arg0: IConnectable, arg1: Port)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bcc196a279cd8df29b10150b2d6fcd0fb653d88666d4c7b6871b5f67e18a087a")
  public fun registerConnectable(arg0: IConnectable, arg1: Port.Builder.() -> Unit)

  public fun registerListener(arg0: IApplicationListener)

  public fun registerListener(arg0: IApplicationListener, arg1: IConstruct)

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup,
  ) : IApplicationTargetGroup {
    override fun addTarget(arg0: IApplicationLoadBalancerTarget) {
      unwrap(this).addTarget(arg0.let(IApplicationLoadBalancerTarget::unwrap))
    }

    override fun loadBalancerArns(): String = unwrap(this).getLoadBalancerArns()

    override fun loadBalancerAttached(): IDependable =
        unwrap(this).getLoadBalancerAttached().let(IDependable::wrap)

    override fun metrics(): IApplicationTargetGroupMetrics =
        unwrap(this).getMetrics().let(IApplicationTargetGroupMetrics::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun registerConnectable(arg0: IConnectable) {
      unwrap(this).registerConnectable(arg0.let(IConnectable::unwrap))
    }

    override fun registerConnectable(arg0: IConnectable, arg1: Port) {
      unwrap(this).registerConnectable(arg0.let(IConnectable::unwrap), arg1.let(Port::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bcc196a279cd8df29b10150b2d6fcd0fb653d88666d4c7b6871b5f67e18a087a")
    override fun registerConnectable(arg0: IConnectable, arg1: Port.Builder.() -> Unit): Unit =
        registerConnectable(arg0, Port(arg1))

    override fun registerListener(arg0: IApplicationListener) {
      unwrap(this).registerListener(arg0.let(IApplicationListener::unwrap))
    }

    override fun registerListener(arg0: IApplicationListener, arg1: IConstruct) {
      unwrap(this).registerListener(arg0.let(IApplicationListener::unwrap),
          arg1.let(IConstruct::unwrap))
    }

    override fun targetGroupArn(): String = unwrap(this).getTargetGroupArn()

    override fun targetGroupName(): String = unwrap(this).getTargetGroupName()
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup):
        IApplicationTargetGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApplicationTargetGroup):
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup = (wrapped as
        Wrapper).cdkObject
  }
}
