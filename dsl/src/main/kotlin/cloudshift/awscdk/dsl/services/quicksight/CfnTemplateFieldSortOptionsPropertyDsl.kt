@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFieldSortOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.FieldSortOptionsProperty.Builder =
      CfnTemplate.FieldSortOptionsProperty.builder()

  public fun columnSort(columnSort: IResolvable) {
    cdkBuilder.columnSort(columnSort)
  }

  public fun columnSort(columnSort: CfnTemplate.ColumnSortProperty) {
    cdkBuilder.columnSort(columnSort)
  }

  public fun fieldSort(fieldSort: IResolvable) {
    cdkBuilder.fieldSort(fieldSort)
  }

  public fun fieldSort(fieldSort: CfnTemplate.FieldSortProperty) {
    cdkBuilder.fieldSort(fieldSort)
  }

  public fun build(): CfnTemplate.FieldSortOptionsProperty = cdkBuilder.build()
}
