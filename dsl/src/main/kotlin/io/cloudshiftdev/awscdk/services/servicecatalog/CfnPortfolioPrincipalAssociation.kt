package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPortfolioPrincipalAssociation internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation,
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

  public open fun principalArn(): String = unwrap(this).getPrincipalArn()

  public open fun principalArn(`value`: String) {
    unwrap(this).setPrincipalArn(`value`)
  }

  public open fun principalType(): String = unwrap(this).getPrincipalType()

  public open fun principalType(`value`: String) {
    unwrap(this).setPrincipalType(`value`)
  }

  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String) {
    }

    public fun portfolioId(portfolioId: String) {
    }

    public fun principalArn(principalArn: String) {
    }

    public fun principalType(principalType: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation.Builder.create(scope,
        id)

    public override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    public override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    public override fun principalArn(principalArn: String) {
      cdkBuilder.principalArn(principalArn)
    }

    public override fun principalType(principalType: String) {
      cdkBuilder.principalType(principalType)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPortfolioPrincipalAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPortfolioPrincipalAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation):
        CfnPortfolioPrincipalAssociation = CfnPortfolioPrincipalAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnPortfolioPrincipalAssociation):
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation =
        wrapped.cdkObject
  }
}
