@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnPortfolioProductAssociationProps {
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public fun portfolioId(): String

  public fun productId(): String

  public fun sourcePortfolioId(): String? = unwrap(this).getSourcePortfolioId()

  @CdkDslMarker
  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun portfolioId(portfolioId: String)

    public fun productId(productId: String)

    public fun sourcePortfolioId(sourcePortfolioId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps.builder()

    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    override fun sourcePortfolioId(sourcePortfolioId: String) {
      cdkBuilder.sourcePortfolioId(sourcePortfolioId)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps,
  ) : CdkObject(cdkObject), CfnPortfolioProductAssociationProps {
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    override fun productId(): String = unwrap(this).getProductId()

    override fun sourcePortfolioId(): String? = unwrap(this).getSourcePortfolioId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnPortfolioProductAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps):
        CfnPortfolioProductAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPortfolioProductAssociationProps):
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps
  }
}
