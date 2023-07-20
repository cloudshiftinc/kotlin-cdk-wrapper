@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnApi
import software.amazon.awscdk.services.sam.CfnApiProps
import software.amazon.awscdk.services.sam.CfnApplication
import software.amazon.awscdk.services.sam.CfnApplicationProps
import software.amazon.awscdk.services.sam.CfnFunction
import software.amazon.awscdk.services.sam.CfnFunctionProps
import software.amazon.awscdk.services.sam.CfnHttpApi
import software.amazon.awscdk.services.sam.CfnHttpApiProps
import software.amazon.awscdk.services.sam.CfnLayerVersion
import software.amazon.awscdk.services.sam.CfnLayerVersionProps
import software.amazon.awscdk.services.sam.CfnSimpleTable
import software.amazon.awscdk.services.sam.CfnSimpleTableProps
import software.amazon.awscdk.services.sam.CfnStateMachine
import software.amazon.awscdk.services.sam.CfnStateMachineProps
import software.constructs.Construct

public object sam {
  public inline fun cfnApi(
    scope: Construct,
    id: String,
    block: CfnApiDsl.() -> Unit = {},
  ): CfnApi {
    val builder = CfnApiDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApiAccessLogSettingProperty(block: CfnApiAccessLogSettingPropertyDsl.() -> Unit = {}):
      CfnApi.AccessLogSettingProperty {
    val builder = CfnApiAccessLogSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiAuthProperty(block: CfnApiAuthPropertyDsl.() -> Unit = {}):
      CfnApi.AuthProperty {
    val builder = CfnApiAuthPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiCanarySettingProperty(block: CfnApiCanarySettingPropertyDsl.() -> Unit =
      {}): CfnApi.CanarySettingProperty {
    val builder = CfnApiCanarySettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApiCorsConfigurationProperty(block: CfnApiCorsConfigurationPropertyDsl.() -> Unit =
      {}): CfnApi.CorsConfigurationProperty {
    val builder = CfnApiCorsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApiDomainConfigurationProperty(block: CfnApiDomainConfigurationPropertyDsl.() -> Unit =
      {}): CfnApi.DomainConfigurationProperty {
    val builder = CfnApiDomainConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApiEndpointConfigurationProperty(block: CfnApiEndpointConfigurationPropertyDsl.() -> Unit
      = {}): CfnApi.EndpointConfigurationProperty {
    val builder = CfnApiEndpointConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApiMutualTlsAuthenticationProperty(block: CfnApiMutualTlsAuthenticationPropertyDsl.() -> Unit
      = {}): CfnApi.MutualTlsAuthenticationProperty {
    val builder = CfnApiMutualTlsAuthenticationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiProps(block: CfnApiPropsDsl.() -> Unit = {}): CfnApiProps {
    val builder = CfnApiPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApiRoute53ConfigurationProperty(block: CfnApiRoute53ConfigurationPropertyDsl.() -> Unit
      = {}): CfnApi.Route53ConfigurationProperty {
    val builder = CfnApiRoute53ConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiS3LocationProperty(block: CfnApiS3LocationPropertyDsl.() -> Unit = {}):
      CfnApi.S3LocationProperty {
    val builder = CfnApiS3LocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplication(
    scope: Construct,
    id: String,
    block: CfnApplicationDsl.() -> Unit = {},
  ): CfnApplication {
    val builder = CfnApplicationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationApplicationLocationProperty(block: CfnApplicationApplicationLocationPropertyDsl.() -> Unit
      = {}): CfnApplication.ApplicationLocationProperty {
    val builder = CfnApplicationApplicationLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}):
      CfnApplicationProps {
    val builder = CfnApplicationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunction(
    scope: Construct,
    id: String,
    block: CfnFunctionDsl.() -> Unit = {},
  ): CfnFunction {
    val builder = CfnFunctionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionAlexaSkillEventProperty(block: CfnFunctionAlexaSkillEventPropertyDsl.() -> Unit
      = {}): CfnFunction.AlexaSkillEventProperty {
    val builder = CfnFunctionAlexaSkillEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionApiEventProperty(block: CfnFunctionApiEventPropertyDsl.() -> Unit =
      {}): CfnFunction.ApiEventProperty {
    val builder = CfnFunctionApiEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionAuthProperty(block: CfnFunctionAuthPropertyDsl.() -> Unit = {}):
      CfnFunction.AuthProperty {
    val builder = CfnFunctionAuthPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionAuthResourcePolicyProperty(block: CfnFunctionAuthResourcePolicyPropertyDsl.() -> Unit
      = {}): CfnFunction.AuthResourcePolicyProperty {
    val builder = CfnFunctionAuthResourcePolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionBucketSAMPTProperty(block: CfnFunctionBucketSAMPTPropertyDsl.() -> Unit = {}):
      CfnFunction.BucketSAMPTProperty {
    val builder = CfnFunctionBucketSAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionCloudWatchEventEventProperty(block: CfnFunctionCloudWatchEventEventPropertyDsl.() -> Unit
      = {}): CfnFunction.CloudWatchEventEventProperty {
    val builder = CfnFunctionCloudWatchEventEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionCloudWatchLogsEventProperty(block: CfnFunctionCloudWatchLogsEventPropertyDsl.() -> Unit
      = {}): CfnFunction.CloudWatchLogsEventProperty {
    val builder = CfnFunctionCloudWatchLogsEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionCognitoEventProperty(block: CfnFunctionCognitoEventPropertyDsl.() -> Unit =
      {}): CfnFunction.CognitoEventProperty {
    val builder = CfnFunctionCognitoEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionCollectionSAMPTProperty(block: CfnFunctionCollectionSAMPTPropertyDsl.() -> Unit
      = {}): CfnFunction.CollectionSAMPTProperty {
    val builder = CfnFunctionCollectionSAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDeadLetterQueueProperty(block: CfnFunctionDeadLetterQueuePropertyDsl.() -> Unit
      = {}): CfnFunction.DeadLetterQueueProperty {
    val builder = CfnFunctionDeadLetterQueuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDeploymentPreferenceProperty(block: CfnFunctionDeploymentPreferencePropertyDsl.() -> Unit
      = {}): CfnFunction.DeploymentPreferenceProperty {
    val builder = CfnFunctionDeploymentPreferencePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDestinationConfigProperty(block: CfnFunctionDestinationConfigPropertyDsl.() -> Unit
      = {}): CfnFunction.DestinationConfigProperty {
    val builder = CfnFunctionDestinationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDestinationProperty(block: CfnFunctionDestinationPropertyDsl.() -> Unit = {}):
      CfnFunction.DestinationProperty {
    val builder = CfnFunctionDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDomainSAMPTProperty(block: CfnFunctionDomainSAMPTPropertyDsl.() -> Unit = {}):
      CfnFunction.DomainSAMPTProperty {
    val builder = CfnFunctionDomainSAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDynamoDBEventProperty(block: CfnFunctionDynamoDBEventPropertyDsl.() -> Unit =
      {}): CfnFunction.DynamoDBEventProperty {
    val builder = CfnFunctionDynamoDBEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionEmptySAMPTProperty(block: CfnFunctionEmptySAMPTPropertyDsl.() -> Unit
      = {}): CfnFunction.EmptySAMPTProperty {
    val builder = CfnFunctionEmptySAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionEventBridgeRuleEventProperty(block: CfnFunctionEventBridgeRuleEventPropertyDsl.() -> Unit
      = {}): CfnFunction.EventBridgeRuleEventProperty {
    val builder = CfnFunctionEventBridgeRuleEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionEventInvokeConfigProperty(block: CfnFunctionEventInvokeConfigPropertyDsl.() -> Unit
      = {}): CfnFunction.EventInvokeConfigProperty {
    val builder = CfnFunctionEventInvokeConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionEventInvokeDestinationConfigProperty(block: CfnFunctionEventInvokeDestinationConfigPropertyDsl.() -> Unit
      = {}): CfnFunction.EventInvokeDestinationConfigProperty {
    val builder = CfnFunctionEventInvokeDestinationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionEventSourceProperty(block: CfnFunctionEventSourcePropertyDsl.() -> Unit = {}):
      CfnFunction.EventSourceProperty {
    val builder = CfnFunctionEventSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionFileSystemConfigProperty(block: CfnFunctionFileSystemConfigPropertyDsl.() -> Unit
      = {}): CfnFunction.FileSystemConfigProperty {
    val builder = CfnFunctionFileSystemConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionFunctionEnvironmentProperty(block: CfnFunctionFunctionEnvironmentPropertyDsl.() -> Unit
      = {}): CfnFunction.FunctionEnvironmentProperty {
    val builder = CfnFunctionFunctionEnvironmentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionFunctionSAMPTProperty(block: CfnFunctionFunctionSAMPTPropertyDsl.() -> Unit =
      {}): CfnFunction.FunctionSAMPTProperty {
    val builder = CfnFunctionFunctionSAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionHooksProperty(block: CfnFunctionHooksPropertyDsl.() -> Unit = {}):
      CfnFunction.HooksProperty {
    val builder = CfnFunctionHooksPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionHttpApiEventProperty(block: CfnFunctionHttpApiEventPropertyDsl.() -> Unit =
      {}): CfnFunction.HttpApiEventProperty {
    val builder = CfnFunctionHttpApiEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionHttpApiFunctionAuthProperty(block: CfnFunctionHttpApiFunctionAuthPropertyDsl.() -> Unit
      = {}): CfnFunction.HttpApiFunctionAuthProperty {
    val builder = CfnFunctionHttpApiFunctionAuthPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionIAMPolicyDocumentProperty(block: CfnFunctionIAMPolicyDocumentPropertyDsl.() -> Unit
      = {}): CfnFunction.IAMPolicyDocumentProperty {
    val builder = CfnFunctionIAMPolicyDocumentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionIdentitySAMPTProperty(block: CfnFunctionIdentitySAMPTPropertyDsl.() -> Unit =
      {}): CfnFunction.IdentitySAMPTProperty {
    val builder = CfnFunctionIdentitySAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionImageConfigProperty(block: CfnFunctionImageConfigPropertyDsl.() -> Unit = {}):
      CfnFunction.ImageConfigProperty {
    val builder = CfnFunctionImageConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionIoTRuleEventProperty(block: CfnFunctionIoTRuleEventPropertyDsl.() -> Unit =
      {}): CfnFunction.IoTRuleEventProperty {
    val builder = CfnFunctionIoTRuleEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionKeySAMPTProperty(block: CfnFunctionKeySAMPTPropertyDsl.() -> Unit =
      {}): CfnFunction.KeySAMPTProperty {
    val builder = CfnFunctionKeySAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionKinesisEventProperty(block: CfnFunctionKinesisEventPropertyDsl.() -> Unit =
      {}): CfnFunction.KinesisEventProperty {
    val builder = CfnFunctionKinesisEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionLogGroupSAMPTProperty(block: CfnFunctionLogGroupSAMPTPropertyDsl.() -> Unit =
      {}): CfnFunction.LogGroupSAMPTProperty {
    val builder = CfnFunctionLogGroupSAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionParameterNameSAMPTProperty(block: CfnFunctionParameterNameSAMPTPropertyDsl.() -> Unit
      = {}): CfnFunction.ParameterNameSAMPTProperty {
    val builder = CfnFunctionParameterNameSAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionProps(block: CfnFunctionPropsDsl.() -> Unit = {}): CfnFunctionProps {
    val builder = CfnFunctionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionProvisionedConcurrencyConfigProperty(block: CfnFunctionProvisionedConcurrencyConfigPropertyDsl.() -> Unit
      = {}): CfnFunction.ProvisionedConcurrencyConfigProperty {
    val builder = CfnFunctionProvisionedConcurrencyConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionQueueSAMPTProperty(block: CfnFunctionQueueSAMPTPropertyDsl.() -> Unit
      = {}): CfnFunction.QueueSAMPTProperty {
    val builder = CfnFunctionQueueSAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionRequestModelProperty(block: CfnFunctionRequestModelPropertyDsl.() -> Unit =
      {}): CfnFunction.RequestModelProperty {
    val builder = CfnFunctionRequestModelPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionRequestParameterProperty(block: CfnFunctionRequestParameterPropertyDsl.() -> Unit
      = {}): CfnFunction.RequestParameterProperty {
    val builder = CfnFunctionRequestParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionRouteSettingsProperty(block: CfnFunctionRouteSettingsPropertyDsl.() -> Unit =
      {}): CfnFunction.RouteSettingsProperty {
    val builder = CfnFunctionRouteSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionS3EventProperty(block: CfnFunctionS3EventPropertyDsl.() -> Unit =
      {}): CfnFunction.S3EventProperty {
    val builder = CfnFunctionS3EventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionS3KeyFilterProperty(block: CfnFunctionS3KeyFilterPropertyDsl.() -> Unit = {}):
      CfnFunction.S3KeyFilterProperty {
    val builder = CfnFunctionS3KeyFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionS3KeyFilterRuleProperty(block: CfnFunctionS3KeyFilterRulePropertyDsl.() -> Unit
      = {}): CfnFunction.S3KeyFilterRuleProperty {
    val builder = CfnFunctionS3KeyFilterRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionS3LocationProperty(block: CfnFunctionS3LocationPropertyDsl.() -> Unit
      = {}): CfnFunction.S3LocationProperty {
    val builder = CfnFunctionS3LocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionS3NotificationFilterProperty(block: CfnFunctionS3NotificationFilterPropertyDsl.() -> Unit
      = {}): CfnFunction.S3NotificationFilterProperty {
    val builder = CfnFunctionS3NotificationFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionSAMPolicyTemplateProperty(block: CfnFunctionSAMPolicyTemplatePropertyDsl.() -> Unit
      = {}): CfnFunction.SAMPolicyTemplateProperty {
    val builder = CfnFunctionSAMPolicyTemplatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionSNSEventProperty(block: CfnFunctionSNSEventPropertyDsl.() -> Unit =
      {}): CfnFunction.SNSEventProperty {
    val builder = CfnFunctionSNSEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionSQSEventProperty(block: CfnFunctionSQSEventPropertyDsl.() -> Unit =
      {}): CfnFunction.SQSEventProperty {
    val builder = CfnFunctionSQSEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionScheduleEventProperty(block: CfnFunctionScheduleEventPropertyDsl.() -> Unit =
      {}): CfnFunction.ScheduleEventProperty {
    val builder = CfnFunctionScheduleEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionSecretArnSAMPTProperty(block: CfnFunctionSecretArnSAMPTPropertyDsl.() -> Unit =
      {}): CfnFunction.SecretArnSAMPTProperty {
    val builder = CfnFunctionSecretArnSAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionStateMachineSAMPTProperty(block: CfnFunctionStateMachineSAMPTPropertyDsl.() -> Unit
      = {}): CfnFunction.StateMachineSAMPTProperty {
    val builder = CfnFunctionStateMachineSAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionStreamSAMPTProperty(block: CfnFunctionStreamSAMPTPropertyDsl.() -> Unit = {}):
      CfnFunction.StreamSAMPTProperty {
    val builder = CfnFunctionStreamSAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionTableSAMPTProperty(block: CfnFunctionTableSAMPTPropertyDsl.() -> Unit
      = {}): CfnFunction.TableSAMPTProperty {
    val builder = CfnFunctionTableSAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionTableStreamSAMPTProperty(block: CfnFunctionTableStreamSAMPTPropertyDsl.() -> Unit
      = {}): CfnFunction.TableStreamSAMPTProperty {
    val builder = CfnFunctionTableStreamSAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionTopicSAMPTProperty(block: CfnFunctionTopicSAMPTPropertyDsl.() -> Unit
      = {}): CfnFunction.TopicSAMPTProperty {
    val builder = CfnFunctionTopicSAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionVpcConfigProperty(block: CfnFunctionVpcConfigPropertyDsl.() -> Unit =
      {}): CfnFunction.VpcConfigProperty {
    val builder = CfnFunctionVpcConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHttpApi(
    scope: Construct,
    id: String,
    block: CfnHttpApiDsl.() -> Unit = {},
  ): CfnHttpApi {
    val builder = CfnHttpApiDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnHttpApiAccessLogSettingProperty(block: CfnHttpApiAccessLogSettingPropertyDsl.() -> Unit
      = {}): CfnHttpApi.AccessLogSettingProperty {
    val builder = CfnHttpApiAccessLogSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnHttpApiCorsConfigurationObjectProperty(block: CfnHttpApiCorsConfigurationObjectPropertyDsl.() -> Unit
      = {}): CfnHttpApi.CorsConfigurationObjectProperty {
    val builder = CfnHttpApiCorsConfigurationObjectPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHttpApiHttpApiAuthProperty(block: CfnHttpApiHttpApiAuthPropertyDsl.() -> Unit
      = {}): CfnHttpApi.HttpApiAuthProperty {
    val builder = CfnHttpApiHttpApiAuthPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnHttpApiHttpApiDomainConfigurationProperty(block: CfnHttpApiHttpApiDomainConfigurationPropertyDsl.() -> Unit
      = {}): CfnHttpApi.HttpApiDomainConfigurationProperty {
    val builder = CfnHttpApiHttpApiDomainConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnHttpApiMutualTlsAuthenticationProperty(block: CfnHttpApiMutualTlsAuthenticationPropertyDsl.() -> Unit
      = {}): CfnHttpApi.MutualTlsAuthenticationProperty {
    val builder = CfnHttpApiMutualTlsAuthenticationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHttpApiProps(block: CfnHttpApiPropsDsl.() -> Unit = {}): CfnHttpApiProps {
    val builder = CfnHttpApiPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnHttpApiRoute53ConfigurationProperty(block: CfnHttpApiRoute53ConfigurationPropertyDsl.() -> Unit
      = {}): CfnHttpApi.Route53ConfigurationProperty {
    val builder = CfnHttpApiRoute53ConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnHttpApiRouteSettingsProperty(block: CfnHttpApiRouteSettingsPropertyDsl.() -> Unit =
      {}): CfnHttpApi.RouteSettingsProperty {
    val builder = CfnHttpApiRouteSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHttpApiS3LocationProperty(block: CfnHttpApiS3LocationPropertyDsl.() -> Unit =
      {}): CfnHttpApi.S3LocationProperty {
    val builder = CfnHttpApiS3LocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLayerVersion(
    scope: Construct,
    id: String,
    block: CfnLayerVersionDsl.() -> Unit = {},
  ): CfnLayerVersion {
    val builder = CfnLayerVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLayerVersionProps(block: CfnLayerVersionPropsDsl.() -> Unit = {}):
      CfnLayerVersionProps {
    val builder = CfnLayerVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLayerVersionS3LocationProperty(block: CfnLayerVersionS3LocationPropertyDsl.() -> Unit =
      {}): CfnLayerVersion.S3LocationProperty {
    val builder = CfnLayerVersionS3LocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSimpleTable(
    scope: Construct,
    id: String,
    block: CfnSimpleTableDsl.() -> Unit = {},
  ): CfnSimpleTable {
    val builder = CfnSimpleTableDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSimpleTablePrimaryKeyProperty(block: CfnSimpleTablePrimaryKeyPropertyDsl.() -> Unit =
      {}): CfnSimpleTable.PrimaryKeyProperty {
    val builder = CfnSimpleTablePrimaryKeyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSimpleTableProps(block: CfnSimpleTablePropsDsl.() -> Unit = {}):
      CfnSimpleTableProps {
    val builder = CfnSimpleTablePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSimpleTableProvisionedThroughputProperty(block: CfnSimpleTableProvisionedThroughputPropertyDsl.() -> Unit
      = {}): CfnSimpleTable.ProvisionedThroughputProperty {
    val builder = CfnSimpleTableProvisionedThroughputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSimpleTableSSESpecificationProperty(block: CfnSimpleTableSSESpecificationPropertyDsl.() -> Unit
      = {}): CfnSimpleTable.SSESpecificationProperty {
    val builder = CfnSimpleTableSSESpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStateMachine(
    scope: Construct,
    id: String,
    block: CfnStateMachineDsl.() -> Unit = {},
  ): CfnStateMachine {
    val builder = CfnStateMachineDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineApiEventProperty(block: CfnStateMachineApiEventPropertyDsl.() -> Unit =
      {}): CfnStateMachine.ApiEventProperty {
    val builder = CfnStateMachineApiEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineCloudWatchEventEventProperty(block: CfnStateMachineCloudWatchEventEventPropertyDsl.() -> Unit
      = {}): CfnStateMachine.CloudWatchEventEventProperty {
    val builder = CfnStateMachineCloudWatchEventEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineCloudWatchLogsLogGroupProperty(block: CfnStateMachineCloudWatchLogsLogGroupPropertyDsl.() -> Unit
      = {}): CfnStateMachine.CloudWatchLogsLogGroupProperty {
    val builder = CfnStateMachineCloudWatchLogsLogGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineEventBridgeRuleEventProperty(block: CfnStateMachineEventBridgeRuleEventPropertyDsl.() -> Unit
      = {}): CfnStateMachine.EventBridgeRuleEventProperty {
    val builder = CfnStateMachineEventBridgeRuleEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineEventSourceProperty(block: CfnStateMachineEventSourcePropertyDsl.() -> Unit
      = {}): CfnStateMachine.EventSourceProperty {
    val builder = CfnStateMachineEventSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineFunctionSAMPTProperty(block: CfnStateMachineFunctionSAMPTPropertyDsl.() -> Unit
      = {}): CfnStateMachine.FunctionSAMPTProperty {
    val builder = CfnStateMachineFunctionSAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineIAMPolicyDocumentProperty(block: CfnStateMachineIAMPolicyDocumentPropertyDsl.() -> Unit
      = {}): CfnStateMachine.IAMPolicyDocumentProperty {
    val builder = CfnStateMachineIAMPolicyDocumentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineLogDestinationProperty(block: CfnStateMachineLogDestinationPropertyDsl.() -> Unit
      = {}): CfnStateMachine.LogDestinationProperty {
    val builder = CfnStateMachineLogDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineLoggingConfigurationProperty(block: CfnStateMachineLoggingConfigurationPropertyDsl.() -> Unit
      = {}): CfnStateMachine.LoggingConfigurationProperty {
    val builder = CfnStateMachineLoggingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStateMachineProps(block: CfnStateMachinePropsDsl.() -> Unit = {}):
      CfnStateMachineProps {
    val builder = CfnStateMachinePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineS3LocationProperty(block: CfnStateMachineS3LocationPropertyDsl.() -> Unit =
      {}): CfnStateMachine.S3LocationProperty {
    val builder = CfnStateMachineS3LocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineSAMPolicyTemplateProperty(block: CfnStateMachineSAMPolicyTemplatePropertyDsl.() -> Unit
      = {}): CfnStateMachine.SAMPolicyTemplateProperty {
    val builder = CfnStateMachineSAMPolicyTemplatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineScheduleEventProperty(block: CfnStateMachineScheduleEventPropertyDsl.() -> Unit
      = {}): CfnStateMachine.ScheduleEventProperty {
    val builder = CfnStateMachineScheduleEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineStateMachineSAMPTProperty(block: CfnStateMachineStateMachineSAMPTPropertyDsl.() -> Unit
      = {}): CfnStateMachine.StateMachineSAMPTProperty {
    val builder = CfnStateMachineStateMachineSAMPTPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStateMachineTracingConfigurationProperty(block: CfnStateMachineTracingConfigurationPropertyDsl.() -> Unit
      = {}): CfnStateMachine.TracingConfigurationProperty {
    val builder = CfnStateMachineTracingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
