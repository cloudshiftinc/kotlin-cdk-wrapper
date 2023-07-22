@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * Information about the source of a logical table.
 *
 * This is a variant type structure. For this structure to be valid, only one of the attributes can
 * be non-null.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LogicalTableSourceProperty logicalTableSourceProperty = LogicalTableSourceProperty.builder()
 * .dataSetArn("dataSetArn")
 * .joinInstruction(JoinInstructionProperty.builder()
 * .leftOperand("leftOperand")
 * .onClause("onClause")
 * .rightOperand("rightOperand")
 * .type("type")
 * // the properties below are optional
 * .leftJoinKeyProperties(JoinKeyPropertiesProperty.builder()
 * .uniqueKey(false)
 * .build())
 * .rightJoinKeyProperties(JoinKeyPropertiesProperty.builder()
 * .uniqueKey(false)
 * .build())
 * .build())
 * .physicalTableId("physicalTableId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltablesource.html)
 */
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
