package io.cloudshiftdev.awscdk.services.servicecatalog

import kotlin.Boolean
import kotlin.Unit

public interface PortfolioShareOptions {
  public fun messageLanguage(): MessageLanguage? =
      unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

  public fun shareTagOptions(): Boolean? = unwrap(this).getShareTagOptions()

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions,
  ) : PortfolioShareOptions {
    override fun messageLanguage(): MessageLanguage? =
        unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

    override fun shareTagOptions(): Boolean? = unwrap(this).getShareTagOptions()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PortfolioShareOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions):
        PortfolioShareOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PortfolioShareOptions):
        software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions = (wrapped as
        Wrapper).cdkObject
  }
}
