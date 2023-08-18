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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnQueue

/**
 * The outbound caller ID name, number, and outbound whisper flow.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * OutboundCallerConfigProperty outboundCallerConfigProperty =
 * OutboundCallerConfigProperty.builder()
 * .outboundCallerIdName("outboundCallerIdName")
 * .outboundCallerIdNumberArn("outboundCallerIdNumberArn")
 * .outboundFlowArn("outboundFlowArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-queue-outboundcallerconfig.html)
 */
@CdkDslMarker
public class CfnQueueOutboundCallerConfigPropertyDsl {
    private val cdkBuilder: CfnQueue.OutboundCallerConfigProperty.Builder =
        CfnQueue.OutboundCallerConfigProperty.builder()

    /** @param outboundCallerIdName The caller ID name. */
    public fun outboundCallerIdName(outboundCallerIdName: String) {
        cdkBuilder.outboundCallerIdName(outboundCallerIdName)
    }

    /**
     * @param outboundCallerIdNumberArn The Amazon Resource Name (ARN) of the outbound caller ID
     *   number.
     *
     * Only use the phone number ARN format that doesn't contain `instance` in the path, for
     * example, `arn:aws:connect:us-east-1:1234567890:phone-number/uuid` . This is the same ARN
     * format that is returned when you create a phone number using CloudFormation , or when you
     * call the
     * [ListPhoneNumbersV2](https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html)
     * API.
     */
    public fun outboundCallerIdNumberArn(outboundCallerIdNumberArn: String) {
        cdkBuilder.outboundCallerIdNumberArn(outboundCallerIdNumberArn)
    }

    /** @param outboundFlowArn The Amazon Resource Name (ARN) of the outbound flow. */
    public fun outboundFlowArn(outboundFlowArn: String) {
        cdkBuilder.outboundFlowArn(outboundFlowArn)
    }

    public fun build(): CfnQueue.OutboundCallerConfigProperty = cdkBuilder.build()
}
