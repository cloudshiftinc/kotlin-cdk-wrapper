@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

@CdkDslMarker
public class CfnComponentComponentConditionPropertyPropertyDsl {
  private val cdkBuilder: CfnComponent.ComponentConditionPropertyProperty.Builder =
      CfnComponent.ComponentConditionPropertyProperty.builder()

  /**
   * @param elseValue The value to assign to the property if the condition is not met.
   */
  public fun elseValue(elseValue: IResolvable) {
    cdkBuilder.elseValue(elseValue)
  }

  /**
   * @param elseValue The value to assign to the property if the condition is not met.
   */
  public fun elseValue(elseValue: CfnComponent.ComponentPropertyProperty) {
    cdkBuilder.elseValue(elseValue)
  }

  /**
   * @param field The name of a field.
   * Specify this when the property is a data model.
   */
  public fun `field`(`field`: String) {
    cdkBuilder.`field`(`field`)
  }

  /**
   * @param operand The value of the property to evaluate.
   */
  public fun operand(operand: String) {
    cdkBuilder.operand(operand)
  }

  /**
   * @param operandType The type of the property to evaluate.
   */
  public fun operandType(operandType: String) {
    cdkBuilder.operandType(operandType)
  }

  /**
   * @param operator The operator to use to perform the evaluation, such as `eq` to represent
   * equals.
   */
  public fun `operator`(`operator`: String) {
    cdkBuilder.`operator`(`operator`)
  }

  /**
   * @param property The name of the conditional property.
   */
  public fun `property`(`property`: String) {
    cdkBuilder.`property`(`property`)
  }

  /**
   * @param then The value to assign to the property if the condition is met.
   */
  public fun then(then: IResolvable) {
    cdkBuilder.then(then)
  }

  /**
   * @param then The value to assign to the property if the condition is met.
   */
  public fun then(then: CfnComponent.ComponentPropertyProperty) {
    cdkBuilder.then(then)
  }

  public fun build(): CfnComponent.ComponentConditionPropertyProperty = cdkBuilder.build()
}
