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
public class CfnTopicTopicRangeFilterConstantPropertyDsl {
    private val cdkBuilder: CfnTopic.TopicRangeFilterConstantProperty.Builder =
        CfnTopic.TopicRangeFilterConstantProperty.builder()

    public fun constantType(constantType: String) {
        cdkBuilder.constantType(constantType)
    }

    public fun rangeConstant(rangeConstant: IResolvable) {
        cdkBuilder.rangeConstant(rangeConstant)
    }

    public fun rangeConstant(rangeConstant: CfnTopic.RangeConstantProperty) {
        cdkBuilder.rangeConstant(rangeConstant)
    }

    public fun build(): CfnTopic.TopicRangeFilterConstantProperty = cdkBuilder.build()
}
