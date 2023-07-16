@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnCustomResource
import software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps
import software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersionProps
import software.amazon.awscdk.services.cloudformation.CfnHookTypeConfig
import software.amazon.awscdk.services.cloudformation.CfnHookTypeConfigProps
import software.amazon.awscdk.services.cloudformation.CfnHookVersion
import software.amazon.awscdk.services.cloudformation.CfnHookVersionProps
import software.amazon.awscdk.services.cloudformation.CfnMacro
import software.amazon.awscdk.services.cloudformation.CfnMacroProps
import software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps
import software.amazon.awscdk.services.cloudformation.CfnModuleVersion
import software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps
import software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersion
import software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersionProps
import software.amazon.awscdk.services.cloudformation.CfnPublisher
import software.amazon.awscdk.services.cloudformation.CfnPublisherProps
import software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps
import software.amazon.awscdk.services.cloudformation.CfnResourceVersion
import software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps
import software.amazon.awscdk.services.cloudformation.CfnStack
import software.amazon.awscdk.services.cloudformation.CfnStackProps
import software.amazon.awscdk.services.cloudformation.CfnStackSet
import software.amazon.awscdk.services.cloudformation.CfnStackSetProps
import software.amazon.awscdk.services.cloudformation.CfnTypeActivation
import software.amazon.awscdk.services.cloudformation.CfnTypeActivationProps
import software.amazon.awscdk.services.cloudformation.CfnWaitCondition
import software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps
import software.constructs.Construct

