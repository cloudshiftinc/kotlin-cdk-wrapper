package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class QueryDefinition
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.logs.QueryDefinition,
) : Resource(cdkObject) {
    /** The ID of the query definition. */
    public open fun queryDefinitionId(): String = unwrap(this).getQueryDefinitionId()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.logs.QueryDefinition]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Specify certain log groups for the query definition.
         *
         * Default: - no specified log groups
         *
         * @param logGroups Specify certain log groups for the query definition.
         */
        public fun logGroups(logGroups: List<ILogGroup>)

        /**
         * Specify certain log groups for the query definition.
         *
         * Default: - no specified log groups
         *
         * @param logGroups Specify certain log groups for the query definition.
         */
        public fun logGroups(vararg logGroups: ILogGroup)

        /**
         * Name of the query definition.
         *
         * @param queryDefinitionName Name of the query definition.
         */
        public fun queryDefinitionName(queryDefinitionName: String)

        /**
         * The query string to use for this query definition.
         *
         * @param queryString The query string to use for this query definition.
         */
        public fun queryString(queryString: QueryString)

        /**
         * The query string to use for this query definition.
         *
         * @param queryString The query string to use for this query definition.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e4eaf5fbf6d9c40672ed6a0d4ad30cb03e413ed50343ede6e3f399854f51f174")
        public fun queryString(queryString: QueryString.Builder.() -> Unit)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.logs.QueryDefinition.Builder =
            software.amazon.awscdk.services.logs.QueryDefinition.Builder.create(scope, id)

        /**
         * Specify certain log groups for the query definition.
         *
         * Default: - no specified log groups
         *
         * @param logGroups Specify certain log groups for the query definition.
         */
        override fun logGroups(logGroups: List<ILogGroup>) {
            cdkBuilder.logGroups(logGroups.map(ILogGroup::unwrap))
        }

        /**
         * Specify certain log groups for the query definition.
         *
         * Default: - no specified log groups
         *
         * @param logGroups Specify certain log groups for the query definition.
         */
        override fun logGroups(vararg logGroups: ILogGroup): Unit = logGroups(logGroups.toList())

        /**
         * Name of the query definition.
         *
         * @param queryDefinitionName Name of the query definition.
         */
        override fun queryDefinitionName(queryDefinitionName: String) {
            cdkBuilder.queryDefinitionName(queryDefinitionName)
        }

        /**
         * The query string to use for this query definition.
         *
         * @param queryString The query string to use for this query definition.
         */
        override fun queryString(queryString: QueryString) {
            cdkBuilder.queryString(queryString.let(QueryString::unwrap))
        }

        /**
         * The query string to use for this query definition.
         *
         * @param queryString The query string to use for this query definition.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e4eaf5fbf6d9c40672ed6a0d4ad30cb03e413ed50343ede6e3f399854f51f174")
        override fun queryString(queryString: QueryString.Builder.() -> Unit): Unit =
            queryString(QueryString(queryString))

        public fun build(): software.amazon.awscdk.services.logs.QueryDefinition =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): QueryDefinition {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return QueryDefinition(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.logs.QueryDefinition
        ): QueryDefinition = QueryDefinition(cdkObject)

        internal fun unwrap(
            wrapped: QueryDefinition
        ): software.amazon.awscdk.services.logs.QueryDefinition = wrapped.cdkObject
    }
}
