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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnEventInvokeConfigPropsDsl {
    private val cdkBuilder: CfnEventInvokeConfigProps.Builder = CfnEventInvokeConfigProps.builder()

    public fun destinationConfig(destinationConfig: IResolvable) {
        cdkBuilder.destinationConfig(destinationConfig)
    }

    public fun destinationConfig(destinationConfig: CfnEventInvokeConfig.DestinationConfigProperty) {
        cdkBuilder.destinationConfig(destinationConfig)
    }

    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
        cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
    }

    public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    public fun qualifier(qualifier: String) {
        cdkBuilder.qualifier(qualifier)
    }

    public fun build(): CfnEventInvokeConfigProps = cdkBuilder.build()
}
