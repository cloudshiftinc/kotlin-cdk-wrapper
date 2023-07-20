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

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnSceneProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnScenePropsDsl {
    private val cdkBuilder: CfnSceneProps.Builder = CfnSceneProps.builder()

    private val _capabilities: MutableList<String> = mutableListOf()

    public fun capabilities(vararg capabilities: String) {
        _capabilities.addAll(listOf(*capabilities))
    }

    public fun capabilities(capabilities: Collection<String>) {
        _capabilities.addAll(capabilities)
    }

    public fun contentLocation(contentLocation: String) {
        cdkBuilder.contentLocation(contentLocation)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun sceneId(sceneId: String) {
        cdkBuilder.sceneId(sceneId)
    }

    public fun sceneMetadata(sceneMetadata: Map<String, String>) {
        cdkBuilder.sceneMetadata(sceneMetadata)
    }

    public fun sceneMetadata(sceneMetadata: IResolvable) {
        cdkBuilder.sceneMetadata(sceneMetadata)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun workspaceId(workspaceId: String) {
        cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): CfnSceneProps {
        if (_capabilities.isNotEmpty()) cdkBuilder.capabilities(_capabilities)
        return cdkBuilder.build()
    }
}
