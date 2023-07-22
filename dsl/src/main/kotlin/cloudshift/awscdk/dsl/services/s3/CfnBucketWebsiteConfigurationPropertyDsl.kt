@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

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
