@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnScene`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
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
public interface CfnSceneProps {
  /**
   * A list of capabilities that the scene uses to render.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-capabilities)
   */
  public fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

  /**
   * The relative path that specifies the location of the content definition file.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-contentlocation)
   */
  public fun contentLocation(): String

  /**
   * The description of this scene.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the scene.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-sceneid)
   */
  public fun sceneId(): String

  /**
   * The scene metadata.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-scenemetadata)
   */
  public fun sceneMetadata(): Any? = unwrap(this).getSceneMetadata()

  /**
   * The ComponentType tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The ID of the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-workspaceid)
   */
  public fun workspaceId(): String

  /**
   * A builder for [CfnSceneProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capabilities A list of capabilities that the scene uses to render.
     */
    public fun capabilities(capabilities: List<String>)

    /**
     * @param capabilities A list of capabilities that the scene uses to render.
     */
    public fun capabilities(vararg capabilities: String)

    /**
     * @param contentLocation The relative path that specifies the location of the content
     * definition file. 
     */
    public fun contentLocation(contentLocation: String)

    /**
     * @param description The description of this scene.
     */
    public fun description(description: String)

    /**
     * @param sceneId The ID of the scene. 
     */
    public fun sceneId(sceneId: String)

    /**
     * @param sceneMetadata The scene metadata.
     */
    public fun sceneMetadata(sceneMetadata: IResolvable)

    /**
     * @param sceneMetadata The scene metadata.
     */
    public fun sceneMetadata(sceneMetadata: Map<String, String>)

    /**
     * @param tags The ComponentType tags.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param workspaceId The ID of the workspace. 
     */
    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnSceneProps.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnSceneProps.builder()

    /**
     * @param capabilities A list of capabilities that the scene uses to render.
     */
    override fun capabilities(capabilities: List<String>) {
      cdkBuilder.capabilities(capabilities)
    }

    /**
     * @param capabilities A list of capabilities that the scene uses to render.
     */
    override fun capabilities(vararg capabilities: String): Unit =
        capabilities(capabilities.toList())

    /**
     * @param contentLocation The relative path that specifies the location of the content
     * definition file. 
     */
    override fun contentLocation(contentLocation: String) {
      cdkBuilder.contentLocation(contentLocation)
    }

    /**
     * @param description The description of this scene.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param sceneId The ID of the scene. 
     */
    override fun sceneId(sceneId: String) {
      cdkBuilder.sceneId(sceneId)
    }

    /**
     * @param sceneMetadata The scene metadata.
     */
    override fun sceneMetadata(sceneMetadata: IResolvable) {
      cdkBuilder.sceneMetadata(sceneMetadata.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sceneMetadata The scene metadata.
     */
    override fun sceneMetadata(sceneMetadata: Map<String, String>) {
      cdkBuilder.sceneMetadata(sceneMetadata)
    }

    /**
     * @param tags The ComponentType tags.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param workspaceId The ID of the workspace. 
     */
    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnSceneProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnSceneProps,
  ) : CdkObject(cdkObject),
      CfnSceneProps {
    /**
     * A list of capabilities that the scene uses to render.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-capabilities)
     */
    override fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

    /**
     * The relative path that specifies the location of the content definition file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-contentlocation)
     */
    override fun contentLocation(): String = unwrap(this).getContentLocation()

    /**
     * The description of this scene.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the scene.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-sceneid)
     */
    override fun sceneId(): String = unwrap(this).getSceneId()

    /**
     * The scene metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-scenemetadata)
     */
    override fun sceneMetadata(): Any? = unwrap(this).getSceneMetadata()

    /**
     * The ComponentType tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The ID of the workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-workspaceid)
     */
    override fun workspaceId(): String = unwrap(this).getWorkspaceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSceneProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnSceneProps):
        CfnSceneProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSceneProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSceneProps):
        software.amazon.awscdk.services.iottwinmaker.CfnSceneProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iottwinmaker.CfnSceneProps
  }
}
