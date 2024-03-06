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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener

/**
 * Specifies the configuration information for mutual authentication.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * MutualAuthenticationProperty mutualAuthenticationProperty =
 * MutualAuthenticationProperty.builder()
 * .ignoreClientCertificateExpiry(false)
 * .mode("mode")
 * .trustStoreArn("trustStoreArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-mutualauthentication.html)
 */
@CdkDslMarker
public class CfnListenerMutualAuthenticationPropertyDsl {
    private val cdkBuilder: CfnListener.MutualAuthenticationProperty.Builder =
        CfnListener.MutualAuthenticationProperty.builder()

    /**
     * @param ignoreClientCertificateExpiry Indicates whether expired client certificates are
     *   ignored.
     */
    public fun ignoreClientCertificateExpiry(ignoreClientCertificateExpiry: Boolean) {
        cdkBuilder.ignoreClientCertificateExpiry(ignoreClientCertificateExpiry)
    }

    /**
     * @param ignoreClientCertificateExpiry Indicates whether expired client certificates are
     *   ignored.
     */
    public fun ignoreClientCertificateExpiry(ignoreClientCertificateExpiry: IResolvable) {
        cdkBuilder.ignoreClientCertificateExpiry(ignoreClientCertificateExpiry)
    }

    /**
     * @param mode The client certificate handling method. Options are `off` , `passthrough` or
     *   `verify` . The default value is `off` .
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    /** @param trustStoreArn The Amazon Resource Name (ARN) of the trust store. */
    public fun trustStoreArn(trustStoreArn: String) {
        cdkBuilder.trustStoreArn(trustStoreArn)
    }

    public fun build(): CfnListener.MutualAuthenticationProperty = cdkBuilder.build()
}
