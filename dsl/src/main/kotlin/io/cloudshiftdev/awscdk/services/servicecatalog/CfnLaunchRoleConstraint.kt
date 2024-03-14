package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLaunchRoleConstraint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint,
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

  public open fun localRoleName(): String? = unwrap(this).getLocalRoleName()

  public open fun localRoleName(`value`: String) {
    unwrap(this).setLocalRoleName(`value`)
  }

  public open fun portfolioId(): String = unwrap(this).getPortfolioId()

  public open fun portfolioId(`value`: String) {
    unwrap(this).setPortfolioId(`value`)
  }

  public open fun productId(): String = unwrap(this).getProductId()

  public open fun productId(`value`: String) {
    unwrap(this).setProductId(`value`)
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun description(description: String)

    public fun localRoleName(localRoleName: String)

    public fun portfolioId(portfolioId: String)

    public fun productId(productId: String)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint.Builder.create(scope,
        id)

    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun localRoleName(localRoleName: String) {
      cdkBuilder.localRoleName(localRoleName)
    }

    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLaunchRoleConstraint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLaunchRoleConstraint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint):
        CfnLaunchRoleConstraint = CfnLaunchRoleConstraint(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchRoleConstraint):
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint = wrapped.cdkObject
  }
}
