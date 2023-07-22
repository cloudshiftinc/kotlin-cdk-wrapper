@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

@CdkDslMarker
public class CfnComponentSortPropertyPropertyDsl {
  private val cdkBuilder: CfnComponent.SortPropertyProperty.Builder =
      CfnComponent.SortPropertyProperty.builder()

  /**
   * @param direction The direction of the sort, either ascending or descending. 
   */
  public fun direction(direction: String) {
    cdkBuilder.direction(direction)
  }

  /**
   * @param field The field to perform the sort on. 
   */
  public fun `field`(`field`: String) {
    cdkBuilder.`field`(`field`)
  }

  public fun build(): CfnComponent.SortPropertyProperty = cdkBuilder.build()
}
