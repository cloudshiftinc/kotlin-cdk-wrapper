@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecretAttachmentTarget
import kotlin.String
import kotlin.collections.List

/**
 * Create a clustered database with a given number of instances.
 */
public interface IDatabaseCluster : IResource, IConnectable, ISecretAttachmentTarget {
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
   * Endpoints which address each individual replica.
   */
  public fun instanceEndpoints(): List<Endpoint>

  /**
   * Identifiers of the replicas.
   */
  public fun instanceIdentifiers(): List<String>

  /**
   * The security group for this database cluster.
   */
  public fun securityGroupId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.IDatabaseCluster):
        IDatabaseCluster = CdkObjectWrappers.wrap(cdkObject) as IDatabaseCluster

    internal fun unwrap(wrapped: IDatabaseCluster):
        software.amazon.awscdk.services.docdb.IDatabaseCluster = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.docdb.IDatabaseCluster
  }
}
