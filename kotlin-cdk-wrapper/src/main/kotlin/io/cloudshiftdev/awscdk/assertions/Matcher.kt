@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String

public abstract class Matcher internal constructor(
  internal override val cdkObject: software.amazon.awscdk.assertions.Matcher,
) : CdkObject(cdkObject) {
  public open fun name(): String = unwrap(this).getName()

  public open fun test(arg0: Any): MatchResult = unwrap(this).test(arg0).let(MatchResult::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.assertions.Matcher,
  ) : Matcher(cdkObject)

  public companion object {
    public fun isMatcher(x: Any): Boolean = software.amazon.awscdk.assertions.Matcher.isMatcher(x)

    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.Matcher): Matcher =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Matcher): software.amazon.awscdk.assertions.Matcher = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.assertions.Matcher
  }
}
