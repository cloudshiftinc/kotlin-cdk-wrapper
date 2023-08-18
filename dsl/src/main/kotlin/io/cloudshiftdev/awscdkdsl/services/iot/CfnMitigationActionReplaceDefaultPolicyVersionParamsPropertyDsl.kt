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
import software.amazon.awscdk.services.iot.CfnMitigationAction

/**
 * Parameters to define a mitigation action that adds a blank policy to restrict permissions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * ReplaceDefaultPolicyVersionParamsProperty replaceDefaultPolicyVersionParamsProperty =
 * ReplaceDefaultPolicyVersionParamsProperty.builder()
 * .templateName("templateName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-replacedefaultpolicyversionparams.html)
 */
@CdkDslMarker
public class CfnMitigationActionReplaceDefaultPolicyVersionParamsPropertyDsl {
    private val cdkBuilder: CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty.Builder =
        CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty.builder()

    /**
     * @param templateName The name of the template to be applied. The only supported value is
     *   `BLANK_POLICY` .
     */
    public fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
    }

    public fun build(): CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty =
        cdkBuilder.build()
}
