@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * A *logical table* is a unit that joins and that data transformations operate on.
 *
 * A logical table has a source, which can be either a physical table or result of a join. When a
 * logical table points to a physical table, the logical table acts as a mutable copy of that physical
 * table through transform operations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LogicalTableProperty logicalTableProperty = LogicalTableProperty.builder()
 * .alias("alias")
 * .source(LogicalTableSourceProperty.builder()
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
 * .build())
 * // the properties below are optional
 * .dataTransforms(List.of(TransformOperationProperty.builder()
 * .castColumnTypeOperation(CastColumnTypeOperationProperty.builder()
 * .columnName("columnName")
 * .newColumnType("newColumnType")
 * // the properties below are optional
 * .format("format")
 * .build())
 * .createColumnsOperation(CreateColumnsOperationProperty.builder()
 * .columns(List.of(CalculatedColumnProperty.builder()
 * .columnId("columnId")
 * .columnName("columnName")
 * .expression("expression")
 * .build()))
 * .build())
 * .filterOperation(FilterOperationProperty.builder()
 * .conditionExpression("conditionExpression")
 * .build())
 * .overrideDatasetParameterOperation(OverrideDatasetParameterOperationProperty.builder()
 * .parameterName("parameterName")
 * // the properties below are optional
 * .newDefaultValues(NewDefaultValuesProperty.builder()
 * .dateTimeStaticValues(List.of("dateTimeStaticValues"))
 * .decimalStaticValues(List.of(123))
 * .integerStaticValues(List.of(123))
 * .stringStaticValues(List.of("stringStaticValues"))
 * .build())
 * .newParameterName("newParameterName")
 * .build())
 * .projectOperation(ProjectOperationProperty.builder()
 * .projectedColumns(List.of("projectedColumns"))
 * .build())
 * .renameColumnOperation(RenameColumnOperationProperty.builder()
 * .columnName("columnName")
 * .newColumnName("newColumnName")
 * .build())
 * .tagColumnOperation(TagColumnOperationProperty.builder()
 * .columnName("columnName")
 * .tags(List.of(ColumnTagProperty.builder()
 * .columnDescription(ColumnDescriptionProperty.builder()
 * .text("text")
 * .build())
 * .columnGeographicRole("columnGeographicRole")
 * .build()))
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-logicaltable.html)
 */
@CdkDslMarker
public class CfnDataSetLogicalTablePropertyDsl {
  private val cdkBuilder: CfnDataSet.LogicalTableProperty.Builder =
      CfnDataSet.LogicalTableProperty.builder()

  private val _dataTransforms: MutableList<Any> = mutableListOf()

  /**
   * @param alias A display name for the logical table. 
   */
  public fun alias(alias: String) {
    cdkBuilder.alias(alias)
  }

  /**
   * @param dataTransforms Transform operations that act on this logical table.
   * For this structure to be valid, only one of the attributes can be non-null.
   */
  public fun dataTransforms(vararg dataTransforms: Any) {
    _dataTransforms.addAll(listOf(*dataTransforms))
  }

  /**
   * @param dataTransforms Transform operations that act on this logical table.
   * For this structure to be valid, only one of the attributes can be non-null.
   */
  public fun dataTransforms(dataTransforms: Collection<Any>) {
    _dataTransforms.addAll(dataTransforms)
  }

  /**
   * @param dataTransforms Transform operations that act on this logical table.
   * For this structure to be valid, only one of the attributes can be non-null.
   */
  public fun dataTransforms(dataTransforms: IResolvable) {
    cdkBuilder.dataTransforms(dataTransforms)
  }

  /**
   * @param source Source of this logical table. 
   */
  public fun source(source: IResolvable) {
    cdkBuilder.source(source)
  }

  /**
   * @param source Source of this logical table. 
   */
  public fun source(source: CfnDataSet.LogicalTableSourceProperty) {
    cdkBuilder.source(source)
  }

  public fun build(): CfnDataSet.LogicalTableProperty {
    if(_dataTransforms.isNotEmpty()) cdkBuilder.dataTransforms(_dataTransforms)
    return cdkBuilder.build()
  }
}
