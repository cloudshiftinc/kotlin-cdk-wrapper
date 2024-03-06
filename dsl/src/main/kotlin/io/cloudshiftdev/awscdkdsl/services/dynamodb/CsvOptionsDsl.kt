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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dynamodb.CsvOptions

/**
 * The options for imported source files in CSV format.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.s3.*;
 * IBucket bucket;
 * App app = new App();
 * Stack stack = new Stack(app, "Stack");
 * Table.Builder.create(stack, "Table")
 * .partitionKey(Attribute.builder()
 * .name("id")
 * .type(AttributeType.STRING)
 * .build())
 * .importSource(ImportSourceSpecification.builder()
 * .compressionType(InputCompressionType.GZIP)
 * .inputFormat(InputFormat.csv(CsvOptions.builder()
 * .delimiter(",")
 * .headerList(List.of("id", "name"))
 * .build()))
 * .bucket(bucket)
 * .keyPrefix("prefix")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CsvOptionsDsl {
    private val cdkBuilder: CsvOptions.Builder = CsvOptions.builder()

    private val _headerList: MutableList<String> = mutableListOf()

    /**
     * @param delimiter The delimiter used for separating items in the CSV file being imported.
     *   Valid delimiters are as follows:
     * * comma (`,`)
     * * tab (`\t`)
     * * colon (`:`)
     * * semicolon (`;`)
     * * pipe (`|`)
     * * space (` `)
     */
    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    /**
     * @param headerList List of the headers used to specify a common header for all source CSV
     *   files being imported. **NOTE**: If this field is specified then the first line of each CSV
     *   file is treated as data instead of the header. If this field is not specified the the first
     *   line of each CSV file is treated as the header.
     */
    public fun headerList(vararg headerList: String) {
        _headerList.addAll(listOf(*headerList))
    }

    /**
     * @param headerList List of the headers used to specify a common header for all source CSV
     *   files being imported. **NOTE**: If this field is specified then the first line of each CSV
     *   file is treated as data instead of the header. If this field is not specified the the first
     *   line of each CSV file is treated as the header.
     */
    public fun headerList(headerList: Collection<String>) {
        _headerList.addAll(headerList)
    }

    public fun build(): CsvOptions {
        if (_headerList.isNotEmpty()) cdkBuilder.headerList(_headerList)
        return cdkBuilder.build()
    }
}
