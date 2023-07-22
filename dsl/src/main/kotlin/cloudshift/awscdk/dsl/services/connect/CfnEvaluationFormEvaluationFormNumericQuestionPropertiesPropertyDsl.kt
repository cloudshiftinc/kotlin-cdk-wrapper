@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

/**
 * Information about properties for a numeric question in an evaluation form.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * EvaluationFormNumericQuestionPropertiesProperty evaluationFormNumericQuestionPropertiesProperty =
 * EvaluationFormNumericQuestionPropertiesProperty.builder()
 * .maxValue(123)
 * .minValue(123)
 * // the properties below are optional
 * .automation(EvaluationFormNumericQuestionAutomationProperty.builder()
 * .propertyValue(NumericQuestionPropertyValueAutomationProperty.builder()
 * .label("label")
 * .build())
 * .build())
 * .options(List.of(EvaluationFormNumericQuestionOptionProperty.builder()
 * .maxValue(123)
 * .minValue(123)
 * // the properties below are optional
 * .automaticFail(false)
 * .score(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionproperties.html)
 */
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
