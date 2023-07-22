@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicNamedEntityDefinitionMetricPropertyDsl {
  private val cdkBuilder: CfnTopic.NamedEntityDefinitionMetricProperty.Builder =
      CfnTopic.NamedEntityDefinitionMetricProperty.builder()

  /**
   * @param aggregation The aggregation of a named entity.
   * Valid values for this structure are `SUM` , `MIN` , `MAX` , `COUNT` , `AVERAGE` ,
   * `DISTINCT_COUNT` , `STDEV` , `STDEVP` , `VAR` , `VARP` , `PERCENTILE` , `MEDIAN` , and `CUSTOM` .
   */
  public fun aggregation(aggregation: String) {
    cdkBuilder.aggregation(aggregation)
  }

  /**
   * @param aggregationFunctionParameters The additional parameters for an aggregation function.
   */
  public fun aggregationFunctionParameters(aggregationFunctionParameters: Map<String, String>) {
    cdkBuilder.aggregationFunctionParameters(aggregationFunctionParameters)
  }

  /**
   * @param aggregationFunctionParameters The additional parameters for an aggregation function.
   */
  public fun aggregationFunctionParameters(aggregationFunctionParameters: IResolvable) {
    cdkBuilder.aggregationFunctionParameters(aggregationFunctionParameters)
  }

  public fun build(): CfnTopic.NamedEntityDefinitionMetricProperty = cdkBuilder.build()
}
