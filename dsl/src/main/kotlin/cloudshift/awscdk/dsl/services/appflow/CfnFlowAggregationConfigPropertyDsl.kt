@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowAggregationConfigPropertyDsl {
  private val cdkBuilder: CfnFlow.AggregationConfigProperty.Builder =
      CfnFlow.AggregationConfigProperty.builder()

  /**
   * @param aggregationType Specifies whether Amazon AppFlow aggregates the flow records into a
   * single file, or leave them unaggregated.
   */
  public fun aggregationType(aggregationType: String) {
    cdkBuilder.aggregationType(aggregationType)
  }

  /**
   * @param targetFileSize the value to be set.
   */
  public fun targetFileSize(targetFileSize: Number) {
    cdkBuilder.targetFileSize(targetFileSize)
  }

  public fun build(): CfnFlow.AggregationConfigProperty = cdkBuilder.build()
}
