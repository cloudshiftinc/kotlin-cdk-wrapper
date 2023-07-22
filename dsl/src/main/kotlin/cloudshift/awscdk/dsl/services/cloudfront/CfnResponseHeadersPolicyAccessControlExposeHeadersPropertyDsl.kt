@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@CdkDslMarker
public class CfnResponseHeadersPolicyAccessControlExposeHeadersPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty.Builder =
      CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty.builder()

  private val _items: MutableList<String> = mutableListOf()

  /**
   * @param items The list of HTTP headers. 
   * You can specify `*` to expose all headers.
   */
  public fun items(vararg items: String) {
    _items.addAll(listOf(*items))
  }

  /**
   * @param items The list of HTTP headers. 
   * You can specify `*` to expose all headers.
   */
  public fun items(items: Collection<String>) {
    _items.addAll(items)
  }

  public fun build(): CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty {
    if(_items.isNotEmpty()) cdkBuilder.items(_items)
    return cdkBuilder.build()
  }
}
