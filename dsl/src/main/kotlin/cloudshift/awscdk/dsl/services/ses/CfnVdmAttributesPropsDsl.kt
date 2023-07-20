@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnVdmAttributes
import software.amazon.awscdk.services.ses.CfnVdmAttributesProps

@CdkDslMarker
public class CfnVdmAttributesPropsDsl {
  private val cdkBuilder: CfnVdmAttributesProps.Builder = CfnVdmAttributesProps.builder()

  public fun dashboardAttributes(dashboardAttributes: IResolvable) {
    cdkBuilder.dashboardAttributes(dashboardAttributes)
  }

  public
      fun dashboardAttributes(dashboardAttributes: CfnVdmAttributes.DashboardAttributesProperty) {
    cdkBuilder.dashboardAttributes(dashboardAttributes)
  }

  public fun guardianAttributes(guardianAttributes: IResolvable) {
    cdkBuilder.guardianAttributes(guardianAttributes)
  }

  public fun guardianAttributes(guardianAttributes: CfnVdmAttributes.GuardianAttributesProperty) {
    cdkBuilder.guardianAttributes(guardianAttributes)
  }

  public fun build(): CfnVdmAttributesProps = cdkBuilder.build()
}
