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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.connect.CfnContactFlowModuleProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnContactFlowModulePropsDsl {
    private val cdkBuilder: CfnContactFlowModuleProps.Builder = CfnContactFlowModuleProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun content(content: String) {
        cdkBuilder.content(content)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnContactFlowModuleProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
