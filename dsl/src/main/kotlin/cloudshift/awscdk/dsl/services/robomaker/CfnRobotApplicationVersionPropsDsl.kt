@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps

@CdkDslMarker
public class CfnRobotApplicationVersionPropsDsl {
  private val cdkBuilder: CfnRobotApplicationVersionProps.Builder =
      CfnRobotApplicationVersionProps.builder()

  /**
   * @param application The application information for the robot application. 
   */
  public fun application(application: String) {
    cdkBuilder.application(application)
  }

  /**
   * @param currentRevisionId The current revision id for the robot application.
   * If you provide a value and it matches the latest revision ID, a new version will be created.
   */
  public fun currentRevisionId(currentRevisionId: String) {
    cdkBuilder.currentRevisionId(currentRevisionId)
  }

  public fun build(): CfnRobotApplicationVersionProps = cdkBuilder.build()
}
