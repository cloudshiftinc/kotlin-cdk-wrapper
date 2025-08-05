@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a domain configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnDomainConfiguration cfnDomainConfiguration = CfnDomainConfiguration.Builder.create(this,
 * "MyCfnDomainConfiguration")
 * .applicationProtocol("applicationProtocol")
 * .authenticationType("authenticationType")
 * .authorizerConfig(AuthorizerConfigProperty.builder()
 * .allowAuthorizerOverride(false)
 * .defaultAuthorizerName("defaultAuthorizerName")
 * .build())
 * .clientCertificateConfig(ClientCertificateConfigProperty.builder()
 * .clientCertificateCallbackArn("clientCertificateCallbackArn")
 * .build())
 * .domainConfigurationName("domainConfigurationName")
 * .domainConfigurationStatus("domainConfigurationStatus")
 * .domainName("domainName")
 * .serverCertificateArns(List.of("serverCertificateArns"))
 * .serverCertificateConfig(ServerCertificateConfigProperty.builder()
 * .enableOcspCheck(false)
 * .ocspAuthorizedResponderArn("ocspAuthorizedResponderArn")
 * .ocspLambdaArn("ocspLambdaArn")
 * .build())
 * .serviceType("serviceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tlsConfig(TlsConfigProperty.builder()
 * .securityPolicy("securityPolicy")
 * .build())
 * .validationCertificateArn("validationCertificateArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html)
 */
public open class CfnDomainConfiguration(
  cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iot.CfnDomainConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnDomainConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDomainConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDomainConfigurationProps(props)
  )

  /**
   * An enumerated string that speciﬁes the application-layer protocol.
   */
  public open fun applicationProtocol(): String? = unwrap(this).getApplicationProtocol()

  /**
   * An enumerated string that speciﬁes the application-layer protocol.
   */
  public open fun applicationProtocol(`value`: String) {
    unwrap(this).setApplicationProtocol(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the domain configuration.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The type of service delivered by the domain.
   */
  public open fun attrDomainType(): String = unwrap(this).getAttrDomainType()

  /**
   * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake.
   *
   * Currently you can specify only one certificate ARN. This value is not required for AWS -managed
   * domains.
   */
  public open fun attrServerCertificates(): IResolvable =
      unwrap(this).getAttrServerCertificates().let(IResolvable::wrap)

  /**
   * An enumerated string that speciﬁes the authentication type.
   */
  public open fun authenticationType(): String? = unwrap(this).getAuthenticationType()

  /**
   * An enumerated string that speciﬁes the authentication type.
   */
  public open fun authenticationType(`value`: String) {
    unwrap(this).setAuthenticationType(`value`)
  }

  /**
   * An object that specifies the authorization service for a domain.
   */
  public open fun authorizerConfig(): Any? = unwrap(this).getAuthorizerConfig()

  /**
   * An object that specifies the authorization service for a domain.
   */
  public open fun authorizerConfig(`value`: IResolvable) {
    unwrap(this).setAuthorizerConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that specifies the authorization service for a domain.
   */
  public open fun authorizerConfig(`value`: AuthorizerConfigProperty) {
    unwrap(this).setAuthorizerConfig(`value`.let(AuthorizerConfigProperty.Companion::unwrap))
  }

  /**
   * An object that specifies the authorization service for a domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7068dcfe8a08dae5b2176eb90e7443672ed814ab8837b883ca3f48e4a9afd32e")
  public open fun authorizerConfig(`value`: AuthorizerConfigProperty.Builder.() -> Unit): Unit =
      authorizerConfig(AuthorizerConfigProperty(`value`))

  /**
   * An object that speciﬁes the client certificate conﬁguration for a domain.
   */
  public open fun clientCertificateConfig(): Any? = unwrap(this).getClientCertificateConfig()

  /**
   * An object that speciﬁes the client certificate conﬁguration for a domain.
   */
  public open fun clientCertificateConfig(`value`: IResolvable) {
    unwrap(this).setClientCertificateConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that speciﬁes the client certificate conﬁguration for a domain.
   */
  public open fun clientCertificateConfig(`value`: ClientCertificateConfigProperty) {
    unwrap(this).setClientCertificateConfig(`value`.let(ClientCertificateConfigProperty.Companion::unwrap))
  }

  /**
   * An object that speciﬁes the client certificate conﬁguration for a domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6dc96da3e800d04772f5e9733e2ab3d6a15c42df3351601a515c17e3fb8827d6")
  public open
      fun clientCertificateConfig(`value`: ClientCertificateConfigProperty.Builder.() -> Unit): Unit
      = clientCertificateConfig(ClientCertificateConfigProperty(`value`))

  /**
   * The name of the domain configuration.
   */
  public open fun domainConfigurationName(): String? = unwrap(this).getDomainConfigurationName()

  /**
   * The name of the domain configuration.
   */
  public open fun domainConfigurationName(`value`: String) {
    unwrap(this).setDomainConfigurationName(`value`)
  }

  /**
   * The status to which the domain configuration should be updated.
   */
  public open fun domainConfigurationStatus(): String? = unwrap(this).getDomainConfigurationStatus()

  /**
   * The status to which the domain configuration should be updated.
   */
  public open fun domainConfigurationStatus(`value`: String) {
    unwrap(this).setDomainConfigurationStatus(`value`)
  }

  /**
   * The name of the domain.
   */
  public open fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * The name of the domain.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
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
   * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake.
   */
  public open fun serverCertificateArns(): List<String> = unwrap(this).getServerCertificateArns() ?:
      emptyList()

  /**
   * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake.
   */
  public open fun serverCertificateArns(`value`: List<String>) {
    unwrap(this).setServerCertificateArns(`value`)
  }

  /**
   * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake.
   */
  public open fun serverCertificateArns(vararg `value`: String): Unit =
      serverCertificateArns(`value`.toList())

  /**
   * The server certificate configuration.
   */
  public open fun serverCertificateConfig(): Any? = unwrap(this).getServerCertificateConfig()

  /**
   * The server certificate configuration.
   */
  public open fun serverCertificateConfig(`value`: IResolvable) {
    unwrap(this).setServerCertificateConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The server certificate configuration.
   */
  public open fun serverCertificateConfig(`value`: ServerCertificateConfigProperty) {
    unwrap(this).setServerCertificateConfig(`value`.let(ServerCertificateConfigProperty.Companion::unwrap))
  }

  /**
   * The server certificate configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("61b5c03c59bdca05b84baed94e338847989f1969a636792a06676085707e4803")
  public open
      fun serverCertificateConfig(`value`: ServerCertificateConfigProperty.Builder.() -> Unit): Unit
      = serverCertificateConfig(ServerCertificateConfigProperty(`value`))

  /**
   * The type of service delivered by the endpoint.
   */
  public open fun serviceType(): String? = unwrap(this).getServiceType()

  /**
   * The type of service delivered by the endpoint.
   */
  public open fun serviceType(`value`: String) {
    unwrap(this).setServiceType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata which can be used to manage the domain configuration.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata which can be used to manage the domain configuration.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata which can be used to manage the domain configuration.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * An object that specifies the TLS configuration for a domain.
   */
  public open fun tlsConfig(): Any? = unwrap(this).getTlsConfig()

  /**
   * An object that specifies the TLS configuration for a domain.
   */
  public open fun tlsConfig(`value`: IResolvable) {
    unwrap(this).setTlsConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that specifies the TLS configuration for a domain.
   */
  public open fun tlsConfig(`value`: TlsConfigProperty) {
    unwrap(this).setTlsConfig(`value`.let(TlsConfigProperty.Companion::unwrap))
  }

  /**
   * An object that specifies the TLS configuration for a domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6863b4544c897f9b0ea775c9df9b4a08c0ef9741195bed605074ff0fe5e73c81")
  public open fun tlsConfig(`value`: TlsConfigProperty.Builder.() -> Unit): Unit =
      tlsConfig(TlsConfigProperty(`value`))

  /**
   * The certificate used to validate the server certificate and prove domain name ownership.
   */
  public open fun validationCertificateArn(): String? = unwrap(this).getValidationCertificateArn()

  /**
   * The certificate used to validate the server certificate and prove domain name ownership.
   */
  public open fun validationCertificateArn(`value`: String) {
    unwrap(this).setValidationCertificateArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnDomainConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An enumerated string that speciﬁes the application-layer protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-applicationprotocol)
     * @param applicationProtocol An enumerated string that speciﬁes the application-layer protocol.
     * 
     */
    public fun applicationProtocol(applicationProtocol: String)

    /**
     * An enumerated string that speciﬁes the authentication type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-authenticationtype)
     * @param authenticationType An enumerated string that speciﬁes the authentication type. 
     */
    public fun authenticationType(authenticationType: String)

    /**
     * An object that specifies the authorization service for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-authorizerconfig)
     * @param authorizerConfig An object that specifies the authorization service for a domain. 
     */
    public fun authorizerConfig(authorizerConfig: IResolvable)

    /**
     * An object that specifies the authorization service for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-authorizerconfig)
     * @param authorizerConfig An object that specifies the authorization service for a domain. 
     */
    public fun authorizerConfig(authorizerConfig: AuthorizerConfigProperty)

    /**
     * An object that specifies the authorization service for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-authorizerconfig)
     * @param authorizerConfig An object that specifies the authorization service for a domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce4759ae749a4e31a1c4dd04b7986e8d3ab600f3d189c96aff7f6df92ee08972")
    public fun authorizerConfig(authorizerConfig: AuthorizerConfigProperty.Builder.() -> Unit)

    /**
     * An object that speciﬁes the client certificate conﬁguration for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-clientcertificateconfig)
     * @param clientCertificateConfig An object that speciﬁes the client certificate conﬁguration
     * for a domain. 
     */
    public fun clientCertificateConfig(clientCertificateConfig: IResolvable)

    /**
     * An object that speciﬁes the client certificate conﬁguration for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-clientcertificateconfig)
     * @param clientCertificateConfig An object that speciﬁes the client certificate conﬁguration
     * for a domain. 
     */
    public fun clientCertificateConfig(clientCertificateConfig: ClientCertificateConfigProperty)

    /**
     * An object that speciﬁes the client certificate conﬁguration for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-clientcertificateconfig)
     * @param clientCertificateConfig An object that speciﬁes the client certificate conﬁguration
     * for a domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a551d156c49d8b38bfa822e98063a08da917b3f5d7319c16882908e6fd7c9f5")
    public
        fun clientCertificateConfig(clientCertificateConfig: ClientCertificateConfigProperty.Builder.() -> Unit)

    /**
     * The name of the domain configuration.
     *
     * This value must be unique to a region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-domainconfigurationname)
     * @param domainConfigurationName The name of the domain configuration. 
     */
    public fun domainConfigurationName(domainConfigurationName: String)

    /**
     * The status to which the domain configuration should be updated.
     *
     * Valid values: `ENABLED` | `DISABLED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-domainconfigurationstatus)
     * @param domainConfigurationStatus The status to which the domain configuration should be
     * updated. 
     */
    public fun domainConfigurationStatus(domainConfigurationStatus: String)

    /**
     * The name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-domainname)
     * @param domainName The name of the domain. 
     */
    public fun domainName(domainName: String)

    /**
     * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake.
     *
     * Currently you can specify only one certificate ARN. This value is not required for
     * AWS -managed domains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificatearns)
     * @param serverCertificateArns The ARNs of the certificates that AWS IoT passes to the device
     * during the TLS handshake. 
     */
    public fun serverCertificateArns(serverCertificateArns: List<String>)

    /**
     * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake.
     *
     * Currently you can specify only one certificate ARN. This value is not required for
     * AWS -managed domains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificatearns)
     * @param serverCertificateArns The ARNs of the certificates that AWS IoT passes to the device
     * during the TLS handshake. 
     */
    public fun serverCertificateArns(vararg serverCertificateArns: String)

    /**
     * The server certificate configuration.
     *
     * For more information, see [Configurable
     * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     * from the AWS IoT Core Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificateconfig)
     * @param serverCertificateConfig The server certificate configuration. 
     */
    public fun serverCertificateConfig(serverCertificateConfig: IResolvable)

    /**
     * The server certificate configuration.
     *
     * For more information, see [Configurable
     * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     * from the AWS IoT Core Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificateconfig)
     * @param serverCertificateConfig The server certificate configuration. 
     */
    public fun serverCertificateConfig(serverCertificateConfig: ServerCertificateConfigProperty)

    /**
     * The server certificate configuration.
     *
     * For more information, see [Configurable
     * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     * from the AWS IoT Core Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificateconfig)
     * @param serverCertificateConfig The server certificate configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ae58e8262218ab639eeb7233475520481bad2558d197cb3703e0b35133e4ce6")
    public
        fun serverCertificateConfig(serverCertificateConfig: ServerCertificateConfigProperty.Builder.() -> Unit)

    /**
     * The type of service delivered by the endpoint.
     *
     *
     * AWS IoT Core currently supports only the `DATA` service type.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servicetype)
     * @param serviceType The type of service delivered by the endpoint. 
     */
    public fun serviceType(serviceType: String)

    /**
     * Metadata which can be used to manage the domain configuration.
     *
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tags)
     * @param tags Metadata which can be used to manage the domain configuration. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata which can be used to manage the domain configuration.
     *
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tags)
     * @param tags Metadata which can be used to manage the domain configuration. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * An object that specifies the TLS configuration for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tlsconfig)
     * @param tlsConfig An object that specifies the TLS configuration for a domain. 
     */
    public fun tlsConfig(tlsConfig: IResolvable)

    /**
     * An object that specifies the TLS configuration for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tlsconfig)
     * @param tlsConfig An object that specifies the TLS configuration for a domain. 
     */
    public fun tlsConfig(tlsConfig: TlsConfigProperty)

    /**
     * An object that specifies the TLS configuration for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tlsconfig)
     * @param tlsConfig An object that specifies the TLS configuration for a domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4abac1239c8747cf17cc073364f15141980d897e685d7f16e484f886c1b66d5d")
    public fun tlsConfig(tlsConfig: TlsConfigProperty.Builder.() -> Unit)

    /**
     * The certificate used to validate the server certificate and prove domain name ownership.
     *
     * This certificate must be signed by a public certificate authority. This value is not required
     * for AWS -managed domains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-validationcertificatearn)
     * @param validationCertificateArn The certificate used to validate the server certificate and
     * prove domain name ownership. 
     */
    public fun validationCertificateArn(validationCertificateArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnDomainConfiguration.Builder =
        software.amazon.awscdk.services.iot.CfnDomainConfiguration.Builder.create(scope, id)

    /**
     * An enumerated string that speciﬁes the application-layer protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-applicationprotocol)
     * @param applicationProtocol An enumerated string that speciﬁes the application-layer protocol.
     * 
     */
    override fun applicationProtocol(applicationProtocol: String) {
      cdkBuilder.applicationProtocol(applicationProtocol)
    }

    /**
     * An enumerated string that speciﬁes the authentication type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-authenticationtype)
     * @param authenticationType An enumerated string that speciﬁes the authentication type. 
     */
    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * An object that specifies the authorization service for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-authorizerconfig)
     * @param authorizerConfig An object that specifies the authorization service for a domain. 
     */
    override fun authorizerConfig(authorizerConfig: IResolvable) {
      cdkBuilder.authorizerConfig(authorizerConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that specifies the authorization service for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-authorizerconfig)
     * @param authorizerConfig An object that specifies the authorization service for a domain. 
     */
    override fun authorizerConfig(authorizerConfig: AuthorizerConfigProperty) {
      cdkBuilder.authorizerConfig(authorizerConfig.let(AuthorizerConfigProperty.Companion::unwrap))
    }

    /**
     * An object that specifies the authorization service for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-authorizerconfig)
     * @param authorizerConfig An object that specifies the authorization service for a domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce4759ae749a4e31a1c4dd04b7986e8d3ab600f3d189c96aff7f6df92ee08972")
    override fun authorizerConfig(authorizerConfig: AuthorizerConfigProperty.Builder.() -> Unit):
        Unit = authorizerConfig(AuthorizerConfigProperty(authorizerConfig))

    /**
     * An object that speciﬁes the client certificate conﬁguration for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-clientcertificateconfig)
     * @param clientCertificateConfig An object that speciﬁes the client certificate conﬁguration
     * for a domain. 
     */
    override fun clientCertificateConfig(clientCertificateConfig: IResolvable) {
      cdkBuilder.clientCertificateConfig(clientCertificateConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that speciﬁes the client certificate conﬁguration for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-clientcertificateconfig)
     * @param clientCertificateConfig An object that speciﬁes the client certificate conﬁguration
     * for a domain. 
     */
    override fun clientCertificateConfig(clientCertificateConfig: ClientCertificateConfigProperty) {
      cdkBuilder.clientCertificateConfig(clientCertificateConfig.let(ClientCertificateConfigProperty.Companion::unwrap))
    }

    /**
     * An object that speciﬁes the client certificate conﬁguration for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-clientcertificateconfig)
     * @param clientCertificateConfig An object that speciﬁes the client certificate conﬁguration
     * for a domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a551d156c49d8b38bfa822e98063a08da917b3f5d7319c16882908e6fd7c9f5")
    override
        fun clientCertificateConfig(clientCertificateConfig: ClientCertificateConfigProperty.Builder.() -> Unit):
        Unit = clientCertificateConfig(ClientCertificateConfigProperty(clientCertificateConfig))

    /**
     * The name of the domain configuration.
     *
     * This value must be unique to a region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-domainconfigurationname)
     * @param domainConfigurationName The name of the domain configuration. 
     */
    override fun domainConfigurationName(domainConfigurationName: String) {
      cdkBuilder.domainConfigurationName(domainConfigurationName)
    }

    /**
     * The status to which the domain configuration should be updated.
     *
     * Valid values: `ENABLED` | `DISABLED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-domainconfigurationstatus)
     * @param domainConfigurationStatus The status to which the domain configuration should be
     * updated. 
     */
    override fun domainConfigurationStatus(domainConfigurationStatus: String) {
      cdkBuilder.domainConfigurationStatus(domainConfigurationStatus)
    }

    /**
     * The name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-domainname)
     * @param domainName The name of the domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake.
     *
     * Currently you can specify only one certificate ARN. This value is not required for
     * AWS -managed domains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificatearns)
     * @param serverCertificateArns The ARNs of the certificates that AWS IoT passes to the device
     * during the TLS handshake. 
     */
    override fun serverCertificateArns(serverCertificateArns: List<String>) {
      cdkBuilder.serverCertificateArns(serverCertificateArns)
    }

    /**
     * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake.
     *
     * Currently you can specify only one certificate ARN. This value is not required for
     * AWS -managed domains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificatearns)
     * @param serverCertificateArns The ARNs of the certificates that AWS IoT passes to the device
     * during the TLS handshake. 
     */
    override fun serverCertificateArns(vararg serverCertificateArns: String): Unit =
        serverCertificateArns(serverCertificateArns.toList())

    /**
     * The server certificate configuration.
     *
     * For more information, see [Configurable
     * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     * from the AWS IoT Core Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificateconfig)
     * @param serverCertificateConfig The server certificate configuration. 
     */
    override fun serverCertificateConfig(serverCertificateConfig: IResolvable) {
      cdkBuilder.serverCertificateConfig(serverCertificateConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The server certificate configuration.
     *
     * For more information, see [Configurable
     * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     * from the AWS IoT Core Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificateconfig)
     * @param serverCertificateConfig The server certificate configuration. 
     */
    override fun serverCertificateConfig(serverCertificateConfig: ServerCertificateConfigProperty) {
      cdkBuilder.serverCertificateConfig(serverCertificateConfig.let(ServerCertificateConfigProperty.Companion::unwrap))
    }

    /**
     * The server certificate configuration.
     *
     * For more information, see [Configurable
     * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     * from the AWS IoT Core Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificateconfig)
     * @param serverCertificateConfig The server certificate configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ae58e8262218ab639eeb7233475520481bad2558d197cb3703e0b35133e4ce6")
    override
        fun serverCertificateConfig(serverCertificateConfig: ServerCertificateConfigProperty.Builder.() -> Unit):
        Unit = serverCertificateConfig(ServerCertificateConfigProperty(serverCertificateConfig))

    /**
     * The type of service delivered by the endpoint.
     *
     *
     * AWS IoT Core currently supports only the `DATA` service type.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servicetype)
     * @param serviceType The type of service delivered by the endpoint. 
     */
    override fun serviceType(serviceType: String) {
      cdkBuilder.serviceType(serviceType)
    }

    /**
     * Metadata which can be used to manage the domain configuration.
     *
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tags)
     * @param tags Metadata which can be used to manage the domain configuration. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Metadata which can be used to manage the domain configuration.
     *
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tags)
     * @param tags Metadata which can be used to manage the domain configuration. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * An object that specifies the TLS configuration for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tlsconfig)
     * @param tlsConfig An object that specifies the TLS configuration for a domain. 
     */
    override fun tlsConfig(tlsConfig: IResolvable) {
      cdkBuilder.tlsConfig(tlsConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that specifies the TLS configuration for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tlsconfig)
     * @param tlsConfig An object that specifies the TLS configuration for a domain. 
     */
    override fun tlsConfig(tlsConfig: TlsConfigProperty) {
      cdkBuilder.tlsConfig(tlsConfig.let(TlsConfigProperty.Companion::unwrap))
    }

    /**
     * An object that specifies the TLS configuration for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tlsconfig)
     * @param tlsConfig An object that specifies the TLS configuration for a domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4abac1239c8747cf17cc073364f15141980d897e685d7f16e484f886c1b66d5d")
    override fun tlsConfig(tlsConfig: TlsConfigProperty.Builder.() -> Unit): Unit =
        tlsConfig(TlsConfigProperty(tlsConfig))

    /**
     * The certificate used to validate the server certificate and prove domain name ownership.
     *
     * This certificate must be signed by a public certificate authority. This value is not required
     * for AWS -managed domains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-validationcertificatearn)
     * @param validationCertificateArn The certificate used to validate the server certificate and
     * prove domain name ownership. 
     */
    override fun validationCertificateArn(validationCertificateArn: String) {
      cdkBuilder.validationCertificateArn(validationCertificateArn)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnDomainConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnDomainConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomainConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomainConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration):
        CfnDomainConfiguration = CfnDomainConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnDomainConfiguration):
        software.amazon.awscdk.services.iot.CfnDomainConfiguration = wrapped.cdkObject as
        software.amazon.awscdk.services.iot.CfnDomainConfiguration
  }

  /**
   * An object that specifies the authorization service for a domain.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * AuthorizerConfigProperty authorizerConfigProperty = AuthorizerConfigProperty.builder()
   * .allowAuthorizerOverride(false)
   * .defaultAuthorizerName("defaultAuthorizerName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-authorizerconfig.html)
   */
  public interface AuthorizerConfigProperty {
    /**
     * A Boolean that specifies whether the domain configuration's authorization service can be
     * overridden.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-authorizerconfig.html#cfn-iot-domainconfiguration-authorizerconfig-allowauthorizeroverride)
     */
    public fun allowAuthorizerOverride(): Any? = unwrap(this).getAllowAuthorizerOverride()

    /**
     * The name of the authorization service for a domain configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-authorizerconfig.html#cfn-iot-domainconfiguration-authorizerconfig-defaultauthorizername)
     */
    public fun defaultAuthorizerName(): String? = unwrap(this).getDefaultAuthorizerName()

    /**
     * A builder for [AuthorizerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowAuthorizerOverride A Boolean that specifies whether the domain configuration's
       * authorization service can be overridden.
       */
      public fun allowAuthorizerOverride(allowAuthorizerOverride: Boolean)

      /**
       * @param allowAuthorizerOverride A Boolean that specifies whether the domain configuration's
       * authorization service can be overridden.
       */
      public fun allowAuthorizerOverride(allowAuthorizerOverride: IResolvable)

      /**
       * @param defaultAuthorizerName The name of the authorization service for a domain
       * configuration.
       */
      public fun defaultAuthorizerName(defaultAuthorizerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty.builder()

      /**
       * @param allowAuthorizerOverride A Boolean that specifies whether the domain configuration's
       * authorization service can be overridden.
       */
      override fun allowAuthorizerOverride(allowAuthorizerOverride: Boolean) {
        cdkBuilder.allowAuthorizerOverride(allowAuthorizerOverride)
      }

      /**
       * @param allowAuthorizerOverride A Boolean that specifies whether the domain configuration's
       * authorization service can be overridden.
       */
      override fun allowAuthorizerOverride(allowAuthorizerOverride: IResolvable) {
        cdkBuilder.allowAuthorizerOverride(allowAuthorizerOverride.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultAuthorizerName The name of the authorization service for a domain
       * configuration.
       */
      override fun defaultAuthorizerName(defaultAuthorizerName: String) {
        cdkBuilder.defaultAuthorizerName(defaultAuthorizerName)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty,
    ) : CdkObject(cdkObject),
        AuthorizerConfigProperty {
      /**
       * A Boolean that specifies whether the domain configuration's authorization service can be
       * overridden.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-authorizerconfig.html#cfn-iot-domainconfiguration-authorizerconfig-allowauthorizeroverride)
       */
      override fun allowAuthorizerOverride(): Any? = unwrap(this).getAllowAuthorizerOverride()

      /**
       * The name of the authorization service for a domain configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-authorizerconfig.html#cfn-iot-domainconfiguration-authorizerconfig-defaultauthorizername)
       */
      override fun defaultAuthorizerName(): String? = unwrap(this).getDefaultAuthorizerName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty):
          AuthorizerConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? AuthorizerConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthorizerConfigProperty):
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty
    }
  }

  /**
   * An object that speciﬁes the client certificate conﬁguration for a domain.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * ClientCertificateConfigProperty clientCertificateConfigProperty =
   * ClientCertificateConfigProperty.builder()
   * .clientCertificateCallbackArn("clientCertificateCallbackArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-clientcertificateconfig.html)
   */
  public interface ClientCertificateConfigProperty {
    /**
     * The ARN of the Lambda function that IoT invokes after mutual TLS authentication during the
     * connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-clientcertificateconfig.html#cfn-iot-domainconfiguration-clientcertificateconfig-clientcertificatecallbackarn)
     */
    public fun clientCertificateCallbackArn(): String? =
        unwrap(this).getClientCertificateCallbackArn()

    /**
     * A builder for [ClientCertificateConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientCertificateCallbackArn The ARN of the Lambda function that IoT invokes after
       * mutual TLS authentication during the connection.
       */
      public fun clientCertificateCallbackArn(clientCertificateCallbackArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ClientCertificateConfigProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ClientCertificateConfigProperty.builder()

      /**
       * @param clientCertificateCallbackArn The ARN of the Lambda function that IoT invokes after
       * mutual TLS authentication during the connection.
       */
      override fun clientCertificateCallbackArn(clientCertificateCallbackArn: String) {
        cdkBuilder.clientCertificateCallbackArn(clientCertificateCallbackArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ClientCertificateConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration.ClientCertificateConfigProperty,
    ) : CdkObject(cdkObject),
        ClientCertificateConfigProperty {
      /**
       * The ARN of the Lambda function that IoT invokes after mutual TLS authentication during the
       * connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-clientcertificateconfig.html#cfn-iot-domainconfiguration-clientcertificateconfig-clientcertificatecallbackarn)
       */
      override fun clientCertificateCallbackArn(): String? =
          unwrap(this).getClientCertificateCallbackArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClientCertificateConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration.ClientCertificateConfigProperty):
          ClientCertificateConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ClientCertificateConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientCertificateConfigProperty):
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ClientCertificateConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ClientCertificateConfigProperty
    }
  }

  /**
   * The server certificate configuration.
   *
   * For more information, see [Configurable
   * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
   * from the AWS IoT Core Developer Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * ServerCertificateConfigProperty serverCertificateConfigProperty =
   * ServerCertificateConfigProperty.builder()
   * .enableOcspCheck(false)
   * .ocspAuthorizedResponderArn("ocspAuthorizedResponderArn")
   * .ocspLambdaArn("ocspLambdaArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificateconfig.html)
   */
  public interface ServerCertificateConfigProperty {
    /**
     * A Boolean value that indicates whether Online Certificate Status Protocol (OCSP) server
     * certificate check is enabled or not.
     *
     * For more information, see [Configurable
     * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     * from the AWS IoT Core Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificateconfig.html#cfn-iot-domainconfiguration-servercertificateconfig-enableocspcheck)
     */
    public fun enableOcspCheck(): Any? = unwrap(this).getEnableOcspCheck()

    /**
     * The Amazon Resource Name (ARN) for an X.509 certificate stored in ACM. If provided, AWS IoT
     * Core will use this certificate to validate the signature of the received OCSP response. The OCSP
     * responder must sign responses using either this authorized responder certificate or the issuing
     * certificate, depending on whether the ARN is provided or not. The certificate must be in the
     * same account and region as the domain configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificateconfig.html#cfn-iot-domainconfiguration-servercertificateconfig-ocspauthorizedresponderarn)
     */
    public fun ocspAuthorizedResponderArn(): String? = unwrap(this).getOcspAuthorizedResponderArn()

    /**
     * The Amazon Resource Name (ARN) for a Lambda function that acts as a Request for Comments
     * (RFC) 6960-compliant Online Certificate Status Protocol (OCSP) responder, supporting basic OCSP
     * responses.
     *
     * The Lambda function accepts a base64-encoding of the OCSP request in the Distinguished
     * Encoding Rules (DER) format. The Lambda function's response is also a base64-encoded OCSP
     * response in the DER format. The response size must not exceed 4 kilobytes (KiB). The Lambda
     * function must be in the same account and region as the domain configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificateconfig.html#cfn-iot-domainconfiguration-servercertificateconfig-ocsplambdaarn)
     */
    public fun ocspLambdaArn(): String? = unwrap(this).getOcspLambdaArn()

    /**
     * A builder for [ServerCertificateConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableOcspCheck A Boolean value that indicates whether Online Certificate Status
       * Protocol (OCSP) server certificate check is enabled or not.
       * For more information, see [Configurable
       * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
       * from the AWS IoT Core Developer Guide.
       */
      public fun enableOcspCheck(enableOcspCheck: Boolean)

      /**
       * @param enableOcspCheck A Boolean value that indicates whether Online Certificate Status
       * Protocol (OCSP) server certificate check is enabled or not.
       * For more information, see [Configurable
       * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
       * from the AWS IoT Core Developer Guide.
       */
      public fun enableOcspCheck(enableOcspCheck: IResolvable)

      /**
       * @param ocspAuthorizedResponderArn The Amazon Resource Name (ARN) for an X.509 certificate
       * stored in ACM. If provided, AWS IoT Core will use this certificate to validate the signature
       * of the received OCSP response. The OCSP responder must sign responses using either this
       * authorized responder certificate or the issuing certificate, depending on whether the ARN is
       * provided or not. The certificate must be in the same account and region as the domain
       * configuration.
       */
      public fun ocspAuthorizedResponderArn(ocspAuthorizedResponderArn: String)

      /**
       * @param ocspLambdaArn The Amazon Resource Name (ARN) for a Lambda function that acts as a
       * Request for Comments (RFC) 6960-compliant Online Certificate Status Protocol (OCSP) responder,
       * supporting basic OCSP responses.
       * The Lambda function accepts a base64-encoding of the OCSP request in the Distinguished
       * Encoding Rules (DER) format. The Lambda function's response is also a base64-encoded OCSP
       * response in the DER format. The response size must not exceed 4 kilobytes (KiB). The Lambda
       * function must be in the same account and region as the domain configuration.
       */
      public fun ocspLambdaArn(ocspLambdaArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateConfigProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateConfigProperty.builder()

      /**
       * @param enableOcspCheck A Boolean value that indicates whether Online Certificate Status
       * Protocol (OCSP) server certificate check is enabled or not.
       * For more information, see [Configurable
       * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
       * from the AWS IoT Core Developer Guide.
       */
      override fun enableOcspCheck(enableOcspCheck: Boolean) {
        cdkBuilder.enableOcspCheck(enableOcspCheck)
      }

      /**
       * @param enableOcspCheck A Boolean value that indicates whether Online Certificate Status
       * Protocol (OCSP) server certificate check is enabled or not.
       * For more information, see [Configurable
       * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
       * from the AWS IoT Core Developer Guide.
       */
      override fun enableOcspCheck(enableOcspCheck: IResolvable) {
        cdkBuilder.enableOcspCheck(enableOcspCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ocspAuthorizedResponderArn The Amazon Resource Name (ARN) for an X.509 certificate
       * stored in ACM. If provided, AWS IoT Core will use this certificate to validate the signature
       * of the received OCSP response. The OCSP responder must sign responses using either this
       * authorized responder certificate or the issuing certificate, depending on whether the ARN is
       * provided or not. The certificate must be in the same account and region as the domain
       * configuration.
       */
      override fun ocspAuthorizedResponderArn(ocspAuthorizedResponderArn: String) {
        cdkBuilder.ocspAuthorizedResponderArn(ocspAuthorizedResponderArn)
      }

      /**
       * @param ocspLambdaArn The Amazon Resource Name (ARN) for a Lambda function that acts as a
       * Request for Comments (RFC) 6960-compliant Online Certificate Status Protocol (OCSP) responder,
       * supporting basic OCSP responses.
       * The Lambda function accepts a base64-encoding of the OCSP request in the Distinguished
       * Encoding Rules (DER) format. The Lambda function's response is also a base64-encoded OCSP
       * response in the DER format. The response size must not exceed 4 kilobytes (KiB). The Lambda
       * function must be in the same account and region as the domain configuration.
       */
      override fun ocspLambdaArn(ocspLambdaArn: String) {
        cdkBuilder.ocspLambdaArn(ocspLambdaArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateConfigProperty,
    ) : CdkObject(cdkObject),
        ServerCertificateConfigProperty {
      /**
       * A Boolean value that indicates whether Online Certificate Status Protocol (OCSP) server
       * certificate check is enabled or not.
       *
       * For more information, see [Configurable
       * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
       * from the AWS IoT Core Developer Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificateconfig.html#cfn-iot-domainconfiguration-servercertificateconfig-enableocspcheck)
       */
      override fun enableOcspCheck(): Any? = unwrap(this).getEnableOcspCheck()

      /**
       * The Amazon Resource Name (ARN) for an X.509 certificate stored in ACM. If provided, AWS IoT
       * Core will use this certificate to validate the signature of the received OCSP response. The
       * OCSP responder must sign responses using either this authorized responder certificate or the
       * issuing certificate, depending on whether the ARN is provided or not. The certificate must be
       * in the same account and region as the domain configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificateconfig.html#cfn-iot-domainconfiguration-servercertificateconfig-ocspauthorizedresponderarn)
       */
      override fun ocspAuthorizedResponderArn(): String? =
          unwrap(this).getOcspAuthorizedResponderArn()

      /**
       * The Amazon Resource Name (ARN) for a Lambda function that acts as a Request for Comments
       * (RFC) 6960-compliant Online Certificate Status Protocol (OCSP) responder, supporting basic
       * OCSP responses.
       *
       * The Lambda function accepts a base64-encoding of the OCSP request in the Distinguished
       * Encoding Rules (DER) format. The Lambda function's response is also a base64-encoded OCSP
       * response in the DER format. The response size must not exceed 4 kilobytes (KiB). The Lambda
       * function must be in the same account and region as the domain configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificateconfig.html#cfn-iot-domainconfiguration-servercertificateconfig-ocsplambdaarn)
       */
      override fun ocspLambdaArn(): String? = unwrap(this).getOcspLambdaArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServerCertificateConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateConfigProperty):
          ServerCertificateConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServerCertificateConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerCertificateConfigProperty):
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateConfigProperty
    }
  }

  /**
   * An object that contains information about a server certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * ServerCertificateSummaryProperty serverCertificateSummaryProperty =
   * ServerCertificateSummaryProperty.builder()
   * .serverCertificateArn("serverCertificateArn")
   * .serverCertificateStatus("serverCertificateStatus")
   * .serverCertificateStatusDetail("serverCertificateStatusDetail")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificatesummary.html)
   */
  public interface ServerCertificateSummaryProperty {
    /**
     * The ARN of the server certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificatesummary.html#cfn-iot-domainconfiguration-servercertificatesummary-servercertificatearn)
     */
    public fun serverCertificateArn(): String? = unwrap(this).getServerCertificateArn()

    /**
     * The status of the server certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificatesummary.html#cfn-iot-domainconfiguration-servercertificatesummary-servercertificatestatus)
     */
    public fun serverCertificateStatus(): String? = unwrap(this).getServerCertificateStatus()

    /**
     * Details that explain the status of the server certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificatesummary.html#cfn-iot-domainconfiguration-servercertificatesummary-servercertificatestatusdetail)
     */
    public fun serverCertificateStatusDetail(): String? =
        unwrap(this).getServerCertificateStatusDetail()

    /**
     * A builder for [ServerCertificateSummaryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param serverCertificateArn The ARN of the server certificate.
       */
      public fun serverCertificateArn(serverCertificateArn: String)

      /**
       * @param serverCertificateStatus The status of the server certificate.
       */
      public fun serverCertificateStatus(serverCertificateStatus: String)

      /**
       * @param serverCertificateStatusDetail Details that explain the status of the server
       * certificate.
       */
      public fun serverCertificateStatusDetail(serverCertificateStatusDetail: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty.builder()

      /**
       * @param serverCertificateArn The ARN of the server certificate.
       */
      override fun serverCertificateArn(serverCertificateArn: String) {
        cdkBuilder.serverCertificateArn(serverCertificateArn)
      }

      /**
       * @param serverCertificateStatus The status of the server certificate.
       */
      override fun serverCertificateStatus(serverCertificateStatus: String) {
        cdkBuilder.serverCertificateStatus(serverCertificateStatus)
      }

      /**
       * @param serverCertificateStatusDetail Details that explain the status of the server
       * certificate.
       */
      override fun serverCertificateStatusDetail(serverCertificateStatusDetail: String) {
        cdkBuilder.serverCertificateStatusDetail(serverCertificateStatusDetail)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty,
    ) : CdkObject(cdkObject),
        ServerCertificateSummaryProperty {
      /**
       * The ARN of the server certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificatesummary.html#cfn-iot-domainconfiguration-servercertificatesummary-servercertificatearn)
       */
      override fun serverCertificateArn(): String? = unwrap(this).getServerCertificateArn()

      /**
       * The status of the server certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificatesummary.html#cfn-iot-domainconfiguration-servercertificatesummary-servercertificatestatus)
       */
      override fun serverCertificateStatus(): String? = unwrap(this).getServerCertificateStatus()

      /**
       * Details that explain the status of the server certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificatesummary.html#cfn-iot-domainconfiguration-servercertificatesummary-servercertificatestatusdetail)
       */
      override fun serverCertificateStatusDetail(): String? =
          unwrap(this).getServerCertificateStatusDetail()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServerCertificateSummaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty):
          ServerCertificateSummaryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServerCertificateSummaryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerCertificateSummaryProperty):
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty
    }
  }

  /**
   * An object that specifies the TLS configuration for a domain.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * TlsConfigProperty tlsConfigProperty = TlsConfigProperty.builder()
   * .securityPolicy("securityPolicy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-tlsconfig.html)
   */
  public interface TlsConfigProperty {
    /**
     * The security policy for a domain configuration.
     *
     * For more information, see [Security
     * policies](https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table)
     * in the *AWS IoT Core developer guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-tlsconfig.html#cfn-iot-domainconfiguration-tlsconfig-securitypolicy)
     */
    public fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

    /**
     * A builder for [TlsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityPolicy The security policy for a domain configuration.
       * For more information, see [Security
       * policies](https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table)
       * in the *AWS IoT Core developer guide* .
       */
      public fun securityPolicy(securityPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.TlsConfigProperty.Builder =
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.TlsConfigProperty.builder()

      /**
       * @param securityPolicy The security policy for a domain configuration.
       * For more information, see [Security
       * policies](https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table)
       * in the *AWS IoT Core developer guide* .
       */
      override fun securityPolicy(securityPolicy: String) {
        cdkBuilder.securityPolicy(securityPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.TlsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration.TlsConfigProperty,
    ) : CdkObject(cdkObject),
        TlsConfigProperty {
      /**
       * The security policy for a domain configuration.
       *
       * For more information, see [Security
       * policies](https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table)
       * in the *AWS IoT Core developer guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-tlsconfig.html#cfn-iot-domainconfiguration-tlsconfig-securitypolicy)
       */
      override fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TlsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration.TlsConfigProperty):
          TlsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? TlsConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsConfigProperty):
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.TlsConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.TlsConfigProperty
    }
  }
}
