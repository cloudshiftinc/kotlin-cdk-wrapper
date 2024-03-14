package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ZoneDelegationOptions {
    /**
     * A comment to add on the DNS record created to incorporate the delegation.
     *
     * Default: none
     */
    public fun comment(): String? = unwrap(this).getComment()

    /**
     * The TTL (Time To Live) of the DNS delegation record in DNS caches.
     *
     * Default: 172800
     */
    public fun ttl(): Duration? = unwrap(this).getTtl()?.let(Duration::wrap)

    /** A builder for [ZoneDelegationOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param comment A comment to add on the DNS record created to incorporate the delegation.
         */
        public fun comment(comment: String)

        /** @param ttl The TTL (Time To Live) of the DNS delegation record in DNS caches. */
        public fun ttl(ttl: Duration)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.route53.ZoneDelegationOptions.Builder =
            software.amazon.awscdk.services.route53.ZoneDelegationOptions.builder()

        /**
         * @param comment A comment to add on the DNS record created to incorporate the delegation.
         */
        override fun comment(comment: String) {
            cdkBuilder.comment(comment)
        }

        /** @param ttl The TTL (Time To Live) of the DNS delegation record in DNS caches. */
        override fun ttl(ttl: Duration) {
            cdkBuilder.ttl(ttl.let(Duration::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.route53.ZoneDelegationOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.route53.ZoneDelegationOptions,
    ) : ZoneDelegationOptions {
        /**
         * A comment to add on the DNS record created to incorporate the delegation.
         *
         * Default: none
         */
        override fun comment(): String? = unwrap(this).getComment()

        /**
         * The TTL (Time To Live) of the DNS delegation record in DNS caches.
         *
         * Default: 172800
         */
        override fun ttl(): Duration? = unwrap(this).getTtl()?.let(Duration::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ZoneDelegationOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.route53.ZoneDelegationOptions
        ): ZoneDelegationOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ZoneDelegationOptions
        ): software.amazon.awscdk.services.route53.ZoneDelegationOptions =
            (wrapped as Wrapper).cdkObject
    }
}
