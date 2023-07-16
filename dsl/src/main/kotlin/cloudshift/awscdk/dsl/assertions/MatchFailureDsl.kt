@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.assertions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.assertions.MatchFailure
import software.amazon.awscdk.assertions.Matcher

@CdkDslMarker
public class MatchFailureDsl {
  private val cdkBuilder: MatchFailure.Builder = MatchFailure.builder()

  private val _path: MutableList<String> = mutableListOf()

  public fun cost(cost: Number) {
    cdkBuilder.cost(cost)
  }

  public fun matcher(matcher: Matcher) {
    cdkBuilder.matcher(matcher)
  }

  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  public fun path(vararg path: String) {
    _path.addAll(listOf(*path))
  }

  public fun path(path: Collection<String>) {
    _path.addAll(path)
  }

  public fun build(): MatchFailure {
    if(_path.isNotEmpty()) cdkBuilder.path(_path)
    return cdkBuilder.build()
  }
}
