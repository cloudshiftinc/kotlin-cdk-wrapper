@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnStackSetConstraintProps {
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public fun accountList(): List<String>

  public fun adminRole(): String

  public fun description(): String

  public fun executionRole(): String

  public fun portfolioId(): String

  public fun productId(): String

  public fun regionList(): List<String>

  public fun stackInstanceControl(): String

  @CdkDslMarker
  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun accountList(accountList: List<String>)

    public fun accountList(vararg accountList: String)

    public fun adminRole(adminRole: String)

    public fun description(description: String)

    public fun executionRole(executionRole: String)

    public fun portfolioId(portfolioId: String)

    public fun productId(productId: String)

    public fun regionList(regionList: List<String>)

    public fun regionList(vararg regionList: String)

    public fun stackInstanceControl(stackInstanceControl: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps.builder()

    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    override fun accountList(accountList: List<String>) {
      cdkBuilder.accountList(accountList)
    }

    override fun accountList(vararg accountList: String): Unit = accountList(accountList.toList())

    override fun adminRole(adminRole: String) {
      cdkBuilder.adminRole(adminRole)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun executionRole(executionRole: String) {
      cdkBuilder.executionRole(executionRole)
    }

    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    override fun regionList(regionList: List<String>) {
      cdkBuilder.regionList(regionList)
    }

    override fun regionList(vararg regionList: String): Unit = regionList(regionList.toList())

    override fun stackInstanceControl(stackInstanceControl: String) {
      cdkBuilder.stackInstanceControl(stackInstanceControl)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps,
  ) : CdkObject(cdkObject), CfnStackSetConstraintProps {
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    override fun accountList(): List<String> = unwrap(this).getAccountList()

    override fun adminRole(): String = unwrap(this).getAdminRole()

    override fun description(): String = unwrap(this).getDescription()

    override fun executionRole(): String = unwrap(this).getExecutionRole()

    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    override fun productId(): String = unwrap(this).getProductId()

    override fun regionList(): List<String> = unwrap(this).getRegionList()

    override fun stackInstanceControl(): String = unwrap(this).getStackInstanceControl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStackSetConstraintProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps):
        CfnStackSetConstraintProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStackSetConstraintProps):
        software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps
  }
}
