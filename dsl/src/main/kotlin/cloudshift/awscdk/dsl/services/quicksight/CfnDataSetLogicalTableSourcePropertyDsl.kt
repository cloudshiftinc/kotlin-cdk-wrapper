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

  public fun dataSetArn(dataSetArn: String) {
    cdkBuilder.dataSetArn(dataSetArn)
  }

  public fun joinInstruction(joinInstruction: IResolvable) {
    cdkBuilder.joinInstruction(joinInstruction)
  }

  public fun joinInstruction(joinInstruction: CfnDataSet.JoinInstructionProperty) {
    cdkBuilder.joinInstruction(joinInstruction)
  }

  public fun physicalTableId(physicalTableId: String) {
    cdkBuilder.physicalTableId(physicalTableId)
  }

  public fun build(): CfnDataSet.LogicalTableSourceProperty = cdkBuilder.build()
}
