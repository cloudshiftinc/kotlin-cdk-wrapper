@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps

@CdkDslMarker
public class CfnRobotApplicationVersionPropsDsl {
  private val cdkBuilder: CfnRobotApplicationVersionProps.Builder =
      CfnRobotApplicationVersionProps.builder()

  public fun application(application: String) {
    cdkBuilder.application(application)
  }

  public fun currentRevisionId(currentRevisionId: String) {
    cdkBuilder.currentRevisionId(currentRevisionId)
  }

  public fun build(): CfnRobotApplicationVersionProps = cdkBuilder.build()
}
