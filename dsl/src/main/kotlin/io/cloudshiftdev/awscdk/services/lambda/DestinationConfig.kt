package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface DestinationConfig {
    /** The Amazon Resource Name (ARN) of the destination resource. */
    public fun destination(): String

    /** A builder for [DestinationConfig] */
    @CdkDslMarker
    public interface Builder {
        /** @param destination The Amazon Resource Name (ARN) of the destination resource. */
        public fun destination(destination: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.lambda.DestinationConfig.Builder =
            software.amazon.awscdk.services.lambda.DestinationConfig.builder()

        /** @param destination The Amazon Resource Name (ARN) of the destination resource. */
        override fun destination(destination: String) {
            cdkBuilder.destination(destination)
        }

        public fun build(): software.amazon.awscdk.services.lambda.DestinationConfig =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.lambda.DestinationConfig,
    ) : DestinationConfig {
        /** The Amazon Resource Name (ARN) of the destination resource. */
        override fun destination(): String = unwrap(this).getDestination()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): DestinationConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lambda.DestinationConfig
        ): DestinationConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: DestinationConfig
        ): software.amazon.awscdk.services.lambda.DestinationConfig = (wrapped as Wrapper).cdkObject
    }
}
