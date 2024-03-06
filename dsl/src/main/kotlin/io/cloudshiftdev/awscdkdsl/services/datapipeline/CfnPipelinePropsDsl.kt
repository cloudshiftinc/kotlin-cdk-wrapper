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

package io.cloudshiftdev.awscdkdsl.services.datapipeline

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datapipeline.CfnPipeline
import software.amazon.awscdk.services.datapipeline.CfnPipelineProps

/**
 * Properties for defining a `CfnPipeline`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datapipeline.*;
 * CfnPipelineProps cfnPipelineProps = CfnPipelineProps.builder()
 * .name("name")
 * // the properties below are optional
 * .activate(false)
 * .description("description")
 * .parameterObjects(List.of(ParameterObjectProperty.builder()
 * .attributes(List.of(ParameterAttributeProperty.builder()
 * .key("key")
 * .stringValue("stringValue")
 * .build()))
 * .id("id")
 * .build()))
 * .parameterValues(List.of(ParameterValueProperty.builder()
 * .id("id")
 * .stringValue("stringValue")
 * .build()))
 * .pipelineObjects(List.of(PipelineObjectProperty.builder()
 * .fields(List.of(FieldProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .refValue("refValue")
 * .stringValue("stringValue")
 * .build()))
 * .id("id")
 * .name("name")
 * .build()))
 * .pipelineTags(List.of(PipelineTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html)
 */
@CdkDslMarker
public class CfnPipelinePropsDsl {
    private val cdkBuilder: CfnPipelineProps.Builder = CfnPipelineProps.builder()

    private val _parameterObjects: MutableList<Any> = mutableListOf()

    private val _parameterValues: MutableList<Any> = mutableListOf()

    private val _pipelineObjects: MutableList<Any> = mutableListOf()

    private val _pipelineTags: MutableList<CfnPipeline.PipelineTagProperty> = mutableListOf()

    /**
     * @param activate Indicates whether to validate and start the pipeline or stop an active
     *   pipeline. By default, the value is set to `true` .
     */
    public fun activate(activate: Boolean) {
        cdkBuilder.activate(activate)
    }

    /**
     * @param activate Indicates whether to validate and start the pipeline or stop an active
     *   pipeline. By default, the value is set to `true` .
     */
    public fun activate(activate: IResolvable) {
        cdkBuilder.activate(activate)
    }

    /** @param description A description of the pipeline. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the pipeline. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param parameterObjects The parameter objects used with the pipeline. */
    public fun parameterObjects(vararg parameterObjects: Any) {
        _parameterObjects.addAll(listOf(*parameterObjects))
    }

    /** @param parameterObjects The parameter objects used with the pipeline. */
    public fun parameterObjects(parameterObjects: Collection<Any>) {
        _parameterObjects.addAll(parameterObjects)
    }

    /** @param parameterObjects The parameter objects used with the pipeline. */
    public fun parameterObjects(parameterObjects: IResolvable) {
        cdkBuilder.parameterObjects(parameterObjects)
    }

    /** @param parameterValues The parameter values used with the pipeline. */
    public fun parameterValues(vararg parameterValues: Any) {
        _parameterValues.addAll(listOf(*parameterValues))
    }

    /** @param parameterValues The parameter values used with the pipeline. */
    public fun parameterValues(parameterValues: Collection<Any>) {
        _parameterValues.addAll(parameterValues)
    }

    /** @param parameterValues The parameter values used with the pipeline. */
    public fun parameterValues(parameterValues: IResolvable) {
        cdkBuilder.parameterValues(parameterValues)
    }

    /**
     * @param pipelineObjects The objects that define the pipeline. These objects overwrite the
     *   existing pipeline definition. Not all objects, fields, and values can be updated. For
     *   information about restrictions, see
     *   [Editing Your Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     *   in the *AWS Data Pipeline Developer Guide* .
     */
    public fun pipelineObjects(vararg pipelineObjects: Any) {
        _pipelineObjects.addAll(listOf(*pipelineObjects))
    }

    /**
     * @param pipelineObjects The objects that define the pipeline. These objects overwrite the
     *   existing pipeline definition. Not all objects, fields, and values can be updated. For
     *   information about restrictions, see
     *   [Editing Your Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     *   in the *AWS Data Pipeline Developer Guide* .
     */
    public fun pipelineObjects(pipelineObjects: Collection<Any>) {
        _pipelineObjects.addAll(pipelineObjects)
    }

    /**
     * @param pipelineObjects The objects that define the pipeline. These objects overwrite the
     *   existing pipeline definition. Not all objects, fields, and values can be updated. For
     *   information about restrictions, see
     *   [Editing Your Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     *   in the *AWS Data Pipeline Developer Guide* .
     */
    public fun pipelineObjects(pipelineObjects: IResolvable) {
        cdkBuilder.pipelineObjects(pipelineObjects)
    }

    /**
     * @param pipelineTags A list of arbitrary tags (key-value pairs) to associate with the
     *   pipeline, which you can use to control permissions. For more information, see
     *   [Controlling Access to Pipelines and Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
     *   in the *AWS Data Pipeline Developer Guide* .
     */
    public fun pipelineTags(pipelineTags: CfnPipelinePipelineTagPropertyDsl.() -> Unit) {
        _pipelineTags.add(CfnPipelinePipelineTagPropertyDsl().apply(pipelineTags).build())
    }

    /**
     * @param pipelineTags A list of arbitrary tags (key-value pairs) to associate with the
     *   pipeline, which you can use to control permissions. For more information, see
     *   [Controlling Access to Pipelines and Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
     *   in the *AWS Data Pipeline Developer Guide* .
     */
    public fun pipelineTags(pipelineTags: Collection<CfnPipeline.PipelineTagProperty>) {
        _pipelineTags.addAll(pipelineTags)
    }

    public fun build(): CfnPipelineProps {
        if (_parameterObjects.isNotEmpty()) cdkBuilder.parameterObjects(_parameterObjects)
        if (_parameterValues.isNotEmpty()) cdkBuilder.parameterValues(_parameterValues)
        if (_pipelineObjects.isNotEmpty()) cdkBuilder.pipelineObjects(_pipelineObjects)
        if (_pipelineTags.isNotEmpty()) cdkBuilder.pipelineTags(_pipelineTags)
        return cdkBuilder.build()
    }
}
