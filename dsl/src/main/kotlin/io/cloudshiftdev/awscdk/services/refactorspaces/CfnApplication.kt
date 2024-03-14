package io.cloudshiftdev.awscdk.services.refactorspaces

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.refactorspaces.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The endpoint URL of the Amazon API Gateway proxy.
   */
  public open fun apiGatewayProxy(): Any? = unwrap(this).getApiGatewayProxy()

  /**
   * The endpoint URL of the Amazon API Gateway proxy.
   */
  public open fun apiGatewayProxy(`value`: IResolvable) {
    unwrap(this).setApiGatewayProxy(`value`.let(IResolvable::unwrap))
  }

  /**
   * The endpoint URL of the Amazon API Gateway proxy.
   */
  public open fun apiGatewayProxy(`value`: ApiGatewayProxyInputProperty) {
    unwrap(this).setApiGatewayProxy(`value`.let(ApiGatewayProxyInputProperty::unwrap))
  }

  /**
   * The endpoint URL of the Amazon API Gateway proxy.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5dcff8d68a1d086d00514bbf2c9429309b3723080f1a179a970150407e14d321")
  public open fun apiGatewayProxy(`value`: ApiGatewayProxyInputProperty.Builder.() -> Unit): Unit =
      apiGatewayProxy(ApiGatewayProxyInputProperty(`value`))

  /**
   * The resource ID of the API Gateway for the proxy.
   */
  public open fun attrApiGatewayId(): String = unwrap(this).getAttrApiGatewayId()

  /**
   * The unique identifier of the application.
   */
  public open fun attrApplicationIdentifier(): String = unwrap(this).getAttrApplicationIdentifier()

  /**
   * The Amazon Resource Name (ARN) of the application.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Amazon Resource Name (ARN) of the Network Load Balancer .
   */
  public open fun attrNlbArn(): String = unwrap(this).getAttrNlbArn()

  /**
   * The name of the Network Load Balancer configured by the API Gateway proxy.
   */
  public open fun attrNlbName(): String = unwrap(this).getAttrNlbName()

  /**
   * The endpoint URL of the Amazon API Gateway proxy.
   */
  public open fun attrProxyUrl(): String = unwrap(this).getAttrProxyUrl()

  /**
   * The name of the API Gateway stage.
   *
   * The name defaults to `prod` .
   */
  public open fun attrStageName(): String = unwrap(this).getAttrStageName()

  /**
   * The `VpcLink` ID of the API Gateway proxy.
   */
  public open fun attrVpcLinkId(): String = unwrap(this).getAttrVpcLinkId()

  /**
   * The unique identifier of the environment.
   */
  public open fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

  /**
   * The unique identifier of the environment.
   */
  public open fun environmentIdentifier(`value`: String) {
    unwrap(this).setEnvironmentIdentifier(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the application.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the application.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The proxy type of the proxy created within the application.
   */
  public open fun proxyType(): String = unwrap(this).getProxyType()

  /**
   * The proxy type of the proxy created within the application.
   */
  public open fun proxyType(`value`: String) {
    unwrap(this).setProxyType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags assigned to the application.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags assigned to the application.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags assigned to the application.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the virtual private cloud (VPC).
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The ID of the virtual private cloud (VPC).
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.refactorspaces.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The endpoint URL of the Amazon API Gateway proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-apigatewayproxy)
     * @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy. 
     */
    public fun apiGatewayProxy(apiGatewayProxy: IResolvable)

    /**
     * The endpoint URL of the Amazon API Gateway proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-apigatewayproxy)
     * @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy. 
     */
    public fun apiGatewayProxy(apiGatewayProxy: ApiGatewayProxyInputProperty)

    /**
     * The endpoint URL of the Amazon API Gateway proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-apigatewayproxy)
     * @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82084cfa4d5be34cb317f6744332230060ebd89a2ad16fc185f5ce500b1462d8")
    public fun apiGatewayProxy(apiGatewayProxy: ApiGatewayProxyInputProperty.Builder.() -> Unit)

    /**
     * The unique identifier of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-environmentidentifier)
     * @param environmentIdentifier The unique identifier of the environment. 
     */
    public fun environmentIdentifier(environmentIdentifier: String)

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-name)
     * @param name The name of the application. 
     */
    public fun name(name: String)

    /**
     * The proxy type of the proxy created within the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-proxytype)
     * @param proxyType The proxy type of the proxy created within the application. 
     */
    public fun proxyType(proxyType: String)

    /**
     * The tags assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-tags)
     * @param tags The tags assigned to the application. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-tags)
     * @param tags The tags assigned to the application. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the virtual private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-vpcid)
     * @param vpcId The ID of the virtual private cloud (VPC). 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.refactorspaces.CfnApplication.Builder =
        software.amazon.awscdk.services.refactorspaces.CfnApplication.Builder.create(scope, id)

    /**
     * The endpoint URL of the Amazon API Gateway proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-apigatewayproxy)
     * @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy. 
     */
    override fun apiGatewayProxy(apiGatewayProxy: IResolvable) {
      cdkBuilder.apiGatewayProxy(apiGatewayProxy.let(IResolvable::unwrap))
    }

    /**
     * The endpoint URL of the Amazon API Gateway proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-apigatewayproxy)
     * @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy. 
     */
    override fun apiGatewayProxy(apiGatewayProxy: ApiGatewayProxyInputProperty) {
      cdkBuilder.apiGatewayProxy(apiGatewayProxy.let(ApiGatewayProxyInputProperty::unwrap))
    }

    /**
     * The endpoint URL of the Amazon API Gateway proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-apigatewayproxy)
     * @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82084cfa4d5be34cb317f6744332230060ebd89a2ad16fc185f5ce500b1462d8")
    override fun apiGatewayProxy(apiGatewayProxy: ApiGatewayProxyInputProperty.Builder.() -> Unit):
        Unit = apiGatewayProxy(ApiGatewayProxyInputProperty(apiGatewayProxy))

    /**
     * The unique identifier of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-environmentidentifier)
     * @param environmentIdentifier The unique identifier of the environment. 
     */
    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-name)
     * @param name The name of the application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The proxy type of the proxy created within the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-proxytype)
     * @param proxyType The proxy type of the proxy created within the application. 
     */
    override fun proxyType(proxyType: String) {
      cdkBuilder.proxyType(proxyType)
    }

    /**
     * The tags assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-tags)
     * @param tags The tags assigned to the application. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-tags)
     * @param tags The tags assigned to the application. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the virtual private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-vpcid)
     * @param vpcId The ID of the virtual private cloud (VPC). 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.refactorspaces.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.refactorspaces.CfnApplication = wrapped.cdkObject
  }

  public interface ApiGatewayProxyInputProperty {
    /**
     * The type of endpoint to use for the API Gateway proxy.
     *
     * If no value is specified in the request, the value is set to `REGIONAL` by default.
     *
     * If the value is set to `PRIVATE` in the request, this creates a private API endpoint that is
     * isolated from the public internet. The private endpoint can only be accessed by using Amazon
     * Virtual Private Cloud ( Amazon VPC ) interface endpoints for the Amazon API Gateway that has
     * been granted access. For more information about creating a private connection with Refactor
     * Spaces and interface endpoint ( AWS PrivateLink ) availability, see [Access Refactor Spaces
     * using an interface endpoint ( AWS PrivateLink
     * )](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/userguide/vpc-interface-endpoints.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-application-apigatewayproxyinput.html#cfn-refactorspaces-application-apigatewayproxyinput-endpointtype)
     */
    public fun endpointType(): String? = unwrap(this).getEndpointType()

    /**
     * The name of the API Gateway stage.
     *
     * The name defaults to `prod` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-application-apigatewayproxyinput.html#cfn-refactorspaces-application-apigatewayproxyinput-stagename)
     */
    public fun stageName(): String? = unwrap(this).getStageName()

    /**
     * A builder for [ApiGatewayProxyInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpointType The type of endpoint to use for the API Gateway proxy.
       * If no value is specified in the request, the value is set to `REGIONAL` by default.
       *
       * If the value is set to `PRIVATE` in the request, this creates a private API endpoint that
       * is isolated from the public internet. The private endpoint can only be accessed by using
       * Amazon Virtual Private Cloud ( Amazon VPC ) interface endpoints for the Amazon API Gateway
       * that has been granted access. For more information about creating a private connection with
       * Refactor Spaces and interface endpoint ( AWS PrivateLink ) availability, see [Access Refactor
       * Spaces using an interface endpoint ( AWS PrivateLink
       * )](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/userguide/vpc-interface-endpoints.html)
       * .
       */
      public fun endpointType(endpointType: String)

      /**
       * @param stageName The name of the API Gateway stage.
       * The name defaults to `prod` .
       */
      public fun stageName(stageName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.refactorspaces.CfnApplication.ApiGatewayProxyInputProperty.Builder
          =
          software.amazon.awscdk.services.refactorspaces.CfnApplication.ApiGatewayProxyInputProperty.builder()

      /**
       * @param endpointType The type of endpoint to use for the API Gateway proxy.
       * If no value is specified in the request, the value is set to `REGIONAL` by default.
       *
       * If the value is set to `PRIVATE` in the request, this creates a private API endpoint that
       * is isolated from the public internet. The private endpoint can only be accessed by using
       * Amazon Virtual Private Cloud ( Amazon VPC ) interface endpoints for the Amazon API Gateway
       * that has been granted access. For more information about creating a private connection with
       * Refactor Spaces and interface endpoint ( AWS PrivateLink ) availability, see [Access Refactor
       * Spaces using an interface endpoint ( AWS PrivateLink
       * )](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/userguide/vpc-interface-endpoints.html)
       * .
       */
      override fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
      }

      /**
       * @param stageName The name of the API Gateway stage.
       * The name defaults to `prod` .
       */
      override fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
      }

      public fun build():
          software.amazon.awscdk.services.refactorspaces.CfnApplication.ApiGatewayProxyInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.refactorspaces.CfnApplication.ApiGatewayProxyInputProperty,
    ) : CdkObject(cdkObject), ApiGatewayProxyInputProperty {
      /**
       * The type of endpoint to use for the API Gateway proxy.
       *
       * If no value is specified in the request, the value is set to `REGIONAL` by default.
       *
       * If the value is set to `PRIVATE` in the request, this creates a private API endpoint that
       * is isolated from the public internet. The private endpoint can only be accessed by using
       * Amazon Virtual Private Cloud ( Amazon VPC ) interface endpoints for the Amazon API Gateway
       * that has been granted access. For more information about creating a private connection with
       * Refactor Spaces and interface endpoint ( AWS PrivateLink ) availability, see [Access Refactor
       * Spaces using an interface endpoint ( AWS PrivateLink
       * )](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/userguide/vpc-interface-endpoints.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-application-apigatewayproxyinput.html#cfn-refactorspaces-application-apigatewayproxyinput-endpointtype)
       */
      override fun endpointType(): String? = unwrap(this).getEndpointType()

      /**
       * The name of the API Gateway stage.
       *
       * The name defaults to `prod` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-application-apigatewayproxyinput.html#cfn-refactorspaces-application-apigatewayproxyinput-stagename)
       */
      override fun stageName(): String? = unwrap(this).getStageName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApiGatewayProxyInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnApplication.ApiGatewayProxyInputProperty):
          ApiGatewayProxyInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApiGatewayProxyInputProperty):
          software.amazon.awscdk.services.refactorspaces.CfnApplication.ApiGatewayProxyInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.refactorspaces.CfnApplication.ApiGatewayProxyInputProperty
    }
  }
}
