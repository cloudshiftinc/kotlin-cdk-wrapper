@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * A structure that represents a metric.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NamedEntityDefinitionMetricProperty namedEntityDefinitionMetricProperty =
 * NamedEntityDefinitionMetricProperty.builder()
 * .aggregation("aggregation")
 * .aggregationFunctionParameters(Map.of(
 * "aggregationFunctionParametersKey", "aggregationFunctionParameters"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinitionmetric.html)
 */
@CdkDslMarker
public class CfnTopicNamedEntityDefinitionMetricPropertyDsl {
    private val cdkBuilder: CfnTopic.NamedEntityDefinitionMetricProperty.Builder =
        CfnTopic.NamedEntityDefinitionMetricProperty.builder()

    /**
     * @param aggregation The aggregation of a named entity. Valid values for this structure are
     *   `SUM` , `MIN` , `MAX` , `COUNT` , `AVERAGE` , `DISTINCT_COUNT` , `STDEV` , `STDEVP` , `VAR`
     *   , `VARP` , `PERCENTILE` , `MEDIAN` , and `CUSTOM` .
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
