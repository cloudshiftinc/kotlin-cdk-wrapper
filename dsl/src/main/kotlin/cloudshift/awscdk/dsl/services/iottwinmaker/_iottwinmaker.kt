@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType
import software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps
import software.amazon.awscdk.services.iottwinmaker.CfnEntity
import software.amazon.awscdk.services.iottwinmaker.CfnEntityProps
import software.amazon.awscdk.services.iottwinmaker.CfnScene
import software.amazon.awscdk.services.iottwinmaker.CfnSceneProps
import software.amazon.awscdk.services.iottwinmaker.CfnSyncJob
import software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps
import software.amazon.awscdk.services.iottwinmaker.CfnWorkspace
import software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps
import software.constructs.Construct

public object iottwinmaker {
  /**
   * Use the `AWS::IoTTwinMaker::ComponentType` resource to declare a component type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * DataTypeProperty dataTypeProperty_;
   * DataValueProperty dataValueProperty_;
   * Object relationshipValue;
   * CfnComponentType cfnComponentType = CfnComponentType.Builder.create(this, "MyCfnComponentType")
   * .componentTypeId("componentTypeId")
   * .workspaceId("workspaceId")
   * // the properties below are optional
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
  public inline fun cfnComponentType(
    scope: Construct,
    id: String,
    block: CfnComponentTypeDsl.() -> Unit = {},
  ): CfnComponentType {
    val builder = CfnComponentTypeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The data connector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
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
  public inline
      fun cfnComponentTypeDataConnectorProperty(block: CfnComponentTypeDataConnectorPropertyDsl.() -> Unit
      = {}): CfnComponentType.DataConnectorProperty {
    val builder = CfnComponentTypeDataConnectorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that specifies the data type of a property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
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
  public inline
      fun cfnComponentTypeDataTypeProperty(block: CfnComponentTypeDataTypePropertyDsl.() -> Unit =
      {}): CfnComponentType.DataTypeProperty {
    val builder = CfnComponentTypeDataTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that specifies a value for a property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
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
  public inline
      fun cfnComponentTypeDataValueProperty(block: CfnComponentTypeDataValuePropertyDsl.() -> Unit =
      {}): CfnComponentType.DataValueProperty {
    val builder = CfnComponentTypeDataValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The component type error.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * ErrorProperty errorProperty = ErrorProperty.builder()
   * .code("code")
   * .message("message")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-error.html)
   */
  public inline fun cfnComponentTypeErrorProperty(block: CfnComponentTypeErrorPropertyDsl.() -> Unit
      = {}): CfnComponentType.ErrorProperty {
    val builder = CfnComponentTypeErrorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The function body.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
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
  public inline
      fun cfnComponentTypeFunctionProperty(block: CfnComponentTypeFunctionPropertyDsl.() -> Unit =
      {}): CfnComponentType.FunctionProperty {
    val builder = CfnComponentTypeFunctionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The Lambda function.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * LambdaFunctionProperty lambdaFunctionProperty = LambdaFunctionProperty.builder()
   * .arn("arn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-lambdafunction.html)
   */
  public inline
      fun cfnComponentTypeLambdaFunctionProperty(block: CfnComponentTypeLambdaFunctionPropertyDsl.() -> Unit
      = {}): CfnComponentType.LambdaFunctionProperty {
    val builder = CfnComponentTypeLambdaFunctionPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.iottwinmaker.*;
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
  public inline
      fun cfnComponentTypePropertyDefinitionProperty(block: CfnComponentTypePropertyDefinitionPropertyDsl.() -> Unit
      = {}): CfnComponentType.PropertyDefinitionProperty {
    val builder = CfnComponentTypePropertyDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The property group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * PropertyGroupProperty propertyGroupProperty = PropertyGroupProperty.builder()
   * .groupType("groupType")
   * .propertyNames(List.of("propertyNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertygroup.html)
   */
  public inline
      fun cfnComponentTypePropertyGroupProperty(block: CfnComponentTypePropertyGroupPropertyDsl.() -> Unit
      = {}): CfnComponentType.PropertyGroupProperty {
    val builder = CfnComponentTypePropertyGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnComponentType`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * DataTypeProperty dataTypeProperty_;
   * DataValueProperty dataValueProperty_;
   * Object relationshipValue;
   * CfnComponentTypeProps cfnComponentTypeProps = CfnComponentTypeProps.builder()
   * .componentTypeId("componentTypeId")
   * .workspaceId("workspaceId")
   * // the properties below are optional
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
  public inline fun cfnComponentTypeProps(block: CfnComponentTypePropsDsl.() -> Unit = {}):
      CfnComponentTypeProps {
    val builder = CfnComponentTypePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that specifies a relationship with another component type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * RelationshipProperty relationshipProperty = RelationshipProperty.builder()
   * .relationshipType("relationshipType")
   * .targetComponentTypeId("targetComponentTypeId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-relationship.html)
   */
  public inline
      fun cfnComponentTypeRelationshipProperty(block: CfnComponentTypeRelationshipPropertyDsl.() -> Unit
      = {}): CfnComponentType.RelationshipProperty {
    val builder = CfnComponentTypeRelationshipPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The component type relationship value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * RelationshipValueProperty relationshipValueProperty = RelationshipValueProperty.builder()
   * .targetComponentName("targetComponentName")
   * .targetEntityId("targetEntityId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-relationshipvalue.html)
   */
  public inline
      fun cfnComponentTypeRelationshipValueProperty(block: CfnComponentTypeRelationshipValuePropertyDsl.() -> Unit
      = {}): CfnComponentType.RelationshipValueProperty {
    val builder = CfnComponentTypeRelationshipValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The component type status.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
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
  public inline
      fun cfnComponentTypeStatusProperty(block: CfnComponentTypeStatusPropertyDsl.() -> Unit = {}):
      CfnComponentType.StatusProperty {
    val builder = CfnComponentTypeStatusPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use the `AWS::IoTTwinMaker::Entity` resource to declare an entity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
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
  public inline fun cfnEntity(
    scope: Construct,
    id: String,
    block: CfnEntityDsl.() -> Unit = {},
  ): CfnEntity {
    val builder = CfnEntityDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The entity component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
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
  public inline fun cfnEntityComponentProperty(block: CfnEntityComponentPropertyDsl.() -> Unit =
      {}): CfnEntity.ComponentProperty {
    val builder = CfnEntityComponentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The entity data type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
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
  public inline fun cfnEntityDataTypeProperty(block: CfnEntityDataTypePropertyDsl.() -> Unit = {}):
      CfnEntity.DataTypeProperty {
    val builder = CfnEntityDataTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that specifies a value for a property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
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
  public inline fun cfnEntityDataValueProperty(block: CfnEntityDataValuePropertyDsl.() -> Unit =
      {}): CfnEntity.DataValueProperty {
    val builder = CfnEntityDataValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The entity definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
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
  public inline fun cfnEntityDefinitionProperty(block: CfnEntityDefinitionPropertyDsl.() -> Unit =
      {}): CfnEntity.DefinitionProperty {
    val builder = CfnEntityDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The entity error.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * ErrorProperty errorProperty = ErrorProperty.builder()
   * .code("code")
   * .message("message")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-error.html)
   */
  public inline fun cfnEntityErrorProperty(block: CfnEntityErrorPropertyDsl.() -> Unit = {}):
      CfnEntity.ErrorProperty {
    val builder = CfnEntityErrorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The property group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * PropertyGroupProperty propertyGroupProperty = PropertyGroupProperty.builder()
   * .groupType("groupType")
   * .propertyNames(List.of("propertyNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-propertygroup.html)
   */
  public inline
      fun cfnEntityPropertyGroupProperty(block: CfnEntityPropertyGroupPropertyDsl.() -> Unit = {}):
      CfnEntity.PropertyGroupProperty {
    val builder = CfnEntityPropertyGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that sets information about a property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
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
  public inline fun cfnEntityPropertyProperty(block: CfnEntityPropertyPropertyDsl.() -> Unit = {}):
      CfnEntity.PropertyProperty {
    val builder = CfnEntityPropertyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnEntity`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * DataValueProperty dataValueProperty_;
   * Object definition;
   * Object error;
   * Object relationshipValue;
   * CfnEntityProps cfnEntityProps = CfnEntityProps.builder()
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
  public inline fun cfnEntityProps(block: CfnEntityPropsDsl.() -> Unit = {}): CfnEntityProps {
    val builder = CfnEntityPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The entity relationship.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * RelationshipProperty relationshipProperty = RelationshipProperty.builder()
   * .relationshipType("relationshipType")
   * .targetComponentTypeId("targetComponentTypeId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-relationship.html)
   */
  public inline fun cfnEntityRelationshipProperty(block: CfnEntityRelationshipPropertyDsl.() -> Unit
      = {}): CfnEntity.RelationshipProperty {
    val builder = CfnEntityRelationshipPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The entity relationship.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * RelationshipValueProperty relationshipValueProperty = RelationshipValueProperty.builder()
   * .targetComponentName("targetComponentName")
   * .targetEntityId("targetEntityId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-relationshipvalue.html)
   */
  public inline
      fun cfnEntityRelationshipValueProperty(block: CfnEntityRelationshipValuePropertyDsl.() -> Unit
      = {}): CfnEntity.RelationshipValueProperty {
    val builder = CfnEntityRelationshipValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The current status of the entity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * Object error;
   * StatusProperty statusProperty = StatusProperty.builder()
   * .error(error)
   * .state("state")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-status.html)
   */
  public inline fun cfnEntityStatusProperty(block: CfnEntityStatusPropertyDsl.() -> Unit = {}):
      CfnEntity.StatusProperty {
    val builder = CfnEntityStatusPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use the `AWS::IoTTwinMaker::Scene` resource to declare a scene.
   *
   * Example:
   *
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
  public inline fun cfnScene(
    scope: Construct,
    id: String,
    block: CfnSceneDsl.() -> Unit = {},
  ): CfnScene {
    val builder = CfnSceneDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnScene`.
   *
   * Example:
   *
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
  public inline fun cfnSceneProps(block: CfnScenePropsDsl.() -> Unit = {}): CfnSceneProps {
    val builder = CfnScenePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The SyncJob.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * CfnSyncJob cfnSyncJob = CfnSyncJob.Builder.create(this, "MyCfnSyncJob")
   * .syncRole("syncRole")
   * .syncSource("syncSource")
   * .workspaceId("workspaceId")
   * // the properties below are optional
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html)
   */
  public inline fun cfnSyncJob(
    scope: Construct,
    id: String,
    block: CfnSyncJobDsl.() -> Unit = {},
  ): CfnSyncJob {
    val builder = CfnSyncJobDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSyncJob`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * CfnSyncJobProps cfnSyncJobProps = CfnSyncJobProps.builder()
   * .syncRole("syncRole")
   * .syncSource("syncSource")
   * .workspaceId("workspaceId")
   * // the properties below are optional
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-syncjob.html)
   */
  public inline fun cfnSyncJobProps(block: CfnSyncJobPropsDsl.() -> Unit = {}): CfnSyncJobProps {
    val builder = CfnSyncJobPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use the `AWS::IoTTwinMaker::Workspace` resource to declare a workspace.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * CfnWorkspace cfnWorkspace = CfnWorkspace.Builder.create(this, "MyCfnWorkspace")
   * .role("role")
   * .s3Location("s3Location")
   * .workspaceId("workspaceId")
   * // the properties below are optional
   * .description("description")
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html)
   */
  public inline fun cfnWorkspace(
    scope: Construct,
    id: String,
    block: CfnWorkspaceDsl.() -> Unit = {},
  ): CfnWorkspace {
    val builder = CfnWorkspaceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnWorkspace`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iottwinmaker.*;
   * CfnWorkspaceProps cfnWorkspaceProps = CfnWorkspaceProps.builder()
   * .role("role")
   * .s3Location("s3Location")
   * .workspaceId("workspaceId")
   * // the properties below are optional
   * .description("description")
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html)
   */
  public inline fun cfnWorkspaceProps(block: CfnWorkspacePropsDsl.() -> Unit = {}):
      CfnWorkspaceProps {
    val builder = CfnWorkspacePropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
