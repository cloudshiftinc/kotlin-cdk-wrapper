@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.events.EventPatternDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.events.EventPattern
import software.amazon.awscdk.services.events.IRuleTarget
import software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions
import software.constructs.Construct

/**
 * Options for the onCloudTrailPutObject method.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * import software.amazon.awscdk.services.s3.*;
 * import software.constructs.*;
 * Construct construct;
 * Object detail;
 * IRuleTarget ruleTarget;
 * OnCloudTrailBucketEventOptions onCloudTrailBucketEventOptions =
 * OnCloudTrailBucketEventOptions.builder()
 * .crossStackScope(construct)
 * .description("description")
 * .eventPattern(EventPattern.builder()
 * .account(List.of("account"))
 * .detail(Map.of(
 * "detailKey", detail))
 * .detailType(List.of("detailType"))
 * .id(List.of("id"))
 * .region(List.of("region"))
 * .resources(List.of("resources"))
 * .source(List.of("source"))
 * .time(List.of("time"))
 * .version(List.of("version"))
 * .build())
 * .paths(List.of("paths"))
 * .ruleName("ruleName")
 * .target(ruleTarget)
 * .build();
 * ```
 */
@CdkDslMarker
public class OnCloudTrailBucketEventOptionsDsl {
  private val cdkBuilder: OnCloudTrailBucketEventOptions.Builder =
      OnCloudTrailBucketEventOptions.builder()

  private val _paths: MutableList<String> = mutableListOf()

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
   * @param paths Only watch changes to these object paths.
   */
  public fun paths(vararg paths: String) {
    _paths.addAll(listOf(*paths))
  }

  /**
   * @param paths Only watch changes to these object paths.
   */
  public fun paths(paths: Collection<String>) {
    _paths.addAll(paths)
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

  public fun build(): OnCloudTrailBucketEventOptions {
    if(_paths.isNotEmpty()) cdkBuilder.paths(_paths)
    return cdkBuilder.build()
  }
}
