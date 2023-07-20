@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnStage
import software.amazon.awscdk.services.apigateway.CfnStageProps

@CdkDslMarker
public class CfnStagePropsDsl {
  private val cdkBuilder: CfnStageProps.Builder = CfnStageProps.builder()

  private val _methodSettings: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun accessLogSetting(accessLogSetting: IResolvable) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  public fun accessLogSetting(accessLogSetting: CfnStage.AccessLogSettingProperty) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  public fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  public fun cacheClusterSize(cacheClusterSize: String) {
    cdkBuilder.cacheClusterSize(cacheClusterSize)
  }

  public fun canarySetting(canarySetting: IResolvable) {
    cdkBuilder.canarySetting(canarySetting)
  }

  public fun canarySetting(canarySetting: CfnStage.CanarySettingProperty) {
    cdkBuilder.canarySetting(canarySetting)
  }

  public fun clientCertificateId(clientCertificateId: String) {
    cdkBuilder.clientCertificateId(clientCertificateId)
  }

  public fun deploymentId(deploymentId: String) {
    cdkBuilder.deploymentId(deploymentId)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun documentationVersion(documentationVersion: String) {
    cdkBuilder.documentationVersion(documentationVersion)
  }

  public fun methodSettings(vararg methodSettings: Any) {
    _methodSettings.addAll(listOf(*methodSettings))
  }

  public fun methodSettings(methodSettings: Collection<Any>) {
    _methodSettings.addAll(methodSettings)
  }

  public fun methodSettings(methodSettings: IResolvable) {
    cdkBuilder.methodSettings(methodSettings)
  }

  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun tracingEnabled(tracingEnabled: Boolean) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  public fun tracingEnabled(tracingEnabled: IResolvable) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  public fun variables(variables: Map<String, String>) {
    cdkBuilder.variables(variables)
  }

  public fun variables(variables: IResolvable) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnStageProps {
    if(_methodSettings.isNotEmpty()) cdkBuilder.methodSettings(_methodSettings)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
