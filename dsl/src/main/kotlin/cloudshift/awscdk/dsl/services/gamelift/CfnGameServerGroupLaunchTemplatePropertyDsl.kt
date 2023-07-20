@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

@CdkDslMarker
public class CfnGameServerGroupLaunchTemplatePropertyDsl {
  private val cdkBuilder: CfnGameServerGroup.LaunchTemplateProperty.Builder =
      CfnGameServerGroup.LaunchTemplateProperty.builder()

  public fun launchTemplateId(launchTemplateId: String) {
    cdkBuilder.launchTemplateId(launchTemplateId)
  }

  public fun launchTemplateName(launchTemplateName: String) {
    cdkBuilder.launchTemplateName(launchTemplateName)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnGameServerGroup.LaunchTemplateProperty = cdkBuilder.build()
}
