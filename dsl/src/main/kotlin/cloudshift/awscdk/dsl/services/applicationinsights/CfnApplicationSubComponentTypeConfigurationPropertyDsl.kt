@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@CdkDslMarker
public class CfnApplicationSubComponentTypeConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.SubComponentTypeConfigurationProperty.Builder =
      CfnApplication.SubComponentTypeConfigurationProperty.builder()

  /**
   * @param subComponentConfigurationDetails The configuration settings of the sub-components. 
   */
  public fun subComponentConfigurationDetails(subComponentConfigurationDetails: IResolvable) {
    cdkBuilder.subComponentConfigurationDetails(subComponentConfigurationDetails)
  }

  /**
   * @param subComponentConfigurationDetails The configuration settings of the sub-components. 
   */
  public
      fun subComponentConfigurationDetails(subComponentConfigurationDetails: CfnApplication.SubComponentConfigurationDetailsProperty) {
    cdkBuilder.subComponentConfigurationDetails(subComponentConfigurationDetails)
  }

  /**
   * @param subComponentType The sub-component type. 
   */
  public fun subComponentType(subComponentType: String) {
    cdkBuilder.subComponentType(subComponentType)
  }

  public fun build(): CfnApplication.SubComponentTypeConfigurationProperty = cdkBuilder.build()
}
