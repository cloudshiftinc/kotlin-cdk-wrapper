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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * A filter used to restrict data based on a range of dates or times.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TopicDateRangeFilterProperty topicDateRangeFilterProperty =
 * TopicDateRangeFilterProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicdaterangefilter.html)
 */
@CdkDslMarker
public class CfnTopicTopicDateRangeFilterPropertyDsl {
    private val cdkBuilder: CfnTopic.TopicDateRangeFilterProperty.Builder =
        CfnTopic.TopicDateRangeFilterProperty.builder()

    /** @param constant The constant used in a date range filter. */
    public fun constant(constant: IResolvable) {
        cdkBuilder.constant(constant)
    }

    /** @param constant The constant used in a date range filter. */
    public fun constant(constant: CfnTopic.TopicRangeFilterConstantProperty) {
        cdkBuilder.constant(constant)
    }

    /**
     * @param inclusive A Boolean value that indicates whether the date range filter should include
     *   the boundary values. If set to true, the filter includes the start and end dates. If set to
     *   false, the filter excludes them.
     */
    public fun inclusive(inclusive: Boolean) {
        cdkBuilder.inclusive(inclusive)
    }

    /**
     * @param inclusive A Boolean value that indicates whether the date range filter should include
     *   the boundary values. If set to true, the filter includes the start and end dates. If set to
     *   false, the filter excludes them.
     */
    public fun inclusive(inclusive: IResolvable) {
        cdkBuilder.inclusive(inclusive)
    }

    public fun build(): CfnTopic.TopicDateRangeFilterProperty = cdkBuilder.build()
}
