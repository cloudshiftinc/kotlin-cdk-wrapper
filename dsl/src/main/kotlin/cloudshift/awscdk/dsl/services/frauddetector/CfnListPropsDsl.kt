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

package cloudshift.awscdk.dsl.services.frauddetector

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.frauddetector.CfnListProps

/**
 * Properties for defining a `CfnList`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.frauddetector.*;
 * CfnListProps cfnListProps = CfnListProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .elements(List.of("elements"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .variableType("variableType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-list.html)
 */
@CdkDslMarker
public class CfnListPropsDsl {
    private val cdkBuilder: CfnListProps.Builder = CfnListProps.builder()

    private val _elements: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description of the list. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param elements The elements in the list. */
    public fun elements(vararg elements: String) {
        _elements.addAll(listOf(*elements))
    }

    /** @param elements The elements in the list. */
    public fun elements(elements: Collection<String>) {
        _elements.addAll(elements)
    }

    /** @param name The name of the list. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param variableType The variable type of the list. For more information, see
     *   [Variable types](https://docs.aws.amazon.com/frauddetector/latest/ug/variables.html#variable-types)
     */
    public fun variableType(variableType: String) {
        cdkBuilder.variableType(variableType)
    }

    public fun build(): CfnListProps {
        if (_elements.isNotEmpty()) cdkBuilder.elements(_elements)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
