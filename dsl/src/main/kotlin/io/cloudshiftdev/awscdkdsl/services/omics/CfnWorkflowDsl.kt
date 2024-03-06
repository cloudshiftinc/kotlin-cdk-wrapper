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
import software.amazon.awscdk.services.omics.CfnWorkflow
import software.constructs.Construct

/**
 * Creates a workflow.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.omics.*;
 * CfnWorkflow cfnWorkflow = CfnWorkflow.Builder.create(this, "MyCfnWorkflow")
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
public class CfnWorkflowDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnWorkflow.Builder = CfnWorkflow.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-accelerators)
     *
     * @param accelerators
     */
    public fun accelerators(accelerators: String) {
        cdkBuilder.accelerators(accelerators)
    }

    /**
     * The URI of a definition for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-definitionuri)
     *
     * @param definitionUri The URI of a definition for the workflow.
     */
    public fun definitionUri(definitionUri: String) {
        cdkBuilder.definitionUri(definitionUri)
    }

    /**
     * The parameter's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-description)
     *
     * @param description The parameter's description.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * An engine for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-engine)
     *
     * @param engine An engine for the workflow.
     */
    public fun engine(engine: String) {
        cdkBuilder.engine(engine)
    }

    /**
     * The path of the main definition file for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-main)
     *
     * @param main The path of the main definition file for the workflow.
     */
    public fun main(main: String) {
        cdkBuilder.main(main)
    }

    /**
     * The workflow's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-name)
     *
     * @param name The workflow's name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The workflow's parameter template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-parametertemplate)
     *
     * @param parameterTemplate The workflow's parameter template.
     */
    public fun parameterTemplate(parameterTemplate: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameterTemplate)
        cdkBuilder.parameterTemplate(builder.map)
    }

    /**
     * The workflow's parameter template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-parametertemplate)
     *
     * @param parameterTemplate The workflow's parameter template.
     */
    public fun parameterTemplate(parameterTemplate: Map<String, Any>) {
        cdkBuilder.parameterTemplate(parameterTemplate)
    }

    /**
     * The workflow's parameter template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-parametertemplate)
     *
     * @param parameterTemplate The workflow's parameter template.
     */
    public fun parameterTemplate(parameterTemplate: IResolvable) {
        cdkBuilder.parameterTemplate(parameterTemplate)
    }

    /**
     * A storage capacity for the workflow in gibibytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-storagecapacity)
     *
     * @param storageCapacity A storage capacity for the workflow in gibibytes.
     */
    public fun storageCapacity(storageCapacity: Number) {
        cdkBuilder.storageCapacity(storageCapacity)
    }

    /**
     * Tags for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-tags)
     *
     * @param tags Tags for the workflow.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnWorkflow = cdkBuilder.build()
}
