package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface WindowStartTime {
    /**
     * The start hour of the window in Coordinated Universal Time (UTC), using 24-hour time.
     *
     * For example, 17 refers to 5:00 P.M. UTC.
     *
     * Default: - 22
     */
    public fun hours(): Number

    /**
     * The start minute of the window, in UTC.
     *
     * Default: - 0
     */
    public fun minutes(): Number

    /** A builder for [WindowStartTime] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param hours The start hour of the window in Coordinated Universal Time (UTC), using
         *   24-hour time. For example, 17 refers to 5:00 P.M. UTC.
         */
        public fun hours(hours: Number)

        /** @param minutes The start minute of the window, in UTC. */
        public fun minutes(minutes: Number)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.opensearchservice.WindowStartTime.Builder =
            software.amazon.awscdk.services.opensearchservice.WindowStartTime.builder()

        /**
         * @param hours The start hour of the window in Coordinated Universal Time (UTC), using
         *   24-hour time. For example, 17 refers to 5:00 P.M. UTC.
         */
        override fun hours(hours: Number) {
            cdkBuilder.hours(hours)
        }

        /** @param minutes The start minute of the window, in UTC. */
        override fun minutes(minutes: Number) {
            cdkBuilder.minutes(minutes)
        }

        public fun build(): software.amazon.awscdk.services.opensearchservice.WindowStartTime =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.opensearchservice.WindowStartTime,
    ) : WindowStartTime {
        /**
         * The start hour of the window in Coordinated Universal Time (UTC), using 24-hour time.
         *
         * For example, 17 refers to 5:00 P.M. UTC.
         *
         * Default: - 22
         */
        override fun hours(): Number = unwrap(this).getHours()

        /**
         * The start minute of the window, in UTC.
         *
         * Default: - 0
         */
        override fun minutes(): Number = unwrap(this).getMinutes()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): WindowStartTime {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.opensearchservice.WindowStartTime
        ): WindowStartTime = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: WindowStartTime
        ): software.amazon.awscdk.services.opensearchservice.WindowStartTime =
            (wrapped as Wrapper).cdkObject
    }
}
