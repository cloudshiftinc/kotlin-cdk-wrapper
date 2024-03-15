@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnLaunchTemplateConstraintProps {
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public fun description(): String? = unwrap(this).getDescription()

  public fun portfolioId(): String

  public fun productId(): String

  public fun rules(): String

  @CdkDslMarker
  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun description(description: String)

    public fun portfolioId(portfolioId: String)

    public fun productId(productId: String)

    public fun rules(rules: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps.builder()

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

    override fun rules(rules: String) {
      cdkBuilder.rules(rules)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps,
  ) : CdkObject(cdkObject), CfnLaunchTemplateConstraintProps {
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    override fun description(): String? = unwrap(this).getDescription()

    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    override fun productId(): String = unwrap(this).getProductId()

    override fun rules(): String = unwrap(this).getRules()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLaunchTemplateConstraintProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps):
        CfnLaunchTemplateConstraintProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchTemplateConstraintProps):
        software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps
  }
}
