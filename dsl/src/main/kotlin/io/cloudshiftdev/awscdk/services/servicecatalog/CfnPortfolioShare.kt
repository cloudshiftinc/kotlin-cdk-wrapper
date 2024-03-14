package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPortfolioShare internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare,
) : CfnResource(cdkObject), IInspectable {
  public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public open fun acceptLanguage(`value`: String) {
    unwrap(this).setAcceptLanguage(`value`)
  }

  public open fun accountId(): String = unwrap(this).getAccountId()

  public open fun accountId(`value`: String) {
    unwrap(this).setAccountId(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun portfolioId(): String = unwrap(this).getPortfolioId()

  public open fun portfolioId(`value`: String) {
    unwrap(this).setPortfolioId(`value`)
  }

  public open fun shareTagOptions(): Any? = unwrap(this).getShareTagOptions()

  public open fun shareTagOptions(`value`: Boolean) {
    unwrap(this).setShareTagOptions(`value`)
  }

  public open fun shareTagOptions(`value`: IResolvable) {
    unwrap(this).setShareTagOptions(`value`.let(IResolvable::unwrap))
  }

  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String) {
    }

    public fun accountId(accountId: String) {
    }

    public fun portfolioId(portfolioId: String) {
    }

    public fun shareTagOptions(shareTagOptions: Boolean) {
    }

    public fun shareTagOptions(shareTagOptions: IResolvable) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare.Builder
        = software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare.Builder.create(scope, id)

    public override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    public override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    public override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    public override fun shareTagOptions(shareTagOptions: Boolean) {
      cdkBuilder.shareTagOptions(shareTagOptions)
    }

    public override fun shareTagOptions(shareTagOptions: IResolvable) {
      cdkBuilder.shareTagOptions(shareTagOptions.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPortfolioShare {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPortfolioShare(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare):
        CfnPortfolioShare = CfnPortfolioShare(cdkObject)

    internal fun unwrap(wrapped: CfnPortfolioShare):
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare = wrapped.cdkObject
  }
}
