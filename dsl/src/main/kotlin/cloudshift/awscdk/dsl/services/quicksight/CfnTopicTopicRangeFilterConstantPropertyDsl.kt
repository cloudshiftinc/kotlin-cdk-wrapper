@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic
import kotlin.String

/**
 * A constant value that is used in a range filter to specify the endpoints of the range.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TopicRangeFilterConstantProperty topicRangeFilterConstantProperty =
 * TopicRangeFilterConstantProperty.builder()
 * .constantType("constantType")
 * .rangeConstant(RangeConstantProperty.builder()
 * .maximum("maximum")
 * .minimum("minimum")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicrangefilterconstant.html)
 */
@CdkDslMarker
public class CfnTopicTopicRangeFilterConstantPropertyDsl {
    private val cdkBuilder: CfnTopic.TopicRangeFilterConstantProperty.Builder =
        CfnTopic.TopicRangeFilterConstantProperty.builder()

    /**
     * @param constantType The data type of the constant value that is used in a range filter.
     * Valid values for this structure are `RANGE` .
     */
    public fun constantType(constantType: String) {
        cdkBuilder.constantType(constantType)
    }

    /**
     * @param rangeConstant The value of the constant that is used to specify the endpoints of a range
     * filter.
     */
    public fun rangeConstant(rangeConstant: IResolvable) {
        cdkBuilder.rangeConstant(rangeConstant)
    }

    /**
     * @param rangeConstant The value of the constant that is used to specify the endpoints of a range
     * filter.
     */
    public fun rangeConstant(rangeConstant: CfnTopic.RangeConstantProperty) {
        cdkBuilder.rangeConstant(rangeConstant)
    }

    public fun build(): CfnTopic.TopicRangeFilterConstantProperty = cdkBuilder.build()
}
