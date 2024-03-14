package io.cloudshiftdev.awscdk.services.refactorspaces

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

public open class CfnService internal constructor(
  private val cdkObject: software.amazon.awscdk.services.refactorspaces.CfnService,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The unique identifier of the application.
   */
  public open fun applicationIdentifier(): String = unwrap(this).getApplicationIdentifier()

  /**
   * The unique identifier of the application.
   */
  public open fun applicationIdentifier(`value`: String) {
    unwrap(this).setApplicationIdentifier(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the service.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique identifier of the service.
   */
  public open fun attrServiceIdentifier(): String = unwrap(this).getAttrServiceIdentifier()

  /**
   * A description of the service.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the service.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The endpoint type of the service.
   */
  public open fun endpointType(): String = unwrap(this).getEndpointType()

  /**
   * The endpoint type of the service.
   */
  public open fun endpointType(`value`: String) {
    unwrap(this).setEndpointType(`value`)
  }

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
   * A summary of the configuration for the AWS Lambda endpoint type.
   */
  public open fun lambdaEndpoint(): Any? = unwrap(this).getLambdaEndpoint()

  /**
   * A summary of the configuration for the AWS Lambda endpoint type.
   */
  public open fun lambdaEndpoint(`value`: IResolvable) {
    unwrap(this).setLambdaEndpoint(`value`.let(IResolvable::unwrap))
  }

  /**
   * A summary of the configuration for the AWS Lambda endpoint type.
   */
  public open fun lambdaEndpoint(`value`: LambdaEndpointInputProperty) {
    unwrap(this).setLambdaEndpoint(`value`.let(LambdaEndpointInputProperty::unwrap))
  }

  /**
   * A summary of the configuration for the AWS Lambda endpoint type.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f6002f55ad476aecd6fbf6a29161c2db7c50739c600deef6daac469536ee641e")
  public open fun lambdaEndpoint(`value`: LambdaEndpointInputProperty.Builder.() -> Unit): Unit =
      lambdaEndpoint(LambdaEndpointInputProperty(`value`))

  /**
   * The name of the service.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the service.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags assigned to the service.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags assigned to the service.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags assigned to the service.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The summary of the configuration for the URL endpoint type.
   */
  public open fun urlEndpoint(): Any? = unwrap(this).getUrlEndpoint()

  /**
   * The summary of the configuration for the URL endpoint type.
   */
  public open fun urlEndpoint(`value`: IResolvable) {
    unwrap(this).setUrlEndpoint(`value`.let(IResolvable::unwrap))
  }

  /**
   * The summary of the configuration for the URL endpoint type.
   */
  public open fun urlEndpoint(`value`: UrlEndpointInputProperty) {
    unwrap(this).setUrlEndpoint(`value`.let(UrlEndpointInputProperty::unwrap))
  }

  /**
   * The summary of the configuration for the URL endpoint type.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("268c8a2cc69b43900571ec909406ae97c9c8eda0f39ecdcda8f7235d451c1f85")
  public open fun urlEndpoint(`value`: UrlEndpointInputProperty.Builder.() -> Unit): Unit =
      urlEndpoint(UrlEndpointInputProperty(`value`))

  /**
   * The ID of the virtual private cloud (VPC).
   */
  public open fun vpcId(): String? = unwrap(this).getVpcId()

  /**
   * The ID of the virtual private cloud (VPC).
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.refactorspaces.CfnService].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-applicationidentifier)
     * @param applicationIdentifier The unique identifier of the application. 
     */
    public fun applicationIdentifier(applicationIdentifier: String)

    /**
     * A description of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-description)
     * @param description A description of the service. 
     */
    public fun description(description: String)

    /**
     * The endpoint type of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-endpointtype)
     * @param endpointType The endpoint type of the service. 
     */
    public fun endpointType(endpointType: String)

    /**
     * The unique identifier of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-environmentidentifier)
     * @param environmentIdentifier The unique identifier of the environment. 
     */
    public fun environmentIdentifier(environmentIdentifier: String)

    /**
     * A summary of the configuration for the AWS Lambda endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-lambdaendpoint)
     * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type. 
     */
    public fun lambdaEndpoint(lambdaEndpoint: IResolvable)

    /**
     * A summary of the configuration for the AWS Lambda endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-lambdaendpoint)
     * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type. 
     */
    public fun lambdaEndpoint(lambdaEndpoint: LambdaEndpointInputProperty)

    /**
     * A summary of the configuration for the AWS Lambda endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-lambdaendpoint)
     * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6231c439ee4d9e501fb467b9f8e57e8b658fd232b6b74ea00bfbce15775d6ea")
    public fun lambdaEndpoint(lambdaEndpoint: LambdaEndpointInputProperty.Builder.() -> Unit)

    /**
     * The name of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-name)
     * @param name The name of the service. 
     */
    public fun name(name: String)

    /**
     * The tags assigned to the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-tags)
     * @param tags The tags assigned to the service. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags assigned to the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-tags)
     * @param tags The tags assigned to the service. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The summary of the configuration for the URL endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-urlendpoint)
     * @param urlEndpoint The summary of the configuration for the URL endpoint type. 
     */
    public fun urlEndpoint(urlEndpoint: IResolvable)

    /**
     * The summary of the configuration for the URL endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-urlendpoint)
     * @param urlEndpoint The summary of the configuration for the URL endpoint type. 
     */
    public fun urlEndpoint(urlEndpoint: UrlEndpointInputProperty)

    /**
     * The summary of the configuration for the URL endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-urlendpoint)
     * @param urlEndpoint The summary of the configuration for the URL endpoint type. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("039f05d004b16fc1e37d9d89a671b729283050b461d9b1154fec48fd0ce04faa")
    public fun urlEndpoint(urlEndpoint: UrlEndpointInputProperty.Builder.() -> Unit)

    /**
     * The ID of the virtual private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-vpcid)
     * @param vpcId The ID of the virtual private cloud (VPC). 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.refactorspaces.CfnService.Builder =
        software.amazon.awscdk.services.refactorspaces.CfnService.Builder.create(scope, id)

    /**
     * The unique identifier of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-applicationidentifier)
     * @param applicationIdentifier The unique identifier of the application. 
     */
    override fun applicationIdentifier(applicationIdentifier: String) {
      cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    /**
     * A description of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-description)
     * @param description A description of the service. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The endpoint type of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-endpointtype)
     * @param endpointType The endpoint type of the service. 
     */
    override fun endpointType(endpointType: String) {
      cdkBuilder.endpointType(endpointType)
    }

    /**
     * The unique identifier of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-environmentidentifier)
     * @param environmentIdentifier The unique identifier of the environment. 
     */
    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * A summary of the configuration for the AWS Lambda endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-lambdaendpoint)
     * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type. 
     */
    override fun lambdaEndpoint(lambdaEndpoint: IResolvable) {
      cdkBuilder.lambdaEndpoint(lambdaEndpoint.let(IResolvable::unwrap))
    }

    /**
     * A summary of the configuration for the AWS Lambda endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-lambdaendpoint)
     * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type. 
     */
    override fun lambdaEndpoint(lambdaEndpoint: LambdaEndpointInputProperty) {
      cdkBuilder.lambdaEndpoint(lambdaEndpoint.let(LambdaEndpointInputProperty::unwrap))
    }

    /**
     * A summary of the configuration for the AWS Lambda endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-lambdaendpoint)
     * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6231c439ee4d9e501fb467b9f8e57e8b658fd232b6b74ea00bfbce15775d6ea")
    override fun lambdaEndpoint(lambdaEndpoint: LambdaEndpointInputProperty.Builder.() -> Unit):
        Unit = lambdaEndpoint(LambdaEndpointInputProperty(lambdaEndpoint))

    /**
     * The name of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-name)
     * @param name The name of the service. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags assigned to the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-tags)
     * @param tags The tags assigned to the service. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags assigned to the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-tags)
     * @param tags The tags assigned to the service. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The summary of the configuration for the URL endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-urlendpoint)
     * @param urlEndpoint The summary of the configuration for the URL endpoint type. 
     */
    override fun urlEndpoint(urlEndpoint: IResolvable) {
      cdkBuilder.urlEndpoint(urlEndpoint.let(IResolvable::unwrap))
    }

    /**
     * The summary of the configuration for the URL endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-urlendpoint)
     * @param urlEndpoint The summary of the configuration for the URL endpoint type. 
     */
    override fun urlEndpoint(urlEndpoint: UrlEndpointInputProperty) {
      cdkBuilder.urlEndpoint(urlEndpoint.let(UrlEndpointInputProperty::unwrap))
    }

    /**
     * The summary of the configuration for the URL endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-urlendpoint)
     * @param urlEndpoint The summary of the configuration for the URL endpoint type. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("039f05d004b16fc1e37d9d89a671b729283050b461d9b1154fec48fd0ce04faa")
    override fun urlEndpoint(urlEndpoint: UrlEndpointInputProperty.Builder.() -> Unit): Unit =
        urlEndpoint(UrlEndpointInputProperty(urlEndpoint))

    /**
     * The ID of the virtual private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-vpcid)
     * @param vpcId The ID of the virtual private cloud (VPC). 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.refactorspaces.CfnService =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnService):
        CfnService = CfnService(cdkObject)

    internal fun unwrap(wrapped: CfnService):
        software.amazon.awscdk.services.refactorspaces.CfnService = wrapped.cdkObject
  }

  public interface UrlEndpointInputProperty {
    /**
     * The health check URL of the URL endpoint type.
     *
     * If the URL is a public endpoint, the `HealthUrl` must also be a public endpoint. If the URL
     * is a private endpoint inside a virtual private cloud (VPC), the health URL must also be a
     * private endpoint, and the host must be the same as the URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-service-urlendpointinput.html#cfn-refactorspaces-service-urlendpointinput-healthurl)
     */
    public fun healthUrl(): String? = unwrap(this).getHealthUrl()

    /**
     * The URL to route traffic to.
     *
     * The URL must be an [rfc3986-formatted
     * URL](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc3986) . If the host is
     * a domain name, the name must be resolvable over the public internet. If the scheme is `https` ,
     * the top level domain of the host must be listed in the [IANA root zone
     * database](https://docs.aws.amazon.com/https://www.iana.org/domains/root/db) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-service-urlendpointinput.html#cfn-refactorspaces-service-urlendpointinput-url)
     */
    public fun url(): String

    /**
     * A builder for [UrlEndpointInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param healthUrl The health check URL of the URL endpoint type.
       * If the URL is a public endpoint, the `HealthUrl` must also be a public endpoint. If the URL
       * is a private endpoint inside a virtual private cloud (VPC), the health URL must also be a
       * private endpoint, and the host must be the same as the URL.
       */
      public fun healthUrl(healthUrl: String)

      /**
       * @param url The URL to route traffic to. 
       * The URL must be an [rfc3986-formatted
       * URL](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc3986) . If the host
       * is a domain name, the name must be resolvable over the public internet. If the scheme is
       * `https` , the top level domain of the host must be listed in the [IANA root zone
       * database](https://docs.aws.amazon.com/https://www.iana.org/domains/root/db) .
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.refactorspaces.CfnService.UrlEndpointInputProperty.Builder
          =
          software.amazon.awscdk.services.refactorspaces.CfnService.UrlEndpointInputProperty.builder()

      /**
       * @param healthUrl The health check URL of the URL endpoint type.
       * If the URL is a public endpoint, the `HealthUrl` must also be a public endpoint. If the URL
       * is a private endpoint inside a virtual private cloud (VPC), the health URL must also be a
       * private endpoint, and the host must be the same as the URL.
       */
      override fun healthUrl(healthUrl: String) {
        cdkBuilder.healthUrl(healthUrl)
      }

      /**
       * @param url The URL to route traffic to. 
       * The URL must be an [rfc3986-formatted
       * URL](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc3986) . If the host
       * is a domain name, the name must be resolvable over the public internet. If the scheme is
       * `https` , the top level domain of the host must be listed in the [IANA root zone
       * database](https://docs.aws.amazon.com/https://www.iana.org/domains/root/db) .
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.refactorspaces.CfnService.UrlEndpointInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.refactorspaces.CfnService.UrlEndpointInputProperty,
    ) : UrlEndpointInputProperty {
      /**
       * The health check URL of the URL endpoint type.
       *
       * If the URL is a public endpoint, the `HealthUrl` must also be a public endpoint. If the URL
       * is a private endpoint inside a virtual private cloud (VPC), the health URL must also be a
       * private endpoint, and the host must be the same as the URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-service-urlendpointinput.html#cfn-refactorspaces-service-urlendpointinput-healthurl)
       */
      override fun healthUrl(): String? = unwrap(this).getHealthUrl()

      /**
       * The URL to route traffic to.
       *
       * The URL must be an [rfc3986-formatted
       * URL](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc3986) . If the host
       * is a domain name, the name must be resolvable over the public internet. If the scheme is
       * `https` , the top level domain of the host must be listed in the [IANA root zone
       * database](https://docs.aws.amazon.com/https://www.iana.org/domains/root/db) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-service-urlendpointinput.html#cfn-refactorspaces-service-urlendpointinput-url)
       */
      override fun url(): String = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UrlEndpointInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnService.UrlEndpointInputProperty):
          UrlEndpointInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UrlEndpointInputProperty):
          software.amazon.awscdk.services.refactorspaces.CfnService.UrlEndpointInputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LambdaEndpointInputProperty {
    /**
     * The Amazon Resource Name (ARN) of the Lambda function or alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-service-lambdaendpointinput.html#cfn-refactorspaces-service-lambdaendpointinput-arn)
     */
    public fun arn(): String

    /**
     * A builder for [LambdaEndpointInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The Amazon Resource Name (ARN) of the Lambda function or alias. 
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.refactorspaces.CfnService.LambdaEndpointInputProperty.Builder
          =
          software.amazon.awscdk.services.refactorspaces.CfnService.LambdaEndpointInputProperty.builder()

      /**
       * @param arn The Amazon Resource Name (ARN) of the Lambda function or alias. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.refactorspaces.CfnService.LambdaEndpointInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.refactorspaces.CfnService.LambdaEndpointInputProperty,
    ) : LambdaEndpointInputProperty {
      /**
       * The Amazon Resource Name (ARN) of the Lambda function or alias.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-service-lambdaendpointinput.html#cfn-refactorspaces-service-lambdaendpointinput-arn)
       */
      override fun arn(): String = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaEndpointInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnService.LambdaEndpointInputProperty):
          LambdaEndpointInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaEndpointInputProperty):
          software.amazon.awscdk.services.refactorspaces.CfnService.LambdaEndpointInputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
