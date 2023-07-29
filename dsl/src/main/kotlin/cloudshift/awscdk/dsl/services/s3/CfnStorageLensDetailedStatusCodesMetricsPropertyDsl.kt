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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * This resource enables Amazon S3 Storage Lens detailed status code metrics.
 *
 * Detailed status code metrics generate metrics for HTTP status codes, such as `200 OK` , `403
 * Forbidden` , `503 Service Unavailable` and others.
 *
 * For more information, see
 * [Assessing your storage activity and usage with S3 Storage Lens](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens.html)
 * in the *Amazon S3 User Guide* . For a complete list of metrics, see
 * [S3 Storage Lens metrics glossary](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_metrics_glossary.html)
 * in the *Amazon S3 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * DetailedStatusCodesMetricsProperty detailedStatusCodesMetricsProperty =
 * DetailedStatusCodesMetricsProperty.builder()
 * .isEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-detailedstatuscodesmetrics.html)
 */
@CdkDslMarker
public class CfnStorageLensDetailedStatusCodesMetricsPropertyDsl {
    private val cdkBuilder: CfnStorageLens.DetailedStatusCodesMetricsProperty.Builder =
        CfnStorageLens.DetailedStatusCodesMetricsProperty.builder()

    /** @param isEnabled Indicates whether detailed status code metrics are enabled. */
    public fun isEnabled(isEnabled: Boolean) {
        cdkBuilder.isEnabled(isEnabled)
    }

    /** @param isEnabled Indicates whether detailed status code metrics are enabled. */
    public fun isEnabled(isEnabled: IResolvable) {
        cdkBuilder.isEnabled(isEnabled)
    }

    public fun build(): CfnStorageLens.DetailedStatusCodesMetricsProperty = cdkBuilder.build()
}
