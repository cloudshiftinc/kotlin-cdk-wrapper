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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies data related to access patterns to be collected and made available to analyze the
 * tradeoffs between different storage classes for an Amazon S3 bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * StorageClassAnalysisProperty storageClassAnalysisProperty =
 * StorageClassAnalysisProperty.builder()
 * .dataExport(DataExportProperty.builder()
 * .destination(DestinationProperty.builder()
 * .bucketArn("bucketArn")
 * .format("format")
 * // the properties below are optional
 * .bucketAccountId("bucketAccountId")
 * .prefix("prefix")
 * .build())
 * .outputSchemaVersion("outputSchemaVersion")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html)
 */
@CdkDslMarker
public class CfnBucketStorageClassAnalysisPropertyDsl {
    private val cdkBuilder: CfnBucket.StorageClassAnalysisProperty.Builder =
        CfnBucket.StorageClassAnalysisProperty.builder()

    /**
     * @param dataExport Specifies how data related to the storage class analysis for an Amazon S3
     *   bucket should be exported.
     */
    public fun dataExport(dataExport: IResolvable) {
        cdkBuilder.dataExport(dataExport)
    }

    /**
     * @param dataExport Specifies how data related to the storage class analysis for an Amazon S3
     *   bucket should be exported.
     */
    public fun dataExport(dataExport: CfnBucket.DataExportProperty) {
        cdkBuilder.dataExport(dataExport)
    }

    public fun build(): CfnBucket.StorageClassAnalysisProperty = cdkBuilder.build()
}
