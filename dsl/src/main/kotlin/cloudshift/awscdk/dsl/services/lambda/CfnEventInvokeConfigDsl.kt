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
import software.constructs.Construct
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnEventInvokeConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEventInvokeConfig.Builder = CfnEventInvokeConfig.Builder.create(
        scope,
        id,
    )

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

    public fun build(): CfnEventInvokeConfig = cdkBuilder.build()
}
