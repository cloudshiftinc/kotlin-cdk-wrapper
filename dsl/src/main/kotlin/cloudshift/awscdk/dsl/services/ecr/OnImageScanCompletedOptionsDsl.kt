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

  /**
   * @param crossStackScope The scope to use if the source of the rule and its target are in
   * different Stacks (but in the same account &amp; region).
   * This helps dealing with cycles that often arise in these situations.
   */
  public fun crossStackScope(crossStackScope: Construct) {
    cdkBuilder.crossStackScope(crossStackScope)
  }

  /**
   * @param description A description of the rule's purpose.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param eventPattern Additional restrictions for the event to route to the specified target.
   * The method that generates the rule probably imposes some type of event
   * filtering. The filtering implied by what you pass here is added
   * on top of that filtering.
   */
  public fun eventPattern(eventPattern: EventPatternDsl.() -> Unit = {}) {
    val builder = EventPatternDsl()
    builder.apply(eventPattern)
    cdkBuilder.eventPattern(builder.build())
  }

  /**
   * @param eventPattern Additional restrictions for the event to route to the specified target.
   * The method that generates the rule probably imposes some type of event
   * filtering. The filtering implied by what you pass here is added
   * on top of that filtering.
   */
  public fun eventPattern(eventPattern: EventPattern) {
    cdkBuilder.eventPattern(eventPattern)
  }

  /**
   * @param imageTags Only watch changes to the image tags specified.
   * Leave it undefined to watch the full repository.
   */
  public fun imageTags(vararg imageTags: String) {
    _imageTags.addAll(listOf(*imageTags))
  }

  /**
   * @param imageTags Only watch changes to the image tags specified.
   * Leave it undefined to watch the full repository.
   */
  public fun imageTags(imageTags: Collection<String>) {
    _imageTags.addAll(imageTags)
  }

  /**
   * @param ruleName A name for the rule.
   */
  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  /**
   * @param target The target to register for the event.
   */
  public fun target(target: IRuleTarget) {
    cdkBuilder.target(target)
  }

  public fun build(): OnImageScanCompletedOptions {
    if(_imageTags.isNotEmpty()) cdkBuilder.imageTags(_imageTags)
    return cdkBuilder.build()
  }
}
