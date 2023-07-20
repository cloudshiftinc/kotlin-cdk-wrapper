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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput
import kotlin.String

@CdkDslMarker
public class CfnApplicationOutputOutputPropertyDsl {
    private val cdkBuilder: CfnApplicationOutput.OutputProperty.Builder =
        CfnApplicationOutput.OutputProperty.builder()

    public fun destinationSchema(destinationSchema: IResolvable) {
        cdkBuilder.destinationSchema(destinationSchema)
    }

    public fun destinationSchema(destinationSchema: CfnApplicationOutput.DestinationSchemaProperty) {
        cdkBuilder.destinationSchema(destinationSchema)
    }

    public fun kinesisFirehoseOutput(kinesisFirehoseOutput: IResolvable) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput)
    }

    public fun kinesisFirehoseOutput(kinesisFirehoseOutput: CfnApplicationOutput.KinesisFirehoseOutputProperty) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput)
    }

    public fun kinesisStreamsOutput(kinesisStreamsOutput: IResolvable) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput)
    }

    public fun kinesisStreamsOutput(kinesisStreamsOutput: CfnApplicationOutput.KinesisStreamsOutputProperty) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput)
    }

    public fun lambdaOutput(lambdaOutput: IResolvable) {
        cdkBuilder.lambdaOutput(lambdaOutput)
    }

    public fun lambdaOutput(lambdaOutput: CfnApplicationOutput.LambdaOutputProperty) {
        cdkBuilder.lambdaOutput(lambdaOutput)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnApplicationOutput.OutputProperty = cdkBuilder.build()
}
