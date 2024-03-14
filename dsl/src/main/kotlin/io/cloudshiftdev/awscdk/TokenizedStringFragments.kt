package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.Number
import kotlin.collections.List

public open class TokenizedStringFragments internal constructor(
  internal override val cdkObject: software.amazon.awscdk.TokenizedStringFragments,
) : CdkObject(cdkObject) {
  /**
   * @param value 
   */
  public open fun addIntrinsic(`value`: Any) {
    unwrap(this).addIntrinsic(`value`)
  }

  /**
   * @param lit 
   */
  public open fun addLiteral(lit: Any) {
    unwrap(this).addLiteral(lit)
  }

  /**
   * @param token 
   */
  public open fun addToken(token: IResolvable) {
    unwrap(this).addToken(token.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun firstToken(): IResolvable? = unwrap(this).getFirstToken()?.let(IResolvable::wrap)

  /**
   *
   */
  public open fun firstValue(): Any = unwrap(this).getFirstValue()

  /**
   * Combine the string fragments using the given joiner.
   *
   * If there are any
   *
   * @param concat 
   */
  public open fun join(concat: IFragmentConcatenator): Any =
      unwrap(this).join(concat.let(IFragmentConcatenator::unwrap))

  /**
   *
   */
  public open fun length(): Number = unwrap(this).getLength()

  /**
   * Apply a transformation function to all tokens in the string.
   *
   * @param mapper 
   */
  public open fun mapTokens(mapper: ITokenMapper): TokenizedStringFragments =
      unwrap(this).mapTokens(mapper.let(ITokenMapper::unwrap)).let(TokenizedStringFragments::wrap)

  /**
   * Return all Tokens from this string.
   */
  public open fun tokens(): List<IResolvable> = unwrap(this).getTokens().map(IResolvable::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.TokenizedStringFragments):
        TokenizedStringFragments = TokenizedStringFragments(cdkObject)

    internal fun unwrap(wrapped: TokenizedStringFragments):
        software.amazon.awscdk.TokenizedStringFragments = wrapped.cdkObject
  }
}
