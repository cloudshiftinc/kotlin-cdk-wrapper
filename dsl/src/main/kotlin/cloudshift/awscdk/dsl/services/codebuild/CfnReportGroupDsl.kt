@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnReportGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnReportGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnReportGroup.Builder = CfnReportGroup.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * When deleting a report group, specifies if reports within the report group should be deleted.
   *
   * * **true** - Deletes any reports that belong to the report group before deleting the report
   * group.
   * * **false** - You must delete any reports in the report group. This is the default value. If
   * you delete a report group that contains one or more reports, an exception is thrown.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-deletereports)
   * @param deleteReports When deleting a report group, specifies if reports within the report group
   * should be deleted. 
   */
  public fun deleteReports(deleteReports: Boolean) {
    cdkBuilder.deleteReports(deleteReports)
  }

  /**
   * When deleting a report group, specifies if reports within the report group should be deleted.
   *
   * * **true** - Deletes any reports that belong to the report group before deleting the report
   * group.
   * * **false** - You must delete any reports in the report group. This is the default value. If
   * you delete a report group that contains one or more reports, an exception is thrown.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-deletereports)
   * @param deleteReports When deleting a report group, specifies if reports within the report group
   * should be deleted. 
   */
  public fun deleteReports(deleteReports: IResolvable) {
    cdkBuilder.deleteReports(deleteReports)
  }

  /**
   * Information about the destination where the raw data of this `ReportGroup` is exported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-exportconfig)
   * @param exportConfig Information about the destination where the raw data of this `ReportGroup`
   * is exported. 
   */
  public fun exportConfig(exportConfig: IResolvable) {
    cdkBuilder.exportConfig(exportConfig)
  }

  /**
   * Information about the destination where the raw data of this `ReportGroup` is exported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-exportconfig)
   * @param exportConfig Information about the destination where the raw data of this `ReportGroup`
   * is exported. 
   */
  public fun exportConfig(exportConfig: CfnReportGroup.ReportExportConfigProperty) {
    cdkBuilder.exportConfig(exportConfig)
  }

  /**
   * The name of the `ReportGroup` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-name)
   * @param name The name of the `ReportGroup` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * A list of tag key and value pairs associated with this report group.
   *
   * These tags are available for use by AWS services that support AWS CodeBuild report group tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-tags)
   * @param tags A list of tag key and value pairs associated with this report group. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of tag key and value pairs associated with this report group.
   *
   * These tags are available for use by AWS services that support AWS CodeBuild report group tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-tags)
   * @param tags A list of tag key and value pairs associated with this report group. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The type of the `ReportGroup` . This can be one of the following values:.
   *
   * * **CODE_COVERAGE** - The report group contains code coverage reports.
   * * **TEST** - The report group contains test reports.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html#cfn-codebuild-reportgroup-type)
   * @param type The type of the `ReportGroup` . This can be one of the following values:. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnReportGroup {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
