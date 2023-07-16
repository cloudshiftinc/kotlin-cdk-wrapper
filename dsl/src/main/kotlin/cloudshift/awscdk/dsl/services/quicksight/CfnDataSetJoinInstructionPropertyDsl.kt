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

  public fun leftJoinKeyProperties(leftJoinKeyProperties: IResolvable) {
    cdkBuilder.leftJoinKeyProperties(leftJoinKeyProperties)
  }

  public fun leftJoinKeyProperties(leftJoinKeyProperties: CfnDataSet.JoinKeyPropertiesProperty) {
    cdkBuilder.leftJoinKeyProperties(leftJoinKeyProperties)
  }

  public fun leftOperand(leftOperand: String) {
    cdkBuilder.leftOperand(leftOperand)
  }

  public fun onClause(onClause: String) {
    cdkBuilder.onClause(onClause)
  }

  public fun rightJoinKeyProperties(rightJoinKeyProperties: IResolvable) {
    cdkBuilder.rightJoinKeyProperties(rightJoinKeyProperties)
  }

  public fun rightJoinKeyProperties(rightJoinKeyProperties: CfnDataSet.JoinKeyPropertiesProperty) {
    cdkBuilder.rightJoinKeyProperties(rightJoinKeyProperties)
  }

  public fun rightOperand(rightOperand: String) {
    cdkBuilder.rightOperand(rightOperand)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDataSet.JoinInstructionProperty = cdkBuilder.build()
}
