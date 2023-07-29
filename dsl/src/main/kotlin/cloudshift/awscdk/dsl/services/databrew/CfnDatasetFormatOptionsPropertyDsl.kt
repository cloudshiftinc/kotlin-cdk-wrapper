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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset

/**
 * Represents a set of options that define the structure of either comma-separated value (CSV),
 * Excel, or JSON input.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * FormatOptionsProperty formatOptionsProperty = FormatOptionsProperty.builder()
 * .csv(CsvOptionsProperty.builder()
 * .delimiter("delimiter")
 * .headerRow(false)
 * .build())
 * .excel(ExcelOptionsProperty.builder()
 * .headerRow(false)
 * .sheetIndexes(List.of(123))
 * .sheetNames(List.of("sheetNames"))
 * .build())
 * .json(JsonOptionsProperty.builder()
 * .multiLine(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-formatoptions.html)
 */
@CdkDslMarker
public class CfnDatasetFormatOptionsPropertyDsl {
    private val cdkBuilder: CfnDataset.FormatOptionsProperty.Builder =
        CfnDataset.FormatOptionsProperty.builder()

    /** @param csv Options that define how CSV input is to be interpreted by DataBrew. */
    public fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv)
    }

    /** @param csv Options that define how CSV input is to be interpreted by DataBrew. */
    public fun csv(csv: CfnDataset.CsvOptionsProperty) {
        cdkBuilder.csv(csv)
    }

    /** @param excel Options that define how Excel input is to be interpreted by DataBrew. */
    public fun excel(excel: IResolvable) {
        cdkBuilder.excel(excel)
    }

    /** @param excel Options that define how Excel input is to be interpreted by DataBrew. */
    public fun excel(excel: CfnDataset.ExcelOptionsProperty) {
        cdkBuilder.excel(excel)
    }

    /** @param json Options that define how JSON input is to be interpreted by DataBrew. */
    public fun json(json: IResolvable) {
        cdkBuilder.json(json)
    }

    /** @param json Options that define how JSON input is to be interpreted by DataBrew. */
    public fun json(json: CfnDataset.JsonOptionsProperty) {
        cdkBuilder.json(json)
    }

    public fun build(): CfnDataset.FormatOptionsProperty = cdkBuilder.build()
}
