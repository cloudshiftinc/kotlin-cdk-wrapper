@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetTransformOperationPropertyDsl {
  private val cdkBuilder: CfnDataSet.TransformOperationProperty.Builder =
      CfnDataSet.TransformOperationProperty.builder()

  public fun castColumnTypeOperation(castColumnTypeOperation: IResolvable) {
    cdkBuilder.castColumnTypeOperation(castColumnTypeOperation)
  }

  public
      fun castColumnTypeOperation(castColumnTypeOperation: CfnDataSet.CastColumnTypeOperationProperty) {
    cdkBuilder.castColumnTypeOperation(castColumnTypeOperation)
  }

  public fun createColumnsOperation(createColumnsOperation: IResolvable) {
    cdkBuilder.createColumnsOperation(createColumnsOperation)
  }

  public
      fun createColumnsOperation(createColumnsOperation: CfnDataSet.CreateColumnsOperationProperty) {
    cdkBuilder.createColumnsOperation(createColumnsOperation)
  }

  public fun filterOperation(filterOperation: IResolvable) {
    cdkBuilder.filterOperation(filterOperation)
  }

  public fun filterOperation(filterOperation: CfnDataSet.FilterOperationProperty) {
    cdkBuilder.filterOperation(filterOperation)
  }

  public fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: IResolvable) {
    cdkBuilder.overrideDatasetParameterOperation(overrideDatasetParameterOperation)
  }

  public
      fun overrideDatasetParameterOperation(overrideDatasetParameterOperation: CfnDataSet.OverrideDatasetParameterOperationProperty) {
    cdkBuilder.overrideDatasetParameterOperation(overrideDatasetParameterOperation)
  }

  public fun projectOperation(projectOperation: IResolvable) {
    cdkBuilder.projectOperation(projectOperation)
  }

  public fun projectOperation(projectOperation: CfnDataSet.ProjectOperationProperty) {
    cdkBuilder.projectOperation(projectOperation)
  }

  public fun renameColumnOperation(renameColumnOperation: IResolvable) {
    cdkBuilder.renameColumnOperation(renameColumnOperation)
  }

  public
      fun renameColumnOperation(renameColumnOperation: CfnDataSet.RenameColumnOperationProperty) {
    cdkBuilder.renameColumnOperation(renameColumnOperation)
  }

  public fun tagColumnOperation(tagColumnOperation: IResolvable) {
    cdkBuilder.tagColumnOperation(tagColumnOperation)
  }

  public fun tagColumnOperation(tagColumnOperation: CfnDataSet.TagColumnOperationProperty) {
    cdkBuilder.tagColumnOperation(tagColumnOperation)
  }

  public fun build(): CfnDataSet.TransformOperationProperty = cdkBuilder.build()
}
