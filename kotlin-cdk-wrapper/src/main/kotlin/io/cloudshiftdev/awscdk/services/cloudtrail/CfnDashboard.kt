@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a custom dashboard or the Highlights dashboard.
 *
 * * *Custom dashboards* - Custom dashboards allow you to query events in any event data store type.
 * You can add up to 10 widgets to a custom dashboard. You can manually refresh a custom dashboard, or
 * you can set a refresh schedule.
 * * *Highlights dashboard* - You can create the Highlights dashboard to see a summary of key user
 * activities and API usage across all your event data stores. CloudTrail Lake manages the Highlights
 * dashboard and refreshes the dashboard every 6 hours. To create the Highlights dashboard, you must
 * set and enable a refresh schedule.
 *
 * CloudTrail runs queries to populate the dashboard's widgets during a manual or scheduled refresh.
 * CloudTrail must be granted permissions to run the `StartQuery` operation on your behalf. To provide
 * permissions, run the `PutResourcePolicy` operation to attach a resource-based policy to each event
 * data store. For more information, see [Example: Allow CloudTrail to run queries to populate a
 * dashboard](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/security_iam_resource-based-policy-examples.html#security_iam_resource-based-policy-examples-eds-dashboard)
 * in the *AWS CloudTrail User Guide* .
 *
 * To set a refresh schedule, CloudTrail must be granted permissions to run the
 * `StartDashboardRefresh` operation to refresh the dashboard on your behalf. To provide permissions,
 * run the `PutResourcePolicy` operation to attach a resource-based policy to the dashboard. For more
 * information, see [Resource-based policy example for a
 * dashboard](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/security_iam_resource-based-policy-examples.html#security_iam_resource-based-policy-examples-dashboards)
 * in the *AWS CloudTrail User Guide* .
 *
 * For more information about dashboards, see [CloudTrail Lake
 * dashboards](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-dashboard.html) in the
 * *AWS CloudTrail User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
 * CfnDashboard cfnDashboard = CfnDashboard.Builder.create(this, "MyCfnDashboard")
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
public open class CfnDashboard(
  cdkObject: software.amazon.awscdk.services.cloudtrail.CfnDashboard,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.cloudtrail.CfnDashboard(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDashboardProps,
  ) :
      this(software.amazon.awscdk.services.cloudtrail.CfnDashboard(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDashboardProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDashboardProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDashboardProps(props)
  )

  /**
   * The timestamp that shows when the dashboard was created.
   */
  public open fun attrCreatedTimestamp(): String = unwrap(this).getAttrCreatedTimestamp()

  /**
   * The ARN for the dashboard.
   */
  public open fun attrDashboardArn(): String = unwrap(this).getAttrDashboardArn()

  /**
   * The status of the dashboard.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The type of dashboard.
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   * The timestamp that shows when the dashboard was updated.
   */
  public open fun attrUpdatedTimestamp(): String = unwrap(this).getAttrUpdatedTimestamp()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the dashboard.
   *
   * The name must be unique to your account.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the dashboard.
   *
   * The name must be unique to your account.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The schedule for a dashboard refresh.
   */
  public open fun refreshSchedule(): Any? = unwrap(this).getRefreshSchedule()

  /**
   * The schedule for a dashboard refresh.
   */
  public open fun refreshSchedule(`value`: IResolvable) {
    unwrap(this).setRefreshSchedule(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The schedule for a dashboard refresh.
   */
  public open fun refreshSchedule(`value`: RefreshScheduleProperty) {
    unwrap(this).setRefreshSchedule(`value`.let(RefreshScheduleProperty.Companion::unwrap))
  }

  /**
   * The schedule for a dashboard refresh.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0050510817b7c5de30fe3fb4bcfb3fb9549ada5a7408fbef9f1bb51e2316cba5")
  public open fun refreshSchedule(`value`: RefreshScheduleProperty.Builder.() -> Unit): Unit =
      refreshSchedule(RefreshScheduleProperty(`value`))

  /**
   * A list of tags.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of tags.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * Specifies whether termination protection is enabled for the dashboard.
   */
  public open fun terminationProtectionEnabled(): Any? =
      unwrap(this).getTerminationProtectionEnabled()

  /**
   * Specifies whether termination protection is enabled for the dashboard.
   */
  public open fun terminationProtectionEnabled(`value`: Boolean) {
    unwrap(this).setTerminationProtectionEnabled(`value`)
  }

  /**
   * Specifies whether termination protection is enabled for the dashboard.
   */
  public open fun terminationProtectionEnabled(`value`: IResolvable) {
    unwrap(this).setTerminationProtectionEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An array of widgets for a custom dashboard.
   *
   * A custom dashboard can have a maximum of ten widgets.
   */
  public open fun widgets(): Any? = unwrap(this).getWidgets()

  /**
   * An array of widgets for a custom dashboard.
   *
   * A custom dashboard can have a maximum of ten widgets.
   */
  public open fun widgets(`value`: IResolvable) {
    unwrap(this).setWidgets(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An array of widgets for a custom dashboard.
   *
   * A custom dashboard can have a maximum of ten widgets.
   */
  public open fun widgets(`value`: List<Any>) {
    unwrap(this).setWidgets(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of widgets for a custom dashboard.
   *
   * A custom dashboard can have a maximum of ten widgets.
   */
  public open fun widgets(vararg `value`: Any): Unit = widgets(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudtrail.CfnDashboard].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the dashboard. The name must be unique to your account.
     *
     * To create the Highlights dashboard, the name must be `AWSCloudTrail-Highlights` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-name)
     * @param name The name of the dashboard. The name must be unique to your account. 
     */
    public fun name(name: String)

    /**
     * The schedule for a dashboard refresh.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-refreshschedule)
     * @param refreshSchedule The schedule for a dashboard refresh. 
     */
    public fun refreshSchedule(refreshSchedule: IResolvable)

    /**
     * The schedule for a dashboard refresh.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-refreshschedule)
     * @param refreshSchedule The schedule for a dashboard refresh. 
     */
    public fun refreshSchedule(refreshSchedule: RefreshScheduleProperty)

    /**
     * The schedule for a dashboard refresh.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-refreshschedule)
     * @param refreshSchedule The schedule for a dashboard refresh. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a46af98705326d017812c85ad0fdc3ff82c42b1f36a03f2fce34b7bd1f3f455")
    public fun refreshSchedule(refreshSchedule: RefreshScheduleProperty.Builder.() -> Unit)

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-tags)
     * @param tags A list of tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-tags)
     * @param tags A list of tags. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Specifies whether termination protection is enabled for the dashboard.
     *
     * If termination protection is enabled, you cannot delete the dashboard until termination
     * protection is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-terminationprotectionenabled)
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the dashboard. 
     */
    public fun terminationProtectionEnabled(terminationProtectionEnabled: Boolean)

    /**
     * Specifies whether termination protection is enabled for the dashboard.
     *
     * If termination protection is enabled, you cannot delete the dashboard until termination
     * protection is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-terminationprotectionenabled)
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the dashboard. 
     */
    public fun terminationProtectionEnabled(terminationProtectionEnabled: IResolvable)

    /**
     * An array of widgets for a custom dashboard. A custom dashboard can have a maximum of ten
     * widgets.
     *
     * You do not need to specify widgets for the Highlights dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-widgets)
     * @param widgets An array of widgets for a custom dashboard. A custom dashboard can have a
     * maximum of ten widgets. 
     */
    public fun widgets(widgets: IResolvable)

    /**
     * An array of widgets for a custom dashboard. A custom dashboard can have a maximum of ten
     * widgets.
     *
     * You do not need to specify widgets for the Highlights dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-widgets)
     * @param widgets An array of widgets for a custom dashboard. A custom dashboard can have a
     * maximum of ten widgets. 
     */
    public fun widgets(widgets: List<Any>)

    /**
     * An array of widgets for a custom dashboard. A custom dashboard can have a maximum of ten
     * widgets.
     *
     * You do not need to specify widgets for the Highlights dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-widgets)
     * @param widgets An array of widgets for a custom dashboard. A custom dashboard can have a
     * maximum of ten widgets. 
     */
    public fun widgets(vararg widgets: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.CfnDashboard.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnDashboard.Builder.create(scope, id)

    /**
     * The name of the dashboard. The name must be unique to your account.
     *
     * To create the Highlights dashboard, the name must be `AWSCloudTrail-Highlights` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-name)
     * @param name The name of the dashboard. The name must be unique to your account. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The schedule for a dashboard refresh.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-refreshschedule)
     * @param refreshSchedule The schedule for a dashboard refresh. 
     */
    override fun refreshSchedule(refreshSchedule: IResolvable) {
      cdkBuilder.refreshSchedule(refreshSchedule.let(IResolvable.Companion::unwrap))
    }

    /**
     * The schedule for a dashboard refresh.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-refreshschedule)
     * @param refreshSchedule The schedule for a dashboard refresh. 
     */
    override fun refreshSchedule(refreshSchedule: RefreshScheduleProperty) {
      cdkBuilder.refreshSchedule(refreshSchedule.let(RefreshScheduleProperty.Companion::unwrap))
    }

    /**
     * The schedule for a dashboard refresh.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-refreshschedule)
     * @param refreshSchedule The schedule for a dashboard refresh. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a46af98705326d017812c85ad0fdc3ff82c42b1f36a03f2fce34b7bd1f3f455")
    override fun refreshSchedule(refreshSchedule: RefreshScheduleProperty.Builder.() -> Unit): Unit
        = refreshSchedule(RefreshScheduleProperty(refreshSchedule))

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-tags)
     * @param tags A list of tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-tags)
     * @param tags A list of tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Specifies whether termination protection is enabled for the dashboard.
     *
     * If termination protection is enabled, you cannot delete the dashboard until termination
     * protection is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-terminationprotectionenabled)
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the dashboard. 
     */
    override fun terminationProtectionEnabled(terminationProtectionEnabled: Boolean) {
      cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled)
    }

    /**
     * Specifies whether termination protection is enabled for the dashboard.
     *
     * If termination protection is enabled, you cannot delete the dashboard until termination
     * protection is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-terminationprotectionenabled)
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     * the dashboard. 
     */
    override fun terminationProtectionEnabled(terminationProtectionEnabled: IResolvable) {
      cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * An array of widgets for a custom dashboard. A custom dashboard can have a maximum of ten
     * widgets.
     *
     * You do not need to specify widgets for the Highlights dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-widgets)
     * @param widgets An array of widgets for a custom dashboard. A custom dashboard can have a
     * maximum of ten widgets. 
     */
    override fun widgets(widgets: IResolvable) {
      cdkBuilder.widgets(widgets.let(IResolvable.Companion::unwrap))
    }

    /**
     * An array of widgets for a custom dashboard. A custom dashboard can have a maximum of ten
     * widgets.
     *
     * You do not need to specify widgets for the Highlights dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-widgets)
     * @param widgets An array of widgets for a custom dashboard. A custom dashboard can have a
     * maximum of ten widgets. 
     */
    override fun widgets(widgets: List<Any>) {
      cdkBuilder.widgets(widgets.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array of widgets for a custom dashboard. A custom dashboard can have a maximum of ten
     * widgets.
     *
     * You do not need to specify widgets for the Highlights dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-dashboard.html#cfn-cloudtrail-dashboard-widgets)
     * @param widgets An array of widgets for a custom dashboard. A custom dashboard can have a
     * maximum of ten widgets. 
     */
    override fun widgets(vararg widgets: Any): Unit = widgets(widgets.toList())

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnDashboard = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudtrail.CfnDashboard.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDashboard {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDashboard(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnDashboard):
        CfnDashboard = CfnDashboard(cdkObject)

    internal fun unwrap(wrapped: CfnDashboard):
        software.amazon.awscdk.services.cloudtrail.CfnDashboard = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudtrail.CfnDashboard
  }

  /**
   * Specifies the frequency for a dashboard refresh schedule.
   *
   * For a custom dashboard, you can schedule a refresh for every 1, 6, 12, or 24 hours, or every
   * day.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
   * FrequencyProperty frequencyProperty = FrequencyProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-frequency.html)
   */
  public interface FrequencyProperty {
    /**
     * The unit to use for the refresh.
     *
     * For custom dashboards, the unit can be `HOURS` or `DAYS` .
     *
     * For the Highlights dashboard, the `Unit` must be `HOURS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-frequency.html#cfn-cloudtrail-dashboard-frequency-unit)
     */
    public fun unit(): String

    /**
     * The value for the refresh schedule.
     *
     * For custom dashboards, the following values are valid when the unit is `HOURS` : `1` , `6` ,
     * `12` , `24`
     *
     * For custom dashboards, the only valid value when the unit is `DAYS` is `1` .
     *
     * For the Highlights dashboard, the `Value` must be `6` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-frequency.html#cfn-cloudtrail-dashboard-frequency-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [FrequencyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unit The unit to use for the refresh. 
       * For custom dashboards, the unit can be `HOURS` or `DAYS` .
       *
       * For the Highlights dashboard, the `Unit` must be `HOURS` .
       */
      public fun unit(unit: String)

      /**
       * @param value The value for the refresh schedule. 
       * For custom dashboards, the following values are valid when the unit is `HOURS` : `1` , `6`
       * , `12` , `24`
       *
       * For custom dashboards, the only valid value when the unit is `DAYS` is `1` .
       *
       * For the Highlights dashboard, the `Value` must be `6` .
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnDashboard.FrequencyProperty.Builder =
          software.amazon.awscdk.services.cloudtrail.CfnDashboard.FrequencyProperty.builder()

      /**
       * @param unit The unit to use for the refresh. 
       * For custom dashboards, the unit can be `HOURS` or `DAYS` .
       *
       * For the Highlights dashboard, the `Unit` must be `HOURS` .
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value The value for the refresh schedule. 
       * For custom dashboards, the following values are valid when the unit is `HOURS` : `1` , `6`
       * , `12` , `24`
       *
       * For custom dashboards, the only valid value when the unit is `DAYS` is `1` .
       *
       * For the Highlights dashboard, the `Value` must be `6` .
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.cloudtrail.CfnDashboard.FrequencyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudtrail.CfnDashboard.FrequencyProperty,
    ) : CdkObject(cdkObject),
        FrequencyProperty {
      /**
       * The unit to use for the refresh.
       *
       * For custom dashboards, the unit can be `HOURS` or `DAYS` .
       *
       * For the Highlights dashboard, the `Unit` must be `HOURS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-frequency.html#cfn-cloudtrail-dashboard-frequency-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()

      /**
       * The value for the refresh schedule.
       *
       * For custom dashboards, the following values are valid when the unit is `HOURS` : `1` , `6`
       * , `12` , `24`
       *
       * For custom dashboards, the only valid value when the unit is `DAYS` is `1` .
       *
       * For the Highlights dashboard, the `Value` must be `6` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-frequency.html#cfn-cloudtrail-dashboard-frequency-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FrequencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnDashboard.FrequencyProperty):
          FrequencyProperty = CdkObjectWrappers.wrap(cdkObject) as? FrequencyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrequencyProperty):
          software.amazon.awscdk.services.cloudtrail.CfnDashboard.FrequencyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnDashboard.FrequencyProperty
    }
  }

  /**
   * The schedule for a dashboard refresh.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
   * RefreshScheduleProperty refreshScheduleProperty = RefreshScheduleProperty.builder()
   * .frequency(FrequencyProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .status("status")
   * .timeOfDay("timeOfDay")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-refreshschedule.html)
   */
  public interface RefreshScheduleProperty {
    /**
     * The frequency at which you want the dashboard refreshed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-refreshschedule.html#cfn-cloudtrail-dashboard-refreshschedule-frequency)
     */
    public fun frequency(): Any? = unwrap(this).getFrequency()

    /**
     * Specifies whether the refresh schedule is enabled.
     *
     * Set the value to `ENABLED` to enable the refresh schedule, or to `DISABLED` to turn off the
     * refresh schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-refreshschedule.html#cfn-cloudtrail-dashboard-refreshschedule-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * The time of day in UTC to run the schedule;
     *
     * for hourly only refer to minutes; default is 00:00.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-refreshschedule.html#cfn-cloudtrail-dashboard-refreshschedule-timeofday)
     */
    public fun timeOfDay(): String? = unwrap(this).getTimeOfDay()

    /**
     * A builder for [RefreshScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param frequency The frequency at which you want the dashboard refreshed.
       */
      public fun frequency(frequency: IResolvable)

      /**
       * @param frequency The frequency at which you want the dashboard refreshed.
       */
      public fun frequency(frequency: FrequencyProperty)

      /**
       * @param frequency The frequency at which you want the dashboard refreshed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0340d11a6b330ae814a6c6c04fbd280a586e1e7cfe9766f139f9e0919b60f38f")
      public fun frequency(frequency: FrequencyProperty.Builder.() -> Unit)

      /**
       * @param status Specifies whether the refresh schedule is enabled.
       * Set the value to `ENABLED` to enable the refresh schedule, or to `DISABLED` to turn off the
       * refresh schedule.
       */
      public fun status(status: String)

      /**
       * @param timeOfDay The time of day in UTC to run the schedule;.
       * for hourly only refer to minutes; default is 00:00.
       */
      public fun timeOfDay(timeOfDay: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnDashboard.RefreshScheduleProperty.Builder =
          software.amazon.awscdk.services.cloudtrail.CfnDashboard.RefreshScheduleProperty.builder()

      /**
       * @param frequency The frequency at which you want the dashboard refreshed.
       */
      override fun frequency(frequency: IResolvable) {
        cdkBuilder.frequency(frequency.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param frequency The frequency at which you want the dashboard refreshed.
       */
      override fun frequency(frequency: FrequencyProperty) {
        cdkBuilder.frequency(frequency.let(FrequencyProperty.Companion::unwrap))
      }

      /**
       * @param frequency The frequency at which you want the dashboard refreshed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0340d11a6b330ae814a6c6c04fbd280a586e1e7cfe9766f139f9e0919b60f38f")
      override fun frequency(frequency: FrequencyProperty.Builder.() -> Unit): Unit =
          frequency(FrequencyProperty(frequency))

      /**
       * @param status Specifies whether the refresh schedule is enabled.
       * Set the value to `ENABLED` to enable the refresh schedule, or to `DISABLED` to turn off the
       * refresh schedule.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param timeOfDay The time of day in UTC to run the schedule;.
       * for hourly only refer to minutes; default is 00:00.
       */
      override fun timeOfDay(timeOfDay: String) {
        cdkBuilder.timeOfDay(timeOfDay)
      }

      public fun build():
          software.amazon.awscdk.services.cloudtrail.CfnDashboard.RefreshScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudtrail.CfnDashboard.RefreshScheduleProperty,
    ) : CdkObject(cdkObject),
        RefreshScheduleProperty {
      /**
       * The frequency at which you want the dashboard refreshed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-refreshschedule.html#cfn-cloudtrail-dashboard-refreshschedule-frequency)
       */
      override fun frequency(): Any? = unwrap(this).getFrequency()

      /**
       * Specifies whether the refresh schedule is enabled.
       *
       * Set the value to `ENABLED` to enable the refresh schedule, or to `DISABLED` to turn off the
       * refresh schedule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-refreshschedule.html#cfn-cloudtrail-dashboard-refreshschedule-status)
       */
      override fun status(): String? = unwrap(this).getStatus()

      /**
       * The time of day in UTC to run the schedule;
       *
       * for hourly only refer to minutes; default is 00:00.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-refreshschedule.html#cfn-cloudtrail-dashboard-refreshschedule-timeofday)
       */
      override fun timeOfDay(): String? = unwrap(this).getTimeOfDay()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RefreshScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnDashboard.RefreshScheduleProperty):
          RefreshScheduleProperty = CdkObjectWrappers.wrap(cdkObject) as? RefreshScheduleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RefreshScheduleProperty):
          software.amazon.awscdk.services.cloudtrail.CfnDashboard.RefreshScheduleProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnDashboard.RefreshScheduleProperty
    }
  }

  /**
   * Contains information about a widget on a CloudTrail Lake dashboard.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
   * WidgetProperty widgetProperty = WidgetProperty.builder()
   * .queryStatement("queryStatement")
   * // the properties below are optional
   * .queryParameters(List.of("queryParameters"))
   * .viewProperties(Map.of(
   * "viewPropertiesKey", "viewProperties"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-widget.html)
   */
  public interface WidgetProperty {
    /**
     * The optional query parameters.
     *
     * The following query parameters are valid: `$StartTime$` , `$EndTime$` , and `$Period$` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-widget.html#cfn-cloudtrail-dashboard-widget-queryparameters)
     */
    public fun queryParameters(): List<String> = unwrap(this).getQueryParameters() ?: emptyList()

    /**
     * The query statement for the widget.
     *
     * For custom dashboard widgets, you can query across multiple event data stores as long as all
     * event data stores exist in your account.
     *
     *
     * When a query uses `?` with `eventTime` , `?` must be surrounded by single quotes as follows:
     * `'?'` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-widget.html#cfn-cloudtrail-dashboard-widget-querystatement)
     */
    public fun queryStatement(): String

    /**
     * The view properties for the widget.
     *
     * For more information about view properties, see [View properties for
     * widgets](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-widget-properties.html)
     * in the *AWS CloudTrail User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-widget.html#cfn-cloudtrail-dashboard-widget-viewproperties)
     */
    public fun viewProperties(): Any? = unwrap(this).getViewProperties()

    /**
     * A builder for [WidgetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param queryParameters The optional query parameters.
       * The following query parameters are valid: `$StartTime$` , `$EndTime$` , and `$Period$` .
       */
      public fun queryParameters(queryParameters: List<String>)

      /**
       * @param queryParameters The optional query parameters.
       * The following query parameters are valid: `$StartTime$` , `$EndTime$` , and `$Period$` .
       */
      public fun queryParameters(vararg queryParameters: String)

      /**
       * @param queryStatement The query statement for the widget. 
       * For custom dashboard widgets, you can query across multiple event data stores as long as
       * all event data stores exist in your account.
       *
       *
       * When a query uses `?` with `eventTime` , `?` must be surrounded by single quotes as
       * follows: `'?'` .
       */
      public fun queryStatement(queryStatement: String)

      /**
       * @param viewProperties The view properties for the widget.
       * For more information about view properties, see [View properties for
       * widgets](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-widget-properties.html)
       * in the *AWS CloudTrail User Guide* .
       */
      public fun viewProperties(viewProperties: IResolvable)

      /**
       * @param viewProperties The view properties for the widget.
       * For more information about view properties, see [View properties for
       * widgets](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-widget-properties.html)
       * in the *AWS CloudTrail User Guide* .
       */
      public fun viewProperties(viewProperties: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnDashboard.WidgetProperty.Builder =
          software.amazon.awscdk.services.cloudtrail.CfnDashboard.WidgetProperty.builder()

      /**
       * @param queryParameters The optional query parameters.
       * The following query parameters are valid: `$StartTime$` , `$EndTime$` , and `$Period$` .
       */
      override fun queryParameters(queryParameters: List<String>) {
        cdkBuilder.queryParameters(queryParameters)
      }

      /**
       * @param queryParameters The optional query parameters.
       * The following query parameters are valid: `$StartTime$` , `$EndTime$` , and `$Period$` .
       */
      override fun queryParameters(vararg queryParameters: String): Unit =
          queryParameters(queryParameters.toList())

      /**
       * @param queryStatement The query statement for the widget. 
       * For custom dashboard widgets, you can query across multiple event data stores as long as
       * all event data stores exist in your account.
       *
       *
       * When a query uses `?` with `eventTime` , `?` must be surrounded by single quotes as
       * follows: `'?'` .
       */
      override fun queryStatement(queryStatement: String) {
        cdkBuilder.queryStatement(queryStatement)
      }

      /**
       * @param viewProperties The view properties for the widget.
       * For more information about view properties, see [View properties for
       * widgets](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-widget-properties.html)
       * in the *AWS CloudTrail User Guide* .
       */
      override fun viewProperties(viewProperties: IResolvable) {
        cdkBuilder.viewProperties(viewProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param viewProperties The view properties for the widget.
       * For more information about view properties, see [View properties for
       * widgets](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-widget-properties.html)
       * in the *AWS CloudTrail User Guide* .
       */
      override fun viewProperties(viewProperties: Map<String, String>) {
        cdkBuilder.viewProperties(viewProperties)
      }

      public fun build(): software.amazon.awscdk.services.cloudtrail.CfnDashboard.WidgetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudtrail.CfnDashboard.WidgetProperty,
    ) : CdkObject(cdkObject),
        WidgetProperty {
      /**
       * The optional query parameters.
       *
       * The following query parameters are valid: `$StartTime$` , `$EndTime$` , and `$Period$` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-widget.html#cfn-cloudtrail-dashboard-widget-queryparameters)
       */
      override fun queryParameters(): List<String> = unwrap(this).getQueryParameters() ?:
          emptyList()

      /**
       * The query statement for the widget.
       *
       * For custom dashboard widgets, you can query across multiple event data stores as long as
       * all event data stores exist in your account.
       *
       *
       * When a query uses `?` with `eventTime` , `?` must be surrounded by single quotes as
       * follows: `'?'` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-widget.html#cfn-cloudtrail-dashboard-widget-querystatement)
       */
      override fun queryStatement(): String = unwrap(this).getQueryStatement()

      /**
       * The view properties for the widget.
       *
       * For more information about view properties, see [View properties for
       * widgets](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/lake-widget-properties.html)
       * in the *AWS CloudTrail User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-dashboard-widget.html#cfn-cloudtrail-dashboard-widget-viewproperties)
       */
      override fun viewProperties(): Any? = unwrap(this).getViewProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WidgetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnDashboard.WidgetProperty):
          WidgetProperty = CdkObjectWrappers.wrap(cdkObject) as? WidgetProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: WidgetProperty):
          software.amazon.awscdk.services.cloudtrail.CfnDashboard.WidgetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnDashboard.WidgetProperty
    }
  }
}
