@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * The result of `Match.test()`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.assertions.*;
 * Object target;
 * MatchResult matchResult = new MatchResult(target);
 * ```
 */
public open class MatchResult internal constructor(
  internal override val cdkObject: software.amazon.awscdk.assertions.MatchResult,
) : CdkObject(cdkObject) {
  public constructor(target: Any) : this(software.amazon.awscdk.assertions.MatchResult(target))

  /**
   * Compose the results of a previous match as a subtree.
   *
   * @param id the id of the parent tree. 
   * @param inner 
   */
  public open fun compose(id: String, `inner`: MatchResult): MatchResult = unwrap(this).compose(id,
      `inner`.let(MatchResult::unwrap)).let(MatchResult::wrap)

  /**
   * The cost of the failures so far.
   */
  public open fun failCost(): Number = unwrap(this).getFailCost()

  /**
   * The number of failures.
   */
  public open fun failCount(): Number = unwrap(this).getFailCount()

  /**
   * Prepare the result to be analyzed.
   *
   * This API *must* be called prior to analyzing these results.
   */
  public open fun finished(): MatchResult = unwrap(this).finished().let(MatchResult::wrap)

  /**
   * Does the result contain any failures.
   *
   * If not, the result is a success
   */
  public open fun hasFailed(): Boolean = unwrap(this).hasFailed()

  /**
   * Whether the match is a success.
   */
  public open fun isSuccess(): Boolean = unwrap(this).getIsSuccess()

  /**
   * (deprecated) DEPRECATED.
   *
   * @deprecated use recordFailure()
   * @param matcher 
   * @param path 
   * @param message 
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun push(
    matcher: Matcher,
    path: List<String>,
    message: String,
  ): MatchResult = unwrap(this).push(matcher.let(Matcher::unwrap), path,
      message).let(MatchResult::wrap)

  /**
   * Record a capture against in this match result.
   *
   * @param options 
   */
  public open fun recordCapture(options: MatchCapture) {
    unwrap(this).recordCapture(options.let(MatchCapture::unwrap))
  }

  /**
   * Record a capture against in this match result.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("189f52b87c51ca333df2dd0de3262ab3e62c2ee0479db6ba5025489d8e2bf609")
  public open fun recordCapture(options: MatchCapture.Builder.() -> Unit): Unit =
      recordCapture(MatchCapture(options))

  /**
   * Record a new failure into this result at a specific path.
   *
   * @param failure 
   */
  public open fun recordFailure(failure: MatchFailure): MatchResult =
      unwrap(this).recordFailure(failure.let(MatchFailure::unwrap)).let(MatchResult::wrap)

  /**
   * Record a new failure into this result at a specific path.
   *
   * @param failure 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("faecf7de8a2be09ec604ce7540dc9486beef449ff8884551afd24d8556fe816e")
  public open fun recordFailure(failure: MatchFailure.Builder.() -> Unit): MatchResult =
      recordFailure(MatchFailure(failure))

  /**
   * Do a deep render of the match result, showing the structure mismatches in context.
   */
  public open fun renderMismatch(): String = unwrap(this).renderMismatch()

  /**
   * The target for which this result was generated.
   */
  public open fun target(): Any = unwrap(this).getTarget()

  /**
   * Render the failed match in a presentable way.
   *
   * Prefer using `renderMismatch` over this method. It is left for backwards
   * compatibility for test suites that expect it, but `renderMismatch()` will
   * produce better output.
   */
  public open fun toHumanStrings(): List<String> = unwrap(this).toHumanStrings()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.MatchResult): MatchResult =
        MatchResult(cdkObject)

    internal fun unwrap(wrapped: MatchResult): software.amazon.awscdk.assertions.MatchResult =
        wrapped.cdkObject
  }
}
