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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleet

/**
 * The output configuration for storing sample data collected by the fleet.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * EdgeOutputConfigProperty edgeOutputConfigProperty = EdgeOutputConfigProperty.builder()
 * .s3OutputLocation("s3OutputLocation")
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-devicefleet-edgeoutputconfig.html)
 */
@CdkDslMarker
public class CfnDeviceFleetEdgeOutputConfigPropertyDsl {
    private val cdkBuilder: CfnDeviceFleet.EdgeOutputConfigProperty.Builder =
        CfnDeviceFleet.EdgeOutputConfigProperty.builder()

    /**
     * @param kmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to
     *   encrypt data on the storage volume after compilation job. If you don't provide a KMS key
     *   ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /** @param s3OutputLocation The Amazon Simple Storage (S3) bucket URI. */
    public fun s3OutputLocation(s3OutputLocation: String) {
        cdkBuilder.s3OutputLocation(s3OutputLocation)
    }

    public fun build(): CfnDeviceFleet.EdgeOutputConfigProperty = cdkBuilder.build()
}
