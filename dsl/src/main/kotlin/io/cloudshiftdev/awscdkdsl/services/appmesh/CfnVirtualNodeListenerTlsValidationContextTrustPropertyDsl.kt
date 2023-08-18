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

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents a listener's Transport Layer Security (TLS) validation context trust.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * ListenerTlsValidationContextTrustProperty listenerTlsValidationContextTrustProperty =
 * ListenerTlsValidationContextTrustProperty.builder()
 * .file(TlsValidationContextFileTrustProperty.builder()
 * .certificateChain("certificateChain")
 * .build())
 * .sds(TlsValidationContextSdsTrustProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsvalidationcontexttrust.html)
 */
@CdkDslMarker
public class CfnVirtualNodeListenerTlsValidationContextTrustPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.ListenerTlsValidationContextTrustProperty.Builder =
        CfnVirtualNode.ListenerTlsValidationContextTrustProperty.builder()

    /**
     * @param file An object that represents a Transport Layer Security (TLS) validation context
     *   trust for a local file.
     */
    public fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`)
    }

    /**
     * @param file An object that represents a Transport Layer Security (TLS) validation context
     *   trust for a local file.
     */
    public fun `file`(`file`: CfnVirtualNode.TlsValidationContextFileTrustProperty) {
        cdkBuilder.`file`(`file`)
    }

    /**
     * @param sds A reference to an object that represents a listener's Transport Layer Security
     *   (TLS) Secret Discovery Service validation context trust.
     */
    public fun sds(sds: IResolvable) {
        cdkBuilder.sds(sds)
    }

    /**
     * @param sds A reference to an object that represents a listener's Transport Layer Security
     *   (TLS) Secret Discovery Service validation context trust.
     */
    public fun sds(sds: CfnVirtualNode.TlsValidationContextSdsTrustProperty) {
        cdkBuilder.sds(sds)
    }

    public fun build(): CfnVirtualNode.ListenerTlsValidationContextTrustProperty =
        cdkBuilder.build()
}
