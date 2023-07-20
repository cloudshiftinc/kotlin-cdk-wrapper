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
  public inline fun cfnComponentType(
    scope: Construct,
    id: String,
    block: CfnComponentTypeDsl.() -> Unit = {},
  ): CfnComponentType {
    val builder = CfnComponentTypeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentTypeDataConnectorProperty(block: CfnComponentTypeDataConnectorPropertyDsl.() -> Unit
      = {}): CfnComponentType.DataConnectorProperty {
    val builder = CfnComponentTypeDataConnectorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentTypeDataTypeProperty(block: CfnComponentTypeDataTypePropertyDsl.() -> Unit =
      {}): CfnComponentType.DataTypeProperty {
    val builder = CfnComponentTypeDataTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentTypeDataValueProperty(block: CfnComponentTypeDataValuePropertyDsl.() -> Unit =
      {}): CfnComponentType.DataValueProperty {
    val builder = CfnComponentTypeDataValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnComponentTypeErrorProperty(block: CfnComponentTypeErrorPropertyDsl.() -> Unit
      = {}): CfnComponentType.ErrorProperty {
    val builder = CfnComponentTypeErrorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentTypeFunctionProperty(block: CfnComponentTypeFunctionPropertyDsl.() -> Unit =
      {}): CfnComponentType.FunctionProperty {
    val builder = CfnComponentTypeFunctionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentTypeLambdaFunctionProperty(block: CfnComponentTypeLambdaFunctionPropertyDsl.() -> Unit
      = {}): CfnComponentType.LambdaFunctionProperty {
    val builder = CfnComponentTypeLambdaFunctionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentTypePropertyDefinitionProperty(block: CfnComponentTypePropertyDefinitionPropertyDsl.() -> Unit
      = {}): CfnComponentType.PropertyDefinitionProperty {
    val builder = CfnComponentTypePropertyDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentTypePropertyGroupProperty(block: CfnComponentTypePropertyGroupPropertyDsl.() -> Unit
      = {}): CfnComponentType.PropertyGroupProperty {
    val builder = CfnComponentTypePropertyGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnComponentTypeProps(block: CfnComponentTypePropsDsl.() -> Unit = {}):
      CfnComponentTypeProps {
    val builder = CfnComponentTypePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentTypeRelationshipProperty(block: CfnComponentTypeRelationshipPropertyDsl.() -> Unit
      = {}): CfnComponentType.RelationshipProperty {
    val builder = CfnComponentTypeRelationshipPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentTypeRelationshipValueProperty(block: CfnComponentTypeRelationshipValuePropertyDsl.() -> Unit
      = {}): CfnComponentType.RelationshipValueProperty {
    val builder = CfnComponentTypeRelationshipValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnComponentTypeStatusProperty(block: CfnComponentTypeStatusPropertyDsl.() -> Unit = {}):
      CfnComponentType.StatusProperty {
    val builder = CfnComponentTypeStatusPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEntity(
    scope: Construct,
    id: String,
    block: CfnEntityDsl.() -> Unit = {},
  ): CfnEntity {
    val builder = CfnEntityDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEntityComponentProperty(block: CfnEntityComponentPropertyDsl.() -> Unit =
      {}): CfnEntity.ComponentProperty {
    val builder = CfnEntityComponentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEntityDataTypeProperty(block: CfnEntityDataTypePropertyDsl.() -> Unit = {}):
      CfnEntity.DataTypeProperty {
    val builder = CfnEntityDataTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEntityDataValueProperty(block: CfnEntityDataValuePropertyDsl.() -> Unit =
      {}): CfnEntity.DataValueProperty {
    val builder = CfnEntityDataValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEntityDefinitionProperty(block: CfnEntityDefinitionPropertyDsl.() -> Unit =
      {}): CfnEntity.DefinitionProperty {
    val builder = CfnEntityDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEntityErrorProperty(block: CfnEntityErrorPropertyDsl.() -> Unit = {}):
      CfnEntity.ErrorProperty {
    val builder = CfnEntityErrorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEntityPropertyGroupProperty(block: CfnEntityPropertyGroupPropertyDsl.() -> Unit = {}):
      CfnEntity.PropertyGroupProperty {
    val builder = CfnEntityPropertyGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEntityPropertyProperty(block: CfnEntityPropertyPropertyDsl.() -> Unit = {}):
      CfnEntity.PropertyProperty {
    val builder = CfnEntityPropertyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEntityProps(block: CfnEntityPropsDsl.() -> Unit = {}): CfnEntityProps {
    val builder = CfnEntityPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEntityRelationshipProperty(block: CfnEntityRelationshipPropertyDsl.() -> Unit
      = {}): CfnEntity.RelationshipProperty {
    val builder = CfnEntityRelationshipPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEntityRelationshipValueProperty(block: CfnEntityRelationshipValuePropertyDsl.() -> Unit
      = {}): CfnEntity.RelationshipValueProperty {
    val builder = CfnEntityRelationshipValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEntityStatusProperty(block: CfnEntityStatusPropertyDsl.() -> Unit = {}):
      CfnEntity.StatusProperty {
    val builder = CfnEntityStatusPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnScene(
    scope: Construct,
    id: String,
    block: CfnSceneDsl.() -> Unit = {},
  ): CfnScene {
    val builder = CfnSceneDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSceneProps(block: CfnScenePropsDsl.() -> Unit = {}): CfnSceneProps {
    val builder = CfnScenePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSyncJob(
    scope: Construct,
    id: String,
    block: CfnSyncJobDsl.() -> Unit = {},
  ): CfnSyncJob {
    val builder = CfnSyncJobDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSyncJobProps(block: CfnSyncJobPropsDsl.() -> Unit = {}): CfnSyncJobProps {
    val builder = CfnSyncJobPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWorkspace(
    scope: Construct,
    id: String,
    block: CfnWorkspaceDsl.() -> Unit = {},
  ): CfnWorkspace {
    val builder = CfnWorkspaceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWorkspaceProps(block: CfnWorkspacePropsDsl.() -> Unit = {}):
      CfnWorkspaceProps {
    val builder = CfnWorkspacePropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
