package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLaunchNotificationConstraint internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint,
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

  public open fun notificationArns(): List<String> = unwrap(this).getNotificationArns()

  public open fun notificationArns(`value`: List<String>) {
    unwrap(this).setNotificationArns(`value`)
  }

  public open fun notificationArns(vararg `value`: String): Unit =
      notificationArns(`value`.toList())

  public open fun portfolioId(): String = unwrap(this).getPortfolioId()

  public open fun portfolioId(`value`: String) {
    unwrap(this).setPortfolioId(`value`)
  }

  public open fun productId(): String = unwrap(this).getProductId()

  public open fun productId(`value`: String) {
    unwrap(this).setProductId(`value`)
  }

  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun description(description: String)

    public fun notificationArns(notificationArns: List<String>)

    public fun notificationArns(vararg notificationArns: String)

    public fun portfolioId(portfolioId: String)

    public fun productId(productId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint.Builder.create(scope,
        id)

    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLaunchNotificationConstraint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLaunchNotificationConstraint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint):
        CfnLaunchNotificationConstraint = CfnLaunchNotificationConstraint(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchNotificationConstraint):
        software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint =
        wrapped.cdkObject
  }
}
