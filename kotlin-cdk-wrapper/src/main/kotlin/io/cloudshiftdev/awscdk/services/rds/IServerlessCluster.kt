@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecretAttachmentTarget
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * Interface representing a serverless database cluster.
 */
public interface IServerlessCluster : IResource, IConnectable, ISecretAttachmentTarget {
  /**
   * The ARN of the cluster.
   */
  public fun clusterArn(): String

  /**
   * The endpoint to use for read/write operations.
   */
  public fun clusterEndpoint(): Endpoint

  /**
   * Identifier of the cluster.
   */
  public fun clusterIdentifier(): String

  /**
   * Endpoint to use for load-balanced read-only operations.
   */
  public fun clusterReadEndpoint(): Endpoint

  /**
   * Grant the given identity to access to the Data API.
   *
   * @param grantee The principal to grant access to. 
   */
  public fun grantDataApiAccess(grantee: IGrantable): Grant

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.IServerlessCluster,
  ) : CdkObject(cdkObject), IServerlessCluster {
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
     * Renders the target specifications.
     */
    override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
        unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

    /**
     * The ARN of the cluster.
     */
    override fun clusterArn(): String = unwrap(this).getClusterArn()

    /**
     * The endpoint to use for read/write operations.
     */
    override fun clusterEndpoint(): Endpoint = unwrap(this).getClusterEndpoint().let(Endpoint::wrap)

    /**
     * Identifier of the cluster.
     */
    override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

    /**
     * Endpoint to use for load-balanced read-only operations.
     */
    override fun clusterReadEndpoint(): Endpoint =
        unwrap(this).getClusterReadEndpoint().let(Endpoint::wrap)

    /**
     * The network connections associated with this resource.
     */
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

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
     * Grant the given identity to access to the Data API.
     *
     * @param grantee The principal to grant access to. 
     */
    override fun grantDataApiAccess(grantee: IGrantable): Grant =
        unwrap(this).grantDataApiAccess(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IServerlessCluster):
        IServerlessCluster = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IServerlessCluster):
        software.amazon.awscdk.services.rds.IServerlessCluster = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.IServerlessCluster
  }
}
