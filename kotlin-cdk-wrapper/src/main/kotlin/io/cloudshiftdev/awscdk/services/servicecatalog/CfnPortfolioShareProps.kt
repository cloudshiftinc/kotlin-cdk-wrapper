@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnPortfolioShareProps {
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public fun accountId(): String

  public fun portfolioId(): String

  public fun shareTagOptions(): Any? = unwrap(this).getShareTagOptions()

  @CdkDslMarker
  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun accountId(accountId: String)

    public fun portfolioId(portfolioId: String)

    public fun shareTagOptions(shareTagOptions: Boolean)

    public fun shareTagOptions(shareTagOptions: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps.builder()

    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    override fun shareTagOptions(shareTagOptions: Boolean) {
      cdkBuilder.shareTagOptions(shareTagOptions)
    }

    override fun shareTagOptions(shareTagOptions: IResolvable) {
      cdkBuilder.shareTagOptions(shareTagOptions.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps,
  ) : CdkObject(cdkObject), CfnPortfolioShareProps {
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    override fun accountId(): String = unwrap(this).getAccountId()

    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    override fun shareTagOptions(): Any? = unwrap(this).getShareTagOptions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPortfolioShareProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps):
        CfnPortfolioShareProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPortfolioShareProps):
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps
  }
}
