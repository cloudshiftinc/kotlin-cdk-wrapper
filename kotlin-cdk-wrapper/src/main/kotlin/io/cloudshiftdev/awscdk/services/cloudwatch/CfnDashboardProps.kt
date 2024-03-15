@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnDashboardProps {
  public fun dashboardBody(): String

  public fun dashboardName(): String? = unwrap(this).getDashboardName()

  @CdkDslMarker
  public interface Builder {
    public fun dashboardBody(dashboardBody: String)

    public fun dashboardName(dashboardName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnDashboardProps.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnDashboardProps.builder()

    override fun dashboardBody(dashboardBody: String) {
      cdkBuilder.dashboardBody(dashboardBody)
    }

    override fun dashboardName(dashboardName: String) {
      cdkBuilder.dashboardName(dashboardName)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnDashboardProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnDashboardProps,
  ) : CdkObject(cdkObject), CfnDashboardProps {
    override fun dashboardBody(): String = unwrap(this).getDashboardBody()

    override fun dashboardName(): String? = unwrap(this).getDashboardName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDashboardProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnDashboardProps):
        CfnDashboardProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDashboardProps):
        software.amazon.awscdk.services.cloudwatch.CfnDashboardProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CfnDashboardProps
  }
}
