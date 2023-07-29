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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnProvisioningTemplate

/**
 * Structure that contains payloadVersion and targetArn.
 *
 * Provisioning hooks can be used when fleet provisioning to validate device parameters before
 * allowing the device to be provisioned.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * ProvisioningHookProperty provisioningHookProperty = ProvisioningHookProperty.builder()
 * .payloadVersion("payloadVersion")
 * .targetArn("targetArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-provisioningtemplate-provisioninghook.html)
 */
@CdkDslMarker
public class CfnProvisioningTemplateProvisioningHookPropertyDsl {
    private val cdkBuilder: CfnProvisioningTemplate.ProvisioningHookProperty.Builder =
        CfnProvisioningTemplate.ProvisioningHookProperty.builder()

    /**
     * @param payloadVersion The payload that was sent to the target function. The valid payload is
     *   `"2020-04-01"` .
     */
    public fun payloadVersion(payloadVersion: String) {
        cdkBuilder.payloadVersion(payloadVersion)
    }

    /** @param targetArn The ARN of the target function. */
    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CfnProvisioningTemplate.ProvisioningHookProperty = cdkBuilder.build()
}
