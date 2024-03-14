package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPortfolioProductAssociation internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public open fun acceptLanguage(`value`: String) {
    unwrap(this).setAcceptLanguage(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun portfolioId(): String = unwrap(this).getPortfolioId()

  public open fun portfolioId(`value`: String) {
    unwrap(this).setPortfolioId(`value`)
  }

  public open fun productId(): String = unwrap(this).getProductId()

  public open fun productId(`value`: String) {
    unwrap(this).setProductId(`value`)
  }

  public open fun sourcePortfolioId(): String? = unwrap(this).getSourcePortfolioId()

  public open fun sourcePortfolioId(`value`: String) {
    unwrap(this).setSourcePortfolioId(`value`)
  }

  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun portfolioId(portfolioId: String)

    public fun productId(productId: String)

    public fun sourcePortfolioId(sourcePortfolioId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation.Builder.create(scope,
        id)

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
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPortfolioProductAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPortfolioProductAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation):
        CfnPortfolioProductAssociation = CfnPortfolioProductAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnPortfolioProductAssociation):
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation =
        wrapped.cdkObject
  }
}
