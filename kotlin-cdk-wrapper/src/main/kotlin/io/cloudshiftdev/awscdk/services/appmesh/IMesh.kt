@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IMesh): IMesh =
        CdkObjectWrappers.wrap(cdkObject) as IMesh

    internal fun unwrap(wrapped: IMesh): software.amazon.awscdk.services.appmesh.IMesh = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.IMesh
  }
}
