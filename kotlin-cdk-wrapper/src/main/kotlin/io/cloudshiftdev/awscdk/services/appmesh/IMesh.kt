@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface which all Mesh based classes MUST implement.
 */
public interface IMesh : IResource {
  /**
   * Creates a new VirtualGateway in this Mesh.
   *
   * Note that the Gateway is created in the same Stack that this Mesh belongs to,
   * which might be different than the current stack.
   *
   * @param id 
   * @param props
   */
  public fun addVirtualGateway(id: String): VirtualGateway

  /**
   * Creates a new VirtualGateway in this Mesh.
   *
   * Note that the Gateway is created in the same Stack that this Mesh belongs to,
   * which might be different than the current stack.
   *
   * @param id 
   * @param props
   */
  public fun addVirtualGateway(id: String, props: VirtualGatewayBaseProps): VirtualGateway

  /**
   * Creates a new VirtualGateway in this Mesh.
   *
   * Note that the Gateway is created in the same Stack that this Mesh belongs to,
   * which might be different than the current stack.
   *
   * @param id 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("806769f186eaec3fa9e3209acdf24765b05ef2369fd0cab34a25f9215b419f1a")
  public fun addVirtualGateway(id: String, props: VirtualGatewayBaseProps.Builder.() -> Unit):
      VirtualGateway

  /**
   * Creates a new VirtualNode in this Mesh.
   *
   * Note that the Node is created in the same Stack that this Mesh belongs to,
   * which might be different than the current stack.
   *
   * @param id 
   * @param props
   */
  public fun addVirtualNode(id: String): VirtualNode

  /**
   * Creates a new VirtualNode in this Mesh.
   *
   * Note that the Node is created in the same Stack that this Mesh belongs to,
   * which might be different than the current stack.
   *
   * @param id 
   * @param props
   */
  public fun addVirtualNode(id: String, props: VirtualNodeBaseProps): VirtualNode

  /**
   * Creates a new VirtualNode in this Mesh.
   *
   * Note that the Node is created in the same Stack that this Mesh belongs to,
   * which might be different than the current stack.
   *
   * @param id 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("22cc54ebf16a50a601a96aa1328e0f5a527ace6c6fde8555f4d2981b06f92ec2")
  public fun addVirtualNode(id: String, props: VirtualNodeBaseProps.Builder.() -> Unit): VirtualNode

  /**
   * Creates a new VirtualRouter in this Mesh.
   *
   * Note that the Router is created in the same Stack that this Mesh belongs to,
   * which might be different than the current stack.
   *
   * @param id 
   * @param props
   */
  public fun addVirtualRouter(id: String): VirtualRouter

  /**
   * Creates a new VirtualRouter in this Mesh.
   *
   * Note that the Router is created in the same Stack that this Mesh belongs to,
   * which might be different than the current stack.
   *
   * @param id 
   * @param props
   */
  public fun addVirtualRouter(id: String, props: VirtualRouterBaseProps): VirtualRouter

  /**
   * Creates a new VirtualRouter in this Mesh.
   *
   * Note that the Router is created in the same Stack that this Mesh belongs to,
   * which might be different than the current stack.
   *
   * @param id 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ef76fc2c94e3105862487f46bac7bb438d623fe852d72b8a9b2f8e55302bff2")
  public fun addVirtualRouter(id: String, props: VirtualRouterBaseProps.Builder.() -> Unit):
      VirtualRouter

  /**
   * The Amazon Resource Name (ARN) of the AppMesh mesh.
   */
  public fun meshArn(): String

