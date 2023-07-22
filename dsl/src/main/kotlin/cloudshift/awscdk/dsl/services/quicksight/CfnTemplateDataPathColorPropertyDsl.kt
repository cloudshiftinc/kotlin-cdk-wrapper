@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDataPathColorPropertyDsl {
  private val cdkBuilder: CfnTemplate.DataPathColorProperty.Builder =
      CfnTemplate.DataPathColorProperty.builder()

  /**
   * @param color The color that needs to be applied to the element. 
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  /**
   * @param element The element that the color needs to be applied to. 
   */
  public fun element(element: IResolvable) {
    cdkBuilder.element(element)
  }

  /**
   * @param element The element that the color needs to be applied to. 
   */
  public fun element(element: CfnTemplate.DataPathValueProperty) {
    cdkBuilder.element(element)
  }

  /**
   * @param timeGranularity The time granularity of the field that the color needs to be applied to.
   */
  public fun timeGranularity(timeGranularity: String) {
    cdkBuilder.timeGranularity(timeGranularity)
  }

  public fun build(): CfnTemplate.DataPathColorProperty = cdkBuilder.build()
}
