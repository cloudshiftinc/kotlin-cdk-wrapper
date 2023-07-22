@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ecs.ClusterAttributes
import software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration
import software.amazon.awscdk.services.servicediscovery.INamespace

@CdkDslMarker
public class ClusterAttributesDsl {
  private val cdkBuilder: ClusterAttributes.Builder = ClusterAttributes.builder()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * @param autoscalingGroup Autoscaling group added to the cluster if capacity is added.
   */
  public fun autoscalingGroup(autoscalingGroup: IAutoScalingGroup) {
    cdkBuilder.autoscalingGroup(autoscalingGroup)
  }

  /**
   * @param clusterArn The Amazon Resource Name (ARN) that identifies the cluster.
   */
  public fun clusterArn(clusterArn: String) {
    cdkBuilder.clusterArn(clusterArn)
  }

  /**
   * @param clusterName The name of the cluster. 
   */
  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  /**
   * @param defaultCloudMapNamespace The AWS Cloud Map namespace to associate with the cluster.
   */
  public fun defaultCloudMapNamespace(defaultCloudMapNamespace: INamespace) {
    cdkBuilder.defaultCloudMapNamespace(defaultCloudMapNamespace)
  }

  /**
   * @param executeCommandConfiguration The execute command configuration for the cluster.
   */
  public
      fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfigurationDsl.() -> Unit
      = {}) {
    val builder = ExecuteCommandConfigurationDsl()
    builder.apply(executeCommandConfiguration)
    cdkBuilder.executeCommandConfiguration(builder.build())
  }

  /**
   * @param executeCommandConfiguration The execute command configuration for the cluster.
   */
  public fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration) {
    cdkBuilder.executeCommandConfiguration(executeCommandConfiguration)
  }

  /**
   * @param hasEc2Capacity Specifies whether the cluster has EC2 instance capacity.
   */
  public fun hasEc2Capacity(hasEc2Capacity: Boolean) {
    cdkBuilder.hasEc2Capacity(hasEc2Capacity)
  }

  /**
   * @param securityGroups The security groups associated with the container instances registered to
   * the cluster.
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups The security groups associated with the container instances registered to
   * the cluster.
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * @param vpc The VPC associated with the cluster. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): ClusterAttributes {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
