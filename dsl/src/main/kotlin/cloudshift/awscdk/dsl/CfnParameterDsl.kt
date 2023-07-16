@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnParameter
import software.constructs.Construct

@CdkDslMarker
public class CfnParameterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnParameter.Builder = CfnParameter.Builder.create(scope, id)

  private val _allowedValues: MutableList<String> = mutableListOf()

  public fun allowedPattern(allowedPattern: String) {
    cdkBuilder.allowedPattern(allowedPattern)
  }

  public fun allowedValues(vararg allowedValues: String) {
    _allowedValues.addAll(listOf(*allowedValues))
  }

  public fun allowedValues(allowedValues: Collection<String>) {
    _allowedValues.addAll(allowedValues)
  }

  public fun constraintDescription(constraintDescription: String) {
    cdkBuilder.constraintDescription(constraintDescription)
  }

  public fun defaultValue(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.defaultValue(builder.map)
  }

  public fun defaultValue(defaultValue: Any) {
    cdkBuilder.defaultValue(defaultValue)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun maxLength(maxLength: Number) {
    cdkBuilder.maxLength(maxLength)
  }

  public fun maxValue(maxValue: Number) {
    cdkBuilder.maxValue(maxValue)
  }

  public fun minLength(minLength: Number) {
    cdkBuilder.minLength(minLength)
  }

  public fun minValue(minValue: Number) {
    cdkBuilder.minValue(minValue)
  }

  public fun noEcho(noEcho: Boolean) {
    cdkBuilder.noEcho(noEcho)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnParameter {
    if(_allowedValues.isNotEmpty()) cdkBuilder.allowedValues(_allowedValues)
    return cdkBuilder.build()
  }
}
