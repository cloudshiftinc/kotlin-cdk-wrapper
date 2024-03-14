package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface FileCodeOptions {
    /** The path of the file to read the code from. */
    public fun filePath(): String

    /** A builder for [FileCodeOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param filePath The path of the file to read the code from. */
        public fun filePath(filePath: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.cloudfront.FileCodeOptions.Builder =
            software.amazon.awscdk.services.cloudfront.FileCodeOptions.builder()

        /** @param filePath The path of the file to read the code from. */
        override fun filePath(filePath: String) {
            cdkBuilder.filePath(filePath)
        }

        public fun build(): software.amazon.awscdk.services.cloudfront.FileCodeOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.cloudfront.FileCodeOptions,
    ) : FileCodeOptions {
        /** The path of the file to read the code from. */
        override fun filePath(): String = unwrap(this).getFilePath()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): FileCodeOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudfront.FileCodeOptions
        ): FileCodeOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: FileCodeOptions
        ): software.amazon.awscdk.services.cloudfront.FileCodeOptions =
            (wrapped as Wrapper).cdkObject
    }
}
