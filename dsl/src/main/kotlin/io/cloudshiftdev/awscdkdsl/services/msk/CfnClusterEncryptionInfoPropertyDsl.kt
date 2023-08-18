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

package io.cloudshiftdev.awscdkdsl.services.msk

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Includes encryption-related information, such as the Amazon KMS key used for encrypting data at
 * rest and whether you want MSK to encrypt your data in transit.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * EncryptionInfoProperty encryptionInfoProperty = EncryptionInfoProperty.builder()
 * .encryptionAtRest(EncryptionAtRestProperty.builder()
 * .dataVolumeKmsKeyId("dataVolumeKmsKeyId")
 * .build())
 * .encryptionInTransit(EncryptionInTransitProperty.builder()
 * .clientBroker("clientBroker")
 * .inCluster(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptioninfo.html)
 */
@CdkDslMarker
public class CfnClusterEncryptionInfoPropertyDsl {
    private val cdkBuilder: CfnCluster.EncryptionInfoProperty.Builder =
        CfnCluster.EncryptionInfoProperty.builder()

    /** @param encryptionAtRest The data-volume encryption details. */
    public fun encryptionAtRest(encryptionAtRest: IResolvable) {
        cdkBuilder.encryptionAtRest(encryptionAtRest)
    }

    /** @param encryptionAtRest The data-volume encryption details. */
    public fun encryptionAtRest(encryptionAtRest: CfnCluster.EncryptionAtRestProperty) {
        cdkBuilder.encryptionAtRest(encryptionAtRest)
    }

    /** @param encryptionInTransit The details for encryption in transit. */
    public fun encryptionInTransit(encryptionInTransit: IResolvable) {
        cdkBuilder.encryptionInTransit(encryptionInTransit)
    }

    /** @param encryptionInTransit The details for encryption in transit. */
    public fun encryptionInTransit(encryptionInTransit: CfnCluster.EncryptionInTransitProperty) {
        cdkBuilder.encryptionInTransit(encryptionInTransit)
    }

    public fun build(): CfnCluster.EncryptionInfoProperty = cdkBuilder.build()
}
