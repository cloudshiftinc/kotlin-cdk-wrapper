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

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnInput
import software.amazon.awscdk.services.iotevents.CfnInputProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnInputPropsDsl {
    private val cdkBuilder: CfnInputProps.Builder = CfnInputProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun inputDefinition(inputDefinition: IResolvable) {
        cdkBuilder.inputDefinition(inputDefinition)
    }

    public fun inputDefinition(inputDefinition: CfnInput.InputDefinitionProperty) {
        cdkBuilder.inputDefinition(inputDefinition)
    }

    public fun inputDescription(inputDescription: String) {
        cdkBuilder.inputDescription(inputDescription)
    }

    public fun inputName(inputName: String) {
        cdkBuilder.inputName(inputName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnInputProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
