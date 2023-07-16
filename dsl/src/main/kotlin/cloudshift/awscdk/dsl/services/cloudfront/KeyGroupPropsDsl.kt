@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.IPublicKey
import software.amazon.awscdk.services.cloudfront.KeyGroupProps

@CdkDslMarker
public class KeyGroupPropsDsl {
  private val cdkBuilder: KeyGroupProps.Builder = KeyGroupProps.builder()

  private val _items: MutableList<IPublicKey> = mutableListOf()

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun items(vararg items: IPublicKey) {
    _items.addAll(listOf(*items))
  }

  public fun items(items: Collection<IPublicKey>) {
    _items.addAll(items)
  }

  public fun keyGroupName(keyGroupName: String) {
    cdkBuilder.keyGroupName(keyGroupName)
  }

  public fun build(): KeyGroupProps {
    if(_items.isNotEmpty()) cdkBuilder.items(_items)
    return cdkBuilder.build()
  }
}
