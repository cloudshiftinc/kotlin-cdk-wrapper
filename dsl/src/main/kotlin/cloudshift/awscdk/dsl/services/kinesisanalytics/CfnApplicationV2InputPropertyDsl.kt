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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.String

@CdkDslMarker
public class CfnApplicationV2InputPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.InputProperty.Builder =
        CfnApplicationV2.InputProperty.builder()

    public fun inputParallelism(inputParallelism: IResolvable) {
        cdkBuilder.inputParallelism(inputParallelism)
    }

    public fun inputParallelism(inputParallelism: CfnApplicationV2.InputParallelismProperty) {
        cdkBuilder.inputParallelism(inputParallelism)
    }

    public fun inputProcessingConfiguration(inputProcessingConfiguration: IResolvable) {
        cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration)
    }

    public fun inputProcessingConfiguration(inputProcessingConfiguration: CfnApplicationV2.InputProcessingConfigurationProperty) {
        cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration)
    }

    public fun inputSchema(inputSchema: IResolvable) {
        cdkBuilder.inputSchema(inputSchema)
    }

    public fun inputSchema(inputSchema: CfnApplicationV2.InputSchemaProperty) {
        cdkBuilder.inputSchema(inputSchema)
    }

    public fun kinesisFirehoseInput(kinesisFirehoseInput: IResolvable) {
        cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput)
    }

    public fun kinesisFirehoseInput(kinesisFirehoseInput: CfnApplicationV2.KinesisFirehoseInputProperty) {
        cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput)
    }

    public fun kinesisStreamsInput(kinesisStreamsInput: IResolvable) {
        cdkBuilder.kinesisStreamsInput(kinesisStreamsInput)
    }

    public fun kinesisStreamsInput(kinesisStreamsInput: CfnApplicationV2.KinesisStreamsInputProperty) {
        cdkBuilder.kinesisStreamsInput(kinesisStreamsInput)
    }

    public fun namePrefix(namePrefix: String) {
        cdkBuilder.namePrefix(namePrefix)
    }

    public fun build(): CfnApplicationV2.InputProperty = cdkBuilder.build()
}