public object cloudformation {
  public inline fun cfnCustomResource(
    scope: Construct,
    id: String,
    block: CfnCustomResourceDsl.() -> Unit = {},
  ): CfnCustomResource {
    val builder = CfnCustomResourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCustomResourceProps(block: CfnCustomResourcePropsDsl.() -> Unit = {}):
      CfnCustomResourceProps {
    val builder = CfnCustomResourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHookDefaultVersion(
    scope: Construct,
    id: String,
    block: CfnHookDefaultVersionDsl.() -> Unit = {},
  ): CfnHookDefaultVersion {
    val builder = CfnHookDefaultVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHookDefaultVersionProps(block: CfnHookDefaultVersionPropsDsl.() -> Unit =
      {}): CfnHookDefaultVersionProps {
    val builder = CfnHookDefaultVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHookTypeConfig(
    scope: Construct,
    id: String,
    block: CfnHookTypeConfigDsl.() -> Unit = {},
  ): CfnHookTypeConfig {
    val builder = CfnHookTypeConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHookTypeConfigProps(block: CfnHookTypeConfigPropsDsl.() -> Unit = {}):
      CfnHookTypeConfigProps {
    val builder = CfnHookTypeConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHookVersion(
    scope: Construct,
    id: String,
    block: CfnHookVersionDsl.() -> Unit = {},
  ): CfnHookVersion {
    val builder = CfnHookVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnHookVersionLoggingConfigProperty(block: CfnHookVersionLoggingConfigPropertyDsl.() -> Unit
      = {}): CfnHookVersion.LoggingConfigProperty {
    val builder = CfnHookVersionLoggingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHookVersionProps(block: CfnHookVersionPropsDsl.() -> Unit = {}):
      CfnHookVersionProps {
    val builder = CfnHookVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMacro(
    scope: Construct,
    id: String,
    block: CfnMacroDsl.() -> Unit = {},
  ): CfnMacro {
    val builder = CfnMacroDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMacroProps(block: CfnMacroPropsDsl.() -> Unit = {}): CfnMacroProps {
    val builder = CfnMacroPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModuleDefaultVersion(
    scope: Construct,
    id: String,
    block: CfnModuleDefaultVersionDsl.() -> Unit = {},
  ): CfnModuleDefaultVersion {
    val builder = CfnModuleDefaultVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModuleDefaultVersionProps(block: CfnModuleDefaultVersionPropsDsl.() -> Unit =
      {}): CfnModuleDefaultVersionProps {
    val builder = CfnModuleDefaultVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModuleVersion(
    scope: Construct,
    id: String,
    block: CfnModuleVersionDsl.() -> Unit = {},
  ): CfnModuleVersion {
    val builder = CfnModuleVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModuleVersionProps(block: CfnModuleVersionPropsDsl.() -> Unit = {}):
      CfnModuleVersionProps {
    val builder = CfnModuleVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPublicTypeVersion(
    scope: Construct,
    id: String,
    block: CfnPublicTypeVersionDsl.() -> Unit = {},
  ): CfnPublicTypeVersion {
    val builder = CfnPublicTypeVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPublicTypeVersionProps(block: CfnPublicTypeVersionPropsDsl.() -> Unit = {}):
      CfnPublicTypeVersionProps {
    val builder = CfnPublicTypeVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPublisher(
    scope: Construct,
    id: String,
    block: CfnPublisherDsl.() -> Unit = {},
  ): CfnPublisher {
    val builder = CfnPublisherDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPublisherProps(block: CfnPublisherPropsDsl.() -> Unit = {}):
      CfnPublisherProps {
    val builder = CfnPublisherPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceDefaultVersion(
    scope: Construct,
    id: String,
    block: CfnResourceDefaultVersionDsl.() -> Unit = {},
  ): CfnResourceDefaultVersion {
    val builder = CfnResourceDefaultVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefaultVersionProps(block: CfnResourceDefaultVersionPropsDsl.() -> Unit = {}):
      CfnResourceDefaultVersionProps {
    val builder = CfnResourceDefaultVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceVersion(
    scope: Construct,
    id: String,
    block: CfnResourceVersionDsl.() -> Unit = {},
  ): CfnResourceVersion {
    val builder = CfnResourceVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceVersionLoggingConfigProperty(block: CfnResourceVersionLoggingConfigPropertyDsl.() -> Unit
      = {}): CfnResourceVersion.LoggingConfigProperty {
    val builder = CfnResourceVersionLoggingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceVersionProps(block: CfnResourceVersionPropsDsl.() -> Unit = {}):
      CfnResourceVersionProps {
    val builder = CfnResourceVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStack(
    scope: Construct,
    id: String,
    block: CfnStackDsl.() -> Unit = {},
  ): CfnStack {
    val builder = CfnStackDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStackProps(block: CfnStackPropsDsl.() -> Unit = {}): CfnStackProps {
    val builder = CfnStackPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStackSet(
    scope: Construct,
    id: String,
    block: CfnStackSetDsl.() -> Unit = {},
  ): CfnStackSet {
    val builder = CfnStackSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStackSetAutoDeploymentProperty(block: CfnStackSetAutoDeploymentPropertyDsl.() -> Unit =
      {}): CfnStackSet.AutoDeploymentProperty {
    val builder = CfnStackSetAutoDeploymentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStackSetDeploymentTargetsProperty(block: CfnStackSetDeploymentTargetsPropertyDsl.() -> Unit
      = {}): CfnStackSet.DeploymentTargetsProperty {
    val builder = CfnStackSetDeploymentTargetsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStackSetManagedExecutionProperty(block: CfnStackSetManagedExecutionPropertyDsl.() -> Unit
      = {}): CfnStackSet.ManagedExecutionProperty {
    val builder = CfnStackSetManagedExecutionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStackSetOperationPreferencesProperty(block: CfnStackSetOperationPreferencesPropertyDsl.() -> Unit
      = {}): CfnStackSet.OperationPreferencesProperty {
    val builder = CfnStackSetOperationPreferencesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStackSetParameterProperty(block: CfnStackSetParameterPropertyDsl.() -> Unit =
      {}): CfnStackSet.ParameterProperty {
    val builder = CfnStackSetParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStackSetProps(block: CfnStackSetPropsDsl.() -> Unit = {}): CfnStackSetProps {
    val builder = CfnStackSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStackSetStackInstancesProperty(block: CfnStackSetStackInstancesPropertyDsl.() -> Unit =
      {}): CfnStackSet.StackInstancesProperty {
    val builder = CfnStackSetStackInstancesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTypeActivation(
    scope: Construct,
    id: String,
    block: CfnTypeActivationDsl.() -> Unit = {},
  ): CfnTypeActivation {
    val builder = CfnTypeActivationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTypeActivationLoggingConfigProperty(block: CfnTypeActivationLoggingConfigPropertyDsl.() -> Unit
      = {}): CfnTypeActivation.LoggingConfigProperty {
    val builder = CfnTypeActivationLoggingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTypeActivationProps(block: CfnTypeActivationPropsDsl.() -> Unit = {}):
      CfnTypeActivationProps {
    val builder = CfnTypeActivationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWaitCondition(
    scope: Construct,
    id: String,
    block: CfnWaitConditionDsl.() -> Unit = {},
  ): CfnWaitCondition {
    val builder = CfnWaitConditionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWaitConditionProps(block: CfnWaitConditionPropsDsl.() -> Unit = {}):
      CfnWaitConditionProps {
    val builder = CfnWaitConditionPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
