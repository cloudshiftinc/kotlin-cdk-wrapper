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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnInput

/**
 * Settings that apply only if the input is a MediaConnect input.
 *
 * The parent of this entity is Input.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MediaConnectFlowRequestProperty mediaConnectFlowRequestProperty =
 * MediaConnectFlowRequestProperty.builder()
 * .flowArn("flowArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-mediaconnectflowrequest.html)
 */
@CdkDslMarker
public class CfnInputMediaConnectFlowRequestPropertyDsl {
    private val cdkBuilder: CfnInput.MediaConnectFlowRequestProperty.Builder =
        CfnInput.MediaConnectFlowRequestProperty.builder()

    /**
     * @param flowArn The ARN of one or two MediaConnect flows that are the sources for this
     *   MediaConnect input.
     */
    public fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
    }

    public fun build(): CfnInput.MediaConnectFlowRequestProperty = cdkBuilder.build()
}
