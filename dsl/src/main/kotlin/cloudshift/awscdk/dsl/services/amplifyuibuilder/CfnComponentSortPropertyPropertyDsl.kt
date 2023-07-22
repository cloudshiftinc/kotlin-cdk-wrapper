@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

/**
 * The `SortProperty` property specifies how to sort the data that you bind to a component.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * SortPropertyProperty sortPropertyProperty = SortPropertyProperty.builder()
 * .direction("direction")
 * .field("field")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-sortproperty.html)
 */
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
