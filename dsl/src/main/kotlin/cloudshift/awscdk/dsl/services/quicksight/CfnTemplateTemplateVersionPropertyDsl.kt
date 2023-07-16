@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTemplateVersionPropertyDsl {
  private val cdkBuilder: CfnTemplate.TemplateVersionProperty.Builder =
      CfnTemplate.TemplateVersionProperty.builder()

  private val _dataSetConfigurations: MutableList<Any> = mutableListOf()

  private val _errors: MutableList<Any> = mutableListOf()

  private val _sheets: MutableList<Any> = mutableListOf()

  public fun createdTime(createdTime: String) {
    cdkBuilder.createdTime(createdTime)
  }

  public fun dataSetConfigurations(vararg dataSetConfigurations: Any) {
    _dataSetConfigurations.addAll(listOf(*dataSetConfigurations))
  }

  public fun dataSetConfigurations(dataSetConfigurations: Collection<Any>) {
    _dataSetConfigurations.addAll(dataSetConfigurations)
  }

  public fun dataSetConfigurations(dataSetConfigurations: IResolvable) {
    cdkBuilder.dataSetConfigurations(dataSetConfigurations)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun errors(vararg errors: Any) {
    _errors.addAll(listOf(*errors))
  }

  public fun errors(errors: Collection<Any>) {
    _errors.addAll(errors)
  }

  public fun errors(errors: IResolvable) {
    cdkBuilder.errors(errors)
  }

  public fun sheets(vararg sheets: Any) {
    _sheets.addAll(listOf(*sheets))
  }

  public fun sheets(sheets: Collection<Any>) {
    _sheets.addAll(sheets)
  }

  public fun sheets(sheets: IResolvable) {
    cdkBuilder.sheets(sheets)
  }

  public fun sourceEntityArn(sourceEntityArn: String) {
    cdkBuilder.sourceEntityArn(sourceEntityArn)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun themeArn(themeArn: String) {
    cdkBuilder.themeArn(themeArn)
  }

  public fun versionNumber(versionNumber: Number) {
    cdkBuilder.versionNumber(versionNumber)
  }

  public fun build(): CfnTemplate.TemplateVersionProperty {
    if(_dataSetConfigurations.isNotEmpty()) cdkBuilder.dataSetConfigurations(_dataSetConfigurations)
    if(_errors.isNotEmpty()) cdkBuilder.errors(_errors)
    if(_sheets.isNotEmpty()) cdkBuilder.sheets(_sheets)
    return cdkBuilder.build()
  }
}
