@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconvert

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplate
import software.constructs.Construct

@CdkDslMarker
public class CfnJobTemplateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnJobTemplate.Builder = CfnJobTemplate.Builder.create(scope, id)

  private val _hopDestinations: MutableList<Any> = mutableListOf()

  public fun accelerationSettings(accelerationSettings: IResolvable) {
    cdkBuilder.accelerationSettings(accelerationSettings)
  }

  public
      fun accelerationSettings(accelerationSettings: CfnJobTemplate.AccelerationSettingsProperty) {
    cdkBuilder.accelerationSettings(accelerationSettings)
  }

  public fun category(category: String) {
    cdkBuilder.category(category)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun hopDestinations(vararg hopDestinations: Any) {
    _hopDestinations.addAll(listOf(*hopDestinations))
  }

  public fun hopDestinations(hopDestinations: Collection<Any>) {
    _hopDestinations.addAll(hopDestinations)
  }

  public fun hopDestinations(hopDestinations: IResolvable) {
    cdkBuilder.hopDestinations(hopDestinations)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun queue(queue: String) {
    cdkBuilder.queue(queue)
  }

  public fun settingsJson(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.settingsJson(builder.map)
  }

  public fun settingsJson(settingsJson: Any) {
    cdkBuilder.settingsJson(settingsJson)
  }

  public fun statusUpdateInterval(statusUpdateInterval: String) {
    cdkBuilder.statusUpdateInterval(statusUpdateInterval)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnJobTemplate {
    if(_hopDestinations.isNotEmpty()) cdkBuilder.hopDestinations(_hopDestinations)
    return cdkBuilder.build()
  }
}
