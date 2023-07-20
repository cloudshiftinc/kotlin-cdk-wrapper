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

package cloudshift.awscdk.dsl.services.ram

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ram.CfnPermissionProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPermissionPropsDsl {
    private val cdkBuilder: CfnPermissionProps.Builder = CfnPermissionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun policyTemplate(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.policyTemplate(builder.map)
    }

    public fun policyTemplate(policyTemplate: Any) {
        cdkBuilder.policyTemplate(policyTemplate)
    }

    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPermissionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
