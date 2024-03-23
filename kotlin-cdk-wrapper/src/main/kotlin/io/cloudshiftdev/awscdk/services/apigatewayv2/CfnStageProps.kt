@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnStage`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * Object routeSettings;
 * Object stageVariables;
 * Object tags;
 * CfnStageProps cfnStageProps = CfnStageProps.builder()
 * .apiId("apiId")
 * .stageName("stageName")
 * // the properties below are optional
 * .accessLogSettings(AccessLogSettingsProperty.builder()
 * .destinationArn("destinationArn")
 * .format("format")
 * .build())
 * .accessPolicyId("accessPolicyId")
 * .autoDeploy(false)
 * .clientCertificateId("clientCertificateId")
 * .defaultRouteSettings(RouteSettingsProperty.builder()
 * .dataTraceEnabled(false)
 * .detailedMetricsEnabled(false)
 * .loggingLevel("loggingLevel")
 * .throttlingBurstLimit(123)
 * .throttlingRateLimit(123)
 * .build())
 * .deploymentId("deploymentId")
 * .description("description")
 * .routeSettings(routeSettings)
 * .stageVariables(stageVariables)
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html)
 */
public interface CfnStageProps {
  /**
   * Settings for logging access in this stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-accesslogsettings)
   */
  public fun accessLogSettings(): Any? = unwrap(this).getAccessLogSettings()

  /**
   * This parameter is not currently supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-accesspolicyid)
   */
  public fun accessPolicyId(): String? = unwrap(this).getAccessPolicyId()

  /**
   * The API identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-apiid)
   */
  public fun apiId(): String

  /**
   * Specifies whether updates to an API automatically trigger a new deployment.
   *
   * The default value is `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-autodeploy)
   */
  public fun autoDeploy(): Any? = unwrap(this).getAutoDeploy()

  /**
   * The identifier of a client certificate for a `Stage` .
   *
   * Supported only for WebSocket APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-clientcertificateid)
   */
  public fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

  /**
   * The default route settings for the stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-defaultroutesettings)
   */
  public fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

  /**
   * The deployment identifier for the API stage.
   *
   * Can't be updated if `autoDeploy` is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-deploymentid)
   */
  public fun deploymentId(): String? = unwrap(this).getDeploymentId()

  /**
   * The description for the API stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Route settings for the stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-routesettings)
   */
  public fun routeSettings(): Any? = unwrap(this).getRouteSettings()

  /**
   * The stage name.
   *
   * Stage names can contain only alphanumeric characters, hyphens, and underscores, or be
   * `$default` . Maximum length is 128 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagename)
   */
  public fun stageName(): String

  /**
   * A map that defines the stage variables for a `Stage` .
   *
   * Variable names can have alphanumeric and underscore characters, and the values must match
   * [A-Za-z0-9-._~:/?#&amp;=,]+.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagevariables)
   */
  public fun stageVariables(): Any? = unwrap(this).getStageVariables()

  /**
   * The collection of tags.
   *
   * Each tag element is associated with a given resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A builder for [CfnStageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessLogSettings Settings for logging access in this stage.
     */
    public fun accessLogSettings(accessLogSettings: IResolvable)

    /**
     * @param accessLogSettings Settings for logging access in this stage.
     */
    public fun accessLogSettings(accessLogSettings: CfnStage.AccessLogSettingsProperty)

    /**
     * @param accessLogSettings Settings for logging access in this stage.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7416f41264479ac39ac7f9a27eba5cbd7e09dd9ea446a94f39af0b0f6ee067b")
    public
        fun accessLogSettings(accessLogSettings: CfnStage.AccessLogSettingsProperty.Builder.() -> Unit)

    /**
     * @param accessPolicyId This parameter is not currently supported.
     */
    public fun accessPolicyId(accessPolicyId: String)

    /**
     * @param apiId The API identifier. 
     */
    public fun apiId(apiId: String)

    /**
     * @param autoDeploy Specifies whether updates to an API automatically trigger a new deployment.
     * The default value is `false` .
     */
    public fun autoDeploy(autoDeploy: Boolean)

    /**
     * @param autoDeploy Specifies whether updates to an API automatically trigger a new deployment.
     * The default value is `false` .
     */
    public fun autoDeploy(autoDeploy: IResolvable)

    /**
     * @param clientCertificateId The identifier of a client certificate for a `Stage` .
     * Supported only for WebSocket APIs.
     */
    public fun clientCertificateId(clientCertificateId: String)

    /**
     * @param defaultRouteSettings The default route settings for the stage.
     */
    public fun defaultRouteSettings(defaultRouteSettings: IResolvable)

    /**
     * @param defaultRouteSettings The default route settings for the stage.
     */
    public fun defaultRouteSettings(defaultRouteSettings: CfnStage.RouteSettingsProperty)

    /**
     * @param defaultRouteSettings The default route settings for the stage.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0f0b1d1c2e6b3737d7856dd33478a6b74d014f1dde0af4d76e393b21d4956847")
    public
        fun defaultRouteSettings(defaultRouteSettings: CfnStage.RouteSettingsProperty.Builder.() -> Unit)

    /**
     * @param deploymentId The deployment identifier for the API stage.
     * Can't be updated if `autoDeploy` is enabled.
     */
    public fun deploymentId(deploymentId: String)

    /**
     * @param description The description for the API stage.
     */
    public fun description(description: String)

    /**
     * @param routeSettings Route settings for the stage.
     */
    public fun routeSettings(routeSettings: Any)

    /**
     * @param stageName The stage name. 
     * Stage names can contain only alphanumeric characters, hyphens, and underscores, or be
     * `$default` . Maximum length is 128 characters.
     */
    public fun stageName(stageName: String)

    /**
     * @param stageVariables A map that defines the stage variables for a `Stage` .
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * [A-Za-z0-9-._~:/?#&amp;=,]+.
     */
    public fun stageVariables(stageVariables: Any)

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnStageProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnStageProps.builder()

    /**
     * @param accessLogSettings Settings for logging access in this stage.
     */
    override fun accessLogSettings(accessLogSettings: IResolvable) {
      cdkBuilder.accessLogSettings(accessLogSettings.let(IResolvable::unwrap))
    }

    /**
     * @param accessLogSettings Settings for logging access in this stage.
     */
    override fun accessLogSettings(accessLogSettings: CfnStage.AccessLogSettingsProperty) {
      cdkBuilder.accessLogSettings(accessLogSettings.let(CfnStage.AccessLogSettingsProperty::unwrap))
    }

    /**
     * @param accessLogSettings Settings for logging access in this stage.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7416f41264479ac39ac7f9a27eba5cbd7e09dd9ea446a94f39af0b0f6ee067b")
    override
        fun accessLogSettings(accessLogSettings: CfnStage.AccessLogSettingsProperty.Builder.() -> Unit):
        Unit = accessLogSettings(CfnStage.AccessLogSettingsProperty(accessLogSettings))

    /**
     * @param accessPolicyId This parameter is not currently supported.
     */
    override fun accessPolicyId(accessPolicyId: String) {
      cdkBuilder.accessPolicyId(accessPolicyId)
    }

    /**
     * @param apiId The API identifier. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param autoDeploy Specifies whether updates to an API automatically trigger a new deployment.
     * The default value is `false` .
     */
    override fun autoDeploy(autoDeploy: Boolean) {
      cdkBuilder.autoDeploy(autoDeploy)
    }

    /**
     * @param autoDeploy Specifies whether updates to an API automatically trigger a new deployment.
     * The default value is `false` .
     */
    override fun autoDeploy(autoDeploy: IResolvable) {
      cdkBuilder.autoDeploy(autoDeploy.let(IResolvable::unwrap))
    }

    /**
     * @param clientCertificateId The identifier of a client certificate for a `Stage` .
     * Supported only for WebSocket APIs.
     */
    override fun clientCertificateId(clientCertificateId: String) {
      cdkBuilder.clientCertificateId(clientCertificateId)
    }

    /**
     * @param defaultRouteSettings The default route settings for the stage.
     */
    override fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(IResolvable::unwrap))
    }

    /**
     * @param defaultRouteSettings The default route settings for the stage.
     */
    override fun defaultRouteSettings(defaultRouteSettings: CfnStage.RouteSettingsProperty) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(CfnStage.RouteSettingsProperty::unwrap))
    }

    /**
     * @param defaultRouteSettings The default route settings for the stage.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0f0b1d1c2e6b3737d7856dd33478a6b74d014f1dde0af4d76e393b21d4956847")
    override
        fun defaultRouteSettings(defaultRouteSettings: CfnStage.RouteSettingsProperty.Builder.() -> Unit):
        Unit = defaultRouteSettings(CfnStage.RouteSettingsProperty(defaultRouteSettings))

    /**
     * @param deploymentId The deployment identifier for the API stage.
     * Can't be updated if `autoDeploy` is enabled.
     */
    override fun deploymentId(deploymentId: String) {
      cdkBuilder.deploymentId(deploymentId)
    }

    /**
     * @param description The description for the API stage.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param routeSettings Route settings for the stage.
     */
    override fun routeSettings(routeSettings: Any) {
      cdkBuilder.routeSettings(routeSettings)
    }

    /**
     * @param stageName The stage name. 
     * Stage names can contain only alphanumeric characters, hyphens, and underscores, or be
     * `$default` . Maximum length is 128 characters.
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    /**
     * @param stageVariables A map that defines the stage variables for a `Stage` .
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * [A-Za-z0-9-._~:/?#&amp;=,]+.
     */
    override fun stageVariables(stageVariables: Any) {
      cdkBuilder.stageVariables(stageVariables)
    }

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnStageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnStageProps,
  ) : CdkObject(cdkObject), CfnStageProps {
    /**
     * Settings for logging access in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-accesslogsettings)
     */
    override fun accessLogSettings(): Any? = unwrap(this).getAccessLogSettings()

    /**
     * This parameter is not currently supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-accesspolicyid)
     */
    override fun accessPolicyId(): String? = unwrap(this).getAccessPolicyId()

    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * Specifies whether updates to an API automatically trigger a new deployment.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-autodeploy)
     */
    override fun autoDeploy(): Any? = unwrap(this).getAutoDeploy()

    /**
     * The identifier of a client certificate for a `Stage` .
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-clientcertificateid)
     */
    override fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

    /**
     * The default route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-defaultroutesettings)
     */
    override fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

    /**
     * The deployment identifier for the API stage.
     *
     * Can't be updated if `autoDeploy` is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-deploymentid)
     */
    override fun deploymentId(): String? = unwrap(this).getDeploymentId()

    /**
     * The description for the API stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-routesettings)
     */
    override fun routeSettings(): Any? = unwrap(this).getRouteSettings()

    /**
     * The stage name.
     *
     * Stage names can contain only alphanumeric characters, hyphens, and underscores, or be
     * `$default` . Maximum length is 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagename)
     */
    override fun stageName(): String = unwrap(this).getStageName()

    /**
     * A map that defines the stage variables for a `Stage` .
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * [A-Za-z0-9-._~:/?#&amp;=,]+.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagevariables)
     */
    override fun stageVariables(): Any? = unwrap(this).getStageVariables()

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnStageProps):
        CfnStageProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStageProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStageProps):
        software.amazon.awscdk.services.apigatewayv2.CfnStageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnStageProps
  }
}
