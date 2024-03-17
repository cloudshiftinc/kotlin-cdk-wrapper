@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnDashboard`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * CfnDashboardProps cfnDashboardProps = CfnDashboardProps.builder()
 * .dashboardBody("dashboardBody")
 * // the properties below are optional
 * .dashboardName("dashboardName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html)
 */
public interface CfnDashboardProps {
  /**
   * The detailed information about the dashboard in JSON format, including the widgets to include
   * and their location on the dashboard.
   *
   *
   *
   * For more information about the syntax, see [Dashboard Body Structure and
   * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardbody)
   */
  public fun dashboardBody(): String

  /**
   * The name of the dashboard.
   *
   * The name must be between 1 and 255 characters. If you do not specify a name, one will be
   * generated automatically.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardname)
   */
  public fun dashboardName(): String? = unwrap(this).getDashboardName()

  /**
   * A builder for [CfnDashboardProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dashboardBody The detailed information about the dashboard in JSON format, including
     * the widgets to include and their location on the dashboard. 
     *
     *
     * For more information about the syntax, see [Dashboard Body Structure and
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html)
     * .
     */
    public fun dashboardBody(dashboardBody: String)

    /**
     * @param dashboardName The name of the dashboard.
     * The name must be between 1 and 255 characters. If you do not specify a name, one will be
     * generated automatically.
     */
    public fun dashboardName(dashboardName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnDashboardProps.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnDashboardProps.builder()

    /**
     * @param dashboardBody The detailed information about the dashboard in JSON format, including
     * the widgets to include and their location on the dashboard. 
     *
     *
     * For more information about the syntax, see [Dashboard Body Structure and
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html)
     * .
     */
    override fun dashboardBody(dashboardBody: String) {
      cdkBuilder.dashboardBody(dashboardBody)
    }

    /**
     * @param dashboardName The name of the dashboard.
     * The name must be between 1 and 255 characters. If you do not specify a name, one will be
     * generated automatically.
     */
    override fun dashboardName(dashboardName: String) {
      cdkBuilder.dashboardName(dashboardName)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnDashboardProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnDashboardProps,
  ) : CdkObject(cdkObject), CfnDashboardProps {
    /**
     * The detailed information about the dashboard in JSON format, including the widgets to include
     * and their location on the dashboard.
     *
     *
     *
     * For more information about the syntax, see [Dashboard Body Structure and
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardbody)
     */
    override fun dashboardBody(): String = unwrap(this).getDashboardBody()

    /**
     * The name of the dashboard.
     *
     * The name must be between 1 and 255 characters. If you do not specify a name, one will be
     * generated automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardname)
     */
    override fun dashboardName(): String? = unwrap(this).getDashboardName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDashboardProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnDashboardProps):
        CfnDashboardProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDashboardProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDashboardProps):
        software.amazon.awscdk.services.cloudwatch.CfnDashboardProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CfnDashboardProps
  }
}
