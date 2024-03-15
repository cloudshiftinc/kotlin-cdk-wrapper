@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any

public interface ITokenMapper {
  public fun mapToken(arg0: IResolvable): Any

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ITokenMapper,
  ) : CdkObject(cdkObject), ITokenMapper {
    override fun mapToken(arg0: IResolvable): Any =
        unwrap(this).mapToken(arg0.let(IResolvable::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ITokenMapper): ITokenMapper =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITokenMapper): software.amazon.awscdk.ITokenMapper = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.ITokenMapper
  }
}
