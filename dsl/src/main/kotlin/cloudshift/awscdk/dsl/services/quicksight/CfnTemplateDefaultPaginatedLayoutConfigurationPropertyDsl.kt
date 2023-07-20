@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDefaultPaginatedLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.DefaultPaginatedLayoutConfigurationProperty.Builder =
      CfnTemplate.DefaultPaginatedLayoutConfigurationProperty.builder()

  public fun sectionBased(sectionBased: IResolvable) {
    cdkBuilder.sectionBased(sectionBased)
  }

  public
      fun sectionBased(sectionBased: CfnTemplate.DefaultSectionBasedLayoutConfigurationProperty) {
    cdkBuilder.sectionBased(sectionBased)
  }

  public fun build(): CfnTemplate.DefaultPaginatedLayoutConfigurationProperty = cdkBuilder.build()
}
