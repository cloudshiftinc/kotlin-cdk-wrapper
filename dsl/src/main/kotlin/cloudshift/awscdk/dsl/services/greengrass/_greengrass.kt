@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinition
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnCoreDefinition
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinition
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnGroup
import software.amazon.awscdk.services.greengrass.CfnGroupProps
import software.amazon.awscdk.services.greengrass.CfnGroupVersion
import software.amazon.awscdk.services.greengrass.CfnGroupVersionProps
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinition
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps
import software.constructs.Construct

public object greengrass {
  public inline fun cfnConnectorDefinition(
    scope: Construct,
    id: String,
    block: CfnConnectorDefinitionDsl.() -> Unit = {},
  ): CfnConnectorDefinition {
    val builder = CfnConnectorDefinitionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorDefinitionConnectorDefinitionVersionProperty(block: CfnConnectorDefinitionConnectorDefinitionVersionPropertyDsl.() -> Unit
      = {}): CfnConnectorDefinition.ConnectorDefinitionVersionProperty {
    val builder = CfnConnectorDefinitionConnectorDefinitionVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorDefinitionConnectorProperty(block: CfnConnectorDefinitionConnectorPropertyDsl.() -> Unit
      = {}): CfnConnectorDefinition.ConnectorProperty {
    val builder = CfnConnectorDefinitionConnectorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnectorDefinitionProps(block: CfnConnectorDefinitionPropsDsl.() -> Unit =
      {}): CfnConnectorDefinitionProps {
    val builder = CfnConnectorDefinitionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnectorDefinitionVersion(
    scope: Construct,
    id: String,
    block: CfnConnectorDefinitionVersionDsl.() -> Unit = {},
  ): CfnConnectorDefinitionVersion {
    val builder = CfnConnectorDefinitionVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorDefinitionVersionConnectorProperty(block: CfnConnectorDefinitionVersionConnectorPropertyDsl.() -> Unit
      = {}): CfnConnectorDefinitionVersion.ConnectorProperty {
    val builder = CfnConnectorDefinitionVersionConnectorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorDefinitionVersionProps(block: CfnConnectorDefinitionVersionPropsDsl.() -> Unit
      = {}): CfnConnectorDefinitionVersionProps {
    val builder = CfnConnectorDefinitionVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCoreDefinition(
    scope: Construct,
    id: String,
    block: CfnCoreDefinitionDsl.() -> Unit = {},
  ): CfnCoreDefinition {
    val builder = CfnCoreDefinitionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCoreDefinitionCoreDefinitionVersionProperty(block: CfnCoreDefinitionCoreDefinitionVersionPropertyDsl.() -> Unit
      = {}): CfnCoreDefinition.CoreDefinitionVersionProperty {
    val builder = CfnCoreDefinitionCoreDefinitionVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCoreDefinitionCoreProperty(block: CfnCoreDefinitionCorePropertyDsl.() -> Unit
      = {}): CfnCoreDefinition.CoreProperty {
    val builder = CfnCoreDefinitionCorePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCoreDefinitionProps(block: CfnCoreDefinitionPropsDsl.() -> Unit = {}):
      CfnCoreDefinitionProps {
    val builder = CfnCoreDefinitionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCoreDefinitionVersion(
    scope: Construct,
    id: String,
    block: CfnCoreDefinitionVersionDsl.() -> Unit = {},
  ): CfnCoreDefinitionVersion {
    val builder = CfnCoreDefinitionVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCoreDefinitionVersionCoreProperty(block: CfnCoreDefinitionVersionCorePropertyDsl.() -> Unit
      = {}): CfnCoreDefinitionVersion.CoreProperty {
    val builder = CfnCoreDefinitionVersionCorePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCoreDefinitionVersionProps(block: CfnCoreDefinitionVersionPropsDsl.() -> Unit
      = {}): CfnCoreDefinitionVersionProps {
    val builder = CfnCoreDefinitionVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeviceDefinition(
    scope: Construct,
    id: String,
    block: CfnDeviceDefinitionDsl.() -> Unit = {},
  ): CfnDeviceDefinition {
    val builder = CfnDeviceDefinitionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeviceDefinitionDeviceDefinitionVersionProperty(block: CfnDeviceDefinitionDeviceDefinitionVersionPropertyDsl.() -> Unit
      = {}): CfnDeviceDefinition.DeviceDefinitionVersionProperty {
    val builder = CfnDeviceDefinitionDeviceDefinitionVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeviceDefinitionDeviceProperty(block: CfnDeviceDefinitionDevicePropertyDsl.() -> Unit =
      {}): CfnDeviceDefinition.DeviceProperty {
    val builder = CfnDeviceDefinitionDevicePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeviceDefinitionProps(block: CfnDeviceDefinitionPropsDsl.() -> Unit = {}):
      CfnDeviceDefinitionProps {
    val builder = CfnDeviceDefinitionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeviceDefinitionVersion(
    scope: Construct,
    id: String,
    block: CfnDeviceDefinitionVersionDsl.() -> Unit = {},
  ): CfnDeviceDefinitionVersion {
    val builder = CfnDeviceDefinitionVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeviceDefinitionVersionDeviceProperty(block: CfnDeviceDefinitionVersionDevicePropertyDsl.() -> Unit
      = {}): CfnDeviceDefinitionVersion.DeviceProperty {
    val builder = CfnDeviceDefinitionVersionDevicePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeviceDefinitionVersionProps(block: CfnDeviceDefinitionVersionPropsDsl.() -> Unit =
      {}): CfnDeviceDefinitionVersionProps {
    val builder = CfnDeviceDefinitionVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionDefinition(
    scope: Construct,
    id: String,
    block: CfnFunctionDefinitionDsl.() -> Unit = {},
  ): CfnFunctionDefinition {
    val builder = CfnFunctionDefinitionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionDefaultConfigProperty(block: CfnFunctionDefinitionDefaultConfigPropertyDsl.() -> Unit
      = {}): CfnFunctionDefinition.DefaultConfigProperty {
    val builder = CfnFunctionDefinitionDefaultConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionEnvironmentProperty(block: CfnFunctionDefinitionEnvironmentPropertyDsl.() -> Unit
      = {}): CfnFunctionDefinition.EnvironmentProperty {
    val builder = CfnFunctionDefinitionEnvironmentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionExecutionProperty(block: CfnFunctionDefinitionExecutionPropertyDsl.() -> Unit
      = {}): CfnFunctionDefinition.ExecutionProperty {
    val builder = CfnFunctionDefinitionExecutionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionFunctionConfigurationProperty(block: CfnFunctionDefinitionFunctionConfigurationPropertyDsl.() -> Unit
      = {}): CfnFunctionDefinition.FunctionConfigurationProperty {
    val builder = CfnFunctionDefinitionFunctionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionFunctionDefinitionVersionProperty(block: CfnFunctionDefinitionFunctionDefinitionVersionPropertyDsl.() -> Unit
      = {}): CfnFunctionDefinition.FunctionDefinitionVersionProperty {
    val builder = CfnFunctionDefinitionFunctionDefinitionVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionFunctionProperty(block: CfnFunctionDefinitionFunctionPropertyDsl.() -> Unit
      = {}): CfnFunctionDefinition.FunctionProperty {
    val builder = CfnFunctionDefinitionFunctionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionDefinitionProps(block: CfnFunctionDefinitionPropsDsl.() -> Unit =
      {}): CfnFunctionDefinitionProps {
    val builder = CfnFunctionDefinitionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionResourceAccessPolicyProperty(block: CfnFunctionDefinitionResourceAccessPolicyPropertyDsl.() -> Unit
      = {}): CfnFunctionDefinition.ResourceAccessPolicyProperty {
    val builder = CfnFunctionDefinitionResourceAccessPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionRunAsProperty(block: CfnFunctionDefinitionRunAsPropertyDsl.() -> Unit
      = {}): CfnFunctionDefinition.RunAsProperty {
    val builder = CfnFunctionDefinitionRunAsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionDefinitionVersion(
    scope: Construct,
    id: String,
    block: CfnFunctionDefinitionVersionDsl.() -> Unit = {},
  ): CfnFunctionDefinitionVersion {
    val builder = CfnFunctionDefinitionVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionVersionDefaultConfigProperty(block: CfnFunctionDefinitionVersionDefaultConfigPropertyDsl.() -> Unit
      = {}): CfnFunctionDefinitionVersion.DefaultConfigProperty {
    val builder = CfnFunctionDefinitionVersionDefaultConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionVersionEnvironmentProperty(block: CfnFunctionDefinitionVersionEnvironmentPropertyDsl.() -> Unit
      = {}): CfnFunctionDefinitionVersion.EnvironmentProperty {
    val builder = CfnFunctionDefinitionVersionEnvironmentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionVersionExecutionProperty(block: CfnFunctionDefinitionVersionExecutionPropertyDsl.() -> Unit
      = {}): CfnFunctionDefinitionVersion.ExecutionProperty {
    val builder = CfnFunctionDefinitionVersionExecutionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionVersionFunctionConfigurationProperty(block: CfnFunctionDefinitionVersionFunctionConfigurationPropertyDsl.() -> Unit
      = {}): CfnFunctionDefinitionVersion.FunctionConfigurationProperty {
    val builder = CfnFunctionDefinitionVersionFunctionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionVersionFunctionProperty(block: CfnFunctionDefinitionVersionFunctionPropertyDsl.() -> Unit
      = {}): CfnFunctionDefinitionVersion.FunctionProperty {
    val builder = CfnFunctionDefinitionVersionFunctionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionVersionProps(block: CfnFunctionDefinitionVersionPropsDsl.() -> Unit =
      {}): CfnFunctionDefinitionVersionProps {
    val builder = CfnFunctionDefinitionVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionVersionResourceAccessPolicyProperty(block: CfnFunctionDefinitionVersionResourceAccessPolicyPropertyDsl.() -> Unit
      = {}): CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty {
    val builder = CfnFunctionDefinitionVersionResourceAccessPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDefinitionVersionRunAsProperty(block: CfnFunctionDefinitionVersionRunAsPropertyDsl.() -> Unit
      = {}): CfnFunctionDefinitionVersion.RunAsProperty {
    val builder = CfnFunctionDefinitionVersionRunAsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGroup(
    scope: Construct,
    id: String,
    block: CfnGroupDsl.() -> Unit = {},
  ): CfnGroup {
    val builder = CfnGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGroupGroupVersionProperty(block: CfnGroupGroupVersionPropertyDsl.() -> Unit =
      {}): CfnGroup.GroupVersionProperty {
    val builder = CfnGroupGroupVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGroupProps(block: CfnGroupPropsDsl.() -> Unit = {}): CfnGroupProps {
    val builder = CfnGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGroupVersion(
    scope: Construct,
    id: String,
    block: CfnGroupVersionDsl.() -> Unit = {},
  ): CfnGroupVersion {
    val builder = CfnGroupVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGroupVersionProps(block: CfnGroupVersionPropsDsl.() -> Unit = {}):
      CfnGroupVersionProps {
    val builder = CfnGroupVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLoggerDefinition(
    scope: Construct,
    id: String,
    block: CfnLoggerDefinitionDsl.() -> Unit = {},
  ): CfnLoggerDefinition {
    val builder = CfnLoggerDefinitionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoggerDefinitionLoggerDefinitionVersionProperty(block: CfnLoggerDefinitionLoggerDefinitionVersionPropertyDsl.() -> Unit
      = {}): CfnLoggerDefinition.LoggerDefinitionVersionProperty {
    val builder = CfnLoggerDefinitionLoggerDefinitionVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoggerDefinitionLoggerProperty(block: CfnLoggerDefinitionLoggerPropertyDsl.() -> Unit =
      {}): CfnLoggerDefinition.LoggerProperty {
    val builder = CfnLoggerDefinitionLoggerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLoggerDefinitionProps(block: CfnLoggerDefinitionPropsDsl.() -> Unit = {}):
      CfnLoggerDefinitionProps {
    val builder = CfnLoggerDefinitionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLoggerDefinitionVersion(
    scope: Construct,
    id: String,
    block: CfnLoggerDefinitionVersionDsl.() -> Unit = {},
  ): CfnLoggerDefinitionVersion {
    val builder = CfnLoggerDefinitionVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoggerDefinitionVersionLoggerProperty(block: CfnLoggerDefinitionVersionLoggerPropertyDsl.() -> Unit
      = {}): CfnLoggerDefinitionVersion.LoggerProperty {
    val builder = CfnLoggerDefinitionVersionLoggerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoggerDefinitionVersionProps(block: CfnLoggerDefinitionVersionPropsDsl.() -> Unit =
      {}): CfnLoggerDefinitionVersionProps {
    val builder = CfnLoggerDefinitionVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceDefinition(
    scope: Construct,
    id: String,
    block: CfnResourceDefinitionDsl.() -> Unit = {},
  ): CfnResourceDefinition {
    val builder = CfnResourceDefinitionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionGroupOwnerSettingProperty(block: CfnResourceDefinitionGroupOwnerSettingPropertyDsl.() -> Unit
      = {}): CfnResourceDefinition.GroupOwnerSettingProperty {
    val builder = CfnResourceDefinitionGroupOwnerSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionLocalDeviceResourceDataProperty(block: CfnResourceDefinitionLocalDeviceResourceDataPropertyDsl.() -> Unit
      = {}): CfnResourceDefinition.LocalDeviceResourceDataProperty {
    val builder = CfnResourceDefinitionLocalDeviceResourceDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionLocalVolumeResourceDataProperty(block: CfnResourceDefinitionLocalVolumeResourceDataPropertyDsl.() -> Unit
      = {}): CfnResourceDefinition.LocalVolumeResourceDataProperty {
    val builder = CfnResourceDefinitionLocalVolumeResourceDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceDefinitionProps(block: CfnResourceDefinitionPropsDsl.() -> Unit =
      {}): CfnResourceDefinitionProps {
    val builder = CfnResourceDefinitionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionResourceDataContainerProperty(block: CfnResourceDefinitionResourceDataContainerPropertyDsl.() -> Unit
      = {}): CfnResourceDefinition.ResourceDataContainerProperty {
    val builder = CfnResourceDefinitionResourceDataContainerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionResourceDefinitionVersionProperty(block: CfnResourceDefinitionResourceDefinitionVersionPropertyDsl.() -> Unit
      = {}): CfnResourceDefinition.ResourceDefinitionVersionProperty {
    val builder = CfnResourceDefinitionResourceDefinitionVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionResourceDownloadOwnerSettingProperty(block: CfnResourceDefinitionResourceDownloadOwnerSettingPropertyDsl.() -> Unit
      = {}): CfnResourceDefinition.ResourceDownloadOwnerSettingProperty {
    val builder = CfnResourceDefinitionResourceDownloadOwnerSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionResourceInstanceProperty(block: CfnResourceDefinitionResourceInstancePropertyDsl.() -> Unit
      = {}): CfnResourceDefinition.ResourceInstanceProperty {
    val builder = CfnResourceDefinitionResourceInstancePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionS3MachineLearningModelResourceDataProperty(block: CfnResourceDefinitionS3MachineLearningModelResourceDataPropertyDsl.() -> Unit
      = {}): CfnResourceDefinition.S3MachineLearningModelResourceDataProperty {
    val builder = CfnResourceDefinitionS3MachineLearningModelResourceDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionSageMakerMachineLearningModelResourceDataProperty(block: CfnResourceDefinitionSageMakerMachineLearningModelResourceDataPropertyDsl.() -> Unit
      = {}): CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty {
    val builder = CfnResourceDefinitionSageMakerMachineLearningModelResourceDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionSecretsManagerSecretResourceDataProperty(block: CfnResourceDefinitionSecretsManagerSecretResourceDataPropertyDsl.() -> Unit
      = {}): CfnResourceDefinition.SecretsManagerSecretResourceDataProperty {
    val builder = CfnResourceDefinitionSecretsManagerSecretResourceDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceDefinitionVersion(
    scope: Construct,
    id: String,
    block: CfnResourceDefinitionVersionDsl.() -> Unit = {},
  ): CfnResourceDefinitionVersion {
    val builder = CfnResourceDefinitionVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionVersionGroupOwnerSettingProperty(block: CfnResourceDefinitionVersionGroupOwnerSettingPropertyDsl.() -> Unit
      = {}): CfnResourceDefinitionVersion.GroupOwnerSettingProperty {
    val builder = CfnResourceDefinitionVersionGroupOwnerSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionVersionLocalDeviceResourceDataProperty(block: CfnResourceDefinitionVersionLocalDeviceResourceDataPropertyDsl.() -> Unit
      = {}): CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty {
    val builder = CfnResourceDefinitionVersionLocalDeviceResourceDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionVersionLocalVolumeResourceDataProperty(block: CfnResourceDefinitionVersionLocalVolumeResourceDataPropertyDsl.() -> Unit
      = {}): CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty {
    val builder = CfnResourceDefinitionVersionLocalVolumeResourceDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionVersionProps(block: CfnResourceDefinitionVersionPropsDsl.() -> Unit =
      {}): CfnResourceDefinitionVersionProps {
    val builder = CfnResourceDefinitionVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionVersionResourceDataContainerProperty(block: CfnResourceDefinitionVersionResourceDataContainerPropertyDsl.() -> Unit
      = {}): CfnResourceDefinitionVersion.ResourceDataContainerProperty {
    val builder = CfnResourceDefinitionVersionResourceDataContainerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionVersionResourceDownloadOwnerSettingProperty(block: CfnResourceDefinitionVersionResourceDownloadOwnerSettingPropertyDsl.() -> Unit
      = {}): CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty {
    val builder = CfnResourceDefinitionVersionResourceDownloadOwnerSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionVersionResourceInstanceProperty(block: CfnResourceDefinitionVersionResourceInstancePropertyDsl.() -> Unit
      = {}): CfnResourceDefinitionVersion.ResourceInstanceProperty {
    val builder = CfnResourceDefinitionVersionResourceInstancePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionVersionS3MachineLearningModelResourceDataProperty(block: CfnResourceDefinitionVersionS3MachineLearningModelResourceDataPropertyDsl.() -> Unit
      = {}): CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty {
    val builder = CfnResourceDefinitionVersionS3MachineLearningModelResourceDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionVersionSageMakerMachineLearningModelResourceDataProperty(block: CfnResourceDefinitionVersionSageMakerMachineLearningModelResourceDataPropertyDsl.() -> Unit
      = {}): CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty {
    val builder = CfnResourceDefinitionVersionSageMakerMachineLearningModelResourceDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefinitionVersionSecretsManagerSecretResourceDataProperty(block: CfnResourceDefinitionVersionSecretsManagerSecretResourceDataPropertyDsl.() -> Unit
      = {}): CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty {
    val builder = CfnResourceDefinitionVersionSecretsManagerSecretResourceDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSubscriptionDefinition(
    scope: Construct,
    id: String,
    block: CfnSubscriptionDefinitionDsl.() -> Unit = {},
  ): CfnSubscriptionDefinition {
    val builder = CfnSubscriptionDefinitionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSubscriptionDefinitionProps(block: CfnSubscriptionDefinitionPropsDsl.() -> Unit = {}):
      CfnSubscriptionDefinitionProps {
    val builder = CfnSubscriptionDefinitionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSubscriptionDefinitionSubscriptionDefinitionVersionProperty(block: CfnSubscriptionDefinitionSubscriptionDefinitionVersionPropertyDsl.() -> Unit
      = {}): CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty {
    val builder = CfnSubscriptionDefinitionSubscriptionDefinitionVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSubscriptionDefinitionSubscriptionProperty(block: CfnSubscriptionDefinitionSubscriptionPropertyDsl.() -> Unit
      = {}): CfnSubscriptionDefinition.SubscriptionProperty {
    val builder = CfnSubscriptionDefinitionSubscriptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSubscriptionDefinitionVersion(
    scope: Construct,
    id: String,
    block: CfnSubscriptionDefinitionVersionDsl.() -> Unit = {},
  ): CfnSubscriptionDefinitionVersion {
    val builder = CfnSubscriptionDefinitionVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSubscriptionDefinitionVersionProps(block: CfnSubscriptionDefinitionVersionPropsDsl.() -> Unit
      = {}): CfnSubscriptionDefinitionVersionProps {
    val builder = CfnSubscriptionDefinitionVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSubscriptionDefinitionVersionSubscriptionProperty(block: CfnSubscriptionDefinitionVersionSubscriptionPropertyDsl.() -> Unit
      = {}): CfnSubscriptionDefinitionVersion.SubscriptionProperty {
    val builder = CfnSubscriptionDefinitionVersionSubscriptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
