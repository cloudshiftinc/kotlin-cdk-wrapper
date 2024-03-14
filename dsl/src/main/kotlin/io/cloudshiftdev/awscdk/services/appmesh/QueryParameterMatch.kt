package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class QueryParameterMatch
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.appmesh.QueryParameterMatch,
) {
    /**
     * Returns the query parameter match configuration.
     *
     * @param scope
     */
    public open fun bind(scope: Construct): QueryParameterMatchConfig =
        unwrap(this).bind(scope.let(Construct::unwrap)).let(QueryParameterMatchConfig::wrap)

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appmesh.QueryParameterMatch,
    ) : QueryParameterMatch(cdkObject)

    public companion object {
        public fun valueIs(
            queryParameterName: String,
            queryParameterValue: String
        ): QueryParameterMatch =
            software.amazon.awscdk.services.appmesh.QueryParameterMatch.valueIs(
                    queryParameterName,
                    queryParameterValue
                )
                .let(QueryParameterMatch::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.QueryParameterMatch
        ): QueryParameterMatch = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: QueryParameterMatch
        ): software.amazon.awscdk.services.appmesh.QueryParameterMatch =
            (wrapped as Wrapper).cdkObject
    }
}
