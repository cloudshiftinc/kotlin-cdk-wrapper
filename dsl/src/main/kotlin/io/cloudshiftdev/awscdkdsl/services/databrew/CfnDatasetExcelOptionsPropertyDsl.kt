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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset

/**
 * Represents a set of options that define how DataBrew will interpret a Microsoft Excel file when
 * creating a dataset from that file.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * ExcelOptionsProperty excelOptionsProperty = ExcelOptionsProperty.builder()
 * .headerRow(false)
 * .sheetIndexes(List.of(123))
 * .sheetNames(List.of("sheetNames"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-exceloptions.html)
 */
@CdkDslMarker
public class CfnDatasetExcelOptionsPropertyDsl {
    private val cdkBuilder: CfnDataset.ExcelOptionsProperty.Builder =
        CfnDataset.ExcelOptionsProperty.builder()

    private val _sheetIndexes: MutableList<Number> = mutableListOf()

    private val _sheetNames: MutableList<String> = mutableListOf()

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

    /**
     * @param sheetIndexes One or more sheet numbers in the Excel file that will be included in the
     *   dataset.
     */
    public fun sheetIndexes(vararg sheetIndexes: Number) {
        _sheetIndexes.addAll(listOf(*sheetIndexes))
    }

    /**
     * @param sheetIndexes One or more sheet numbers in the Excel file that will be included in the
     *   dataset.
     */
    public fun sheetIndexes(sheetIndexes: Collection<Number>) {
        _sheetIndexes.addAll(sheetIndexes)
    }

    /**
     * @param sheetIndexes One or more sheet numbers in the Excel file that will be included in the
     *   dataset.
     */
    public fun sheetIndexes(sheetIndexes: IResolvable) {
        cdkBuilder.sheetIndexes(sheetIndexes)
    }

    /**
     * @param sheetNames One or more named sheets in the Excel file that will be included in the
     *   dataset.
     */
    public fun sheetNames(vararg sheetNames: String) {
        _sheetNames.addAll(listOf(*sheetNames))
    }

    /**
     * @param sheetNames One or more named sheets in the Excel file that will be included in the
     *   dataset.
     */
    public fun sheetNames(sheetNames: Collection<String>) {
        _sheetNames.addAll(sheetNames)
    }

    public fun build(): CfnDataset.ExcelOptionsProperty {
        if (_sheetIndexes.isNotEmpty()) cdkBuilder.sheetIndexes(_sheetIndexes)
        if (_sheetNames.isNotEmpty()) cdkBuilder.sheetNames(_sheetNames)
        return cdkBuilder.build()
    }
}
