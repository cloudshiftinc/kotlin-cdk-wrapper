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

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline

/**
 * Contains control settings and configurable inputs for a workflow resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * WorkflowConfigurationProperty workflowConfigurationProperty =
 * WorkflowConfigurationProperty.builder()
 * .onFailure("onFailure")
 * .parallelGroup("parallelGroup")
 * .parameters(List.of(WorkflowParameterProperty.builder()
 * .name("name")
 * .value(List.of("value"))
 * .build()))
 * .workflowArn("workflowArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowconfiguration.html)
 */
@CdkDslMarker
public class CfnImagePipelineWorkflowConfigurationPropertyDsl {
    private val cdkBuilder: CfnImagePipeline.WorkflowConfigurationProperty.Builder =
        CfnImagePipeline.WorkflowConfigurationProperty.builder()

    private val _parameters: MutableList<Any> = mutableListOf()

    /** @param onFailure The action to take if the workflow fails. */
    public fun onFailure(onFailure: String) {
        cdkBuilder.onFailure(onFailure)
    }

    /**
     * @param parallelGroup Test workflows are defined within named runtime groups called parallel
     *   groups. The parallel group is the named group that contains this test workflow. Test
     *   workflows within a parallel group can run at the same time. Image Builder starts up to five
     *   test workflows in the group at the same time, and starts additional workflows as others
     *   complete, until all workflows in the group have completed. This field only applies for test
     *   workflows.
     */
    public fun parallelGroup(parallelGroup: String) {
        cdkBuilder.parallelGroup(parallelGroup)
    }

    /**
     * @param parameters Contains parameter values for each of the parameters that the workflow
     *   document defined for the workflow resource.
     */
    public fun parameters(vararg parameters: Any) {
        _parameters.addAll(listOf(*parameters))
    }

    /**
     * @param parameters Contains parameter values for each of the parameters that the workflow
     *   document defined for the workflow resource.
     */
    public fun parameters(parameters: Collection<Any>) {
        _parameters.addAll(parameters)
    }

    /**
     * @param parameters Contains parameter values for each of the parameters that the workflow
     *   document defined for the workflow resource.
     */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /** @param workflowArn The Amazon Resource Name (ARN) of the workflow resource. */
    public fun workflowArn(workflowArn: String) {
        cdkBuilder.workflowArn(workflowArn)
    }

    public fun build(): CfnImagePipeline.WorkflowConfigurationProperty {
        if (_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
        return cdkBuilder.build()
    }
}
