package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface PortfolioShareOptions {
    /**
     * The message language of the share.
     *
     * Controls status and error message language for share.
     *
     * Default: - English
     */
    public fun messageLanguage(): MessageLanguage? =
        unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

    /**
     * Whether to share tagOptions as a part of the portfolio share.
     *
     * Default: - share not specified
     */
    public fun shareTagOptions(): Boolean? = unwrap(this).getShareTagOptions()

    /** A builder for [PortfolioShareOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param messageLanguage The message language of the share. Controls status and error
         *   message language for share.
         */
        public fun messageLanguage(messageLanguage: MessageLanguage)

        /** @param shareTagOptions Whether to share tagOptions as a part of the portfolio share. */
        public fun shareTagOptions(shareTagOptions: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions.Builder =
            software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions.builder()

        /**
         * @param messageLanguage The message language of the share. Controls status and error
         *   message language for share.
         */
        override fun messageLanguage(messageLanguage: MessageLanguage) {
            cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage::unwrap))
        }

        /** @param shareTagOptions Whether to share tagOptions as a part of the portfolio share. */
        override fun shareTagOptions(shareTagOptions: Boolean) {
            cdkBuilder.shareTagOptions(shareTagOptions)
        }

        public fun build(): software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions,
    ) : PortfolioShareOptions {
        /**
         * The message language of the share.
         *
         * Controls status and error message language for share.
         *
         * Default: - English
         */
        override fun messageLanguage(): MessageLanguage? =
            unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

        /**
         * Whether to share tagOptions as a part of the portfolio share.
         *
         * Default: - share not specified
         */
        override fun shareTagOptions(): Boolean? = unwrap(this).getShareTagOptions()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): PortfolioShareOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions
        ): PortfolioShareOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: PortfolioShareOptions
        ): software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions =
            (wrapped as Wrapper).cdkObject
    }
}
