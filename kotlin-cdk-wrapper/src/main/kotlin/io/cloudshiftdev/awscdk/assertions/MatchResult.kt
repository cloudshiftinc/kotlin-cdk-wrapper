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

public open class MatchResult internal constructor(
  internal override val cdkObject: software.amazon.awscdk.assertions.MatchResult,
) : CdkObject(cdkObject) {
  public open fun compose(id: String, `inner`: MatchResult): MatchResult = unwrap(this).compose(id,
      `inner`.let(MatchResult::unwrap)).let(MatchResult::wrap)

  public open fun failCost(): Number = unwrap(this).getFailCost()

  public open fun failCount(): Number = unwrap(this).getFailCount()

  public open fun finished(): MatchResult = unwrap(this).finished().let(MatchResult::wrap)

  public open fun hasFailed(): Boolean = unwrap(this).hasFailed()

  public open fun isSuccess(): Boolean = unwrap(this).getIsSuccess()

  @Deprecated(message = "deprecated in CDK")
  public open fun push(
    matcher: Matcher,
    path: List<String>,
    message: String,
  ): MatchResult = unwrap(this).push(matcher.let(Matcher::unwrap), path,
      message).let(MatchResult::wrap)

  public open fun recordCapture(options: MatchCapture) {
    unwrap(this).recordCapture(options.let(MatchCapture::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("189f52b87c51ca333df2dd0de3262ab3e62c2ee0479db6ba5025489d8e2bf609")
  public open fun recordCapture(options: MatchCapture.Builder.() -> Unit): Unit =
      recordCapture(MatchCapture(options))

  public open fun recordFailure(failure: MatchFailure): MatchResult =
      unwrap(this).recordFailure(failure.let(MatchFailure::unwrap)).let(MatchResult::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("faecf7de8a2be09ec604ce7540dc9486beef449ff8884551afd24d8556fe816e")
  public open fun recordFailure(failure: MatchFailure.Builder.() -> Unit): MatchResult =
      recordFailure(MatchFailure(failure))

  public open fun renderMismatch(): String = unwrap(this).renderMismatch()

  public open fun target(): Any = unwrap(this).getTarget()

  public open fun toHumanStrings(): List<String> = unwrap(this).toHumanStrings()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.MatchResult): MatchResult =
        MatchResult(cdkObject)

    internal fun unwrap(wrapped: MatchResult): software.amazon.awscdk.assertions.MatchResult =
        wrapped.cdkObject
  }
}
