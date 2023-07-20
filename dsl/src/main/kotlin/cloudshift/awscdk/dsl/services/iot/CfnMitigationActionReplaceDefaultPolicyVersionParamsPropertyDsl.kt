@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnMitigationAction

@CdkDslMarker
public class CfnMitigationActionReplaceDefaultPolicyVersionParamsPropertyDsl {
  private val cdkBuilder: CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty.Builder =
      CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty.builder()

  public fun templateName(templateName: String) {
    cdkBuilder.templateName(templateName)
  }

  public fun build(): CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty =
      cdkBuilder.build()
}
