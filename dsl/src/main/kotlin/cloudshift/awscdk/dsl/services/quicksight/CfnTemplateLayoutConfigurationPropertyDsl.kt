@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.LayoutConfigurationProperty.Builder =
      CfnTemplate.LayoutConfigurationProperty.builder()

  public fun freeFormLayout(freeFormLayout: IResolvable) {
    cdkBuilder.freeFormLayout(freeFormLayout)
  }

  public fun freeFormLayout(freeFormLayout: CfnTemplate.FreeFormLayoutConfigurationProperty) {
    cdkBuilder.freeFormLayout(freeFormLayout)
  }

  public fun gridLayout(gridLayout: IResolvable) {
    cdkBuilder.gridLayout(gridLayout)
  }

  public fun gridLayout(gridLayout: CfnTemplate.GridLayoutConfigurationProperty) {
    cdkBuilder.gridLayout(gridLayout)
  }

  public fun sectionBasedLayout(sectionBasedLayout: IResolvable) {
    cdkBuilder.sectionBasedLayout(sectionBasedLayout)
  }

  public
      fun sectionBasedLayout(sectionBasedLayout: CfnTemplate.SectionBasedLayoutConfigurationProperty) {
    cdkBuilder.sectionBasedLayout(sectionBasedLayout)
  }

  public fun build(): CfnTemplate.LayoutConfigurationProperty = cdkBuilder.build()
}
