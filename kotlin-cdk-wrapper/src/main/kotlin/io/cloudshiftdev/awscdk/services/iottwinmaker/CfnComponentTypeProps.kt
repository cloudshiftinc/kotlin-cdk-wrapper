@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnComponentType`.
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
 * CfnComponentTypeProps cfnComponentTypeProps = CfnComponentTypeProps.builder()
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
public interface CfnComponentTypeProps {
  /**
   * The ID of the component type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-componenttypeid)
   */
  public fun componentTypeId(): String

  /**
   * Maps strings to `compositeComponentTypes` of the `componentType` .
   *
   * `CompositeComponentType` is referenced by `componentTypeId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-compositecomponenttypes)
   */
  public fun compositeComponentTypes(): Any? = unwrap(this).getCompositeComponentTypes()

  /**
   * The description of the component type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the parent component type that this component type extends.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-extendsfrom)
   */
  public fun extendsFrom(): List<String> = unwrap(this).getExtendsFrom() ?: emptyList()

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
   */
  public fun functions(): Any? = unwrap(this).getFunctions()

  /**
   * A boolean value that specifies whether an entity can have more than one component of this type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-issingleton)
   */
  public fun isSingleton(): Any? = unwrap(this).getIsSingleton()

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
   */
  public fun propertyDefinitions(): Any? = unwrap(this).getPropertyDefinitions()

  /**
   * An object that maps strings to the property groups in the component type.
   *
   * Each string in the mapping must be unique to this object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertygroups)
   */
  public fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

  /**
   * The ComponentType tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The ID of the workspace that contains the component type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-workspaceid)
   */
  public fun workspaceId(): String

  /**
   * A builder for [CfnComponentTypeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param componentTypeId The ID of the component type. 
     */
    public fun componentTypeId(componentTypeId: String)

    /**
     * @param compositeComponentTypes Maps strings to `compositeComponentTypes` of the
     * `componentType` .
     * `CompositeComponentType` is referenced by `componentTypeId` .
     */
    public fun compositeComponentTypes(compositeComponentTypes: IResolvable)

    /**
     * @param compositeComponentTypes Maps strings to `compositeComponentTypes` of the
     * `componentType` .
     * `CompositeComponentType` is referenced by `componentTypeId` .
     */
    public fun compositeComponentTypes(compositeComponentTypes: Map<String, Any>)

    /**
     * @param description The description of the component type.
     */
    public fun description(description: String)

    /**
     * @param extendsFrom The name of the parent component type that this component type extends.
     */
    public fun extendsFrom(extendsFrom: List<String>)

    /**
     * @param extendsFrom The name of the parent component type that this component type extends.
     */
    public fun extendsFrom(vararg extendsFrom: String)

    /**
     * @param functions An object that maps strings to the functions in the component type.
     * Each string in the mapping must be unique to this object.
     *
     * For information on the FunctionResponse object see the
     * [FunctionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_FunctionResponse.html)
     * API reference.
     */
    public fun functions(functions: IResolvable)

    /**
     * @param functions An object that maps strings to the functions in the component type.
     * Each string in the mapping must be unique to this object.
     *
     * For information on the FunctionResponse object see the
     * [FunctionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_FunctionResponse.html)
     * API reference.
     */
    public fun functions(functions: Map<String, Any>)

    /**
     * @param isSingleton A boolean value that specifies whether an entity can have more than one
     * component of this type.
     */
    public fun isSingleton(isSingleton: Boolean)

    /**
     * @param isSingleton A boolean value that specifies whether an entity can have more than one
     * component of this type.
     */
    public fun isSingleton(isSingleton: IResolvable)

    /**
     * @param propertyDefinitions An object that maps strings to the property definitions in the
     * component type.
     * Each string in the mapping must be unique to this object.
     *
     * For information about the PropertyDefinitionResponse object, see the
     * [PropertyDefinitionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_PropertyDefinitionResponse.html)
     * API reference.
     */
    public fun propertyDefinitions(propertyDefinitions: IResolvable)

    /**
     * @param propertyDefinitions An object that maps strings to the property definitions in the
     * component type.
     * Each string in the mapping must be unique to this object.
     *
     * For information about the PropertyDefinitionResponse object, see the
     * [PropertyDefinitionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_PropertyDefinitionResponse.html)
     * API reference.
     */
    public fun propertyDefinitions(propertyDefinitions: Map<String, Any>)

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
     * @param tags The ComponentType tags.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param workspaceId The ID of the workspace that contains the component type. 
     */
    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps.builder()

    /**
     * @param componentTypeId The ID of the component type. 
     */
    override fun componentTypeId(componentTypeId: String) {
      cdkBuilder.componentTypeId(componentTypeId)
    }

    /**
     * @param compositeComponentTypes Maps strings to `compositeComponentTypes` of the
     * `componentType` .
     * `CompositeComponentType` is referenced by `componentTypeId` .
     */
    override fun compositeComponentTypes(compositeComponentTypes: IResolvable) {
      cdkBuilder.compositeComponentTypes(compositeComponentTypes.let(IResolvable::unwrap))
    }

    /**
     * @param compositeComponentTypes Maps strings to `compositeComponentTypes` of the
     * `componentType` .
     * `CompositeComponentType` is referenced by `componentTypeId` .
     */
    override fun compositeComponentTypes(compositeComponentTypes: Map<String, Any>) {
      cdkBuilder.compositeComponentTypes(compositeComponentTypes)
    }

    /**
     * @param description The description of the component type.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param extendsFrom The name of the parent component type that this component type extends.
     */
    override fun extendsFrom(extendsFrom: List<String>) {
      cdkBuilder.extendsFrom(extendsFrom)
    }

    /**
     * @param extendsFrom The name of the parent component type that this component type extends.
     */
    override fun extendsFrom(vararg extendsFrom: String): Unit = extendsFrom(extendsFrom.toList())

    /**
     * @param functions An object that maps strings to the functions in the component type.
     * Each string in the mapping must be unique to this object.
     *
     * For information on the FunctionResponse object see the
     * [FunctionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_FunctionResponse.html)
     * API reference.
     */
    override fun functions(functions: IResolvable) {
      cdkBuilder.functions(functions.let(IResolvable::unwrap))
    }

    /**
     * @param functions An object that maps strings to the functions in the component type.
     * Each string in the mapping must be unique to this object.
     *
     * For information on the FunctionResponse object see the
     * [FunctionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_FunctionResponse.html)
     * API reference.
     */
    override fun functions(functions: Map<String, Any>) {
      cdkBuilder.functions(functions)
    }

    /**
     * @param isSingleton A boolean value that specifies whether an entity can have more than one
     * component of this type.
     */
    override fun isSingleton(isSingleton: Boolean) {
      cdkBuilder.isSingleton(isSingleton)
    }

    /**
     * @param isSingleton A boolean value that specifies whether an entity can have more than one
     * component of this type.
     */
    override fun isSingleton(isSingleton: IResolvable) {
      cdkBuilder.isSingleton(isSingleton.let(IResolvable::unwrap))
    }

    /**
     * @param propertyDefinitions An object that maps strings to the property definitions in the
     * component type.
     * Each string in the mapping must be unique to this object.
     *
     * For information about the PropertyDefinitionResponse object, see the
     * [PropertyDefinitionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_PropertyDefinitionResponse.html)
     * API reference.
     */
    override fun propertyDefinitions(propertyDefinitions: IResolvable) {
      cdkBuilder.propertyDefinitions(propertyDefinitions.let(IResolvable::unwrap))
    }

    /**
     * @param propertyDefinitions An object that maps strings to the property definitions in the
     * component type.
     * Each string in the mapping must be unique to this object.
     *
     * For information about the PropertyDefinitionResponse object, see the
     * [PropertyDefinitionResponse](https://docs.aws.amazon.com//iot-twinmaker/latest/apireference/API_PropertyDefinitionResponse.html)
     * API reference.
     */
    override fun propertyDefinitions(propertyDefinitions: Map<String, Any>) {
      cdkBuilder.propertyDefinitions(propertyDefinitions)
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
     * @param tags The ComponentType tags.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param workspaceId The ID of the workspace that contains the component type. 
     */
    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps,
  ) : CdkObject(cdkObject), CfnComponentTypeProps {
    /**
     * The ID of the component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-componenttypeid)
     */
    override fun componentTypeId(): String = unwrap(this).getComponentTypeId()

    /**
     * Maps strings to `compositeComponentTypes` of the `componentType` .
     *
     * `CompositeComponentType` is referenced by `componentTypeId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-compositecomponenttypes)
     */
    override fun compositeComponentTypes(): Any? = unwrap(this).getCompositeComponentTypes()

    /**
     * The description of the component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the parent component type that this component type extends.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-extendsfrom)
     */
    override fun extendsFrom(): List<String> = unwrap(this).getExtendsFrom() ?: emptyList()

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
     */
    override fun functions(): Any? = unwrap(this).getFunctions()

    /**
     * A boolean value that specifies whether an entity can have more than one component of this
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-issingleton)
     */
    override fun isSingleton(): Any? = unwrap(this).getIsSingleton()

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
     */
    override fun propertyDefinitions(): Any? = unwrap(this).getPropertyDefinitions()

    /**
     * An object that maps strings to the property groups in the component type.
     *
     * Each string in the mapping must be unique to this object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-propertygroups)
     */
    override fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

    /**
     * The ComponentType tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The ID of the workspace that contains the component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-componenttype.html#cfn-iottwinmaker-componenttype-workspaceid)
     */
    override fun workspaceId(): String = unwrap(this).getWorkspaceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnComponentTypeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps):
        CfnComponentTypeProps = CdkObjectWrappers.wrap(cdkObject) as CfnComponentTypeProps

    internal fun unwrap(wrapped: CfnComponentTypeProps):
        software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps
  }
}
