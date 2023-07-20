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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.dynamodb.CfnTable
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTableCsvPropertyDsl {
    private val cdkBuilder: CfnTable.CsvProperty.Builder = CfnTable.CsvProperty.builder()

    private val _headerList: MutableList<String> = mutableListOf()

    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    public fun headerList(vararg headerList: String) {
        _headerList.addAll(listOf(*headerList))
    }

    public fun headerList(headerList: Collection<String>) {
        _headerList.addAll(headerList)
    }

    public fun build(): CfnTable.CsvProperty {
        if (_headerList.isNotEmpty()) cdkBuilder.headerList(_headerList)
        return cdkBuilder.build()
    }
}
