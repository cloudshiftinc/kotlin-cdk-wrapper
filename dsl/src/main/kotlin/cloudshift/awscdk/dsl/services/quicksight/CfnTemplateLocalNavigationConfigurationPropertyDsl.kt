@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateLocalNavigationConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.LocalNavigationConfigurationProperty.Builder =
      CfnTemplate.LocalNavigationConfigurationProperty.builder()

  /**
   * @param targetSheetId The sheet that is targeted for navigation in the same analysis. 
   */
  public fun targetSheetId(targetSheetId: String) {
    cdkBuilder.targetSheetId(targetSheetId)
  }

  public fun build(): CfnTemplate.LocalNavigationConfigurationProperty = cdkBuilder.build()
}
