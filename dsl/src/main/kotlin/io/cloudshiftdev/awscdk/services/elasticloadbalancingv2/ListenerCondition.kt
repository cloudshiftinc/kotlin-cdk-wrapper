package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.collections.List

public abstract class ListenerCondition internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition,
) : CdkObject(cdkObject) {
  /**
   * Render the raw Cfn listener rule condition object.
   */
  public open fun renderRawCondition(): Any = unwrap(this).renderRawCondition()

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition,
  ) : ListenerCondition(cdkObject)

  public companion object {
    public fun hostHeaders(values: List<String>): ListenerCondition =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition.hostHeaders(values).let(ListenerCondition::wrap)

    public fun hostHeaders(vararg values: String): ListenerCondition = hostHeaders(values.toList())

    public fun httpHeader(name: String, values: List<String>): ListenerCondition =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition.httpHeader(name,
        values).let(ListenerCondition::wrap)

    public fun httpRequestMethods(values: List<String>): ListenerCondition =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition.httpRequestMethods(values).let(ListenerCondition::wrap)

    public fun httpRequestMethods(vararg values: String): ListenerCondition =
        httpRequestMethods(values.toList())

    public fun pathPatterns(values: List<String>): ListenerCondition =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition.pathPatterns(values).let(ListenerCondition::wrap)

    public fun pathPatterns(vararg values: String): ListenerCondition =
        pathPatterns(values.toList())

    public fun queryStrings(values: List<QueryStringCondition>): ListenerCondition =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition.queryStrings(values.map(QueryStringCondition::unwrap)).let(ListenerCondition::wrap)

    public fun queryStrings(vararg values: QueryStringCondition): ListenerCondition =
        queryStrings(values.toList())

    public fun sourceIps(values: List<String>): ListenerCondition =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition.sourceIps(values).let(ListenerCondition::wrap)

    public fun sourceIps(vararg values: String): ListenerCondition = sourceIps(values.toList())

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition):
        ListenerCondition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ListenerCondition):
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition
  }
}