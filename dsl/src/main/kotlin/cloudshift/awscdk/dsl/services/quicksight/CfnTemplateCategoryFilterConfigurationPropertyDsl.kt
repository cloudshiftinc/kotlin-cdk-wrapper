@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateCategoryFilterConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.CategoryFilterConfigurationProperty.Builder =
      CfnTemplate.CategoryFilterConfigurationProperty.builder()

  public fun customFilterConfiguration(customFilterConfiguration: IResolvable) {
    cdkBuilder.customFilterConfiguration(customFilterConfiguration)
  }

  public
      fun customFilterConfiguration(customFilterConfiguration: CfnTemplate.CustomFilterConfigurationProperty) {
    cdkBuilder.customFilterConfiguration(customFilterConfiguration)
  }

  public fun customFilterListConfiguration(customFilterListConfiguration: IResolvable) {
    cdkBuilder.customFilterListConfiguration(customFilterListConfiguration)
  }

  public
      fun customFilterListConfiguration(customFilterListConfiguration: CfnTemplate.CustomFilterListConfigurationProperty) {
    cdkBuilder.customFilterListConfiguration(customFilterListConfiguration)
  }

  public fun filterListConfiguration(filterListConfiguration: IResolvable) {
    cdkBuilder.filterListConfiguration(filterListConfiguration)
  }

  public
      fun filterListConfiguration(filterListConfiguration: CfnTemplate.FilterListConfigurationProperty) {
    cdkBuilder.filterListConfiguration(filterListConfiguration)
  }

  public fun build(): CfnTemplate.CategoryFilterConfigurationProperty = cdkBuilder.build()
}
