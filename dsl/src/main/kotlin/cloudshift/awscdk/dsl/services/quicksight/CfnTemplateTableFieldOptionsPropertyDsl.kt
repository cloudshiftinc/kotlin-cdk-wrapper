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
public class CfnTemplateTableFieldOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableFieldOptionsProperty.Builder =
      CfnTemplate.TableFieldOptionsProperty.builder()

  private val _order: MutableList<String> = mutableListOf()

  private val _selectedFieldOptions: MutableList<Any> = mutableListOf()

  public fun order(vararg order: String) {
    _order.addAll(listOf(*order))
  }

  public fun order(order: Collection<String>) {
    _order.addAll(order)
  }

  public fun selectedFieldOptions(vararg selectedFieldOptions: Any) {
    _selectedFieldOptions.addAll(listOf(*selectedFieldOptions))
  }

  public fun selectedFieldOptions(selectedFieldOptions: Collection<Any>) {
    _selectedFieldOptions.addAll(selectedFieldOptions)
  }

  public fun selectedFieldOptions(selectedFieldOptions: IResolvable) {
    cdkBuilder.selectedFieldOptions(selectedFieldOptions)
  }

  public fun build(): CfnTemplate.TableFieldOptionsProperty {
    if(_order.isNotEmpty()) cdkBuilder.order(_order)
    if(_selectedFieldOptions.isNotEmpty()) cdkBuilder.selectedFieldOptions(_selectedFieldOptions)
    return cdkBuilder.build()
  }
}
