package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStackSetConstraint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint,
) : CfnResource(cdkObject), IInspectable {
  public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public open fun acceptLanguage(`value`: String) {
    unwrap(this).setAcceptLanguage(`value`)
  }

  public open fun accountList(): List<String> = unwrap(this).getAccountList() ?: emptyList()

  public open fun accountList(`value`: List<String>) {
    unwrap(this).setAccountList(`value`)
  }

  public open fun adminRole(): String = unwrap(this).getAdminRole()

  public open fun adminRole(`value`: String) {
    unwrap(this).setAdminRole(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun executionRole(): String = unwrap(this).getExecutionRole()

  public open fun executionRole(`value`: String) {
    unwrap(this).setExecutionRole(`value`)
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

  public open fun regionList(): List<String> = unwrap(this).getRegionList() ?: emptyList()

  public open fun regionList(`value`: List<String>) {
    unwrap(this).setRegionList(`value`)
  }

  public open fun stackInstanceControl(): String = unwrap(this).getStackInstanceControl()

  public open fun stackInstanceControl(`value`: String) {
    unwrap(this).setStackInstanceControl(`value`)
  }

  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String) {
    }

    public fun accountList(accountList: List<String>) {
    }

    public fun adminRole(adminRole: String) {
    }

    public fun description(description: String) {
    }

    public fun executionRole(executionRole: String) {
    }

    public fun portfolioId(portfolioId: String) {
    }

    public fun productId(productId: String) {
    }

    public fun regionList(regionList: List<String>) {
    }

    public fun stackInstanceControl(stackInstanceControl: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint.Builder.create(scope,
        id)

    public override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    public override fun accountList(accountList: List<String>) {
      cdkBuilder.accountList(accountList)
    }

    public override fun adminRole(adminRole: String) {
      cdkBuilder.adminRole(adminRole)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun executionRole(executionRole: String) {
      cdkBuilder.executionRole(executionRole)
    }

    public override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    public override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    public override fun regionList(regionList: List<String>) {
      cdkBuilder.regionList(regionList)
    }

    public override fun stackInstanceControl(stackInstanceControl: String) {
      cdkBuilder.stackInstanceControl(stackInstanceControl)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStackSetConstraint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStackSetConstraint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint):
        CfnStackSetConstraint = CfnStackSetConstraint(cdkObject)

    internal fun unwrap(wrapped: CfnStackSetConstraint):
        software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint = wrapped.cdkObject
  }
}
