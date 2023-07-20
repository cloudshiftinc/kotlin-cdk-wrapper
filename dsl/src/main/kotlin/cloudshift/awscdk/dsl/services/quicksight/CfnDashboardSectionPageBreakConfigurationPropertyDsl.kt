@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSectionPageBreakConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.SectionPageBreakConfigurationProperty.Builder =
      CfnDashboard.SectionPageBreakConfigurationProperty.builder()

  public fun after(after: IResolvable) {
    cdkBuilder.after(after)
  }

  public fun after(after: CfnDashboard.SectionAfterPageBreakProperty) {
    cdkBuilder.after(after)
  }

  public fun build(): CfnDashboard.SectionPageBreakConfigurationProperty = cdkBuilder.build()
}
