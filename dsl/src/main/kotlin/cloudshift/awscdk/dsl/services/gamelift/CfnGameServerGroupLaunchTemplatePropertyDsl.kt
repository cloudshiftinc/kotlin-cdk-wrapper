@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

@CdkDslMarker
public class CfnGameServerGroupLaunchTemplatePropertyDsl {
  private val cdkBuilder: CfnGameServerGroup.LaunchTemplateProperty.Builder =
      CfnGameServerGroup.LaunchTemplateProperty.builder()

  /**
   * @param launchTemplateId A unique identifier for an existing Amazon EC2 launch template.
   */
  public fun launchTemplateId(launchTemplateId: String) {
    cdkBuilder.launchTemplateId(launchTemplateId)
  }

  /**
   * @param launchTemplateName A readable identifier for an existing Amazon EC2 launch template.
   */
  public fun launchTemplateName(launchTemplateName: String) {
    cdkBuilder.launchTemplateName(launchTemplateName)
  }

  /**
   * @param version The version of the Amazon EC2 launch template to use.
   * If no version is specified, the default version will be used. With Amazon EC2, you can specify
   * a default version for a launch template. If none is set, the default is the first version created.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnGameServerGroup.LaunchTemplateProperty = cdkBuilder.build()
}
