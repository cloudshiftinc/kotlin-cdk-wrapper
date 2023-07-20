@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnVdmAttributes
import software.constructs.Construct

@CdkDslMarker
public class CfnVdmAttributesDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVdmAttributes.Builder = CfnVdmAttributes.Builder.create(scope, id)

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

  public fun build(): CfnVdmAttributes = cdkBuilder.build()
}
