package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourceUpdateConstraint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint,
) : CfnResource(cdkObject), IInspectable {
  public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public open fun acceptLanguage(`value`: String) {
    unwrap(this).setAcceptLanguage(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

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

  public open fun tagUpdateOnProvisionedProduct(): String =
      unwrap(this).getTagUpdateOnProvisionedProduct()

  public open fun tagUpdateOnProvisionedProduct(`value`: String) {
    unwrap(this).setTagUpdateOnProvisionedProduct(`value`)
  }

  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun description(description: String)

    public fun portfolioId(portfolioId: String)

    public fun productId(productId: String)

    public fun tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint.Builder.create(scope,
        id)

    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    override fun tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct: String) {
      cdkBuilder.tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceUpdateConstraint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceUpdateConstraint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint):
        CfnResourceUpdateConstraint = CfnResourceUpdateConstraint(cdkObject)

    internal fun unwrap(wrapped: CfnResourceUpdateConstraint):
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint =
        wrapped.cdkObject
  }
}
