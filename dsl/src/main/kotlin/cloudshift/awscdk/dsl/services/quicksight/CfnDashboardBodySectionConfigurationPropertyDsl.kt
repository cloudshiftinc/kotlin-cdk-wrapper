@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardBodySectionConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.BodySectionConfigurationProperty.Builder =
      CfnDashboard.BodySectionConfigurationProperty.builder()

  public fun content(content: IResolvable) {
    cdkBuilder.content(content)
  }

  public fun content(content: CfnDashboard.BodySectionContentProperty) {
    cdkBuilder.content(content)
  }

  public fun pageBreakConfiguration(pageBreakConfiguration: IResolvable) {
    cdkBuilder.pageBreakConfiguration(pageBreakConfiguration)
  }

  public
      fun pageBreakConfiguration(pageBreakConfiguration: CfnDashboard.SectionPageBreakConfigurationProperty) {
    cdkBuilder.pageBreakConfiguration(pageBreakConfiguration)
  }

  public fun sectionId(sectionId: String) {
    cdkBuilder.sectionId(sectionId)
  }

  public fun style(style: IResolvable) {
    cdkBuilder.style(style)
  }

  public fun style(style: CfnDashboard.SectionStyleProperty) {
    cdkBuilder.style(style)
  }

  public fun build(): CfnDashboard.BodySectionConfigurationProperty = cdkBuilder.build()
}
