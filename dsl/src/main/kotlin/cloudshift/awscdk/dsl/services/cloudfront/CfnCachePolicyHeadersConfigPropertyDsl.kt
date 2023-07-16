@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy

@CdkDslMarker
public class CfnCachePolicyHeadersConfigPropertyDsl {
  private val cdkBuilder: CfnCachePolicy.HeadersConfigProperty.Builder =
      CfnCachePolicy.HeadersConfigProperty.builder()

  private val _headers: MutableList<String> = mutableListOf()

  public fun headerBehavior(headerBehavior: String) {
    cdkBuilder.headerBehavior(headerBehavior)
  }

  public fun headers(vararg headers: String) {
    _headers.addAll(listOf(*headers))
  }

  public fun headers(headers: Collection<String>) {
    _headers.addAll(headers)
  }

  public fun build(): CfnCachePolicy.HeadersConfigProperty {
    if(_headers.isNotEmpty()) cdkBuilder.headers(_headers)
    return cdkBuilder.build()
  }
}
