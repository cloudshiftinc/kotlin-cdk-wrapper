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

package io.cloudshiftdev.awscdkdsl.services.amazonmq

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnBroker

/**
 * Encryption options for the broker.
 *
 * Does not apply to RabbitMQ brokers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amazonmq.*;
 * EncryptionOptionsProperty encryptionOptionsProperty = EncryptionOptionsProperty.builder()
 * .useAwsOwnedKey(false)
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-encryptionoptions.html)
 */
@CdkDslMarker
public class CfnBrokerEncryptionOptionsPropertyDsl {
    private val cdkBuilder: CfnBroker.EncryptionOptionsProperty.Builder =
        CfnBroker.EncryptionOptionsProperty.builder()

    /**
     * @param kmsKeyId The customer master key (CMK) to use for the A AWS KMS (KMS). This key is
     *   used to encrypt your data at rest. If not provided, Amazon MQ will use a default CMK to
     *   encrypt your data.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param useAwsOwnedKey Enables the use of an AWS owned CMK using AWS KMS (KMS). Set to `true`
     *   by default, if no value is provided, for example, for RabbitMQ brokers.
     */
    public fun useAwsOwnedKey(useAwsOwnedKey: Boolean) {
        cdkBuilder.useAwsOwnedKey(useAwsOwnedKey)
    }

    /**
     * @param useAwsOwnedKey Enables the use of an AWS owned CMK using AWS KMS (KMS). Set to `true`
     *   by default, if no value is provided, for example, for RabbitMQ brokers.
     */
    public fun useAwsOwnedKey(useAwsOwnedKey: IResolvable) {
        cdkBuilder.useAwsOwnedKey(useAwsOwnedKey)
    }

    public fun build(): CfnBroker.EncryptionOptionsProperty = cdkBuilder.build()
}
