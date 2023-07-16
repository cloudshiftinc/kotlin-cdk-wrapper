@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appconfig.CfnExtensionProps

@CdkDslMarker
public class CfnExtensionPropsDsl {
  private val cdkBuilder: CfnExtensionProps.Builder = CfnExtensionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun actions(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.actions(builder.map)
  }

  public fun actions(actions: Any) {
    cdkBuilder.actions(actions)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun latestVersionNumber(latestVersionNumber: Number) {
    cdkBuilder.latestVersionNumber(latestVersionNumber)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun parameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.parameters(builder.map)
  }

  public fun parameters(parameters: Map<String, *>) {
    cdkBuilder.parameters(parameters)
  }

  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnExtensionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
