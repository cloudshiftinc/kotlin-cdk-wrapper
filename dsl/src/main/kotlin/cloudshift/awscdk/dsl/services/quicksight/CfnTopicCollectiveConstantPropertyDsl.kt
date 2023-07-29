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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * A structure that represents a collective constant.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CollectiveConstantProperty collectiveConstantProperty = CollectiveConstantProperty.builder()
 * .valueList(List.of("valueList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-collectiveconstant.html)
 */
@CdkDslMarker
public class CfnTopicCollectiveConstantPropertyDsl {
    private val cdkBuilder: CfnTopic.CollectiveConstantProperty.Builder =
        CfnTopic.CollectiveConstantProperty.builder()

    private val _valueList: MutableList<String> = mutableListOf()

    /** @param valueList A list of values for the collective constant. */
    public fun valueList(vararg valueList: String) {
        _valueList.addAll(listOf(*valueList))
    }

    /** @param valueList A list of values for the collective constant. */
    public fun valueList(valueList: Collection<String>) {
        _valueList.addAll(valueList)
    }

    public fun build(): CfnTopic.CollectiveConstantProperty {
        if (_valueList.isNotEmpty()) cdkBuilder.valueList(_valueList)
        return cdkBuilder.build()
    }
}
