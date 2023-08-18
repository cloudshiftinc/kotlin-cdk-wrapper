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

package io.cloudshiftdev.awscdkdsl.services.controltower

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.controltower.CfnEnabledControl
import software.constructs.Construct

/**
 * The resource represents an enabled control.
 *
 * It specifies an asynchronous operation that creates AWS resources on the specified organizational
 * unit and the accounts it contains. The resources created will vary according to the control that
 * you specify.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.controltower.*;
 * CfnEnabledControl cfnEnabledControl = CfnEnabledControl.Builder.create(this,
 * "MyCfnEnabledControl")
 * .controlIdentifier("controlIdentifier")
 * .targetIdentifier("targetIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html)
 */
@CdkDslMarker
public class CfnEnabledControlDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEnabledControl.Builder = CfnEnabledControl.Builder.create(scope, id)

    /**
     * The ARN of the control.
     *
     * Only *Strongly recommended* and *Elective* controls are permitted, with the exception of the
     * *Region deny* guardrail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-controlidentifier)
     *
     * @param controlIdentifier The ARN of the control.
     */
    public fun controlIdentifier(controlIdentifier: String) {
        cdkBuilder.controlIdentifier(controlIdentifier)
    }

    /**
     * The ARN of the organizational unit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-targetidentifier)
     *
     * @param targetIdentifier The ARN of the organizational unit.
     */
    public fun targetIdentifier(targetIdentifier: String) {
        cdkBuilder.targetIdentifier(targetIdentifier)
    }

    public fun build(): CfnEnabledControl = cdkBuilder.build()
}
