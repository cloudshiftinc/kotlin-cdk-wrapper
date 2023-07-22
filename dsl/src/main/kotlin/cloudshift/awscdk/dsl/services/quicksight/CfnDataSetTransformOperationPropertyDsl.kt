@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetTransformOperationPropertyDsl {
  private val cdkBuilder: CfnDataSet.TransformOperationProperty.Builder =
      CfnDataSet.TransformOperationProperty.builder()

  /**
   * @param castColumnTypeOperation A transform operation that casts a column to a different type.
   */
  public fun castColumnTypeOperation(castColumnTypeOperation: IResolvable) {
    cdkBuilder.castColumnTypeOperation(castColumnTypeOperation)
  }

  /**
   * @param castColumnTypeOperation A transform operation that casts a column to a different type.
   */
  public
      fun castColumnTypeOperation(castColumnTypeOperation: CfnDataSet.CastColumnTypeOperationProperty) {
    cdkBuilder.castColumnTypeOperation(castColumnTypeOperation)
  }

  /**
   * @param createColumnsOperation An operation that creates calculated columns.
   * Columns created in one such operation form a lexical closure.
   */
  public fun createColumnsOperation(createColumnsOperation: IResolvable) {
    cdkBuilder.createColumnsOperation(createColumnsOperation)
  }

  /**
   * @param createColumnsOperation An operation that creates calculated columns.
   * Columns created in one such operation form a lexical closure.
   */
  public
      fun createColumnsOperation(createColumnsOperation: CfnDataSet.CreateColumnsOperationProperty) {
    cdkBuilder.createColumnsOperation(createColumnsOperation)
  }

  /**
   * @param filterOperation An operation that filters rows based on some condition.
   */
  public fun filterOperation(filterOperation: IResolvable) {
    cdkBuilder.filterOperation(filterOperation)
  }

  /**
   * @param filterOperation An operation that filters rows based on some condition.
   */
  public fun filterOperation(filterOperation: CfnDataSet.FilterOperationProperty) {
    cdkBuilder.filterOperation(filterOperation)
  }

  /**
   * @param overrideDatasetParameterOperation A transform operation that overrides the dataset
   * parameter values defined in another dataset.</p>.
   */
  public fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: IResolvable) {
    cdkBuilder.overrideDatasetParameterOperation(overrideDatasetParameterOperation)
  }

  /**
   * @param overrideDatasetParameterOperation A transform operation that overrides the dataset
   * parameter values defined in another dataset.</p>.
   */
  public
      fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: CfnDataSet.OverrideDatasetParameterOperationProperty) {
    cdkBuilder.overrideDatasetParameterOperation(overrideDatasetParameterOperation)
  }

  /**
   * @param projectOperation An operation that projects columns.
   * Operations that come after a projection can only refer to projected columns.
   */
  public fun projectOperation(projectOperation: IResolvable) {
    cdkBuilder.projectOperation(projectOperation)
  }

  /**
   * @param projectOperation An operation that projects columns.
   * Operations that come after a projection can only refer to projected columns.
   */
  public fun projectOperation(projectOperation: CfnDataSet.ProjectOperationProperty) {
    cdkBuilder.projectOperation(projectOperation)
  }

  /**
   * @param renameColumnOperation An operation that renames a column.
   */
  public fun renameColumnOperation(renameColumnOperation: IResolvable) {
    cdkBuilder.renameColumnOperation(renameColumnOperation)
  }

  /**
   * @param renameColumnOperation An operation that renames a column.
   */
  public
      fun renameColumnOperation(renameColumnOperation: CfnDataSet.RenameColumnOperationProperty) {
    cdkBuilder.renameColumnOperation(renameColumnOperation)
  }

  /**
   * @param tagColumnOperation An operation that tags a column with additional information.
   */
  public fun tagColumnOperation(tagColumnOperation: IResolvable) {
    cdkBuilder.tagColumnOperation(tagColumnOperation)
  }

  /**
   * @param tagColumnOperation An operation that tags a column with additional information.
   */
  public fun tagColumnOperation(tagColumnOperation: CfnDataSet.TagColumnOperationProperty) {
    cdkBuilder.tagColumnOperation(tagColumnOperation)
  }

  public fun build(): CfnDataSet.TransformOperationProperty = cdkBuilder.build()
}
