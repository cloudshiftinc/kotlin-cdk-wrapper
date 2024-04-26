@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String

/**
 * Represents a matcher that can perform special data matching capabilities between a given pattern
 * and a target.
 *
 * Example:
 *
 * ```
 * // Given a template -
 * // {
 * //   "Resources": {
 * //     "MyBar": {
 * //       "Type": "Foo::Bar",
 * //       "Properties": {
 * //         "Fred": {
 * //           "Wobble": ["Flob", "Flib"],
 * //         }
 * //       }
 * //     }
 * //   }
 * // }
 * // The following will NOT throw an assertion error
 * template.hasResourceProperties("Foo::Bar", Map.of(
 * "Fred", Map.of(
 * "Wobble", List.of(Match.anyValue(), Match.anyValue()))));
 * // The following will throw an assertion error
 * template.hasResourceProperties("Foo::Bar", Map.of(
 * "Fred", Map.of(
 * "Wimble", Match.anyValue())));
 * ```
 */
public abstract class Matcher(
  cdkObject: software.amazon.awscdk.assertions.Matcher,
) : CdkObject(cdkObject) {
  /**
   * A name for the matcher.
   *
   * This is collected as part of the result and may be presented to the user.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Test whether a target matches the provided pattern.
   *
   * Every Matcher must implement this method.
   * This method will be invoked by the assertions framework. Do not call this method directly.
   *
   * @return the list of match failures. An empty array denotes a successful match.
   * @param actual the target to match. 
   */
  public open fun test(`actual`: Any): MatchResult =
      unwrap(this).test(`actual`).let(MatchResult::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.assertions.Matcher,
  ) : Matcher(cdkObject)

  public companion object {
    public fun isMatcher(x: Any): Boolean = software.amazon.awscdk.assertions.Matcher.isMatcher(x)

    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.Matcher): Matcher =
        CdkObjectWrappers.wrap(cdkObject) as? Matcher ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Matcher): software.amazon.awscdk.assertions.Matcher = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.assertions.Matcher
  }
}
