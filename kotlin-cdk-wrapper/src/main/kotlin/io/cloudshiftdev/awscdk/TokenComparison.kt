@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject

public open class TokenComparison internal constructor(
  internal override val cdkObject: software.amazon.awscdk.TokenComparison,
) : CdkObject(cdkObject) {
  public companion object {
    public val BOTH_UNRESOLVED: TokenComparison =
        TokenComparison.wrap(software.amazon.awscdk.TokenComparison.BOTH_UNRESOLVED)

    public val DIFFERENT: TokenComparison =
        TokenComparison.wrap(software.amazon.awscdk.TokenComparison.DIFFERENT)

    public val ONE_UNRESOLVED: TokenComparison =
        TokenComparison.wrap(software.amazon.awscdk.TokenComparison.ONE_UNRESOLVED)

    public val SAME: TokenComparison =
        TokenComparison.wrap(software.amazon.awscdk.TokenComparison.SAME)

    internal fun wrap(cdkObject: software.amazon.awscdk.TokenComparison): TokenComparison =
        TokenComparison(cdkObject)

    internal fun unwrap(wrapped: TokenComparison): software.amazon.awscdk.TokenComparison =
        wrapped.cdkObject
  }
}
