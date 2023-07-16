@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.events.EventPatternDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions
import software.amazon.awscdk.services.events.EventPattern
import software.amazon.awscdk.services.events.IRuleTarget
import software.constructs.Construct

@CdkDslMarker
public class OnImageScanCompletedOptionsDsl {
  private val cdkBuilder: OnImageScanCompletedOptions.Builder =
      OnImageScanCompletedOptions.builder()

  private val _imageTags: MutableList<String> = mutableListOf()

  public fun crossStackScope(crossStackScope: Construct) {
    cdkBuilder.crossStackScope(crossStackScope)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun eventPattern(block: EventPatternDsl.() -> Unit = {}) {
    val builder = EventPatternDsl()
    builder.apply(block)
    cdkBuilder.eventPattern(builder.build())
  }

  public fun eventPattern(eventPattern: EventPattern) {
    cdkBuilder.eventPattern(eventPattern)
  }

  public fun imageTags(vararg imageTags: String) {
    _imageTags.addAll(listOf(*imageTags))
  }

  public fun imageTags(imageTags: Collection<String>) {
    _imageTags.addAll(imageTags)
  }

  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  public fun target(target: IRuleTarget) {
    cdkBuilder.target(target)
  }

  public fun build(): OnImageScanCompletedOptions {
    if(_imageTags.isNotEmpty()) cdkBuilder.imageTags(_imageTags)
    return cdkBuilder.build()
  }
}
