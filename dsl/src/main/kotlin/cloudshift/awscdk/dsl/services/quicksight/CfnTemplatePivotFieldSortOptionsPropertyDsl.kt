@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePivotFieldSortOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.PivotFieldSortOptionsProperty.Builder =
      CfnTemplate.PivotFieldSortOptionsProperty.builder()

  /**
   * @param fieldId The field ID for the field sort options. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param sortBy The sort by field for the field sort options. 
   */
  public fun sortBy(sortBy: IResolvable) {
    cdkBuilder.sortBy(sortBy)
  }

  /**
   * @param sortBy The sort by field for the field sort options. 
   */
  public fun sortBy(sortBy: CfnTemplate.PivotTableSortByProperty) {
    cdkBuilder.sortBy(sortBy)
  }

  public fun build(): CfnTemplate.PivotFieldSortOptionsProperty = cdkBuilder.build()
}
