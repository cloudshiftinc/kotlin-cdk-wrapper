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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource

/**
 * For a SQL-based Kinesis Data Analytics application, describes the mapping of each data element in
 * the streaming source to the corresponding column in the in-application stream.
 *
 * Also used to describe the format of the reference data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * RecordColumnProperty recordColumnProperty = RecordColumnProperty.builder()
 * .name("name")
 * .sqlType("sqlType")
 * // the properties below are optional
 * .mapping("mapping")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn.html)
 */
@CdkDslMarker
public class CfnApplicationReferenceDataSourceRecordColumnPropertyDsl {
    private val cdkBuilder: CfnApplicationReferenceDataSource.RecordColumnProperty.Builder =
        CfnApplicationReferenceDataSource.RecordColumnProperty.builder()

    /**
     * @param mapping A reference to the data element in the streaming input or the reference data
     *   source.
     */
    public fun mapping(mapping: String) {
        cdkBuilder.mapping(mapping)
    }

    /**
     * @param name The name of the column that is created in the in-application input stream or
     *   reference table.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param sqlType The type of column created in the in-application input stream or reference
     *   table.
     */
    public fun sqlType(sqlType: String) {
        cdkBuilder.sqlType(sqlType)
    }

    public fun build(): CfnApplicationReferenceDataSource.RecordColumnProperty = cdkBuilder.build()
}
