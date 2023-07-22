@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnApplicationFleetAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplicationFleetAssociation.Builder =
      CfnApplicationFleetAssociation.Builder.create(scope, id)

  /**
   * The ARN of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html#cfn-appstream-applicationfleetassociation-applicationarn)
   * @param applicationArn The ARN of the application. 
   */
  public fun applicationArn(applicationArn: String) {
    cdkBuilder.applicationArn(applicationArn)
  }

  /**
   * The name of the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-applicationfleetassociation.html#cfn-appstream-applicationfleetassociation-fleetname)
   * @param fleetName The name of the fleet. 
   */
  public fun fleetName(fleetName: String) {
    cdkBuilder.fleetName(fleetName)
  }

  public fun build(): CfnApplicationFleetAssociation = cdkBuilder.build()
}
