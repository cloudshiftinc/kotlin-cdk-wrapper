@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateGridLayoutCanvasSizeOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.GridLayoutCanvasSizeOptionsProperty.Builder =
      CfnTemplate.GridLayoutCanvasSizeOptionsProperty.builder()

  /**
   * @param screenCanvasSizeOptions The options that determine the sizing of the canvas used in a
   * grid layout.
   */
  public fun screenCanvasSizeOptions(screenCanvasSizeOptions: IResolvable) {
    cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
  }

  /**
   * @param screenCanvasSizeOptions The options that determine the sizing of the canvas used in a
   * grid layout.
   */
  public
      fun screenCanvasSizeOptions(screenCanvasSizeOptions: CfnTemplate.GridLayoutScreenCanvasSizeOptionsProperty) {
    cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
  }

  public fun build(): CfnTemplate.GridLayoutCanvasSizeOptionsProperty = cdkBuilder.build()
}
