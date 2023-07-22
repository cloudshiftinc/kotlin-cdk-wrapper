@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import software.amazon.awscdk.services.quicksight.CfnDashboardProps

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
@CdkDslMarker
public class CfnDashboardPropsDsl {
  private val cdkBuilder: CfnDashboardProps.Builder = CfnDashboardProps.builder()

  private val _permissions: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param awsAccountId The ID of the AWS account where you want to create the dashboard. 
   */
  public fun awsAccountId(awsAccountId: String) {
    cdkBuilder.awsAccountId(awsAccountId)
  }

  /**
   * @param dashboardId The ID for the dashboard, also added to the IAM policy. 
   */
  public fun dashboardId(dashboardId: String) {
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
   * * `VisibilityState` for `SheetControlsOption` - This visibility state can be either `COLLAPSED`
   * or `EXPANDED` . This option is `COLLAPSED` by default.
   */
  public fun dashboardPublishOptions(dashboardPublishOptions: IResolvable) {
    cdkBuilder.dashboardPublishOptions(dashboardPublishOptions)
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
   * * `VisibilityState` for `SheetControlsOption` - This visibility state can be either `COLLAPSED`
   * or `EXPANDED` . This option is `COLLAPSED` by default.
   */
  public
      fun dashboardPublishOptions(dashboardPublishOptions: CfnDashboard.DashboardPublishOptionsProperty) {
    cdkBuilder.dashboardPublishOptions(dashboardPublishOptions)
  }

  /**
   * @param definition the value to be set.
   */
  public fun definition(definition: IResolvable) {
    cdkBuilder.definition(definition)
  }

  /**
   * @param definition the value to be set.
   */
  public fun definition(definition: CfnDashboard.DashboardVersionDefinitionProperty) {
    cdkBuilder.definition(definition)
  }

  /**
   * @param name The display name of the dashboard. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param parameters The parameters for the creation of the dashboard, which you want to use to
   * override the default settings.
   * A dashboard can have any type of parameters, and some parameters might accept multiple values.
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param parameters The parameters for the creation of the dashboard, which you want to use to
   * override the default settings.
   * A dashboard can have any type of parameters, and some parameters might accept multiple values.
   */
  public fun parameters(parameters: CfnDashboard.ParametersProperty) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param permissions A structure that contains the permissions of the dashboard.
   * You can use this structure for granting permissions by providing a list of IAM action
   * information for each principal ARN.
   *
   * To specify no permissions, omit the permissions list.
   */
  public fun permissions(vararg permissions: Any) {
    _permissions.addAll(listOf(*permissions))
  }

  /**
   * @param permissions A structure that contains the permissions of the dashboard.
   * You can use this structure for granting permissions by providing a list of IAM action
   * information for each principal ARN.
   *
   * To specify no permissions, omit the permissions list.
   */
  public fun permissions(permissions: Collection<Any>) {
    _permissions.addAll(permissions)
  }

  /**
   * @param permissions A structure that contains the permissions of the dashboard.
   * You can use this structure for granting permissions by providing a list of IAM action
   * information for each principal ARN.
   *
   * To specify no permissions, omit the permissions list.
   */
  public fun permissions(permissions: IResolvable) {
    cdkBuilder.permissions(permissions)
  }

  /**
   * @param sourceEntity The entity that you are using as a source when you create the dashboard.
   * In `SourceEntity` , you specify the type of object that you want to use. You can only create a
   * dashboard from a template, so you use a `SourceTemplate` entity. If you need to create a dashboard
   * from an analysis, first convert the analysis to a template by using the `CreateTemplate` API
   * operation. For `SourceTemplate` , specify the Amazon Resource Name (ARN) of the source template.
   * The `SourceTemplate` ARN can contain any AWS account; and any QuickSight-supported AWS Region .
   *
   * Use the `DataSetReferences` entity within `SourceTemplate` to list the replacement datasets for
   * the placeholders listed in the original. The schema in each dataset must match its placeholder.
   */
  public fun sourceEntity(sourceEntity: IResolvable) {
    cdkBuilder.sourceEntity(sourceEntity)
  }

  /**
   * @param sourceEntity The entity that you are using as a source when you create the dashboard.
   * In `SourceEntity` , you specify the type of object that you want to use. You can only create a
   * dashboard from a template, so you use a `SourceTemplate` entity. If you need to create a dashboard
   * from an analysis, first convert the analysis to a template by using the `CreateTemplate` API
   * operation. For `SourceTemplate` , specify the Amazon Resource Name (ARN) of the source template.
   * The `SourceTemplate` ARN can contain any AWS account; and any QuickSight-supported AWS Region .
   *
   * Use the `DataSetReferences` entity within `SourceTemplate` to list the replacement datasets for
   * the placeholders listed in the original. The schema in each dataset must match its placeholder.
   */
  public fun sourceEntity(sourceEntity: CfnDashboard.DashboardSourceEntityProperty) {
    cdkBuilder.sourceEntity(sourceEntity)
  }

  /**
   * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to the
   * dashboard.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to the
   * dashboard.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param themeArn The Amazon Resource Name (ARN) of the theme that is being used for this
   * dashboard.
   * If you add a value for this field, it overrides the value that is used in the source entity.
   * The theme ARN must exist in the same AWS account where you create the dashboard.
   */
  public fun themeArn(themeArn: String) {
    cdkBuilder.themeArn(themeArn)
  }

  /**
   * @param versionDescription A description for the first version of the dashboard being created.
   */
  public fun versionDescription(versionDescription: String) {
    cdkBuilder.versionDescription(versionDescription)
  }

  public fun build(): CfnDashboardProps {
    if(_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
