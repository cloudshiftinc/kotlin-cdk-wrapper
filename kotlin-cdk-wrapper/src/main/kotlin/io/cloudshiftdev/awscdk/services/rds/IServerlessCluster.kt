@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecretAttachmentTarget
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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IServerlessCluster):
        IServerlessCluster = CdkObjectWrappers.wrap(cdkObject) as IServerlessCluster

    internal fun unwrap(wrapped: IServerlessCluster):
        software.amazon.awscdk.services.rds.IServerlessCluster = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.IServerlessCluster
  }
}
