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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * A constant used in a category filter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TopicCategoryFilterConstantProperty topicCategoryFilterConstantProperty =
 * TopicCategoryFilterConstantProperty.builder()
 * .collectiveConstant(CollectiveConstantProperty.builder()
 * .valueList(List.of("valueList"))
 * .build())
 * .constantType("constantType")
 * .singularConstant("singularConstant")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilterconstant.html)
 */
@CdkDslMarker
public class CfnTopicTopicCategoryFilterConstantPropertyDsl {
    private val cdkBuilder: CfnTopic.TopicCategoryFilterConstantProperty.Builder =
        CfnTopic.TopicCategoryFilterConstantProperty.builder()

    /**
     * @param collectiveConstant A collective constant used in a category filter. This element is
     *   used to specify a list of values for the constant.
     */
    public fun collectiveConstant(collectiveConstant: IResolvable) {
        cdkBuilder.collectiveConstant(collectiveConstant)
    }

    /**
     * @param collectiveConstant A collective constant used in a category filter. This element is
     *   used to specify a list of values for the constant.
     */
    public fun collectiveConstant(collectiveConstant: CfnTopic.CollectiveConstantProperty) {
        cdkBuilder.collectiveConstant(collectiveConstant)
    }

    /**
     * @param constantType The type of category filter constant. This element is used to specify
     *   whether a constant is a singular or collective. Valid values are `SINGULAR` and
     *   `COLLECTIVE` .
     */
    public fun constantType(constantType: String) {
        cdkBuilder.constantType(constantType)
    }

    /**
     * @param singularConstant A singular constant used in a category filter. This element is used
     *   to specify a single value for the constant.
     */
    public fun singularConstant(singularConstant: String) {
        cdkBuilder.singularConstant(singularConstant)
    }

    public fun build(): CfnTopic.TopicCategoryFilterConstantProperty = cdkBuilder.build()
}
