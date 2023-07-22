@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnRobotApplicationVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRobotApplicationVersion.Builder =
      CfnRobotApplicationVersion.Builder.create(scope, id)

  /**
   * The application information for the robot application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html#cfn-robomaker-robotapplicationversion-application)
   * @param application The application information for the robot application. 
   */
  public fun application(application: String) {
    cdkBuilder.application(application)
  }

  /**
   * The current revision id for the robot application.
   *
   * If you provide a value and it matches the latest revision ID, a new version will be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html#cfn-robomaker-robotapplicationversion-currentrevisionid)
   * @param currentRevisionId The current revision id for the robot application. 
   */
  public fun currentRevisionId(currentRevisionId: String) {
    cdkBuilder.currentRevisionId(currentRevisionId)
  }

  public fun build(): CfnRobotApplicationVersion = cdkBuilder.build()
}