  /**
   * The name of the AppMesh mesh.
   */
  public fun meshName(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.IMesh,
  ) : CdkObject(cdkObject), IMesh {
    /**
     * Creates a new VirtualGateway in this Mesh.
     *
     * Note that the Gateway is created in the same Stack that this Mesh belongs to,
     * which might be different than the current stack.
     *
     * @param id 
     * @param props
     */
    override fun addVirtualGateway(id: String): VirtualGateway =
        unwrap(this).addVirtualGateway(id).let(VirtualGateway::wrap)

    /**
     * Creates a new VirtualGateway in this Mesh.
     *
     * Note that the Gateway is created in the same Stack that this Mesh belongs to,
     * which might be different than the current stack.
     *
     * @param id 
     * @param props
     */
    override fun addVirtualGateway(id: String, props: VirtualGatewayBaseProps): VirtualGateway =
        unwrap(this).addVirtualGateway(id,
        props.let(VirtualGatewayBaseProps.Companion::unwrap)).let(VirtualGateway::wrap)

    /**
     * Creates a new VirtualGateway in this Mesh.
     *
     * Note that the Gateway is created in the same Stack that this Mesh belongs to,
     * which might be different than the current stack.
     *
     * @param id 
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("806769f186eaec3fa9e3209acdf24765b05ef2369fd0cab34a25f9215b419f1a")
    override fun addVirtualGateway(id: String, props: VirtualGatewayBaseProps.Builder.() -> Unit):
        VirtualGateway = addVirtualGateway(id, VirtualGatewayBaseProps(props))

    /**
     * Creates a new VirtualNode in this Mesh.
     *
     * Note that the Node is created in the same Stack that this Mesh belongs to,
     * which might be different than the current stack.
     *
     * @param id 
     * @param props
     */
    override fun addVirtualNode(id: String): VirtualNode =
        unwrap(this).addVirtualNode(id).let(VirtualNode::wrap)

    /**
     * Creates a new VirtualNode in this Mesh.
     *
     * Note that the Node is created in the same Stack that this Mesh belongs to,
     * which might be different than the current stack.
     *
     * @param id 
     * @param props
     */
    override fun addVirtualNode(id: String, props: VirtualNodeBaseProps): VirtualNode =
        unwrap(this).addVirtualNode(id,
        props.let(VirtualNodeBaseProps.Companion::unwrap)).let(VirtualNode::wrap)

    /**
     * Creates a new VirtualNode in this Mesh.
     *
     * Note that the Node is created in the same Stack that this Mesh belongs to,
     * which might be different than the current stack.
     *
     * @param id 
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22cc54ebf16a50a601a96aa1328e0f5a527ace6c6fde8555f4d2981b06f92ec2")
    override fun addVirtualNode(id: String, props: VirtualNodeBaseProps.Builder.() -> Unit):
        VirtualNode = addVirtualNode(id, VirtualNodeBaseProps(props))

    /**
     * Creates a new VirtualRouter in this Mesh.
     *
     * Note that the Router is created in the same Stack that this Mesh belongs to,
     * which might be different than the current stack.
     *
     * @param id 
     * @param props
     */
    override fun addVirtualRouter(id: String): VirtualRouter =
        unwrap(this).addVirtualRouter(id).let(VirtualRouter::wrap)

    /**
     * Creates a new VirtualRouter in this Mesh.
     *
     * Note that the Router is created in the same Stack that this Mesh belongs to,
     * which might be different than the current stack.
     *
     * @param id 
     * @param props
     */
    override fun addVirtualRouter(id: String, props: VirtualRouterBaseProps): VirtualRouter =
        unwrap(this).addVirtualRouter(id,
        props.let(VirtualRouterBaseProps.Companion::unwrap)).let(VirtualRouter::wrap)

    /**
     * Creates a new VirtualRouter in this Mesh.
     *
     * Note that the Router is created in the same Stack that this Mesh belongs to,
     * which might be different than the current stack.
     *
     * @param id 
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ef76fc2c94e3105862487f46bac7bb438d623fe852d72b8a9b2f8e55302bff2")
    override fun addVirtualRouter(id: String, props: VirtualRouterBaseProps.Builder.() -> Unit):
        VirtualRouter = addVirtualRouter(id, VirtualRouterBaseProps(props))

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * The Amazon Resource Name (ARN) of the AppMesh mesh.
     */
    override fun meshArn(): String = unwrap(this).getMeshArn()

    /**
     * The name of the AppMesh mesh.
     */
    override fun meshName(): String = unwrap(this).getMeshName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IMesh): IMesh =
        CdkObjectWrappers.wrap(cdkObject) as? IMesh ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IMesh): software.amazon.awscdk.services.appmesh.IMesh = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.IMesh
  }
}
