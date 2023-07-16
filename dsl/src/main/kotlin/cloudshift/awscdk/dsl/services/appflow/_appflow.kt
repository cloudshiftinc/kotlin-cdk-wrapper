@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnector
import software.amazon.awscdk.services.appflow.CfnConnectorProfile
import software.amazon.awscdk.services.appflow.CfnConnectorProfileProps
import software.amazon.awscdk.services.appflow.CfnConnectorProps
import software.amazon.awscdk.services.appflow.CfnFlow
import software.amazon.awscdk.services.appflow.CfnFlowProps
import software.constructs.Construct

public object appflow {
  public inline fun cfnConnector(
    scope: Construct,
    id: String,
    block: CfnConnectorDsl.() -> Unit = {},
  ): CfnConnector {
    val builder = CfnConnectorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorConnectorProvisioningConfigProperty(block: CfnConnectorConnectorProvisioningConfigPropertyDsl.() -> Unit
      = {}): CfnConnector.ConnectorProvisioningConfigProperty {
    val builder = CfnConnectorConnectorProvisioningConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorLambdaConnectorProvisioningConfigProperty(block: CfnConnectorLambdaConnectorProvisioningConfigPropertyDsl.() -> Unit
      = {}): CfnConnector.LambdaConnectorProvisioningConfigProperty {
    val builder = CfnConnectorLambdaConnectorProvisioningConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnectorProfile(
    scope: Construct,
    id: String,
    block: CfnConnectorProfileDsl.() -> Unit = {},
  ): CfnConnectorProfile {
    val builder = CfnConnectorProfileDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileAmplitudeConnectorProfileCredentialsProperty(block: CfnConnectorProfileAmplitudeConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileAmplitudeConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileApiKeyCredentialsProperty(block: CfnConnectorProfileApiKeyCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ApiKeyCredentialsProperty {
    val builder = CfnConnectorProfileApiKeyCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileBasicAuthCredentialsProperty(block: CfnConnectorProfileBasicAuthCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.BasicAuthCredentialsProperty {
    val builder = CfnConnectorProfileBasicAuthCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileConnectorOAuthRequestProperty(block: CfnConnectorProfileConnectorOAuthRequestPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ConnectorOAuthRequestProperty {
    val builder = CfnConnectorProfileConnectorOAuthRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileConnectorProfileConfigProperty(block: CfnConnectorProfileConnectorProfileConfigPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ConnectorProfileConfigProperty {
    val builder = CfnConnectorProfileConnectorProfileConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileConnectorProfileCredentialsProperty(block: CfnConnectorProfileConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileConnectorProfilePropertiesProperty(block: CfnConnectorProfileConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileCustomAuthCredentialsProperty(block: CfnConnectorProfileCustomAuthCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.CustomAuthCredentialsProperty {
    val builder = CfnConnectorProfileCustomAuthCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileCustomConnectorProfileCredentialsProperty(block: CfnConnectorProfileCustomConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.CustomConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileCustomConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileCustomConnectorProfilePropertiesProperty(block: CfnConnectorProfileCustomConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.CustomConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileCustomConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileDatadogConnectorProfileCredentialsProperty(block: CfnConnectorProfileDatadogConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileDatadogConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileDatadogConnectorProfilePropertiesProperty(block: CfnConnectorProfileDatadogConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileDatadogConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileDynatraceConnectorProfileCredentialsProperty(block: CfnConnectorProfileDynatraceConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileDynatraceConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileDynatraceConnectorProfilePropertiesProperty(block: CfnConnectorProfileDynatraceConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileDynatraceConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileGoogleAnalyticsConnectorProfileCredentialsProperty(block: CfnConnectorProfileGoogleAnalyticsConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileGoogleAnalyticsConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileInforNexusConnectorProfileCredentialsProperty(block: CfnConnectorProfileInforNexusConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileInforNexusConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileInforNexusConnectorProfilePropertiesProperty(block: CfnConnectorProfileInforNexusConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileInforNexusConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileMarketoConnectorProfileCredentialsProperty(block: CfnConnectorProfileMarketoConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileMarketoConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileMarketoConnectorProfilePropertiesProperty(block: CfnConnectorProfileMarketoConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileMarketoConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileOAuth2CredentialsProperty(block: CfnConnectorProfileOAuth2CredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.OAuth2CredentialsProperty {
    val builder = CfnConnectorProfileOAuth2CredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileOAuth2PropertiesProperty(block: CfnConnectorProfileOAuth2PropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.OAuth2PropertiesProperty {
    val builder = CfnConnectorProfileOAuth2PropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileOAuthCredentialsProperty(block: CfnConnectorProfileOAuthCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.OAuthCredentialsProperty {
    val builder = CfnConnectorProfileOAuthCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileOAuthPropertiesProperty(block: CfnConnectorProfileOAuthPropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.OAuthPropertiesProperty {
    val builder = CfnConnectorProfileOAuthPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfilePardotConnectorProfileCredentialsProperty(block: CfnConnectorProfilePardotConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.PardotConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfilePardotConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfilePardotConnectorProfilePropertiesProperty(block: CfnConnectorProfilePardotConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.PardotConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfilePardotConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnectorProfileProps(block: CfnConnectorProfilePropsDsl.() -> Unit = {}):
      CfnConnectorProfileProps {
    val builder = CfnConnectorProfilePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileRedshiftConnectorProfileCredentialsProperty(block: CfnConnectorProfileRedshiftConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileRedshiftConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileRedshiftConnectorProfilePropertiesProperty(block: CfnConnectorProfileRedshiftConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileRedshiftConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileSAPODataConnectorProfileCredentialsProperty(block: CfnConnectorProfileSAPODataConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileSAPODataConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileSAPODataConnectorProfilePropertiesProperty(block: CfnConnectorProfileSAPODataConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileSAPODataConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileSalesforceConnectorProfileCredentialsProperty(block: CfnConnectorProfileSalesforceConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileSalesforceConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileSalesforceConnectorProfilePropertiesProperty(block: CfnConnectorProfileSalesforceConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileSalesforceConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileServiceNowConnectorProfileCredentialsProperty(block: CfnConnectorProfileServiceNowConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileServiceNowConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileServiceNowConnectorProfilePropertiesProperty(block: CfnConnectorProfileServiceNowConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileServiceNowConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileSingularConnectorProfileCredentialsProperty(block: CfnConnectorProfileSingularConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SingularConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileSingularConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileSlackConnectorProfileCredentialsProperty(block: CfnConnectorProfileSlackConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SlackConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileSlackConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileSlackConnectorProfilePropertiesProperty(block: CfnConnectorProfileSlackConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SlackConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileSlackConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileSnowflakeConnectorProfileCredentialsProperty(block: CfnConnectorProfileSnowflakeConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileSnowflakeConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileSnowflakeConnectorProfilePropertiesProperty(block: CfnConnectorProfileSnowflakeConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileSnowflakeConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileTrendmicroConnectorProfileCredentialsProperty(block: CfnConnectorProfileTrendmicroConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileTrendmicroConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileVeevaConnectorProfileCredentialsProperty(block: CfnConnectorProfileVeevaConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileVeevaConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileVeevaConnectorProfilePropertiesProperty(block: CfnConnectorProfileVeevaConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileVeevaConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileZendeskConnectorProfileCredentialsProperty(block: CfnConnectorProfileZendeskConnectorProfileCredentialsPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty {
    val builder = CfnConnectorProfileZendeskConnectorProfileCredentialsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectorProfileZendeskConnectorProfilePropertiesProperty(block: CfnConnectorProfileZendeskConnectorProfilePropertiesPropertyDsl.() -> Unit
      = {}): CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty {
    val builder = CfnConnectorProfileZendeskConnectorProfilePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnectorProps(block: CfnConnectorPropsDsl.() -> Unit = {}):
      CfnConnectorProps {
    val builder = CfnConnectorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFlow(
    scope: Construct,
    id: String,
    block: CfnFlowDsl.() -> Unit = {},
  ): CfnFlow {
    val builder = CfnFlowDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowAggregationConfigProperty(block: CfnFlowAggregationConfigPropertyDsl.() -> Unit =
      {}): CfnFlow.AggregationConfigProperty {
    val builder = CfnFlowAggregationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowAmplitudeSourcePropertiesProperty(block: CfnFlowAmplitudeSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.AmplitudeSourcePropertiesProperty {
    val builder = CfnFlowAmplitudeSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowConnectorOperatorProperty(block: CfnFlowConnectorOperatorPropertyDsl.() -> Unit =
      {}): CfnFlow.ConnectorOperatorProperty {
    val builder = CfnFlowConnectorOperatorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowCustomConnectorDestinationPropertiesProperty(block: CfnFlowCustomConnectorDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.CustomConnectorDestinationPropertiesProperty {
    val builder = CfnFlowCustomConnectorDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowCustomConnectorSourcePropertiesProperty(block: CfnFlowCustomConnectorSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.CustomConnectorSourcePropertiesProperty {
    val builder = CfnFlowCustomConnectorSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowDatadogSourcePropertiesProperty(block: CfnFlowDatadogSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.DatadogSourcePropertiesProperty {
    val builder = CfnFlowDatadogSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowDestinationConnectorPropertiesProperty(block: CfnFlowDestinationConnectorPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.DestinationConnectorPropertiesProperty {
    val builder = CfnFlowDestinationConnectorPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowDestinationFlowConfigProperty(block: CfnFlowDestinationFlowConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.DestinationFlowConfigProperty {
    val builder = CfnFlowDestinationFlowConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowDynatraceSourcePropertiesProperty(block: CfnFlowDynatraceSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.DynatraceSourcePropertiesProperty {
    val builder = CfnFlowDynatraceSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowErrorHandlingConfigProperty(block: CfnFlowErrorHandlingConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.ErrorHandlingConfigProperty {
    val builder = CfnFlowErrorHandlingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowEventBridgeDestinationPropertiesProperty(block: CfnFlowEventBridgeDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.EventBridgeDestinationPropertiesProperty {
    val builder = CfnFlowEventBridgeDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowGlueDataCatalogProperty(block: CfnFlowGlueDataCatalogPropertyDsl.() -> Unit = {}):
      CfnFlow.GlueDataCatalogProperty {
    val builder = CfnFlowGlueDataCatalogPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowGoogleAnalyticsSourcePropertiesProperty(block: CfnFlowGoogleAnalyticsSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.GoogleAnalyticsSourcePropertiesProperty {
    val builder = CfnFlowGoogleAnalyticsSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowIncrementalPullConfigProperty(block: CfnFlowIncrementalPullConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.IncrementalPullConfigProperty {
    val builder = CfnFlowIncrementalPullConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowInforNexusSourcePropertiesProperty(block: CfnFlowInforNexusSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.InforNexusSourcePropertiesProperty {
    val builder = CfnFlowInforNexusSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowLookoutMetricsDestinationPropertiesProperty(block: CfnFlowLookoutMetricsDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.LookoutMetricsDestinationPropertiesProperty {
    val builder = CfnFlowLookoutMetricsDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowMarketoDestinationPropertiesProperty(block: CfnFlowMarketoDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.MarketoDestinationPropertiesProperty {
    val builder = CfnFlowMarketoDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowMarketoSourcePropertiesProperty(block: CfnFlowMarketoSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.MarketoSourcePropertiesProperty {
    val builder = CfnFlowMarketoSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowMetadataCatalogConfigProperty(block: CfnFlowMetadataCatalogConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.MetadataCatalogConfigProperty {
    val builder = CfnFlowMetadataCatalogConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowPardotSourcePropertiesProperty(block: CfnFlowPardotSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.PardotSourcePropertiesProperty {
    val builder = CfnFlowPardotSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFlowPrefixConfigProperty(block: CfnFlowPrefixConfigPropertyDsl.() -> Unit =
      {}): CfnFlow.PrefixConfigProperty {
    val builder = CfnFlowPrefixConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFlowProps(block: CfnFlowPropsDsl.() -> Unit = {}): CfnFlowProps {
    val builder = CfnFlowPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowRedshiftDestinationPropertiesProperty(block: CfnFlowRedshiftDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.RedshiftDestinationPropertiesProperty {
    val builder = CfnFlowRedshiftDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowS3DestinationPropertiesProperty(block: CfnFlowS3DestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.S3DestinationPropertiesProperty {
    val builder = CfnFlowS3DestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowS3InputFormatConfigProperty(block: CfnFlowS3InputFormatConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.S3InputFormatConfigProperty {
    val builder = CfnFlowS3InputFormatConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowS3OutputFormatConfigProperty(block: CfnFlowS3OutputFormatConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.S3OutputFormatConfigProperty {
    val builder = CfnFlowS3OutputFormatConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowS3SourcePropertiesProperty(block: CfnFlowS3SourcePropertiesPropertyDsl.() -> Unit =
      {}): CfnFlow.S3SourcePropertiesProperty {
    val builder = CfnFlowS3SourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowSAPODataDestinationPropertiesProperty(block: CfnFlowSAPODataDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SAPODataDestinationPropertiesProperty {
    val builder = CfnFlowSAPODataDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowSAPODataSourcePropertiesProperty(block: CfnFlowSAPODataSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SAPODataSourcePropertiesProperty {
    val builder = CfnFlowSAPODataSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowSalesforceDestinationPropertiesProperty(block: CfnFlowSalesforceDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SalesforceDestinationPropertiesProperty {
    val builder = CfnFlowSalesforceDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowSalesforceSourcePropertiesProperty(block: CfnFlowSalesforceSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SalesforceSourcePropertiesProperty {
    val builder = CfnFlowSalesforceSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowScheduledTriggerPropertiesProperty(block: CfnFlowScheduledTriggerPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.ScheduledTriggerPropertiesProperty {
    val builder = CfnFlowScheduledTriggerPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowServiceNowSourcePropertiesProperty(block: CfnFlowServiceNowSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.ServiceNowSourcePropertiesProperty {
    val builder = CfnFlowServiceNowSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowSingularSourcePropertiesProperty(block: CfnFlowSingularSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SingularSourcePropertiesProperty {
    val builder = CfnFlowSingularSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowSlackSourcePropertiesProperty(block: CfnFlowSlackSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SlackSourcePropertiesProperty {
    val builder = CfnFlowSlackSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowSnowflakeDestinationPropertiesProperty(block: CfnFlowSnowflakeDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SnowflakeDestinationPropertiesProperty {
    val builder = CfnFlowSnowflakeDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowSourceConnectorPropertiesProperty(block: CfnFlowSourceConnectorPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.SourceConnectorPropertiesProperty {
    val builder = CfnFlowSourceConnectorPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowSourceFlowConfigProperty(block: CfnFlowSourceFlowConfigPropertyDsl.() -> Unit =
      {}): CfnFlow.SourceFlowConfigProperty {
    val builder = CfnFlowSourceFlowConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowSuccessResponseHandlingConfigProperty(block: CfnFlowSuccessResponseHandlingConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.SuccessResponseHandlingConfigProperty {
    val builder = CfnFlowSuccessResponseHandlingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowTaskPropertiesObjectProperty(block: CfnFlowTaskPropertiesObjectPropertyDsl.() -> Unit
      = {}): CfnFlow.TaskPropertiesObjectProperty {
    val builder = CfnFlowTaskPropertiesObjectPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFlowTaskProperty(block: CfnFlowTaskPropertyDsl.() -> Unit = {}):
      CfnFlow.TaskProperty {
    val builder = CfnFlowTaskPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowTrendmicroSourcePropertiesProperty(block: CfnFlowTrendmicroSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.TrendmicroSourcePropertiesProperty {
    val builder = CfnFlowTrendmicroSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFlowTriggerConfigProperty(block: CfnFlowTriggerConfigPropertyDsl.() -> Unit =
      {}): CfnFlow.TriggerConfigProperty {
    val builder = CfnFlowTriggerConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowUpsolverDestinationPropertiesProperty(block: CfnFlowUpsolverDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.UpsolverDestinationPropertiesProperty {
    val builder = CfnFlowUpsolverDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowUpsolverS3OutputFormatConfigProperty(block: CfnFlowUpsolverS3OutputFormatConfigPropertyDsl.() -> Unit
      = {}): CfnFlow.UpsolverS3OutputFormatConfigProperty {
    val builder = CfnFlowUpsolverS3OutputFormatConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowVeevaSourcePropertiesProperty(block: CfnFlowVeevaSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.VeevaSourcePropertiesProperty {
    val builder = CfnFlowVeevaSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowZendeskDestinationPropertiesProperty(block: CfnFlowZendeskDestinationPropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.ZendeskDestinationPropertiesProperty {
    val builder = CfnFlowZendeskDestinationPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowZendeskSourcePropertiesProperty(block: CfnFlowZendeskSourcePropertiesPropertyDsl.() -> Unit
      = {}): CfnFlow.ZendeskSourcePropertiesProperty {
    val builder = CfnFlowZendeskSourcePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
