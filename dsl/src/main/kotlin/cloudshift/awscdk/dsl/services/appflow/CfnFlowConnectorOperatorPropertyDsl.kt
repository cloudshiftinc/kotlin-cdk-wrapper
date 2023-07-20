@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowConnectorOperatorPropertyDsl {
  private val cdkBuilder: CfnFlow.ConnectorOperatorProperty.Builder =
      CfnFlow.ConnectorOperatorProperty.builder()

  public fun amplitude(amplitude: String) {
    cdkBuilder.amplitude(amplitude)
  }

  public fun customConnector(customConnector: String) {
    cdkBuilder.customConnector(customConnector)
  }

  public fun datadog(datadog: String) {
    cdkBuilder.datadog(datadog)
  }

  public fun dynatrace(dynatrace: String) {
    cdkBuilder.dynatrace(dynatrace)
  }

  public fun googleAnalytics(googleAnalytics: String) {
    cdkBuilder.googleAnalytics(googleAnalytics)
  }

  public fun inforNexus(inforNexus: String) {
    cdkBuilder.inforNexus(inforNexus)
  }

  public fun marketo(marketo: String) {
    cdkBuilder.marketo(marketo)
  }

  public fun pardot(pardot: String) {
    cdkBuilder.pardot(pardot)
  }

  public fun s3(s3: String) {
    cdkBuilder.s3(s3)
  }

  public fun salesforce(salesforce: String) {
    cdkBuilder.salesforce(salesforce)
  }

  public fun sapoData(sapoData: String) {
    cdkBuilder.sapoData(sapoData)
  }

  public fun serviceNow(serviceNow: String) {
    cdkBuilder.serviceNow(serviceNow)
  }

  public fun singular(singular: String) {
    cdkBuilder.singular(singular)
  }

  public fun slack(slack: String) {
    cdkBuilder.slack(slack)
  }

  public fun trendmicro(trendmicro: String) {
    cdkBuilder.trendmicro(trendmicro)
  }

  public fun veeva(veeva: String) {
    cdkBuilder.veeva(veeva)
  }

  public fun zendesk(zendesk: String) {
    cdkBuilder.zendesk(zendesk)
  }

  public fun build(): CfnFlow.ConnectorOperatorProperty = cdkBuilder.build()
}
