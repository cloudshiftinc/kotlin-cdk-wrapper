@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGatewayV2::Stage` resource specifies a stage for an API.
 *
 * Each stage is a named reference to a deployment of the API and is made available for client
 * applications to call. To learn more, see [Working with stages for HTTP
 * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-stages.html) and [Deploy
 * a WebSocket API in API
 * Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-set-up-websocket-deployment.html)
 * .
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
 * CfnStage cfnStage = CfnStage.Builder.create(this, "MyCfnStage")
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
public open class CfnStage(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnStage,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStageProps,
  ) :
      this(software.amazon.awscdk.services.apigatewayv2.CfnStage(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStageProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStageProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStageProps(props)
  )

  /**
   * Settings for logging access in this stage.
   */
  public open fun accessLogSettings(): Any? = unwrap(this).getAccessLogSettings()

  /**
   * Settings for logging access in this stage.
   */
  public open fun accessLogSettings(`value`: IResolvable) {
    unwrap(this).setAccessLogSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Settings for logging access in this stage.
   */
  public open fun accessLogSettings(`value`: AccessLogSettingsProperty) {
    unwrap(this).setAccessLogSettings(`value`.let(AccessLogSettingsProperty.Companion::unwrap))
  }

  /**
   * Settings for logging access in this stage.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("96b519f37c351b900bbc8d823d89468d6f70799df8d8e0169f1ce73c47fb2cef")
  public open fun accessLogSettings(`value`: AccessLogSettingsProperty.Builder.() -> Unit): Unit =
      accessLogSettings(AccessLogSettingsProperty(`value`))

  /**
   * This parameter is not currently supported.
   */
  public open fun accessPolicyId(): String? = unwrap(this).getAccessPolicyId()

  /**
   * This parameter is not currently supported.
   */
  public open fun accessPolicyId(`value`: String) {
    unwrap(this).setAccessPolicyId(`value`)
  }

  /**
   * The API identifier.
   */
  public open fun apiId(): String = unwrap(this).getApiId()

  /**
   * The API identifier.
   */
  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  /**
   * The identifier.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Specifies whether updates to an API automatically trigger a new deployment.
   */
  public open fun autoDeploy(): Any? = unwrap(this).getAutoDeploy()

  /**
   * Specifies whether updates to an API automatically trigger a new deployment.
   */
  public open fun autoDeploy(`value`: Boolean) {
    unwrap(this).setAutoDeploy(`value`)
  }

  /**
   * Specifies whether updates to an API automatically trigger a new deployment.
   */
  public open fun autoDeploy(`value`: IResolvable) {
    unwrap(this).setAutoDeploy(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The identifier of a client certificate for a `Stage` .
   */
  public open fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

  /**
   * The identifier of a client certificate for a `Stage` .
   */
  public open fun clientCertificateId(`value`: String) {
    unwrap(this).setClientCertificateId(`value`)
  }

  /**
   * The default route settings for the stage.
   */
  public open fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

  /**
   * The default route settings for the stage.
   */
  public open fun defaultRouteSettings(`value`: IResolvable) {
    unwrap(this).setDefaultRouteSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The default route settings for the stage.
   */
  public open fun defaultRouteSettings(`value`: RouteSettingsProperty) {
    unwrap(this).setDefaultRouteSettings(`value`.let(RouteSettingsProperty.Companion::unwrap))
  }

  /**
   * The default route settings for the stage.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45d547b059de0befc3f7079840485becb528010646ece812662d2a7458dab8d8")
  public open fun defaultRouteSettings(`value`: RouteSettingsProperty.Builder.() -> Unit): Unit =
      defaultRouteSettings(RouteSettingsProperty(`value`))

  /**
   * The deployment identifier for the API stage.
   */
  public open fun deploymentId(): String? = unwrap(this).getDeploymentId()

  /**
   * The deployment identifier for the API stage.
   */
  public open fun deploymentId(`value`: String) {
    unwrap(this).setDeploymentId(`value`)
  }

  /**
   * The description for the API stage.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description for the API stage.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Route settings for the stage.
   */
  public open fun routeSettings(): Any? = unwrap(this).getRouteSettings()

  /**
   * Route settings for the stage.
   */
  public open fun routeSettings(`value`: Any) {
    unwrap(this).setRouteSettings(`value`)
  }

  /**
   * The stage name.
   */
  public open fun stageName(): String = unwrap(this).getStageName()

  /**
   * The stage name.
   */
  public open fun stageName(`value`: String) {
    unwrap(this).setStageName(`value`)
  }

  /**
   * A map that defines the stage variables for a `Stage` .
   */
  public open fun stageVariables(): Any? = unwrap(this).getStageVariables()

  /**
   * A map that defines the stage variables for a `Stage` .
   */
  public open fun stageVariables(`value`: Any) {
    unwrap(this).setStageVariables(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The collection of tags.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * The collection of tags.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.CfnStage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Settings for logging access in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-accesslogsettings)
     * @param accessLogSettings Settings for logging access in this stage. 
     */
    public fun accessLogSettings(accessLogSettings: IResolvable)

    /**
     * Settings for logging access in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-accesslogsettings)
     * @param accessLogSettings Settings for logging access in this stage. 
     */
    public fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty)

    /**
     * Settings for logging access in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-accesslogsettings)
     * @param accessLogSettings Settings for logging access in this stage. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a58ef6b84df182458625ad5f5f83d70249107a2184b05370a82781dc33fec2d1")
    public fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty.Builder.() -> Unit)

    /**
     * This parameter is not currently supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-accesspolicyid)
     * @param accessPolicyId This parameter is not currently supported. 
     */
    public fun accessPolicyId(accessPolicyId: String)

    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-apiid)
     * @param apiId The API identifier. 
     */
    public fun apiId(apiId: String)

    /**
     * Specifies whether updates to an API automatically trigger a new deployment.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-autodeploy)
     * @param autoDeploy Specifies whether updates to an API automatically trigger a new deployment.
     * 
     */
    public fun autoDeploy(autoDeploy: Boolean)

    /**
     * Specifies whether updates to an API automatically trigger a new deployment.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-autodeploy)
     * @param autoDeploy Specifies whether updates to an API automatically trigger a new deployment.
     * 
     */
    public fun autoDeploy(autoDeploy: IResolvable)

    /**
     * The identifier of a client certificate for a `Stage` .
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-clientcertificateid)
     * @param clientCertificateId The identifier of a client certificate for a `Stage` . 
     */
    public fun clientCertificateId(clientCertificateId: String)

    /**
     * The default route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-defaultroutesettings)
     * @param defaultRouteSettings The default route settings for the stage. 
     */
    public fun defaultRouteSettings(defaultRouteSettings: IResolvable)

    /**
     * The default route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-defaultroutesettings)
     * @param defaultRouteSettings The default route settings for the stage. 
     */
    public fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty)

    /**
     * The default route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-defaultroutesettings)
     * @param defaultRouteSettings The default route settings for the stage. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee5d80c6370f78f22f429a8ee919098e4cc1e9bd6b3678cd5eb41fbaad58f70c")
    public fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty.Builder.() -> Unit)

    /**
     * The deployment identifier for the API stage.
     *
     * Can't be updated if `autoDeploy` is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-deploymentid)
     * @param deploymentId The deployment identifier for the API stage. 
     */
    public fun deploymentId(deploymentId: String)

    /**
     * The description for the API stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-description)
     * @param description The description for the API stage. 
     */
    public fun description(description: String)

    /**
     * Route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-routesettings)
     * @param routeSettings Route settings for the stage. 
     */
    public fun routeSettings(routeSettings: Any)

    /**
     * The stage name.
     *
     * Stage names can contain only alphanumeric characters, hyphens, and underscores, or be
     * `$default` . Maximum length is 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagename)
     * @param stageName The stage name. 
     */
    public fun stageName(stageName: String)

    /**
     * A map that defines the stage variables for a `Stage` .
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * [A-Za-z0-9-._~:/?#&amp;=,]+.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagevariables)
     * @param stageVariables A map that defines the stage variables for a `Stage` . 
     */
    public fun stageVariables(stageVariables: Any)

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-tags)
     * @param tags The collection of tags. 
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnStage.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnStage.Builder.create(scope, id)

    /**
     * Settings for logging access in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-accesslogsettings)
     * @param accessLogSettings Settings for logging access in this stage. 
     */
    override fun accessLogSettings(accessLogSettings: IResolvable) {
      cdkBuilder.accessLogSettings(accessLogSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * Settings for logging access in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-accesslogsettings)
     * @param accessLogSettings Settings for logging access in this stage. 
     */
    override fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty) {
      cdkBuilder.accessLogSettings(accessLogSettings.let(AccessLogSettingsProperty.Companion::unwrap))
    }

    /**
     * Settings for logging access in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-accesslogsettings)
     * @param accessLogSettings Settings for logging access in this stage. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a58ef6b84df182458625ad5f5f83d70249107a2184b05370a82781dc33fec2d1")
    override fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty.Builder.() -> Unit):
        Unit = accessLogSettings(AccessLogSettingsProperty(accessLogSettings))

    /**
     * This parameter is not currently supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-accesspolicyid)
     * @param accessPolicyId This parameter is not currently supported. 
     */
    override fun accessPolicyId(accessPolicyId: String) {
      cdkBuilder.accessPolicyId(accessPolicyId)
    }

    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-apiid)
     * @param apiId The API identifier. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * Specifies whether updates to an API automatically trigger a new deployment.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-autodeploy)
     * @param autoDeploy Specifies whether updates to an API automatically trigger a new deployment.
     * 
     */
    override fun autoDeploy(autoDeploy: Boolean) {
      cdkBuilder.autoDeploy(autoDeploy)
    }

    /**
     * Specifies whether updates to an API automatically trigger a new deployment.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-autodeploy)
     * @param autoDeploy Specifies whether updates to an API automatically trigger a new deployment.
     * 
     */
    override fun autoDeploy(autoDeploy: IResolvable) {
      cdkBuilder.autoDeploy(autoDeploy.let(IResolvable.Companion::unwrap))
    }

    /**
     * The identifier of a client certificate for a `Stage` .
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-clientcertificateid)
     * @param clientCertificateId The identifier of a client certificate for a `Stage` . 
     */
    override fun clientCertificateId(clientCertificateId: String) {
      cdkBuilder.clientCertificateId(clientCertificateId)
    }

    /**
     * The default route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-defaultroutesettings)
     * @param defaultRouteSettings The default route settings for the stage. 
     */
    override fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * The default route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-defaultroutesettings)
     * @param defaultRouteSettings The default route settings for the stage. 
     */
    override fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(RouteSettingsProperty.Companion::unwrap))
    }

    /**
     * The default route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-defaultroutesettings)
     * @param defaultRouteSettings The default route settings for the stage. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee5d80c6370f78f22f429a8ee919098e4cc1e9bd6b3678cd5eb41fbaad58f70c")
    override
        fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty.Builder.() -> Unit):
        Unit = defaultRouteSettings(RouteSettingsProperty(defaultRouteSettings))

    /**
     * The deployment identifier for the API stage.
     *
     * Can't be updated if `autoDeploy` is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-deploymentid)
     * @param deploymentId The deployment identifier for the API stage. 
     */
    override fun deploymentId(deploymentId: String) {
      cdkBuilder.deploymentId(deploymentId)
    }

    /**
     * The description for the API stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-description)
     * @param description The description for the API stage. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-routesettings)
     * @param routeSettings Route settings for the stage. 
     */
    override fun routeSettings(routeSettings: Any) {
      cdkBuilder.routeSettings(routeSettings)
    }

    /**
     * The stage name.
     *
     * Stage names can contain only alphanumeric characters, hyphens, and underscores, or be
     * `$default` . Maximum length is 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagename)
     * @param stageName The stage name. 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    /**
     * A map that defines the stage variables for a `Stage` .
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * [A-Za-z0-9-._~:/?#&amp;=,]+.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagevariables)
     * @param stageVariables A map that defines the stage variables for a `Stage` . 
     */
    override fun stageVariables(stageVariables: Any) {
      cdkBuilder.stageVariables(stageVariables)
    }

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-tags)
     * @param tags The collection of tags. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnStage = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigatewayv2.CfnStage.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnStage): CfnStage =
        CfnStage(cdkObject)

    internal fun unwrap(wrapped: CfnStage): software.amazon.awscdk.services.apigatewayv2.CfnStage =
        wrapped.cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnStage
  }

  /**
   * Settings for logging access in a stage.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * AccessLogSettingsProperty accessLogSettingsProperty = AccessLogSettingsProperty.builder()
   * .destinationArn("destinationArn")
   * .format("format")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-accesslogsettings.html)
   */
  public interface AccessLogSettingsProperty {
    /**
     * The ARN of the CloudWatch Logs log group to receive access logs.
     *
     * This parameter is required to enable access logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-accesslogsettings.html#cfn-apigatewayv2-stage-accesslogsettings-destinationarn)
     */
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    /**
     * A single line format of the access logs of data, as specified by selected $context variables.
     *
     * The format must include at least $context.requestId. This parameter is required to enable
     * access logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-accesslogsettings.html#cfn-apigatewayv2-stage-accesslogsettings-format)
     */
    public fun format(): String? = unwrap(this).getFormat()

    /**
     * A builder for [AccessLogSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationArn The ARN of the CloudWatch Logs log group to receive access logs.
       * This parameter is required to enable access logging.
       */
      public fun destinationArn(destinationArn: String)

      /**
       * @param format A single line format of the access logs of data, as specified by selected
       * $context variables.
       * The format must include at least $context.requestId. This parameter is required to enable
       * access logging.
       */
      public fun format(format: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnStage.AccessLogSettingsProperty.Builder =
          software.amazon.awscdk.services.apigatewayv2.CfnStage.AccessLogSettingsProperty.builder()

      /**
       * @param destinationArn The ARN of the CloudWatch Logs log group to receive access logs.
       * This parameter is required to enable access logging.
       */
      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      /**
       * @param format A single line format of the access logs of data, as specified by selected
       * $context variables.
       * The format must include at least $context.requestId. This parameter is required to enable
       * access logging.
       */
      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnStage.AccessLogSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnStage.AccessLogSettingsProperty,
    ) : CdkObject(cdkObject), AccessLogSettingsProperty {
      /**
       * The ARN of the CloudWatch Logs log group to receive access logs.
       *
       * This parameter is required to enable access logging.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-accesslogsettings.html#cfn-apigatewayv2-stage-accesslogsettings-destinationarn)
       */
      override fun destinationArn(): String? = unwrap(this).getDestinationArn()

      /**
       * A single line format of the access logs of data, as specified by selected $context
       * variables.
       *
       * The format must include at least $context.requestId. This parameter is required to enable
       * access logging.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-accesslogsettings.html#cfn-apigatewayv2-stage-accesslogsettings-format)
       */
      override fun format(): String? = unwrap(this).getFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnStage.AccessLogSettingsProperty):
          AccessLogSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccessLogSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessLogSettingsProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnStage.AccessLogSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnStage.AccessLogSettingsProperty
    }
  }

  /**
   * Represents a collection of route settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * RouteSettingsProperty routeSettingsProperty = RouteSettingsProperty.builder()
   * .dataTraceEnabled(false)
   * .detailedMetricsEnabled(false)
   * .loggingLevel("loggingLevel")
   * .throttlingBurstLimit(123)
   * .throttlingRateLimit(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html)
   */
  public interface RouteSettingsProperty {
    /**
     * Specifies whether ( `true` ) or not ( `false` ) data trace logging is enabled for this route.
     *
     * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
     * WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html#cfn-apigatewayv2-stage-routesettings-datatraceenabled)
     */
    public fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

    /**
     * Specifies whether detailed metrics are enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html#cfn-apigatewayv2-stage-routesettings-detailedmetricsenabled)
     */
    public fun detailedMetricsEnabled(): Any? = unwrap(this).getDetailedMetricsEnabled()

    /**
     * Specifies the logging level for this route: `INFO` , `ERROR` , or `OFF` .
     *
     * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
     * WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html#cfn-apigatewayv2-stage-routesettings-logginglevel)
     */
    public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    /**
     * Specifies the throttling burst limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html#cfn-apigatewayv2-stage-routesettings-throttlingburstlimit)
     */
    public fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    /**
     * Specifies the throttling rate limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html#cfn-apigatewayv2-stage-routesettings-throttlingratelimit)
     */
    public fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

    /**
     * A builder for [RouteSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataTraceEnabled Specifies whether ( `true` ) or not ( `false` ) data trace logging
       * is enabled for this route.
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       */
      public fun dataTraceEnabled(dataTraceEnabled: Boolean)

      /**
       * @param dataTraceEnabled Specifies whether ( `true` ) or not ( `false` ) data trace logging
       * is enabled for this route.
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       */
      public fun dataTraceEnabled(dataTraceEnabled: IResolvable)

      /**
       * @param detailedMetricsEnabled Specifies whether detailed metrics are enabled.
       */
      public fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean)

      /**
       * @param detailedMetricsEnabled Specifies whether detailed metrics are enabled.
       */
      public fun detailedMetricsEnabled(detailedMetricsEnabled: IResolvable)

      /**
       * @param loggingLevel Specifies the logging level for this route: `INFO` , `ERROR` , or `OFF`
       * .
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       */
      public fun loggingLevel(loggingLevel: String)

      /**
       * @param throttlingBurstLimit Specifies the throttling burst limit.
       */
      public fun throttlingBurstLimit(throttlingBurstLimit: Number)

      /**
       * @param throttlingRateLimit Specifies the throttling rate limit.
       */
      public fun throttlingRateLimit(throttlingRateLimit: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnStage.RouteSettingsProperty.Builder =
          software.amazon.awscdk.services.apigatewayv2.CfnStage.RouteSettingsProperty.builder()

      /**
       * @param dataTraceEnabled Specifies whether ( `true` ) or not ( `false` ) data trace logging
       * is enabled for this route.
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       */
      override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled)
      }

      /**
       * @param dataTraceEnabled Specifies whether ( `true` ) or not ( `false` ) data trace logging
       * is enabled for this route.
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       */
      override fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param detailedMetricsEnabled Specifies whether detailed metrics are enabled.
       */
      override fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean) {
        cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled)
      }

      /**
       * @param detailedMetricsEnabled Specifies whether detailed metrics are enabled.
       */
      override fun detailedMetricsEnabled(detailedMetricsEnabled: IResolvable) {
        cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param loggingLevel Specifies the logging level for this route: `INFO` , `ERROR` , or `OFF`
       * .
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       */
      override fun loggingLevel(loggingLevel: String) {
        cdkBuilder.loggingLevel(loggingLevel)
      }

      /**
       * @param throttlingBurstLimit Specifies the throttling burst limit.
       */
      override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
        cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
      }

      /**
       * @param throttlingRateLimit Specifies the throttling rate limit.
       */
      override fun throttlingRateLimit(throttlingRateLimit: Number) {
        cdkBuilder.throttlingRateLimit(throttlingRateLimit)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnStage.RouteSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnStage.RouteSettingsProperty,
    ) : CdkObject(cdkObject), RouteSettingsProperty {
      /**
       * Specifies whether ( `true` ) or not ( `false` ) data trace logging is enabled for this
       * route.
       *
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html#cfn-apigatewayv2-stage-routesettings-datatraceenabled)
       */
      override fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

      /**
       * Specifies whether detailed metrics are enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html#cfn-apigatewayv2-stage-routesettings-detailedmetricsenabled)
       */
      override fun detailedMetricsEnabled(): Any? = unwrap(this).getDetailedMetricsEnabled()

      /**
       * Specifies the logging level for this route: `INFO` , `ERROR` , or `OFF` .
       *
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html#cfn-apigatewayv2-stage-routesettings-logginglevel)
       */
      override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

      /**
       * Specifies the throttling burst limit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html#cfn-apigatewayv2-stage-routesettings-throttlingburstlimit)
       */
      override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

      /**
       * Specifies the throttling rate limit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html#cfn-apigatewayv2-stage-routesettings-throttlingratelimit)
       */
      override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RouteSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnStage.RouteSettingsProperty):
          RouteSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? RouteSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RouteSettingsProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnStage.RouteSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnStage.RouteSettingsProperty
    }
  }
}
