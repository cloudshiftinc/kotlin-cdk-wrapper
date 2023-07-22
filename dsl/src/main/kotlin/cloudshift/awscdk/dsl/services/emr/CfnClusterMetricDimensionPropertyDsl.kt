@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterMetricDimensionPropertyDsl {
  private val cdkBuilder: CfnCluster.MetricDimensionProperty.Builder =
      CfnCluster.MetricDimensionProperty.builder()

  /**
   * @param key The dimension name. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The dimension value. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnCluster.MetricDimensionProperty = cdkBuilder.build()
}
