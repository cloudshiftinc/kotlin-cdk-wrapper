@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.servicediscovery.INamespace
import kotlin.Boolean
import kotlin.String

/**
 * A regional grouping of one or more container instances on which you can run tasks and services.
 */
public interface ICluster : IResource {
  /**
   * The autoscaling group added to the cluster if capacity is associated to the cluster.
   */
  public fun autoscalingGroup(): IAutoScalingGroup? =
      unwrap(this).getAutoscalingGroup()?.let(IAutoScalingGroup::wrap)

  /**
   * The Amazon Resource Name (ARN) that identifies the cluster.
   */
  public fun clusterArn(): String

  /**
   * The name of the cluster.
   */
  public fun clusterName(): String

  /**
   * Manage the allowed network connections for the cluster with Security Groups.
   */
  public fun connections(): Connections

  /**
   * The AWS Cloud Map namespace to associate with the cluster.
   */
  public fun defaultCloudMapNamespace(): INamespace? =
      unwrap(this).getDefaultCloudMapNamespace()?.let(INamespace::wrap)

  /**
   * The execute command configuration for the cluster.
   */
  public fun executeCommandConfiguration(): ExecuteCommandConfiguration? =
      unwrap(this).getExecuteCommandConfiguration()?.let(ExecuteCommandConfiguration::wrap)

  /**
   * Specifies whether the cluster has EC2 instance capacity.
   */
  public fun hasEc2Capacity(): Boolean

  /**
   * The VPC associated with the cluster.
   */
  public fun vpc(): IVpc

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ICluster): ICluster =
        CdkObjectWrappers.wrap(cdkObject) as ICluster

    internal fun unwrap(wrapped: ICluster): software.amazon.awscdk.services.ecs.ICluster = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ICluster
  }
}
