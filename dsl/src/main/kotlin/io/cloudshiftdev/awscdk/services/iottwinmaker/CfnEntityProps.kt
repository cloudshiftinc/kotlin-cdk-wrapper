package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnEntityProps {
  /**
   * An object that maps strings to the components in the entity.
   *
   * Each string in the mapping must be unique to this object.
   *
   * For information on the component object see the
   * [component](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_ComponentResponse.html)
   * API reference.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-components)
   */
  public fun components(): Any? = unwrap(this).getComponents()

  /**
   * Maps string to `compositeComponent` updates in the request.
   *
   * Each key of the map represents the `componentPath` of the `compositeComponent` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-compositecomponents)
   */
  public fun compositeComponents(): Any? = unwrap(this).getCompositeComponents()

  /**
   * The description of the entity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the entity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-entityid)
   */
  public fun entityId(): String? = unwrap(this).getEntityId()

  /**
   * The entity name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-entityname)
   */
  public fun entityName(): String

  /**
   * The ID of the parent entity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-parententityid)
   */
  public fun parentEntityId(): String? = unwrap(this).getParentEntityId()

  /**
   * Metadata that you can use to manage the entity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The ID of the workspace that contains the entity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-workspaceid)
   */
  public fun workspaceId(): String

  /**
   * A builder for [CfnEntityProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param components An object that maps strings to the components in the entity.
     * Each string in the mapping must be unique to this object.
     *
     * For information on the component object see the
     * [component](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_ComponentResponse.html)
     * API reference.
     */
    public fun components(components: IResolvable)

    /**
     * @param components An object that maps strings to the components in the entity.
     * Each string in the mapping must be unique to this object.
     *
     * For information on the component object see the
     * [component](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_ComponentResponse.html)
     * API reference.
     */
    public fun components(components: Map<String, Any>)

    /**
     * @param compositeComponents Maps string to `compositeComponent` updates in the request.
     * Each key of the map represents the `componentPath` of the `compositeComponent` .
     */
    public fun compositeComponents(compositeComponents: IResolvable)

    /**
     * @param compositeComponents Maps string to `compositeComponent` updates in the request.
     * Each key of the map represents the `componentPath` of the `compositeComponent` .
     */
    public fun compositeComponents(compositeComponents: Map<String, Any>)

    /**
     * @param description The description of the entity.
     */
    public fun description(description: String)

    /**
     * @param entityId The ID of the entity.
     */
    public fun entityId(entityId: String)

    /**
     * @param entityName The entity name. 
     */
    public fun entityName(entityName: String)

    /**
     * @param parentEntityId The ID of the parent entity.
     */
    public fun parentEntityId(parentEntityId: String)

    /**
     * @param tags Metadata that you can use to manage the entity.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param workspaceId The ID of the workspace that contains the entity. 
     */
    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnEntityProps.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnEntityProps.builder()

    /**
     * @param components An object that maps strings to the components in the entity.
     * Each string in the mapping must be unique to this object.
     *
     * For information on the component object see the
     * [component](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_ComponentResponse.html)
     * API reference.
     */
    override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable::unwrap))
    }

    /**
     * @param components An object that maps strings to the components in the entity.
     * Each string in the mapping must be unique to this object.
     *
     * For information on the component object see the
     * [component](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_ComponentResponse.html)
     * API reference.
     */
    override fun components(components: Map<String, Any>) {
      cdkBuilder.components(components)
    }

    /**
     * @param compositeComponents Maps string to `compositeComponent` updates in the request.
     * Each key of the map represents the `componentPath` of the `compositeComponent` .
     */
    override fun compositeComponents(compositeComponents: IResolvable) {
      cdkBuilder.compositeComponents(compositeComponents.let(IResolvable::unwrap))
    }

    /**
     * @param compositeComponents Maps string to `compositeComponent` updates in the request.
     * Each key of the map represents the `componentPath` of the `compositeComponent` .
     */
    override fun compositeComponents(compositeComponents: Map<String, Any>) {
      cdkBuilder.compositeComponents(compositeComponents)
    }

    /**
     * @param description The description of the entity.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param entityId The ID of the entity.
     */
    override fun entityId(entityId: String) {
      cdkBuilder.entityId(entityId)
    }

    /**
     * @param entityName The entity name. 
     */
    override fun entityName(entityName: String) {
      cdkBuilder.entityName(entityName)
    }

    /**
     * @param parentEntityId The ID of the parent entity.
     */
    override fun parentEntityId(parentEntityId: String) {
      cdkBuilder.parentEntityId(parentEntityId)
    }

    /**
     * @param tags Metadata that you can use to manage the entity.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param workspaceId The ID of the workspace that contains the entity. 
     */
    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntityProps,
  ) : CdkObject(cdkObject), CfnEntityProps {
    /**
     * An object that maps strings to the components in the entity.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information on the component object see the
     * [component](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_ComponentResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-components)
     */
    override fun components(): Any? = unwrap(this).getComponents()

    /**
     * Maps string to `compositeComponent` updates in the request.
     *
     * Each key of the map represents the `componentPath` of the `compositeComponent` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-compositecomponents)
     */
    override fun compositeComponents(): Any? = unwrap(this).getCompositeComponents()

    /**
     * The description of the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-entityid)
     */
    override fun entityId(): String? = unwrap(this).getEntityId()

    /**
     * The entity name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-entityname)
     */
    override fun entityName(): String = unwrap(this).getEntityName()

    /**
     * The ID of the parent entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-parententityid)
     */
    override fun parentEntityId(): String? = unwrap(this).getParentEntityId()

    /**
     * Metadata that you can use to manage the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The ID of the workspace that contains the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-workspaceid)
     */
    override fun workspaceId(): String = unwrap(this).getWorkspaceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEntityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntityProps):
        CfnEntityProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEntityProps):
        software.amazon.awscdk.services.iottwinmaker.CfnEntityProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iottwinmaker.CfnEntityProps
  }
}
