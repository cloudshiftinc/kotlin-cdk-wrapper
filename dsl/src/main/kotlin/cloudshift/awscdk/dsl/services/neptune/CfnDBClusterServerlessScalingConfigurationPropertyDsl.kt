@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.neptune

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.neptune.CfnDBCluster

@CdkDslMarker
public class CfnDBClusterServerlessScalingConfigurationPropertyDsl {
  private val cdkBuilder: CfnDBCluster.ServerlessScalingConfigurationProperty.Builder =
      CfnDBCluster.ServerlessScalingConfigurationProperty.builder()

  /**
   * @param maxCapacity The maximum number of Neptune capacity units (NCUs) for a DB instance in an
   * Neptune Serverless cluster. 
   * You can specify NCU values in half-step increments, such as 40, 40.5, 41, and so on. The
   * smallest value you can use is 2.5, whereas the largest is 128.
   */
  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  /**
   * @param minCapacity The minimum number of Neptune capacity units (NCUs) for a DB instance in an
   * Neptune Serverless cluster. 
   * You can specify NCU values in half-step increments, such as 8, 8.5, 9, and so on. The smallest
   * value you can use is 1, whereas the largest is 128.
   */
  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun build(): CfnDBCluster.ServerlessScalingConfigurationProperty = cdkBuilder.build()
}
