@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface PortfolioProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun displayName(): String

  public fun messageLanguage(): MessageLanguage? =
      unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

  public fun providerName(): String

  public fun tagOptions(): TagOptions? = unwrap(this).getTagOptions()?.let(TagOptions::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun messageLanguage(messageLanguage: MessageLanguage)

    public fun providerName(providerName: String)

    public fun tagOptions(tagOptions: TagOptions)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.PortfolioProps.Builder =
        software.amazon.awscdk.services.servicecatalog.PortfolioProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage::unwrap))
    }

    override fun providerName(providerName: String) {
      cdkBuilder.providerName(providerName)
    }

    override fun tagOptions(tagOptions: TagOptions) {
      cdkBuilder.tagOptions(tagOptions.let(TagOptions::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.PortfolioProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.PortfolioProps,
  ) : CdkObject(cdkObject), PortfolioProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun displayName(): String = unwrap(this).getDisplayName()

    override fun messageLanguage(): MessageLanguage? =
        unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

    override fun providerName(): String = unwrap(this).getProviderName()

    override fun tagOptions(): TagOptions? = unwrap(this).getTagOptions()?.let(TagOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PortfolioProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.PortfolioProps):
        PortfolioProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PortfolioProps):
        software.amazon.awscdk.services.servicecatalog.PortfolioProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.PortfolioProps
  }
}
