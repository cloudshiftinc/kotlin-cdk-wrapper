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

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.backup.CfnReportPlan
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnReportPlanReportDeliveryChannelPropertyDsl {
    private val cdkBuilder: CfnReportPlan.ReportDeliveryChannelProperty.Builder =
        CfnReportPlan.ReportDeliveryChannelProperty.builder()

    private val _formats: MutableList<String> = mutableListOf()

    public fun formats(vararg formats: String) {
        _formats.addAll(listOf(*formats))
    }

    public fun formats(formats: Collection<String>) {
        _formats.addAll(formats)
    }

    public fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
    }

    public fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    public fun build(): CfnReportPlan.ReportDeliveryChannelProperty {
        if (_formats.isNotEmpty()) cdkBuilder.formats(_formats)
        return cdkBuilder.build()
    }
}
