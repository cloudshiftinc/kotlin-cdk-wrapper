@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDashboard`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
 * CfnDashboardProps cfnDashboardProps = CfnDashboardProps.builder()
 * .name("name")
 * .refreshSchedule(RefreshScheduleProperty.builder()
 * .frequency(FrequencyProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .status("status")
 * .timeOfDay("timeOfDay")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .terminationProtectionEnabled(false)
 * .widgets(List.of(WidgetProperty.builder()
 * .queryStatement("queryStatement")
 * // the properties below are optional
 * .queryParameters(List.of("queryParameters"))
 * .viewProperties(Map.of(
 * "viewPropertiesKey", "viewProperties"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html)
 */
public interface CfnDashboardProps {
  /**
   * The name of the dashboard. The name must be unique to your account.
   *
   * To create the Highlights dashboard, the name must be `AWSCloudTrail-Highlights` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The schedule for a dashboard refresh.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-refreshschedule)
   */
  public fun refreshSchedule(): Any? = unwrap(this).getRefreshSchedule()

  /**
   * A list of tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies whether termination protection is enabled for the dashboard.
   *
   * If termination protection is enabled, you cannot delete the dashboard until termination
   * protection is disabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-terminationprotectionenabled)
   */
  public fun terminationProtectionEnabled(): Any? = unwrap(this).getTerminationProtectionEnabled()

  /**
   * An array of widgets for a custom dashboard. A custom dashboard can have a maximum of ten
   * widgets.
   *
   * You do not need to specify widgets for the Highlights dashboard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-widgets)
   */
  public fun widgets(): Any? = unwrap(this).getWidgets()

  /**
   * A builder for [CfnDashboardProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the dashboard. The name must be unique to your account.
     * To create the Highlights dashboard, the name must be `AWSCloudTrail-Highlights` .
     */
    public fun name(name: String)

    /**
     * @param refreshSchedule The schedule for a dashboard refresh.
     */
    public fun refreshSchedule(refreshSchedule: IResolvable)

    /**
     * @param refreshSchedule The schedule for a dashboard refresh.
     */
    public fun refreshSchedule(refreshSchedule: CfnDashboard.RefreshScheduleProperty)

    /**
     * @param refreshSchedule The schedule for a dashboard refresh.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f79ecb0267a54679597162c08149c773ace9769c6c24892caed5df361996803")
    public
        fun refreshSchedule(refreshSchedule: CfnDashboard.RefreshScheduleProperty.Builder.() -> Unit)

    /**
     * @param tags A list of tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the dashboard.
     * If termination protection is enabled, you cannot delete the dashboard until termination
     * protection is disabled.
     */
    public fun terminationProtectionEnabled(terminationProtectionEnabled: Boolean)

    /**
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the dashboard.
     * If termination protection is enabled, you cannot delete the dashboard until termination
     * protection is disabled.
     */
    public fun terminationProtectionEnabled(terminationProtectionEnabled: IResolvable)

    /**
     * @param widgets An array of widgets for a custom dashboard. A custom dashboard can have a
     * maximum of ten widgets.
     * You do not need to specify widgets for the Highlights dashboard.
     */
    public fun widgets(widgets: IResolvable)

    /**
     * @param widgets An array of widgets for a custom dashboard. A custom dashboard can have a
     * maximum of ten widgets.
     * You do not need to specify widgets for the Highlights dashboard.
     */
    public fun widgets(widgets: List<Any>)

    /**
     * @param widgets An array of widgets for a custom dashboard. A custom dashboard can have a
     * maximum of ten widgets.
     * You do not need to specify widgets for the Highlights dashboard.
     */
    public fun widgets(vararg widgets: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.CfnDashboardProps.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnDashboardProps.builder()

    /**
     * @param name The name of the dashboard. The name must be unique to your account.
     * To create the Highlights dashboard, the name must be `AWSCloudTrail-Highlights` .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param refreshSchedule The schedule for a dashboard refresh.
     */
    override fun refreshSchedule(refreshSchedule: IResolvable) {
      cdkBuilder.refreshSchedule(refreshSchedule.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param refreshSchedule The schedule for a dashboard refresh.
     */
    override fun refreshSchedule(refreshSchedule: CfnDashboard.RefreshScheduleProperty) {
      cdkBuilder.refreshSchedule(refreshSchedule.let(CfnDashboard.RefreshScheduleProperty.Companion::unwrap))
    }

    /**
     * @param refreshSchedule The schedule for a dashboard refresh.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f79ecb0267a54679597162c08149c773ace9769c6c24892caed5df361996803")
    override
        fun refreshSchedule(refreshSchedule: CfnDashboard.RefreshScheduleProperty.Builder.() -> Unit):
        Unit = refreshSchedule(CfnDashboard.RefreshScheduleProperty(refreshSchedule))

    /**
     * @param tags A list of tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the dashboard.
     * If termination protection is enabled, you cannot delete the dashboard until termination
     * protection is disabled.
     */
    override fun terminationProtectionEnabled(terminationProtectionEnabled: Boolean) {
      cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled)
    }

    /**
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the dashboard.
     * If termination protection is enabled, you cannot delete the dashboard until termination
     * protection is disabled.
     */
    override fun terminationProtectionEnabled(terminationProtectionEnabled: IResolvable) {
      cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param widgets An array of widgets for a custom dashboard. A custom dashboard can have a
     * maximum of ten widgets.
     * You do not need to specify widgets for the Highlights dashboard.
     */
    override fun widgets(widgets: IResolvable) {
      cdkBuilder.widgets(widgets.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param widgets An array of widgets for a custom dashboard. A custom dashboard can have a
     * maximum of ten widgets.
     * You do not need to specify widgets for the Highlights dashboard.
     */
    override fun widgets(widgets: List<Any>) {
      cdkBuilder.widgets(widgets.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param widgets An array of widgets for a custom dashboard. A custom dashboard can have a
     * maximum of ten widgets.
     * You do not need to specify widgets for the Highlights dashboard.
     */
    override fun widgets(vararg widgets: Any): Unit = widgets(widgets.toList())

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnDashboardProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudtrail.CfnDashboardProps,
  ) : CdkObject(cdkObject),
      CfnDashboardProps {
    /**
     * The name of the dashboard. The name must be unique to your account.
     *
     * To create the Highlights dashboard, the name must be `AWSCloudTrail-Highlights` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The schedule for a dashboard refresh.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-refreshschedule)
     */
    override fun refreshSchedule(): Any? = unwrap(this).getRefreshSchedule()

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies whether termination protection is enabled for the dashboard.
     *
     * If termination protection is enabled, you cannot delete the dashboard until termination
     * protection is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-terminationprotectionenabled)
     */
    override fun terminationProtectionEnabled(): Any? =
        unwrap(this).getTerminationProtectionEnabled()

    /**
     * An array of widgets for a custom dashboard. A custom dashboard can have a maximum of ten
     * widgets.
     *
     * You do not need to specify widgets for the Highlights dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-widgets)
     */
    override fun widgets(): Any? = unwrap(this).getWidgets()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDashboardProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnDashboardProps):
        CfnDashboardProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDashboardProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDashboardProps):
        software.amazon.awscdk.services.cloudtrail.CfnDashboardProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudtrail.CfnDashboardProps
  }
}
