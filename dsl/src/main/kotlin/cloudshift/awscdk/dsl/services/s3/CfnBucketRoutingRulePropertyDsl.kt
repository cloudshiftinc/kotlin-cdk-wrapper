@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketRoutingRulePropertyDsl {
  private val cdkBuilder: CfnBucket.RoutingRuleProperty.Builder =
      CfnBucket.RoutingRuleProperty.builder()

  /**
   * @param redirectRule Container for redirect information. 
   * You can redirect requests to another host, to another page, or with another protocol. In the
   * event of an error, you can specify a different error code to return.
   */
  public fun redirectRule(redirectRule: IResolvable) {
    cdkBuilder.redirectRule(redirectRule)
  }

  /**
   * @param redirectRule Container for redirect information. 
   * You can redirect requests to another host, to another page, or with another protocol. In the
   * event of an error, you can specify a different error code to return.
   */
  public fun redirectRule(redirectRule: CfnBucket.RedirectRuleProperty) {
    cdkBuilder.redirectRule(redirectRule)
  }

  /**
   * @param routingRuleCondition A container for describing a condition that must be met for the
   * specified redirect to apply.
   * For example, 1. If request is for pages in the `/docs` folder, redirect to the `/documents`
   * folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might
   * process the error.
   */
  public fun routingRuleCondition(routingRuleCondition: IResolvable) {
    cdkBuilder.routingRuleCondition(routingRuleCondition)
  }

  /**
   * @param routingRuleCondition A container for describing a condition that must be met for the
   * specified redirect to apply.
   * For example, 1. If request is for pages in the `/docs` folder, redirect to the `/documents`
   * folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might
   * process the error.
   */
  public fun routingRuleCondition(routingRuleCondition: CfnBucket.RoutingRuleConditionProperty) {
    cdkBuilder.routingRuleCondition(routingRuleCondition)
  }

  public fun build(): CfnBucket.RoutingRuleProperty = cdkBuilder.build()
}
