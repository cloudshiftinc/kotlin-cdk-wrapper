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

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

/**
 * Calls a Lambda function, passing in information about the detector model instance and the event
 * that triggered the action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * LambdaProperty lambdaProperty = LambdaProperty.builder()
 * .functionArn("functionArn")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-lambda.html)
 */
@CdkDslMarker
public class CfnAlarmModelLambdaPropertyDsl {
    private val cdkBuilder: CfnAlarmModel.LambdaProperty.Builder =
        CfnAlarmModel.LambdaProperty.builder()

    /** @param functionArn The ARN of the Lambda function that is executed. */
    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    /**
     * @param payload You can configure the action payload when you send a message to a Lambda
     *   function.
     */
    public fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload)
    }

    /**
     * @param payload You can configure the action payload when you send a message to a Lambda
     *   function.
     */
    public fun payload(payload: CfnAlarmModel.PayloadProperty) {
        cdkBuilder.payload(payload)
    }

    public fun build(): CfnAlarmModel.LambdaProperty = cdkBuilder.build()
}
