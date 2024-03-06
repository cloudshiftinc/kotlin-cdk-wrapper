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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnClassifier

/**
 * A classifier for custom `CSV` content.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CsvClassifierProperty csvClassifierProperty = CsvClassifierProperty.builder()
 * .allowSingleColumn(false)
 * .containsCustomDatatype(List.of("containsCustomDatatype"))
 * .containsHeader("containsHeader")
 * .customDatatypeConfigured(false)
 * .delimiter("delimiter")
 * .disableValueTrimming(false)
 * .header(List.of("header"))
 * .name("name")
 * .quoteSymbol("quoteSymbol")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-csvclassifier.html)
 */
@CdkDslMarker
public class CfnClassifierCsvClassifierPropertyDsl {
    private val cdkBuilder: CfnClassifier.CsvClassifierProperty.Builder =
        CfnClassifier.CsvClassifierProperty.builder()

    private val _containsCustomDatatype: MutableList<String> = mutableListOf()

    private val _header: MutableList<String> = mutableListOf()

    /** @param allowSingleColumn Enables the processing of files that contain only one column. */
    public fun allowSingleColumn(allowSingleColumn: Boolean) {
        cdkBuilder.allowSingleColumn(allowSingleColumn)
    }

    /** @param allowSingleColumn Enables the processing of files that contain only one column. */
    public fun allowSingleColumn(allowSingleColumn: IResolvable) {
        cdkBuilder.allowSingleColumn(allowSingleColumn)
    }

    /** @param containsCustomDatatype Indicates whether the CSV file contains custom data types. */
    public fun containsCustomDatatype(vararg containsCustomDatatype: String) {
        _containsCustomDatatype.addAll(listOf(*containsCustomDatatype))
    }

    /** @param containsCustomDatatype Indicates whether the CSV file contains custom data types. */
    public fun containsCustomDatatype(containsCustomDatatype: Collection<String>) {
        _containsCustomDatatype.addAll(containsCustomDatatype)
    }

    /**
     * @param containsHeader Indicates whether the CSV file contains a header. A value of `UNKNOWN`
     *   specifies that the classifier will detect whether the CSV file contains headings.
     *
     * A value of `PRESENT` specifies that the CSV file contains headings.
     *
     * A value of `ABSENT` specifies that the CSV file does not contain headings.
     */
    public fun containsHeader(containsHeader: String) {
        cdkBuilder.containsHeader(containsHeader)
    }

    /** @param customDatatypeConfigured Enables the configuration of custom data types. */
    public fun customDatatypeConfigured(customDatatypeConfigured: Boolean) {
        cdkBuilder.customDatatypeConfigured(customDatatypeConfigured)
    }

    /** @param customDatatypeConfigured Enables the configuration of custom data types. */
    public fun customDatatypeConfigured(customDatatypeConfigured: IResolvable) {
        cdkBuilder.customDatatypeConfigured(customDatatypeConfigured)
    }

    /** @param delimiter A custom symbol to denote what separates each column entry in the row. */
    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    /**
     * @param disableValueTrimming Specifies not to trim values before identifying the type of
     *   column values. The default value is `true` .
     */
    public fun disableValueTrimming(disableValueTrimming: Boolean) {
        cdkBuilder.disableValueTrimming(disableValueTrimming)
    }

    /**
     * @param disableValueTrimming Specifies not to trim values before identifying the type of
     *   column values. The default value is `true` .
     */
    public fun disableValueTrimming(disableValueTrimming: IResolvable) {
        cdkBuilder.disableValueTrimming(disableValueTrimming)
    }

    /** @param header A list of strings representing column names. */
    public fun `header`(vararg `header`: String) {
        _header.addAll(listOf(*`header`))
    }

    /** @param header A list of strings representing column names. */
    public fun `header`(`header`: Collection<String>) {
        _header.addAll(`header`)
    }

    /** @param name The name of the classifier. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param quoteSymbol A custom symbol to denote what combines content into a single column
     *   value. It must be different from the column delimiter.
     */
    public fun quoteSymbol(quoteSymbol: String) {
        cdkBuilder.quoteSymbol(quoteSymbol)
    }

    public fun build(): CfnClassifier.CsvClassifierProperty {
        if (_containsCustomDatatype.isNotEmpty())
            cdkBuilder.containsCustomDatatype(_containsCustomDatatype)
        if (_header.isNotEmpty()) cdkBuilder.`header`(_header)
        return cdkBuilder.build()
    }
}
