@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * Checks that the request has a valid token with an unexpired challenge timestamp and, if not,
 * returns a browser challenge to the client.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * ChallengeProperty challengeProperty = ChallengeProperty.builder()
 * .customRequestHandling(CustomRequestHandlingProperty.builder()
 * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-challenge.html)
 */
@CdkDslMarker
public class CfnRuleGroupChallengePropertyDsl {
  private val cdkBuilder: CfnRuleGroup.ChallengeProperty.Builder =
      CfnRuleGroup.ChallengeProperty.builder()

  /**
   * @param customRequestHandling Custom request handling.
   */
  public fun customRequestHandling(customRequestHandling: IResolvable) {
    cdkBuilder.customRequestHandling(customRequestHandling)
  }

  /**
   * @param customRequestHandling Custom request handling.
   */
  public
      fun customRequestHandling(customRequestHandling: CfnRuleGroup.CustomRequestHandlingProperty) {
    cdkBuilder.customRequestHandling(customRequestHandling)
  }

  public fun build(): CfnRuleGroup.ChallengeProperty = cdkBuilder.build()
}
