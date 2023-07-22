@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetJoinInstructionPropertyDsl {
  private val cdkBuilder: CfnDataSet.JoinInstructionProperty.Builder =
      CfnDataSet.JoinInstructionProperty.builder()

  /**
   * @param leftJoinKeyProperties Join key properties of the left operand.
   */
  public fun leftJoinKeyProperties(leftJoinKeyProperties: IResolvable) {
    cdkBuilder.leftJoinKeyProperties(leftJoinKeyProperties)
  }

  /**
   * @param leftJoinKeyProperties Join key properties of the left operand.
   */
  public fun leftJoinKeyProperties(leftJoinKeyProperties: CfnDataSet.JoinKeyPropertiesProperty) {
    cdkBuilder.leftJoinKeyProperties(leftJoinKeyProperties)
  }

  /**
   * @param leftOperand The operand on the left side of a join. 
   */
  public fun leftOperand(leftOperand: String) {
    cdkBuilder.leftOperand(leftOperand)
  }

  /**
   * @param onClause The join instructions provided in the `ON` clause of a join. 
   */
  public fun onClause(onClause: String) {
    cdkBuilder.onClause(onClause)
  }

  /**
   * @param rightJoinKeyProperties Join key properties of the right operand.
   */
  public fun rightJoinKeyProperties(rightJoinKeyProperties: IResolvable) {
    cdkBuilder.rightJoinKeyProperties(rightJoinKeyProperties)
  }

  /**
   * @param rightJoinKeyProperties Join key properties of the right operand.
   */
  public fun rightJoinKeyProperties(rightJoinKeyProperties: CfnDataSet.JoinKeyPropertiesProperty) {
    cdkBuilder.rightJoinKeyProperties(rightJoinKeyProperties)
  }

  /**
   * @param rightOperand The operand on the right side of a join. 
   */
  public fun rightOperand(rightOperand: String) {
    cdkBuilder.rightOperand(rightOperand)
  }

  /**
   * @param type The type of join that it is. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDataSet.JoinInstructionProperty = cdkBuilder.build()
}
