@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

@CdkDslMarker
public class CfnStudioComponentStudioComponentInitializationScriptPropertyDsl {
  private val cdkBuilder: CfnStudioComponent.StudioComponentInitializationScriptProperty.Builder =
      CfnStudioComponent.StudioComponentInitializationScriptProperty.builder()

  public fun launchProfileProtocolVersion(launchProfileProtocolVersion: String) {
    cdkBuilder.launchProfileProtocolVersion(launchProfileProtocolVersion)
  }

  public fun platform(platform: String) {
    cdkBuilder.platform(platform)
  }

  public fun runContext(runContext: String) {
    cdkBuilder.runContext(runContext)
  }

  public fun script(script: String) {
    cdkBuilder.script(script)
  }

  public fun build(): CfnStudioComponent.StudioComponentInitializationScriptProperty =
      cdkBuilder.build()
}
