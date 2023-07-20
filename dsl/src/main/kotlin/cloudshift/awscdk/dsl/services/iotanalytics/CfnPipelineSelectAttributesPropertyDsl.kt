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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotanalytics.CfnPipeline
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPipelineSelectAttributesPropertyDsl {
    private val cdkBuilder: CfnPipeline.SelectAttributesProperty.Builder =
        CfnPipeline.SelectAttributesProperty.builder()

    private val _attributes: MutableList<String> = mutableListOf()

    public fun attributes(vararg attributes: String) {
        _attributes.addAll(listOf(*attributes))
    }

    public fun attributes(attributes: Collection<String>) {
        _attributes.addAll(attributes)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun next(next: String) {
        cdkBuilder.next(next)
    }

    public fun build(): CfnPipeline.SelectAttributesProperty {
        if (_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
        return cdkBuilder.build()
    }
}
