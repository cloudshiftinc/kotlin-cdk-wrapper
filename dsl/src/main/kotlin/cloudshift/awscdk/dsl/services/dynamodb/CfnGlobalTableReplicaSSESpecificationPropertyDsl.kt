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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

/**
 * Allows you to specify a KMS key identifier to be used for server-side encryption.
 *
 * The key can be specified via ARN, key ID, or alias. The key must be created in the same region as
 * the replica.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * ReplicaSSESpecificationProperty replicaSSESpecificationProperty =
 * ReplicaSSESpecificationProperty.builder()
 * .kmsMasterKeyId("kmsMasterKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicassespecification.html)
 */
@CdkDslMarker
public class CfnGlobalTableReplicaSSESpecificationPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.ReplicaSSESpecificationProperty.Builder =
        CfnGlobalTable.ReplicaSSESpecificationProperty.builder()

    /**
     * @param kmsMasterKeyId The AWS KMS key that should be used for the AWS KMS encryption. To
     *   specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note
     *   that you should only provide this parameter if the key is different from the default
     *   DynamoDB key `alias/aws/dynamodb` .
     */
    public fun kmsMasterKeyId(kmsMasterKeyId: String) {
        cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
    }

    public fun build(): CfnGlobalTable.ReplicaSSESpecificationProperty = cdkBuilder.build()
}
