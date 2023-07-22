@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketRoutingRuleConditionPropertyDsl {
  private val cdkBuilder: CfnBucket.RoutingRuleConditionProperty.Builder =
      CfnBucket.RoutingRuleConditionProperty.builder()

  /**
   * @param httpErrorCodeReturnedEquals The HTTP error code when the redirect is applied.
   * In the event of an error, if the error code equals this value, then the specified redirect is
   * applied.
   *
   * Required when parent element `Condition` is specified and sibling `KeyPrefixEquals` is not
   * specified. If both are specified, then both must be true for the redirect to be applied.
   */
  public fun httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals: String) {
    cdkBuilder.httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals)
  }

  /**
   * @param keyPrefixEquals The object key name prefix when the redirect is applied.
   * For example, to redirect requests for `ExamplePage.html` , the key prefix will be
   * `ExamplePage.html` . To redirect request for all pages with the prefix `docs/` , the key prefix
   * will be `/docs` , which identifies all objects in the docs/ folder.
   *
   * Required when the parent element `Condition` is specified and sibling
   * `HttpErrorCodeReturnedEquals` is not specified. If both conditions are specified, both must be
   * true for the redirect to be applied.
   */
  public fun keyPrefixEquals(keyPrefixEquals: String) {
    cdkBuilder.keyPrefixEquals(keyPrefixEquals)
  }

  public fun build(): CfnBucket.RoutingRuleConditionProperty = cdkBuilder.build()
}
