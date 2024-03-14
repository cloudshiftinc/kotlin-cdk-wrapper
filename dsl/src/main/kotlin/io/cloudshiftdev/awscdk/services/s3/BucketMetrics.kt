package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface BucketMetrics {
    /** The ID used to identify the metrics configuration. */
    public fun id(): String

    /** The prefix that an object must have to be included in the metrics results. */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * Specifies a list of tag filters to use as a metrics configuration filter.
     *
     * The metrics configuration includes only objects that meet the filter's criteria.
     */
    public fun tagFilters(): Map<String, Any> = unwrap(this).getTagFilters() ?: emptyMap()

    /** A builder for [BucketMetrics] */
    @CdkDslMarker
    public interface Builder {
        /** @param id The ID used to identify the metrics configuration. */
        public fun id(id: String)

        /**
         * @param prefix The prefix that an object must have to be included in the metrics results.
         */
        public fun prefix(prefix: String)

        /**
         * @param tagFilters Specifies a list of tag filters to use as a metrics configuration
         *   filter. The metrics configuration includes only objects that meet the filter's
         *   criteria.
         */
        public fun tagFilters(tagFilters: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.s3.BucketMetrics.Builder =
            software.amazon.awscdk.services.s3.BucketMetrics.builder()

        /** @param id The ID used to identify the metrics configuration. */
        override fun id(id: String) {
            cdkBuilder.id(id)
        }

        /**
         * @param prefix The prefix that an object must have to be included in the metrics results.
         */
        override fun prefix(prefix: String) {
            cdkBuilder.prefix(prefix)
        }

        /**
         * @param tagFilters Specifies a list of tag filters to use as a metrics configuration
         *   filter. The metrics configuration includes only objects that meet the filter's
         *   criteria.
         */
        override fun tagFilters(tagFilters: Map<String, Any>) {
            cdkBuilder.tagFilters(tagFilters)
        }

        public fun build(): software.amazon.awscdk.services.s3.BucketMetrics = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.s3.BucketMetrics,
    ) : BucketMetrics {
        /** The ID used to identify the metrics configuration. */
        override fun id(): String = unwrap(this).getId()

        /** The prefix that an object must have to be included in the metrics results. */
        override fun prefix(): String? = unwrap(this).getPrefix()

        /**
         * Specifies a list of tag filters to use as a metrics configuration filter.
         *
         * The metrics configuration includes only objects that meet the filter's criteria.
         */
        override fun tagFilters(): Map<String, Any> = unwrap(this).getTagFilters() ?: emptyMap()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): BucketMetrics {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.BucketMetrics
        ): BucketMetrics = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: BucketMetrics
        ): software.amazon.awscdk.services.s3.BucketMetrics = (wrapped as Wrapper).cdkObject
    }
}
