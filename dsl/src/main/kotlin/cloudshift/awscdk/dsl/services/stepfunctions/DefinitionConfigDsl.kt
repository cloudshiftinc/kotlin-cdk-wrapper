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

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine
import software.amazon.awscdk.services.stepfunctions.DefinitionConfig
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class DefinitionConfigDsl {
    private val cdkBuilder: DefinitionConfig.Builder = DefinitionConfig.builder()

    public fun definition(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.definition(builder.map)
    }

    public fun definition(definition: Any) {
        cdkBuilder.definition(definition)
    }

    public fun definitionS3Location(block: CfnStateMachineS3LocationPropertyDsl.() -> Unit = {}) {
        val builder = CfnStateMachineS3LocationPropertyDsl()
        builder.apply(block)
        cdkBuilder.definitionS3Location(builder.build())
    }

    public fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty) {
        cdkBuilder.definitionS3Location(definitionS3Location)
    }

    public fun definitionString(definitionString: String) {
        cdkBuilder.definitionString(definitionString)
    }

    public fun build(): DefinitionConfig = cdkBuilder.build()
}
