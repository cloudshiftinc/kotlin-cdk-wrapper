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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
import kotlin.String

@CdkDslMarker
public class CfnApplicationOutputV2OutputPropertyDsl {
    private val cdkBuilder: CfnApplicationOutputV2.OutputProperty.Builder =
        CfnApplicationOutputV2.OutputProperty.builder()

    public fun destinationSchema(destinationSchema: IResolvable) {
        cdkBuilder.destinationSchema(destinationSchema)
    }

    public fun destinationSchema(destinationSchema: CfnApplicationOutputV2.DestinationSchemaProperty) {
        cdkBuilder.destinationSchema(destinationSchema)
    }

    public fun kinesisFirehoseOutput(kinesisFirehoseOutput: IResolvable) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput)
    }

    public fun kinesisFirehoseOutput(kinesisFirehoseOutput: CfnApplicationOutputV2.KinesisFirehoseOutputProperty) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput)
    }

    public fun kinesisStreamsOutput(kinesisStreamsOutput: IResolvable) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput)
    }

    public fun kinesisStreamsOutput(kinesisStreamsOutput: CfnApplicationOutputV2.KinesisStreamsOutputProperty) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput)
    }

    public fun lambdaOutput(lambdaOutput: IResolvable) {
        cdkBuilder.lambdaOutput(lambdaOutput)
    }

    public fun lambdaOutput(lambdaOutput: CfnApplicationOutputV2.LambdaOutputProperty) {
        cdkBuilder.lambdaOutput(lambdaOutput)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnApplicationOutputV2.OutputProperty = cdkBuilder.build()
}
