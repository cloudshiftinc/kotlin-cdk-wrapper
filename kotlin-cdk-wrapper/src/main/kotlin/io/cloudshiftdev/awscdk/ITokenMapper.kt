@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any

/**
 * Interface to apply operation to tokens in a string.
 *
 * Interface so it can be exported via jsii.
 */
public interface ITokenMapper {
  /**
   * Replace a single token.
   *
   * @param t 
   */
  public fun mapToken(t: IResolvable): Any

  private class Wrapper(
    cdkObject: software.amazon.awscdk.ITokenMapper,
  ) : CdkObject(cdkObject),
      ITokenMapper {
    /**
     * Replace a single token.
     *
     * @param t 
     */
    override fun mapToken(t: IResolvable): Any =
        unwrap(this).mapToken(t.let(IResolvable.Companion::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ITokenMapper): ITokenMapper =
        CdkObjectWrappers.wrap(cdkObject) as? ITokenMapper ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITokenMapper): software.amazon.awscdk.ITokenMapper = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.ITokenMapper
  }
}
