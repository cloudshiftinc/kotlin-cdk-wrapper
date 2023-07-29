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

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine
import software.amazon.awscdk.services.stepfunctions.DefinitionConfig

/**
 * Partial object from the StateMachine L1 construct properties containing definition information.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * Object definition;
 * DefinitionConfig definitionConfig = DefinitionConfig.builder()
 * .definition(definition)
 * .definitionS3Location(S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .version("version")
 * .build())
 * .definitionString("definitionString")
 * .build();
 * ```
 */
@CdkDslMarker
public class DefinitionConfigDsl {
    private val cdkBuilder: DefinitionConfig.Builder = DefinitionConfig.builder()

    /** @param definition the value to be set. */
    public fun definition(definition: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(definition)
        cdkBuilder.definition(builder.map)
    }

    /** @param definition the value to be set. */
    public fun definition(definition: Any) {
        cdkBuilder.definition(definition)
    }

    /** @param definitionS3Location the value to be set. */
    public fun definitionS3Location(
        definitionS3Location: CfnStateMachineS3LocationPropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnStateMachineS3LocationPropertyDsl()
        builder.apply(definitionS3Location)
        cdkBuilder.definitionS3Location(builder.build())
    }

    /** @param definitionS3Location the value to be set. */
    public fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty) {
        cdkBuilder.definitionS3Location(definitionS3Location)
    }

    /** @param definitionString the value to be set. */
    public fun definitionString(definitionString: String) {
        cdkBuilder.definitionString(definitionString)
    }

    public fun build(): DefinitionConfig = cdkBuilder.build()
}
