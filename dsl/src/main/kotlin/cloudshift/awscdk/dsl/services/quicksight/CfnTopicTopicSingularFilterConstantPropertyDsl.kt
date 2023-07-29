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
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * A structure that represents a singular filter constant, used in filters to specify a single value
 * to match against.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TopicSingularFilterConstantProperty topicSingularFilterConstantProperty =
 * TopicSingularFilterConstantProperty.builder()
 * .constantType("constantType")
 * .singularConstant("singularConstant")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicsingularfilterconstant.html)
 */
@CdkDslMarker
public class CfnTopicTopicSingularFilterConstantPropertyDsl {
    private val cdkBuilder: CfnTopic.TopicSingularFilterConstantProperty.Builder =
        CfnTopic.TopicSingularFilterConstantProperty.builder()

    /**
     * @param constantType The type of the singular filter constant. Valid values for this structure
     *   are `SINGULAR` .
     */
    public fun constantType(constantType: String) {
        cdkBuilder.constantType(constantType)
    }

    /** @param singularConstant The value of the singular filter constant. */
    public fun singularConstant(singularConstant: String) {
        cdkBuilder.singularConstant(singularConstant)
    }

    public fun build(): CfnTopic.TopicSingularFilterConstantProperty = cdkBuilder.build()
}
