@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateLayoutPropertyDsl {
  private val cdkBuilder: CfnTemplate.LayoutProperty.Builder = CfnTemplate.LayoutProperty.builder()

  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  public fun configuration(configuration: CfnTemplate.LayoutConfigurationProperty) {
    cdkBuilder.configuration(configuration)
  }

  public fun build(): CfnTemplate.LayoutProperty = cdkBuilder.build()
}
