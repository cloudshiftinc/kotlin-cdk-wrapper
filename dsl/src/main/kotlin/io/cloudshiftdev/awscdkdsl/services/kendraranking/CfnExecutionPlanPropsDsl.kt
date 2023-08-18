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

package io.cloudshiftdev.awscdkdsl.services.kendraranking

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlan
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps

/**
 * Properties for defining a `CfnExecutionPlan`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendraranking.*;
 * CfnExecutionPlanProps cfnExecutionPlanProps = CfnExecutionPlanProps.builder()
 * .name("name")
 * // the properties below are optional
 * .capacityUnits(CapacityUnitsConfigurationProperty.builder()
 * .rescoreCapacityUnits(123)
 * .build())
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html)
 */
@CdkDslMarker
public class CfnExecutionPlanPropsDsl {
    private val cdkBuilder: CfnExecutionPlanProps.Builder = CfnExecutionPlanProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
     *   execution plan. You are given a single capacity unit by default. If you want to use the
     *   default capacity, you don't set additional capacity units. For more information on the
     *   default capacity and additional capacity units, see
     *   [Adjusting capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html)
     *   .
     */
    public fun capacityUnits(capacityUnits: IResolvable) {
        cdkBuilder.capacityUnits(capacityUnits)
    }

    /**
     * @param capacityUnits You can set additional capacity units to meet the needs of your rescore
     *   execution plan. You are given a single capacity unit by default. If you want to use the
     *   default capacity, you don't set additional capacity units. For more information on the
     *   default capacity and additional capacity units, see
     *   [Adjusting capacity](https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html)
     *   .
     */
    public fun capacityUnits(capacityUnits: CfnExecutionPlan.CapacityUnitsConfigurationProperty) {
        cdkBuilder.capacityUnits(capacityUnits)
    }

    /** @param description A description for the rescore execution plan. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name A name for the rescore execution plan. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags A list of key-value pairs that identify or categorize your rescore execution
     *   plan. You can also use tags to help control access to the rescore execution plan. Tag keys
     *   and values can consist of Unicode letters, digits, white space. They can also consist of
     *   underscore, period, colon, equal, plus, and asperand.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of key-value pairs that identify or categorize your rescore execution
     *   plan. You can also use tags to help control access to the rescore execution plan. Tag keys
     *   and values can consist of Unicode letters, digits, white space. They can also consist of
     *   underscore, period, colon, equal, plus, and asperand.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnExecutionPlanProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
