@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleHttpAuthorizationPropertyDsl {
  private val cdkBuilder: CfnTopicRule.HttpAuthorizationProperty.Builder =
      CfnTopicRule.HttpAuthorizationProperty.builder()

  /**
   * @param sigv4 Use Sig V4 authorization.
   * For more information, see [Signature Version 4 Signing
   * Process](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) .
   */
  public fun sigv4(sigv4: IResolvable) {
    cdkBuilder.sigv4(sigv4)
  }

  /**
   * @param sigv4 Use Sig V4 authorization.
   * For more information, see [Signature Version 4 Signing
   * Process](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) .
   */
  public fun sigv4(sigv4: CfnTopicRule.SigV4AuthorizationProperty) {
    cdkBuilder.sigv4(sigv4)
  }

  public fun build(): CfnTopicRule.HttpAuthorizationProperty = cdkBuilder.build()
}
