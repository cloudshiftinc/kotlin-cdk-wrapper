package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ILocalBundling {
    /**
     * This method is called before attempting docker bundling to allow the bundler to be executed
     * locally.
     *
     * If the local bundler exists, and bundling was performed locally, return `true`. Otherwise,
     * return `false`.
     *
     * @param outputDir the directory where the bundled asset should be output.
     * @param options bundling options for this asset.
     */
    public fun tryBundle(outputDir: String, options: BundlingOptions): Boolean

    /**
     * This method is called before attempting docker bundling to allow the bundler to be executed
     * locally.
     *
     * If the local bundler exists, and bundling was performed locally, return `true`. Otherwise,
     * return `false`.
     *
     * @param outputDir the directory where the bundled asset should be output.
     * @param options bundling options for this asset.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20d66aa0f98dd5c1f458da3bb81456739e3ba5b9094de168036e0dc9ebf92d07")
    public fun tryBundle(outputDir: String, options: BundlingOptions.Builder.() -> Unit): Boolean

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.ILocalBundling,
    ) : ILocalBundling {
        /**
         * This method is called before attempting docker bundling to allow the bundler to be
         * executed locally.
         *
         * If the local bundler exists, and bundling was performed locally, return `true`.
         * Otherwise, return `false`.
         *
         * @param outputDir the directory where the bundled asset should be output.
         * @param options bundling options for this asset.
         */
        override fun tryBundle(outputDir: String, options: BundlingOptions): Boolean =
            unwrap(this).tryBundle(outputDir, options.let(BundlingOptions::unwrap))

        /**
         * This method is called before attempting docker bundling to allow the bundler to be
         * executed locally.
         *
         * If the local bundler exists, and bundling was performed locally, return `true`.
         * Otherwise, return `false`.
         *
         * @param outputDir the directory where the bundled asset should be output.
         * @param options bundling options for this asset.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("20d66aa0f98dd5c1f458da3bb81456739e3ba5b9094de168036e0dc9ebf92d07")
        override fun tryBundle(
            outputDir: String,
            options: BundlingOptions.Builder.() -> Unit
        ): Boolean = tryBundle(outputDir, BundlingOptions(options))
    }

    public companion object {
        init {}

        internal fun wrap(cdkObject: software.amazon.awscdk.ILocalBundling): ILocalBundling =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: ILocalBundling): software.amazon.awscdk.ILocalBundling =
            (wrapped as Wrapper).cdkObject
    }
}
