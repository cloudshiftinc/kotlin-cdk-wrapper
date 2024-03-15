@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface PortfolioShareOptions {
  public fun messageLanguage(): MessageLanguage? =
      unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

  public fun shareTagOptions(): Boolean? = unwrap(this).getShareTagOptions()

  @CdkDslMarker
  public interface Builder {
    public fun messageLanguage(messageLanguage: MessageLanguage)

    public fun shareTagOptions(shareTagOptions: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions.Builder =
        software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions.builder()

    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage::unwrap))
    }

    override fun shareTagOptions(shareTagOptions: Boolean) {
      cdkBuilder.shareTagOptions(shareTagOptions)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions,
  ) : CdkObject(cdkObject), PortfolioShareOptions {
    override fun messageLanguage(): MessageLanguage? =
        unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

    override fun shareTagOptions(): Boolean? = unwrap(this).getShareTagOptions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PortfolioShareOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions):
        PortfolioShareOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PortfolioShareOptions):
        software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions
  }
}
