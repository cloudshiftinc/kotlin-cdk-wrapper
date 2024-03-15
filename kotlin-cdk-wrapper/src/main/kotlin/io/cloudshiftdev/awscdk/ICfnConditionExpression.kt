@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.List

public interface ICfnConditionExpression : IResolvable {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ICfnConditionExpression,
  ) : CdkObject(cdkObject), ICfnConditionExpression {
    override fun creationStack(): List<String> = unwrap(this).getCreationStack()

    override fun resolve(arg0: IResolveContext): Any =
        unwrap(this).resolve(arg0.let(IResolveContext::unwrap))

    override fun toString(): String = unwrap(this).toString()

    override fun typeHint(): ResolutionTypeHint? =
        unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ICfnConditionExpression):
        ICfnConditionExpression = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICfnConditionExpression):
        software.amazon.awscdk.ICfnConditionExpression = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.ICfnConditionExpression
  }
}
