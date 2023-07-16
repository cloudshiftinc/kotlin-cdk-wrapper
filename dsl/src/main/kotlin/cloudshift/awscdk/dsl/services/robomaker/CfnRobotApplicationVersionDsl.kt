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

  public fun application(application: String) {
    cdkBuilder.application(application)
  }

  public fun currentRevisionId(currentRevisionId: String) {
    cdkBuilder.currentRevisionId(currentRevisionId)
  }

  public fun build(): CfnRobotApplicationVersion = cdkBuilder.build()
}
