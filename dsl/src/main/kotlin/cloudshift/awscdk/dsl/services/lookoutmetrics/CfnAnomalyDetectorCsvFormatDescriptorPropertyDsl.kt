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

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnomalyDetectorCsvFormatDescriptorPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.CsvFormatDescriptorProperty.Builder =
        CfnAnomalyDetector.CsvFormatDescriptorProperty.builder()

    private val _headerList: MutableList<String> = mutableListOf()

    public fun charset(charset: String) {
        cdkBuilder.charset(charset)
    }

    public fun containsHeader(containsHeader: Boolean) {
        cdkBuilder.containsHeader(containsHeader)
    }

    public fun containsHeader(containsHeader: IResolvable) {
        cdkBuilder.containsHeader(containsHeader)
    }

    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    public fun fileCompression(fileCompression: String) {
        cdkBuilder.fileCompression(fileCompression)
    }

    public fun headerList(vararg headerList: String) {
        _headerList.addAll(listOf(*headerList))
    }

    public fun headerList(headerList: Collection<String>) {
        _headerList.addAll(headerList)
    }

    public fun quoteSymbol(quoteSymbol: String) {
        cdkBuilder.quoteSymbol(quoteSymbol)
    }

    public fun build(): CfnAnomalyDetector.CsvFormatDescriptorProperty {
        if (_headerList.isNotEmpty()) cdkBuilder.headerList(_headerList)
        return cdkBuilder.build()
    }
}
