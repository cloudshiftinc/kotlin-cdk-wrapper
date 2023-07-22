@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies website configuration parameters for an Amazon S3 bucket.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * WebsiteConfigurationProperty websiteConfigurationProperty =
 * WebsiteConfigurationProperty.builder()
 * .errorDocument("errorDocument")
 * .indexDocument("indexDocument")
 * .redirectAllRequestsTo(RedirectAllRequestsToProperty.builder()
 * .hostName("hostName")
 * // the properties below are optional
 * .protocol("protocol")
 * .build())
 * .routingRules(List.of(RoutingRuleProperty.builder()
 * .redirectRule(RedirectRuleProperty.builder()
 * .hostName("hostName")
 * .httpRedirectCode("httpRedirectCode")
 * .protocol("protocol")
 * .replaceKeyPrefixWith("replaceKeyPrefixWith")
 * .replaceKeyWith("replaceKeyWith")
 * .build())
 * // the properties below are optional
 * .routingRuleCondition(RoutingRuleConditionProperty.builder()
 * .httpErrorCodeReturnedEquals("httpErrorCodeReturnedEquals")
 * .keyPrefixEquals("keyPrefixEquals")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-websiteconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketWebsiteConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.WebsiteConfigurationProperty.Builder =
      CfnBucket.WebsiteConfigurationProperty.builder()

  private val _routingRules: MutableList<Any> = mutableListOf()

  /**
   * @param errorDocument The name of the error document for the website.
   */
  public fun errorDocument(errorDocument: String) {
    cdkBuilder.errorDocument(errorDocument)
  }

  /**
   * @param indexDocument The name of the index document for the website.
   */
  public fun indexDocument(indexDocument: String) {
    cdkBuilder.indexDocument(indexDocument)
  }

  /**
   * @param redirectAllRequestsTo The redirect behavior for every request to this bucket's website
   * endpoint.
   *
   * If you specify this property, you can't specify any other property.
   */
  public fun redirectAllRequestsTo(redirectAllRequestsTo: IResolvable) {
    cdkBuilder.redirectAllRequestsTo(redirectAllRequestsTo)
  }

  /**
   * @param redirectAllRequestsTo The redirect behavior for every request to this bucket's website
   * endpoint.
   *
   * If you specify this property, you can't specify any other property.
   */
  public fun redirectAllRequestsTo(redirectAllRequestsTo: CfnBucket.RedirectAllRequestsToProperty) {
    cdkBuilder.redirectAllRequestsTo(redirectAllRequestsTo)
  }

  /**
   * @param routingRules Rules that define when a redirect is applied and the redirect behavior.
   */
  public fun routingRules(vararg routingRules: Any) {
    _routingRules.addAll(listOf(*routingRules))
  }

  /**
   * @param routingRules Rules that define when a redirect is applied and the redirect behavior.
   */
  public fun routingRules(routingRules: Collection<Any>) {
    _routingRules.addAll(routingRules)
  }

  /**
   * @param routingRules Rules that define when a redirect is applied and the redirect behavior.
   */
  public fun routingRules(routingRules: IResolvable) {
    cdkBuilder.routingRules(routingRules)
  }

  public fun build(): CfnBucket.WebsiteConfigurationProperty {
    if(_routingRules.isNotEmpty()) cdkBuilder.routingRules(_routingRules)
    return cdkBuilder.build()
  }
}
