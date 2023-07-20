@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDatasetExcelOptionsPropertyDsl {
    private val cdkBuilder: CfnDataset.ExcelOptionsProperty.Builder =
        CfnDataset.ExcelOptionsProperty.builder()

    private val _sheetIndexes: MutableList<Number> = mutableListOf()

    private val _sheetNames: MutableList<String> = mutableListOf()

    public fun headerRow(headerRow: Boolean) {
        cdkBuilder.headerRow(headerRow)
    }

    public fun headerRow(headerRow: IResolvable) {
        cdkBuilder.headerRow(headerRow)
    }

    public fun sheetIndexes(vararg sheetIndexes: Number) {
        _sheetIndexes.addAll(listOf(*sheetIndexes))
    }

    public fun sheetIndexes(sheetIndexes: Collection<Number>) {
        _sheetIndexes.addAll(sheetIndexes)
    }

    public fun sheetIndexes(sheetIndexes: IResolvable) {
        cdkBuilder.sheetIndexes(sheetIndexes)
    }

    public fun sheetNames(vararg sheetNames: String) {
        _sheetNames.addAll(listOf(*sheetNames))
    }

    public fun sheetNames(sheetNames: Collection<String>) {
        _sheetNames.addAll(sheetNames)
    }

    public fun build(): CfnDataset.ExcelOptionsProperty {
        if (_sheetIndexes.isNotEmpty()) cdkBuilder.sheetIndexes(_sheetIndexes)
        if (_sheetNames.isNotEmpty()) cdkBuilder.sheetNames(_sheetNames)
        return cdkBuilder.build()
    }
}
