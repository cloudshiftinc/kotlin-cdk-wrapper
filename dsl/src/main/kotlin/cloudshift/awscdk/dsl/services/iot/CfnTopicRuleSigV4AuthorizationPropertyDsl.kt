@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleSigV4AuthorizationPropertyDsl {
  private val cdkBuilder: CfnTopicRule.SigV4AuthorizationProperty.Builder =
      CfnTopicRule.SigV4AuthorizationProperty.builder()

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun signingRegion(signingRegion: String) {
    cdkBuilder.signingRegion(signingRegion)
  }

  public fun build(): CfnTopicRule.SigV4AuthorizationProperty = cdkBuilder.build()
}
