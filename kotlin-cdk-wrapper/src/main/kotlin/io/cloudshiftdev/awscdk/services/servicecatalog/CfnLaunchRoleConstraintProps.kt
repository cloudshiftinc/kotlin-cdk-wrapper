@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnLaunchRoleConstraintProps {
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public fun description(): String? = unwrap(this).getDescription()

  public fun localRoleName(): String? = unwrap(this).getLocalRoleName()

  public fun portfolioId(): String

  public fun productId(): String

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  @CdkDslMarker
  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun description(description: String)

    public fun localRoleName(localRoleName: String)

    public fun portfolioId(portfolioId: String)

    public fun productId(productId: String)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps.builder()

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

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps,
  ) : CdkObject(cdkObject), CfnLaunchRoleConstraintProps {
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    override fun description(): String? = unwrap(this).getDescription()

    override fun localRoleName(): String? = unwrap(this).getLocalRoleName()

    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    override fun productId(): String = unwrap(this).getProductId()

    override fun roleArn(): String? = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLaunchRoleConstraintProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps):
        CfnLaunchRoleConstraintProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchRoleConstraintProps):
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps
  }
}
