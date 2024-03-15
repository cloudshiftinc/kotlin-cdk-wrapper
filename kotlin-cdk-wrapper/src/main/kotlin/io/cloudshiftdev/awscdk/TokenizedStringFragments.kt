@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.collections.List

public open class TokenizedStringFragments internal constructor(
  internal override val cdkObject: software.amazon.awscdk.TokenizedStringFragments,
) : CdkObject(cdkObject) {
  public open fun addIntrinsic(`value`: Any) {
    unwrap(this).addIntrinsic(`value`)
  }

  public open fun addLiteral(lit: Any) {
    unwrap(this).addLiteral(lit)
  }

  public open fun addToken(token: IResolvable) {
    unwrap(this).addToken(token.let(IResolvable::unwrap))
  }

  public open fun firstToken(): IResolvable? = unwrap(this).getFirstToken()?.let(IResolvable::wrap)

  public open fun firstValue(): Any = unwrap(this).getFirstValue()

  public open fun join(concat: IFragmentConcatenator): Any =
      unwrap(this).join(concat.let(IFragmentConcatenator::unwrap))

  public open fun length(): Number = unwrap(this).getLength()

  public open fun mapTokens(mapper: ITokenMapper): TokenizedStringFragments =
      unwrap(this).mapTokens(mapper.let(ITokenMapper::unwrap)).let(TokenizedStringFragments::wrap)

  public open fun tokens(): List<IResolvable> = unwrap(this).getTokens().map(IResolvable::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.TokenizedStringFragments):
        TokenizedStringFragments = TokenizedStringFragments(cdkObject)

    internal fun unwrap(wrapped: TokenizedStringFragments):
        software.amazon.awscdk.TokenizedStringFragments = wrapped.cdkObject
  }
}
