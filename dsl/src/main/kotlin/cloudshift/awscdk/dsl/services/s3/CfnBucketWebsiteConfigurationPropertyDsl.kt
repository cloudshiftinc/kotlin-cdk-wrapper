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

  public fun errorDocument(errorDocument: String) {
    cdkBuilder.errorDocument(errorDocument)
  }

  public fun indexDocument(indexDocument: String) {
    cdkBuilder.indexDocument(indexDocument)
  }

  public fun redirectAllRequestsTo(redirectAllRequestsTo: IResolvable) {
    cdkBuilder.redirectAllRequestsTo(redirectAllRequestsTo)
  }

  public fun redirectAllRequestsTo(redirectAllRequestsTo: CfnBucket.RedirectAllRequestsToProperty) {
    cdkBuilder.redirectAllRequestsTo(redirectAllRequestsTo)
  }

  public fun routingRules(vararg routingRules: Any) {
    _routingRules.addAll(listOf(*routingRules))
  }

  public fun routingRules(routingRules: Collection<Any>) {
    _routingRules.addAll(routingRules)
  }

  public fun routingRules(routingRules: IResolvable) {
    cdkBuilder.routingRules(routingRules)
  }

  public fun build(): CfnBucket.WebsiteConfigurationProperty {
    if(_routingRules.isNotEmpty()) cdkBuilder.routingRules(_routingRules)
    return cdkBuilder.build()
  }
}
