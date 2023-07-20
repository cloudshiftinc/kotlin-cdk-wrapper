@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnRule

@CdkDslMarker
public class CfnRuleSqsParametersPropertyDsl {
  private val cdkBuilder: CfnRule.SqsParametersProperty.Builder =
      CfnRule.SqsParametersProperty.builder()

  public fun messageGroupId(messageGroupId: String) {
    cdkBuilder.messageGroupId(messageGroupId)
  }

  public fun build(): CfnRule.SqsParametersProperty = cdkBuilder.build()
}
