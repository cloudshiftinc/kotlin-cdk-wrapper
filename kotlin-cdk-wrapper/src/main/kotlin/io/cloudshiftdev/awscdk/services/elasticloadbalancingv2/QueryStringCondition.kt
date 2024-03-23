@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for the key/value pair of the query string.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * QueryStringCondition queryStringCondition = QueryStringCondition.builder()
 * .value("value")
 * // the properties below are optional
 * .key("key")
 * .build();
 * ```
 */
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

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition,
  ) : CdkObject(cdkObject), QueryStringCondition {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): QueryStringCondition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition):
        QueryStringCondition = CdkObjectWrappers.wrap(cdkObject) as? QueryStringCondition ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueryStringCondition):
        software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition
  }
}
