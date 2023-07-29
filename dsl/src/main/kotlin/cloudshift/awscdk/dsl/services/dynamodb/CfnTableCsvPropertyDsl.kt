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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dynamodb.CfnTable

/**
 * The options for imported source files in CSV format.
 *
 * The values are Delimiter and HeaderList.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * CsvProperty csvProperty = CsvProperty.builder()
 * .delimiter("delimiter")
 * .headerList(List.of("headerList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-csv.html)
 */
@CdkDslMarker
public class CfnTableCsvPropertyDsl {
    private val cdkBuilder: CfnTable.CsvProperty.Builder = CfnTable.CsvProperty.builder()

    private val _headerList: MutableList<String> = mutableListOf()

    /** @param delimiter The delimiter used for separating items in the CSV file being imported. */
    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    /**
     * @param headerList List of the headers used to specify a common header for all source CSV
     *   files being imported. If this field is specified then the first line of each CSV file is
     *   treated as data instead of the header. If this field is not specified the the first line of
     *   each CSV file is treated as the header.
     */
    public fun headerList(vararg headerList: String) {
        _headerList.addAll(listOf(*headerList))
    }

    /**
     * @param headerList List of the headers used to specify a common header for all source CSV
     *   files being imported. If this field is specified then the first line of each CSV file is
     *   treated as data instead of the header. If this field is not specified the the first line of
     *   each CSV file is treated as the header.
     */
    public fun headerList(headerList: Collection<String>) {
        _headerList.addAll(headerList)
    }

    public fun build(): CfnTable.CsvProperty {
        if (_headerList.isNotEmpty()) cdkBuilder.headerList(_headerList)
        return cdkBuilder.build()
    }
}
