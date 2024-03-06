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

package io.cloudshiftdev.awscdkdsl.services.fsx

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.fsx.CfnVolume

/**
 * Use to specify configuration options for a volume’s storage aggregate or aggregates.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * AggregateConfigurationProperty aggregateConfigurationProperty =
 * AggregateConfigurationProperty.builder()
 * .aggregates(List.of("aggregates"))
 * .constituentsPerAggregate(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-aggregateconfiguration.html)
 */
@CdkDslMarker
public class CfnVolumeAggregateConfigurationPropertyDsl {
    private val cdkBuilder: CfnVolume.AggregateConfigurationProperty.Builder =
        CfnVolume.AggregateConfigurationProperty.builder()

    private val _aggregates: MutableList<String> = mutableListOf()

    /**
     * @param aggregates The list of aggregates that this volume resides on. Aggregates are storage
     *   pools which make up your primary storage tier. Each high-availability (HA) pair has one
     *   aggregate. The names of the aggregates map to the names of the aggregates in the ONTAP CLI
     *   and REST API. For FlexVols, there will always be a single entry.
     *
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * * The strings in the value of `Aggregates` are not are not formatted as `aggrX` , where X is
     *   a number between 1 and 6.
     * * The value of `Aggregates` contains aggregates that are not present.
     * * One or more of the aggregates supplied are too close to the volume limit to support adding
     *   more volumes.
     */
    public fun aggregates(vararg aggregates: String) {
        _aggregates.addAll(listOf(*aggregates))
    }

    /**
     * @param aggregates The list of aggregates that this volume resides on. Aggregates are storage
     *   pools which make up your primary storage tier. Each high-availability (HA) pair has one
     *   aggregate. The names of the aggregates map to the names of the aggregates in the ONTAP CLI
     *   and REST API. For FlexVols, there will always be a single entry.
     *
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * * The strings in the value of `Aggregates` are not are not formatted as `aggrX` , where X is
     *   a number between 1 and 6.
     * * The value of `Aggregates` contains aggregates that are not present.
     * * One or more of the aggregates supplied are too close to the volume limit to support adding
     *   more volumes.
     */
    public fun aggregates(aggregates: Collection<String>) {
        _aggregates.addAll(aggregates)
    }

    /**
     * @param constituentsPerAggregate Used to explicitly set the number of constituents within the
     *   FlexGroup per storage aggregate. This field is optional when creating a FlexGroup volume.
     *   If unspecified, the default value will be 8. This field cannot be provided when creating a
     *   FlexVol volume.
     */
    public fun constituentsPerAggregate(constituentsPerAggregate: Number) {
        cdkBuilder.constituentsPerAggregate(constituentsPerAggregate)
    }

    public fun build(): CfnVolume.AggregateConfigurationProperty {
        if (_aggregates.isNotEmpty()) cdkBuilder.aggregates(_aggregates)
        return cdkBuilder.build()
    }
}
