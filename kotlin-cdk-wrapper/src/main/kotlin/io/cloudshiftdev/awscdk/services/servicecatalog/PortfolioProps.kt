@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for a Portfolio.
 *
 * Example:
 *
 * ```
 * Portfolio.Builder.create(this, "Portfolio")
 * .displayName("MyPortfolio")
 * .providerName("MyTeam")
 * .build();
 * ```
 */
public interface PortfolioProps {
  /**
   * Description for portfolio.
   *
   * Default: - No description provided
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the portfolio.
   */
  public fun displayName(): String

  /**
   * The message language.
   *
   * Controls language for
   * status logging and errors.
   *
   * Default: - English
   */
  public fun messageLanguage(): MessageLanguage? =
      unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

  /**
   * The provider name.
   */
  public fun providerName(): String

  /**
   * TagOptions associated directly to a portfolio.
   *
   * Default: - No tagOptions provided
   */
  public fun tagOptions(): TagOptions? = unwrap(this).getTagOptions()?.let(TagOptions::wrap)

  /**
   * A builder for [PortfolioProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description Description for portfolio.
     */
    public fun description(description: String)

    /**
     * @param displayName The name of the portfolio. 
     */
    public fun displayName(displayName: String)

    /**
     * @param messageLanguage The message language.
     * Controls language for
     * status logging and errors.
     */
    public fun messageLanguage(messageLanguage: MessageLanguage)

    /**
     * @param providerName The provider name. 
     */
    public fun providerName(providerName: String)

    /**
     * @param tagOptions TagOptions associated directly to a portfolio.
     */
    public fun tagOptions(tagOptions: TagOptions)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.PortfolioProps.Builder =
        software.amazon.awscdk.services.servicecatalog.PortfolioProps.builder()

    /**
     * @param description Description for portfolio.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The name of the portfolio. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param messageLanguage The message language.
     * Controls language for
     * status logging and errors.
     */
    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage.Companion::unwrap))
    }

    /**
     * @param providerName The provider name. 
     */
    override fun providerName(providerName: String) {
      cdkBuilder.providerName(providerName)
    }

    /**
     * @param tagOptions TagOptions associated directly to a portfolio.
     */
    override fun tagOptions(tagOptions: TagOptions) {
      cdkBuilder.tagOptions(tagOptions.let(TagOptions.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.PortfolioProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicecatalog.PortfolioProps,
  ) : CdkObject(cdkObject), PortfolioProps {
    /**
     * Description for portfolio.
     *
     * Default: - No description provided
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the portfolio.
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * The message language.
     *
     * Controls language for
     * status logging and errors.
     *
     * Default: - English
     */
    override fun messageLanguage(): MessageLanguage? =
        unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

    /**
     * The provider name.
     */
    override fun providerName(): String = unwrap(this).getProviderName()

    /**
     * TagOptions associated directly to a portfolio.
     *
     * Default: - No tagOptions provided
     */
    override fun tagOptions(): TagOptions? = unwrap(this).getTagOptions()?.let(TagOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PortfolioProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.PortfolioProps):
        PortfolioProps = CdkObjectWrappers.wrap(cdkObject) as? PortfolioProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: PortfolioProps):
        software.amazon.awscdk.services.servicecatalog.PortfolioProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.PortfolioProps
  }
}
