@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.rds.ClusterInstanceBindOptions
import software.amazon.awscdk.services.rds.ISubnetGroup

/**
 * Options for binding the instance to the cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.rds.*;
 * Role role;
 * SubnetGroup subnetGroup;
 * ClusterInstanceBindOptions clusterInstanceBindOptions = ClusterInstanceBindOptions.builder()
 * .monitoringInterval(Duration.minutes(30))
 * .monitoringRole(role)
 * .promotionTier(123)
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .subnetGroup(subnetGroup)
 * .build();
 * ```
 */
@CdkDslMarker
public class ClusterInstanceBindOptionsDsl {
  private val cdkBuilder: ClusterInstanceBindOptions.Builder = ClusterInstanceBindOptions.builder()

  /**
   * @param monitoringInterval The interval, in seconds, between points when Amazon RDS collects
   * enhanced monitoring metrics for the DB instances.
   */
  public fun monitoringInterval(monitoringInterval: Duration) {
    cdkBuilder.monitoringInterval(monitoringInterval)
  }

  /**
   * @param monitoringRole Role that will be used to manage DB instances monitoring.
   */
  public fun monitoringRole(monitoringRole: IRole) {
    cdkBuilder.monitoringRole(monitoringRole)
  }

  /**
   * @param promotionTier The promotion tier of the cluster instance.
   * This matters more for serverlessV2 instances. If a serverless
   * instance is in tier 0-1 then it will scale with the writer.
   *
   * For provisioned instances this just determines the failover priority.
   * If multiple instances have the same priority then one will be picked at random
   */
  public fun promotionTier(promotionTier: Number) {
    cdkBuilder.promotionTier(promotionTier)
  }

  /**
   * @param removalPolicy The removal policy on the cluster.
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * @param subnetGroup Existing subnet group for the cluster.
   * This is only needed when using the isFromLegacyInstanceProps
   */
  public fun subnetGroup(subnetGroup: ISubnetGroup) {
    cdkBuilder.subnetGroup(subnetGroup)
  }

  public fun build(): ClusterInstanceBindOptions = cdkBuilder.build()
}
