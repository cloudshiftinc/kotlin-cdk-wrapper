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
import software.amazon.awscdk.services.msk.CfnCluster

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
 * .scram(ScramProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .tls(TlsProperty.builder()
 * .certificateAuthorityArnList(List.of("certificateAuthorityArnList"))
 * .enabled(false)
 * .build())
 * .unauthenticated(UnauthenticatedProperty.builder()
 * .enabled(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html)
 */
@CdkDslMarker
public class CfnClusterClientAuthenticationPropertyDsl {
    private val cdkBuilder: CfnCluster.ClientAuthenticationProperty.Builder =
        CfnCluster.ClientAuthenticationProperty.builder()

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
    public fun sasl(sasl: CfnCluster.SaslProperty) {
        cdkBuilder.sasl(sasl)
    }

    /**
     * @param tls Details for ClientAuthentication using TLS. To turn on TLS access control, you
     *   must also turn on `EncryptionInTransit` by setting `inCluster` to true and `clientBroker`
     *   to `TLS` .
     */
    public fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls)
    }

    /**
     * @param tls Details for ClientAuthentication using TLS. To turn on TLS access control, you
     *   must also turn on `EncryptionInTransit` by setting `inCluster` to true and `clientBroker`
     *   to `TLS` .
     */
    public fun tls(tls: CfnCluster.TlsProperty) {
        cdkBuilder.tls(tls)
    }

    /** @param unauthenticated Details for ClientAuthentication using no authentication. */
    public fun unauthenticated(unauthenticated: IResolvable) {
        cdkBuilder.unauthenticated(unauthenticated)
    }

    /** @param unauthenticated Details for ClientAuthentication using no authentication. */
    public fun unauthenticated(unauthenticated: CfnCluster.UnauthenticatedProperty) {
        cdkBuilder.unauthenticated(unauthenticated)
    }

    public fun build(): CfnCluster.ClientAuthenticationProperty = cdkBuilder.build()
}
