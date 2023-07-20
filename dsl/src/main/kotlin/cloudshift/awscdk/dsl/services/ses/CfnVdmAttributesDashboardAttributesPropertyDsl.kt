@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnVdmAttributes

@CdkDslMarker
public class CfnVdmAttributesDashboardAttributesPropertyDsl {
  private val cdkBuilder: CfnVdmAttributes.DashboardAttributesProperty.Builder =
      CfnVdmAttributes.DashboardAttributesProperty.builder()

  public fun engagementMetrics(engagementMetrics: String) {
    cdkBuilder.engagementMetrics(engagementMetrics)
  }

  public fun build(): CfnVdmAttributes.DashboardAttributesProperty = cdkBuilder.build()
}
