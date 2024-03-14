package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface OutlierDetection {
    /** The base amount of time for which a host is ejected. */
    public fun baseEjectionDuration(): Duration

    /** The time interval between ejection sweep analysis. */
    public fun interval(): Duration

    /**
     * Maximum percentage of hosts in load balancing pool for upstream service that can be ejected.
     *
     * Will eject at least one host regardless of the value.
     */
    public fun maxEjectionPercent(): Number

    /** Number of consecutive 5xx errors required for ejection. */
    public fun maxServerErrors(): Number

    /** A builder for [OutlierDetection] */
    @CdkDslMarker
    public interface Builder {
        /** @param baseEjectionDuration The base amount of time for which a host is ejected. */
        public fun baseEjectionDuration(baseEjectionDuration: Duration)

        /** @param interval The time interval between ejection sweep analysis. */
        public fun interval(interval: Duration)

        /**
         * @param maxEjectionPercent Maximum percentage of hosts in load balancing pool for upstream
         *   service that can be ejected. Will eject at least one host regardless of the value.
         */
        public fun maxEjectionPercent(maxEjectionPercent: Number)

        /** @param maxServerErrors Number of consecutive 5xx errors required for ejection. */
        public fun maxServerErrors(maxServerErrors: Number)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.appmesh.OutlierDetection.Builder =
            software.amazon.awscdk.services.appmesh.OutlierDetection.builder()

        /** @param baseEjectionDuration The base amount of time for which a host is ejected. */
        override fun baseEjectionDuration(baseEjectionDuration: Duration) {
            cdkBuilder.baseEjectionDuration(baseEjectionDuration.let(Duration::unwrap))
        }

        /** @param interval The time interval between ejection sweep analysis. */
        override fun interval(interval: Duration) {
            cdkBuilder.interval(interval.let(Duration::unwrap))
        }

        /**
         * @param maxEjectionPercent Maximum percentage of hosts in load balancing pool for upstream
         *   service that can be ejected. Will eject at least one host regardless of the value.
         */
        override fun maxEjectionPercent(maxEjectionPercent: Number) {
            cdkBuilder.maxEjectionPercent(maxEjectionPercent)
        }

        /** @param maxServerErrors Number of consecutive 5xx errors required for ejection. */
        override fun maxServerErrors(maxServerErrors: Number) {
            cdkBuilder.maxServerErrors(maxServerErrors)
        }

        public fun build(): software.amazon.awscdk.services.appmesh.OutlierDetection =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appmesh.OutlierDetection,
    ) : OutlierDetection {
        /** The base amount of time for which a host is ejected. */
        override fun baseEjectionDuration(): Duration =
            unwrap(this).getBaseEjectionDuration().let(Duration::wrap)

        /** The time interval between ejection sweep analysis. */
        override fun interval(): Duration = unwrap(this).getInterval().let(Duration::wrap)

        /**
         * Maximum percentage of hosts in load balancing pool for upstream service that can be
         * ejected.
         *
         * Will eject at least one host regardless of the value.
         */
        override fun maxEjectionPercent(): Number = unwrap(this).getMaxEjectionPercent()

        /** Number of consecutive 5xx errors required for ejection. */
        override fun maxServerErrors(): Number = unwrap(this).getMaxServerErrors()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): OutlierDetection {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.OutlierDetection
        ): OutlierDetection = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: OutlierDetection
        ): software.amazon.awscdk.services.appmesh.OutlierDetection = (wrapped as Wrapper).cdkObject
    }
}
