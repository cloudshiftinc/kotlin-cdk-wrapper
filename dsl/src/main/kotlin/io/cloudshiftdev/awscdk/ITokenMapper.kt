package io.cloudshiftdev.awscdk

import kotlin.Any

public interface ITokenMapper {
  /**
   * Replace a single token.
   *
   * @param t 
   */
  public fun mapToken(t: IResolvable): Any

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ITokenMapper,
  ) : CdkObject(cdkObject), ITokenMapper {
    /**
     * Replace a single token.
     *
     * @param t 
     */
    override fun mapToken(t: IResolvable): Any = unwrap(this).mapToken(t.let(IResolvable::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ITokenMapper): ITokenMapper =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITokenMapper): software.amazon.awscdk.ITokenMapper = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.ITokenMapper
  }
}
