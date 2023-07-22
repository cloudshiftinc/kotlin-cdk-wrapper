@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * A transform operation that renames a column.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RenameColumnOperationProperty renameColumnOperationProperty =
 * RenameColumnOperationProperty.builder()
 * .columnName("columnName")
 * .newColumnName("newColumnName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-renamecolumnoperation.html)
 */
@CdkDslMarker
public class CfnDataSetRenameColumnOperationPropertyDsl {
  private val cdkBuilder: CfnDataSet.RenameColumnOperationProperty.Builder =
      CfnDataSet.RenameColumnOperationProperty.builder()

  /**
   * @param columnName The name of the column to be renamed. 
   */
  public fun columnName(columnName: String) {
    cdkBuilder.columnName(columnName)
  }

  /**
   * @param newColumnName The new name for the column. 
   */
  public fun newColumnName(newColumnName: String) {
    cdkBuilder.newColumnName(newColumnName)
  }

  public fun build(): CfnDataSet.RenameColumnOperationProperty = cdkBuilder.build()
}
