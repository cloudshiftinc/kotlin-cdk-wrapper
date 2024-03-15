@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnPortfolioPrincipalAssociationProps {
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public fun portfolioId(): String

  public fun principalArn(): String

  public fun principalType(): String

  @CdkDslMarker
  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun portfolioId(portfolioId: String)

    public fun principalArn(principalArn: String)

    public fun principalType(principalType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps.Builder
        =
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps.builder()

    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    override fun principalArn(principalArn: String) {
      cdkBuilder.principalArn(principalArn)
    }

    override fun principalType(principalType: String) {
      cdkBuilder.principalType(principalType)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps,
  ) : CdkObject(cdkObject), CfnPortfolioPrincipalAssociationProps {
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    override fun principalArn(): String = unwrap(this).getPrincipalArn()

    override fun principalType(): String = unwrap(this).getPrincipalType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnPortfolioPrincipalAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps):
        CfnPortfolioPrincipalAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPortfolioPrincipalAssociationProps):
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps
  }
}
