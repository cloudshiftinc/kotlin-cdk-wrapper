package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface MetadataEntry {
    /**
     * The data.
     *
     * Default: - no data.
     */
    public fun `data`(): Any? = unwrap(this).getData()

    /**
     * A stack trace for when the entry was created.
     *
     * Default: - no trace.
     */
    public fun trace(): List<String> = unwrap(this).getTrace() ?: emptyList()

    /** The type of the metadata entry. */
    public fun type(): String

    /** A builder for [MetadataEntry] */
    @CdkDslMarker
    public interface Builder {
        /** @param data The data. */
        public fun `data`(`data`: String)

        /** @param data The data. */
        public fun `data`(`data`: FileAssetMetadataEntry)

        /** @param data The data. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("86b8f208b857e88412d1359f38853c3ae5d661b06abdaacd0549a45609abddb0")
        public fun `data`(`data`: FileAssetMetadataEntry.Builder.() -> Unit)

        /** @param data The data. */
        public fun `data`(`data`: ContainerImageAssetMetadataEntry)

        /** @param data The data. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("79a698355e266cc87029a7d07643320124b56005af8389155d624f552e106c4f")
        public fun `data`(`data`: ContainerImageAssetMetadataEntry.Builder.() -> Unit)

        /** @param data The data. */
        public fun `data`(`data`: List<Tag>)

        /** @param data The data. */
        public fun `data`(vararg `data`: Tag)

        /** @param trace A stack trace for when the entry was created. */
        public fun trace(trace: List<String>)

        /** @param trace A stack trace for when the entry was created. */
        public fun trace(vararg trace: String)

        /** @param type The type of the metadata entry. */
        public fun type(type: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.MetadataEntry.Builder =
            software.amazon.awscdk.cloudassembly.schema.MetadataEntry.builder()

        /** @param data The data. */
        override fun `data`(`data`: String) {
            cdkBuilder.`data`(`data`)
        }

        /** @param data The data. */
        override fun `data`(`data`: FileAssetMetadataEntry) {
            cdkBuilder.`data`(`data`.let(FileAssetMetadataEntry::unwrap))
        }

        /** @param data The data. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("86b8f208b857e88412d1359f38853c3ae5d661b06abdaacd0549a45609abddb0")
        override fun `data`(`data`: FileAssetMetadataEntry.Builder.() -> Unit): Unit =
            `data`(FileAssetMetadataEntry(`data`))

        /** @param data The data. */
        override fun `data`(`data`: ContainerImageAssetMetadataEntry) {
            cdkBuilder.`data`(`data`.let(ContainerImageAssetMetadataEntry::unwrap))
        }

        /** @param data The data. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("79a698355e266cc87029a7d07643320124b56005af8389155d624f552e106c4f")
        override fun `data`(`data`: ContainerImageAssetMetadataEntry.Builder.() -> Unit): Unit =
            `data`(ContainerImageAssetMetadataEntry(`data`))

        /** @param data The data. */
        override fun `data`(`data`: List<Tag>) {
            cdkBuilder.`data`(`data`.map(Tag::unwrap))
        }

        /** @param data The data. */
        override fun `data`(vararg `data`: Tag): Unit = `data`(`data`.toList())

        /** @param trace A stack trace for when the entry was created. */
        override fun trace(trace: List<String>) {
            cdkBuilder.trace(trace)
        }

        /** @param trace A stack trace for when the entry was created. */
        override fun trace(vararg trace: String): Unit = trace(trace.toList())

        /** @param type The type of the metadata entry. */
        override fun type(type: String) {
            cdkBuilder.type(type)
        }

        public fun build(): software.amazon.awscdk.cloudassembly.schema.MetadataEntry =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.MetadataEntry,
    ) : MetadataEntry {
        /**
         * The data.
         *
         * Default: - no data.
         */
        override fun `data`(): Any? = unwrap(this).getData()

        /**
         * A stack trace for when the entry was created.
         *
         * Default: - no trace.
         */
        override fun trace(): List<String> = unwrap(this).getTrace() ?: emptyList()

        /** The type of the metadata entry. */
        override fun type(): String = unwrap(this).getType()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): MetadataEntry {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.cloudassembly.schema.MetadataEntry
        ): MetadataEntry = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: MetadataEntry
        ): software.amazon.awscdk.cloudassembly.schema.MetadataEntry =
            (wrapped as Wrapper).cdkObject
    }
}
