@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@CdkDslMarker
public class CfnResponseHeadersPolicyAccessControlAllowOriginsPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty.Builder =
      CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty.builder()

  private val _items: MutableList<String> = mutableListOf()

  public fun items(vararg items: String) {
    _items.addAll(listOf(*items))
  }

  public fun items(items: Collection<String>) {
    _items.addAll(items)
  }

  public fun build(): CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty {
    if(_items.isNotEmpty()) cdkBuilder.items(_items)
    return cdkBuilder.build()
  }
}
