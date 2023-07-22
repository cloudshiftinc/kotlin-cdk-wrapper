@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFieldSortOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.FieldSortOptionsProperty.Builder =
      CfnTemplate.FieldSortOptionsProperty.builder()

  /**
   * @param columnSort The sort configuration for a column that is not used in a field well.
   */
  public fun columnSort(columnSort: IResolvable) {
    cdkBuilder.columnSort(columnSort)
  }

  /**
   * @param columnSort The sort configuration for a column that is not used in a field well.
   */
  public fun columnSort(columnSort: CfnTemplate.ColumnSortProperty) {
    cdkBuilder.columnSort(columnSort)
  }

  /**
   * @param fieldSort The sort configuration for a field in a field well.
   */
  public fun fieldSort(fieldSort: IResolvable) {
    cdkBuilder.fieldSort(fieldSort)
  }

  /**
   * @param fieldSort The sort configuration for a field in a field well.
   */
  public fun fieldSort(fieldSort: CfnTemplate.FieldSortProperty) {
    cdkBuilder.fieldSort(fieldSort)
  }

  public fun build(): CfnTemplate.FieldSortOptionsProperty = cdkBuilder.build()
}
