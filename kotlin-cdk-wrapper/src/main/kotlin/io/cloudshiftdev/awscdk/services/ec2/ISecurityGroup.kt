@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ISecurityGroup : IResource, IPeer {
  public fun addEgressRule(arg0: IPeer, arg1: Port)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4bf89f5e640a8b7efb17409c9a88eefede4e96a9f59d45b102417c6495109e89")
  public fun addEgressRule(arg0: IPeer, arg1: Port.Builder.() -> Unit)

  public fun addEgressRule(
    arg0: IPeer,
    arg1: Port,
    arg2: String,
  )

  public fun addEgressRule(
    arg0: IPeer,
    arg1: Port,
    arg2: String,
    arg3: Boolean,
  )

  public fun addIngressRule(arg0: IPeer, arg1: Port)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d409b422c545699df421c29fe3c67d472d855aa96dc063ceafcf760d3ba5c249")
  public fun addIngressRule(arg0: IPeer, arg1: Port.Builder.() -> Unit)

  public fun addIngressRule(
    arg0: IPeer,
    arg1: Port,
    arg2: String,
  )

  public fun addIngressRule(
    arg0: IPeer,
    arg1: Port,
    arg2: String,
    arg3: Boolean,
  )

  public fun allowAllOutbound(): Boolean

  public fun securityGroupId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ISecurityGroup,
  ) : CdkObject(cdkObject), ISecurityGroup {
    override fun addEgressRule(arg0: IPeer, arg1: Port) {
      unwrap(this).addEgressRule(arg0.let(IPeer::unwrap), arg1.let(Port::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bf89f5e640a8b7efb17409c9a88eefede4e96a9f59d45b102417c6495109e89")
    override fun addEgressRule(arg0: IPeer, arg1: Port.Builder.() -> Unit): Unit =
        addEgressRule(arg0, Port(arg1))

    override fun addEgressRule(
      arg0: IPeer,
      arg1: Port,
      arg2: String,
    ) {
      unwrap(this).addEgressRule(arg0.let(IPeer::unwrap), arg1.let(Port::unwrap), arg2)
    }

    override fun addEgressRule(
      arg0: IPeer,
      arg1: Port,
      arg2: String,
      arg3: Boolean,
    ) {
      unwrap(this).addEgressRule(arg0.let(IPeer::unwrap), arg1.let(Port::unwrap), arg2, arg3)
    }

    override fun addIngressRule(arg0: IPeer, arg1: Port) {
      unwrap(this).addIngressRule(arg0.let(IPeer::unwrap), arg1.let(Port::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d409b422c545699df421c29fe3c67d472d855aa96dc063ceafcf760d3ba5c249")
    override fun addIngressRule(arg0: IPeer, arg1: Port.Builder.() -> Unit): Unit =
        addIngressRule(arg0, Port(arg1))

    override fun addIngressRule(
      arg0: IPeer,
      arg1: Port,
      arg2: String,
    ) {
      unwrap(this).addIngressRule(arg0.let(IPeer::unwrap), arg1.let(Port::unwrap), arg2)
    }

    override fun addIngressRule(
      arg0: IPeer,
      arg1: Port,
      arg2: String,
      arg3: Boolean,
    ) {
      unwrap(this).addIngressRule(arg0.let(IPeer::unwrap), arg1.let(Port::unwrap), arg2, arg3)
    }

    override fun allowAllOutbound(): Boolean = unwrap(this).getAllowAllOutbound()

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun canInlineRule(): Boolean = unwrap(this).getCanInlineRule()

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun securityGroupId(): String = unwrap(this).getSecurityGroupId()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun toEgressRuleConfig(): Any = unwrap(this).toEgressRuleConfig()

    override fun toIngressRuleConfig(): Any = unwrap(this).toIngressRuleConfig()

    override fun uniqueId(): String = unwrap(this).getUniqueId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ISecurityGroup): ISecurityGroup
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISecurityGroup): software.amazon.awscdk.services.ec2.ISecurityGroup
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ISecurityGroup
  }
}
