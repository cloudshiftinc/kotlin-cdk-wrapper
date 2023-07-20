@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnTopicNamedEntityDefinitionMetricPropertyDsl {
    private val cdkBuilder: CfnTopic.NamedEntityDefinitionMetricProperty.Builder =
        CfnTopic.NamedEntityDefinitionMetricProperty.builder()

    public fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
    }

    public fun aggregationFunctionParameters(aggregationFunctionParameters: Map<String, String>) {
        cdkBuilder.aggregationFunctionParameters(aggregationFunctionParameters)
    }

    public fun aggregationFunctionParameters(aggregationFunctionParameters: IResolvable) {
        cdkBuilder.aggregationFunctionParameters(aggregationFunctionParameters)
    }

    public fun build(): CfnTopic.NamedEntityDefinitionMetricProperty = cdkBuilder.build()
}
