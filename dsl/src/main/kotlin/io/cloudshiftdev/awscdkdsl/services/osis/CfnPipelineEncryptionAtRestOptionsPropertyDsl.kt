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

package io.cloudshiftdev.awscdkdsl.services.osis

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.osis.CfnPipeline

/**
 * Options to control how OpenSearch encrypts buffer data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.osis.*;
 * EncryptionAtRestOptionsProperty encryptionAtRestOptionsProperty =
 * EncryptionAtRestOptionsProperty.builder()
 * .kmsKeyArn("kmsKeyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-encryptionatrestoptions.html)
 */
@CdkDslMarker
public class CfnPipelineEncryptionAtRestOptionsPropertyDsl {
    private val cdkBuilder: CfnPipeline.EncryptionAtRestOptionsProperty.Builder =
        CfnPipeline.EncryptionAtRestOptionsProperty.builder()

    /**
     * @param kmsKeyArn The ARN of the KMS key used to encrypt buffer data. By default, data is
     *   encrypted using an AWS owned key.
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public fun build(): CfnPipeline.EncryptionAtRestOptionsProperty = cdkBuilder.build()
}
