@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

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
import software.amazon.awscdk.services.codebuild.CfnReportGroupProps

/**
 * Properties for defining a `CfnReportGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * CfnReportGroupProps cfnReportGroupProps = CfnReportGroupProps.builder()
 * .exportConfig(ReportExportConfigProperty.builder()
 * .exportConfigType("exportConfigType")
 * // the properties below are optional
 * .s3Destination(S3ReportExportConfigProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .encryptionDisabled(false)
 * .encryptionKey("encryptionKey")
 * .packaging("packaging")
 * .path("path")
 * .build())
 * .build())
 * .type("type")
 * // the properties below are optional
 * .deleteReports(false)
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html)
 */
@CdkDslMarker
public class CfnReportGroupPropsDsl {
    private val cdkBuilder: CfnReportGroupProps.Builder = CfnReportGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param deleteReports When deleting a report group, specifies if reports within the report
     *   group should be deleted.
     * * **true** - Deletes any reports that belong to the report group before deleting the report
     *   group.
     * * **false** - You must delete any reports in the report group. This is the default value. If
     *   you delete a report group that contains one or more reports, an exception is thrown.
     */
    public fun deleteReports(deleteReports: Boolean) {
        cdkBuilder.deleteReports(deleteReports)
    }

    /**
     * @param deleteReports When deleting a report group, specifies if reports within the report
     *   group should be deleted.
     * * **true** - Deletes any reports that belong to the report group before deleting the report
     *   group.
     * * **false** - You must delete any reports in the report group. This is the default value. If
     *   you delete a report group that contains one or more reports, an exception is thrown.
     */
    public fun deleteReports(deleteReports: IResolvable) {
        cdkBuilder.deleteReports(deleteReports)
    }

    /**
     * @param exportConfig Information about the destination where the raw data of this
     *   `ReportGroup` is exported.
     */
    public fun exportConfig(exportConfig: IResolvable) {
        cdkBuilder.exportConfig(exportConfig)
    }

    /**
     * @param exportConfig Information about the destination where the raw data of this
     *   `ReportGroup` is exported.
     */
    public fun exportConfig(exportConfig: CfnReportGroup.ReportExportConfigProperty) {
        cdkBuilder.exportConfig(exportConfig)
    }

    /** @param name The name of the `ReportGroup` . */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags A list of tag key and value pairs associated with this report group. These tags
     *   are available for use by AWS services that support AWS CodeBuild report group tags.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of tag key and value pairs associated with this report group. These tags
     *   are available for use by AWS services that support AWS CodeBuild report group tags.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param type The type of the `ReportGroup` . This can be one of the following values:.
     * * **CODE_COVERAGE** - The report group contains code coverage reports.
     * * **TEST** - The report group contains test reports.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnReportGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
