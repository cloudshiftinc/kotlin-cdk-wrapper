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
import software.amazon.awscdk.services.ecs.CfnService

/**
 * An object that represents the AWS Private Certificate Authority certificate.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * ServiceConnectTlsCertificateAuthorityProperty serviceConnectTlsCertificateAuthorityProperty =
 * ServiceConnectTlsCertificateAuthorityProperty.builder()
 * .awsPcaAuthorityArn("awsPcaAuthorityArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnecttlscertificateauthority.html)
 */
@CdkDslMarker
public class CfnServiceServiceConnectTlsCertificateAuthorityPropertyDsl {
    private val cdkBuilder: CfnService.ServiceConnectTlsCertificateAuthorityProperty.Builder =
        CfnService.ServiceConnectTlsCertificateAuthorityProperty.builder()

    /** @param awsPcaAuthorityArn The ARN of the AWS Private Certificate Authority certificate. */
    public fun awsPcaAuthorityArn(awsPcaAuthorityArn: String) {
        cdkBuilder.awsPcaAuthorityArn(awsPcaAuthorityArn)
    }

    public fun build(): CfnService.ServiceConnectTlsCertificateAuthorityProperty =
        cdkBuilder.build()
}
