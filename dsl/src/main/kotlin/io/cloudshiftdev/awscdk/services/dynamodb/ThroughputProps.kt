package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface ThroughputProps {
    /** The read capacity. */
    public fun readCapacity(): Capacity

    /** The write capacity. */
    public fun writeCapacity(): Capacity

    /** A builder for [ThroughputProps] */
    @CdkDslMarker
    public interface Builder {
        /** @param readCapacity The read capacity. */
        public fun readCapacity(readCapacity: Capacity)

        /** @param writeCapacity The write capacity. */
        public fun writeCapacity(writeCapacity: Capacity)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.dynamodb.ThroughputProps.Builder =
            software.amazon.awscdk.services.dynamodb.ThroughputProps.builder()

        /** @param readCapacity The read capacity. */
        override fun readCapacity(readCapacity: Capacity) {
            cdkBuilder.readCapacity(readCapacity.let(Capacity::unwrap))
        }

        /** @param writeCapacity The write capacity. */
        override fun writeCapacity(writeCapacity: Capacity) {
            cdkBuilder.writeCapacity(writeCapacity.let(Capacity::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.dynamodb.ThroughputProps =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.dynamodb.ThroughputProps,
    ) : ThroughputProps {
        /** The read capacity. */
        override fun readCapacity(): Capacity = unwrap(this).getReadCapacity().let(Capacity::wrap)

        /** The write capacity. */
        override fun writeCapacity(): Capacity = unwrap(this).getWriteCapacity().let(Capacity::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ThroughputProps {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.dynamodb.ThroughputProps
        ): ThroughputProps = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ThroughputProps
        ): software.amazon.awscdk.services.dynamodb.ThroughputProps = (wrapped as Wrapper).cdkObject
    }
}
