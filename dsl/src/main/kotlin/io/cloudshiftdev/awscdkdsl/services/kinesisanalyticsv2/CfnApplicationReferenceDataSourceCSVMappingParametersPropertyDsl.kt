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
 * For a SQL-based Kinesis Data Analytics application, provides additional mapping information when
 * the record format uses delimiters, such as CSV.
 *
 * For example, the following sample records use CSV format, where the records use the *'\n'* as the
 * row delimiter and a comma (",") as the column delimiter:
 *
 * `"name1", "address1"`
 *
 * `"name2", "address2"`
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * CSVMappingParametersProperty cSVMappingParametersProperty =
 * CSVMappingParametersProperty.builder()
 * .recordColumnDelimiter("recordColumnDelimiter")
 * .recordRowDelimiter("recordRowDelimiter")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html)
 */
@CdkDslMarker
public class CfnApplicationReferenceDataSourceCSVMappingParametersPropertyDsl {
    private val cdkBuilder: CfnApplicationReferenceDataSource.CSVMappingParametersProperty.Builder =
        CfnApplicationReferenceDataSource.CSVMappingParametersProperty.builder()

    /**
     * @param recordColumnDelimiter The column delimiter. For example, in a CSV format, a comma
     *   (",") is the typical column delimiter.
     */
    public fun recordColumnDelimiter(recordColumnDelimiter: String) {
        cdkBuilder.recordColumnDelimiter(recordColumnDelimiter)
    }

    /**
     * @param recordRowDelimiter The row delimiter. For example, in a CSV format, *'\n'* is the
     *   typical row delimiter.
     */
    public fun recordRowDelimiter(recordRowDelimiter: String) {
        cdkBuilder.recordRowDelimiter(recordRowDelimiter)
    }

    public fun build(): CfnApplicationReferenceDataSource.CSVMappingParametersProperty =
        cdkBuilder.build()
}
