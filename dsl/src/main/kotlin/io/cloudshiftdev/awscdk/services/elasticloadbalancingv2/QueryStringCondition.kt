package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.String
import kotlin.Unit

public interface QueryStringCondition {
  public fun key(): String? = unwrap(this).getKey()

  public fun `value`(): String

  public interface Builder {
    public fun key(key: String)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition.builder()

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition,
  ) : QueryStringCondition {
    override fun key(): String? = unwrap(this).getKey()

    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): QueryStringCondition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition):
        QueryStringCondition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueryStringCondition):
        software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition = (wrapped as
        Wrapper).cdkObject
  }
}
