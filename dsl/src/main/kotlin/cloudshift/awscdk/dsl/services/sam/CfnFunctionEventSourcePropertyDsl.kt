@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionEventSourcePropertyDsl {
    private val cdkBuilder: CfnFunction.EventSourceProperty.Builder =
        CfnFunction.EventSourceProperty.builder()

    public fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnFunction.AlexaSkillEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnFunction.ApiEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnFunction.CloudWatchEventEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnFunction.CloudWatchLogsEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnFunction.CognitoEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnFunction.DynamoDBEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnFunction.EventBridgeRuleEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnFunction.HttpApiEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnFunction.IoTRuleEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnFunction.KinesisEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnFunction.S3EventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnFunction.SNSEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnFunction.SQSEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnFunction.ScheduleEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnFunction.EventSourceProperty = cdkBuilder.build()
}
