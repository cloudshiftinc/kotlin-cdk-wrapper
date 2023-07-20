@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.frauddetector

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.frauddetector.CfnDetector

@CdkDslMarker
public class CfnDetectorEventTypePropertyDsl {
  private val cdkBuilder: CfnDetector.EventTypeProperty.Builder =
      CfnDetector.EventTypeProperty.builder()

  private val _entityTypes: MutableList<Any> = mutableListOf()

  private val _eventVariables: MutableList<Any> = mutableListOf()

  private val _labels: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun createdTime(createdTime: String) {
    cdkBuilder.createdTime(createdTime)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun entityTypes(vararg entityTypes: Any) {
    _entityTypes.addAll(listOf(*entityTypes))
  }

  public fun entityTypes(entityTypes: Collection<Any>) {
    _entityTypes.addAll(entityTypes)
  }

  public fun entityTypes(entityTypes: IResolvable) {
    cdkBuilder.entityTypes(entityTypes)
  }

  public fun eventVariables(vararg eventVariables: Any) {
    _eventVariables.addAll(listOf(*eventVariables))
  }

  public fun eventVariables(eventVariables: Collection<Any>) {
    _eventVariables.addAll(eventVariables)
  }

  public fun eventVariables(eventVariables: IResolvable) {
    cdkBuilder.eventVariables(eventVariables)
  }

  public fun `inline`(`inline`: Boolean) {
    cdkBuilder.`inline`(`inline`)
  }

  public fun `inline`(`inline`: IResolvable) {
    cdkBuilder.`inline`(`inline`)
  }

  public fun labels(vararg labels: Any) {
    _labels.addAll(listOf(*labels))
  }

  public fun labels(labels: Collection<Any>) {
    _labels.addAll(labels)
  }

  public fun labels(labels: IResolvable) {
    cdkBuilder.labels(labels)
  }

  public fun lastUpdatedTime(lastUpdatedTime: String) {
    cdkBuilder.lastUpdatedTime(lastUpdatedTime)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDetector.EventTypeProperty {
    if(_entityTypes.isNotEmpty()) cdkBuilder.entityTypes(_entityTypes)
    if(_eventVariables.isNotEmpty()) cdkBuilder.eventVariables(_eventVariables)
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
