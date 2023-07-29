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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * EventSourceProperty eventSourceProperty = EventSourceProperty.builder()
 * .properties(AlexaSkillEventProperty.builder()
 * .variables(Map.of(
 * "variablesKey", "variables"))
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventsource.html)
 */
@CdkDslMarker
public class CfnFunctionEventSourcePropertyDsl {
    private val cdkBuilder: CfnFunction.EventSourceProperty.Builder =
        CfnFunction.EventSourceProperty.builder()

    /** @param properties the value to be set. */
    public fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: CfnFunction.AlexaSkillEventProperty) {
        cdkBuilder.properties(properties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: CfnFunction.ApiEventProperty) {
        cdkBuilder.properties(properties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: CfnFunction.CloudWatchEventEventProperty) {
        cdkBuilder.properties(properties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: CfnFunction.CloudWatchLogsEventProperty) {
        cdkBuilder.properties(properties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: CfnFunction.CognitoEventProperty) {
        cdkBuilder.properties(properties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: CfnFunction.DynamoDBEventProperty) {
        cdkBuilder.properties(properties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: CfnFunction.EventBridgeRuleEventProperty) {
        cdkBuilder.properties(properties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: CfnFunction.HttpApiEventProperty) {
        cdkBuilder.properties(properties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: CfnFunction.IoTRuleEventProperty) {
        cdkBuilder.properties(properties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: CfnFunction.KinesisEventProperty) {
        cdkBuilder.properties(properties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: CfnFunction.S3EventProperty) {
        cdkBuilder.properties(properties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: CfnFunction.SNSEventProperty) {
        cdkBuilder.properties(properties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: CfnFunction.SQSEventProperty) {
        cdkBuilder.properties(properties)
    }

    /** @param properties the value to be set. */
    public fun properties(properties: CfnFunction.ScheduleEventProperty) {
        cdkBuilder.properties(properties)
    }

    /** @param type the value to be set. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnFunction.EventSourceProperty = cdkBuilder.build()
}
