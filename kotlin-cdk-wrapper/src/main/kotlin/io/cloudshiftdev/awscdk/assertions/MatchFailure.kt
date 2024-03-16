@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Match failure details.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.assertions.*;
 * Matcher matcher;
 * MatchFailure matchFailure = MatchFailure.builder()
 * .matcher(matcher)
 * .message("message")
 * .path(List.of("path"))
 * // the properties below are optional
 * .cost(123)
 * .build();
 * ```
 */
public interface MatchFailure {
  /**
   * The cost of this particular mismatch.
   *
   * Default: 1
   */
  public fun cost(): Number? = unwrap(this).getCost()

  /**
   * The matcher that had the failure.
   */
  public fun matcher(): Matcher

  /**
   * Failure message.
   */
  public fun message(): String

  /**
   * The relative path in the target where the failure occurred.
   *
   * If the failure occurred at root of the match tree, set the path to an empty list.
   * If it occurs in the 5th index of an array nested within the 'foo' key of an object,
   * set the path as `['/foo', '[5]']`.
   */
  public fun path(): List<String>

  /**
   * A builder for [MatchFailure]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cost The cost of this particular mismatch.
     */
    public fun cost(cost: Number)

    /**
     * @param matcher The matcher that had the failure. 
     */
    public fun matcher(matcher: Matcher)

    /**
     * @param message Failure message. 
     */
    public fun message(message: String)

    /**
     * @param path The relative path in the target where the failure occurred. 
     * If the failure occurred at root of the match tree, set the path to an empty list.
     * If it occurs in the 5th index of an array nested within the 'foo' key of an object,
     * set the path as `['/foo', '[5]']`.
     */
    public fun path(path: List<String>)

    /**
     * @param path The relative path in the target where the failure occurred. 
     * If the failure occurred at root of the match tree, set the path to an empty list.
     * If it occurs in the 5th index of an array nested within the 'foo' key of an object,
     * set the path as `['/foo', '[5]']`.
     */
    public fun path(vararg path: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.assertions.MatchFailure.Builder =
        software.amazon.awscdk.assertions.MatchFailure.builder()

    /**
     * @param cost The cost of this particular mismatch.
     */
    override fun cost(cost: Number) {
      cdkBuilder.cost(cost)
    }

    /**
     * @param matcher The matcher that had the failure. 
     */
    override fun matcher(matcher: Matcher) {
      cdkBuilder.matcher(matcher.let(Matcher::unwrap))
    }

    /**
     * @param message Failure message. 
     */
    override fun message(message: String) {
      cdkBuilder.message(message)
    }

    /**
     * @param path The relative path in the target where the failure occurred. 
     * If the failure occurred at root of the match tree, set the path to an empty list.
     * If it occurs in the 5th index of an array nested within the 'foo' key of an object,
     * set the path as `['/foo', '[5]']`.
     */
    override fun path(path: List<String>) {
      cdkBuilder.path(path)
    }

    /**
     * @param path The relative path in the target where the failure occurred. 
     * If the failure occurred at root of the match tree, set the path to an empty list.
     * If it occurs in the 5th index of an array nested within the 'foo' key of an object,
     * set the path as `['/foo', '[5]']`.
     */
    override fun path(vararg path: String): Unit = path(path.toList())

    public fun build(): software.amazon.awscdk.assertions.MatchFailure = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.assertions.MatchFailure,
  ) : CdkObject(cdkObject), MatchFailure {
    /**
     * The cost of this particular mismatch.
     *
     * Default: 1
     */
    override fun cost(): Number? = unwrap(this).getCost()

    /**
     * The matcher that had the failure.
     */
    override fun matcher(): Matcher = unwrap(this).getMatcher().let(Matcher::wrap)

    /**
     * Failure message.
     */
    override fun message(): String = unwrap(this).getMessage()

    /**
     * The relative path in the target where the failure occurred.
     *
     * If the failure occurred at root of the match tree, set the path to an empty list.
     * If it occurs in the 5th index of an array nested within the 'foo' key of an object,
     * set the path as `['/foo', '[5]']`.
     */
    override fun path(): List<String> = unwrap(this).getPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MatchFailure {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.MatchFailure): MatchFailure =
        CdkObjectWrappers.wrap(cdkObject) as MatchFailure

    internal fun unwrap(wrapped: MatchFailure): software.amazon.awscdk.assertions.MatchFailure =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.assertions.MatchFailure
  }
}
