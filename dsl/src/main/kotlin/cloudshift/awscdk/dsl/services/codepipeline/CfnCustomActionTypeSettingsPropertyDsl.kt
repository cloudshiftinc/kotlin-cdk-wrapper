@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnCustomActionType

@CdkDslMarker
public class CfnCustomActionTypeSettingsPropertyDsl {
  private val cdkBuilder: CfnCustomActionType.SettingsProperty.Builder =
      CfnCustomActionType.SettingsProperty.builder()

  /**
   * @param entityUrlTemplate The URL returned to the CodePipeline console that provides a deep link
   * to the resources of the external system, such as the configuration page for a CodeDeploy
   * deployment group.
   * This link is provided as part of the action display in the pipeline.
   */
  public fun entityUrlTemplate(entityUrlTemplate: String) {
    cdkBuilder.entityUrlTemplate(entityUrlTemplate)
  }

  /**
   * @param executionUrlTemplate The URL returned to the CodePipeline console that contains a link
   * to the top-level landing page for the external system, such as the console page for CodeDeploy.
   * This link is shown on the pipeline view page in the CodePipeline console and provides a link to
   * the execution entity of the external action.
   */
  public fun executionUrlTemplate(executionUrlTemplate: String) {
    cdkBuilder.executionUrlTemplate(executionUrlTemplate)
  }

  /**
   * @param revisionUrlTemplate The URL returned to the CodePipeline console that contains a link to
   * the page where customers can update or change the configuration of the external action.
   */
  public fun revisionUrlTemplate(revisionUrlTemplate: String) {
    cdkBuilder.revisionUrlTemplate(revisionUrlTemplate)
  }

  /**
   * @param thirdPartyConfigurationUrl The URL of a sign-up page where users can sign up for an
   * external service and perform initial configuration of the action provided by that service.
   */
  public fun thirdPartyConfigurationUrl(thirdPartyConfigurationUrl: String) {
    cdkBuilder.thirdPartyConfigurationUrl(thirdPartyConfigurationUrl)
  }

  public fun build(): CfnCustomActionType.SettingsProperty = cdkBuilder.build()
}
