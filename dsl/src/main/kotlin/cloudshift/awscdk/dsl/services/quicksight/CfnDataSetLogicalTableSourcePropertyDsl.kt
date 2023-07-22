@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetLogicalTableSourcePropertyDsl {
  private val cdkBuilder: CfnDataSet.LogicalTableSourceProperty.Builder =
      CfnDataSet.LogicalTableSourceProperty.builder()

  /**
   * @param dataSetArn The Amazon Resource Number (ARN) of the parent dataset.
   */
  public fun dataSetArn(dataSetArn: String) {
    cdkBuilder.dataSetArn(dataSetArn)
  }

  /**
   * @param joinInstruction Specifies the result of a join of two logical tables.
   */
  public fun joinInstruction(joinInstruction: IResolvable) {
    cdkBuilder.joinInstruction(joinInstruction)
  }

  /**
   * @param joinInstruction Specifies the result of a join of two logical tables.
   */
  public fun joinInstruction(joinInstruction: CfnDataSet.JoinInstructionProperty) {
    cdkBuilder.joinInstruction(joinInstruction)
  }

  /**
   * @param physicalTableId Physical table ID.
   */
  public fun physicalTableId(physicalTableId: String) {
    cdkBuilder.physicalTableId(physicalTableId)
  }

  public fun build(): CfnDataSet.LogicalTableSourceProperty = cdkBuilder.build()
}
