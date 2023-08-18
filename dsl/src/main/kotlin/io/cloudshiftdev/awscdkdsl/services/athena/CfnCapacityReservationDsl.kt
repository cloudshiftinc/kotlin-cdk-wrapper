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

package io.cloudshiftdev.awscdkdsl.services.athena

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnCapacityReservation
import software.constructs.Construct

/**
 * Specifies a capacity reservation with the provided name and number of requested data processing
 * units.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.athena.*;
 * CfnCapacityReservation cfnCapacityReservation = CfnCapacityReservation.Builder.create(this,
 * "MyCfnCapacityReservation")
 * .name("name")
 * .targetDpus(123)
 * // the properties below are optional
 * .capacityAssignmentConfiguration(CapacityAssignmentConfigurationProperty.builder()
 * .capacityAssignments(List.of(CapacityAssignmentProperty.builder()
 * .workgroupNames(List.of("workgroupNames"))
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html)
 */
@CdkDslMarker
public class CfnCapacityReservationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCapacityReservation.Builder =
        CfnCapacityReservation.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Assigns Athena workgroups (and hence their queries) to capacity reservations.
     *
     * A capacity reservation can have only one capacity assignment configuration, but the capacity
     * assignment configuration can be made up of multiple individual assignments. Each assignment
     * specifies how Athena queries can consume capacity from the capacity reservation that their
     * workgroup is mapped to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-capacityassignmentconfiguration)
     *
     * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
     *   capacity reservations.
     */
    public fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: IResolvable) {
        cdkBuilder.capacityAssignmentConfiguration(capacityAssignmentConfiguration)
    }

    /**
     * Assigns Athena workgroups (and hence their queries) to capacity reservations.
     *
     * A capacity reservation can have only one capacity assignment configuration, but the capacity
     * assignment configuration can be made up of multiple individual assignments. Each assignment
     * specifies how Athena queries can consume capacity from the capacity reservation that their
     * workgroup is mapped to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-capacityassignmentconfiguration)
     *
     * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
     *   capacity reservations.
     */
    public fun capacityAssignmentConfiguration(
        capacityAssignmentConfiguration:
            CfnCapacityReservation.CapacityAssignmentConfigurationProperty
    ) {
        cdkBuilder.capacityAssignmentConfiguration(capacityAssignmentConfiguration)
    }

    /**
     * The name of the capacity reservation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-name)
     *
     * @param name The name of the capacity reservation.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to the capacity reservation.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-tags)
     *
     * @param tags An array of key-value pairs to apply to the capacity reservation.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to the capacity reservation.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-tags)
     *
     * @param tags An array of key-value pairs to apply to the capacity reservation.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The number of data processing units requested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-capacityreservation.html#cfn-athena-capacityreservation-targetdpus)
     *
     * @param targetDpus The number of data processing units requested.
     */
    public fun targetDpus(targetDpus: Number) {
        cdkBuilder.targetDpus(targetDpus)
    }

    public fun build(): CfnCapacityReservation {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
