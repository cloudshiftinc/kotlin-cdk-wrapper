@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorCsvFormatDescriptorPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.CsvFormatDescriptorProperty.Builder =
      CfnAnomalyDetector.CsvFormatDescriptorProperty.builder()

  private val _headerList: MutableList<String> = mutableListOf()

  /**
   * @param charset The character set in which the source CSV file is written.
   */
  public fun charset(charset: String) {
    cdkBuilder.charset(charset)
  }

  /**
   * @param containsHeader Whether or not the source CSV file contains a header.
   */
  public fun containsHeader(containsHeader: Boolean) {
    cdkBuilder.containsHeader(containsHeader)
  }

  /**
   * @param containsHeader Whether or not the source CSV file contains a header.
   */
  public fun containsHeader(containsHeader: IResolvable) {
    cdkBuilder.containsHeader(containsHeader)
  }

  /**
   * @param delimiter The character used to delimit the source CSV file.
   */
  public fun delimiter(delimiter: String) {
    cdkBuilder.delimiter(delimiter)
  }

  /**
   * @param fileCompression The level of compression of the source CSV file.
   */
  public fun fileCompression(fileCompression: String) {
    cdkBuilder.fileCompression(fileCompression)
  }

  /**
   * @param headerList A list of the source CSV file's headers, if any.
   */
  public fun headerList(vararg headerList: String) {
    _headerList.addAll(listOf(*headerList))
  }

  /**
   * @param headerList A list of the source CSV file's headers, if any.
   */
  public fun headerList(headerList: Collection<String>) {
    _headerList.addAll(headerList)
  }

  /**
   * @param quoteSymbol The character used as a quote character.
   */
  public fun quoteSymbol(quoteSymbol: String) {
    cdkBuilder.quoteSymbol(quoteSymbol)
  }

  public fun build(): CfnAnomalyDetector.CsvFormatDescriptorProperty {
    if(_headerList.isNotEmpty()) cdkBuilder.headerList(_headerList)
    return cdkBuilder.build()
  }
}
