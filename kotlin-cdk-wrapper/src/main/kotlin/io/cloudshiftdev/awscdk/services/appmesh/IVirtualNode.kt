@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String

/**
 * Interface which all VirtualNode based classes must implement.
 */
public interface IVirtualNode : IResource {
  /**
   * Grants the given entity `appmesh:StreamAggregatedResources`.
   *
   * @param identity 
   */
  public fun grantStreamAggregatedResources(identity: IGrantable): Grant

  /**
   * The Mesh which the VirtualNode belongs to.
   */
  public fun mesh(): IMesh

  /**
   * The Amazon Resource Name belonging to the VirtualNode.
   *
   * Set this value as the APPMESH_VIRTUAL_NODE_NAME environment variable for
   * your task group's Envoy proxy container in your task definition or pod
   * spec.
   */
  public fun virtualNodeArn(): String

  /**
   * The name of the VirtualNode.
   */
  public fun virtualNodeName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IVirtualNode): IVirtualNode
        = CdkObjectWrappers.wrap(cdkObject) as IVirtualNode

    internal fun unwrap(wrapped: IVirtualNode): software.amazon.awscdk.services.appmesh.IVirtualNode
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.IVirtualNode
  }
}
