@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisSheetControlLayoutPropertyDsl {
  private val cdkBuilder: CfnAnalysis.SheetControlLayoutProperty.Builder =
      CfnAnalysis.SheetControlLayoutProperty.builder()

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
  public fun configuration(configuration: CfnAnalysis.SheetControlLayoutConfigurationProperty) {
    cdkBuilder.configuration(configuration)
  }

  public fun build(): CfnAnalysis.SheetControlLayoutProperty = cdkBuilder.build()
}
