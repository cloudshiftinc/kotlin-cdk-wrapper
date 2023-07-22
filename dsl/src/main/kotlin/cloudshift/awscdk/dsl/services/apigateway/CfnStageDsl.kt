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
import software.constructs.Construct

@CdkDslMarker
public class CfnStageDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStage.Builder = CfnStage.Builder.create(scope, id)

  private val _methodSettings: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Access log settings, including the access log format and access log destination ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-accesslogsetting)
   * @param accessLogSetting Access log settings, including the access log format and access log
   * destination ARN. 
   */
  public fun accessLogSetting(accessLogSetting: IResolvable) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  /**
   * Access log settings, including the access log format and access log destination ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-accesslogsetting)
   * @param accessLogSetting Access log settings, including the access log format and access log
   * destination ARN. 
   */
  public fun accessLogSetting(accessLogSetting: CfnStage.AccessLogSettingProperty) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  /**
   * Specifies whether a cache cluster is enabled for the stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled)
   * @param cacheClusterEnabled Specifies whether a cache cluster is enabled for the stage. 
   */
  public fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  /**
   * Specifies whether a cache cluster is enabled for the stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled)
   * @param cacheClusterEnabled Specifies whether a cache cluster is enabled for the stage. 
   */
  public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  /**
   * The stage's cache capacity in GB.
   *
   * For more information about choosing a cache size, see [Enabling API caching to enhance
   * responsiveness](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize)
   * @param cacheClusterSize The stage's cache capacity in GB. 
   */
  public fun cacheClusterSize(cacheClusterSize: String) {
    cdkBuilder.cacheClusterSize(cacheClusterSize)
  }

  /**
   * Settings for the canary deployment in this stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-canarysetting)
   * @param canarySetting Settings for the canary deployment in this stage. 
   */
  public fun canarySetting(canarySetting: IResolvable) {
    cdkBuilder.canarySetting(canarySetting)
  }

  /**
   * Settings for the canary deployment in this stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-canarysetting)
   * @param canarySetting Settings for the canary deployment in this stage. 
   */
  public fun canarySetting(canarySetting: CfnStage.CanarySettingProperty) {
    cdkBuilder.canarySetting(canarySetting)
  }

  /**
   * The identifier of a client certificate for an API stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid)
   * @param clientCertificateId The identifier of a client certificate for an API stage. 
   */
  public fun clientCertificateId(clientCertificateId: String) {
    cdkBuilder.clientCertificateId(clientCertificateId)
  }

  /**
   * The identifier of the Deployment that the stage points to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid)
   * @param deploymentId The identifier of the Deployment that the stage points to. 
   */
  public fun deploymentId(deploymentId: String) {
    cdkBuilder.deploymentId(deploymentId)
  }

  /**
   * The stage's description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description)
   * @param description The stage's description. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The version of the associated API documentation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion)
   * @param documentationVersion The version of the associated API documentation. 
   */
  public fun documentationVersion(documentationVersion: String) {
    cdkBuilder.documentationVersion(documentationVersion)
  }

  /**
   * A map that defines the method settings for a Stage resource.
   *
   * Keys (designated as `/{method_setting_key` below) are method paths defined as
   * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding all
   * methods in the stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings)
   * @param methodSettings A map that defines the method settings for a Stage resource. 
   */
  public fun methodSettings(vararg methodSettings: Any) {
    _methodSettings.addAll(listOf(*methodSettings))
  }

  /**
   * A map that defines the method settings for a Stage resource.
   *
   * Keys (designated as `/{method_setting_key` below) are method paths defined as
   * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding all
   * methods in the stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings)
   * @param methodSettings A map that defines the method settings for a Stage resource. 
   */
  public fun methodSettings(methodSettings: Collection<Any>) {
    _methodSettings.addAll(methodSettings)
  }

  /**
   * A map that defines the method settings for a Stage resource.
   *
   * Keys (designated as `/{method_setting_key` below) are method paths defined as
   * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding all
   * methods in the stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings)
   * @param methodSettings A map that defines the method settings for a Stage resource. 
   */
  public fun methodSettings(methodSettings: IResolvable) {
    cdkBuilder.methodSettings(methodSettings)
  }

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-restapiid)
   * @param restApiId The string identifier of the associated RestApi. 
   */
  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  /**
   * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a
   * call to API Gateway.
   *
   * Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length
   * is 128 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename)
   * @param stageName The name of the stage is the first path segment in the Uniform Resource
   * Identifier (URI) of a call to API Gateway. 
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  /**
   * The collection of tags.
   *
   * Each tag element is associated with a given resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tags)
   * @param tags The collection of tags. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The collection of tags.
   *
   * Each tag element is associated with a given resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tags)
   * @param tags The collection of tags. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * Specifies whether active tracing with X-ray is enabled for the Stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tracingenabled)
   * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for the Stage. 
   */
  public fun tracingEnabled(tracingEnabled: Boolean) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  /**
   * Specifies whether active tracing with X-ray is enabled for the Stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tracingenabled)
   * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for the Stage. 
   */
  public fun tracingEnabled(tracingEnabled: IResolvable) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  /**
   * A map (string-to-string map) that defines the stage variables, where the variable name is the
   * key and the variable value is the value.
   *
   * Variable names are limited to alphanumeric characters. Values must match the following regular
   * expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables)
   * @param variables A map (string-to-string map) that defines the stage variables, where the
   * variable name is the key and the variable value is the value. 
   */
  public fun variables(variables: Map<String, String>) {
    cdkBuilder.variables(variables)
  }

  /**
   * A map (string-to-string map) that defines the stage variables, where the variable name is the
   * key and the variable value is the value.
   *
   * Variable names are limited to alphanumeric characters. Values must match the following regular
   * expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables)
   * @param variables A map (string-to-string map) that defines the stage variables, where the
   * variable name is the key and the variable value is the value. 
   */
  public fun variables(variables: IResolvable) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnStage {
    if(_methodSettings.isNotEmpty()) cdkBuilder.methodSettings(_methodSettings)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
