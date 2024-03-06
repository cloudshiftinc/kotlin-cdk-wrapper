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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline

/**
 * Contains a key/value pair that sets the named workflow parameter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * WorkflowParameterProperty workflowParameterProperty = WorkflowParameterProperty.builder()
 * .name("name")
 * .value(List.of("value"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowparameter.html)
 */
@CdkDslMarker
public class CfnImagePipelineWorkflowParameterPropertyDsl {
    private val cdkBuilder: CfnImagePipeline.WorkflowParameterProperty.Builder =
        CfnImagePipeline.WorkflowParameterProperty.builder()

    private val _value: MutableList<String> = mutableListOf()

    /** @param name The name of the workflow parameter to set. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value Sets the value for the named workflow parameter. */
    public fun `value`(vararg `value`: String) {
        _value.addAll(listOf(*`value`))
    }

    /** @param value Sets the value for the named workflow parameter. */
    public fun `value`(`value`: Collection<String>) {
        _value.addAll(`value`)
    }

    public fun build(): CfnImagePipeline.WorkflowParameterProperty {
        if (_value.isNotEmpty()) cdkBuilder.`value`(_value)
        return cdkBuilder.build()
    }
}
