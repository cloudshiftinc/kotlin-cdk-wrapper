@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@CdkDslMarker
public class CfnResponseHeadersPolicyRemoveHeadersConfigPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.RemoveHeadersConfigProperty.Builder =
      CfnResponseHeadersPolicy.RemoveHeadersConfigProperty.builder()

  private val _items: MutableList<Any> = mutableListOf()

  /**
   * @param items The list of HTTP header names. 
   */
  public fun items(vararg items: Any) {
    _items.addAll(listOf(*items))
  }

  /**
   * @param items The list of HTTP header names. 
   */
  public fun items(items: Collection<Any>) {
    _items.addAll(items)
  }

  /**
   * @param items The list of HTTP header names. 
   */
  public fun items(items: IResolvable) {
    cdkBuilder.items(items)
  }

  public fun build(): CfnResponseHeadersPolicy.RemoveHeadersConfigProperty {
    if(_items.isNotEmpty()) cdkBuilder.items(_items)
    return cdkBuilder.build()
  }
}
