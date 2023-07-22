@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

@CdkDslMarker
public class CfnEvaluationFormEvaluationFormNumericQuestionPropertiesPropertyDsl {
  private val cdkBuilder: CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty.Builder
      = CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty.builder()

  private val _options: MutableList<Any> = mutableListOf()

  /**
   * @param automation The automation properties of the numeric question.
   */
  public fun automation(automation: IResolvable) {
    cdkBuilder.automation(automation)
  }

  /**
   * @param automation The automation properties of the numeric question.
   */
  public
      fun automation(automation: CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty) {
    cdkBuilder.automation(automation)
  }

  /**
   * @param maxValue The maximum answer value. 
   */
  public fun maxValue(maxValue: Number) {
    cdkBuilder.maxValue(maxValue)
  }

  /**
   * @param minValue The minimum answer value. 
   */
  public fun minValue(minValue: Number) {
    cdkBuilder.minValue(minValue)
  }

  /**
   * @param options The scoring options of the numeric question.
   */
  public fun options(vararg options: Any) {
    _options.addAll(listOf(*options))
  }

  /**
   * @param options The scoring options of the numeric question.
   */
  public fun options(options: Collection<Any>) {
    _options.addAll(options)
  }

  /**
   * @param options The scoring options of the numeric question.
   */
  public fun options(options: IResolvable) {
    cdkBuilder.options(options)
  }

  public fun build(): CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty {
    if(_options.isNotEmpty()) cdkBuilder.options(_options)
    return cdkBuilder.build()
  }
}
