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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps

/**
 * Properties for defining a `CfnPolicyPrincipalAttachment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnPolicyPrincipalAttachmentProps cfnPolicyPrincipalAttachmentProps =
 * CfnPolicyPrincipalAttachmentProps.builder()
 * .policyName("policyName")
 * .principal("principal")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html)
 */
@CdkDslMarker
public class CfnPolicyPrincipalAttachmentPropsDsl {
    private val cdkBuilder: CfnPolicyPrincipalAttachmentProps.Builder =
        CfnPolicyPrincipalAttachmentProps.builder()

    /** @param policyName The name of the AWS IoT policy. */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    /**
     * @param principal The principal, which can be a certificate ARN (as returned from the
     *   `CreateCertificate` operation) or an Amazon Cognito ID.
     */
    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    public fun build(): CfnPolicyPrincipalAttachmentProps = cdkBuilder.build()
}
