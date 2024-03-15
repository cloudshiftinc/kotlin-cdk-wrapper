@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * Interface for AppSync Source Api Association.
 */
public interface ISourceApiAssociation : IResource {
  /**
   * The association arn.
   */
  public fun associationArn(): String

  /**
   * The association id.
   */
  public fun associationId(): String

  /**
   * The merged api in the association.
   */
  public fun mergedApi(): IGraphqlApi

  /**
   * The source api in the association.
   */
  public fun sourceApi(): IGraphqlApi

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.ISourceApiAssociation,
  ) : CdkObject(cdkObject), ISourceApiAssociation {
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
     * The association arn.
     */
    override fun associationArn(): String = unwrap(this).getAssociationArn()

    /**
     * The association id.
     */
    override fun associationId(): String = unwrap(this).getAssociationId()

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
     * The merged api in the association.
     */
    override fun mergedApi(): IGraphqlApi = unwrap(this).getMergedApi().let(IGraphqlApi::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The source api in the association.
     */
    override fun sourceApi(): IGraphqlApi = unwrap(this).getSourceApi().let(IGraphqlApi::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ISourceApiAssociation):
        ISourceApiAssociation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISourceApiAssociation):
        software.amazon.awscdk.services.appsync.ISourceApiAssociation = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.ISourceApiAssociation
  }
}
