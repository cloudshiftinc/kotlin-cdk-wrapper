@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnIndex

@CdkDslMarker
public class CfnIndexRelevancePropertyDsl {
  private val cdkBuilder: CfnIndex.RelevanceProperty.Builder = CfnIndex.RelevanceProperty.builder()

  private val _valueImportanceItems: MutableList<Any> = mutableListOf()

  public fun duration(duration: String) {
    cdkBuilder.duration(duration)
  }

  public fun freshness(freshness: Boolean) {
    cdkBuilder.freshness(freshness)
  }

  public fun freshness(freshness: IResolvable) {
    cdkBuilder.freshness(freshness)
  }

  public fun importance(importance: Number) {
    cdkBuilder.importance(importance)
  }

  public fun rankOrder(rankOrder: String) {
    cdkBuilder.rankOrder(rankOrder)
  }

  public fun valueImportanceItems(vararg valueImportanceItems: Any) {
    _valueImportanceItems.addAll(listOf(*valueImportanceItems))
  }

  public fun valueImportanceItems(valueImportanceItems: Collection<Any>) {
    _valueImportanceItems.addAll(valueImportanceItems)
  }

  public fun valueImportanceItems(valueImportanceItems: IResolvable) {
    cdkBuilder.valueImportanceItems(valueImportanceItems)
  }

  public fun build(): CfnIndex.RelevanceProperty {
    if(_valueImportanceItems.isNotEmpty()) cdkBuilder.valueImportanceItems(_valueImportanceItems)
    return cdkBuilder.build()
  }
}
