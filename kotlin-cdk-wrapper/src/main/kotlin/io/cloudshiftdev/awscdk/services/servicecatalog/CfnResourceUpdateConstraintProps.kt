@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnResourceUpdateConstraintProps {
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public fun description(): String? = unwrap(this).getDescription()

  public fun portfolioId(): String

  public fun productId(): String

  public fun tagUpdateOnProvisionedProduct(): String

  @CdkDslMarker
  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun description(description: String)

    public fun portfolioId(portfolioId: String)

    public fun productId(productId: String)

    public fun tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps.builder()

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

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps,
  ) : CdkObject(cdkObject), CfnResourceUpdateConstraintProps {
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    override fun description(): String? = unwrap(this).getDescription()

    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    override fun productId(): String = unwrap(this).getProductId()

    override fun tagUpdateOnProvisionedProduct(): String =
        unwrap(this).getTagUpdateOnProvisionedProduct()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceUpdateConstraintProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps):
        CfnResourceUpdateConstraintProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceUpdateConstraintProps):
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps
  }
}
