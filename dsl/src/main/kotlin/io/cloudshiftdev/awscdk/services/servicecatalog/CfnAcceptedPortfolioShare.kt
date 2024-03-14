package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAcceptedPortfolioShare internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare,
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

  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun portfolioId(portfolioId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare.Builder.create(scope,
        id)

    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAcceptedPortfolioShare {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAcceptedPortfolioShare(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare):
        CfnAcceptedPortfolioShare = CfnAcceptedPortfolioShare(cdkObject)

    internal fun unwrap(wrapped: CfnAcceptedPortfolioShare):
        software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare = wrapped.cdkObject
  }
}
