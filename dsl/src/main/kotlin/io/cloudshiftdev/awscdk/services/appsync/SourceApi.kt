package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface SourceApi {
    /** Description of the Source API asssociation. */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Merging option used to associate the source API to the Merged API.
     *
     * Default: - Auto merge. The merge is triggered automatically when the source API has changed
     */
    public fun mergeType(): MergeType? = unwrap(this).getMergeType()?.let(MergeType::wrap)

    /** Source API that is associated with the merged API. */
    public fun sourceApi(): IGraphqlApi

    /** A builder for [SourceApi] */
    @CdkDslMarker
    public interface Builder {
        /** @param description Description of the Source API asssociation. */
        public fun description(description: String)

        /** @param mergeType Merging option used to associate the source API to the Merged API. */
        public fun mergeType(mergeType: MergeType)

        /** @param sourceApi Source API that is associated with the merged API. */
        public fun sourceApi(sourceApi: IGraphqlApi)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.appsync.SourceApi.Builder =
            software.amazon.awscdk.services.appsync.SourceApi.builder()

        /** @param description Description of the Source API asssociation. */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /** @param mergeType Merging option used to associate the source API to the Merged API. */
        override fun mergeType(mergeType: MergeType) {
            cdkBuilder.mergeType(mergeType.let(MergeType::unwrap))
        }

        /** @param sourceApi Source API that is associated with the merged API. */
        override fun sourceApi(sourceApi: IGraphqlApi) {
            cdkBuilder.sourceApi(sourceApi.let(IGraphqlApi::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.appsync.SourceApi = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appsync.SourceApi,
    ) : SourceApi {
        /** Description of the Source API asssociation. */
        override fun description(): String? = unwrap(this).getDescription()

        /**
         * Merging option used to associate the source API to the Merged API.
         *
         * Default: - Auto merge. The merge is triggered automatically when the source API has
         * changed
         */
        override fun mergeType(): MergeType? = unwrap(this).getMergeType()?.let(MergeType::wrap)

        /** Source API that is associated with the merged API. */
        override fun sourceApi(): IGraphqlApi = unwrap(this).getSourceApi().let(IGraphqlApi::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): SourceApi {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SourceApi): SourceApi =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: SourceApi): software.amazon.awscdk.services.appsync.SourceApi =
            (wrapped as Wrapper).cdkObject
    }
}
