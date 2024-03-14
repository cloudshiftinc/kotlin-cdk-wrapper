package io.cloudshiftdev.constructs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit

public interface MetadataOptions {
    public fun stackTrace(): Boolean? = unwrap(this).getStackTrace()

    public fun traceFromFunction(): Any? = unwrap(this).getTraceFromFunction()

    @CdkDslMarker
    public interface Builder {
        public fun stackTrace(stackTrace: Boolean)

        public fun traceFromFunction(traceFromFunction: Any)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.constructs.MetadataOptions.Builder =
            software.constructs.MetadataOptions.builder()

        override fun stackTrace(stackTrace: Boolean) {
            cdkBuilder.stackTrace(stackTrace)
        }

        override fun traceFromFunction(traceFromFunction: Any) {
            cdkBuilder.traceFromFunction(traceFromFunction)
        }

        public fun build(): software.constructs.MetadataOptions = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.constructs.MetadataOptions,
    ) : MetadataOptions {
        override fun stackTrace(): Boolean? = unwrap(this).getStackTrace()

        override fun traceFromFunction(): Any? = unwrap(this).getTraceFromFunction()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): MetadataOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.constructs.MetadataOptions): MetadataOptions =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: MetadataOptions): software.constructs.MetadataOptions =
            (wrapped as Wrapper).cdkObject
    }
}
