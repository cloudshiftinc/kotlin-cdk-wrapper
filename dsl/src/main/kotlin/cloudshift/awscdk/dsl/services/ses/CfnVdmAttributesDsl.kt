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

  /**
   * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-dashboardattributes)
   * @param dashboardAttributes Specifies additional settings for your VDM configuration as
   * applicable to the Dashboard. 
   */
  public fun dashboardAttributes(dashboardAttributes: IResolvable) {
    cdkBuilder.dashboardAttributes(dashboardAttributes)
  }

  /**
   * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-dashboardattributes)
   * @param dashboardAttributes Specifies additional settings for your VDM configuration as
   * applicable to the Dashboard. 
   */
  public
      fun dashboardAttributes(dashboardAttributes: CfnVdmAttributes.DashboardAttributesProperty) {
    cdkBuilder.dashboardAttributes(dashboardAttributes)
  }

  /**
   * Specifies additional settings for your VDM configuration as applicable to the Guardian.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-guardianattributes)
   * @param guardianAttributes Specifies additional settings for your VDM configuration as
   * applicable to the Guardian. 
   */
  public fun guardianAttributes(guardianAttributes: IResolvable) {
    cdkBuilder.guardianAttributes(guardianAttributes)
  }

  /**
   * Specifies additional settings for your VDM configuration as applicable to the Guardian.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-guardianattributes)
   * @param guardianAttributes Specifies additional settings for your VDM configuration as
   * applicable to the Guardian. 
   */
  public fun guardianAttributes(guardianAttributes: CfnVdmAttributes.GuardianAttributesProperty) {
    cdkBuilder.guardianAttributes(guardianAttributes)
  }

  public fun build(): CfnVdmAttributes = cdkBuilder.build()
}
