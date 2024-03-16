@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Partial and special matching during template assertions.
 */
public abstract class Match internal constructor(
  internal override val cdkObject: software.amazon.awscdk.assertions.Match,
) : CdkObject(cdkObject) {
  public companion object {
    public fun absent(): Matcher =
        software.amazon.awscdk.assertions.Match.absent().let(Matcher::wrap)

    public fun anyValue(): Matcher =
        software.amazon.awscdk.assertions.Match.anyValue().let(Matcher::wrap)

    public fun arrayEquals(pattern: List<Any>): Matcher =
        software.amazon.awscdk.assertions.Match.arrayEquals(pattern).let(Matcher::wrap)

    public fun arrayEquals(vararg pattern: Any): Matcher = arrayEquals(pattern.toList())

    public fun arrayWith(pattern: List<Any>): Matcher =
        software.amazon.awscdk.assertions.Match.arrayWith(pattern).let(Matcher::wrap)

    public fun arrayWith(vararg pattern: Any): Matcher = arrayWith(pattern.toList())

    public fun exact(pattern: Any): Matcher =
        software.amazon.awscdk.assertions.Match.exact(pattern).let(Matcher::wrap)

    public fun not(pattern: Any): Matcher =
        software.amazon.awscdk.assertions.Match.not(pattern).let(Matcher::wrap)

    public fun objectEquals(pattern: Map<String, Any>): Matcher =
        software.amazon.awscdk.assertions.Match.objectEquals(pattern).let(Matcher::wrap)

    public fun objectLike(pattern: Map<String, Any>): Matcher =
        software.amazon.awscdk.assertions.Match.objectLike(pattern).let(Matcher::wrap)

    public fun serializedJson(pattern: Any): Matcher =
        software.amazon.awscdk.assertions.Match.serializedJson(pattern).let(Matcher::wrap)

    public fun stringLikeRegexp(pattern: String): Matcher =
        software.amazon.awscdk.assertions.Match.stringLikeRegexp(pattern).let(Matcher::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.Match): Match =
        CdkObjectWrappers.wrap(cdkObject) as Match

    internal fun unwrap(wrapped: Match): software.amazon.awscdk.assertions.Match = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.assertions.Match
  }
}
