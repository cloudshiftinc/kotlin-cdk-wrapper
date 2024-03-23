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
 * Use the `AWS::IoTTwinMaker::ComponentType` resource to declare a component type.
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
 * CfnComponentType cfnComponentType = CfnComponentType.Builder.create(this, "MyCfnComponentType")
 * .componentTypeId("componentTypeId")
 * .workspaceId("workspaceId")
 * // the properties below are optional
 * .compositeComponentTypes(Map.of(
 * "compositeComponentTypesKey", CompositeComponentTypeProperty.builder()
 * .componentTypeId("componentTypeId")
 * .build()))
 * .description("description")
 * .extendsFrom(List.of("extendsFrom"))
 * .functions(Map.of(
 * "functionsKey", FunctionProperty.builder()
 * .implementedBy(DataConnectorProperty.builder()
 * .isNative(false)
 * .lambda(LambdaFunctionProperty.builder()
 * .arn("arn")
 * .build())
 * .build())
 * .requiredProperties(List.of("requiredProperties"))
 * .scope("scope")
 * .build()))
 * .isSingleton(false)
 * .propertyDefinitions(Map.of(
 * "propertyDefinitionsKey", PropertyDefinitionProperty.builder()
 * .configurations(Map.of(
 * "configurationsKey", "configurations"))
 * .dataType(DataTypeProperty.builder()
 * .type("type")
 * // the properties below are optional
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
 * .isRequiredInEntity(false)
 * .isStoredExternally(false)
 * .isTimeSeries(false)
 * .build()))
 * .propertyGroups(Map.of(
 * "propertyGroupsKey", PropertyGroupProperty.builder()
 * .groupType("groupType")
 * .propertyNames(List.of("propertyNames"))
 * .build()))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html)
 */
