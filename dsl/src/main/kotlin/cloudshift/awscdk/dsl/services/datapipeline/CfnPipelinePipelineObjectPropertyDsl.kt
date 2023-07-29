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

package cloudshift.awscdk.dsl.services.datapipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datapipeline.CfnPipeline

/**
 * PipelineObject is property of the AWS::DataPipeline::Pipeline resource that contains information
 * about a pipeline object.
 *
 * This can be a logical, physical, or physical attempt pipeline object. The complete set of
 * components of a pipeline defines the pipeline.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datapipeline.*;
 * PipelineObjectProperty pipelineObjectProperty = PipelineObjectProperty.builder()
 * .fields(List.of(FieldProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .refValue("refValue")
 * .stringValue("stringValue")
 * .build()))
 * .id("id")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobject.html)
 */
@CdkDslMarker
public class CfnPipelinePipelineObjectPropertyDsl {
    private val cdkBuilder: CfnPipeline.PipelineObjectProperty.Builder =
        CfnPipeline.PipelineObjectProperty.builder()

    private val _fields: MutableList<Any> = mutableListOf()

    /** @param fields Key-value pairs that define the properties of the object. */
    public fun fields(vararg fields: Any) {
        _fields.addAll(listOf(*fields))
    }

    /** @param fields Key-value pairs that define the properties of the object. */
    public fun fields(fields: Collection<Any>) {
        _fields.addAll(fields)
    }

    /** @param fields Key-value pairs that define the properties of the object. */
    public fun fields(fields: IResolvable) {
        cdkBuilder.fields(fields)
    }

    /** @param id The ID of the object. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /** @param name The name of the object. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnPipeline.PipelineObjectProperty {
        if (_fields.isNotEmpty()) cdkBuilder.fields(_fields)
        return cdkBuilder.build()
    }
}
