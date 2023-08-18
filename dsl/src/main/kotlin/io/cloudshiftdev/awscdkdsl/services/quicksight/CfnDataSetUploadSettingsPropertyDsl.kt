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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * Information about the format for a source file or files.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * UploadSettingsProperty uploadSettingsProperty = UploadSettingsProperty.builder()
 * .containsHeader(false)
 * .delimiter("delimiter")
 * .format("format")
 * .startFromRow(123)
 * .textQualifier("textQualifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-uploadsettings.html)
 */
@CdkDslMarker
public class CfnDataSetUploadSettingsPropertyDsl {
    private val cdkBuilder: CfnDataSet.UploadSettingsProperty.Builder =
        CfnDataSet.UploadSettingsProperty.builder()

    /**
     * @param containsHeader Whether the file has a header row, or the files each have a header row.
     */
    public fun containsHeader(containsHeader: Boolean) {
        cdkBuilder.containsHeader(containsHeader)
    }

    /**
     * @param containsHeader Whether the file has a header row, or the files each have a header row.
     */
    public fun containsHeader(containsHeader: IResolvable) {
        cdkBuilder.containsHeader(containsHeader)
    }

    /** @param delimiter The delimiter between values in the file. */
    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    /** @param format File format. */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    /** @param startFromRow A row number to start reading data from. */
    public fun startFromRow(startFromRow: Number) {
        cdkBuilder.startFromRow(startFromRow)
    }

    /** @param textQualifier Text qualifier. */
    public fun textQualifier(textQualifier: String) {
        cdkBuilder.textQualifier(textQualifier)
    }

    public fun build(): CfnDataSet.UploadSettingsProperty = cdkBuilder.build()
}
