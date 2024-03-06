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

package io.cloudshiftdev.awscdkdsl.services.iottwinmaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnScene
import software.constructs.Construct

/**
 * Use the `AWS::IoTTwinMaker::Scene` resource to declare a scene.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * CfnScene cfnScene = CfnScene.Builder.create(this, "MyCfnScene")
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
public class CfnSceneDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnScene.Builder = CfnScene.Builder.create(scope, id)

    private val _capabilities: MutableList<String> = mutableListOf()

    /**
     * A list of capabilities that the scene uses to render.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-capabilities)
     *
     * @param capabilities A list of capabilities that the scene uses to render.
     */
    public fun capabilities(vararg capabilities: String) {
        _capabilities.addAll(listOf(*capabilities))
    }

    /**
     * A list of capabilities that the scene uses to render.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-capabilities)
     *
     * @param capabilities A list of capabilities that the scene uses to render.
     */
    public fun capabilities(capabilities: Collection<String>) {
        _capabilities.addAll(capabilities)
    }

    /**
     * The relative path that specifies the location of the content definition file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-contentlocation)
     *
     * @param contentLocation The relative path that specifies the location of the content
     *   definition file.
     */
    public fun contentLocation(contentLocation: String) {
        cdkBuilder.contentLocation(contentLocation)
    }

    /**
     * The description of this scene.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-description)
     *
     * @param description The description of this scene.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The ID of the scene.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-sceneid)
     *
     * @param sceneId The ID of the scene.
     */
    public fun sceneId(sceneId: String) {
        cdkBuilder.sceneId(sceneId)
    }

    /**
     * The scene metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-scenemetadata)
     *
     * @param sceneMetadata The scene metadata.
     */
    public fun sceneMetadata(sceneMetadata: Map<String, String>) {
        cdkBuilder.sceneMetadata(sceneMetadata)
    }

    /**
     * The scene metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-scenemetadata)
     *
     * @param sceneMetadata The scene metadata.
     */
    public fun sceneMetadata(sceneMetadata: IResolvable) {
        cdkBuilder.sceneMetadata(sceneMetadata)
    }

    /**
     * The ComponentType tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-tags)
     *
     * @param tags The ComponentType tags.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * The ID of the scene.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-workspaceid)
     *
     * @param workspaceId The ID of the scene.
     */
    public fun workspaceId(workspaceId: String) {
        cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): CfnScene {
        if (_capabilities.isNotEmpty()) cdkBuilder.capabilities(_capabilities)
        return cdkBuilder.build()
    }
}
