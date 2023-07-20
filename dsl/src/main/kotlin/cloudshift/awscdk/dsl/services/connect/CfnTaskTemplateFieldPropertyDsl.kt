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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnTaskTemplate
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTaskTemplateFieldPropertyDsl {
    private val cdkBuilder: CfnTaskTemplate.FieldProperty.Builder =
        CfnTaskTemplate.FieldProperty.builder()

    private val _singleSelectOptions: MutableList<String> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun id(id: IResolvable) {
        cdkBuilder.id(id)
    }

    public fun id(id: CfnTaskTemplate.FieldIdentifierProperty) {
        cdkBuilder.id(id)
    }

    public fun singleSelectOptions(vararg singleSelectOptions: String) {
        _singleSelectOptions.addAll(listOf(*singleSelectOptions))
    }

    public fun singleSelectOptions(singleSelectOptions: Collection<String>) {
        _singleSelectOptions.addAll(singleSelectOptions)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTaskTemplate.FieldProperty {
        if (_singleSelectOptions.isNotEmpty()) cdkBuilder.singleSelectOptions(_singleSelectOptions)
        return cdkBuilder.build()
    }
}
