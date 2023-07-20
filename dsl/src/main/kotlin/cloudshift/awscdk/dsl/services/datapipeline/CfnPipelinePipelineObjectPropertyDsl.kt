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

package cloudshift.awscdk.dsl.services.datapipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datapipeline.CfnPipeline
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPipelinePipelineObjectPropertyDsl {
    private val cdkBuilder: CfnPipeline.PipelineObjectProperty.Builder =
        CfnPipeline.PipelineObjectProperty.builder()

    private val _fields: MutableList<Any> = mutableListOf()

    public fun fields(vararg fields: Any) {
        _fields.addAll(listOf(*fields))
    }

    public fun fields(fields: Collection<Any>) {
        _fields.addAll(fields)
    }

    public fun fields(fields: IResolvable) {
        cdkBuilder.fields(fields)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnPipeline.PipelineObjectProperty {
        if (_fields.isNotEmpty()) cdkBuilder.fields(_fields)
        return cdkBuilder.build()
    }
}
