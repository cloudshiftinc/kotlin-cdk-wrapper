@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

@CdkDslMarker
public class CfnEvaluationFormEvaluationFormSectionPropertyDsl {
  private val cdkBuilder: CfnEvaluationForm.EvaluationFormSectionProperty.Builder =
      CfnEvaluationForm.EvaluationFormSectionProperty.builder()

  private val _items: MutableList<Any> = mutableListOf()

  /**
   * @param instructions The instructions of the section.
   */
  public fun instructions(instructions: String) {
    cdkBuilder.instructions(instructions)
  }

  /**
   * @param items The items of the section.
   * *Minimum* : 1
   */
  public fun items(vararg items: Any) {
    _items.addAll(listOf(*items))
  }

  /**
   * @param items The items of the section.
   * *Minimum* : 1
   */
  public fun items(items: Collection<Any>) {
    _items.addAll(items)
  }

  /**
   * @param items The items of the section.
   * *Minimum* : 1
   */
  public fun items(items: IResolvable) {
    cdkBuilder.items(items)
  }

  /**
   * @param refId The identifier of the section. An identifier must be unique within the evaluation
   * form. 
   * *Length Constraints* : Minimum length of 1. Maximum length of 40.
   */
  public fun refId(refId: String) {
    cdkBuilder.refId(refId)
  }

  /**
   * @param title The title of the section. 
   * *Length Constraints* : Minimum length of 1. Maximum length of 128.
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  /**
   * @param weight The scoring weight of the section.
   * *Minimum* : 0
   *
   * *Maximum* : 100
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnEvaluationForm.EvaluationFormSectionProperty {
    if(_items.isNotEmpty()) cdkBuilder.items(_items)
    return cdkBuilder.build()
  }
}
