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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents the client's certificate.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * ClientTlsCertificateProperty clientTlsCertificateProperty =
 * ClientTlsCertificateProperty.builder()
 * .file(ListenerTlsFileCertificateProperty.builder()
 * .certificateChain("certificateChain")
 * .privateKey("privateKey")
 * .build())
 * .sds(ListenerTlsSdsCertificateProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clienttlscertificate.html)
 */
@CdkDslMarker
public class CfnVirtualNodeClientTlsCertificatePropertyDsl {
    private val cdkBuilder: CfnVirtualNode.ClientTlsCertificateProperty.Builder =
        CfnVirtualNode.ClientTlsCertificateProperty.builder()

    /**
     * @param file An object that represents a local file certificate. The certificate must meet
     *   specific requirements and you must have proxy authorization enabled. For more information,
     *   see
     *   [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html)
     *   .
     */
    public fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`)
    }

    /**
     * @param file An object that represents a local file certificate. The certificate must meet
     *   specific requirements and you must have proxy authorization enabled. For more information,
     *   see
     *   [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html)
     *   .
     */
    public fun `file`(`file`: CfnVirtualNode.ListenerTlsFileCertificateProperty) {
        cdkBuilder.`file`(`file`)
    }

    /**
     * @param sds A reference to an object that represents a client's TLS Secret Discovery Service
     *   certificate.
     */
    public fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds)
    }

    /**
     * @param sds A reference to an object that represents a client's TLS Secret Discovery Service
     *   certificate.
     */
    public fun sds(sds: CfnVirtualNode.ListenerTlsSdsCertificateProperty) {
        cdkBuilder.sds(sds)
    }

    public fun build(): CfnVirtualNode.ClientTlsCertificateProperty = cdkBuilder.build()
}
