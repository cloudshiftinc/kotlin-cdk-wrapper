@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.IVirtualNode,
  ) : CdkObject(cdkObject), IVirtualNode {
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
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
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
     * Grants the given entity `appmesh:StreamAggregatedResources`.
     *
     * @param identity 
     */
    override fun grantStreamAggregatedResources(identity: IGrantable): Grant =
        unwrap(this).grantStreamAggregatedResources(identity.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * The Mesh which the VirtualNode belongs to.
     */
    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The Amazon Resource Name belonging to the VirtualNode.
     *
     * Set this value as the APPMESH_VIRTUAL_NODE_NAME environment variable for
     * your task group's Envoy proxy container in your task definition or pod
     * spec.
     */
    override fun virtualNodeArn(): String = unwrap(this).getVirtualNodeArn()

    /**
     * The name of the VirtualNode.
     */
    override fun virtualNodeName(): String = unwrap(this).getVirtualNodeName()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IVirtualNode): IVirtualNode
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVirtualNode): software.amazon.awscdk.services.appmesh.IVirtualNode
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.IVirtualNode
  }
}
