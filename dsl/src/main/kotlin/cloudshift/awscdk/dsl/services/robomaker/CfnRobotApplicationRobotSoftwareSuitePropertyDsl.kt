@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnRobotApplication

@CdkDslMarker
public class CfnRobotApplicationRobotSoftwareSuitePropertyDsl {
  private val cdkBuilder: CfnRobotApplication.RobotSoftwareSuiteProperty.Builder =
      CfnRobotApplication.RobotSoftwareSuiteProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnRobotApplication.RobotSoftwareSuiteProperty = cdkBuilder.build()
}
