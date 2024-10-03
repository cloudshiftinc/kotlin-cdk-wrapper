@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnVdmAttributes`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnVdmAttributesProps cfnVdmAttributesProps = CfnVdmAttributesProps.builder()
 * .dashboardAttributes(DashboardAttributesProperty.builder()
 * .engagementMetrics("engagementMetrics")
 * .build())
 * .guardianAttributes(GuardianAttributesProperty.builder()
 * .optimizedSharedDelivery("optimizedSharedDelivery")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html)
 */
public interface CfnVdmAttributesProps {
  /**
   * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-dashboardattributes)
   */
  public fun dashboardAttributes(): Any? = unwrap(this).getDashboardAttributes()

  /**
   * Specifies additional settings for your VDM configuration as applicable to the Guardian.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-guardianattributes)
   */
  public fun guardianAttributes(): Any? = unwrap(this).getGuardianAttributes()

  /**
   * A builder for [CfnVdmAttributesProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Dashboard.
     */
    public fun dashboardAttributes(dashboardAttributes: IResolvable)

    /**
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Dashboard.
     */
    public
        fun dashboardAttributes(dashboardAttributes: CfnVdmAttributes.DashboardAttributesProperty)

    /**
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Dashboard.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f29a620aed7b3d3866833ecc1d67bc124c357912a32772b2aa408fbb13bbfc7")
    public
        fun dashboardAttributes(dashboardAttributes: CfnVdmAttributes.DashboardAttributesProperty.Builder.() -> Unit)

    /**
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Guardian.
     */
    public fun guardianAttributes(guardianAttributes: IResolvable)

    /**
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Guardian.
     */
    public fun guardianAttributes(guardianAttributes: CfnVdmAttributes.GuardianAttributesProperty)

    /**
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Guardian.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0daeb328c2f21c5fd6884fd4c6e83934280a8ca4e0b0009ec66239d8c597210c")
    public
        fun guardianAttributes(guardianAttributes: CfnVdmAttributes.GuardianAttributesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnVdmAttributesProps.Builder =
        software.amazon.awscdk.services.ses.CfnVdmAttributesProps.builder()

    /**
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Dashboard.
     */
    override fun dashboardAttributes(dashboardAttributes: IResolvable) {
      cdkBuilder.dashboardAttributes(dashboardAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Dashboard.
     */
    override
        fun dashboardAttributes(dashboardAttributes: CfnVdmAttributes.DashboardAttributesProperty) {
      cdkBuilder.dashboardAttributes(dashboardAttributes.let(CfnVdmAttributes.DashboardAttributesProperty.Companion::unwrap))
    }

    /**
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Dashboard.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f29a620aed7b3d3866833ecc1d67bc124c357912a32772b2aa408fbb13bbfc7")
    override
        fun dashboardAttributes(dashboardAttributes: CfnVdmAttributes.DashboardAttributesProperty.Builder.() -> Unit):
        Unit =
        dashboardAttributes(CfnVdmAttributes.DashboardAttributesProperty(dashboardAttributes))

    /**
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Guardian.
     */
    override fun guardianAttributes(guardianAttributes: IResolvable) {
      cdkBuilder.guardianAttributes(guardianAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Guardian.
     */
    override
        fun guardianAttributes(guardianAttributes: CfnVdmAttributes.GuardianAttributesProperty) {
      cdkBuilder.guardianAttributes(guardianAttributes.let(CfnVdmAttributes.GuardianAttributesProperty.Companion::unwrap))
    }

    /**
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     * applicable to the Guardian.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0daeb328c2f21c5fd6884fd4c6e83934280a8ca4e0b0009ec66239d8c597210c")
    override
        fun guardianAttributes(guardianAttributes: CfnVdmAttributes.GuardianAttributesProperty.Builder.() -> Unit):
        Unit = guardianAttributes(CfnVdmAttributes.GuardianAttributesProperty(guardianAttributes))

    public fun build(): software.amazon.awscdk.services.ses.CfnVdmAttributesProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.CfnVdmAttributesProps,
  ) : CdkObject(cdkObject),
      CfnVdmAttributesProps {
    /**
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-dashboardattributes)
     */
    override fun dashboardAttributes(): Any? = unwrap(this).getDashboardAttributes()

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-guardianattributes)
     */
    override fun guardianAttributes(): Any? = unwrap(this).getGuardianAttributes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVdmAttributesProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnVdmAttributesProps):
        CfnVdmAttributesProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVdmAttributesProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVdmAttributesProps):
        software.amazon.awscdk.services.ses.CfnVdmAttributesProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.CfnVdmAttributesProps
  }
}
