@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnClassifier

@CdkDslMarker
public class CfnClassifierCsvClassifierPropertyDsl {
  private val cdkBuilder: CfnClassifier.CsvClassifierProperty.Builder =
      CfnClassifier.CsvClassifierProperty.builder()

  private val _header: MutableList<String> = mutableListOf()

  public fun allowSingleColumn(allowSingleColumn: Boolean) {
    cdkBuilder.allowSingleColumn(allowSingleColumn)
  }

  public fun allowSingleColumn(allowSingleColumn: IResolvable) {
    cdkBuilder.allowSingleColumn(allowSingleColumn)
  }

  public fun containsHeader(containsHeader: String) {
    cdkBuilder.containsHeader(containsHeader)
  }

  public fun delimiter(delimiter: String) {
    cdkBuilder.delimiter(delimiter)
  }

  public fun disableValueTrimming(disableValueTrimming: Boolean) {
    cdkBuilder.disableValueTrimming(disableValueTrimming)
  }

  public fun disableValueTrimming(disableValueTrimming: IResolvable) {
    cdkBuilder.disableValueTrimming(disableValueTrimming)
  }

  public fun `header`(vararg `header`: String) {
    _header.addAll(listOf(*`header`))
  }

  public fun `header`(`header`: Collection<String>) {
    _header.addAll(`header`)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun quoteSymbol(quoteSymbol: String) {
    cdkBuilder.quoteSymbol(quoteSymbol)
  }

  public fun build(): CfnClassifier.CsvClassifierProperty {
    if(_header.isNotEmpty()) cdkBuilder.`header`(_header)
    return cdkBuilder.build()
  }
}
