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

package io.cloudshiftdev.awscdkdsl.services.simspaceweaver

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.simspaceweaver.CfnSimulation

/**
 * A location in Amazon Simple Storage Service ( Amazon S3 ) where SimSpace Weaver stores simulation
 * data, such as your app .zip files and schema file. For more information about Amazon S3 , see the
 * [*Amazon Simple Storage Service User Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.simspaceweaver.*;
 * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-simspaceweaver-simulation-s3location.html)
 */
@CdkDslMarker
public class CfnSimulationS3LocationPropertyDsl {
    private val cdkBuilder: CfnSimulation.S3LocationProperty.Builder =
        CfnSimulation.S3LocationProperty.builder()

    /**
     * @param bucketName The name of an Amazon S3 bucket. For more information about buckets, see
     *   [Creating, configuring, and working with Amazon S3 buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html)
     *   in the *Amazon Simple Storage Service User Guide* .
     */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param objectKey The key name of an object in Amazon S3 . For more information about Amazon
     *   S3 objects and object keys, see
     *   [Uploading, downloading, and working with objects in Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/userguide/uploading-downloading-objects.html)
     *   in the *Amazon Simple Storage Service User Guide* .
     */
    public fun objectKey(objectKey: String) {
        cdkBuilder.objectKey(objectKey)
    }

    public fun build(): CfnSimulation.S3LocationProperty = cdkBuilder.build()
}
