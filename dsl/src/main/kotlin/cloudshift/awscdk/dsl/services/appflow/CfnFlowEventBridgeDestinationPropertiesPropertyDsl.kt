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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when Amazon EventBridge is being used as a destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * EventBridgeDestinationPropertiesProperty eventBridgeDestinationPropertiesProperty =
 * EventBridgeDestinationPropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-eventbridgedestinationproperties.html)
 */
@CdkDslMarker
public class CfnFlowEventBridgeDestinationPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.EventBridgeDestinationPropertiesProperty.Builder =
        CfnFlow.EventBridgeDestinationPropertiesProperty.builder()

    /** @param errorHandlingConfig The object specified in the Amplitude flow source. */
    public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig)
    }

    /** @param errorHandlingConfig The object specified in the Amplitude flow source. */
    public fun errorHandlingConfig(errorHandlingConfig: CfnFlow.ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig)
    }

    /** @param object The object specified in the Amazon EventBridge flow destination. */
    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnFlow.EventBridgeDestinationPropertiesProperty = cdkBuilder.build()
}
