@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDefaultSectionBasedLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.DefaultSectionBasedLayoutConfigurationProperty.Builder =
      CfnTemplate.DefaultSectionBasedLayoutConfigurationProperty.builder()

  /**
   * @param canvasSizeOptions Determines the screen canvas size options for a section-based layout. 
   */
  public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  /**
   * @param canvasSizeOptions Determines the screen canvas size options for a section-based layout. 
   */
  public
      fun canvasSizeOptions(canvasSizeOptions: CfnTemplate.SectionBasedLayoutCanvasSizeOptionsProperty) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  public fun build(): CfnTemplate.DefaultSectionBasedLayoutConfigurationProperty =
      cdkBuilder.build()
}
