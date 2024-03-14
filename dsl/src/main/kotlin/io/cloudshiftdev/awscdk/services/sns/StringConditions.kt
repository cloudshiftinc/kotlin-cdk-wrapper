package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface StringConditions {
    /**
     * Match one or more values.
     *
     * Default: - None
     */
    public fun allowlist(): List<String> = unwrap(this).getAllowlist() ?: emptyList()

    /**
     * Match any value that doesn't include any of the specified values.
     *
     * Default: - None
     */
    public fun denylist(): List<String> = unwrap(this).getDenylist() ?: emptyList()

    /**
     * Matches values that begins with the specified prefixes.
     *
     * Default: - None
     */
    public fun matchPrefixes(): List<String> = unwrap(this).getMatchPrefixes() ?: emptyList()

    /**
     * Matches values that end with the specified suffixes.
     *
     * Default: - None
     */
    public fun matchSuffixes(): List<String> = unwrap(this).getMatchSuffixes() ?: emptyList()

    /** A builder for [StringConditions] */
    @CdkDslMarker
    public interface Builder {
        /** @param allowlist Match one or more values. */
        public fun allowlist(allowlist: List<String>)

        /** @param allowlist Match one or more values. */
        public fun allowlist(vararg allowlist: String)

        /** @param denylist Match any value that doesn't include any of the specified values. */
        public fun denylist(denylist: List<String>)

        /** @param denylist Match any value that doesn't include any of the specified values. */
        public fun denylist(vararg denylist: String)

        /** @param matchPrefixes Matches values that begins with the specified prefixes. */
        public fun matchPrefixes(matchPrefixes: List<String>)

        /** @param matchPrefixes Matches values that begins with the specified prefixes. */
        public fun matchPrefixes(vararg matchPrefixes: String)

        /** @param matchSuffixes Matches values that end with the specified suffixes. */
        public fun matchSuffixes(matchSuffixes: List<String>)

        /** @param matchSuffixes Matches values that end with the specified suffixes. */
        public fun matchSuffixes(vararg matchSuffixes: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.sns.StringConditions.Builder =
            software.amazon.awscdk.services.sns.StringConditions.builder()

        /** @param allowlist Match one or more values. */
        override fun allowlist(allowlist: List<String>) {
            cdkBuilder.allowlist(allowlist)
        }

        /** @param allowlist Match one or more values. */
        override fun allowlist(vararg allowlist: String): Unit = allowlist(allowlist.toList())

        /** @param denylist Match any value that doesn't include any of the specified values. */
        override fun denylist(denylist: List<String>) {
            cdkBuilder.denylist(denylist)
        }

        /** @param denylist Match any value that doesn't include any of the specified values. */
        override fun denylist(vararg denylist: String): Unit = denylist(denylist.toList())

        /** @param matchPrefixes Matches values that begins with the specified prefixes. */
        override fun matchPrefixes(matchPrefixes: List<String>) {
            cdkBuilder.matchPrefixes(matchPrefixes)
        }

        /** @param matchPrefixes Matches values that begins with the specified prefixes. */
        override fun matchPrefixes(vararg matchPrefixes: String): Unit =
            matchPrefixes(matchPrefixes.toList())

        /** @param matchSuffixes Matches values that end with the specified suffixes. */
        override fun matchSuffixes(matchSuffixes: List<String>) {
            cdkBuilder.matchSuffixes(matchSuffixes)
        }

        /** @param matchSuffixes Matches values that end with the specified suffixes. */
        override fun matchSuffixes(vararg matchSuffixes: String): Unit =
            matchSuffixes(matchSuffixes.toList())

        public fun build(): software.amazon.awscdk.services.sns.StringConditions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.sns.StringConditions,
    ) : StringConditions {
        /**
         * Match one or more values.
         *
         * Default: - None
         */
        override fun allowlist(): List<String> = unwrap(this).getAllowlist() ?: emptyList()

        /**
         * Match any value that doesn't include any of the specified values.
         *
         * Default: - None
         */
        override fun denylist(): List<String> = unwrap(this).getDenylist() ?: emptyList()

        /**
         * Matches values that begins with the specified prefixes.
         *
         * Default: - None
         */
        override fun matchPrefixes(): List<String> = unwrap(this).getMatchPrefixes() ?: emptyList()

        /**
         * Matches values that end with the specified suffixes.
         *
         * Default: - None
         */
        override fun matchSuffixes(): List<String> = unwrap(this).getMatchSuffixes() ?: emptyList()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): StringConditions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.sns.StringConditions
        ): StringConditions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: StringConditions
        ): software.amazon.awscdk.services.sns.StringConditions = (wrapped as Wrapper).cdkObject
    }
}
