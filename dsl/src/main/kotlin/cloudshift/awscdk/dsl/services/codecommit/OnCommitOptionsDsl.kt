@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.events.EventPatternDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codecommit.OnCommitOptions
import software.amazon.awscdk.services.events.EventPattern
import software.amazon.awscdk.services.events.IRuleTarget
import software.constructs.Construct

@CdkDslMarker
public class OnCommitOptionsDsl {
  private val cdkBuilder: OnCommitOptions.Builder = OnCommitOptions.builder()

  private val _branches: MutableList<String> = mutableListOf()

  public fun branches(vararg branches: String) {
    _branches.addAll(listOf(*branches))
  }

  public fun branches(branches: Collection<String>) {
    _branches.addAll(branches)
  }

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

  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  public fun target(target: IRuleTarget) {
    cdkBuilder.target(target)
  }

  public fun build(): OnCommitOptions {
    if(_branches.isNotEmpty()) cdkBuilder.branches(_branches)
    return cdkBuilder.build()
  }
}
