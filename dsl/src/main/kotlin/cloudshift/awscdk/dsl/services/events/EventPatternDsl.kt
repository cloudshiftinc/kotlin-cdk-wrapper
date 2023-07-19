@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.events.EventPattern

@CdkDslMarker
public class EventPatternDsl {
  private val cdkBuilder: EventPattern.Builder = EventPattern.builder()

  private val _account: MutableList<String> = mutableListOf()

  private val _detailType: MutableList<String> = mutableListOf()

  private val _id: MutableList<String> = mutableListOf()

  private val _region: MutableList<String> = mutableListOf()

  private val _resources: MutableList<String> = mutableListOf()

  private val _source: MutableList<String> = mutableListOf()

  private val _time: MutableList<String> = mutableListOf()

  private val _version: MutableList<String> = mutableListOf()

  public fun account(vararg account: String) {
    _account.addAll(listOf(*account))
  }

  public fun account(account: Collection<String>) {
    _account.addAll(account)
  }

  public fun detail(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.detail(builder.map)
  }

  public fun detail(detail: Map<String, Any>) {
    cdkBuilder.detail(detail)
  }

  public fun detailType(vararg detailType: String) {
    _detailType.addAll(listOf(*detailType))
  }

  public fun detailType(detailType: Collection<String>) {
    _detailType.addAll(detailType)
  }

  public fun id(vararg id: String) {
    _id.addAll(listOf(*id))
  }

  public fun id(id: Collection<String>) {
    _id.addAll(id)
  }

  public fun region(vararg region: String) {
    _region.addAll(listOf(*region))
  }

  public fun region(region: Collection<String>) {
    _region.addAll(region)
  }

  public fun resources(vararg resources: String) {
    _resources.addAll(listOf(*resources))
  }

  public fun resources(resources: Collection<String>) {
    _resources.addAll(resources)
  }

  public fun source(vararg source: String) {
    _source.addAll(listOf(*source))
  }

  public fun source(source: Collection<String>) {
    _source.addAll(source)
  }

  public fun time(vararg time: String) {
    _time.addAll(listOf(*time))
  }

  public fun time(time: Collection<String>) {
    _time.addAll(time)
  }

  public fun version(vararg version: String) {
    _version.addAll(listOf(*version))
  }

  public fun version(version: Collection<String>) {
    _version.addAll(version)
  }

  public fun build(): EventPattern {
    if(_account.isNotEmpty()) cdkBuilder.account(_account)
    if(_detailType.isNotEmpty()) cdkBuilder.detailType(_detailType)
    if(_id.isNotEmpty()) cdkBuilder.id(_id)
    if(_region.isNotEmpty()) cdkBuilder.region(_region)
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    if(_source.isNotEmpty()) cdkBuilder.source(_source)
    if(_time.isNotEmpty()) cdkBuilder.time(_time)
    if(_version.isNotEmpty()) cdkBuilder.version(_version)
    return cdkBuilder.build()
  }
}
