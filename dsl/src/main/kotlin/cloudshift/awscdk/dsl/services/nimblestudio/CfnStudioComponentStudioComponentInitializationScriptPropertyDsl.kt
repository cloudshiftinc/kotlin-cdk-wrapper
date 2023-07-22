@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

@CdkDslMarker
public class CfnStudioComponentStudioComponentInitializationScriptPropertyDsl {
  private val cdkBuilder: CfnStudioComponent.StudioComponentInitializationScriptProperty.Builder =
      CfnStudioComponent.StudioComponentInitializationScriptProperty.builder()

  /**
   * @param launchProfileProtocolVersion The version number of the protocol that is used by the
   * launch profile.
   * The only valid version is "2021-03-31".
   */
  public fun launchProfileProtocolVersion(launchProfileProtocolVersion: String) {
    cdkBuilder.launchProfileProtocolVersion(launchProfileProtocolVersion)
  }

  /**
   * @param platform The platform of the initialization script, either Windows or Linux.
   */
  public fun platform(platform: String) {
    cdkBuilder.platform(platform)
  }

  /**
   * @param runContext The method to use when running the initialization script.
   */
  public fun runContext(runContext: String) {
    cdkBuilder.runContext(runContext)
  }

  /**
   * @param script The initialization script.
   */
  public fun script(script: String) {
    cdkBuilder.script(script)
  }

  public fun build(): CfnStudioComponent.StudioComponentInitializationScriptProperty =
      cdkBuilder.build()
}
