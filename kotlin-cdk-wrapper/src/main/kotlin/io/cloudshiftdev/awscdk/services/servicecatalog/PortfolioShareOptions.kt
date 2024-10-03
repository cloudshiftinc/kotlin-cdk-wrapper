@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Options for portfolio share.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * PortfolioShareOptions portfolioShareOptions = PortfolioShareOptions.builder()
 * .messageLanguage(MessageLanguage.EN)
 * .shareTagOptions(false)
 * .build();
 * ```
 */
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

  /**
   * A builder for [PortfolioShareOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param messageLanguage The message language of the share.
     * Controls status and error message language for share.
     */
    public fun messageLanguage(messageLanguage: MessageLanguage)

    /**
     * @param shareTagOptions Whether to share tagOptions as a part of the portfolio share.
     */
    public fun shareTagOptions(shareTagOptions: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions.Builder =
        software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions.builder()

    /**
     * @param messageLanguage The message language of the share.
     * Controls status and error message language for share.
     */
    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage.Companion::unwrap))
    }

    /**
     * @param shareTagOptions Whether to share tagOptions as a part of the portfolio share.
     */
    override fun shareTagOptions(shareTagOptions: Boolean) {
      cdkBuilder.shareTagOptions(shareTagOptions)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions,
  ) : CdkObject(cdkObject),
      PortfolioShareOptions {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): PortfolioShareOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions):
        PortfolioShareOptions = CdkObjectWrappers.wrap(cdkObject) as? PortfolioShareOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PortfolioShareOptions):
        software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions
  }
}
