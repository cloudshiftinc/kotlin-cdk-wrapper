package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.String
import kotlin.collections.List

public interface ICfnConditionExpression : IResolvable {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.ICfnConditionExpression,
  ) : ICfnConditionExpression {
    override fun creationStack(): List<String> = unwrap(this).getCreationStack() ?: emptyList()

    override fun resolve(arg0: IResolveContext): Any =
        unwrap(this).resolve(arg0.let(IResolveContext::unwrap))

    override fun toString(): String = unwrap(this).toString()

    override fun typeHint(): ResolutionTypeHint? =
        unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ICfnConditionExpression):
        ICfnConditionExpression = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICfnConditionExpression):
        software.amazon.awscdk.ICfnConditionExpression = (wrapped as Wrapper).cdkObject
  }
}
