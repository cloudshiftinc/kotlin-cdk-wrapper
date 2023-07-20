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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationInputPropertyDsl {
    private val cdkBuilder: CfnApplication.InputProperty.Builder =
        CfnApplication.InputProperty.builder()

    public fun inputParallelism(inputParallelism: IResolvable) {
        cdkBuilder.inputParallelism(inputParallelism)
    }

    public fun inputParallelism(inputParallelism: CfnApplication.InputParallelismProperty) {
        cdkBuilder.inputParallelism(inputParallelism)
    }

    public fun inputProcessingConfiguration(inputProcessingConfiguration: IResolvable) {
        cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration)
    }

    public fun inputProcessingConfiguration(inputProcessingConfiguration: CfnApplication.InputProcessingConfigurationProperty) {
        cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration)
    }

    public fun inputSchema(inputSchema: IResolvable) {
        cdkBuilder.inputSchema(inputSchema)
    }

    public fun inputSchema(inputSchema: CfnApplication.InputSchemaProperty) {
        cdkBuilder.inputSchema(inputSchema)
    }

    public fun kinesisFirehoseInput(kinesisFirehoseInput: IResolvable) {
        cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput)
    }

    public fun kinesisFirehoseInput(kinesisFirehoseInput: CfnApplication.KinesisFirehoseInputProperty) {
        cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput)
    }

    public fun kinesisStreamsInput(kinesisStreamsInput: IResolvable) {
        cdkBuilder.kinesisStreamsInput(kinesisStreamsInput)
    }

    public fun kinesisStreamsInput(kinesisStreamsInput: CfnApplication.KinesisStreamsInputProperty) {
        cdkBuilder.kinesisStreamsInput(kinesisStreamsInput)
    }

    public fun namePrefix(namePrefix: String) {
        cdkBuilder.namePrefix(namePrefix)
    }

    public fun build(): CfnApplication.InputProperty = cdkBuilder.build()
}
