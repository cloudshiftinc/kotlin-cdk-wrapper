@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

@CdkDslMarker
public class CfnComponentTypeDataValuePropertyDsl {
  private val cdkBuilder: CfnComponentType.DataValueProperty.Builder =
      CfnComponentType.DataValueProperty.builder()

  private val _listValue: MutableList<Any> = mutableListOf()

  public fun booleanValue(booleanValue: Boolean) {
    cdkBuilder.booleanValue(booleanValue)
  }

  public fun booleanValue(booleanValue: IResolvable) {
    cdkBuilder.booleanValue(booleanValue)
  }

  public fun doubleValue(doubleValue: Number) {
    cdkBuilder.doubleValue(doubleValue)
  }

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun integerValue(integerValue: Number) {
    cdkBuilder.integerValue(integerValue)
  }

  public fun listValue(vararg listValue: Any) {
    _listValue.addAll(listOf(*listValue))
  }

  public fun listValue(listValue: Collection<Any>) {
    _listValue.addAll(listValue)
  }

  public fun listValue(listValue: IResolvable) {
    cdkBuilder.listValue(listValue)
  }

  public fun longValue(longValue: Number) {
    cdkBuilder.longValue(longValue)
  }

  public fun mapValue(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.mapValue(builder.map)
  }

  public fun mapValue(mapValue: Map<String, *>) {
    cdkBuilder.mapValue(mapValue)
  }

  public fun mapValue(mapValue: IResolvable) {
    cdkBuilder.mapValue(mapValue)
  }

  public fun relationshipValue(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.relationshipValue(builder.map)
  }

  public fun relationshipValue(relationshipValue: Any) {
    cdkBuilder.relationshipValue(relationshipValue)
  }

  public fun stringValue(stringValue: String) {
    cdkBuilder.stringValue(stringValue)
  }

  public fun build(): CfnComponentType.DataValueProperty {
    if(_listValue.isNotEmpty()) cdkBuilder.listValue(_listValue)
    return cdkBuilder.build()
  }
}
