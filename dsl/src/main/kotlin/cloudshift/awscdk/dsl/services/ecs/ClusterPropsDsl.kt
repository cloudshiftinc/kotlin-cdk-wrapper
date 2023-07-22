@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ecs.AddCapacityOptions
import software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions
import software.amazon.awscdk.services.ecs.ClusterProps
import software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration

@CdkDslMarker
public class ClusterPropsDsl {
  private val cdkBuilder: ClusterProps.Builder = ClusterProps.builder()

  /**
   * @param capacity The ec2 capacity to add to the cluster.
   */
  public fun capacity(capacity: AddCapacityOptionsDsl.() -> Unit = {}) {
    val builder = AddCapacityOptionsDsl()
    builder.apply(capacity)
    cdkBuilder.capacity(builder.build())
  }

  /**
   * @param capacity The ec2 capacity to add to the cluster.
   */
  public fun capacity(capacity: AddCapacityOptions) {
    cdkBuilder.capacity(capacity)
  }

  /**
   * @param clusterName The name for the cluster.
   */
  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  /**
   * @param containerInsights If true CloudWatch Container Insights will be enabled for the cluster.
   */
  public fun containerInsights(containerInsights: Boolean) {
    cdkBuilder.containerInsights(containerInsights)
  }

  /**
   * @param defaultCloudMapNamespace The service discovery namespace created in this cluster.
   */
  public
      fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptionsDsl.() -> Unit
      = {}) {
    val builder = CloudMapNamespaceOptionsDsl()
    builder.apply(defaultCloudMapNamespace)
    cdkBuilder.defaultCloudMapNamespace(builder.build())
  }

  /**
   * @param defaultCloudMapNamespace The service discovery namespace created in this cluster.
   */
  public fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions) {
    cdkBuilder.defaultCloudMapNamespace(defaultCloudMapNamespace)
  }

  /**
   * @param enableFargateCapacityProviders Whether to enable Fargate Capacity Providers.
   */
  public fun enableFargateCapacityProviders(enableFargateCapacityProviders: Boolean) {
    cdkBuilder.enableFargateCapacityProviders(enableFargateCapacityProviders)
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
   * @param vpc The VPC where your ECS instances will be running or your ENIs will be deployed.
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): ClusterProps = cdkBuilder.build()
}
