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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps

/**
 * Properties for defining a `CfnCalculatedAttributeDefinition`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * CfnCalculatedAttributeDefinitionProps cfnCalculatedAttributeDefinitionProps =
 * CfnCalculatedAttributeDefinitionProps.builder()
 * .attributeDetails(AttributeDetailsProperty.builder()
 * .attributes(List.of(AttributeItemProperty.builder()
 * .name("name")
 * .build()))
 * .expression("expression")
 * .build())
 * .calculatedAttributeName("calculatedAttributeName")
 * .domainName("domainName")
 * .statistic("statistic")
 * // the properties below are optional
 * .conditions(ConditionsProperty.builder()
 * .objectCount(123)
 * .range(RangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .threshold(ThresholdProperty.builder()
 * .operator("operator")
 * .value("value")
 * .build())
 * .build())
 * .description("description")
 * .displayName("displayName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html)
 */
@CdkDslMarker
public class CfnCalculatedAttributeDefinitionPropsDsl {
    private val cdkBuilder: CfnCalculatedAttributeDefinitionProps.Builder =
        CfnCalculatedAttributeDefinitionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param attributeDetails Mathematical expression and a list of attribute items specified in
     *   that expression.
     */
    public fun attributeDetails(attributeDetails: IResolvable) {
        cdkBuilder.attributeDetails(attributeDetails)
    }

    /**
     * @param attributeDetails Mathematical expression and a list of attribute items specified in
     *   that expression.
     */
    public fun attributeDetails(
        attributeDetails: CfnCalculatedAttributeDefinition.AttributeDetailsProperty
    ) {
        cdkBuilder.attributeDetails(attributeDetails)
    }

    /** @param calculatedAttributeName The name of an attribute defined in a profile object type. */
    public fun calculatedAttributeName(calculatedAttributeName: String) {
        cdkBuilder.calculatedAttributeName(calculatedAttributeName)
    }

    /**
     * @param conditions The conditions including range, object count, and threshold for the
     *   calculated attribute.
     */
    public fun conditions(conditions: IResolvable) {
        cdkBuilder.conditions(conditions)
    }

    /**
     * @param conditions The conditions including range, object count, and threshold for the
     *   calculated attribute.
     */
    public fun conditions(conditions: CfnCalculatedAttributeDefinition.ConditionsProperty) {
        cdkBuilder.conditions(conditions)
    }

    /** @param description The description of the calculated attribute. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param displayName The display name of the calculated attribute. */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /** @param domainName The unique name of the domain. */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /** @param statistic The aggregation operation to perform for the calculated attribute. */
    public fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCalculatedAttributeDefinitionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
