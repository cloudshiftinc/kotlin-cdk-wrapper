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

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnSceneProps

/**
 * Properties for defining a `CfnScene`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * CfnSceneProps cfnSceneProps = CfnSceneProps.builder()
 * .contentLocation("contentLocation")
 * .sceneId("sceneId")
 * .workspaceId("workspaceId")
 * // the properties below are optional
 * .capabilities(List.of("capabilities"))
 * .description("description")
 * .sceneMetadata(Map.of(
 * "sceneMetadataKey", "sceneMetadata"))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html)
 */
@CdkDslMarker
public class CfnScenePropsDsl {
    private val cdkBuilder: CfnSceneProps.Builder = CfnSceneProps.builder()

    private val _capabilities: MutableList<String> = mutableListOf()

    /** @param capabilities A list of capabilities that the scene uses to render. */
    public fun capabilities(vararg capabilities: String) {
        _capabilities.addAll(listOf(*capabilities))
    }

    /** @param capabilities A list of capabilities that the scene uses to render. */
    public fun capabilities(capabilities: Collection<String>) {
        _capabilities.addAll(capabilities)
    }

    /**
     * @param contentLocation The relative path that specifies the location of the content
     *   definition file.
     */
    public fun contentLocation(contentLocation: String) {
        cdkBuilder.contentLocation(contentLocation)
    }

    /** @param description The description of this scene. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param sceneId The scene ID. */
    public fun sceneId(sceneId: String) {
        cdkBuilder.sceneId(sceneId)
    }

    /** @param sceneMetadata The scene metadata. */
    public fun sceneMetadata(sceneMetadata: Map<String, String>) {
        cdkBuilder.sceneMetadata(sceneMetadata)
    }

    /** @param sceneMetadata The scene metadata. */
    public fun sceneMetadata(sceneMetadata: IResolvable) {
        cdkBuilder.sceneMetadata(sceneMetadata)
    }

    /** @param tags The ComponentType tags. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /** @param workspaceId The ID of the workspace. */
    public fun workspaceId(workspaceId: String) {
        cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): CfnSceneProps {
        if (_capabilities.isNotEmpty()) cdkBuilder.capabilities(_capabilities)
        return cdkBuilder.build()
    }
}
