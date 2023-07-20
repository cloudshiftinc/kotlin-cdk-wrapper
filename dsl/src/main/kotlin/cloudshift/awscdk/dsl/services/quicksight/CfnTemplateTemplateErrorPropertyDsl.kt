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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplateTemplateErrorPropertyDsl {
    private val cdkBuilder: CfnTemplate.TemplateErrorProperty.Builder =
        CfnTemplate.TemplateErrorProperty.builder()

    private val _violatedEntities: MutableList<Any> = mutableListOf()

    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun violatedEntities(vararg violatedEntities: Any) {
        _violatedEntities.addAll(listOf(*violatedEntities))
    }

    public fun violatedEntities(violatedEntities: Collection<Any>) {
        _violatedEntities.addAll(violatedEntities)
    }

    public fun violatedEntities(violatedEntities: IResolvable) {
        cdkBuilder.violatedEntities(violatedEntities)
    }

    public fun build(): CfnTemplate.TemplateErrorProperty {
        if (_violatedEntities.isNotEmpty()) cdkBuilder.violatedEntities(_violatedEntities)
        return cdkBuilder.build()
    }
}
