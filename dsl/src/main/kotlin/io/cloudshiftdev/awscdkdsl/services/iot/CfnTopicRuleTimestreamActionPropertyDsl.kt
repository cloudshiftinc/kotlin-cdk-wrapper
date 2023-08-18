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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action that writes records into an Amazon Timestream table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * TimestreamActionProperty timestreamActionProperty = TimestreamActionProperty.builder()
 * .databaseName("databaseName")
 * .dimensions(List.of(TimestreamDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .roleArn("roleArn")
 * .tableName("tableName")
 * // the properties below are optional
 * .timestamp(TimestreamTimestampProperty.builder()
 * .unit("unit")
 * .value("value")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleTimestreamActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.TimestreamActionProperty.Builder =
        CfnTopicRule.TimestreamActionProperty.builder()

    private val _dimensions: MutableList<Any> = mutableListOf()

    /**
     * @param databaseName The name of an Amazon Timestream database that has the table to write
     *   records into.
     */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param dimensions Metadata attributes of the time series that are written in each measure
     *   record.
     */
    public fun dimensions(vararg dimensions: Any) {
        _dimensions.addAll(listOf(*dimensions))
    }

    /**
     * @param dimensions Metadata attributes of the time series that are written in each measure
     *   record.
     */
    public fun dimensions(dimensions: Collection<Any>) {
        _dimensions.addAll(dimensions)
    }

    /**
     * @param dimensions Metadata attributes of the time series that are written in each measure
     *   record.
     */
    public fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the role that grants AWS IoT permission to
     *   write to the Timestream database table.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param tableName The table where the message data will be written. */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    /**
     * @param timestamp The value to use for the entry's timestamp. If blank, the time that the
     *   entry was processed is used.
     */
    public fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp)
    }

    /**
     * @param timestamp The value to use for the entry's timestamp. If blank, the time that the
     *   entry was processed is used.
     */
    public fun timestamp(timestamp: CfnTopicRule.TimestreamTimestampProperty) {
        cdkBuilder.timestamp(timestamp)
    }

    public fun build(): CfnTopicRule.TimestreamActionProperty {
        if (_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
        return cdkBuilder.build()
    }
}
