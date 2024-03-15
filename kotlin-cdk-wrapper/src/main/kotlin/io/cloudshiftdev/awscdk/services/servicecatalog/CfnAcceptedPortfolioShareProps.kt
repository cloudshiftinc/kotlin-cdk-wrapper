@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnAcceptedPortfolioShareProps {
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public fun portfolioId(): String

  @CdkDslMarker
  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun portfolioId(portfolioId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShareProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShareProps.builder()

    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShareProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShareProps,
  ) : CdkObject(cdkObject), CfnAcceptedPortfolioShareProps {
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    override fun portfolioId(): String = unwrap(this).getPortfolioId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAcceptedPortfolioShareProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShareProps):
        CfnAcceptedPortfolioShareProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAcceptedPortfolioShareProps):
        software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShareProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShareProps
  }
}
