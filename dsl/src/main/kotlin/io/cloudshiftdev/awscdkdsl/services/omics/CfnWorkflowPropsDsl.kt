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

package io.cloudshiftdev.awscdkdsl.services.omics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnWorkflowProps

/**
 * Properties for defining a `CfnWorkflow`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.omics.*;
 * CfnWorkflowProps cfnWorkflowProps = CfnWorkflowProps.builder()
 * .accelerators("accelerators")
 * .definitionUri("definitionUri")
 * .description("description")
 * .engine("engine")
 * .main("main")
 * .name("name")
 * .parameterTemplate(Map.of(
 * "parameterTemplateKey", WorkflowParameterProperty.builder()
 * .description("description")
 * .optional(false)
 * .build()))
 * .storageCapacity(123)
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html)
 */
@CdkDslMarker
public class CfnWorkflowPropsDsl {
    private val cdkBuilder: CfnWorkflowProps.Builder = CfnWorkflowProps.builder()

    /** @param accelerators the value to be set. */
    public fun accelerators(accelerators: String) {
        cdkBuilder.accelerators(accelerators)
    }

    /** @param definitionUri The URI of a definition for the workflow. */
    public fun definitionUri(definitionUri: String) {
        cdkBuilder.definitionUri(definitionUri)
    }

    /** @param description The parameter's description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param engine An engine for the workflow. */
    public fun engine(engine: String) {
        cdkBuilder.engine(engine)
    }

    /** @param main The path of the main definition file for the workflow. */
    public fun main(main: String) {
        cdkBuilder.main(main)
    }

    /** @param name The workflow's name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param parameterTemplate The workflow's parameter template. */
    public fun parameterTemplate(parameterTemplate: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameterTemplate)
        cdkBuilder.parameterTemplate(builder.map)
    }

    /** @param parameterTemplate The workflow's parameter template. */
    public fun parameterTemplate(parameterTemplate: Map<String, Any>) {
        cdkBuilder.parameterTemplate(parameterTemplate)
    }

    /** @param parameterTemplate The workflow's parameter template. */
    public fun parameterTemplate(parameterTemplate: IResolvable) {
        cdkBuilder.parameterTemplate(parameterTemplate)
    }

    /** @param storageCapacity A storage capacity for the workflow in gigabytes. */
    public fun storageCapacity(storageCapacity: Number) {
        cdkBuilder.storageCapacity(storageCapacity)
    }

    /** @param tags Tags for the workflow. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnWorkflowProps = cdkBuilder.build()
}
