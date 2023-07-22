@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

@CdkDslMarker
public class CfnEvaluationFormEvaluationFormSingleSelectQuestionPropertiesPropertyDsl {
  private val cdkBuilder:
      CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty.Builder =
      CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty.builder()

  private val _options: MutableList<Any> = mutableListOf()

  /**
   * @param automation The display mode of the single select question.
   */
  public fun automation(automation: IResolvable) {
    cdkBuilder.automation(automation)
  }

  /**
   * @param automation The display mode of the single select question.
   */
  public
      fun automation(automation: CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty) {
    cdkBuilder.automation(automation)
  }

  /**
   * @param displayAs The display mode of the single select question.
   * *Allowed values* : `DROPDOWN` | `RADIO`
   */
  public fun displayAs(displayAs: String) {
    cdkBuilder.displayAs(displayAs)
  }

  /**
   * @param options The answer options of the single select question. 
   * *Minimum* : 2
   *
   * *Maximum* : 256
   */
  public fun options(vararg options: Any) {
    _options.addAll(listOf(*options))
  }

  /**
   * @param options The answer options of the single select question. 
   * *Minimum* : 2
   *
   * *Maximum* : 256
   */
  public fun options(options: Collection<Any>) {
    _options.addAll(options)
  }

  /**
   * @param options The answer options of the single select question. 
   * *Minimum* : 2
   *
   * *Maximum* : 256
   */
  public fun options(options: IResolvable) {
    cdkBuilder.options(options)
  }

  public fun build(): CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty {
    if(_options.isNotEmpty()) cdkBuilder.options(_options)
    return cdkBuilder.build()
  }
}
