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

package io.cloudshiftdev.awscdkdsl.services.backup

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.backup.CfnReportPlan

/**
 * Contains information from your report plan about where to deliver your reports, specifically your
 * Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * ReportDeliveryChannelProperty reportDeliveryChannelProperty =
 * ReportDeliveryChannelProperty.builder()
 * .s3BucketName("s3BucketName")
 * // the properties below are optional
 * .formats(List.of("formats"))
 * .s3KeyPrefix("s3KeyPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-reportplan-reportdeliverychannel.html)
 */
@CdkDslMarker
public class CfnReportPlanReportDeliveryChannelPropertyDsl {
    private val cdkBuilder: CfnReportPlan.ReportDeliveryChannelProperty.Builder =
        CfnReportPlan.ReportDeliveryChannelProperty.builder()

    private val _formats: MutableList<String> = mutableListOf()

    /**
     * @param formats A list of the format of your reports: `CSV` , `JSON` , or both. If not
     *   specified, the default format is `CSV` .
     */
    public fun formats(vararg formats: String) {
        _formats.addAll(listOf(*formats))
    }

    /**
     * @param formats A list of the format of your reports: `CSV` , `JSON` , or both. If not
     *   specified, the default format is `CSV` .
     */
    public fun formats(formats: Collection<String>) {
        _formats.addAll(formats)
    }

    /** @param s3BucketName The unique name of the S3 bucket that receives your reports. */
    public fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
    }

    /**
     * @param s3KeyPrefix The prefix for where AWS Backup Audit Manager delivers your reports to
     *   Amazon S3. The prefix is this part of the following path: s3://your-bucket-name/ `prefix`
     *   /Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
     */
    public fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    public fun build(): CfnReportPlan.ReportDeliveryChannelProperty {
        if (_formats.isNotEmpty()) cdkBuilder.formats(_formats)
        return cdkBuilder.build()
    }
}
