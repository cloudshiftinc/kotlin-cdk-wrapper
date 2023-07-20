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
import kotlin.Boolean

@CdkDslMarker
public class CfnTopicTopicDateRangeFilterPropertyDsl {
    private val cdkBuilder: CfnTopic.TopicDateRangeFilterProperty.Builder =
        CfnTopic.TopicDateRangeFilterProperty.builder()

    public fun constant(constant: IResolvable) {
        cdkBuilder.constant(constant)
    }

    public fun constant(constant: CfnTopic.TopicRangeFilterConstantProperty) {
        cdkBuilder.constant(constant)
    }

    public fun inclusive(inclusive: Boolean) {
        cdkBuilder.inclusive(inclusive)
    }

    public fun inclusive(inclusive: IResolvable) {
        cdkBuilder.inclusive(inclusive)
    }

    public fun build(): CfnTopic.TopicDateRangeFilterProperty = cdkBuilder.build()
}
