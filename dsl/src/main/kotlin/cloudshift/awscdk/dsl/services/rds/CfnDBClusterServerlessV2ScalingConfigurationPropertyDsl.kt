@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.rds.CfnDBCluster

@CdkDslMarker
public class CfnDBClusterServerlessV2ScalingConfigurationPropertyDsl {
  private val cdkBuilder: CfnDBCluster.ServerlessV2ScalingConfigurationProperty.Builder =
      CfnDBCluster.ServerlessV2ScalingConfigurationProperty.builder()

  /**
   * @param maxCapacity The maximum number of Aurora capacity units (ACUs) for a DB instance in an
   * Aurora Serverless v2 cluster.
   * You can specify ACU values in half-step increments, such as 40, 40.5, 41, and so on. The
   * largest value that you can use is 128.
   *
   * The maximum capacity must be higher than 0.5 ACUs. For more information, see [Choosing the
   * maximum Aurora Serverless v2 capacity setting for a
   * cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.setting-capacity.html#aurora-serverless-v2.max_capacity_considerations)
   * in the *Amazon Aurora User Guide* .
   */
  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  /**
   * @param minCapacity The minimum number of Aurora capacity units (ACUs) for a DB instance in an
   * Aurora Serverless v2 cluster.
   * You can specify ACU values in half-step increments, such as 8, 8.5, 9, and so on. The smallest
   * value that you can use is 0.5.
   */
  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun build(): CfnDBCluster.ServerlessV2ScalingConfigurationProperty = cdkBuilder.build()
}