public open class CfnComponentType(
  cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnComponentTypeProps,
  ) :
      this(software.amazon.awscdk.services.iottwinmaker.CfnComponentType(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnComponentTypeProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnComponentTypeProps.Builder.() -> Unit,
  ) : this(scope, id, CfnComponentTypeProps(props)
  )

  /**
   * The ARN of the component type.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time when the component type was created.
   */
  public open fun attrCreationDateTime(): String = unwrap(this).getAttrCreationDateTime()

  /**
   * A boolean value that specifies whether the component type is abstract.
   */
  public open fun attrIsAbstract(): IResolvable =
      unwrap(this).getAttrIsAbstract().let(IResolvable::wrap)

  /**
   * A boolean value that specifies whether the component type has a schema initializer and that the
   * schema initializer has run.
   */
  public open fun attrIsSchemaInitialized(): IResolvable =
      unwrap(this).getAttrIsSchemaInitialized().let(IResolvable::wrap)

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
   * The component type the update time.
   */
  public open fun attrUpdateDateTime(): String = unwrap(this).getAttrUpdateDateTime()

  /**
   * The ID of the component type.
   */
  public open fun componentTypeId(): String = unwrap(this).getComponentTypeId()

  /**
   * The ID of the component type.
   */
  public open fun componentTypeId(`value`: String) {
    unwrap(this).setComponentTypeId(`value`)
  }

  /**
   * Maps strings to `compositeComponentTypes` of the `componentType` .
   */
  public open fun compositeComponentTypes(): Any? = unwrap(this).getCompositeComponentTypes()

  /**
   * Maps strings to `compositeComponentTypes` of the `componentType` .
   */
  public open fun compositeComponentTypes(`value`: IResolvable) {
    unwrap(this).setCompositeComponentTypes(`value`.let(IResolvable::unwrap))
  }

  /**
   * Maps strings to `compositeComponentTypes` of the `componentType` .
   */
  public open fun compositeComponentTypes(`value`: Map<String, Any>) {
    unwrap(this).setCompositeComponentTypes(`value`)
  }

  /**
   * The description of the component type.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the component type.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the parent component type that this component type extends.
   */
  public open fun extendsFrom(): List<String> = unwrap(this).getExtendsFrom() ?: emptyList()

  /**
   * The name of the parent component type that this component type extends.
   */
  public open fun extendsFrom(`value`: List<String>) {
    unwrap(this).setExtendsFrom(`value`)
  }

  /**
   * The name of the parent component type that this component type extends.
   */
  public open fun extendsFrom(vararg `value`: String): Unit = extendsFrom(`value`.toList())

  /**
   * An object that maps strings to the functions in the component type.
   */
  public open fun functions(): Any? = unwrap(this).getFunctions()

  /**
   * An object that maps strings to the functions in the component type.
   */
  public open fun functions(`value`: IResolvable) {
    unwrap(this).setFunctions(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object that maps strings to the functions in the component type.
   */
  public open fun functions(`value`: Map<String, Any>) {
    unwrap(this).setFunctions(`value`)
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
   * A boolean value that specifies whether an entity can have more than one component of this type.
   */
  public open fun isSingleton(): Any? = unwrap(this).getIsSingleton()

  /**
   * A boolean value that specifies whether an entity can have more than one component of this type.
   */
  public open fun isSingleton(`value`: Boolean) {
    unwrap(this).setIsSingleton(`value`)
  }

  /**
   * A boolean value that specifies whether an entity can have more than one component of this type.
   */
  public open fun isSingleton(`value`: IResolvable) {
    unwrap(this).setIsSingleton(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object that maps strings to the property definitions in the component type.
   */
  public open fun propertyDefinitions(): Any? = unwrap(this).getPropertyDefinitions()

  /**
   * An object that maps strings to the property definitions in the component type.
   */
  public open fun propertyDefinitions(`value`: IResolvable) {
    unwrap(this).setPropertyDefinitions(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object that maps strings to the property definitions in the component type.
   */
  public open fun propertyDefinitions(`value`: Map<String, Any>) {
    unwrap(this).setPropertyDefinitions(`value`)
  }

  /**
   * An object that maps strings to the property groups in the component type.
   */
  public open fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

  /**
   * An object that maps strings to the property groups in the component type.
   */
  public open fun propertyGroups(`value`: IResolvable) {
    unwrap(this).setPropertyGroups(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object that maps strings to the property groups in the component type.
   */
  public open fun propertyGroups(`value`: Map<String, Any>) {
    unwrap(this).setPropertyGroups(`value`)
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
   * The ID of the workspace that contains the component type.
   */
  public open fun workspaceId(): String = unwrap(this).getWorkspaceId()

  /**
   * The ID of the workspace that contains the component type.
   */
  public open fun workspaceId(`value`: String) {
    unwrap(this).setWorkspaceId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iottwinmaker.CfnComponentType].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-componenttypeid)
     * @param componentTypeId The ID of the component type. 
     */
    public fun componentTypeId(componentTypeId: String)

    /**
     * Maps strings to `compositeComponentTypes` of the `componentType` .
     *
     * `CompositeComponentType` is referenced by `componentTypeId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-compositecomponenttypes)
     * @param compositeComponentTypes Maps strings to `compositeComponentTypes` of the
     * `componentType` . 
     */
    public fun compositeComponentTypes(compositeComponentTypes: IResolvable)

    /**
     * Maps strings to `compositeComponentTypes` of the `componentType` .
     *
     * `CompositeComponentType` is referenced by `componentTypeId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-compositecomponenttypes)
     * @param compositeComponentTypes Maps strings to `compositeComponentTypes` of the
     * `componentType` . 
     */
    public fun compositeComponentTypes(compositeComponentTypes: Map<String, Any>)

    /**
     * The description of the component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-description)
     * @param description The description of the component type. 
     */
    public fun description(description: String)

    /**
     * The name of the parent component type that this component type extends.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-extendsfrom)
     * @param extendsFrom The name of the parent component type that this component type extends. 
     */
    public fun extendsFrom(extendsFrom: List<String>)

    /**
     * The name of the parent component type that this component type extends.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-extendsfrom)
     * @param extendsFrom The name of the parent component type that this component type extends. 
     */
    public fun extendsFrom(vararg extendsFrom: String)

    /**
     * An object that maps strings to the functions in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information on the FunctionResponse object see the
     * [FunctionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_FunctionResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-functions)
     * @param functions An object that maps strings to the functions in the component type. 
     */
    public fun functions(functions: IResolvable)

    /**
     * An object that maps strings to the functions in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information on the FunctionResponse object see the
     * [FunctionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_FunctionResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-functions)
     * @param functions An object that maps strings to the functions in the component type. 
     */
    public fun functions(functions: Map<String, Any>)

    /**
     * A boolean value that specifies whether an entity can have more than one component of this
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-issingleton)
     * @param isSingleton A boolean value that specifies whether an entity can have more than one
     * component of this type. 
     */
    public fun isSingleton(isSingleton: Boolean)

    /**
     * A boolean value that specifies whether an entity can have more than one component of this
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-issingleton)
     * @param isSingleton A boolean value that specifies whether an entity can have more than one
     * component of this type. 
     */
    public fun isSingleton(isSingleton: IResolvable)

    /**
     * An object that maps strings to the property definitions in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information about the PropertyDefinitionResponse object, see the
     * [PropertyDefinitionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_PropertyDefinitionResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertydefinitions)
     * @param propertyDefinitions An object that maps strings to the property definitions in the
     * component type. 
     */
    public fun propertyDefinitions(propertyDefinitions: IResolvable)

    /**
     * An object that maps strings to the property definitions in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information about the PropertyDefinitionResponse object, see the
     * [PropertyDefinitionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_PropertyDefinitionResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertydefinitions)
     * @param propertyDefinitions An object that maps strings to the property definitions in the
     * component type. 
     */
    public fun propertyDefinitions(propertyDefinitions: Map<String, Any>)

    /**
     * An object that maps strings to the property groups in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertygroups)
     * @param propertyGroups An object that maps strings to the property groups in the component
     * type. 
     */
    public fun propertyGroups(propertyGroups: IResolvable)

    /**
     * An object that maps strings to the property groups in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertygroups)
     * @param propertyGroups An object that maps strings to the property groups in the component
     * type. 
     */
    public fun propertyGroups(propertyGroups: Map<String, Any>)

    /**
     * The ComponentType tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-tags)
     * @param tags The ComponentType tags. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The ID of the workspace that contains the component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-workspaceid)
     * @param workspaceId The ID of the workspace that contains the component type. 
     */
    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnComponentType.Builder.create(scope, id)

    /**
     * The ID of the component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-componenttypeid)
     * @param componentTypeId The ID of the component type. 
     */
    override fun componentTypeId(componentTypeId: String) {
      cdkBuilder.componentTypeId(componentTypeId)
    }

    /**
     * Maps strings to `compositeComponentTypes` of the `componentType` .
     *
     * `CompositeComponentType` is referenced by `componentTypeId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-compositecomponenttypes)
     * @param compositeComponentTypes Maps strings to `compositeComponentTypes` of the
     * `componentType` . 
     */
    override fun compositeComponentTypes(compositeComponentTypes: IResolvable) {
      cdkBuilder.compositeComponentTypes(compositeComponentTypes.let(IResolvable::unwrap))
    }

    /**
     * Maps strings to `compositeComponentTypes` of the `componentType` .
     *
     * `CompositeComponentType` is referenced by `componentTypeId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-compositecomponenttypes)
     * @param compositeComponentTypes Maps strings to `compositeComponentTypes` of the
     * `componentType` . 
     */
    override fun compositeComponentTypes(compositeComponentTypes: Map<String, Any>) {
      cdkBuilder.compositeComponentTypes(compositeComponentTypes)
    }

    /**
     * The description of the component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-description)
     * @param description The description of the component type. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the parent component type that this component type extends.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-extendsfrom)
     * @param extendsFrom The name of the parent component type that this component type extends. 
     */
    override fun extendsFrom(extendsFrom: List<String>) {
      cdkBuilder.extendsFrom(extendsFrom)
    }

    /**
     * The name of the parent component type that this component type extends.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-extendsfrom)
     * @param extendsFrom The name of the parent component type that this component type extends. 
     */
    override fun extendsFrom(vararg extendsFrom: String): Unit = extendsFrom(extendsFrom.toList())

    /**
     * An object that maps strings to the functions in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information on the FunctionResponse object see the
     * [FunctionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_FunctionResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-functions)
     * @param functions An object that maps strings to the functions in the component type. 
     */
    override fun functions(functions: IResolvable) {
      cdkBuilder.functions(functions.let(IResolvable::unwrap))
    }

    /**
     * An object that maps strings to the functions in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information on the FunctionResponse object see the
     * [FunctionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_FunctionResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-functions)
     * @param functions An object that maps strings to the functions in the component type. 
     */
    override fun functions(functions: Map<String, Any>) {
      cdkBuilder.functions(functions)
    }

    /**
     * A boolean value that specifies whether an entity can have more than one component of this
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-issingleton)
     * @param isSingleton A boolean value that specifies whether an entity can have more than one
     * component of this type. 
     */
    override fun isSingleton(isSingleton: Boolean) {
      cdkBuilder.isSingleton(isSingleton)
    }

    /**
     * A boolean value that specifies whether an entity can have more than one component of this
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-issingleton)
     * @param isSingleton A boolean value that specifies whether an entity can have more than one
     * component of this type. 
     */
    override fun isSingleton(isSingleton: IResolvable) {
      cdkBuilder.isSingleton(isSingleton.let(IResolvable::unwrap))
    }

    /**
     * An object that maps strings to the property definitions in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information about the PropertyDefinitionResponse object, see the
     * [PropertyDefinitionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_PropertyDefinitionResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertydefinitions)
     * @param propertyDefinitions An object that maps strings to the property definitions in the
     * component type. 
     */
    override fun propertyDefinitions(propertyDefinitions: IResolvable) {
      cdkBuilder.propertyDefinitions(propertyDefinitions.let(IResolvable::unwrap))
    }

    /**
     * An object that maps strings to the property definitions in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * For information about the PropertyDefinitionResponse object, see the
     * [PropertyDefinitionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_PropertyDefinitionResponse.html)
     * API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertydefinitions)
     * @param propertyDefinitions An object that maps strings to the property definitions in the
     * component type. 
     */
    override fun propertyDefinitions(propertyDefinitions: Map<String, Any>) {
      cdkBuilder.propertyDefinitions(propertyDefinitions)
    }

    /**
     * An object that maps strings to the property groups in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertygroups)
     * @param propertyGroups An object that maps strings to the property groups in the component
     * type. 
     */
    override fun propertyGroups(propertyGroups: IResolvable) {
      cdkBuilder.propertyGroups(propertyGroups.let(IResolvable::unwrap))
    }

    /**
     * An object that maps strings to the property groups in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertygroups)
     * @param propertyGroups An object that maps strings to the property groups in the component
     * type. 
     */
    override fun propertyGroups(propertyGroups: Map<String, Any>) {
      cdkBuilder.propertyGroups(propertyGroups)
    }

    /**
     * The ComponentType tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-tags)
     * @param tags The ComponentType tags. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The ID of the workspace that contains the component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-workspaceid)
     * @param workspaceId The ID of the workspace that contains the component type. 
     */
    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnComponentType =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iottwinmaker.CfnComponentType.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnComponentType {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnComponentType(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType):
        CfnComponentType = CfnComponentType(cdkObject)

    internal fun unwrap(wrapped: CfnComponentType):
        software.amazon.awscdk.services.iottwinmaker.CfnComponentType = wrapped.cdkObject as
        software.amazon.awscdk.services.iottwinmaker.CfnComponentType
  }

  /**
   * Specifies the ID of the composite component type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * CompositeComponentTypeProperty compositeComponentTypeProperty =
   * CompositeComponentTypeProperty.builder()
   * .componentTypeId("componentTypeId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-compositecomponenttype.html)
   */
  public interface CompositeComponentTypeProperty {
    /**
     * The ID of the component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-compositecomponenttype.html#cfn-iottwinmaker-componenttype-compositecomponenttype-componenttypeid)
     */
    public fun componentTypeId(): String? = unwrap(this).getComponentTypeId()

    /**
     * A builder for [CompositeComponentTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param componentTypeId The ID of the component type.
       */
      public fun componentTypeId(componentTypeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.CompositeComponentTypeProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.CompositeComponentTypeProperty.builder()

      /**
       * @param componentTypeId The ID of the component type.
       */
      override fun componentTypeId(componentTypeId: String) {
        cdkBuilder.componentTypeId(componentTypeId)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.CompositeComponentTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.CompositeComponentTypeProperty,
    ) : CdkObject(cdkObject), CompositeComponentTypeProperty {
      /**
       * The ID of the component type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-compositecomponenttype.html#cfn-iottwinmaker-componenttype-compositecomponenttype-componenttypeid)
       */
      override fun componentTypeId(): String? = unwrap(this).getComponentTypeId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CompositeComponentTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.CompositeComponentTypeProperty):
          CompositeComponentTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CompositeComponentTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CompositeComponentTypeProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.CompositeComponentTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.CompositeComponentTypeProperty
    }
  }

  /**
   * The data connector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * DataConnectorProperty dataConnectorProperty = DataConnectorProperty.builder()
   * .isNative(false)
   * .lambda(LambdaFunctionProperty.builder()
   * .arn("arn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-dataconnector.html)
   */
  public interface DataConnectorProperty {
    /**
     * A boolean value that specifies whether the data connector is native to IoT TwinMaker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-dataconnector.html#cfn-iottwinmaker-componenttype-dataconnector-isnative)
     */
    public fun isNative(): Any? = unwrap(this).getIsNative()

    /**
     * The Lambda function associated with the data connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-dataconnector.html#cfn-iottwinmaker-componenttype-dataconnector-lambda)
     */
    public fun lambda(): Any? = unwrap(this).getLambda()

    /**
     * A builder for [DataConnectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isNative A boolean value that specifies whether the data connector is native to IoT
       * TwinMaker.
       */
      public fun isNative(isNative: Boolean)

      /**
       * @param isNative A boolean value that specifies whether the data connector is native to IoT
       * TwinMaker.
       */
      public fun isNative(isNative: IResolvable)

      /**
       * @param lambda The Lambda function associated with the data connector.
       */
      public fun lambda(lambda: IResolvable)

      /**
       * @param lambda The Lambda function associated with the data connector.
       */
      public fun lambda(lambda: LambdaFunctionProperty)

      /**
       * @param lambda The Lambda function associated with the data connector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c08dd89d97d10c457ef20497f73349df65683ec17c5ab8a3e5c781165cef3ef5")
      public fun lambda(lambda: LambdaFunctionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataConnectorProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataConnectorProperty.builder()

      /**
       * @param isNative A boolean value that specifies whether the data connector is native to IoT
       * TwinMaker.
       */
      override fun isNative(isNative: Boolean) {
        cdkBuilder.isNative(isNative)
      }

      /**
       * @param isNative A boolean value that specifies whether the data connector is native to IoT
       * TwinMaker.
       */
      override fun isNative(isNative: IResolvable) {
        cdkBuilder.isNative(isNative.let(IResolvable::unwrap))
      }

      /**
       * @param lambda The Lambda function associated with the data connector.
       */
      override fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda.let(IResolvable::unwrap))
      }

      /**
       * @param lambda The Lambda function associated with the data connector.
       */
      override fun lambda(lambda: LambdaFunctionProperty) {
        cdkBuilder.lambda(lambda.let(LambdaFunctionProperty::unwrap))
      }

      /**
       * @param lambda The Lambda function associated with the data connector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c08dd89d97d10c457ef20497f73349df65683ec17c5ab8a3e5c781165cef3ef5")
      override fun lambda(lambda: LambdaFunctionProperty.Builder.() -> Unit): Unit =
          lambda(LambdaFunctionProperty(lambda))

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataConnectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataConnectorProperty,
    ) : CdkObject(cdkObject), DataConnectorProperty {
      /**
       * A boolean value that specifies whether the data connector is native to IoT TwinMaker.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-dataconnector.html#cfn-iottwinmaker-componenttype-dataconnector-isnative)
       */
      override fun isNative(): Any? = unwrap(this).getIsNative()

      /**
       * The Lambda function associated with the data connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-dataconnector.html#cfn-iottwinmaker-componenttype-dataconnector-lambda)
       */
      override fun lambda(): Any? = unwrap(this).getLambda()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataConnectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataConnectorProperty):
          DataConnectorProperty = CdkObjectWrappers.wrap(cdkObject) as? DataConnectorProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataConnectorProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataConnectorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataConnectorProperty
    }
  }

  /**
   * An object that specifies the data type of a property.
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
   * .type("type")
   * // the properties below are optional
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
   * .unitOfMeasure("unitOfMeasure")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datatype.html)
   */
  public interface DataTypeProperty {
    /**
     * The allowed values for this data type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datatype.html#cfn-iottwinmaker-componenttype-datatype-allowedvalues)
     */
    public fun allowedValues(): Any? = unwrap(this).getAllowedValues()

    /**
     * The nested type in the data type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datatype.html#cfn-iottwinmaker-componenttype-datatype-nestedtype)
     */
    public fun nestedType(): Any? = unwrap(this).getNestedType()

    /**
     * A relationship that associates a component with another component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datatype.html#cfn-iottwinmaker-componenttype-datatype-relationship)
     */
    public fun relationship(): Any? = unwrap(this).getRelationship()

    /**
     * The underlying type of the data type.
     *
     * Valid Values: `RELATIONSHIP | STRING | LONG | BOOLEAN | INTEGER | DOUBLE | LIST | MAP`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datatype.html#cfn-iottwinmaker-componenttype-datatype-type)
     */
    public fun type(): String

    /**
     * The unit of measure used in this data type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datatype.html#cfn-iottwinmaker-componenttype-datatype-unitofmeasure)
     */
    public fun unitOfMeasure(): String? = unwrap(this).getUnitOfMeasure()

    /**
     * A builder for [DataTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedValues The allowed values for this data type.
       */
      public fun allowedValues(allowedValues: IResolvable)

      /**
       * @param allowedValues The allowed values for this data type.
       */
      public fun allowedValues(allowedValues: List<Any>)

      /**
       * @param allowedValues The allowed values for this data type.
       */
      public fun allowedValues(vararg allowedValues: Any)

      /**
       * @param nestedType The nested type in the data type.
       */
      public fun nestedType(nestedType: IResolvable)

      /**
       * @param nestedType The nested type in the data type.
       */
      public fun nestedType(nestedType: DataTypeProperty)

      /**
       * @param nestedType The nested type in the data type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfe133e2c7fcbca7a83015bb27ecc54401b187a48dd5d74d06a1b7ac56a6453a")
      public fun nestedType(nestedType: Builder.() -> Unit)

      /**
       * @param relationship A relationship that associates a component with another component.
       */
      public fun relationship(relationship: IResolvable)

      /**
       * @param relationship A relationship that associates a component with another component.
       */
      public fun relationship(relationship: RelationshipProperty)

      /**
       * @param relationship A relationship that associates a component with another component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b3230dbda65bc95420cf13c1baa0a1948c9afdbda83a81b9e4863bf10a88195")
      public fun relationship(relationship: RelationshipProperty.Builder.() -> Unit)

      /**
       * @param type The underlying type of the data type. 
       * Valid Values: `RELATIONSHIP | STRING | LONG | BOOLEAN | INTEGER | DOUBLE | LIST | MAP`
       */
      public fun type(type: String)

      /**
       * @param unitOfMeasure The unit of measure used in this data type.
       */
      public fun unitOfMeasure(unitOfMeasure: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataTypeProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataTypeProperty.builder()

      /**
       * @param allowedValues The allowed values for this data type.
       */
      override fun allowedValues(allowedValues: IResolvable) {
        cdkBuilder.allowedValues(allowedValues.let(IResolvable::unwrap))
      }

      /**
       * @param allowedValues The allowed values for this data type.
       */
      override fun allowedValues(allowedValues: List<Any>) {
        cdkBuilder.allowedValues(allowedValues)
      }

      /**
       * @param allowedValues The allowed values for this data type.
       */
      override fun allowedValues(vararg allowedValues: Any): Unit =
          allowedValues(allowedValues.toList())

      /**
       * @param nestedType The nested type in the data type.
       */
      override fun nestedType(nestedType: IResolvable) {
        cdkBuilder.nestedType(nestedType.let(IResolvable::unwrap))
      }

      /**
       * @param nestedType The nested type in the data type.
       */
      override fun nestedType(nestedType: DataTypeProperty) {
        cdkBuilder.nestedType(nestedType.let(DataTypeProperty::unwrap))
      }

      /**
       * @param nestedType The nested type in the data type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfe133e2c7fcbca7a83015bb27ecc54401b187a48dd5d74d06a1b7ac56a6453a")
      override fun nestedType(nestedType: Builder.() -> Unit): Unit =
          nestedType(DataTypeProperty(nestedType))

      /**
       * @param relationship A relationship that associates a component with another component.
       */
      override fun relationship(relationship: IResolvable) {
        cdkBuilder.relationship(relationship.let(IResolvable::unwrap))
      }

      /**
       * @param relationship A relationship that associates a component with another component.
       */
      override fun relationship(relationship: RelationshipProperty) {
        cdkBuilder.relationship(relationship.let(RelationshipProperty::unwrap))
      }

      /**
       * @param relationship A relationship that associates a component with another component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b3230dbda65bc95420cf13c1baa0a1948c9afdbda83a81b9e4863bf10a88195")
      override fun relationship(relationship: RelationshipProperty.Builder.() -> Unit): Unit =
          relationship(RelationshipProperty(relationship))

      /**
       * @param type The underlying type of the data type. 
       * Valid Values: `RELATIONSHIP | STRING | LONG | BOOLEAN | INTEGER | DOUBLE | LIST | MAP`
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param unitOfMeasure The unit of measure used in this data type.
       */
      override fun unitOfMeasure(unitOfMeasure: String) {
        cdkBuilder.unitOfMeasure(unitOfMeasure)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataTypeProperty,
    ) : CdkObject(cdkObject), DataTypeProperty {
      /**
       * The allowed values for this data type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datatype.html#cfn-iottwinmaker-componenttype-datatype-allowedvalues)
       */
      override fun allowedValues(): Any? = unwrap(this).getAllowedValues()

      /**
       * The nested type in the data type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datatype.html#cfn-iottwinmaker-componenttype-datatype-nestedtype)
       */
      override fun nestedType(): Any? = unwrap(this).getNestedType()

      /**
       * A relationship that associates a component with another component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datatype.html#cfn-iottwinmaker-componenttype-datatype-relationship)
       */
      override fun relationship(): Any? = unwrap(this).getRelationship()

      /**
       * The underlying type of the data type.
       *
       * Valid Values: `RELATIONSHIP | STRING | LONG | BOOLEAN | INTEGER | DOUBLE | LIST | MAP`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datatype.html#cfn-iottwinmaker-componenttype-datatype-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The unit of measure used in this data type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datatype.html#cfn-iottwinmaker-componenttype-datatype-unitofmeasure)
       */
      override fun unitOfMeasure(): String? = unwrap(this).getUnitOfMeasure()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataTypeProperty):
          DataTypeProperty = CdkObjectWrappers.wrap(cdkObject) as? DataTypeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataTypeProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataTypeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataTypeProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html)
   */
  public interface DataValueProperty {
    /**
     * A boolean value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-booleanvalue)
     */
    public fun booleanValue(): Any? = unwrap(this).getBooleanValue()

    /**
     * A double value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-doublevalue)
     */
    public fun doubleValue(): Number? = unwrap(this).getDoubleValue()

    /**
     * An expression that produces the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-expression)
     */
    public fun expression(): String? = unwrap(this).getExpression()

    /**
     * An integer value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-integervalue)
     */
    public fun integerValue(): Number? = unwrap(this).getIntegerValue()

    /**
     * A list of multiple values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-listvalue)
     */
    public fun listValue(): Any? = unwrap(this).getListValue()

    /**
     * A long value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-longvalue)
     */
    public fun longValue(): Number? = unwrap(this).getLongValue()

    /**
     * An object that maps strings to multiple `DataValue` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-mapvalue)
     */
    public fun mapValue(): Any? = unwrap(this).getMapValue()

    /**
     * A value that relates a component to another component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-relationshipvalue)
     */
    public fun relationshipValue(): Any? = unwrap(this).getRelationshipValue()

    /**
     * A string value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-stringvalue)
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
       * @param mapValue An object that maps strings to multiple `DataValue` objects.
       */
      public fun mapValue(mapValue: IResolvable)

      /**
       * @param mapValue An object that maps strings to multiple `DataValue` objects.
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
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataValueProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataValueProperty.builder()

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
       * @param mapValue An object that maps strings to multiple `DataValue` objects.
       */
      override fun mapValue(mapValue: IResolvable) {
        cdkBuilder.mapValue(mapValue.let(IResolvable::unwrap))
      }

      /**
       * @param mapValue An object that maps strings to multiple `DataValue` objects.
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

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataValueProperty,
    ) : CdkObject(cdkObject), DataValueProperty {
      /**
       * A boolean value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-booleanvalue)
       */
      override fun booleanValue(): Any? = unwrap(this).getBooleanValue()

      /**
       * A double value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-doublevalue)
       */
      override fun doubleValue(): Number? = unwrap(this).getDoubleValue()

      /**
       * An expression that produces the value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-expression)
       */
      override fun expression(): String? = unwrap(this).getExpression()

      /**
       * An integer value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-integervalue)
       */
      override fun integerValue(): Number? = unwrap(this).getIntegerValue()

      /**
       * A list of multiple values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-listvalue)
       */
      override fun listValue(): Any? = unwrap(this).getListValue()

      /**
       * A long value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-longvalue)
       */
      override fun longValue(): Number? = unwrap(this).getLongValue()

      /**
       * An object that maps strings to multiple `DataValue` objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-mapvalue)
       */
      override fun mapValue(): Any? = unwrap(this).getMapValue()

      /**
       * A value that relates a component to another component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-relationshipvalue)
       */
      override fun relationshipValue(): Any? = unwrap(this).getRelationshipValue()

      /**
       * A string value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-datavalue.html#cfn-iottwinmaker-componenttype-datavalue-stringvalue)
       */
      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataValueProperty):
          DataValueProperty = CdkObjectWrappers.wrap(cdkObject) as? DataValueProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataValueProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataValueProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.DataValueProperty
    }
  }

  /**
   * The component type error.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-error.html)
   */
  public interface ErrorProperty {
    /**
     * The component type error code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-error.html#cfn-iottwinmaker-componenttype-error-code)
     */
    public fun code(): String? = unwrap(this).getCode()

    /**
     * The component type error message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-error.html#cfn-iottwinmaker-componenttype-error-message)
     */
    public fun message(): String? = unwrap(this).getMessage()

    /**
     * A builder for [ErrorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param code The component type error code.
       */
      public fun code(code: String)

      /**
       * @param message The component type error message.
       */
      public fun message(message: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.ErrorProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.ErrorProperty.builder()

      /**
       * @param code The component type error code.
       */
      override fun code(code: String) {
        cdkBuilder.code(code)
      }

      /**
       * @param message The component type error message.
       */
      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.ErrorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.ErrorProperty,
    ) : CdkObject(cdkObject), ErrorProperty {
      /**
       * The component type error code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-error.html#cfn-iottwinmaker-componenttype-error-code)
       */
      override fun code(): String? = unwrap(this).getCode()

      /**
       * The component type error message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-error.html#cfn-iottwinmaker-componenttype-error-message)
       */
      override fun message(): String? = unwrap(this).getMessage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ErrorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.ErrorProperty):
          ErrorProperty = CdkObjectWrappers.wrap(cdkObject) as? ErrorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ErrorProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.ErrorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.ErrorProperty
    }
  }

  /**
   * The function body.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * FunctionProperty functionProperty = FunctionProperty.builder()
   * .implementedBy(DataConnectorProperty.builder()
   * .isNative(false)
   * .lambda(LambdaFunctionProperty.builder()
   * .arn("arn")
   * .build())
   * .build())
   * .requiredProperties(List.of("requiredProperties"))
   * .scope("scope")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-function.html)
   */
  public interface FunctionProperty {
    /**
     * The data connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-function.html#cfn-iottwinmaker-componenttype-function-implementedby)
     */
    public fun implementedBy(): Any? = unwrap(this).getImplementedBy()

    /**
     * The required properties of the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-function.html#cfn-iottwinmaker-componenttype-function-requiredproperties)
     */
    public fun requiredProperties(): List<String> = unwrap(this).getRequiredProperties() ?:
        emptyList()

    /**
     * The scope of the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-function.html#cfn-iottwinmaker-componenttype-function-scope)
     */
    public fun scope(): String? = unwrap(this).getScope()

    /**
     * A builder for [FunctionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param implementedBy The data connector.
       */
      public fun implementedBy(implementedBy: IResolvable)

      /**
       * @param implementedBy The data connector.
       */
      public fun implementedBy(implementedBy: DataConnectorProperty)

      /**
       * @param implementedBy The data connector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1aee36c263610b41f33fb7dfe9d54a34f2eeaa62661e4a28130c31e38a4323fd")
      public fun implementedBy(implementedBy: DataConnectorProperty.Builder.() -> Unit)

      /**
       * @param requiredProperties The required properties of the function.
       */
      public fun requiredProperties(requiredProperties: List<String>)

      /**
       * @param requiredProperties The required properties of the function.
       */
      public fun requiredProperties(vararg requiredProperties: String)

      /**
       * @param scope The scope of the function.
       */
      public fun scope(scope: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.FunctionProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.FunctionProperty.builder()

      /**
       * @param implementedBy The data connector.
       */
      override fun implementedBy(implementedBy: IResolvable) {
        cdkBuilder.implementedBy(implementedBy.let(IResolvable::unwrap))
      }

      /**
       * @param implementedBy The data connector.
       */
      override fun implementedBy(implementedBy: DataConnectorProperty) {
        cdkBuilder.implementedBy(implementedBy.let(DataConnectorProperty::unwrap))
      }

      /**
       * @param implementedBy The data connector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1aee36c263610b41f33fb7dfe9d54a34f2eeaa62661e4a28130c31e38a4323fd")
      override fun implementedBy(implementedBy: DataConnectorProperty.Builder.() -> Unit): Unit =
          implementedBy(DataConnectorProperty(implementedBy))

      /**
       * @param requiredProperties The required properties of the function.
       */
      override fun requiredProperties(requiredProperties: List<String>) {
        cdkBuilder.requiredProperties(requiredProperties)
      }

      /**
       * @param requiredProperties The required properties of the function.
       */
      override fun requiredProperties(vararg requiredProperties: String): Unit =
          requiredProperties(requiredProperties.toList())

      /**
       * @param scope The scope of the function.
       */
      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.FunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.FunctionProperty,
    ) : CdkObject(cdkObject), FunctionProperty {
      /**
       * The data connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-function.html#cfn-iottwinmaker-componenttype-function-implementedby)
       */
      override fun implementedBy(): Any? = unwrap(this).getImplementedBy()

      /**
       * The required properties of the function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-function.html#cfn-iottwinmaker-componenttype-function-requiredproperties)
       */
      override fun requiredProperties(): List<String> = unwrap(this).getRequiredProperties() ?:
          emptyList()

      /**
       * The scope of the function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-function.html#cfn-iottwinmaker-componenttype-function-scope)
       */
      override fun scope(): String? = unwrap(this).getScope()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.FunctionProperty):
          FunctionProperty = CdkObjectWrappers.wrap(cdkObject) as? FunctionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.FunctionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.FunctionProperty
    }
  }

  /**
   * The Lambda function.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * LambdaFunctionProperty lambdaFunctionProperty = LambdaFunctionProperty.builder()
   * .arn("arn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-lambdafunction.html)
   */
  public interface LambdaFunctionProperty {
    /**
     * The Lambda function ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-lambdafunction.html#cfn-iottwinmaker-componenttype-lambdafunction-arn)
     */
    public fun arn(): String

    /**
     * A builder for [LambdaFunctionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Lambda function ARN. 
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.LambdaFunctionProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.LambdaFunctionProperty.builder()

      /**
       * @param arn The Lambda function ARN. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.LambdaFunctionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.LambdaFunctionProperty,
    ) : CdkObject(cdkObject), LambdaFunctionProperty {
      /**
       * The Lambda function ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-lambdafunction.html#cfn-iottwinmaker-componenttype-lambdafunction-arn)
       */
      override fun arn(): String = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaFunctionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.LambdaFunctionProperty):
          LambdaFunctionProperty = CdkObjectWrappers.wrap(cdkObject) as? LambdaFunctionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaFunctionProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.LambdaFunctionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.LambdaFunctionProperty
    }
  }

  /**
   * PropertyDefinition is an object that maps strings to the property definitions in the component
   * type.
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
   * PropertyDefinitionProperty propertyDefinitionProperty = PropertyDefinitionProperty.builder()
   * .configurations(Map.of(
   * "configurationsKey", "configurations"))
   * .dataType(DataTypeProperty.builder()
   * .type("type")
   * // the properties below are optional
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
   * .isRequiredInEntity(false)
   * .isStoredExternally(false)
   * .isTimeSeries(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html)
   */
  public interface PropertyDefinitionProperty {
    /**
     * A mapping that specifies configuration information about the property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html#cfn-iottwinmaker-componenttype-propertydefinition-configurations)
     */
    public fun configurations(): Any? = unwrap(this).getConfigurations()

    /**
     * An object that specifies the data type of a property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html#cfn-iottwinmaker-componenttype-propertydefinition-datatype)
     */
    public fun dataType(): Any? = unwrap(this).getDataType()

    /**
     * A boolean value that specifies whether the property ID comes from an external data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html#cfn-iottwinmaker-componenttype-propertydefinition-defaultvalue)
     */
    public fun defaultValue(): Any? = unwrap(this).getDefaultValue()

    /**
     * A Boolean value that specifies whether the property ID comes from an external data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html#cfn-iottwinmaker-componenttype-propertydefinition-isexternalid)
     */
    public fun isExternalId(): Any? = unwrap(this).getIsExternalId()

    /**
     * A boolean value that specifies whether the property is required in an entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html#cfn-iottwinmaker-componenttype-propertydefinition-isrequiredinentity)
     */
    public fun isRequiredInEntity(): Any? = unwrap(this).getIsRequiredInEntity()

    /**
     * A boolean value that specifies whether the property is stored externally.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html#cfn-iottwinmaker-componenttype-propertydefinition-isstoredexternally)
     */
    public fun isStoredExternally(): Any? = unwrap(this).getIsStoredExternally()

    /**
     * A boolean value that specifies whether the property consists of time series data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html#cfn-iottwinmaker-componenttype-propertydefinition-istimeseries)
     */
    public fun isTimeSeries(): Any? = unwrap(this).getIsTimeSeries()

    /**
     * A builder for [PropertyDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configurations A mapping that specifies configuration information about the
       * property.
       */
      public fun configurations(configurations: IResolvable)

      /**
       * @param configurations A mapping that specifies configuration information about the
       * property.
       */
      public fun configurations(configurations: Map<String, String>)

      /**
       * @param dataType An object that specifies the data type of a property.
       */
      public fun dataType(dataType: IResolvable)

      /**
       * @param dataType An object that specifies the data type of a property.
       */
      public fun dataType(dataType: DataTypeProperty)

      /**
       * @param dataType An object that specifies the data type of a property.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0c970d0a023254c5d84488daa2bf517714d1d3bde253bb30ccdd5e69dd9a943")
      public fun dataType(dataType: DataTypeProperty.Builder.() -> Unit)

      /**
       * @param defaultValue A boolean value that specifies whether the property ID comes from an
       * external data store.
       */
      public fun defaultValue(defaultValue: IResolvable)

      /**
       * @param defaultValue A boolean value that specifies whether the property ID comes from an
       * external data store.
       */
      public fun defaultValue(defaultValue: DataValueProperty)

      /**
       * @param defaultValue A boolean value that specifies whether the property ID comes from an
       * external data store.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d64c68435ccc2367aabc04976125c24d8f12ccafd6c3ee7df5753c81071108")
      public fun defaultValue(defaultValue: DataValueProperty.Builder.() -> Unit)

      /**
       * @param isExternalId A Boolean value that specifies whether the property ID comes from an
       * external data source.
       */
      public fun isExternalId(isExternalId: Boolean)

      /**
       * @param isExternalId A Boolean value that specifies whether the property ID comes from an
       * external data source.
       */
      public fun isExternalId(isExternalId: IResolvable)

      /**
       * @param isRequiredInEntity A boolean value that specifies whether the property is required
       * in an entity.
       */
      public fun isRequiredInEntity(isRequiredInEntity: Boolean)

      /**
       * @param isRequiredInEntity A boolean value that specifies whether the property is required
       * in an entity.
       */
      public fun isRequiredInEntity(isRequiredInEntity: IResolvable)

      /**
       * @param isStoredExternally A boolean value that specifies whether the property is stored
       * externally.
       */
      public fun isStoredExternally(isStoredExternally: Boolean)

      /**
       * @param isStoredExternally A boolean value that specifies whether the property is stored
       * externally.
       */
      public fun isStoredExternally(isStoredExternally: IResolvable)

      /**
       * @param isTimeSeries A boolean value that specifies whether the property consists of time
       * series data.
       */
      public fun isTimeSeries(isTimeSeries: Boolean)

      /**
       * @param isTimeSeries A boolean value that specifies whether the property consists of time
       * series data.
       */
      public fun isTimeSeries(isTimeSeries: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyDefinitionProperty.builder()

      /**
       * @param configurations A mapping that specifies configuration information about the
       * property.
       */
      override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      /**
       * @param configurations A mapping that specifies configuration information about the
       * property.
       */
      override fun configurations(configurations: Map<String, String>) {
        cdkBuilder.configurations(configurations)
      }

      /**
       * @param dataType An object that specifies the data type of a property.
       */
      override fun dataType(dataType: IResolvable) {
        cdkBuilder.dataType(dataType.let(IResolvable::unwrap))
      }

      /**
       * @param dataType An object that specifies the data type of a property.
       */
      override fun dataType(dataType: DataTypeProperty) {
        cdkBuilder.dataType(dataType.let(DataTypeProperty::unwrap))
      }

      /**
       * @param dataType An object that specifies the data type of a property.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0c970d0a023254c5d84488daa2bf517714d1d3bde253bb30ccdd5e69dd9a943")
      override fun dataType(dataType: DataTypeProperty.Builder.() -> Unit): Unit =
          dataType(DataTypeProperty(dataType))

      /**
       * @param defaultValue A boolean value that specifies whether the property ID comes from an
       * external data store.
       */
      override fun defaultValue(defaultValue: IResolvable) {
        cdkBuilder.defaultValue(defaultValue.let(IResolvable::unwrap))
      }

      /**
       * @param defaultValue A boolean value that specifies whether the property ID comes from an
       * external data store.
       */
      override fun defaultValue(defaultValue: DataValueProperty) {
        cdkBuilder.defaultValue(defaultValue.let(DataValueProperty::unwrap))
      }

      /**
       * @param defaultValue A boolean value that specifies whether the property ID comes from an
       * external data store.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d64c68435ccc2367aabc04976125c24d8f12ccafd6c3ee7df5753c81071108")
      override fun defaultValue(defaultValue: DataValueProperty.Builder.() -> Unit): Unit =
          defaultValue(DataValueProperty(defaultValue))

      /**
       * @param isExternalId A Boolean value that specifies whether the property ID comes from an
       * external data source.
       */
      override fun isExternalId(isExternalId: Boolean) {
        cdkBuilder.isExternalId(isExternalId)
      }

      /**
       * @param isExternalId A Boolean value that specifies whether the property ID comes from an
       * external data source.
       */
      override fun isExternalId(isExternalId: IResolvable) {
        cdkBuilder.isExternalId(isExternalId.let(IResolvable::unwrap))
      }

      /**
       * @param isRequiredInEntity A boolean value that specifies whether the property is required
       * in an entity.
       */
      override fun isRequiredInEntity(isRequiredInEntity: Boolean) {
        cdkBuilder.isRequiredInEntity(isRequiredInEntity)
      }

      /**
       * @param isRequiredInEntity A boolean value that specifies whether the property is required
       * in an entity.
       */
      override fun isRequiredInEntity(isRequiredInEntity: IResolvable) {
        cdkBuilder.isRequiredInEntity(isRequiredInEntity.let(IResolvable::unwrap))
      }

      /**
       * @param isStoredExternally A boolean value that specifies whether the property is stored
       * externally.
       */
      override fun isStoredExternally(isStoredExternally: Boolean) {
        cdkBuilder.isStoredExternally(isStoredExternally)
      }

      /**
       * @param isStoredExternally A boolean value that specifies whether the property is stored
       * externally.
       */
      override fun isStoredExternally(isStoredExternally: IResolvable) {
        cdkBuilder.isStoredExternally(isStoredExternally.let(IResolvable::unwrap))
      }

      /**
       * @param isTimeSeries A boolean value that specifies whether the property consists of time
       * series data.
       */
      override fun isTimeSeries(isTimeSeries: Boolean) {
        cdkBuilder.isTimeSeries(isTimeSeries)
      }

      /**
       * @param isTimeSeries A boolean value that specifies whether the property consists of time
       * series data.
       */
      override fun isTimeSeries(isTimeSeries: IResolvable) {
        cdkBuilder.isTimeSeries(isTimeSeries.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyDefinitionProperty,
    ) : CdkObject(cdkObject), PropertyDefinitionProperty {
      /**
       * A mapping that specifies configuration information about the property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html#cfn-iottwinmaker-componenttype-propertydefinition-configurations)
       */
      override fun configurations(): Any? = unwrap(this).getConfigurations()

      /**
       * An object that specifies the data type of a property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html#cfn-iottwinmaker-componenttype-propertydefinition-datatype)
       */
      override fun dataType(): Any? = unwrap(this).getDataType()

      /**
       * A boolean value that specifies whether the property ID comes from an external data store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html#cfn-iottwinmaker-componenttype-propertydefinition-defaultvalue)
       */
      override fun defaultValue(): Any? = unwrap(this).getDefaultValue()

      /**
       * A Boolean value that specifies whether the property ID comes from an external data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html#cfn-iottwinmaker-componenttype-propertydefinition-isexternalid)
       */
      override fun isExternalId(): Any? = unwrap(this).getIsExternalId()

      /**
       * A boolean value that specifies whether the property is required in an entity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html#cfn-iottwinmaker-componenttype-propertydefinition-isrequiredinentity)
       */
      override fun isRequiredInEntity(): Any? = unwrap(this).getIsRequiredInEntity()

      /**
       * A boolean value that specifies whether the property is stored externally.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html#cfn-iottwinmaker-componenttype-propertydefinition-isstoredexternally)
       */
      override fun isStoredExternally(): Any? = unwrap(this).getIsStoredExternally()

      /**
       * A boolean value that specifies whether the property consists of time series data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertydefinition.html#cfn-iottwinmaker-componenttype-propertydefinition-istimeseries)
       */
      override fun isTimeSeries(): Any? = unwrap(this).getIsTimeSeries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PropertyDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyDefinitionProperty):
          PropertyDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PropertyDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertyDefinitionProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyDefinitionProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertygroup.html)
   */
  public interface PropertyGroupProperty {
    /**
     * The group type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertygroup.html#cfn-iottwinmaker-componenttype-propertygroup-grouptype)
     */
    public fun groupType(): String? = unwrap(this).getGroupType()

    /**
     * The property names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertygroup.html#cfn-iottwinmaker-componenttype-propertygroup-propertynames)
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
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyGroupProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyGroupProperty.builder()

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
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyGroupProperty,
    ) : CdkObject(cdkObject), PropertyGroupProperty {
      /**
       * The group type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertygroup.html#cfn-iottwinmaker-componenttype-propertygroup-grouptype)
       */
      override fun groupType(): String? = unwrap(this).getGroupType()

      /**
       * The property names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertygroup.html#cfn-iottwinmaker-componenttype-propertygroup-propertynames)
       */
      override fun propertyNames(): List<String> = unwrap(this).getPropertyNames() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PropertyGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyGroupProperty):
          PropertyGroupProperty = CdkObjectWrappers.wrap(cdkObject) as? PropertyGroupProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertyGroupProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyGroupProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.PropertyGroupProperty
    }
  }

  /**
   * An object that specifies a relationship with another component type.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-relationship.html)
   */
  public interface RelationshipProperty {
    /**
     * The type of the relationship.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-relationship.html#cfn-iottwinmaker-componenttype-relationship-relationshiptype)
     */
    public fun relationshipType(): String? = unwrap(this).getRelationshipType()

    /**
     * The ID of the target component type associated with this relationship.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-relationship.html#cfn-iottwinmaker-componenttype-relationship-targetcomponenttypeid)
     */
    public fun targetComponentTypeId(): String? = unwrap(this).getTargetComponentTypeId()

    /**
     * A builder for [RelationshipProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param relationshipType The type of the relationship.
       */
      public fun relationshipType(relationshipType: String)

      /**
       * @param targetComponentTypeId The ID of the target component type associated with this
       * relationship.
       */
      public fun targetComponentTypeId(targetComponentTypeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipProperty.builder()

      /**
       * @param relationshipType The type of the relationship.
       */
      override fun relationshipType(relationshipType: String) {
        cdkBuilder.relationshipType(relationshipType)
      }

      /**
       * @param targetComponentTypeId The ID of the target component type associated with this
       * relationship.
       */
      override fun targetComponentTypeId(targetComponentTypeId: String) {
        cdkBuilder.targetComponentTypeId(targetComponentTypeId)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipProperty,
    ) : CdkObject(cdkObject), RelationshipProperty {
      /**
       * The type of the relationship.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-relationship.html#cfn-iottwinmaker-componenttype-relationship-relationshiptype)
       */
      override fun relationshipType(): String? = unwrap(this).getRelationshipType()

      /**
       * The ID of the target component type associated with this relationship.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-relationship.html#cfn-iottwinmaker-componenttype-relationship-targetcomponenttypeid)
       */
      override fun targetComponentTypeId(): String? = unwrap(this).getTargetComponentTypeId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RelationshipProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipProperty):
          RelationshipProperty = CdkObjectWrappers.wrap(cdkObject) as? RelationshipProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelationshipProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipProperty
    }
  }

  /**
   * The component type relationship value.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-relationshipvalue.html)
   */
  public interface RelationshipValueProperty {
    /**
     * The target component name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-relationshipvalue.html#cfn-iottwinmaker-componenttype-relationshipvalue-targetcomponentname)
     */
    public fun targetComponentName(): String? = unwrap(this).getTargetComponentName()

    /**
     * The target entity Id.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-relationshipvalue.html#cfn-iottwinmaker-componenttype-relationshipvalue-targetentityid)
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
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipValueProperty.Builder
          =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipValueProperty.builder()

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
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipValueProperty,
    ) : CdkObject(cdkObject), RelationshipValueProperty {
      /**
       * The target component name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-relationshipvalue.html#cfn-iottwinmaker-componenttype-relationshipvalue-targetcomponentname)
       */
      override fun targetComponentName(): String? = unwrap(this).getTargetComponentName()

      /**
       * The target entity Id.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-relationshipvalue.html#cfn-iottwinmaker-componenttype-relationshipvalue-targetentityid)
       */
      override fun targetEntityId(): String? = unwrap(this).getTargetEntityId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RelationshipValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipValueProperty):
          RelationshipValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RelationshipValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelationshipValueProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipValueProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.RelationshipValueProperty
    }
  }

  /**
   * The component type status.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iottwinmaker.*;
   * StatusProperty statusProperty = StatusProperty.builder()
   * .error(ErrorProperty.builder()
   * .code("code")
   * .message("message")
   * .build())
   * .state("state")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-status.html)
   */
  public interface StatusProperty {
    /**
     * The component type error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-status.html#cfn-iottwinmaker-componenttype-status-error)
     */
    public fun error(): Any? = unwrap(this).getError()

    /**
     * The component type status state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-status.html#cfn-iottwinmaker-componenttype-status-state)
     */
    public fun state(): String? = unwrap(this).getState()

    /**
     * A builder for [StatusProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param error The component type error.
       */
      public fun error(error: IResolvable)

      /**
       * @param error The component type error.
       */
      public fun error(error: ErrorProperty)

      /**
       * @param error The component type error.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8675338aefb17618022ff9c2a24e31a302ab5639e4f2a99e0f3b38a71943d292")
      public fun error(error: ErrorProperty.Builder.() -> Unit)

      /**
       * @param state The component type status state.
       */
      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.StatusProperty.Builder =
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.StatusProperty.builder()

      /**
       * @param error The component type error.
       */
      override fun error(error: IResolvable) {
        cdkBuilder.error(error.let(IResolvable::unwrap))
      }

      /**
       * @param error The component type error.
       */
      override fun error(error: ErrorProperty) {
        cdkBuilder.error(error.let(ErrorProperty::unwrap))
      }

      /**
       * @param error The component type error.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8675338aefb17618022ff9c2a24e31a302ab5639e4f2a99e0f3b38a71943d292")
      override fun error(error: ErrorProperty.Builder.() -> Unit): Unit =
          error(ErrorProperty(error))

      /**
       * @param state The component type status state.
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.StatusProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.StatusProperty,
    ) : CdkObject(cdkObject), StatusProperty {
      /**
       * The component type error.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-status.html#cfn-iottwinmaker-componenttype-status-error)
       */
      override fun error(): Any? = unwrap(this).getError()

      /**
       * The component type status state.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-status.html#cfn-iottwinmaker-componenttype-status-state)
       */
      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StatusProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentType.StatusProperty):
          StatusProperty = CdkObjectWrappers.wrap(cdkObject) as? StatusProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatusProperty):
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.StatusProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iottwinmaker.CfnComponentType.StatusProperty
    }
  }
}
