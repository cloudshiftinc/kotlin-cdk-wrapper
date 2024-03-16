@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::IoTTwinMaker::Entity` resource to declare an entity.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
 * DataValueProperty dataValueProperty_;
 * Object definition;
 * Object error;
 * Object relationshipValue;
 * CfnEntity cfnEntity = CfnEntity.Builder.create(this, "MyCfnEntity")
 * .entityName("entityName")
 * .workspaceId("workspaceId")
 * // the properties below are optional
 * .components(Map.of(
 * "componentsKey", ComponentProperty.builder()
 * .componentName("componentName")
 * .componentTypeId("componentTypeId")
 * .definedIn("definedIn")
 * .description("description")
 * .properties(Map.of(
 * "propertiesKey", PropertyProperty.builder()
 * .definition(definition)
 * .value(DataValueProperty.builder()
 * .booleanValue(false)
 * .doubleValue(123)
 * .expression("expression")
 * .integerValue(123)
 * .listValue(List.of(dataValueProperty_))
 * .longValue(123)
 * .mapValue(Map.of(
 * "mapValueKey", dataValueProperty_))
 * .relationshipValue(relationshipValue)
 * .stringValue("stringValue")
 * .build())
 * .build()))
 * .propertyGroups(Map.of(
 * "propertyGroupsKey", PropertyGroupProperty.builder()
 * .groupType("groupType")
 * .propertyNames(List.of("propertyNames"))
 * .build()))
 * .status(StatusProperty.builder()
 * .error(error)
 * .state("state")
 * .build())
 * .build()))
 * .compositeComponents(Map.of(
 * "compositeComponentsKey", CompositeComponentProperty.builder()
 * .componentName("componentName")
 * .componentPath("componentPath")
 * .componentTypeId("componentTypeId")
 * .description("description")
 * .properties(Map.of(
 * "propertiesKey", PropertyProperty.builder()
 * .definition(definition)
 * .value(DataValueProperty.builder()
 * .booleanValue(false)
 * .doubleValue(123)
 * .expression("expression")
 * .integerValue(123)
 * .listValue(List.of(dataValueProperty_))
 * .longValue(123)
 * .mapValue(Map.of(
 * "mapValueKey", dataValueProperty_))
 * .relationshipValue(relationshipValue)
 * .stringValue("stringValue")
 * .build())
 * .build()))
 * .propertyGroups(Map.of(
 * "propertyGroupsKey", PropertyGroupProperty.builder()
 * .groupType("groupType")
 * .propertyNames(List.of("propertyNames"))
 * .build()))
 * .status(StatusProperty.builder()
 * .error(error)
 * .state("state")
 * .build())
 * .build()))
 * .description("description")
 * .entityId("entityId")
 * .parentEntityId("parentEntityId")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html)
 */
public open class CfnEntity internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The entity ARN.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time the entity was created.
   */
  public open fun attrCreationDateTime(): String = unwrap(this).getAttrCreationDateTime()

  /**
   * A boolean value that specifies whether the entity has child entities or not.
   */
  public open fun attrHasChildEntities(): IResolvable =
      unwrap(this).getAttrHasChildEntities().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrStatus(): IResolvable = unwrap(this).getAttrStatus().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrStatusError(): IResolvable =
      unwrap(this).getAttrStatusError().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrStatusErrorCode(): String = unwrap(this).getAttrStatusErrorCode()

  /**
   *
   */
  public open fun attrStatusErrorMessage(): String = unwrap(this).getAttrStatusErrorMessage()

  /**
   *
   */
  public open fun attrStatusState(): String = unwrap(this).getAttrStatusState()

  /**
   * The date and time when the component type was last updated.
   */
  public open fun attrUpdateDateTime(): String = unwrap(this).getAttrUpdateDateTime()

  /**
   * An object that maps strings to the components in the entity.
   */
  public open fun components(): Any? = unwrap(this).getComponents()

  /**
   * An object that maps strings to the components in the entity.
   */
  public open fun components(`value`: IResolvable) {
    unwrap(this).setComponents(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object that maps strings to the components in the entity.
   */
  public open fun components(`value`: Map<String, Any>) {
    unwrap(this).setComponents(`value`)
  }

  /**
   * Maps string to `compositeComponent` updates in the request.
   */
  public open fun compositeComponents(): Any? = unwrap(this).getCompositeComponents()

  /**
   * Maps string to `compositeComponent` updates in the request.
   */
  public open fun compositeComponents(`value`: IResolvable) {
    unwrap(this).setCompositeComponents(`value`.let(IResolvable::unwrap))
  }

  /**
   * Maps string to `compositeComponent` updates in the request.
   */
  public open fun compositeComponents(`value`: Map<String, Any>) {
    unwrap(this).setCompositeComponents(`value`)
  }

  /**
   * The description of the entity.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the entity.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The ID of the entity.
   */
  public open fun entityId(): String? = unwrap(this).getEntityId()

  /**
   * The ID of the entity.
   */
  public open fun entityId(`value`: String) {
    unwrap(this).setEntityId(`value`)
  }

  /**
   * The entity name.
   */
  public open fun entityName(): String = unwrap(this).getEntityName()

  /**
   * The entity name.
   */
  public open fun entityName(`value`: String) {
    unwrap(this).setEntityName(`value`)
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
   * The ID of the parent entity.
   */
  public open fun parentEntityId(): String? = unwrap(this).getParentEntityId()

  /**
   * The ID of the parent entity.
   */
  public open fun parentEntityId(`value`: String) {
    unwrap(this).setParentEntityId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata that you can use to manage the entity.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Metadata that you can use to manage the entity.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The ID of the workspace that contains the entity.
   */
  public open fun workspaceId(): String = unwrap(this).getWorkspaceId()

  /**
   * The ID of the workspace that contains the entity.
   */
  public open fun workspaceId(`value`: String) {
    unwrap(this).setWorkspaceId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iottwinmaker.CfnEntity].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param components An object that maps strings to the components in the entity. 
     */
    public fun components(components: IResolvable)

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
     * @param components An object that maps strings to the components in the entity. 
     */
    public fun components(components: Map<String, Any>)

    /**
     * Maps string to `compositeComponent` updates in the request.
     *
     * Each key of the map represents the `componentPath` of the `compositeComponent` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-compositecomponents)
     * @param compositeComponents Maps string to `compositeComponent` updates in the request. 
     */
    public fun compositeComponents(compositeComponents: IResolvable)

    /**
     * Maps string to `compositeComponent` updates in the request.
     *
     * Each key of the map represents the `componentPath` of the `compositeComponent` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-compositecomponents)
     * @param compositeComponents Maps string to `compositeComponent` updates in the request. 
     */
    public fun compositeComponents(compositeComponents: Map<String, Any>)

    /**
     * The description of the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-description)
     * @param description The description of the entity. 
     */
    public fun description(description: String)

    /**
     * The ID of the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-entityid)
     * @param entityId The ID of the entity. 
     */
    public fun entityId(entityId: String)

    /**
     * The entity name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-entityname)
     * @param entityName The entity name. 
     */
    public fun entityName(entityName: String)

    /**
     * The ID of the parent entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-parententityid)
     * @param parentEntityId The ID of the parent entity. 
     */
    public fun parentEntityId(parentEntityId: String)

    /**
     * Metadata that you can use to manage the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-tags)
     * @param tags Metadata that you can use to manage the entity. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The ID of the workspace that contains the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-workspaceid)
     * @param workspaceId The ID of the workspace that contains the entity. 
     */
    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnEntity.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnEntity.Builder.create(scope, id)

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
     * @param components An object that maps strings to the components in the entity. 
     */
    override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable::unwrap))
    }

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
     * @param components An object that maps strings to the components in the entity. 
     */
    override fun components(components: Map<String, Any>) {
      cdkBuilder.components(components)
    }

    /**
     * Maps string to `compositeComponent` updates in the request.
     *
     * Each key of the map represents the `componentPath` of the `compositeComponent` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-compositecomponents)
     * @param compositeComponents Maps string to `compositeComponent` updates in the request. 
     */
    override fun compositeComponents(compositeComponents: IResolvable) {
      cdkBuilder.compositeComponents(compositeComponents.let(IResolvable::unwrap))
    }

    /**
     * Maps string to `compositeComponent` updates in the request.
     *
     * Each key of the map represents the `componentPath` of the `compositeComponent` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-compositecomponents)
     * @param compositeComponents Maps string to `compositeComponent` updates in the request. 
     */
    override fun compositeComponents(compositeComponents: Map<String, Any>) {
      cdkBuilder.compositeComponents(compositeComponents)
    }

    /**
     * The description of the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-description)
     * @param description The description of the entity. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-entityid)
     * @param entityId The ID of the entity. 
     */
    override fun entityId(entityId: String) {
      cdkBuilder.entityId(entityId)
    }

    /**
     * The entity name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-entityname)
     * @param entityName The entity name. 
     */
    override fun entityName(entityName: String) {
      cdkBuilder.entityName(entityName)
    }

    /**
     * The ID of the parent entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-parententityid)
     * @param parentEntityId The ID of the parent entity. 
     */
    override fun parentEntityId(parentEntityId: String) {
      cdkBuilder.parentEntityId(parentEntityId)
    }

    /**
     * Metadata that you can use to manage the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-tags)
     * @param tags Metadata that you can use to manage the entity. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The ID of the workspace that contains the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-entity.html#cfn-iottwinmaker-entity-workspaceid)
     * @param workspaceId The ID of the workspace that contains the entity. 
     */
    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iottwinmaker.CfnEntity.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEntity {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEntity(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity): CfnEntity
        = CfnEntity(cdkObject)

    internal fun unwrap(wrapped: CfnEntity): software.amazon.awscdk.services.iottwinmaker.CfnEntity
        = wrapped.cdkObject
  }

  /**
   * The entity relationship.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * RelationshipValueProperty relationshipValueProperty = RelationshipValueProperty.builder()
   * .targetComponentName("targetComponentName")
   * .targetEntityId("targetEntityId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-relationshipvalue.html)
   */
  public interface RelationshipValueProperty {
    /**
     * The target component name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-relationshipvalue.html#cfn-iottwinmaker-entity-relationshipvalue-targetcomponentname)
     */
    public fun targetComponentName(): String? = unwrap(this).getTargetComponentName()

    /**
     * The target entity Id.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-relationshipvalue.html#cfn-iottwinmaker-entity-relationshipvalue-targetentityid)
     */
    public fun targetEntityId(): String? = unwrap(this).getTargetEntityId()

    /**
     * A builder for [RelationshipValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetComponentName The target component name.
       */
      public fun targetComponentName(targetComponentName: String)

      /**
       * @param targetEntityId The target entity Id.
       */
      public fun targetEntityId(targetEntityId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipValueProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipValueProperty.builder()

      /**
       * @param targetComponentName The target component name.
       */
      override fun targetComponentName(targetComponentName: String) {
        cdkBuilder.targetComponentName(targetComponentName)
      }

      /**
       * @param targetEntityId The target entity Id.
       */
      override fun targetEntityId(targetEntityId: String) {
        cdkBuilder.targetEntityId(targetEntityId)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipValueProperty,
    ) : CdkObject(cdkObject), RelationshipValueProperty {
      /**
       * The target component name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-relationshipvalue.html#cfn-iottwinmaker-entity-relationshipvalue-targetcomponentname)
       */
      override fun targetComponentName(): String? = unwrap(this).getTargetComponentName()

      /**
       * The target entity Id.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-relationshipvalue.html#cfn-iottwinmaker-entity-relationshipvalue-targetentityid)
       */
      override fun targetEntityId(): String? = unwrap(this).getTargetEntityId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RelationshipValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipValueProperty):
          RelationshipValueProperty = CdkObjectWrappers.wrap(cdkObject) as RelationshipValueProperty

      internal fun unwrap(wrapped: RelationshipValueProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipValueProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipValueProperty
    }
  }

  /**
   * The entity error.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * ErrorProperty errorProperty = ErrorProperty.builder()
   * .code("code")
   * .message("message")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-error.html)
   */
  public interface ErrorProperty {
    /**
     * The entity error code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-error.html#cfn-iottwinmaker-entity-error-code)
     */
    public fun code(): String? = unwrap(this).getCode()

    /**
     * The entity error message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-error.html#cfn-iottwinmaker-entity-error-message)
     */
    public fun message(): String? = unwrap(this).getMessage()

    /**
     * A builder for [ErrorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param code The entity error code.
       */
      public fun code(code: String)

      /**
       * @param message The entity error message.
       */
      public fun message(message: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ErrorProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ErrorProperty.builder()

      /**
       * @param code The entity error code.
       */
      override fun code(code: String) {
        cdkBuilder.code(code)
      }

      /**
       * @param message The entity error message.
       */
      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity.ErrorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.ErrorProperty,
    ) : CdkObject(cdkObject), ErrorProperty {
      /**
       * The entity error code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-error.html#cfn-iottwinmaker-entity-error-code)
       */
      override fun code(): String? = unwrap(this).getCode()

      /**
       * The entity error message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-error.html#cfn-iottwinmaker-entity-error-message)
       */
      override fun message(): String? = unwrap(this).getMessage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ErrorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.ErrorProperty):
          ErrorProperty = CdkObjectWrappers.wrap(cdkObject) as ErrorProperty

      internal fun unwrap(wrapped: ErrorProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ErrorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ErrorProperty
    }
  }

  /**
   * An object that sets information about a property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * DataValueProperty dataValueProperty_;
   * Object definition;
   * Object relationshipValue;
   * PropertyProperty propertyProperty = PropertyProperty.builder()
   * .definition(definition)
   * .value(DataValueProperty.builder()
   * .booleanValue(false)
   * .doubleValue(123)
   * .expression("expression")
   * .integerValue(123)
   * .listValue(List.of(dataValueProperty_))
   * .longValue(123)
   * .mapValue(Map.of(
   * "mapValueKey", dataValueProperty_))
   * .relationshipValue(relationshipValue)
   * .stringValue("stringValue")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-property.html)
   */
  public interface PropertyProperty {
    /**
     * An object that specifies information about a property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-property.html#cfn-iottwinmaker-entity-property-definition)
     */
    public fun definition(): Any? = unwrap(this).getDefinition()

    /**
     * An object that contains information about a value for a time series property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-property.html#cfn-iottwinmaker-entity-property-value)
     */
    public fun `value`(): Any? = unwrap(this).getValue()

    /**
     * A builder for [PropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param definition An object that specifies information about a property.
       */
      public fun definition(definition: Any)

      /**
       * @param value An object that contains information about a value for a time series property.
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value An object that contains information about a value for a time series property.
       */
      public fun `value`(`value`: DataValueProperty)

      /**
       * @param value An object that contains information about a value for a time series property.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1b705310b11f5cc8cc31e81403c2d7dcc4073e9f3a674ae8ab805a7d4fdd73d")
      public fun `value`(`value`: DataValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyProperty.builder()

      /**
       * @param definition An object that specifies information about a property.
       */
      override fun definition(definition: Any) {
        cdkBuilder.definition(definition)
      }

      /**
       * @param value An object that contains information about a value for a time series property.
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      /**
       * @param value An object that contains information about a value for a time series property.
       */
      override fun `value`(`value`: DataValueProperty) {
        cdkBuilder.`value`(`value`.let(DataValueProperty::unwrap))
      }

      /**
       * @param value An object that contains information about a value for a time series property.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1b705310b11f5cc8cc31e81403c2d7dcc4073e9f3a674ae8ab805a7d4fdd73d")
      override fun `value`(`value`: DataValueProperty.Builder.() -> Unit): Unit =
          `value`(DataValueProperty(`value`))

      public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyProperty,
    ) : CdkObject(cdkObject), PropertyProperty {
      /**
       * An object that specifies information about a property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-property.html#cfn-iottwinmaker-entity-property-definition)
       */
      override fun definition(): Any? = unwrap(this).getDefinition()

      /**
       * An object that contains information about a value for a time series property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-property.html#cfn-iottwinmaker-entity-property-value)
       */
      override fun `value`(): Any? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyProperty):
          PropertyProperty = CdkObjectWrappers.wrap(cdkObject) as PropertyProperty

      internal fun unwrap(wrapped: PropertyProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyProperty
    }
  }

  /**
   * The entity data type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * DataTypeProperty dataTypeProperty_;
   * DataValueProperty dataValueProperty_;
   * Object relationshipValue;
   * DataTypeProperty dataTypeProperty = DataTypeProperty.builder()
   * .allowedValues(List.of(DataValueProperty.builder()
   * .booleanValue(false)
   * .doubleValue(123)
   * .expression("expression")
   * .integerValue(123)
   * .listValue(List.of(dataValueProperty_))
   * .longValue(123)
   * .mapValue(Map.of(
   * "mapValueKey", dataValueProperty_))
   * .relationshipValue(relationshipValue)
   * .stringValue("stringValue")
   * .build()))
   * .nestedType(dataTypeProperty_)
   * .relationship(RelationshipProperty.builder()
   * .relationshipType("relationshipType")
   * .targetComponentTypeId("targetComponentTypeId")
   * .build())
   * .type("type")
   * .unitOfMeasure("unitOfMeasure")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datatype.html)
   */
  public interface DataTypeProperty {
    /**
     * The allowed values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datatype.html#cfn-iottwinmaker-entity-datatype-allowedvalues)
     */
    public fun allowedValues(): Any? = unwrap(this).getAllowedValues()

    /**
     * The nested type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datatype.html#cfn-iottwinmaker-entity-datatype-nestedtype)
     */
    public fun nestedType(): Any? = unwrap(this).getNestedType()

    /**
     * The relationship.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datatype.html#cfn-iottwinmaker-entity-datatype-relationship)
     */
    public fun relationship(): Any? = unwrap(this).getRelationship()

    /**
     * The entity type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datatype.html#cfn-iottwinmaker-entity-datatype-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * The unit of measure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datatype.html#cfn-iottwinmaker-entity-datatype-unitofmeasure)
     */
    public fun unitOfMeasure(): String? = unwrap(this).getUnitOfMeasure()

    /**
     * A builder for [DataTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedValues The allowed values.
       */
      public fun allowedValues(allowedValues: IResolvable)

      /**
       * @param allowedValues The allowed values.
       */
      public fun allowedValues(allowedValues: List<Any>)

      /**
       * @param allowedValues The allowed values.
       */
      public fun allowedValues(vararg allowedValues: Any)

      /**
       * @param nestedType The nested type.
       */
      public fun nestedType(nestedType: IResolvable)

      /**
       * @param nestedType The nested type.
       */
      public fun nestedType(nestedType: DataTypeProperty)

      /**
       * @param nestedType The nested type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1669d24f23e172179159bc8936c6cc43082a996eaf0b8153ff6e366061d0a2ee")
      public fun nestedType(nestedType: Builder.() -> Unit)

      /**
       * @param relationship The relationship.
       */
      public fun relationship(relationship: IResolvable)

      /**
       * @param relationship The relationship.
       */
      public fun relationship(relationship: RelationshipProperty)

      /**
       * @param relationship The relationship.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4580e67a65b938122f66bff4b7ba39c98d08849431a22a1624113cb56e1948ac")
      public fun relationship(relationship: RelationshipProperty.Builder.() -> Unit)

      /**
       * @param type The entity type.
       */
      public fun type(type: String)

      /**
       * @param unitOfMeasure The unit of measure.
       */
      public fun unitOfMeasure(unitOfMeasure: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataTypeProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataTypeProperty.builder()

      /**
       * @param allowedValues The allowed values.
       */
      override fun allowedValues(allowedValues: IResolvable) {
        cdkBuilder.allowedValues(allowedValues.let(IResolvable::unwrap))
      }

      /**
       * @param allowedValues The allowed values.
       */
      override fun allowedValues(allowedValues: List<Any>) {
        cdkBuilder.allowedValues(allowedValues)
      }

      /**
       * @param allowedValues The allowed values.
       */
      override fun allowedValues(vararg allowedValues: Any): Unit =
          allowedValues(allowedValues.toList())

      /**
       * @param nestedType The nested type.
       */
      override fun nestedType(nestedType: IResolvable) {
        cdkBuilder.nestedType(nestedType.let(IResolvable::unwrap))
      }

      /**
       * @param nestedType The nested type.
       */
      override fun nestedType(nestedType: DataTypeProperty) {
        cdkBuilder.nestedType(nestedType.let(DataTypeProperty::unwrap))
      }

      /**
       * @param nestedType The nested type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1669d24f23e172179159bc8936c6cc43082a996eaf0b8153ff6e366061d0a2ee")
      override fun nestedType(nestedType: Builder.() -> Unit): Unit =
          nestedType(DataTypeProperty(nestedType))

      /**
       * @param relationship The relationship.
       */
      override fun relationship(relationship: IResolvable) {
        cdkBuilder.relationship(relationship.let(IResolvable::unwrap))
      }

      /**
       * @param relationship The relationship.
       */
      override fun relationship(relationship: RelationshipProperty) {
        cdkBuilder.relationship(relationship.let(RelationshipProperty::unwrap))
      }

      /**
       * @param relationship The relationship.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4580e67a65b938122f66bff4b7ba39c98d08849431a22a1624113cb56e1948ac")
      override fun relationship(relationship: RelationshipProperty.Builder.() -> Unit): Unit =
          relationship(RelationshipProperty(relationship))

      /**
       * @param type The entity type.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param unitOfMeasure The unit of measure.
       */
      override fun unitOfMeasure(unitOfMeasure: String) {
        cdkBuilder.unitOfMeasure(unitOfMeasure)
      }

      public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataTypeProperty,
    ) : CdkObject(cdkObject), DataTypeProperty {
      /**
       * The allowed values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datatype.html#cfn-iottwinmaker-entity-datatype-allowedvalues)
       */
      override fun allowedValues(): Any? = unwrap(this).getAllowedValues()

      /**
       * The nested type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datatype.html#cfn-iottwinmaker-entity-datatype-nestedtype)
       */
      override fun nestedType(): Any? = unwrap(this).getNestedType()

      /**
       * The relationship.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datatype.html#cfn-iottwinmaker-entity-datatype-relationship)
       */
      override fun relationship(): Any? = unwrap(this).getRelationship()

      /**
       * The entity type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datatype.html#cfn-iottwinmaker-entity-datatype-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * The unit of measure.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datatype.html#cfn-iottwinmaker-entity-datatype-unitofmeasure)
       */
      override fun unitOfMeasure(): String? = unwrap(this).getUnitOfMeasure()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataTypeProperty):
          DataTypeProperty = CdkObjectWrappers.wrap(cdkObject) as DataTypeProperty

      internal fun unwrap(wrapped: DataTypeProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataTypeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataTypeProperty
    }
  }

  /**
   * The current status of the entity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * Object error;
   * StatusProperty statusProperty = StatusProperty.builder()
   * .error(error)
   * .state("state")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-status.html)
   */
  public interface StatusProperty {
    /**
     * The error message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-status.html#cfn-iottwinmaker-entity-status-error)
     */
    public fun error(): Any? = unwrap(this).getError()

    /**
     * The current state of the entity, component, component type, or workspace.
     *
     * Valid Values: `CREATING | UPDATING | DELETING | ACTIVE | ERROR`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-status.html#cfn-iottwinmaker-entity-status-state)
     */
    public fun state(): String? = unwrap(this).getState()

    /**
     * A builder for [StatusProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param error The error message.
       */
      public fun error(error: Any)

      /**
       * @param state The current state of the entity, component, component type, or workspace.
       * Valid Values: `CREATING | UPDATING | DELETING | ACTIVE | ERROR`
       */
      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.StatusProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.StatusProperty.builder()

      /**
       * @param error The error message.
       */
      override fun error(error: Any) {
        cdkBuilder.error(error)
      }

      /**
       * @param state The current state of the entity, component, component type, or workspace.
       * Valid Values: `CREATING | UPDATING | DELETING | ACTIVE | ERROR`
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity.StatusProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.StatusProperty,
    ) : CdkObject(cdkObject), StatusProperty {
      /**
       * The error message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-status.html#cfn-iottwinmaker-entity-status-error)
       */
      override fun error(): Any? = unwrap(this).getError()

      /**
       * The current state of the entity, component, component type, or workspace.
       *
       * Valid Values: `CREATING | UPDATING | DELETING | ACTIVE | ERROR`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-status.html#cfn-iottwinmaker-entity-status-state)
       */
      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StatusProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.StatusProperty):
          StatusProperty = CdkObjectWrappers.wrap(cdkObject) as StatusProperty

      internal fun unwrap(wrapped: StatusProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.StatusProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.StatusProperty
    }
  }

  /**
   * The entity component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * DataValueProperty dataValueProperty_;
   * Object definition;
   * Object error;
   * Object relationshipValue;
   * ComponentProperty componentProperty = ComponentProperty.builder()
   * .componentName("componentName")
   * .componentTypeId("componentTypeId")
   * .definedIn("definedIn")
   * .description("description")
   * .properties(Map.of(
   * "propertiesKey", PropertyProperty.builder()
   * .definition(definition)
   * .value(DataValueProperty.builder()
   * .booleanValue(false)
   * .doubleValue(123)
   * .expression("expression")
   * .integerValue(123)
   * .listValue(List.of(dataValueProperty_))
   * .longValue(123)
   * .mapValue(Map.of(
   * "mapValueKey", dataValueProperty_))
   * .relationshipValue(relationshipValue)
   * .stringValue("stringValue")
   * .build())
   * .build()))
   * .propertyGroups(Map.of(
   * "propertyGroupsKey", PropertyGroupProperty.builder()
   * .groupType("groupType")
   * .propertyNames(List.of("propertyNames"))
   * .build()))
   * .status(StatusProperty.builder()
   * .error(error)
   * .state("state")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html)
   */
  public interface ComponentProperty {
    /**
     * The name of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html#cfn-iottwinmaker-entity-component-componentname)
     */
    public fun componentName(): String? = unwrap(this).getComponentName()

    /**
     * The ID of the component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html#cfn-iottwinmaker-entity-component-componenttypeid)
     */
    public fun componentTypeId(): String? = unwrap(this).getComponentTypeId()

    /**
     * The name of the property definition set in the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html#cfn-iottwinmaker-entity-component-definedin)
     */
    public fun definedIn(): String? = unwrap(this).getDefinedIn()

    /**
     * The description of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html#cfn-iottwinmaker-entity-component-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * An object that maps strings to the properties to set in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html#cfn-iottwinmaker-entity-component-properties)
     */
    public fun properties(): Any? = unwrap(this).getProperties()

    /**
     * An object that maps strings to the property groups in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html#cfn-iottwinmaker-entity-component-propertygroups)
     */
    public fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

    /**
     * The status of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html#cfn-iottwinmaker-entity-component-status)
     */
    public fun status(): Any? = unwrap(this).getStatus()

    /**
     * A builder for [ComponentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param componentName The name of the component.
       */
      public fun componentName(componentName: String)

      /**
       * @param componentTypeId The ID of the component type.
       */
      public fun componentTypeId(componentTypeId: String)

      /**
       * @param definedIn The name of the property definition set in the request.
       */
      public fun definedIn(definedIn: String)

      /**
       * @param description The description of the component.
       */
      public fun description(description: String)

      /**
       * @param properties An object that maps strings to the properties to set in the component
       * type.
       * Each string in the mapping must be unique to this object.
       */
      public fun properties(properties: IResolvable)

      /**
       * @param properties An object that maps strings to the properties to set in the component
       * type.
       * Each string in the mapping must be unique to this object.
       */
      public fun properties(properties: Map<String, Any>)

      /**
       * @param propertyGroups An object that maps strings to the property groups in the component
       * type.
       * Each string in the mapping must be unique to this object.
       */
      public fun propertyGroups(propertyGroups: IResolvable)

      /**
       * @param propertyGroups An object that maps strings to the property groups in the component
       * type.
       * Each string in the mapping must be unique to this object.
       */
      public fun propertyGroups(propertyGroups: Map<String, Any>)

      /**
       * @param status The status of the component.
       */
      public fun status(status: IResolvable)

      /**
       * @param status The status of the component.
       */
      public fun status(status: StatusProperty)

      /**
       * @param status The status of the component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d6773e25ed2616ddc9f8fd8a61b61d0098cca693b9e39908fcaee434360f695")
      public fun status(status: StatusProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ComponentProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ComponentProperty.builder()

      /**
       * @param componentName The name of the component.
       */
      override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      /**
       * @param componentTypeId The ID of the component type.
       */
      override fun componentTypeId(componentTypeId: String) {
        cdkBuilder.componentTypeId(componentTypeId)
      }

      /**
       * @param definedIn The name of the property definition set in the request.
       */
      override fun definedIn(definedIn: String) {
        cdkBuilder.definedIn(definedIn)
      }

      /**
       * @param description The description of the component.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param properties An object that maps strings to the properties to set in the component
       * type.
       * Each string in the mapping must be unique to this object.
       */
      override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable::unwrap))
      }

      /**
       * @param properties An object that maps strings to the properties to set in the component
       * type.
       * Each string in the mapping must be unique to this object.
       */
      override fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
      }

      /**
       * @param propertyGroups An object that maps strings to the property groups in the component
       * type.
       * Each string in the mapping must be unique to this object.
       */
      override fun propertyGroups(propertyGroups: IResolvable) {
        cdkBuilder.propertyGroups(propertyGroups.let(IResolvable::unwrap))
      }

      /**
       * @param propertyGroups An object that maps strings to the property groups in the component
       * type.
       * Each string in the mapping must be unique to this object.
       */
      override fun propertyGroups(propertyGroups: Map<String, Any>) {
        cdkBuilder.propertyGroups(propertyGroups)
      }

      /**
       * @param status The status of the component.
       */
      override fun status(status: IResolvable) {
        cdkBuilder.status(status.let(IResolvable::unwrap))
      }

      /**
       * @param status The status of the component.
       */
      override fun status(status: StatusProperty) {
        cdkBuilder.status(status.let(StatusProperty::unwrap))
      }

      /**
       * @param status The status of the component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d6773e25ed2616ddc9f8fd8a61b61d0098cca693b9e39908fcaee434360f695")
      override fun status(status: StatusProperty.Builder.() -> Unit): Unit =
          status(StatusProperty(status))

      public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity.ComponentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ComponentProperty,
    ) : CdkObject(cdkObject), ComponentProperty {
      /**
       * The name of the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html#cfn-iottwinmaker-entity-component-componentname)
       */
      override fun componentName(): String? = unwrap(this).getComponentName()

      /**
       * The ID of the component type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html#cfn-iottwinmaker-entity-component-componenttypeid)
       */
      override fun componentTypeId(): String? = unwrap(this).getComponentTypeId()

      /**
       * The name of the property definition set in the request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html#cfn-iottwinmaker-entity-component-definedin)
       */
      override fun definedIn(): String? = unwrap(this).getDefinedIn()

      /**
       * The description of the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html#cfn-iottwinmaker-entity-component-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * An object that maps strings to the properties to set in the component type.
       *
       * Each string in the mapping must be unique to this object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html#cfn-iottwinmaker-entity-component-properties)
       */
      override fun properties(): Any? = unwrap(this).getProperties()

      /**
       * An object that maps strings to the property groups in the component type.
       *
       * Each string in the mapping must be unique to this object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html#cfn-iottwinmaker-entity-component-propertygroups)
       */
      override fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

      /**
       * The status of the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-component.html#cfn-iottwinmaker-entity-component-status)
       */
      override fun status(): Any? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.ComponentProperty):
          ComponentProperty = CdkObjectWrappers.wrap(cdkObject) as ComponentProperty

      internal fun unwrap(wrapped: ComponentProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ComponentProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.ComponentProperty
    }
  }

  /**
   * The entity relationship.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * RelationshipProperty relationshipProperty = RelationshipProperty.builder()
   * .relationshipType("relationshipType")
   * .targetComponentTypeId("targetComponentTypeId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-relationship.html)
   */
  public interface RelationshipProperty {
    /**
     * The relationship type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-relationship.html#cfn-iottwinmaker-entity-relationship-relationshiptype)
     */
    public fun relationshipType(): String? = unwrap(this).getRelationshipType()

    /**
     * the component type Id target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-relationship.html#cfn-iottwinmaker-entity-relationship-targetcomponenttypeid)
     */
    public fun targetComponentTypeId(): String? = unwrap(this).getTargetComponentTypeId()

    /**
     * A builder for [RelationshipProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param relationshipType The relationship type.
       */
      public fun relationshipType(relationshipType: String)

      /**
       * @param targetComponentTypeId the component type Id target.
       */
      public fun targetComponentTypeId(targetComponentTypeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipProperty.builder()

      /**
       * @param relationshipType The relationship type.
       */
      override fun relationshipType(relationshipType: String) {
        cdkBuilder.relationshipType(relationshipType)
      }

      /**
       * @param targetComponentTypeId the component type Id target.
       */
      override fun targetComponentTypeId(targetComponentTypeId: String) {
        cdkBuilder.targetComponentTypeId(targetComponentTypeId)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipProperty,
    ) : CdkObject(cdkObject), RelationshipProperty {
      /**
       * The relationship type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-relationship.html#cfn-iottwinmaker-entity-relationship-relationshiptype)
       */
      override fun relationshipType(): String? = unwrap(this).getRelationshipType()

      /**
       * the component type Id target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-relationship.html#cfn-iottwinmaker-entity-relationship-targetcomponenttypeid)
       */
      override fun targetComponentTypeId(): String? = unwrap(this).getTargetComponentTypeId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RelationshipProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipProperty):
          RelationshipProperty = CdkObjectWrappers.wrap(cdkObject) as RelationshipProperty

      internal fun unwrap(wrapped: RelationshipProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.RelationshipProperty
    }
  }

  /**
   * The entity definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * DataTypeProperty dataTypeProperty_;
   * DataValueProperty dataValueProperty_;
   * Object relationshipValue;
   * DefinitionProperty definitionProperty = DefinitionProperty.builder()
   * .configuration(Map.of(
   * "configurationKey", "configuration"))
   * .dataType(DataTypeProperty.builder()
   * .allowedValues(List.of(DataValueProperty.builder()
   * .booleanValue(false)
   * .doubleValue(123)
   * .expression("expression")
   * .integerValue(123)
   * .listValue(List.of(dataValueProperty_))
   * .longValue(123)
   * .mapValue(Map.of(
   * "mapValueKey", dataValueProperty_))
   * .relationshipValue(relationshipValue)
   * .stringValue("stringValue")
   * .build()))
   * .nestedType(dataTypeProperty_)
   * .relationship(RelationshipProperty.builder()
   * .relationshipType("relationshipType")
   * .targetComponentTypeId("targetComponentTypeId")
   * .build())
   * .type("type")
   * .unitOfMeasure("unitOfMeasure")
   * .build())
   * .defaultValue(DataValueProperty.builder()
   * .booleanValue(false)
   * .doubleValue(123)
   * .expression("expression")
   * .integerValue(123)
   * .listValue(List.of(dataValueProperty_))
   * .longValue(123)
   * .mapValue(Map.of(
   * "mapValueKey", dataValueProperty_))
   * .relationshipValue(relationshipValue)
   * .stringValue("stringValue")
   * .build())
   * .isExternalId(false)
   * .isFinal(false)
   * .isImported(false)
   * .isInherited(false)
   * .isRequiredInEntity(false)
   * .isStoredExternally(false)
   * .isTimeSeries(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html)
   */
  public interface DefinitionProperty {
    /**
     * The configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-configuration)
     */
    public fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * The data type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-datatype)
     */
    public fun dataType(): Any? = unwrap(this).getDataType()

    /**
     * The default value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-defaultvalue)
     */
    public fun defaultValue(): Any? = unwrap(this).getDefaultValue()

    /**
     * Displays if the entity has a external Id.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-isexternalid)
     */
    public fun isExternalId(): Any? = unwrap(this).getIsExternalId()

    /**
     * Displays if the entity is final.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-isfinal)
     */
    public fun isFinal(): Any? = unwrap(this).getIsFinal()

    /**
     * Displays if the entity is imported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-isimported)
     */
    public fun isImported(): Any? = unwrap(this).getIsImported()

    /**
     * Displays if the entity is inherited.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-isinherited)
     */
    public fun isInherited(): Any? = unwrap(this).getIsInherited()

    /**
     * Displays if the entity is a required entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-isrequiredinentity)
     */
    public fun isRequiredInEntity(): Any? = unwrap(this).getIsRequiredInEntity()

    /**
     * Displays if the entity is tored externally.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-isstoredexternally)
     */
    public fun isStoredExternally(): Any? = unwrap(this).getIsStoredExternally()

    /**
     * Displays if the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-istimeseries)
     */
    public fun isTimeSeries(): Any? = unwrap(this).getIsTimeSeries()

    /**
     * A builder for [DefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configuration The configuration.
       */
      public fun configuration(configuration: IResolvable)

      /**
       * @param configuration The configuration.
       */
      public fun configuration(configuration: Map<String, String>)

      /**
       * @param dataType The data type.
       */
      public fun dataType(dataType: IResolvable)

      /**
       * @param dataType The data type.
       */
      public fun dataType(dataType: DataTypeProperty)

      /**
       * @param dataType The data type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fac4724514d75c45b1a9ff8df8a21e9db7830b2a179f0e0853d59e5204d159cb")
      public fun dataType(dataType: DataTypeProperty.Builder.() -> Unit)

      /**
       * @param defaultValue The default value.
       */
      public fun defaultValue(defaultValue: IResolvable)

      /**
       * @param defaultValue The default value.
       */
      public fun defaultValue(defaultValue: DataValueProperty)

      /**
       * @param defaultValue The default value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83f6cf92a61e98c70b3eb65fb11d43c5b6ce0d778bcaf988732b8e39d0adf506")
      public fun defaultValue(defaultValue: DataValueProperty.Builder.() -> Unit)

      /**
       * @param isExternalId Displays if the entity has a external Id.
       */
      public fun isExternalId(isExternalId: Boolean)

      /**
       * @param isExternalId Displays if the entity has a external Id.
       */
      public fun isExternalId(isExternalId: IResolvable)

      /**
       * @param isFinal Displays if the entity is final.
       */
      public fun isFinal(isFinal: Boolean)

      /**
       * @param isFinal Displays if the entity is final.
       */
      public fun isFinal(isFinal: IResolvable)

      /**
       * @param isImported Displays if the entity is imported.
       */
      public fun isImported(isImported: Boolean)

      /**
       * @param isImported Displays if the entity is imported.
       */
      public fun isImported(isImported: IResolvable)

      /**
       * @param isInherited Displays if the entity is inherited.
       */
      public fun isInherited(isInherited: Boolean)

      /**
       * @param isInherited Displays if the entity is inherited.
       */
      public fun isInherited(isInherited: IResolvable)

      /**
       * @param isRequiredInEntity Displays if the entity is a required entity.
       */
      public fun isRequiredInEntity(isRequiredInEntity: Boolean)

      /**
       * @param isRequiredInEntity Displays if the entity is a required entity.
       */
      public fun isRequiredInEntity(isRequiredInEntity: IResolvable)

      /**
       * @param isStoredExternally Displays if the entity is tored externally.
       */
      public fun isStoredExternally(isStoredExternally: Boolean)

      /**
       * @param isStoredExternally Displays if the entity is tored externally.
       */
      public fun isStoredExternally(isStoredExternally: IResolvable)

      /**
       * @param isTimeSeries Displays if the entity.
       */
      public fun isTimeSeries(isTimeSeries: Boolean)

      /**
       * @param isTimeSeries Displays if the entity.
       */
      public fun isTimeSeries(isTimeSeries: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DefinitionProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DefinitionProperty.builder()

      /**
       * @param configuration The configuration.
       */
      override fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
      }

      /**
       * @param configuration The configuration.
       */
      override fun configuration(configuration: Map<String, String>) {
        cdkBuilder.configuration(configuration)
      }

      /**
       * @param dataType The data type.
       */
      override fun dataType(dataType: IResolvable) {
        cdkBuilder.dataType(dataType.let(IResolvable::unwrap))
      }

      /**
       * @param dataType The data type.
       */
      override fun dataType(dataType: DataTypeProperty) {
        cdkBuilder.dataType(dataType.let(DataTypeProperty::unwrap))
      }

      /**
       * @param dataType The data type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fac4724514d75c45b1a9ff8df8a21e9db7830b2a179f0e0853d59e5204d159cb")
      override fun dataType(dataType: DataTypeProperty.Builder.() -> Unit): Unit =
          dataType(DataTypeProperty(dataType))

      /**
       * @param defaultValue The default value.
       */
      override fun defaultValue(defaultValue: IResolvable) {
        cdkBuilder.defaultValue(defaultValue.let(IResolvable::unwrap))
      }

      /**
       * @param defaultValue The default value.
       */
      override fun defaultValue(defaultValue: DataValueProperty) {
        cdkBuilder.defaultValue(defaultValue.let(DataValueProperty::unwrap))
      }

      /**
       * @param defaultValue The default value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83f6cf92a61e98c70b3eb65fb11d43c5b6ce0d778bcaf988732b8e39d0adf506")
      override fun defaultValue(defaultValue: DataValueProperty.Builder.() -> Unit): Unit =
          defaultValue(DataValueProperty(defaultValue))

      /**
       * @param isExternalId Displays if the entity has a external Id.
       */
      override fun isExternalId(isExternalId: Boolean) {
        cdkBuilder.isExternalId(isExternalId)
      }

      /**
       * @param isExternalId Displays if the entity has a external Id.
       */
      override fun isExternalId(isExternalId: IResolvable) {
        cdkBuilder.isExternalId(isExternalId.let(IResolvable::unwrap))
      }

      /**
       * @param isFinal Displays if the entity is final.
       */
      override fun isFinal(isFinal: Boolean) {
        cdkBuilder.isFinal(isFinal)
      }

      /**
       * @param isFinal Displays if the entity is final.
       */
      override fun isFinal(isFinal: IResolvable) {
        cdkBuilder.isFinal(isFinal.let(IResolvable::unwrap))
      }

      /**
       * @param isImported Displays if the entity is imported.
       */
      override fun isImported(isImported: Boolean) {
        cdkBuilder.isImported(isImported)
      }

      /**
       * @param isImported Displays if the entity is imported.
       */
      override fun isImported(isImported: IResolvable) {
        cdkBuilder.isImported(isImported.let(IResolvable::unwrap))
      }

      /**
       * @param isInherited Displays if the entity is inherited.
       */
      override fun isInherited(isInherited: Boolean) {
        cdkBuilder.isInherited(isInherited)
      }

      /**
       * @param isInherited Displays if the entity is inherited.
       */
      override fun isInherited(isInherited: IResolvable) {
        cdkBuilder.isInherited(isInherited.let(IResolvable::unwrap))
      }

      /**
       * @param isRequiredInEntity Displays if the entity is a required entity.
       */
      override fun isRequiredInEntity(isRequiredInEntity: Boolean) {
        cdkBuilder.isRequiredInEntity(isRequiredInEntity)
      }

      /**
       * @param isRequiredInEntity Displays if the entity is a required entity.
       */
      override fun isRequiredInEntity(isRequiredInEntity: IResolvable) {
        cdkBuilder.isRequiredInEntity(isRequiredInEntity.let(IResolvable::unwrap))
      }

      /**
       * @param isStoredExternally Displays if the entity is tored externally.
       */
      override fun isStoredExternally(isStoredExternally: Boolean) {
        cdkBuilder.isStoredExternally(isStoredExternally)
      }

      /**
       * @param isStoredExternally Displays if the entity is tored externally.
       */
      override fun isStoredExternally(isStoredExternally: IResolvable) {
        cdkBuilder.isStoredExternally(isStoredExternally.let(IResolvable::unwrap))
      }

      /**
       * @param isTimeSeries Displays if the entity.
       */
      override fun isTimeSeries(isTimeSeries: Boolean) {
        cdkBuilder.isTimeSeries(isTimeSeries)
      }

      /**
       * @param isTimeSeries Displays if the entity.
       */
      override fun isTimeSeries(isTimeSeries: IResolvable) {
        cdkBuilder.isTimeSeries(isTimeSeries.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity.DefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DefinitionProperty,
    ) : CdkObject(cdkObject), DefinitionProperty {
      /**
       * The configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-configuration)
       */
      override fun configuration(): Any? = unwrap(this).getConfiguration()

      /**
       * The data type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-datatype)
       */
      override fun dataType(): Any? = unwrap(this).getDataType()

      /**
       * The default value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-defaultvalue)
       */
      override fun defaultValue(): Any? = unwrap(this).getDefaultValue()

      /**
       * Displays if the entity has a external Id.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-isexternalid)
       */
      override fun isExternalId(): Any? = unwrap(this).getIsExternalId()

      /**
       * Displays if the entity is final.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-isfinal)
       */
      override fun isFinal(): Any? = unwrap(this).getIsFinal()

      /**
       * Displays if the entity is imported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-isimported)
       */
      override fun isImported(): Any? = unwrap(this).getIsImported()

      /**
       * Displays if the entity is inherited.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-isinherited)
       */
      override fun isInherited(): Any? = unwrap(this).getIsInherited()

      /**
       * Displays if the entity is a required entity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-isrequiredinentity)
       */
      override fun isRequiredInEntity(): Any? = unwrap(this).getIsRequiredInEntity()

      /**
       * Displays if the entity is tored externally.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-isstoredexternally)
       */
      override fun isStoredExternally(): Any? = unwrap(this).getIsStoredExternally()

      /**
       * Displays if the entity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-definition.html#cfn-iottwinmaker-entity-definition-istimeseries)
       */
      override fun isTimeSeries(): Any? = unwrap(this).getIsTimeSeries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.DefinitionProperty):
          DefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as DefinitionProperty

      internal fun unwrap(wrapped: DefinitionProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DefinitionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DefinitionProperty
    }
  }

  /**
   * An object that specifies a value for a property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * DataValueProperty dataValueProperty_;
   * Object relationshipValue;
   * DataValueProperty dataValueProperty = DataValueProperty.builder()
   * .booleanValue(false)
   * .doubleValue(123)
   * .expression("expression")
   * .integerValue(123)
   * .listValue(List.of(dataValueProperty_))
   * .longValue(123)
   * .mapValue(Map.of(
   * "mapValueKey", dataValueProperty_))
   * .relationshipValue(relationshipValue)
   * .stringValue("stringValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html)
   */
  public interface DataValueProperty {
    /**
     * A boolean value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-booleanvalue)
     */
    public fun booleanValue(): Any? = unwrap(this).getBooleanValue()

    /**
     * A double value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-doublevalue)
     */
    public fun doubleValue(): Number? = unwrap(this).getDoubleValue()

    /**
     * An expression that produces the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-expression)
     */
    public fun expression(): String? = unwrap(this).getExpression()

    /**
     * An integer value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-integervalue)
     */
    public fun integerValue(): Number? = unwrap(this).getIntegerValue()

    /**
     * A list of multiple values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-listvalue)
     */
    public fun listValue(): Any? = unwrap(this).getListValue()

    /**
     * A long value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-longvalue)
     */
    public fun longValue(): Number? = unwrap(this).getLongValue()

    /**
     * An object that maps strings to multiple DataValue objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-mapvalue)
     */
    public fun mapValue(): Any? = unwrap(this).getMapValue()

    /**
     * A value that relates a component to another component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-relationshipvalue)
     */
    public fun relationshipValue(): Any? = unwrap(this).getRelationshipValue()

    /**
     * A string value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-stringvalue)
     */
    public fun stringValue(): String? = unwrap(this).getStringValue()

    /**
     * A builder for [DataValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param booleanValue A boolean value.
       */
      public fun booleanValue(booleanValue: Boolean)

      /**
       * @param booleanValue A boolean value.
       */
      public fun booleanValue(booleanValue: IResolvable)

      /**
       * @param doubleValue A double value.
       */
      public fun doubleValue(doubleValue: Number)

      /**
       * @param expression An expression that produces the value.
       */
      public fun expression(expression: String)

      /**
       * @param integerValue An integer value.
       */
      public fun integerValue(integerValue: Number)

      /**
       * @param listValue A list of multiple values.
       */
      public fun listValue(listValue: IResolvable)

      /**
       * @param listValue A list of multiple values.
       */
      public fun listValue(listValue: List<Any>)

      /**
       * @param listValue A list of multiple values.
       */
      public fun listValue(vararg listValue: Any)

      /**
       * @param longValue A long value.
       */
      public fun longValue(longValue: Number)

      /**
       * @param mapValue An object that maps strings to multiple DataValue objects.
       */
      public fun mapValue(mapValue: IResolvable)

      /**
       * @param mapValue An object that maps strings to multiple DataValue objects.
       */
      public fun mapValue(mapValue: Map<String, Any>)

      /**
       * @param relationshipValue A value that relates a component to another component.
       */
      public fun relationshipValue(relationshipValue: Any)

      /**
       * @param stringValue A string value.
       */
      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataValueProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataValueProperty.builder()

      /**
       * @param booleanValue A boolean value.
       */
      override fun booleanValue(booleanValue: Boolean) {
        cdkBuilder.booleanValue(booleanValue)
      }

      /**
       * @param booleanValue A boolean value.
       */
      override fun booleanValue(booleanValue: IResolvable) {
        cdkBuilder.booleanValue(booleanValue.let(IResolvable::unwrap))
      }

      /**
       * @param doubleValue A double value.
       */
      override fun doubleValue(doubleValue: Number) {
        cdkBuilder.doubleValue(doubleValue)
      }

      /**
       * @param expression An expression that produces the value.
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param integerValue An integer value.
       */
      override fun integerValue(integerValue: Number) {
        cdkBuilder.integerValue(integerValue)
      }

      /**
       * @param listValue A list of multiple values.
       */
      override fun listValue(listValue: IResolvable) {
        cdkBuilder.listValue(listValue.let(IResolvable::unwrap))
      }

      /**
       * @param listValue A list of multiple values.
       */
      override fun listValue(listValue: List<Any>) {
        cdkBuilder.listValue(listValue)
      }

      /**
       * @param listValue A list of multiple values.
       */
      override fun listValue(vararg listValue: Any): Unit = listValue(listValue.toList())

      /**
       * @param longValue A long value.
       */
      override fun longValue(longValue: Number) {
        cdkBuilder.longValue(longValue)
      }

      /**
       * @param mapValue An object that maps strings to multiple DataValue objects.
       */
      override fun mapValue(mapValue: IResolvable) {
        cdkBuilder.mapValue(mapValue.let(IResolvable::unwrap))
      }

      /**
       * @param mapValue An object that maps strings to multiple DataValue objects.
       */
      override fun mapValue(mapValue: Map<String, Any>) {
        cdkBuilder.mapValue(mapValue)
      }

      /**
       * @param relationshipValue A value that relates a component to another component.
       */
      override fun relationshipValue(relationshipValue: Any) {
        cdkBuilder.relationshipValue(relationshipValue)
      }

      /**
       * @param stringValue A string value.
       */
      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataValueProperty,
    ) : CdkObject(cdkObject), DataValueProperty {
      /**
       * A boolean value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-booleanvalue)
       */
      override fun booleanValue(): Any? = unwrap(this).getBooleanValue()

      /**
       * A double value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-doublevalue)
       */
      override fun doubleValue(): Number? = unwrap(this).getDoubleValue()

      /**
       * An expression that produces the value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-expression)
       */
      override fun expression(): String? = unwrap(this).getExpression()

      /**
       * An integer value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-integervalue)
       */
      override fun integerValue(): Number? = unwrap(this).getIntegerValue()

      /**
       * A list of multiple values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-listvalue)
       */
      override fun listValue(): Any? = unwrap(this).getListValue()

      /**
       * A long value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-longvalue)
       */
      override fun longValue(): Number? = unwrap(this).getLongValue()

      /**
       * An object that maps strings to multiple DataValue objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-mapvalue)
       */
      override fun mapValue(): Any? = unwrap(this).getMapValue()

      /**
       * A value that relates a component to another component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-relationshipvalue)
       */
      override fun relationshipValue(): Any? = unwrap(this).getRelationshipValue()

      /**
       * A string value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-datavalue.html#cfn-iottwinmaker-entity-datavalue-stringvalue)
       */
      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataValueProperty):
          DataValueProperty = CdkObjectWrappers.wrap(cdkObject) as DataValueProperty

      internal fun unwrap(wrapped: DataValueProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataValueProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.DataValueProperty
    }
  }

  /**
   * Information about a composite component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * DataValueProperty dataValueProperty_;
   * Object definition;
   * Object error;
   * Object relationshipValue;
   * CompositeComponentProperty compositeComponentProperty = CompositeComponentProperty.builder()
   * .componentName("componentName")
   * .componentPath("componentPath")
   * .componentTypeId("componentTypeId")
   * .description("description")
   * .properties(Map.of(
   * "propertiesKey", PropertyProperty.builder()
   * .definition(definition)
   * .value(DataValueProperty.builder()
   * .booleanValue(false)
   * .doubleValue(123)
   * .expression("expression")
   * .integerValue(123)
   * .listValue(List.of(dataValueProperty_))
   * .longValue(123)
   * .mapValue(Map.of(
   * "mapValueKey", dataValueProperty_))
   * .relationshipValue(relationshipValue)
   * .stringValue("stringValue")
   * .build())
   * .build()))
   * .propertyGroups(Map.of(
   * "propertyGroupsKey", PropertyGroupProperty.builder()
   * .groupType("groupType")
   * .propertyNames(List.of("propertyNames"))
   * .build()))
   * .status(StatusProperty.builder()
   * .error(error)
   * .state("state")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html)
   */
  public interface CompositeComponentProperty {
    /**
     * The name of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html#cfn-iottwinmaker-entity-compositecomponent-componentname)
     */
    public fun componentName(): String? = unwrap(this).getComponentName()

    /**
     * The path to the composite component, starting from the top-level component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html#cfn-iottwinmaker-entity-compositecomponent-componentpath)
     */
    public fun componentPath(): String? = unwrap(this).getComponentPath()

    /**
     * The ID of the composite component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html#cfn-iottwinmaker-entity-compositecomponent-componenttypeid)
     */
    public fun componentTypeId(): String? = unwrap(this).getComponentTypeId()

    /**
     * The description of the component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html#cfn-iottwinmaker-entity-compositecomponent-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Map of strings to the properties in the component type.
     *
     * Each string in the mapping must be unique to this component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html#cfn-iottwinmaker-entity-compositecomponent-properties)
     */
    public fun properties(): Any? = unwrap(this).getProperties()

    /**
     * The property groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html#cfn-iottwinmaker-entity-compositecomponent-propertygroups)
     */
    public fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

    /**
     * The current status of the composite component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html#cfn-iottwinmaker-entity-compositecomponent-status)
     */
    public fun status(): Any? = unwrap(this).getStatus()

    /**
     * A builder for [CompositeComponentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param componentName The name of the component.
       */
      public fun componentName(componentName: String)

      /**
       * @param componentPath The path to the composite component, starting from the top-level
       * component.
       */
      public fun componentPath(componentPath: String)

      /**
       * @param componentTypeId The ID of the composite component type.
       */
      public fun componentTypeId(componentTypeId: String)

      /**
       * @param description The description of the component type.
       */
      public fun description(description: String)

      /**
       * @param properties Map of strings to the properties in the component type.
       * Each string in the mapping must be unique to this component.
       */
      public fun properties(properties: IResolvable)

      /**
       * @param properties Map of strings to the properties in the component type.
       * Each string in the mapping must be unique to this component.
       */
      public fun properties(properties: Map<String, Any>)

      /**
       * @param propertyGroups The property groups.
       */
      public fun propertyGroups(propertyGroups: IResolvable)

      /**
       * @param propertyGroups The property groups.
       */
      public fun propertyGroups(propertyGroups: Map<String, Any>)

      /**
       * @param status The current status of the composite component.
       */
      public fun status(status: IResolvable)

      /**
       * @param status The current status of the composite component.
       */
      public fun status(status: StatusProperty)

      /**
       * @param status The current status of the composite component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b85cfef170fd3c440c2e6131bd11e771c46b1d23f3a4334204d4945e94913bb6")
      public fun status(status: StatusProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.CompositeComponentProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.CompositeComponentProperty.builder()

      /**
       * @param componentName The name of the component.
       */
      override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      /**
       * @param componentPath The path to the composite component, starting from the top-level
       * component.
       */
      override fun componentPath(componentPath: String) {
        cdkBuilder.componentPath(componentPath)
      }

      /**
       * @param componentTypeId The ID of the composite component type.
       */
      override fun componentTypeId(componentTypeId: String) {
        cdkBuilder.componentTypeId(componentTypeId)
      }

      /**
       * @param description The description of the component type.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param properties Map of strings to the properties in the component type.
       * Each string in the mapping must be unique to this component.
       */
      override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable::unwrap))
      }

      /**
       * @param properties Map of strings to the properties in the component type.
       * Each string in the mapping must be unique to this component.
       */
      override fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
      }

      /**
       * @param propertyGroups The property groups.
       */
      override fun propertyGroups(propertyGroups: IResolvable) {
        cdkBuilder.propertyGroups(propertyGroups.let(IResolvable::unwrap))
      }

      /**
       * @param propertyGroups The property groups.
       */
      override fun propertyGroups(propertyGroups: Map<String, Any>) {
        cdkBuilder.propertyGroups(propertyGroups)
      }

      /**
       * @param status The current status of the composite component.
       */
      override fun status(status: IResolvable) {
        cdkBuilder.status(status.let(IResolvable::unwrap))
      }

      /**
       * @param status The current status of the composite component.
       */
      override fun status(status: StatusProperty) {
        cdkBuilder.status(status.let(StatusProperty::unwrap))
      }

      /**
       * @param status The current status of the composite component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b85cfef170fd3c440c2e6131bd11e771c46b1d23f3a4334204d4945e94913bb6")
      override fun status(status: StatusProperty.Builder.() -> Unit): Unit =
          status(StatusProperty(status))

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.CompositeComponentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.CompositeComponentProperty,
    ) : CdkObject(cdkObject), CompositeComponentProperty {
      /**
       * The name of the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html#cfn-iottwinmaker-entity-compositecomponent-componentname)
       */
      override fun componentName(): String? = unwrap(this).getComponentName()

      /**
       * The path to the composite component, starting from the top-level component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html#cfn-iottwinmaker-entity-compositecomponent-componentpath)
       */
      override fun componentPath(): String? = unwrap(this).getComponentPath()

      /**
       * The ID of the composite component type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html#cfn-iottwinmaker-entity-compositecomponent-componenttypeid)
       */
      override fun componentTypeId(): String? = unwrap(this).getComponentTypeId()

      /**
       * The description of the component type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html#cfn-iottwinmaker-entity-compositecomponent-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Map of strings to the properties in the component type.
       *
       * Each string in the mapping must be unique to this component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html#cfn-iottwinmaker-entity-compositecomponent-properties)
       */
      override fun properties(): Any? = unwrap(this).getProperties()

      /**
       * The property groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html#cfn-iottwinmaker-entity-compositecomponent-propertygroups)
       */
      override fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

      /**
       * The current status of the composite component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-compositecomponent.html#cfn-iottwinmaker-entity-compositecomponent-status)
       */
      override fun status(): Any? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CompositeComponentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.CompositeComponentProperty):
          CompositeComponentProperty = CdkObjectWrappers.wrap(cdkObject) as
          CompositeComponentProperty

      internal fun unwrap(wrapped: CompositeComponentProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.CompositeComponentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.CompositeComponentProperty
    }
  }

  /**
   * The property group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * PropertyGroupProperty propertyGroupProperty = PropertyGroupProperty.builder()
   * .groupType("groupType")
   * .propertyNames(List.of("propertyNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-propertygroup.html)
   */
  public interface PropertyGroupProperty {
    /**
     * The group type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-propertygroup.html#cfn-iottwinmaker-entity-propertygroup-grouptype)
     */
    public fun groupType(): String? = unwrap(this).getGroupType()

    /**
     * The property names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-propertygroup.html#cfn-iottwinmaker-entity-propertygroup-propertynames)
     */
    public fun propertyNames(): List<String> = unwrap(this).getPropertyNames() ?: emptyList()

    /**
     * A builder for [PropertyGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groupType The group type.
       */
      public fun groupType(groupType: String)

      /**
       * @param propertyNames The property names.
       */
      public fun propertyNames(propertyNames: List<String>)

      /**
       * @param propertyNames The property names.
       */
      public fun propertyNames(vararg propertyNames: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyGroupProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyGroupProperty.builder()

      /**
       * @param groupType The group type.
       */
      override fun groupType(groupType: String) {
        cdkBuilder.groupType(groupType)
      }

      /**
       * @param propertyNames The property names.
       */
      override fun propertyNames(propertyNames: List<String>) {
        cdkBuilder.propertyNames(propertyNames)
      }

      /**
       * @param propertyNames The property names.
       */
      override fun propertyNames(vararg propertyNames: String): Unit =
          propertyNames(propertyNames.toList())

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyGroupProperty,
    ) : CdkObject(cdkObject), PropertyGroupProperty {
      /**
       * The group type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-propertygroup.html#cfn-iottwinmaker-entity-propertygroup-grouptype)
       */
      override fun groupType(): String? = unwrap(this).getGroupType()

      /**
       * The property names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-propertygroup.html#cfn-iottwinmaker-entity-propertygroup-propertynames)
       */
      override fun propertyNames(): List<String> = unwrap(this).getPropertyNames() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PropertyGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyGroupProperty):
          PropertyGroupProperty = CdkObjectWrappers.wrap(cdkObject) as PropertyGroupProperty

      internal fun unwrap(wrapped: PropertyGroupProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyGroupProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnEntity.PropertyGroupProperty
    }
  }
}
