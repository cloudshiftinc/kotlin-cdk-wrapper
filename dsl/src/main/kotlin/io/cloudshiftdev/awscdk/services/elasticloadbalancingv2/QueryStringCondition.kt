package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface QueryStringCondition {
  /**
   * The query string key for the condition.
   *
   * Default: - Any key can be matched.
   */
  public fun key(): String? = unwrap(this).getKey()

  /**
   * The query string value for the condition.
   */
  public fun `value`(): String

  /**
   * A builder for [QueryStringCondition]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param key The query string key for the condition.
     */
    public fun key(key: String)

    /**
     * @param value The query string value for the condition. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition.builder()

    /**
     * @param key The query string key for the condition.
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param value The query string value for the condition. 
     */
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
    /**
     * The query string key for the condition.
     *
     * Default: - Any key can be matched.
     */
    override fun key(): String? = unwrap(this).getKey()

    /**
     * The query string value for the condition.
     */
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
