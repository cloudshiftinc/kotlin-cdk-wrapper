@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSheetControlLayoutPropertyDsl {
  private val cdkBuilder: CfnTemplate.SheetControlLayoutProperty.Builder =
      CfnTemplate.SheetControlLayoutProperty.builder()

  /**
   * @param configuration The configuration that determines the elements and canvas size options of
   * sheet control. 
   */
  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param configuration The configuration that determines the elements and canvas size options of
   * sheet control. 
   */
  public fun configuration(configuration: CfnTemplate.SheetControlLayoutConfigurationProperty) {
    cdkBuilder.configuration(configuration)
  }

  public fun build(): CfnTemplate.SheetControlLayoutProperty = cdkBuilder.build()
}
