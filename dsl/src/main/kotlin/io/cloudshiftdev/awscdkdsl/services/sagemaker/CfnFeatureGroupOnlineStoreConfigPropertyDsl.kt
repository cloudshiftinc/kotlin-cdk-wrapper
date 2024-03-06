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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

/**
 * Use this to specify the AWS Key Management Service (KMS) Key ID, or `KMSKeyId` , for at rest data
 * encryption.
 *
 * You can turn `OnlineStore` on or off by specifying the `EnableOnlineStore` flag at General
 * Assembly.
 *
 * The default value is `False` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * OnlineStoreConfigProperty onlineStoreConfigProperty = OnlineStoreConfigProperty.builder()
 * .enableOnlineStore(false)
 * .securityConfig(OnlineStoreSecurityConfigProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .storageType("storageType")
 * .ttlDuration(TtlDurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-onlinestoreconfig.html)
 */
@CdkDslMarker
public class CfnFeatureGroupOnlineStoreConfigPropertyDsl {
    private val cdkBuilder: CfnFeatureGroup.OnlineStoreConfigProperty.Builder =
        CfnFeatureGroup.OnlineStoreConfigProperty.builder()

    /**
     * @param enableOnlineStore Turn `OnlineStore` off by specifying `False` for the
     *   `EnableOnlineStore` flag. Turn `OnlineStore` on by specifying `True` for the
     *   `EnableOnlineStore` flag.
     *
     * The default value is `False` .
     */
    public fun enableOnlineStore(enableOnlineStore: Boolean) {
        cdkBuilder.enableOnlineStore(enableOnlineStore)
    }

    /**
     * @param enableOnlineStore Turn `OnlineStore` off by specifying `False` for the
     *   `EnableOnlineStore` flag. Turn `OnlineStore` on by specifying `True` for the
     *   `EnableOnlineStore` flag.
     *
     * The default value is `False` .
     */
    public fun enableOnlineStore(enableOnlineStore: IResolvable) {
        cdkBuilder.enableOnlineStore(enableOnlineStore)
    }

    /**
     * @param securityConfig Use to specify KMS Key ID ( `KMSKeyId` ) for at-rest encryption of your
     *   `OnlineStore` .
     */
    public fun securityConfig(securityConfig: IResolvable) {
        cdkBuilder.securityConfig(securityConfig)
    }

    /**
     * @param securityConfig Use to specify KMS Key ID ( `KMSKeyId` ) for at-rest encryption of your
     *   `OnlineStore` .
     */
    public fun securityConfig(securityConfig: CfnFeatureGroup.OnlineStoreSecurityConfigProperty) {
        cdkBuilder.securityConfig(securityConfig)
    }

    /**
     * @param storageType Option for different tiers of low latency storage for real-time data
     *   retrieval.
     * * `Standard` : A managed low latency data store for feature groups.
     * * `InMemory` : A managed data store for feature groups that supports very low latency
     *   retrieval.
     */
    public fun storageType(storageType: String) {
        cdkBuilder.storageType(storageType)
    }

    /**
     * @param ttlDuration Time to live duration, where the record is hard deleted after the
     *   expiration time is reached;. `ExpiresAt` = `EventTime` + `TtlDuration` . For information on
     *   HardDelete, see the
     *   [DeleteRecord](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html)
     *   API in the Amazon SageMaker API Reference guide.
     */
    public fun ttlDuration(ttlDuration: IResolvable) {
        cdkBuilder.ttlDuration(ttlDuration)
    }

    /**
     * @param ttlDuration Time to live duration, where the record is hard deleted after the
     *   expiration time is reached;. `ExpiresAt` = `EventTime` + `TtlDuration` . For information on
     *   HardDelete, see the
     *   [DeleteRecord](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_feature_store_DeleteRecord.html)
     *   API in the Amazon SageMaker API Reference guide.
     */
    public fun ttlDuration(ttlDuration: CfnFeatureGroup.TtlDurationProperty) {
        cdkBuilder.ttlDuration(ttlDuration)
    }

    public fun build(): CfnFeatureGroup.OnlineStoreConfigProperty = cdkBuilder.build()
}
