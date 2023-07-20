@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.frauddetector

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.frauddetector.CfnDetector
import software.amazon.awscdk.services.frauddetector.CfnDetectorProps

@CdkDslMarker
public class CfnDetectorPropsDsl {
  private val cdkBuilder: CfnDetectorProps.Builder = CfnDetectorProps.builder()

  private val _associatedModels: MutableList<Any> = mutableListOf()

  private val _rules: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun associatedModels(vararg associatedModels: Any) {
    _associatedModels.addAll(listOf(*associatedModels))
  }

  public fun associatedModels(associatedModels: Collection<Any>) {
    _associatedModels.addAll(associatedModels)
  }

  public fun associatedModels(associatedModels: IResolvable) {
    cdkBuilder.associatedModels(associatedModels)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun detectorId(detectorId: String) {
    cdkBuilder.detectorId(detectorId)
  }

  public fun detectorVersionStatus(detectorVersionStatus: String) {
    cdkBuilder.detectorVersionStatus(detectorVersionStatus)
  }

  public fun eventType(eventType: IResolvable) {
    cdkBuilder.eventType(eventType)
  }

  public fun eventType(eventType: CfnDetector.EventTypeProperty) {
    cdkBuilder.eventType(eventType)
  }

  public fun ruleExecutionMode(ruleExecutionMode: String) {
    cdkBuilder.ruleExecutionMode(ruleExecutionMode)
  }

  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDetectorProps {
    if(_associatedModels.isNotEmpty()) cdkBuilder.associatedModels(_associatedModels)
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
