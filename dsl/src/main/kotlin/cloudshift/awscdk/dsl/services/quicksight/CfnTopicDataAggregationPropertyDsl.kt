@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * The definition of a data aggregation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataAggregationProperty dataAggregationProperty = DataAggregationProperty.builder()
 * .datasetRowDateGranularity("datasetRowDateGranularity")
 * .defaultDateColumnName("defaultDateColumnName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-dataaggregation.html)
 */
@CdkDslMarker
public class CfnTopicDataAggregationPropertyDsl {
  private val cdkBuilder: CfnTopic.DataAggregationProperty.Builder =
      CfnTopic.DataAggregationProperty.builder()

  /**
   * @param datasetRowDateGranularity The level of time precision that is used to aggregate
   * `DateTime` values.
   */
  public fun datasetRowDateGranularity(datasetRowDateGranularity: String) {
    cdkBuilder.datasetRowDateGranularity(datasetRowDateGranularity)
  }

  /**
   * @param defaultDateColumnName The column name for the default date.
   */
  public fun defaultDateColumnName(defaultDateColumnName: String) {
    cdkBuilder.defaultDateColumnName(defaultDateColumnName)
  }

  public fun build(): CfnTopic.DataAggregationProperty = cdkBuilder.build()
}
