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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * The settings for encrypting data in transit.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * EncryptionInTransitProperty encryptionInTransitProperty = EncryptionInTransitProperty.builder()
 * .clientBroker("clientBroker")
 * .inCluster(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptionintransit.html)
 */
@CdkDslMarker
public class CfnClusterEncryptionInTransitPropertyDsl {
    private val cdkBuilder: CfnCluster.EncryptionInTransitProperty.Builder =
        CfnCluster.EncryptionInTransitProperty.builder()

    /**
     * @param clientBroker Indicates the encryption setting for data in transit between clients and
     *   brokers. You must set it to one of the following values.
     *
     * `TLS` means that client-broker communication is enabled with TLS only.
     *
     * `TLS_PLAINTEXT` means that client-broker communication is enabled for both TLS-encrypted, as
     * well as plaintext data.
     *
     * `PLAINTEXT` means that client-broker communication is enabled in plaintext only.
     *
     * The default value is `TLS` .
     */
    public fun clientBroker(clientBroker: String) {
        cdkBuilder.clientBroker(clientBroker)
    }

    /**
     * @param inCluster When set to true, it indicates that data communication among the broker
     *   nodes of the cluster is encrypted. When set to false, the communication happens in
     *   plaintext.
     *
     * The default value is true.
     */
    public fun inCluster(inCluster: Boolean) {
        cdkBuilder.inCluster(inCluster)
    }

    /**
     * @param inCluster When set to true, it indicates that data communication among the broker
     *   nodes of the cluster is encrypted. When set to false, the communication happens in
     *   plaintext.
     *
     * The default value is true.
     */
    public fun inCluster(inCluster: IResolvable) {
        cdkBuilder.inCluster(inCluster)
    }

    public fun build(): CfnCluster.EncryptionInTransitProperty = cdkBuilder.build()
}
