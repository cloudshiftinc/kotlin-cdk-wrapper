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

  /**
   * @param accessLogSetting Access log settings, including the access log format and access log
   * destination ARN.
   */
  public fun accessLogSetting(accessLogSetting: IResolvable) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  /**
   * @param accessLogSetting Access log settings, including the access log format and access log
   * destination ARN.
   */
  public fun accessLogSetting(accessLogSetting: CfnStage.AccessLogSettingProperty) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  /**
   * @param cacheClusterEnabled Specifies whether a cache cluster is enabled for the stage.
   */
  public fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  /**
   * @param cacheClusterEnabled Specifies whether a cache cluster is enabled for the stage.
   */
  public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  /**
   * @param cacheClusterSize The stage's cache capacity in GB.
   * For more information about choosing a cache size, see [Enabling API caching to enhance
   * responsiveness](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
   * .
   */
  public fun cacheClusterSize(cacheClusterSize: String) {
    cdkBuilder.cacheClusterSize(cacheClusterSize)
  }

  /**
   * @param canarySetting Settings for the canary deployment in this stage.
   */
  public fun canarySetting(canarySetting: IResolvable) {
    cdkBuilder.canarySetting(canarySetting)
  }

  /**
   * @param canarySetting Settings for the canary deployment in this stage.
   */
  public fun canarySetting(canarySetting: CfnStage.CanarySettingProperty) {
    cdkBuilder.canarySetting(canarySetting)
  }

  /**
   * @param clientCertificateId The identifier of a client certificate for an API stage.
   */
  public fun clientCertificateId(clientCertificateId: String) {
    cdkBuilder.clientCertificateId(clientCertificateId)
  }

  /**
   * @param deploymentId The identifier of the Deployment that the stage points to.
   */
  public fun deploymentId(deploymentId: String) {
    cdkBuilder.deploymentId(deploymentId)
  }

  /**
   * @param description The stage's description.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param documentationVersion The version of the associated API documentation.
   */
  public fun documentationVersion(documentationVersion: String) {
    cdkBuilder.documentationVersion(documentationVersion)
  }

  /**
   * @param methodSettings A map that defines the method settings for a Stage resource.
   * Keys (designated as `/{method_setting_key` below) are method paths defined as
   * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding all
   * methods in the stage.
   */
  public fun methodSettings(vararg methodSettings: Any) {
    _methodSettings.addAll(listOf(*methodSettings))
  }

  /**
   * @param methodSettings A map that defines the method settings for a Stage resource.
   * Keys (designated as `/{method_setting_key` below) are method paths defined as
   * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding all
   * methods in the stage.
   */
  public fun methodSettings(methodSettings: Collection<Any>) {
    _methodSettings.addAll(methodSettings)
  }

  /**
   * @param methodSettings A map that defines the method settings for a Stage resource.
   * Keys (designated as `/{method_setting_key` below) are method paths defined as
   * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding all
   * methods in the stage.
   */
  public fun methodSettings(methodSettings: IResolvable) {
    cdkBuilder.methodSettings(methodSettings)
  }

  /**
   * @param restApiId The string identifier of the associated RestApi. 
   */
  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  /**
   * @param stageName The name of the stage is the first path segment in the Uniform Resource
   * Identifier (URI) of a call to API Gateway.
   * Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length
   * is 128 characters.
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  /**
   * @param tags The collection of tags.
   * Each tag element is associated with a given resource.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The collection of tags.
   * Each tag element is associated with a given resource.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for the Stage.
   */
  public fun tracingEnabled(tracingEnabled: Boolean) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  /**
   * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for the Stage.
   */
  public fun tracingEnabled(tracingEnabled: IResolvable) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  /**
   * @param variables A map (string-to-string map) that defines the stage variables, where the
   * variable name is the key and the variable value is the value.
   * Variable names are limited to alphanumeric characters. Values must match the following regular
   * expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
   */
  public fun variables(variables: Map<String, String>) {
    cdkBuilder.variables(variables)
  }

  /**
   * @param variables A map (string-to-string map) that defines the stage variables, where the
   * variable name is the key and the variable value is the value.
   * Variable names are limited to alphanumeric characters. Values must match the following regular
   * expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
   */
  public fun variables(variables: IResolvable) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnStageProps {
    if(_methodSettings.isNotEmpty()) cdkBuilder.methodSettings(_methodSettings)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
