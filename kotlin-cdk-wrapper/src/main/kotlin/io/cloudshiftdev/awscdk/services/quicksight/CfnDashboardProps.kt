@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
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
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html)
 */
public interface CfnDashboardProps {
  /**
   * The ID of the AWS account where you want to create the dashboard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-awsaccountid)
   */
  public fun awsAccountId(): String

  /**
   * The ID for the dashboard, also added to the IAM policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-dashboardid)
   */
  public fun dashboardId(): String

  /**
   * Options for publishing the dashboard when you create it:.
   *
   * * `AvailabilityStatus` for `AdHocFilteringOption` - This status can be either `ENABLED` or
   * `DISABLED` . When this is set to `DISABLED` , Amazon QuickSight disables the left filter pane on
   * the published dashboard, which can be used for ad hoc (one-time) filtering. This option is
   * `ENABLED` by default.
   * * `AvailabilityStatus` for `ExportToCSVOption` - This status can be either `ENABLED` or
   * `DISABLED` . The visual option to export data to .CSV format isn't enabled when this is set to
   * `DISABLED` . This option is `ENABLED` by default.
   * * `VisibilityState` for `SheetControlsOption` - This visibility state can be either `COLLAPSED`
   * or `EXPANDED` . This option is `COLLAPSED` by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-dashboardpublishoptions)
   */
  public fun dashboardPublishOptions(): Any? = unwrap(this).getDashboardPublishOptions()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-definition)
   */
  public fun definition(): Any? = unwrap(this).getDefinition()

  /**
   * A list of analysis Amazon Resource Names (ARNs) to be linked to the dashboard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-linkentities)
   */
  public fun linkEntities(): List<String> = unwrap(this).getLinkEntities() ?: emptyList()

  /**
   * A structure that contains the link sharing configurations that you want to apply overrides to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-linksharingconfiguration)
   */
  public fun linkSharingConfiguration(): Any? = unwrap(this).getLinkSharingConfiguration()

  /**
   * The display name of the dashboard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-name)
   */
  public fun name(): String

  /**
   * The parameters for the creation of the dashboard, which you want to use to override the default
   * settings.
   *
   * A dashboard can have any type of parameters, and some parameters might accept multiple values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * A structure that contains the permissions of the dashboard.
   *
   * You can use this structure for granting permissions by providing a list of IAM action
   * information for each principal ARN.
   *
   * To specify no permissions, omit the permissions list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-permissions)
   */
  public fun permissions(): Any? = unwrap(this).getPermissions()

  /**
   * The entity that you are using as a source when you create the dashboard.
   *
   * In `SourceEntity` , you specify the type of object that you want to use. You can only create a
   * dashboard from a template, so you use a `SourceTemplate` entity. If you need to create a dashboard
   * from an analysis, first convert the analysis to a template by using the `CreateTemplate` API
   * operation. For `SourceTemplate` , specify the Amazon Resource Name (ARN) of the source template.
   * The `SourceTemplate` ARN can contain any AWS account; and any QuickSight-supported AWS Region .
   *
   * Use the `DataSetReferences` entity within `SourceTemplate` to list the replacement datasets for
   * the placeholders listed in the original. The schema in each dataset must match its placeholder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-sourceentity)
   */
  public fun sourceEntity(): Any? = unwrap(this).getSourceEntity()

  /**
   * Contains a map of the key-value pairs for the resource tag or tags assigned to the dashboard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) of the theme that is being used for this dashboard.
   *
   * If you add a value for this field, it overrides the value that is used in the source entity.
   * The theme ARN must exist in the same AWS account where you create the dashboard.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-themearn)
   */
  public fun themeArn(): String? = unwrap(this).getThemeArn()

  /**
   * The option to relax the validation that is required to create and update analyses, dashboards,
   * and templates with definition objects.
   *
   * When you set this value to `LENIENT` , validation is skipped for specific errors.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-validationstrategy)
   */
  public fun validationStrategy(): Any? = unwrap(this).getValidationStrategy()

  /**
   * A description for the first version of the dashboard being created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-versiondescription)
   */
  public fun versionDescription(): String? = unwrap(this).getVersionDescription()

  /**
   * A builder for [CfnDashboardProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param awsAccountId The ID of the AWS account where you want to create the dashboard. 
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * @param dashboardId The ID for the dashboard, also added to the IAM policy. 
     */
    public fun dashboardId(dashboardId: String)

    /**
     * @param dashboardPublishOptions Options for publishing the dashboard when you create it:.
     * * `AvailabilityStatus` for `AdHocFilteringOption` - This status can be either `ENABLED` or
     * `DISABLED` . When this is set to `DISABLED` , Amazon QuickSight disables the left filter pane on
     * the published dashboard, which can be used for ad hoc (one-time) filtering. This option is
     * `ENABLED` by default.
     * * `AvailabilityStatus` for `ExportToCSVOption` - This status can be either `ENABLED` or
     * `DISABLED` . The visual option to export data to .CSV format isn't enabled when this is set to
     * `DISABLED` . This option is `ENABLED` by default.
     * * `VisibilityState` for `SheetControlsOption` - This visibility state can be either
     * `COLLAPSED` or `EXPANDED` . This option is `COLLAPSED` by default.
     */
    public fun dashboardPublishOptions(dashboardPublishOptions: IResolvable)

    /**
     * @param dashboardPublishOptions Options for publishing the dashboard when you create it:.
     * * `AvailabilityStatus` for `AdHocFilteringOption` - This status can be either `ENABLED` or
     * `DISABLED` . When this is set to `DISABLED` , Amazon QuickSight disables the left filter pane on
     * the published dashboard, which can be used for ad hoc (one-time) filtering. This option is
     * `ENABLED` by default.
     * * `AvailabilityStatus` for `ExportToCSVOption` - This status can be either `ENABLED` or
     * `DISABLED` . The visual option to export data to .CSV format isn't enabled when this is set to
     * `DISABLED` . This option is `ENABLED` by default.
     * * `VisibilityState` for `SheetControlsOption` - This visibility state can be either
     * `COLLAPSED` or `EXPANDED` . This option is `COLLAPSED` by default.
     */
    public
        fun dashboardPublishOptions(dashboardPublishOptions: CfnDashboard.DashboardPublishOptionsProperty)

    /**
     * @param dashboardPublishOptions Options for publishing the dashboard when you create it:.
     * * `AvailabilityStatus` for `AdHocFilteringOption` - This status can be either `ENABLED` or
     * `DISABLED` . When this is set to `DISABLED` , Amazon QuickSight disables the left filter pane on
     * the published dashboard, which can be used for ad hoc (one-time) filtering. This option is
     * `ENABLED` by default.
     * * `AvailabilityStatus` for `ExportToCSVOption` - This status can be either `ENABLED` or
     * `DISABLED` . The visual option to export data to .CSV format isn't enabled when this is set to
     * `DISABLED` . This option is `ENABLED` by default.
     * * `VisibilityState` for `SheetControlsOption` - This visibility state can be either
     * `COLLAPSED` or `EXPANDED` . This option is `COLLAPSED` by default.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("521cad66b24475f3536f61a35cce1e0730b9e30cbff100ce4afbb15a2c80f675")
    public
        fun dashboardPublishOptions(dashboardPublishOptions: CfnDashboard.DashboardPublishOptionsProperty.Builder.() -> Unit)

    /**
     * @param definition the value to be set.
     */
    public fun definition(definition: IResolvable)

    /**
     * @param definition the value to be set.
     */
    public fun definition(definition: CfnDashboard.DashboardVersionDefinitionProperty)

    /**
     * @param definition the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0da9f3df5a8b6b57eb07e620534257232bd91095386fbebfd357f7eab1b2a8e")
    public
        fun definition(definition: CfnDashboard.DashboardVersionDefinitionProperty.Builder.() -> Unit)

    /**
     * @param linkEntities A list of analysis Amazon Resource Names (ARNs) to be linked to the
     * dashboard.
     */
    public fun linkEntities(linkEntities: List<String>)

    /**
     * @param linkEntities A list of analysis Amazon Resource Names (ARNs) to be linked to the
     * dashboard.
     */
    public fun linkEntities(vararg linkEntities: String)

    /**
     * @param linkSharingConfiguration A structure that contains the link sharing configurations
     * that you want to apply overrides to.
     */
    public fun linkSharingConfiguration(linkSharingConfiguration: IResolvable)

    /**
     * @param linkSharingConfiguration A structure that contains the link sharing configurations
     * that you want to apply overrides to.
     */
    public
        fun linkSharingConfiguration(linkSharingConfiguration: CfnDashboard.LinkSharingConfigurationProperty)

    /**
     * @param linkSharingConfiguration A structure that contains the link sharing configurations
     * that you want to apply overrides to.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e13a7efac4d32ed39e805135181c2462719ba38882ab71120be719f532de30bb")
    public
        fun linkSharingConfiguration(linkSharingConfiguration: CfnDashboard.LinkSharingConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name The display name of the dashboard. 
     */
    public fun name(name: String)

    /**
     * @param parameters The parameters for the creation of the dashboard, which you want to use to
     * override the default settings.
     * A dashboard can have any type of parameters, and some parameters might accept multiple
     * values.
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters The parameters for the creation of the dashboard, which you want to use to
     * override the default settings.
     * A dashboard can have any type of parameters, and some parameters might accept multiple
     * values.
     */
    public fun parameters(parameters: CfnDashboard.ParametersProperty)

    /**
     * @param parameters The parameters for the creation of the dashboard, which you want to use to
     * override the default settings.
     * A dashboard can have any type of parameters, and some parameters might accept multiple
     * values.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21550b4298c987419e492e58bf3138d109f919229d2151e5a190cf76f6454438")
    public fun parameters(parameters: CfnDashboard.ParametersProperty.Builder.() -> Unit)

    /**
     * @param permissions A structure that contains the permissions of the dashboard.
     * You can use this structure for granting permissions by providing a list of IAM action
     * information for each principal ARN.
     *
     * To specify no permissions, omit the permissions list.
     */
    public fun permissions(permissions: IResolvable)

    /**
     * @param permissions A structure that contains the permissions of the dashboard.
     * You can use this structure for granting permissions by providing a list of IAM action
     * information for each principal ARN.
     *
     * To specify no permissions, omit the permissions list.
     */
    public fun permissions(permissions: List<Any>)

    /**
     * @param permissions A structure that contains the permissions of the dashboard.
     * You can use this structure for granting permissions by providing a list of IAM action
     * information for each principal ARN.
     *
     * To specify no permissions, omit the permissions list.
     */
    public fun permissions(vararg permissions: Any)

    /**
     * @param sourceEntity The entity that you are using as a source when you create the dashboard.
     * In `SourceEntity` , you specify the type of object that you want to use. You can only create
     * a dashboard from a template, so you use a `SourceTemplate` entity. If you need to create a
     * dashboard from an analysis, first convert the analysis to a template by using the
     * `CreateTemplate` API operation. For `SourceTemplate` , specify the Amazon Resource Name (ARN) of
     * the source template. The `SourceTemplate` ARN can contain any AWS account; and any
     * QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` to list the replacement datasets
     * for the placeholders listed in the original. The schema in each dataset must match its
     * placeholder.
     */
    public fun sourceEntity(sourceEntity: IResolvable)

    /**
     * @param sourceEntity The entity that you are using as a source when you create the dashboard.
     * In `SourceEntity` , you specify the type of object that you want to use. You can only create
     * a dashboard from a template, so you use a `SourceTemplate` entity. If you need to create a
     * dashboard from an analysis, first convert the analysis to a template by using the
     * `CreateTemplate` API operation. For `SourceTemplate` , specify the Amazon Resource Name (ARN) of
     * the source template. The `SourceTemplate` ARN can contain any AWS account; and any
     * QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` to list the replacement datasets
     * for the placeholders listed in the original. The schema in each dataset must match its
     * placeholder.
     */
    public fun sourceEntity(sourceEntity: CfnDashboard.DashboardSourceEntityProperty)

    /**
     * @param sourceEntity The entity that you are using as a source when you create the dashboard.
     * In `SourceEntity` , you specify the type of object that you want to use. You can only create
     * a dashboard from a template, so you use a `SourceTemplate` entity. If you need to create a
     * dashboard from an analysis, first convert the analysis to a template by using the
     * `CreateTemplate` API operation. For `SourceTemplate` , specify the Amazon Resource Name (ARN) of
     * the source template. The `SourceTemplate` ARN can contain any AWS account; and any
     * QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` to list the replacement datasets
     * for the placeholders listed in the original. The schema in each dataset must match its
     * placeholder.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06d6d1985526f583875a7e1e9cef738e944ac695f97729117b8404af6a960e75")
    public
        fun sourceEntity(sourceEntity: CfnDashboard.DashboardSourceEntityProperty.Builder.() -> Unit)

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the dashboard.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the dashboard.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param themeArn The Amazon Resource Name (ARN) of the theme that is being used for this
     * dashboard.
     * If you add a value for this field, it overrides the value that is used in the source entity.
     * The theme ARN must exist in the same AWS account where you create the dashboard.
     */
    public fun themeArn(themeArn: String)

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    public fun validationStrategy(validationStrategy: IResolvable)

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    public fun validationStrategy(validationStrategy: CfnDashboard.ValidationStrategyProperty)

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("110e591738244c24664cf30e12c1a198588010ab6c0e466ab85c7ff75132646f")
    public
        fun validationStrategy(validationStrategy: CfnDashboard.ValidationStrategyProperty.Builder.() -> Unit)

    /**
     * @param versionDescription A description for the first version of the dashboard being created.
     */
    public fun versionDescription(versionDescription: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnDashboardProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnDashboardProps.builder()

    /**
     * @param awsAccountId The ID of the AWS account where you want to create the dashboard. 
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * @param dashboardId The ID for the dashboard, also added to the IAM policy. 
     */
    override fun dashboardId(dashboardId: String) {
      cdkBuilder.dashboardId(dashboardId)
    }

    /**
     * @param dashboardPublishOptions Options for publishing the dashboard when you create it:.
     * * `AvailabilityStatus` for `AdHocFilteringOption` - This status can be either `ENABLED` or
     * `DISABLED` . When this is set to `DISABLED` , Amazon QuickSight disables the left filter pane on
     * the published dashboard, which can be used for ad hoc (one-time) filtering. This option is
     * `ENABLED` by default.
     * * `AvailabilityStatus` for `ExportToCSVOption` - This status can be either `ENABLED` or
     * `DISABLED` . The visual option to export data to .CSV format isn't enabled when this is set to
     * `DISABLED` . This option is `ENABLED` by default.
     * * `VisibilityState` for `SheetControlsOption` - This visibility state can be either
     * `COLLAPSED` or `EXPANDED` . This option is `COLLAPSED` by default.
     */
    override fun dashboardPublishOptions(dashboardPublishOptions: IResolvable) {
      cdkBuilder.dashboardPublishOptions(dashboardPublishOptions.let(IResolvable::unwrap))
    }

    /**
     * @param dashboardPublishOptions Options for publishing the dashboard when you create it:.
     * * `AvailabilityStatus` for `AdHocFilteringOption` - This status can be either `ENABLED` or
     * `DISABLED` . When this is set to `DISABLED` , Amazon QuickSight disables the left filter pane on
     * the published dashboard, which can be used for ad hoc (one-time) filtering. This option is
     * `ENABLED` by default.
     * * `AvailabilityStatus` for `ExportToCSVOption` - This status can be either `ENABLED` or
     * `DISABLED` . The visual option to export data to .CSV format isn't enabled when this is set to
     * `DISABLED` . This option is `ENABLED` by default.
     * * `VisibilityState` for `SheetControlsOption` - This visibility state can be either
     * `COLLAPSED` or `EXPANDED` . This option is `COLLAPSED` by default.
     */
    override
        fun dashboardPublishOptions(dashboardPublishOptions: CfnDashboard.DashboardPublishOptionsProperty) {
      cdkBuilder.dashboardPublishOptions(dashboardPublishOptions.let(CfnDashboard.DashboardPublishOptionsProperty::unwrap))
    }

    /**
     * @param dashboardPublishOptions Options for publishing the dashboard when you create it:.
     * * `AvailabilityStatus` for `AdHocFilteringOption` - This status can be either `ENABLED` or
     * `DISABLED` . When this is set to `DISABLED` , Amazon QuickSight disables the left filter pane on
     * the published dashboard, which can be used for ad hoc (one-time) filtering. This option is
     * `ENABLED` by default.
     * * `AvailabilityStatus` for `ExportToCSVOption` - This status can be either `ENABLED` or
     * `DISABLED` . The visual option to export data to .CSV format isn't enabled when this is set to
     * `DISABLED` . This option is `ENABLED` by default.
     * * `VisibilityState` for `SheetControlsOption` - This visibility state can be either
     * `COLLAPSED` or `EXPANDED` . This option is `COLLAPSED` by default.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("521cad66b24475f3536f61a35cce1e0730b9e30cbff100ce4afbb15a2c80f675")
    override
        fun dashboardPublishOptions(dashboardPublishOptions: CfnDashboard.DashboardPublishOptionsProperty.Builder.() -> Unit):
        Unit =
        dashboardPublishOptions(CfnDashboard.DashboardPublishOptionsProperty(dashboardPublishOptions))

    /**
     * @param definition the value to be set.
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    /**
     * @param definition the value to be set.
     */
    override fun definition(definition: CfnDashboard.DashboardVersionDefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnDashboard.DashboardVersionDefinitionProperty::unwrap))
    }

    /**
     * @param definition the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0da9f3df5a8b6b57eb07e620534257232bd91095386fbebfd357f7eab1b2a8e")
    override
        fun definition(definition: CfnDashboard.DashboardVersionDefinitionProperty.Builder.() -> Unit):
        Unit = definition(CfnDashboard.DashboardVersionDefinitionProperty(definition))

    /**
     * @param linkEntities A list of analysis Amazon Resource Names (ARNs) to be linked to the
     * dashboard.
     */
    override fun linkEntities(linkEntities: List<String>) {
      cdkBuilder.linkEntities(linkEntities)
    }

    /**
     * @param linkEntities A list of analysis Amazon Resource Names (ARNs) to be linked to the
     * dashboard.
     */
    override fun linkEntities(vararg linkEntities: String): Unit =
        linkEntities(linkEntities.toList())

    /**
     * @param linkSharingConfiguration A structure that contains the link sharing configurations
     * that you want to apply overrides to.
     */
    override fun linkSharingConfiguration(linkSharingConfiguration: IResolvable) {
      cdkBuilder.linkSharingConfiguration(linkSharingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param linkSharingConfiguration A structure that contains the link sharing configurations
     * that you want to apply overrides to.
     */
    override
        fun linkSharingConfiguration(linkSharingConfiguration: CfnDashboard.LinkSharingConfigurationProperty) {
      cdkBuilder.linkSharingConfiguration(linkSharingConfiguration.let(CfnDashboard.LinkSharingConfigurationProperty::unwrap))
    }

    /**
     * @param linkSharingConfiguration A structure that contains the link sharing configurations
     * that you want to apply overrides to.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e13a7efac4d32ed39e805135181c2462719ba38882ab71120be719f532de30bb")
    override
        fun linkSharingConfiguration(linkSharingConfiguration: CfnDashboard.LinkSharingConfigurationProperty.Builder.() -> Unit):
        Unit =
        linkSharingConfiguration(CfnDashboard.LinkSharingConfigurationProperty(linkSharingConfiguration))

    /**
     * @param name The display name of the dashboard. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parameters The parameters for the creation of the dashboard, which you want to use to
     * override the default settings.
     * A dashboard can have any type of parameters, and some parameters might accept multiple
     * values.
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    /**
     * @param parameters The parameters for the creation of the dashboard, which you want to use to
     * override the default settings.
     * A dashboard can have any type of parameters, and some parameters might accept multiple
     * values.
     */
    override fun parameters(parameters: CfnDashboard.ParametersProperty) {
      cdkBuilder.parameters(parameters.let(CfnDashboard.ParametersProperty::unwrap))
    }

    /**
     * @param parameters The parameters for the creation of the dashboard, which you want to use to
     * override the default settings.
     * A dashboard can have any type of parameters, and some parameters might accept multiple
     * values.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21550b4298c987419e492e58bf3138d109f919229d2151e5a190cf76f6454438")
    override fun parameters(parameters: CfnDashboard.ParametersProperty.Builder.() -> Unit): Unit =
        parameters(CfnDashboard.ParametersProperty(parameters))

    /**
     * @param permissions A structure that contains the permissions of the dashboard.
     * You can use this structure for granting permissions by providing a list of IAM action
     * information for each principal ARN.
     *
     * To specify no permissions, omit the permissions list.
     */
    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable::unwrap))
    }

    /**
     * @param permissions A structure that contains the permissions of the dashboard.
     * You can use this structure for granting permissions by providing a list of IAM action
     * information for each principal ARN.
     *
     * To specify no permissions, omit the permissions list.
     */
    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param permissions A structure that contains the permissions of the dashboard.
     * You can use this structure for granting permissions by providing a list of IAM action
     * information for each principal ARN.
     *
     * To specify no permissions, omit the permissions list.
     */
    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    /**
     * @param sourceEntity The entity that you are using as a source when you create the dashboard.
     * In `SourceEntity` , you specify the type of object that you want to use. You can only create
     * a dashboard from a template, so you use a `SourceTemplate` entity. If you need to create a
     * dashboard from an analysis, first convert the analysis to a template by using the
     * `CreateTemplate` API operation. For `SourceTemplate` , specify the Amazon Resource Name (ARN) of
     * the source template. The `SourceTemplate` ARN can contain any AWS account; and any
     * QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` to list the replacement datasets
     * for the placeholders listed in the original. The schema in each dataset must match its
     * placeholder.
     */
    override fun sourceEntity(sourceEntity: IResolvable) {
      cdkBuilder.sourceEntity(sourceEntity.let(IResolvable::unwrap))
    }

    /**
     * @param sourceEntity The entity that you are using as a source when you create the dashboard.
     * In `SourceEntity` , you specify the type of object that you want to use. You can only create
     * a dashboard from a template, so you use a `SourceTemplate` entity. If you need to create a
     * dashboard from an analysis, first convert the analysis to a template by using the
     * `CreateTemplate` API operation. For `SourceTemplate` , specify the Amazon Resource Name (ARN) of
     * the source template. The `SourceTemplate` ARN can contain any AWS account; and any
     * QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` to list the replacement datasets
     * for the placeholders listed in the original. The schema in each dataset must match its
     * placeholder.
     */
    override fun sourceEntity(sourceEntity: CfnDashboard.DashboardSourceEntityProperty) {
      cdkBuilder.sourceEntity(sourceEntity.let(CfnDashboard.DashboardSourceEntityProperty::unwrap))
    }

    /**
     * @param sourceEntity The entity that you are using as a source when you create the dashboard.
     * In `SourceEntity` , you specify the type of object that you want to use. You can only create
     * a dashboard from a template, so you use a `SourceTemplate` entity. If you need to create a
     * dashboard from an analysis, first convert the analysis to a template by using the
     * `CreateTemplate` API operation. For `SourceTemplate` , specify the Amazon Resource Name (ARN) of
     * the source template. The `SourceTemplate` ARN can contain any AWS account; and any
     * QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` to list the replacement datasets
     * for the placeholders listed in the original. The schema in each dataset must match its
     * placeholder.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06d6d1985526f583875a7e1e9cef738e944ac695f97729117b8404af6a960e75")
    override
        fun sourceEntity(sourceEntity: CfnDashboard.DashboardSourceEntityProperty.Builder.() -> Unit):
        Unit = sourceEntity(CfnDashboard.DashboardSourceEntityProperty(sourceEntity))

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the dashboard.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     * the dashboard.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param themeArn The Amazon Resource Name (ARN) of the theme that is being used for this
     * dashboard.
     * If you add a value for this field, it overrides the value that is used in the source entity.
     * The theme ARN must exist in the same AWS account where you create the dashboard.
     */
    override fun themeArn(themeArn: String) {
      cdkBuilder.themeArn(themeArn)
    }

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    override fun validationStrategy(validationStrategy: IResolvable) {
      cdkBuilder.validationStrategy(validationStrategy.let(IResolvable::unwrap))
    }

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    override fun validationStrategy(validationStrategy: CfnDashboard.ValidationStrategyProperty) {
      cdkBuilder.validationStrategy(validationStrategy.let(CfnDashboard.ValidationStrategyProperty::unwrap))
    }

    /**
     * @param validationStrategy The option to relax the validation that is required to create and
     * update analyses, dashboards, and templates with definition objects.
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("110e591738244c24664cf30e12c1a198588010ab6c0e466ab85c7ff75132646f")
    override
        fun validationStrategy(validationStrategy: CfnDashboard.ValidationStrategyProperty.Builder.() -> Unit):
        Unit = validationStrategy(CfnDashboard.ValidationStrategyProperty(validationStrategy))

    /**
     * @param versionDescription A description for the first version of the dashboard being created.
     */
    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnDashboardProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.quicksight.CfnDashboardProps,
  ) : CdkObject(cdkObject), CfnDashboardProps {
    /**
     * The ID of the AWS account where you want to create the dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-awsaccountid)
     */
    override fun awsAccountId(): String = unwrap(this).getAwsAccountId()

    /**
     * The ID for the dashboard, also added to the IAM policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-dashboardid)
     */
    override fun dashboardId(): String = unwrap(this).getDashboardId()

    /**
     * Options for publishing the dashboard when you create it:.
     *
     * * `AvailabilityStatus` for `AdHocFilteringOption` - This status can be either `ENABLED` or
     * `DISABLED` . When this is set to `DISABLED` , Amazon QuickSight disables the left filter pane on
     * the published dashboard, which can be used for ad hoc (one-time) filtering. This option is
     * `ENABLED` by default.
     * * `AvailabilityStatus` for `ExportToCSVOption` - This status can be either `ENABLED` or
     * `DISABLED` . The visual option to export data to .CSV format isn't enabled when this is set to
     * `DISABLED` . This option is `ENABLED` by default.
     * * `VisibilityState` for `SheetControlsOption` - This visibility state can be either
     * `COLLAPSED` or `EXPANDED` . This option is `COLLAPSED` by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-dashboardpublishoptions)
     */
    override fun dashboardPublishOptions(): Any? = unwrap(this).getDashboardPublishOptions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-definition)
     */
    override fun definition(): Any? = unwrap(this).getDefinition()

    /**
     * A list of analysis Amazon Resource Names (ARNs) to be linked to the dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-linkentities)
     */
    override fun linkEntities(): List<String> = unwrap(this).getLinkEntities() ?: emptyList()

    /**
     * A structure that contains the link sharing configurations that you want to apply overrides
     * to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-linksharingconfiguration)
     */
    override fun linkSharingConfiguration(): Any? = unwrap(this).getLinkSharingConfiguration()

    /**
     * The display name of the dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The parameters for the creation of the dashboard, which you want to use to override the
     * default settings.
     *
     * A dashboard can have any type of parameters, and some parameters might accept multiple
     * values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * A structure that contains the permissions of the dashboard.
     *
     * You can use this structure for granting permissions by providing a list of IAM action
     * information for each principal ARN.
     *
     * To specify no permissions, omit the permissions list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-permissions)
     */
    override fun permissions(): Any? = unwrap(this).getPermissions()

    /**
     * The entity that you are using as a source when you create the dashboard.
     *
     * In `SourceEntity` , you specify the type of object that you want to use. You can only create
     * a dashboard from a template, so you use a `SourceTemplate` entity. If you need to create a
     * dashboard from an analysis, first convert the analysis to a template by using the
     * `CreateTemplate` API operation. For `SourceTemplate` , specify the Amazon Resource Name (ARN) of
     * the source template. The `SourceTemplate` ARN can contain any AWS account; and any
     * QuickSight-supported AWS Region .
     *
     * Use the `DataSetReferences` entity within `SourceTemplate` to list the replacement datasets
     * for the placeholders listed in the original. The schema in each dataset must match its
     * placeholder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-sourceentity)
     */
    override fun sourceEntity(): Any? = unwrap(this).getSourceEntity()

    /**
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the theme that is being used for this dashboard.
     *
     * If you add a value for this field, it overrides the value that is used in the source entity.
     * The theme ARN must exist in the same AWS account where you create the dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-themearn)
     */
    override fun themeArn(): String? = unwrap(this).getThemeArn()

    /**
     * The option to relax the validation that is required to create and update analyses,
     * dashboards, and templates with definition objects.
     *
     * When you set this value to `LENIENT` , validation is skipped for specific errors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-validationstrategy)
     */
    override fun validationStrategy(): Any? = unwrap(this).getValidationStrategy()

    /**
     * A description for the first version of the dashboard being created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-dashboard.html#cfn-quicksight-dashboard-versiondescription)
     */
    override fun versionDescription(): String? = unwrap(this).getVersionDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDashboardProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDashboardProps):
        CfnDashboardProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDashboardProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDashboardProps):
        software.amazon.awscdk.services.quicksight.CfnDashboardProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnDashboardProps
  }
}
