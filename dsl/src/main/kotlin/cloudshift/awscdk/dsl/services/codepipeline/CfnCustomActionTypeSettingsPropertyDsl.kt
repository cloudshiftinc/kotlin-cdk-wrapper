@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnCustomActionType

@CdkDslMarker
public class CfnCustomActionTypeSettingsPropertyDsl {
  private val cdkBuilder: CfnCustomActionType.SettingsProperty.Builder =
      CfnCustomActionType.SettingsProperty.builder()

  public fun entityUrlTemplate(entityUrlTemplate: String) {
    cdkBuilder.entityUrlTemplate(entityUrlTemplate)
  }

  public fun executionUrlTemplate(executionUrlTemplate: String) {
    cdkBuilder.executionUrlTemplate(executionUrlTemplate)
  }

  public fun revisionUrlTemplate(revisionUrlTemplate: String) {
    cdkBuilder.revisionUrlTemplate(revisionUrlTemplate)
  }

  public fun thirdPartyConfigurationUrl(thirdPartyConfigurationUrl: String) {
    cdkBuilder.thirdPartyConfigurationUrl(thirdPartyConfigurationUrl)
  }

  public fun build(): CfnCustomActionType.SettingsProperty = cdkBuilder.build()
}
