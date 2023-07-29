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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnServerlessCluster

/**
 * Includes all client authentication information.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * ClientAuthenticationProperty clientAuthenticationProperty =
 * ClientAuthenticationProperty.builder()
 * .sasl(SaslProperty.builder()
 * .iam(IamProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-serverlesscluster-clientauthentication.html)
 */
@CdkDslMarker
public class CfnServerlessClusterClientAuthenticationPropertyDsl {
    private val cdkBuilder: CfnServerlessCluster.ClientAuthenticationProperty.Builder =
        CfnServerlessCluster.ClientAuthenticationProperty.builder()

    /**
     * @param sasl Details for client authentication using SASL. To turn on SASL, you must also turn
     *   on `EncryptionInTransit` by setting `inCluster` to true. You must set `clientBroker` to
     *   either `TLS` or `TLS_PLAINTEXT` . If you choose `TLS_PLAINTEXT` , then you must also set
     *   `unauthenticated` to true.
     */
    public fun sasl(sasl: IResolvable) {
        cdkBuilder.sasl(sasl)
    }

    /**
     * @param sasl Details for client authentication using SASL. To turn on SASL, you must also turn
     *   on `EncryptionInTransit` by setting `inCluster` to true. You must set `clientBroker` to
     *   either `TLS` or `TLS_PLAINTEXT` . If you choose `TLS_PLAINTEXT` , then you must also set
     *   `unauthenticated` to true.
     */
    public fun sasl(sasl: CfnServerlessCluster.SaslProperty) {
        cdkBuilder.sasl(sasl)
    }

    public fun build(): CfnServerlessCluster.ClientAuthenticationProperty = cdkBuilder.build()
}
