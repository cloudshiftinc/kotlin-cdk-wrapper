package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface RoutingRule {
    /**
     * Specifies a condition that must be met for the specified redirect to apply.
     *
     * Default: - No condition
     */
    public fun condition(): RoutingRuleCondition? =
        unwrap(this).getCondition()?.let(RoutingRuleCondition::wrap)

    /**
     * The host name to use in the redirect request.
     *
     * Default: - The host name used in the original request.
     */
    public fun hostName(): String? = unwrap(this).getHostName()

    /**
     * The HTTP redirect code to use on the response.
     *
     * Default: "301" - Moved Permanently
     */
    public fun httpRedirectCode(): String? = unwrap(this).getHttpRedirectCode()

    /**
     * Protocol to use when redirecting requests.
     *
     * Default: - The protocol used in the original request.
     */
    public fun protocol(): RedirectProtocol? =
        unwrap(this).getProtocol()?.let(RedirectProtocol::wrap)

    /**
     * Specifies the object key prefix to use in the redirect request.
     *
     * Default: - The key will not be replaced
     */
    public fun replaceKey(): ReplaceKey? = unwrap(this).getReplaceKey()?.let(ReplaceKey::wrap)

    /** A builder for [RoutingRule] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param condition Specifies a condition that must be met for the specified redirect to
         *   apply.
         */
        public fun condition(condition: RoutingRuleCondition)

        /**
         * @param condition Specifies a condition that must be met for the specified redirect to
         *   apply.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("343b62e0c35922af7d69081fbaa066d8dcba0345f65421dbfb265797fd504091")
        public fun condition(condition: RoutingRuleCondition.Builder.() -> Unit)

        /** @param hostName The host name to use in the redirect request. */
        public fun hostName(hostName: String)

        /** @param httpRedirectCode The HTTP redirect code to use on the response. */
        public fun httpRedirectCode(httpRedirectCode: String)

        /** @param protocol Protocol to use when redirecting requests. */
        public fun protocol(protocol: RedirectProtocol)

        /** @param replaceKey Specifies the object key prefix to use in the redirect request. */
        public fun replaceKey(replaceKey: ReplaceKey)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.s3.RoutingRule.Builder =
            software.amazon.awscdk.services.s3.RoutingRule.builder()

        /**
         * @param condition Specifies a condition that must be met for the specified redirect to
         *   apply.
         */
        override fun condition(condition: RoutingRuleCondition) {
            cdkBuilder.condition(condition.let(RoutingRuleCondition::unwrap))
        }

        /**
         * @param condition Specifies a condition that must be met for the specified redirect to
         *   apply.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("343b62e0c35922af7d69081fbaa066d8dcba0345f65421dbfb265797fd504091")
        override fun condition(condition: RoutingRuleCondition.Builder.() -> Unit): Unit =
            condition(RoutingRuleCondition(condition))

        /** @param hostName The host name to use in the redirect request. */
        override fun hostName(hostName: String) {
            cdkBuilder.hostName(hostName)
        }

        /** @param httpRedirectCode The HTTP redirect code to use on the response. */
        override fun httpRedirectCode(httpRedirectCode: String) {
            cdkBuilder.httpRedirectCode(httpRedirectCode)
        }

        /** @param protocol Protocol to use when redirecting requests. */
        override fun protocol(protocol: RedirectProtocol) {
            cdkBuilder.protocol(protocol.let(RedirectProtocol::unwrap))
        }

        /** @param replaceKey Specifies the object key prefix to use in the redirect request. */
        override fun replaceKey(replaceKey: ReplaceKey) {
            cdkBuilder.replaceKey(replaceKey.let(ReplaceKey::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.s3.RoutingRule = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.s3.RoutingRule,
    ) : RoutingRule {
        /**
         * Specifies a condition that must be met for the specified redirect to apply.
         *
         * Default: - No condition
         */
        override fun condition(): RoutingRuleCondition? =
            unwrap(this).getCondition()?.let(RoutingRuleCondition::wrap)

        /**
         * The host name to use in the redirect request.
         *
         * Default: - The host name used in the original request.
         */
        override fun hostName(): String? = unwrap(this).getHostName()

        /**
         * The HTTP redirect code to use on the response.
         *
         * Default: "301" - Moved Permanently
         */
        override fun httpRedirectCode(): String? = unwrap(this).getHttpRedirectCode()

        /**
         * Protocol to use when redirecting requests.
         *
         * Default: - The protocol used in the original request.
         */
        override fun protocol(): RedirectProtocol? =
            unwrap(this).getProtocol()?.let(RedirectProtocol::wrap)

        /**
         * Specifies the object key prefix to use in the redirect request.
         *
         * Default: - The key will not be replaced
         */
        override fun replaceKey(): ReplaceKey? = unwrap(this).getReplaceKey()?.let(ReplaceKey::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): RoutingRule {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.RoutingRule): RoutingRule =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: RoutingRule): software.amazon.awscdk.services.s3.RoutingRule =
            (wrapped as Wrapper).cdkObject
    }
}
