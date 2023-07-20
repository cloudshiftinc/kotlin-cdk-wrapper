@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnReportGroup
import software.amazon.awscdk.services.codebuild.CfnReportGroupProps
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnReportGroupPropsDsl {
    private val cdkBuilder: CfnReportGroupProps.Builder = CfnReportGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun deleteReports(deleteReports: Boolean) {
        cdkBuilder.deleteReports(deleteReports)
    }

    public fun deleteReports(deleteReports: IResolvable) {
        cdkBuilder.deleteReports(deleteReports)
    }

    public fun exportConfig(exportConfig: IResolvable) {
        cdkBuilder.exportConfig(exportConfig)
    }

    public fun exportConfig(exportConfig: CfnReportGroup.ReportExportConfigProperty) {
        cdkBuilder.exportConfig(exportConfig)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnReportGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
