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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * A filter that filters topics based on the value of a numeric field.
 *
 * The filter includes only topics whose numeric field value falls within the specified range.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TopicNumericRangeFilterProperty topicNumericRangeFilterProperty =
 * TopicNumericRangeFilterProperty.builder()
 * .aggregation("aggregation")
 * .constant(TopicRangeFilterConstantProperty.builder()
 * .constantType("constantType")
 * .rangeConstant(RangeConstantProperty.builder()
 * .maximum("maximum")
 * .minimum("minimum")
 * .build())
 * .build())
 * .inclusive(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnumericrangefilter.html)
 */
@CdkDslMarker
public class CfnTopicTopicNumericRangeFilterPropertyDsl {
    private val cdkBuilder: CfnTopic.TopicNumericRangeFilterProperty.Builder =
        CfnTopic.TopicNumericRangeFilterProperty.builder()

    /**
     * @param aggregation An aggregation function that specifies how to calculate the value of a
     *   numeric field for a topic, Valid values for this structure are `NO_AGGREGATION` , `SUM` ,
     *   `AVERAGE` , `COUNT` , `DISTINCT_COUNT` , `MAX` , `MEDIAN` , `MIN` , `STDEV` , `STDEVP` ,
     *   `VAR` , and `VARP` .
     */
    public fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
    }

    /** @param constant The constant used in a numeric range filter. */
    public fun constant(constant: IResolvable) {
        cdkBuilder.constant(constant)
    }

    /** @param constant The constant used in a numeric range filter. */
    public fun constant(constant: CfnTopic.TopicRangeFilterConstantProperty) {
        cdkBuilder.constant(constant)
    }

    /**
     * @param inclusive A Boolean value that indicates whether the endpoints of the numeric range
     *   are included in the filter. If set to true, topics whose numeric field value is equal to
     *   the endpoint values will be included in the filter. If set to false, topics whose numeric
     *   field value is equal to the endpoint values will be excluded from the filter.
     */
    public fun inclusive(inclusive: Boolean) {
        cdkBuilder.inclusive(inclusive)
    }

    /**
     * @param inclusive A Boolean value that indicates whether the endpoints of the numeric range
     *   are included in the filter. If set to true, topics whose numeric field value is equal to
     *   the endpoint values will be included in the filter. If set to false, topics whose numeric
     *   field value is equal to the endpoint values will be excluded from the filter.
     */
    public fun inclusive(inclusive: IResolvable) {
        cdkBuilder.inclusive(inclusive)
    }

    public fun build(): CfnTopic.TopicNumericRangeFilterProperty = cdkBuilder.build()
}
