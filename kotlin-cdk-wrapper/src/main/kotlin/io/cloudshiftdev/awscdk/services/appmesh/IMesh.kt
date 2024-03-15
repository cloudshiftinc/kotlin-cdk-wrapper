@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IMesh : IResource {
  public fun addVirtualGateway(arg0: String): VirtualGateway

  public fun addVirtualGateway(arg0: String, arg1: VirtualGatewayBaseProps): VirtualGateway

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("806769f186eaec3fa9e3209acdf24765b05ef2369fd0cab34a25f9215b419f1a")
  public fun addVirtualGateway(arg0: String, arg1: VirtualGatewayBaseProps.Builder.() -> Unit):
      VirtualGateway

  public fun addVirtualNode(arg0: String): VirtualNode

  public fun addVirtualNode(arg0: String, arg1: VirtualNodeBaseProps): VirtualNode

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("22cc54ebf16a50a601a96aa1328e0f5a527ace6c6fde8555f4d2981b06f92ec2")
  public fun addVirtualNode(arg0: String, arg1: VirtualNodeBaseProps.Builder.() -> Unit):
      VirtualNode

  public fun addVirtualRouter(arg0: String): VirtualRouter

  public fun addVirtualRouter(arg0: String, arg1: VirtualRouterBaseProps): VirtualRouter

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ef76fc2c94e3105862487f46bac7bb438d623fe852d72b8a9b2f8e55302bff2")
  public fun addVirtualRouter(arg0: String, arg1: VirtualRouterBaseProps.Builder.() -> Unit):
      VirtualRouter

  public fun meshArn(): String

  public fun meshName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.IMesh,
  ) : CdkObject(cdkObject), IMesh {
    override fun addVirtualGateway(arg0: String): VirtualGateway =
        unwrap(this).addVirtualGateway(arg0).let(VirtualGateway::wrap)

    override fun addVirtualGateway(arg0: String, arg1: VirtualGatewayBaseProps): VirtualGateway =
        unwrap(this).addVirtualGateway(arg0,
        arg1.let(VirtualGatewayBaseProps::unwrap)).let(VirtualGateway::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("806769f186eaec3fa9e3209acdf24765b05ef2369fd0cab34a25f9215b419f1a")
    override fun addVirtualGateway(arg0: String, arg1: VirtualGatewayBaseProps.Builder.() -> Unit):
        VirtualGateway = addVirtualGateway(arg0, VirtualGatewayBaseProps(arg1))

    override fun addVirtualNode(arg0: String): VirtualNode =
        unwrap(this).addVirtualNode(arg0).let(VirtualNode::wrap)

    override fun addVirtualNode(arg0: String, arg1: VirtualNodeBaseProps): VirtualNode =
        unwrap(this).addVirtualNode(arg0,
        arg1.let(VirtualNodeBaseProps::unwrap)).let(VirtualNode::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22cc54ebf16a50a601a96aa1328e0f5a527ace6c6fde8555f4d2981b06f92ec2")
    override fun addVirtualNode(arg0: String, arg1: VirtualNodeBaseProps.Builder.() -> Unit):
        VirtualNode = addVirtualNode(arg0, VirtualNodeBaseProps(arg1))

    override fun addVirtualRouter(arg0: String): VirtualRouter =
        unwrap(this).addVirtualRouter(arg0).let(VirtualRouter::wrap)

    override fun addVirtualRouter(arg0: String, arg1: VirtualRouterBaseProps): VirtualRouter =
        unwrap(this).addVirtualRouter(arg0,
        arg1.let(VirtualRouterBaseProps::unwrap)).let(VirtualRouter::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ef76fc2c94e3105862487f46bac7bb438d623fe852d72b8a9b2f8e55302bff2")
    override fun addVirtualRouter(arg0: String, arg1: VirtualRouterBaseProps.Builder.() -> Unit):
        VirtualRouter = addVirtualRouter(arg0, VirtualRouterBaseProps(arg1))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun meshArn(): String = unwrap(this).getMeshArn()

    override fun meshName(): String = unwrap(this).getMeshName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IMesh): IMesh =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IMesh): software.amazon.awscdk.services.appmesh.IMesh = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.IMesh
  }
}
