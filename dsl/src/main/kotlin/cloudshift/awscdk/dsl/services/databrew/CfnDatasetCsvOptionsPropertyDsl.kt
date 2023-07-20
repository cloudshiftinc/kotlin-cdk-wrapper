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
import kotlin.String

@CdkDslMarker
public class CfnDatasetCsvOptionsPropertyDsl {
    private val cdkBuilder: CfnDataset.CsvOptionsProperty.Builder =
        CfnDataset.CsvOptionsProperty.builder()

    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    public fun headerRow(headerRow: Boolean) {
        cdkBuilder.headerRow(headerRow)
    }

    public fun headerRow(headerRow: IResolvable) {
        cdkBuilder.headerRow(headerRow)
    }

    public fun build(): CfnDataset.CsvOptionsProperty = cdkBuilder.build()
}
