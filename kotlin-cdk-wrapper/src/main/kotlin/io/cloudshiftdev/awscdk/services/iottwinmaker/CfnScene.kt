@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::IoTTwinMaker::Scene` resource to declare a scene.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
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
public open class CfnScene internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnScene,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The scene ARN.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time when the scene was created.
   */
  public open fun attrCreationDateTime(): String = unwrap(this).getAttrCreationDateTime()

  /**
   * A key-value pair of generated scene metadata for the scene.
   */
  public open fun attrGeneratedSceneMetadata(): IResolvable =
      unwrap(this).getAttrGeneratedSceneMetadata().let(IResolvable::wrap)

  /**
   * The scene the update time.
   */
  public open fun attrUpdateDateTime(): String = unwrap(this).getAttrUpdateDateTime()

  /**
   * A list of capabilities that the scene uses to render.
   */
  public open fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

  /**
   * A list of capabilities that the scene uses to render.
   */
  public open fun capabilities(`value`: List<String>) {
    unwrap(this).setCapabilities(`value`)
  }

  /**
   * A list of capabilities that the scene uses to render.
   */
  public open fun capabilities(vararg `value`: String): Unit = capabilities(`value`.toList())

  /**
   * The relative path that specifies the location of the content definition file.
   */
  public open fun contentLocation(): String = unwrap(this).getContentLocation()

  /**
   * The relative path that specifies the location of the content definition file.
   */
  public open fun contentLocation(`value`: String) {
    unwrap(this).setContentLocation(`value`)
  }

  /**
   * The description of this scene.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of this scene.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the scene.
   */
  public open fun sceneId(): String = unwrap(this).getSceneId()

  /**
   * The ID of the scene.
   */
  public open fun sceneId(`value`: String) {
    unwrap(this).setSceneId(`value`)
  }

  /**
   * The scene metadata.
   */
  public open fun sceneMetadata(): Any? = unwrap(this).getSceneMetadata()

  /**
   * The scene metadata.
   */
  public open fun sceneMetadata(`value`: IResolvable) {
    unwrap(this).setSceneMetadata(`value`.let(IResolvable::unwrap))
  }

  /**
   * The scene metadata.
   */
  public open fun sceneMetadata(`value`: Map<String, String>) {
    unwrap(this).setSceneMetadata(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The ComponentType tags.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The ComponentType tags.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The ID of the scene.
   */
  public open fun workspaceId(): String = unwrap(this).getWorkspaceId()

  /**
   * The ID of the scene.
   */
  public open fun workspaceId(`value`: String) {
    unwrap(this).setWorkspaceId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iottwinmaker.CfnScene].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of capabilities that the scene uses to render.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-capabilities)
     * @param capabilities A list of capabilities that the scene uses to render. 
     */
    public fun capabilities(capabilities: List<String>)

    /**
     * A list of capabilities that the scene uses to render.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-capabilities)
     * @param capabilities A list of capabilities that the scene uses to render. 
     */
    public fun capabilities(vararg capabilities: String)

    /**
     * The relative path that specifies the location of the content definition file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-contentlocation)
     * @param contentLocation The relative path that specifies the location of the content
     * definition file. 
     */
    public fun contentLocation(contentLocation: String)

    /**
     * The description of this scene.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-description)
     * @param description The description of this scene. 
     */
    public fun description(description: String)

    /**
     * The ID of the scene.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-sceneid)
     * @param sceneId The ID of the scene. 
     */
    public fun sceneId(sceneId: String)

    /**
     * The scene metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-scenemetadata)
     * @param sceneMetadata The scene metadata. 
     */
    public fun sceneMetadata(sceneMetadata: IResolvable)

    /**
     * The scene metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-scenemetadata)
     * @param sceneMetadata The scene metadata. 
     */
    public fun sceneMetadata(sceneMetadata: Map<String, String>)

    /**
     * The ComponentType tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-tags)
     * @param tags The ComponentType tags. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The ID of the scene.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-workspaceid)
     * @param workspaceId The ID of the scene. 
     */
    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnScene.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnScene.Builder.create(scope, id)

    /**
     * A list of capabilities that the scene uses to render.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-capabilities)
     * @param capabilities A list of capabilities that the scene uses to render. 
     */
    override fun capabilities(capabilities: List<String>) {
      cdkBuilder.capabilities(capabilities)
    }

    /**
     * A list of capabilities that the scene uses to render.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-capabilities)
     * @param capabilities A list of capabilities that the scene uses to render. 
     */
    override fun capabilities(vararg capabilities: String): Unit =
        capabilities(capabilities.toList())

    /**
     * The relative path that specifies the location of the content definition file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-contentlocation)
     * @param contentLocation The relative path that specifies the location of the content
     * definition file. 
     */
    override fun contentLocation(contentLocation: String) {
      cdkBuilder.contentLocation(contentLocation)
    }

    /**
     * The description of this scene.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-description)
     * @param description The description of this scene. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the scene.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-sceneid)
     * @param sceneId The ID of the scene. 
     */
    override fun sceneId(sceneId: String) {
      cdkBuilder.sceneId(sceneId)
    }

    /**
     * The scene metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-scenemetadata)
     * @param sceneMetadata The scene metadata. 
     */
    override fun sceneMetadata(sceneMetadata: IResolvable) {
      cdkBuilder.sceneMetadata(sceneMetadata.let(IResolvable::unwrap))
    }

    /**
     * The scene metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-scenemetadata)
     * @param sceneMetadata The scene metadata. 
     */
    override fun sceneMetadata(sceneMetadata: Map<String, String>) {
      cdkBuilder.sceneMetadata(sceneMetadata)
    }

    /**
     * The ComponentType tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-tags)
     * @param tags The ComponentType tags. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The ID of the scene.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-scene.html#cfn-iottwinmaker-scene-workspaceid)
     * @param workspaceId The ID of the scene. 
     */
    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnScene = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iottwinmaker.CfnScene.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScene {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScene(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnScene): CfnScene =
        CfnScene(cdkObject)

    internal fun unwrap(wrapped: CfnScene): software.amazon.awscdk.services.iottwinmaker.CfnScene =
        wrapped.cdkObject
  }
}
