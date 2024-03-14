package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface Environment {
    /** The AWS account this environment deploys into. */
    public fun account(): String

    /** The arbitrary name of this environment (user-set, or at least user-meaningful). */
    public fun name(): String

    /** The AWS region name where this environment deploys into. */
    public fun region(): String

    /** A builder for [Environment] */
    @CdkDslMarker
    public interface Builder {
        /** @param account The AWS account this environment deploys into. */
        public fun account(account: String)

        /**
         * @param name The arbitrary name of this environment (user-set, or at least
         *   user-meaningful).
         */
        public fun name(name: String)

        /** @param region The AWS region name where this environment deploys into. */
        public fun region(region: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.cxapi.Environment.Builder =
            software.amazon.awscdk.cxapi.Environment.builder()

        /** @param account The AWS account this environment deploys into. */
        override fun account(account: String) {
            cdkBuilder.account(account)
        }

        /**
         * @param name The arbitrary name of this environment (user-set, or at least
         *   user-meaningful).
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /** @param region The AWS region name where this environment deploys into. */
        override fun region(region: String) {
            cdkBuilder.region(region)
        }

        public fun build(): software.amazon.awscdk.cxapi.Environment = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.cxapi.Environment,
    ) : Environment {
        /** The AWS account this environment deploys into. */
        override fun account(): String = unwrap(this).getAccount()

        /** The arbitrary name of this environment (user-set, or at least user-meaningful). */
        override fun name(): String = unwrap(this).getName()

        /** The AWS region name where this environment deploys into. */
        override fun region(): String = unwrap(this).getRegion()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): Environment {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.Environment): Environment =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: Environment): software.amazon.awscdk.cxapi.Environment =
            (wrapped as Wrapper).cdkObject
    }
}
