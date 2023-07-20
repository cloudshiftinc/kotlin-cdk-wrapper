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

@CdkDslMarker
public class CfnTopicTopicNumericEqualityFilterPropertyDsl {
    private val cdkBuilder: CfnTopic.TopicNumericEqualityFilterProperty.Builder =
        CfnTopic.TopicNumericEqualityFilterProperty.builder()

    public fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
    }

    public fun constant(constant: IResolvable) {
        cdkBuilder.constant(constant)
    }

    public fun constant(constant: CfnTopic.TopicSingularFilterConstantProperty) {
        cdkBuilder.constant(constant)
    }

    public fun build(): CfnTopic.TopicNumericEqualityFilterProperty = cdkBuilder.build()
}
