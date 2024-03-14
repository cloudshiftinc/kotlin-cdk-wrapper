package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class NoneDataSource
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.appsync.NoneDataSource,
) : BaseDataSource(cdkObject) {
    /** A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.NoneDataSource]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The API to attach this data source to.
         *
         * @param api The API to attach this data source to.
         */
        public fun api(api: IGraphqlApi)

        /**
         * the description of the data source.
         *
         * Default: - None
         *
         * @param description the description of the data source.
         */
        public fun description(description: String)

        /**
         * The name of the data source.
         *
         * Default: - id of data source
         *
         * @param name The name of the data source.
         */
        public fun name(name: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.appsync.NoneDataSource.Builder =
            software.amazon.awscdk.services.appsync.NoneDataSource.Builder.create(scope, id)

        /**
         * The API to attach this data source to.
         *
         * @param api The API to attach this data source to.
         */
        override fun api(api: IGraphqlApi) {
            cdkBuilder.api(api.let(IGraphqlApi::unwrap))
        }

        /**
         * the description of the data source.
         *
         * Default: - None
         *
         * @param description the description of the data source.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * The name of the data source.
         *
         * Default: - id of data source
         *
         * @param name The name of the data source.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        public fun build(): software.amazon.awscdk.services.appsync.NoneDataSource =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): NoneDataSource {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return NoneDataSource(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appsync.NoneDataSource
        ): NoneDataSource = NoneDataSource(cdkObject)

        internal fun unwrap(
            wrapped: NoneDataSource
        ): software.amazon.awscdk.services.appsync.NoneDataSource = wrapped.cdkObject
    }
}
