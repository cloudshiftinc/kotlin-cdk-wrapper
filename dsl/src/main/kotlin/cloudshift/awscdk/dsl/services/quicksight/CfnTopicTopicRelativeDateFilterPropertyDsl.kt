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
public class CfnTopicTopicRelativeDateFilterPropertyDsl {
    private val cdkBuilder: CfnTopic.TopicRelativeDateFilterProperty.Builder =
        CfnTopic.TopicRelativeDateFilterProperty.builder()

    public fun constant(constant: IResolvable) {
        cdkBuilder.constant(constant)
    }

    public fun constant(constant: CfnTopic.TopicSingularFilterConstantProperty) {
        cdkBuilder.constant(constant)
    }

    public fun relativeDateFilterFunction(relativeDateFilterFunction: String) {
        cdkBuilder.relativeDateFilterFunction(relativeDateFilterFunction)
    }

    public fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
    }

    public fun build(): CfnTopic.TopicRelativeDateFilterProperty = cdkBuilder.build()
}
