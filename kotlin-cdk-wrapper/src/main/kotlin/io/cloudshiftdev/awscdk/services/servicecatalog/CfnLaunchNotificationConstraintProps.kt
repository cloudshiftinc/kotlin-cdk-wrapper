@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLaunchNotificationConstraintProps {
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public fun description(): String? = unwrap(this).getDescription()

  public fun notificationArns(): List<String>

  public fun portfolioId(): String

  public fun productId(): String

  @CdkDslMarker
  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun description(description: String)

    public fun notificationArns(notificationArns: List<String>)

    public fun notificationArns(vararg notificationArns: String)

    public fun portfolioId(portfolioId: String)

    public fun productId(productId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps.Builder
        =
        software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps.builder()

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
        software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps,
  ) : CdkObject(cdkObject), CfnLaunchNotificationConstraintProps {
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    override fun description(): String? = unwrap(this).getDescription()

    override fun notificationArns(): List<String> = unwrap(this).getNotificationArns()

    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    override fun productId(): String = unwrap(this).getProductId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnLaunchNotificationConstraintProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps):
        CfnLaunchNotificationConstraintProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchNotificationConstraintProps):
        software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps
  }
}
