package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public interface ICfnRuleConditionExpression : ICfnConditionExpression {
  public fun disambiguator(): Boolean

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.ICfnRuleConditionExpression,
  ) : ICfnRuleConditionExpression {
    public override fun creationStack(): List<String> = unwrap(this).getCreationStack() ?:
        emptyList()

    public override fun disambiguator(): Boolean = unwrap(this).getDisambiguator()

    public override fun resolve(arg0: IResolveContext): Any =
        unwrap(this).resolve(arg0.let(IResolveContext::unwrap))

    public override fun toString(): String = unwrap(this).toString()

    public override fun typeHint(): ResolutionTypeHint? =
        unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ICfnRuleConditionExpression):
        ICfnRuleConditionExpression = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICfnRuleConditionExpression):
        software.amazon.awscdk.ICfnRuleConditionExpression = (wrapped as Wrapper).cdkObject
  }
}
