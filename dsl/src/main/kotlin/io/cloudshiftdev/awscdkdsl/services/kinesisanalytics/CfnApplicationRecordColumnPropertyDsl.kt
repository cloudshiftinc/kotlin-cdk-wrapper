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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication

/**
 * Describes the mapping of each data element in the streaming source to the corresponding column in
 * the in-application stream.
 *
 * Also used to describe the format of the reference data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * RecordColumnProperty recordColumnProperty = RecordColumnProperty.builder()
 * .name("name")
 * .sqlType("sqlType")
 * // the properties below are optional
 * .mapping("mapping")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html)
 */
@CdkDslMarker
public class CfnApplicationRecordColumnPropertyDsl {
    private val cdkBuilder: CfnApplication.RecordColumnProperty.Builder =
        CfnApplication.RecordColumnProperty.builder()

    /**
     * @param mapping Reference to the data element in the streaming input or the reference data
     *   source. This element is required if the
     *   [RecordFormatType](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_RecordFormat.html#analytics-Type-RecordFormat-RecordFormatTypel)
     *   is `JSON` .
     */
    public fun mapping(mapping: String) {
        cdkBuilder.mapping(mapping)
    }

    /**
     * @param name Name of the column created in the in-application input stream or reference table.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param sqlType Type of column created in the in-application input stream or reference table.
     */
    public fun sqlType(sqlType: String) {
        cdkBuilder.sqlType(sqlType)
    }

    public fun build(): CfnApplication.RecordColumnProperty = cdkBuilder.build()
}
