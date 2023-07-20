@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRulePutAssetPropertyValueEntryPropertyDsl {
  private val cdkBuilder: CfnTopicRule.PutAssetPropertyValueEntryProperty.Builder =
      CfnTopicRule.PutAssetPropertyValueEntryProperty.builder()

  private val _propertyValues: MutableList<Any> = mutableListOf()

  public fun assetId(assetId: String) {
    cdkBuilder.assetId(assetId)
  }

  public fun entryId(entryId: String) {
    cdkBuilder.entryId(entryId)
  }

  public fun propertyAlias(propertyAlias: String) {
    cdkBuilder.propertyAlias(propertyAlias)
  }

  public fun propertyId(propertyId: String) {
    cdkBuilder.propertyId(propertyId)
  }

  public fun propertyValues(vararg propertyValues: Any) {
    _propertyValues.addAll(listOf(*propertyValues))
  }

  public fun propertyValues(propertyValues: Collection<Any>) {
    _propertyValues.addAll(propertyValues)
  }

  public fun propertyValues(propertyValues: IResolvable) {
    cdkBuilder.propertyValues(propertyValues)
  }

  public fun build(): CfnTopicRule.PutAssetPropertyValueEntryProperty {
    if(_propertyValues.isNotEmpty()) cdkBuilder.propertyValues(_propertyValues)
    return cdkBuilder.build()
  }
}
