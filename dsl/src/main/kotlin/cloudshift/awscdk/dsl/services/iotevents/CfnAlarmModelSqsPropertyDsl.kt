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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

/**
 * Sends information about the detector model instance and the event that triggered the action to an
 * Amazon SQS queue.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * SqsProperty sqsProperty = SqsProperty.builder()
 * .queueUrl("queueUrl")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .useBase64(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-sqs.html)
 */
@CdkDslMarker
public class CfnAlarmModelSqsPropertyDsl {
    private val cdkBuilder: CfnAlarmModel.SqsProperty.Builder = CfnAlarmModel.SqsProperty.builder()

    /**
     * @param payload You can configure the action payload when you send a message to an Amazon SQS
     *   queue.
     */
    public fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload)
    }

    /**
     * @param payload You can configure the action payload when you send a message to an Amazon SQS
     *   queue.
     */
    public fun payload(payload: CfnAlarmModel.PayloadProperty) {
        cdkBuilder.payload(payload)
    }

    /** @param queueUrl The URL of the SQS queue where the data is written. */
    public fun queueUrl(queueUrl: String) {
        cdkBuilder.queueUrl(queueUrl)
    }

    /**
     * @param useBase64 Set this to TRUE if you want the data to be base-64 encoded before it is
     *   written to the queue. Otherwise, set this to FALSE.
     */
    public fun useBase64(useBase64: Boolean) {
        cdkBuilder.useBase64(useBase64)
    }

    /**
     * @param useBase64 Set this to TRUE if you want the data to be base-64 encoded before it is
     *   written to the queue. Otherwise, set this to FALSE.
     */
    public fun useBase64(useBase64: IResolvable) {
        cdkBuilder.useBase64(useBase64)
    }

    public fun build(): CfnAlarmModel.SqsProperty = cdkBuilder.build()
}
