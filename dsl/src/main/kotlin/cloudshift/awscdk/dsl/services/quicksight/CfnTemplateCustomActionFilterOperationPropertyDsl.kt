@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateCustomActionFilterOperationPropertyDsl {
  private val cdkBuilder: CfnTemplate.CustomActionFilterOperationProperty.Builder =
      CfnTemplate.CustomActionFilterOperationProperty.builder()

  /**
   * @param selectedFieldsConfiguration The configuration that chooses the fields to be filtered. 
   */
  public fun selectedFieldsConfiguration(selectedFieldsConfiguration: IResolvable) {
    cdkBuilder.selectedFieldsConfiguration(selectedFieldsConfiguration)
  }

  /**
   * @param selectedFieldsConfiguration The configuration that chooses the fields to be filtered. 
   */
  public
      fun selectedFieldsConfiguration(selectedFieldsConfiguration: CfnTemplate.FilterOperationSelectedFieldsConfigurationProperty) {
    cdkBuilder.selectedFieldsConfiguration(selectedFieldsConfiguration)
  }

  /**
   * @param targetVisualsConfiguration The configuration that chooses the target visuals to be
   * filtered. 
   */
  public fun targetVisualsConfiguration(targetVisualsConfiguration: IResolvable) {
    cdkBuilder.targetVisualsConfiguration(targetVisualsConfiguration)
  }

  /**
   * @param targetVisualsConfiguration The configuration that chooses the target visuals to be
   * filtered. 
   */
  public
      fun targetVisualsConfiguration(targetVisualsConfiguration: CfnTemplate.FilterOperationTargetVisualsConfigurationProperty) {
    cdkBuilder.targetVisualsConfiguration(targetVisualsConfiguration)
  }

  public fun build(): CfnTemplate.CustomActionFilterOperationProperty = cdkBuilder.build()
}
