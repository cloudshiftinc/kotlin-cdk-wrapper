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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService

/**
 * An object that represents the configuration for Service Connect TLS.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * ServiceConnectTlsConfigurationProperty serviceConnectTlsConfigurationProperty =
 * ServiceConnectTlsConfigurationProperty.builder()
 * .issuerCertificateAuthority(ServiceConnectTlsCertificateAuthorityProperty.builder()
 * .awsPcaAuthorityArn("awsPcaAuthorityArn")
 * .build())
 * // the properties below are optional
 * .kmsKey("kmsKey")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttlsconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceServiceConnectTlsConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.ServiceConnectTlsConfigurationProperty.Builder =
        CfnService.ServiceConnectTlsConfigurationProperty.builder()

    /** @param issuerCertificateAuthority The signer certificate authority. */
    public fun issuerCertificateAuthority(issuerCertificateAuthority: IResolvable) {
        cdkBuilder.issuerCertificateAuthority(issuerCertificateAuthority)
    }

    /** @param issuerCertificateAuthority The signer certificate authority. */
    public fun issuerCertificateAuthority(
        issuerCertificateAuthority: CfnService.ServiceConnectTlsCertificateAuthorityProperty
    ) {
        cdkBuilder.issuerCertificateAuthority(issuerCertificateAuthority)
    }

    /** @param kmsKey The AWS Key Management Service key. */
    public fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that's associated with the
     *   Service Connect TLS.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnService.ServiceConnectTlsConfigurationProperty = cdkBuilder.build()
}
