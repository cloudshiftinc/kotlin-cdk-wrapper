@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Capture values while matching templates.
 *
 * Using an instance of this class within a Matcher will capture the matching value.
 * The `as*()` APIs on the instance can be used to get the captured value.
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
 * //         "Fred": "Flob",
 * //       }
 * //     },
 * //     "MyBaz": {
 * //       "Type": "Foo::Bar",
 * //       "Properties": {
 * //         "Fred": "Quib",
 * //       }
 * //     }
 * //   }
 * // }
 * Capture fredCapture = new Capture();
 * template.hasResourceProperties("Foo::Bar", Map.of(
 * "Fred", fredCapture));
 * fredCapture.asString(); // returns "Flob"
 * fredCapture.next(); // returns true
 * fredCapture.asString();
 * ```
 */
public open class Capture internal constructor(
  internal override val cdkObject: software.amazon.awscdk.assertions.Capture,
) : Matcher(cdkObject) {
  /**
   * Retrieve the captured value as an array.
   *
   * An error is generated if no value is captured or if the value is not an array.
   */
  public open fun asArray(): List<Any> = unwrap(this).asArray()

  /**
   * Retrieve the captured value as a boolean.
   *
   * An error is generated if no value is captured or if the value is not a boolean.
   */
  public open fun asBoolean(): Boolean = unwrap(this).asBoolean()

  /**
   * Retrieve the captured value as a number.
   *
   * An error is generated if no value is captured or if the value is not a number.
   */
  public open fun asNumber(): Number = unwrap(this).asNumber()

  /**
   * Retrieve the captured value as a JSON object.
   *
   * An error is generated if no value is captured or if the value is not an object.
   */
  public open fun asObject(): Map<String, Any> = unwrap(this).asObject() ?: emptyMap()

  /**
   * Retrieve the captured value as a string.
   *
   * An error is generated if no value is captured or if the value is not a string.
   */
  public open fun asString(): String = unwrap(this).asString()

  /**
   * A name for the matcher.
   *
   * This is collected as part of the result and may be presented to the user.
   */
  public override fun name(): String = unwrap(this).getName()

  /**
   * When multiple results are captured, move the iterator to the next result.
   *
   * @return true if another capture is present, false otherwise
   */
  public open fun next(): Boolean = unwrap(this).next()

  /**
   * Test whether a target matches the provided pattern.
   *
   * Every Matcher must implement this method.
   * This method will be invoked by the assertions framework. Do not call this method directly.
   *
   * @param actual 
   */
  public override fun test(`actual`: Any): MatchResult =
      unwrap(this).test(`actual`).let(MatchResult::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.Capture): Capture =
        Capture(cdkObject)

    internal fun unwrap(wrapped: Capture): software.amazon.awscdk.assertions.Capture =
        wrapped.cdkObject
  }
}
