@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.Port
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IApplicationListener : IListener, IConnectable {
  public fun addAction(arg0: String, arg1: AddApplicationActionProps)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38982a24904e19a27775083a0236be2eab0ffadce58e1eb48572062d8567e700")
  public fun addAction(arg0: String, arg1: AddApplicationActionProps.Builder.() -> Unit)

  public fun addCertificates(arg0: String, arg1: List<IListenerCertificate>)

  public fun addTargetGroups(arg0: String, arg1: AddApplicationTargetGroupsProps)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("23d206697af6cd2df80791ed22c62995c4f5c61f025a8e8fccb2df80290df232")
  public fun addTargetGroups(arg0: String, arg1: AddApplicationTargetGroupsProps.Builder.() -> Unit)

  public fun addTargets(arg0: String, arg1: AddApplicationTargetsProps): ApplicationTargetGroup

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("65353b2aaa4d44b3413ee899b6257e24f21c3f8adbdf472376980f2c10a0a327")
  public fun addTargets(arg0: String, arg1: AddApplicationTargetsProps.Builder.() -> Unit):
      ApplicationTargetGroup

  public fun registerConnectable(arg0: IConnectable, arg1: Port)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bcc196a279cd8df29b10150b2d6fcd0fb653d88666d4c7b6871b5f67e18a087a")
  public fun registerConnectable(arg0: IConnectable, arg1: Port.Builder.() -> Unit)

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener,
  ) : CdkObject(cdkObject), IApplicationListener {
    override fun addAction(arg0: String, arg1: AddApplicationActionProps) {
      unwrap(this).addAction(arg0, arg1.let(AddApplicationActionProps::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38982a24904e19a27775083a0236be2eab0ffadce58e1eb48572062d8567e700")
    override fun addAction(arg0: String, arg1: AddApplicationActionProps.Builder.() -> Unit): Unit =
        addAction(arg0, AddApplicationActionProps(arg1))

    override fun addCertificates(arg0: String, arg1: List<IListenerCertificate>) {
      unwrap(this).addCertificates(arg0, arg1.map(IListenerCertificate::unwrap))
    }

    override fun addTargetGroups(arg0: String, arg1: AddApplicationTargetGroupsProps) {
      unwrap(this).addTargetGroups(arg0, arg1.let(AddApplicationTargetGroupsProps::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23d206697af6cd2df80791ed22c62995c4f5c61f025a8e8fccb2df80290df232")
    override fun addTargetGroups(arg0: String,
        arg1: AddApplicationTargetGroupsProps.Builder.() -> Unit): Unit = addTargetGroups(arg0,
        AddApplicationTargetGroupsProps(arg1))

    override fun addTargets(arg0: String, arg1: AddApplicationTargetsProps): ApplicationTargetGroup
        = unwrap(this).addTargets(arg0,
        arg1.let(AddApplicationTargetsProps::unwrap)).let(ApplicationTargetGroup::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65353b2aaa4d44b3413ee899b6257e24f21c3f8adbdf472376980f2c10a0a327")
    override fun addTargets(arg0: String, arg1: AddApplicationTargetsProps.Builder.() -> Unit):
        ApplicationTargetGroup = addTargets(arg0, AddApplicationTargetsProps(arg1))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun listenerArn(): String = unwrap(this).getListenerArn()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun registerConnectable(arg0: IConnectable, arg1: Port) {
      unwrap(this).registerConnectable(arg0.let(IConnectable::unwrap), arg1.let(Port::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bcc196a279cd8df29b10150b2d6fcd0fb653d88666d4c7b6871b5f67e18a087a")
    override fun registerConnectable(arg0: IConnectable, arg1: Port.Builder.() -> Unit): Unit =
        registerConnectable(arg0, Port(arg1))

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener):
        IApplicationListener = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApplicationListener):
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener
  }
}
