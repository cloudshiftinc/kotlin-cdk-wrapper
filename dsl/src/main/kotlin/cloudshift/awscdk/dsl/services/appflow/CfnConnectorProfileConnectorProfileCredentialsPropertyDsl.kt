@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.ConnectorProfileCredentialsProperty.Builder =
      CfnConnectorProfile.ConnectorProfileCredentialsProperty.builder()

  public fun amplitude(amplitude: IResolvable) {
    cdkBuilder.amplitude(amplitude)
  }

  public
      fun amplitude(amplitude: CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty) {
    cdkBuilder.amplitude(amplitude)
  }

  public fun customConnector(customConnector: IResolvable) {
    cdkBuilder.customConnector(customConnector)
  }

  public
      fun customConnector(customConnector: CfnConnectorProfile.CustomConnectorProfileCredentialsProperty) {
    cdkBuilder.customConnector(customConnector)
  }

  public fun datadog(datadog: IResolvable) {
    cdkBuilder.datadog(datadog)
  }

  public fun datadog(datadog: CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty) {
    cdkBuilder.datadog(datadog)
  }

  public fun dynatrace(dynatrace: IResolvable) {
    cdkBuilder.dynatrace(dynatrace)
  }

  public
      fun dynatrace(dynatrace: CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty) {
    cdkBuilder.dynatrace(dynatrace)
  }

  public fun googleAnalytics(googleAnalytics: IResolvable) {
    cdkBuilder.googleAnalytics(googleAnalytics)
  }

  public
      fun googleAnalytics(googleAnalytics: CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty) {
    cdkBuilder.googleAnalytics(googleAnalytics)
  }

  public fun inforNexus(inforNexus: IResolvable) {
    cdkBuilder.inforNexus(inforNexus)
  }

  public
      fun inforNexus(inforNexus: CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty) {
    cdkBuilder.inforNexus(inforNexus)
  }

  public fun marketo(marketo: IResolvable) {
    cdkBuilder.marketo(marketo)
  }

  public fun marketo(marketo: CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty) {
    cdkBuilder.marketo(marketo)
  }

  public fun pardot(pardot: IResolvable) {
    cdkBuilder.pardot(pardot)
  }

  public fun pardot(pardot: CfnConnectorProfile.PardotConnectorProfileCredentialsProperty) {
    cdkBuilder.pardot(pardot)
  }

  public fun redshift(redshift: IResolvable) {
    cdkBuilder.redshift(redshift)
  }

  public fun redshift(redshift: CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty) {
    cdkBuilder.redshift(redshift)
  }

  public fun salesforce(salesforce: IResolvable) {
    cdkBuilder.salesforce(salesforce)
  }

  public
      fun salesforce(salesforce: CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty) {
    cdkBuilder.salesforce(salesforce)
  }

  public fun sapoData(sapoData: IResolvable) {
    cdkBuilder.sapoData(sapoData)
  }

  public fun sapoData(sapoData: CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty) {
    cdkBuilder.sapoData(sapoData)
  }

  public fun serviceNow(serviceNow: IResolvable) {
    cdkBuilder.serviceNow(serviceNow)
  }

  public
      fun serviceNow(serviceNow: CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty) {
    cdkBuilder.serviceNow(serviceNow)
  }

  public fun singular(singular: IResolvable) {
    cdkBuilder.singular(singular)
  }

  public fun singular(singular: CfnConnectorProfile.SingularConnectorProfileCredentialsProperty) {
    cdkBuilder.singular(singular)
  }

  public fun slack(slack: IResolvable) {
    cdkBuilder.slack(slack)
  }

  public fun slack(slack: CfnConnectorProfile.SlackConnectorProfileCredentialsProperty) {
    cdkBuilder.slack(slack)
  }

  public fun snowflake(snowflake: IResolvable) {
    cdkBuilder.snowflake(snowflake)
  }

  public
      fun snowflake(snowflake: CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty) {
    cdkBuilder.snowflake(snowflake)
  }

  public fun trendmicro(trendmicro: IResolvable) {
    cdkBuilder.trendmicro(trendmicro)
  }

  public
      fun trendmicro(trendmicro: CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty) {
    cdkBuilder.trendmicro(trendmicro)
  }

  public fun veeva(veeva: IResolvable) {
    cdkBuilder.veeva(veeva)
  }

  public fun veeva(veeva: CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty) {
    cdkBuilder.veeva(veeva)
  }

  public fun zendesk(zendesk: IResolvable) {
    cdkBuilder.zendesk(zendesk)
  }

  public fun zendesk(zendesk: CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty) {
    cdkBuilder.zendesk(zendesk)
  }

  public fun build(): CfnConnectorProfile.ConnectorProfileCredentialsProperty = cdkBuilder.build()
}
