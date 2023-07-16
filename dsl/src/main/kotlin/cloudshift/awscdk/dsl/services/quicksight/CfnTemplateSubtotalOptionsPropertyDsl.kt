@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSubtotalOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.SubtotalOptionsProperty.Builder =
      CfnTemplate.SubtotalOptionsProperty.builder()

  private val _fieldLevelOptions: MutableList<Any> = mutableListOf()

  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
  }

  public fun fieldLevel(fieldLevel: String) {
    cdkBuilder.fieldLevel(fieldLevel)
  }

  public fun fieldLevelOptions(vararg fieldLevelOptions: Any) {
    _fieldLevelOptions.addAll(listOf(*fieldLevelOptions))
  }

  public fun fieldLevelOptions(fieldLevelOptions: Collection<Any>) {
    _fieldLevelOptions.addAll(fieldLevelOptions)
  }

  public fun fieldLevelOptions(fieldLevelOptions: IResolvable) {
    cdkBuilder.fieldLevelOptions(fieldLevelOptions)
  }

  public fun metricHeaderCellStyle(metricHeaderCellStyle: IResolvable) {
    cdkBuilder.metricHeaderCellStyle(metricHeaderCellStyle)
  }

  public fun metricHeaderCellStyle(metricHeaderCellStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.metricHeaderCellStyle(metricHeaderCellStyle)
  }

  public fun totalCellStyle(totalCellStyle: IResolvable) {
    cdkBuilder.totalCellStyle(totalCellStyle)
  }

  public fun totalCellStyle(totalCellStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.totalCellStyle(totalCellStyle)
  }

  public fun totalsVisibility(totalsVisibility: String) {
    cdkBuilder.totalsVisibility(totalsVisibility)
  }

  public fun valueCellStyle(valueCellStyle: IResolvable) {
    cdkBuilder.valueCellStyle(valueCellStyle)
  }

  public fun valueCellStyle(valueCellStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.valueCellStyle(valueCellStyle)
  }

  public fun build(): CfnTemplate.SubtotalOptionsProperty {
    if(_fieldLevelOptions.isNotEmpty()) cdkBuilder.fieldLevelOptions(_fieldLevelOptions)
    return cdkBuilder.build()
  }
}
