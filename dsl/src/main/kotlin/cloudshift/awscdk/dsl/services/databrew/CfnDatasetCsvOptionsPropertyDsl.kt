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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset

/**
 * Represents a set of options that define how DataBrew will read a comma-separated value (CSV) file
 * when creating a dataset from that file.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * CsvOptionsProperty csvOptionsProperty = CsvOptionsProperty.builder()
 * .delimiter("delimiter")
 * .headerRow(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-csvoptions.html)
 */
@CdkDslMarker
public class CfnDatasetCsvOptionsPropertyDsl {
    private val cdkBuilder: CfnDataset.CsvOptionsProperty.Builder =
        CfnDataset.CsvOptionsProperty.builder()

    /**
     * @param delimiter A single character that specifies the delimiter being used in the CSV file.
     */
    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    /**
     * @param headerRow A variable that specifies whether the first row in the file is parsed as the
     *   header. If this value is false, column names are auto-generated.
     */
    public fun headerRow(headerRow: Boolean) {
        cdkBuilder.headerRow(headerRow)
    }

    /**
     * @param headerRow A variable that specifies whether the first row in the file is parsed as the
     *   header. If this value is false, column names are auto-generated.
     */
    public fun headerRow(headerRow: IResolvable) {
        cdkBuilder.headerRow(headerRow)
    }

    public fun build(): CfnDataset.CsvOptionsProperty = cdkBuilder.build()
}
