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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * The data-volume encryption details.
 *
 * You can't update encryption at rest settings for existing clusters.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * EncryptionAtRestProperty encryptionAtRestProperty = EncryptionAtRestProperty.builder()
 * .dataVolumeKmsKeyId("dataVolumeKmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionatrest.html)
 */
@CdkDslMarker
public class CfnClusterEncryptionAtRestPropertyDsl {
    private val cdkBuilder: CfnCluster.EncryptionAtRestProperty.Builder =
        CfnCluster.EncryptionAtRestProperty.builder()

    /**
     * @param dataVolumeKmsKeyId The ARN of the Amazon KMS key for encrypting data at rest. If you
     *   don't specify a KMS key, MSK creates one for you and uses it.
     */
    public fun dataVolumeKmsKeyId(dataVolumeKmsKeyId: String) {
        cdkBuilder.dataVolumeKmsKeyId(dataVolumeKmsKeyId)
    }

    public fun build(): CfnCluster.EncryptionAtRestProperty = cdkBuilder.build()
}
