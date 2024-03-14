package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface MetricExpressionConfig {
    /** Math expression for the metric. */
    public fun expression(): String

    /** How many seconds to aggregate over. */
    public fun period(): Number

    /**
     * Account to evaluate search expressions within.
     *
     * Default: - Deployment account.
     */
    public fun searchAccount(): String? = unwrap(this).getSearchAccount()

    /**
     * Region to evaluate search expressions within.
     *
     * Default: - Deployment region.
     */
    public fun searchRegion(): String? = unwrap(this).getSearchRegion()

    /** Metrics used in the math expression. */
    public fun usingMetrics(): Map<String, IMetric>

    /** A builder for [MetricExpressionConfig] */
    @CdkDslMarker
    public interface Builder {
        /** @param expression Math expression for the metric. */
        public fun expression(expression: String)

        /** @param period How many seconds to aggregate over. */
        public fun period(period: Number)

        /** @param searchAccount Account to evaluate search expressions within. */
        public fun searchAccount(searchAccount: String)

        /** @param searchRegion Region to evaluate search expressions within. */
        public fun searchRegion(searchRegion: String)

        /** @param usingMetrics Metrics used in the math expression. */
        public fun usingMetrics(usingMetrics: Map<String, IMetric>)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig.Builder =
            software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig.builder()

        /** @param expression Math expression for the metric. */
        override fun expression(expression: String) {
            cdkBuilder.expression(expression)
        }

        /** @param period How many seconds to aggregate over. */
        override fun period(period: Number) {
            cdkBuilder.period(period)
        }

        /** @param searchAccount Account to evaluate search expressions within. */
        override fun searchAccount(searchAccount: String) {
            cdkBuilder.searchAccount(searchAccount)
        }

        /** @param searchRegion Region to evaluate search expressions within. */
        override fun searchRegion(searchRegion: String) {
            cdkBuilder.searchRegion(searchRegion)
        }

        /** @param usingMetrics Metrics used in the math expression. */
        override fun usingMetrics(usingMetrics: Map<String, IMetric>) {
            cdkBuilder.usingMetrics(usingMetrics.mapValues { IMetric.unwrap(it.value) })
        }

        public fun build(): software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig,
    ) : MetricExpressionConfig {
        /** Math expression for the metric. */
        override fun expression(): String = unwrap(this).getExpression()

        /** How many seconds to aggregate over. */
        override fun period(): Number = unwrap(this).getPeriod()

        /**
         * Account to evaluate search expressions within.
         *
         * Default: - Deployment account.
         */
        override fun searchAccount(): String? = unwrap(this).getSearchAccount()

        /**
         * Region to evaluate search expressions within.
         *
         * Default: - Deployment region.
         */
        override fun searchRegion(): String? = unwrap(this).getSearchRegion()

        /** Metrics used in the math expression. */
        override fun usingMetrics(): Map<String, IMetric> =
            unwrap(this).getUsingMetrics().mapValues { IMetric.wrap(it.value) }
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): MetricExpressionConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig
        ): MetricExpressionConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: MetricExpressionConfig
        ): software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig =
            (wrapped as Wrapper).cdkObject
    }
}
