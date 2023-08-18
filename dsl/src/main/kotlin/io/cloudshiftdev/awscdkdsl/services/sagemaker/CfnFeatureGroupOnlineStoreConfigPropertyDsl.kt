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

    public fun build(): CfnFeatureGroup.OnlineStoreConfigProperty = cdkBuilder.build()
}
