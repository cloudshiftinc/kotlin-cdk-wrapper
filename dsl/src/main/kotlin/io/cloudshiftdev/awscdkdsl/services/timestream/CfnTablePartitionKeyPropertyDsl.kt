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

package io.cloudshiftdev.awscdkdsl.services.timestream

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnTable

/**
 * An attribute used in partitioning data in a table.
 *
 * A dimension key partitions data using the values of the dimension specified by the dimension-name
 * as partition key, while a measure key partitions data using measure names (values of the
 * 'measure_name' column).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * PartitionKeyProperty partitionKeyProperty = PartitionKeyProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .enforcementInRecord("enforcementInRecord")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-partitionkey.html)
 */
@CdkDslMarker
public class CfnTablePartitionKeyPropertyDsl {
    private val cdkBuilder: CfnTable.PartitionKeyProperty.Builder =
        CfnTable.PartitionKeyProperty.builder()

    /**
     * @param enforcementInRecord The level of enforcement for the specification of a dimension key
     *   in ingested records. Options are REQUIRED (dimension key must be specified) and OPTIONAL
     *   (dimension key does not have to be specified).
     */
    public fun enforcementInRecord(enforcementInRecord: String) {
        cdkBuilder.enforcementInRecord(enforcementInRecord)
    }

    /** @param name The name of the attribute used for a dimension key. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param type The type of the partition key. Options are DIMENSION (dimension key) and MEASURE
     *   (measure key).
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTable.PartitionKeyProperty = cdkBuilder.build()
}
