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

package cloudshift.awscdk.dsl.services.oam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.oam.CfnLink
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLinkDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLink.Builder = CfnLink.Builder.create(scope, id)

    private val _resourceTypes: MutableList<String> = mutableListOf()

    public fun labelTemplate(labelTemplate: String) {
        cdkBuilder.labelTemplate(labelTemplate)
    }

    public fun resourceTypes(vararg resourceTypes: String) {
        _resourceTypes.addAll(listOf(*resourceTypes))
    }

    public fun resourceTypes(resourceTypes: Collection<String>) {
        _resourceTypes.addAll(resourceTypes)
    }

    public fun sinkIdentifier(sinkIdentifier: String) {
        cdkBuilder.sinkIdentifier(sinkIdentifier)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnLink {
        if (_resourceTypes.isNotEmpty()) cdkBuilder.resourceTypes(_resourceTypes)
        return cdkBuilder.build()
    }
}
