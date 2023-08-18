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

package io.cloudshiftdev.awscdkdsl.services.secretsmanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.secretsmanager.CfnSecret

/**
 * Specifies a `Region` and the `KmsKeyId` for a replica secret.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.secretsmanager.*;
 * ReplicaRegionProperty replicaRegionProperty = ReplicaRegionProperty.builder()
 * .region("region")
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-secretsmanager-secret-replicaregion.html)
 */
@CdkDslMarker
public class CfnSecretReplicaRegionPropertyDsl {
    private val cdkBuilder: CfnSecret.ReplicaRegionProperty.Builder =
        CfnSecret.ReplicaRegionProperty.builder()

    /**
     * @param kmsKeyId The ARN, key ID, or alias of the KMS key to encrypt the secret. If you don't
     *   include this field, Secrets Manager uses `aws/secretsmanager` .
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /** @param region (Optional) A string that represents a `Region` , for example "us-east-1". */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): CfnSecret.ReplicaRegionProperty = cdkBuilder.build()
}
