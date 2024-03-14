package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.Any
import kotlin.String
import kotlin.collections.List

public abstract class ListenerCondition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition,
) {
  public open fun renderRawCondition(): Any = unwrap(this).renderRawCondition()

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition,
  ) : ListenerCondition(cdkObject)

  public companion object {
    public open fun hostHeaders(values: List<String>): ListenerCondition =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition.hostHeaders(values).let(ListenerCondition::wrap)

    public open fun hostHeaders(vararg values: String): ListenerCondition =
        hostHeaders(values.toList())

    public open fun httpHeader(name: String, values: List<String>): ListenerCondition =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition.httpHeader(name,
        values).let(ListenerCondition::wrap)

    public open fun httpRequestMethods(values: List<String>): ListenerCondition =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition.httpRequestMethods(values).let(ListenerCondition::wrap)

    public open fun httpRequestMethods(vararg values: String): ListenerCondition =
        httpRequestMethods(values.toList())

    public open fun pathPatterns(values: List<String>): ListenerCondition =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition.pathPatterns(values).let(ListenerCondition::wrap)

    public open fun pathPatterns(vararg values: String): ListenerCondition =
        pathPatterns(values.toList())

    public open fun queryStrings(values: List<QueryStringCondition>): ListenerCondition =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition.queryStrings(values.map(QueryStringCondition::unwrap)).let(ListenerCondition::wrap)

    public open fun queryStrings(vararg values: QueryStringCondition): ListenerCondition =
        queryStrings(values.toList())

    public open fun sourceIps(values: List<String>): ListenerCondition =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition.sourceIps(values).let(ListenerCondition::wrap)

    public open fun sourceIps(vararg values: String): ListenerCondition = sourceIps(values.toList())

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition):
        ListenerCondition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ListenerCondition):
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition = (wrapped as
        Wrapper).cdkObject
  }
}
