@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDomainConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnDomainConfigurationProps cfnDomainConfigurationProps = CfnDomainConfigurationProps.builder()
 * .authorizerConfig(AuthorizerConfigProperty.builder()
 * .allowAuthorizerOverride(false)
 * .defaultAuthorizerName("defaultAuthorizerName")
 * .build())
 * .domainConfigurationName("domainConfigurationName")
 * .domainConfigurationStatus("domainConfigurationStatus")
 * .domainName("domainName")
 * .serverCertificateArns(List.of("serverCertificateArns"))
 * .serverCertificateConfig(ServerCertificateConfigProperty.builder()
 * .enableOcspCheck(false)
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
public interface CfnDomainConfigurationProps {
  /**
   * An object that specifies the authorization service for a domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-authorizerconfig)
   */
  public fun authorizerConfig(): Any? = unwrap(this).getAuthorizerConfig()

  /**
   * The name of the domain configuration.
   *
   * This value must be unique to a region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-domainconfigurationname)
   */
  public fun domainConfigurationName(): String? = unwrap(this).getDomainConfigurationName()

  /**
   * The status to which the domain configuration should be updated.
   *
   * Valid values: `ENABLED` | `DISABLED`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-domainconfigurationstatus)
   */
  public fun domainConfigurationStatus(): String? = unwrap(this).getDomainConfigurationStatus()

  /**
   * The name of the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-domainname)
   */
  public fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake.
   *
   * Currently you can specify only one certificate ARN. This value is not required for AWS -managed
   * domains.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificatearns)
   */
  public fun serverCertificateArns(): List<String> = unwrap(this).getServerCertificateArns() ?:
      emptyList()

  /**
   * The server certificate configuration.
   *
   * For more information, see [Configurable
   * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
   * from the AWS IoT Core Developer Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificateconfig)
   */
  public fun serverCertificateConfig(): Any? = unwrap(this).getServerCertificateConfig()

  /**
   * The type of service delivered by the endpoint.
   *
   *
   * AWS IoT Core currently supports only the `DATA` service type.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servicetype)
   */
  public fun serviceType(): String? = unwrap(this).getServiceType()

  /**
   * Metadata which can be used to manage the domain configuration.
   *
   *
   * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
   *
   * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
   *
   * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An object that specifies the TLS configuration for a domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tlsconfig)
   */
  public fun tlsConfig(): Any? = unwrap(this).getTlsConfig()

  /**
   * The certificate used to validate the server certificate and prove domain name ownership.
   *
   * This certificate must be signed by a public certificate authority. This value is not required
   * for AWS -managed domains.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-validationcertificatearn)
   */
  public fun validationCertificateArn(): String? = unwrap(this).getValidationCertificateArn()

  /**
   * A builder for [CfnDomainConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizerConfig An object that specifies the authorization service for a domain.
     */
    public fun authorizerConfig(authorizerConfig: IResolvable)

    /**
     * @param authorizerConfig An object that specifies the authorization service for a domain.
     */
    public fun authorizerConfig(authorizerConfig: CfnDomainConfiguration.AuthorizerConfigProperty)

    /**
     * @param authorizerConfig An object that specifies the authorization service for a domain.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c534d29ff5dc33136681907b856953018e4e40f45c330621cb24ef797829430d")
    public
        fun authorizerConfig(authorizerConfig: CfnDomainConfiguration.AuthorizerConfigProperty.Builder.() -> Unit)

    /**
     * @param domainConfigurationName The name of the domain configuration.
     * This value must be unique to a region.
     */
    public fun domainConfigurationName(domainConfigurationName: String)

    /**
     * @param domainConfigurationStatus The status to which the domain configuration should be
     * updated.
     * Valid values: `ENABLED` | `DISABLED`
     */
    public fun domainConfigurationStatus(domainConfigurationStatus: String)

    /**
     * @param domainName The name of the domain.
     */
    public fun domainName(domainName: String)

    /**
     * @param serverCertificateArns The ARNs of the certificates that AWS IoT passes to the device
     * during the TLS handshake.
     * Currently you can specify only one certificate ARN. This value is not required for
     * AWS -managed domains.
     */
    public fun serverCertificateArns(serverCertificateArns: List<String>)

    /**
     * @param serverCertificateArns The ARNs of the certificates that AWS IoT passes to the device
     * during the TLS handshake.
     * Currently you can specify only one certificate ARN. This value is not required for
     * AWS -managed domains.
     */
    public fun serverCertificateArns(vararg serverCertificateArns: String)

    /**
     * @param serverCertificateConfig The server certificate configuration.
     * For more information, see [Configurable
     * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     * from the AWS IoT Core Developer Guide.
     */
    public fun serverCertificateConfig(serverCertificateConfig: IResolvable)

    /**
     * @param serverCertificateConfig The server certificate configuration.
     * For more information, see [Configurable
     * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     * from the AWS IoT Core Developer Guide.
     */
    public
        fun serverCertificateConfig(serverCertificateConfig: CfnDomainConfiguration.ServerCertificateConfigProperty)

    /**
     * @param serverCertificateConfig The server certificate configuration.
     * For more information, see [Configurable
     * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     * from the AWS IoT Core Developer Guide.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f305696a7354135afa38e4844e995638a5e79f521033a1e76085d1736afd8b")
    public
        fun serverCertificateConfig(serverCertificateConfig: CfnDomainConfiguration.ServerCertificateConfigProperty.Builder.() -> Unit)

    /**
     * @param serviceType The type of service delivered by the endpoint.
     *
     * AWS IoT Core currently supports only the `DATA` service type.
     */
    public fun serviceType(serviceType: String)

    /**
     * @param tags Metadata which can be used to manage the domain configuration.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata which can be used to manage the domain configuration.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param tlsConfig An object that specifies the TLS configuration for a domain.
     */
    public fun tlsConfig(tlsConfig: IResolvable)

    /**
     * @param tlsConfig An object that specifies the TLS configuration for a domain.
     */
    public fun tlsConfig(tlsConfig: CfnDomainConfiguration.TlsConfigProperty)

    /**
     * @param tlsConfig An object that specifies the TLS configuration for a domain.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("898295011ba43b15190f874bc064ac8958ec184e22441ef926778c41dd084dea")
    public fun tlsConfig(tlsConfig: CfnDomainConfiguration.TlsConfigProperty.Builder.() -> Unit)

    /**
     * @param validationCertificateArn The certificate used to validate the server certificate and
     * prove domain name ownership.
     * This certificate must be signed by a public certificate authority. This value is not required
     * for AWS -managed domains.
     */
    public fun validationCertificateArn(validationCertificateArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnDomainConfigurationProps.Builder
        = software.amazon.awscdk.services.iot.CfnDomainConfigurationProps.builder()

    /**
     * @param authorizerConfig An object that specifies the authorization service for a domain.
     */
    override fun authorizerConfig(authorizerConfig: IResolvable) {
      cdkBuilder.authorizerConfig(authorizerConfig.let(IResolvable::unwrap))
    }

    /**
     * @param authorizerConfig An object that specifies the authorization service for a domain.
     */
    override
        fun authorizerConfig(authorizerConfig: CfnDomainConfiguration.AuthorizerConfigProperty) {
      cdkBuilder.authorizerConfig(authorizerConfig.let(CfnDomainConfiguration.AuthorizerConfigProperty::unwrap))
    }

    /**
     * @param authorizerConfig An object that specifies the authorization service for a domain.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c534d29ff5dc33136681907b856953018e4e40f45c330621cb24ef797829430d")
    override
        fun authorizerConfig(authorizerConfig: CfnDomainConfiguration.AuthorizerConfigProperty.Builder.() -> Unit):
        Unit = authorizerConfig(CfnDomainConfiguration.AuthorizerConfigProperty(authorizerConfig))

    /**
     * @param domainConfigurationName The name of the domain configuration.
     * This value must be unique to a region.
     */
    override fun domainConfigurationName(domainConfigurationName: String) {
      cdkBuilder.domainConfigurationName(domainConfigurationName)
    }

    /**
     * @param domainConfigurationStatus The status to which the domain configuration should be
     * updated.
     * Valid values: `ENABLED` | `DISABLED`
     */
    override fun domainConfigurationStatus(domainConfigurationStatus: String) {
      cdkBuilder.domainConfigurationStatus(domainConfigurationStatus)
    }

    /**
     * @param domainName The name of the domain.
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param serverCertificateArns The ARNs of the certificates that AWS IoT passes to the device
     * during the TLS handshake.
     * Currently you can specify only one certificate ARN. This value is not required for
     * AWS -managed domains.
     */
    override fun serverCertificateArns(serverCertificateArns: List<String>) {
      cdkBuilder.serverCertificateArns(serverCertificateArns)
    }

    /**
     * @param serverCertificateArns The ARNs of the certificates that AWS IoT passes to the device
     * during the TLS handshake.
     * Currently you can specify only one certificate ARN. This value is not required for
     * AWS -managed domains.
     */
    override fun serverCertificateArns(vararg serverCertificateArns: String): Unit =
        serverCertificateArns(serverCertificateArns.toList())

    /**
     * @param serverCertificateConfig The server certificate configuration.
     * For more information, see [Configurable
     * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     * from the AWS IoT Core Developer Guide.
     */
    override fun serverCertificateConfig(serverCertificateConfig: IResolvable) {
      cdkBuilder.serverCertificateConfig(serverCertificateConfig.let(IResolvable::unwrap))
    }

    /**
     * @param serverCertificateConfig The server certificate configuration.
     * For more information, see [Configurable
     * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     * from the AWS IoT Core Developer Guide.
     */
    override
        fun serverCertificateConfig(serverCertificateConfig: CfnDomainConfiguration.ServerCertificateConfigProperty) {
      cdkBuilder.serverCertificateConfig(serverCertificateConfig.let(CfnDomainConfiguration.ServerCertificateConfigProperty::unwrap))
    }

    /**
     * @param serverCertificateConfig The server certificate configuration.
     * For more information, see [Configurable
     * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     * from the AWS IoT Core Developer Guide.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f305696a7354135afa38e4844e995638a5e79f521033a1e76085d1736afd8b")
    override
        fun serverCertificateConfig(serverCertificateConfig: CfnDomainConfiguration.ServerCertificateConfigProperty.Builder.() -> Unit):
        Unit =
        serverCertificateConfig(CfnDomainConfiguration.ServerCertificateConfigProperty(serverCertificateConfig))

    /**
     * @param serviceType The type of service delivered by the endpoint.
     *
     * AWS IoT Core currently supports only the `DATA` service type.
     */
    override fun serviceType(serviceType: String) {
      cdkBuilder.serviceType(serviceType)
    }

    /**
     * @param tags Metadata which can be used to manage the domain configuration.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata which can be used to manage the domain configuration.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param tlsConfig An object that specifies the TLS configuration for a domain.
     */
    override fun tlsConfig(tlsConfig: IResolvable) {
      cdkBuilder.tlsConfig(tlsConfig.let(IResolvable::unwrap))
    }

    /**
     * @param tlsConfig An object that specifies the TLS configuration for a domain.
     */
    override fun tlsConfig(tlsConfig: CfnDomainConfiguration.TlsConfigProperty) {
      cdkBuilder.tlsConfig(tlsConfig.let(CfnDomainConfiguration.TlsConfigProperty::unwrap))
    }

    /**
     * @param tlsConfig An object that specifies the TLS configuration for a domain.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("898295011ba43b15190f874bc064ac8958ec184e22441ef926778c41dd084dea")
    override fun tlsConfig(tlsConfig: CfnDomainConfiguration.TlsConfigProperty.Builder.() -> Unit):
        Unit = tlsConfig(CfnDomainConfiguration.TlsConfigProperty(tlsConfig))

    /**
     * @param validationCertificateArn The certificate used to validate the server certificate and
     * prove domain name ownership.
     * This certificate must be signed by a public certificate authority. This value is not required
     * for AWS -managed domains.
     */
    override fun validationCertificateArn(validationCertificateArn: String) {
      cdkBuilder.validationCertificateArn(validationCertificateArn)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnDomainConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfigurationProps,
  ) : CdkObject(cdkObject), CfnDomainConfigurationProps {
    /**
     * An object that specifies the authorization service for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-authorizerconfig)
     */
    override fun authorizerConfig(): Any? = unwrap(this).getAuthorizerConfig()

    /**
     * The name of the domain configuration.
     *
     * This value must be unique to a region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-domainconfigurationname)
     */
    override fun domainConfigurationName(): String? = unwrap(this).getDomainConfigurationName()

    /**
     * The status to which the domain configuration should be updated.
     *
     * Valid values: `ENABLED` | `DISABLED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-domainconfigurationstatus)
     */
    override fun domainConfigurationStatus(): String? = unwrap(this).getDomainConfigurationStatus()

    /**
     * The name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-domainname)
     */
    override fun domainName(): String? = unwrap(this).getDomainName()

    /**
     * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake.
     *
     * Currently you can specify only one certificate ARN. This value is not required for
     * AWS -managed domains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificatearns)
     */
    override fun serverCertificateArns(): List<String> = unwrap(this).getServerCertificateArns() ?:
        emptyList()

    /**
     * The server certificate configuration.
     *
     * For more information, see [Configurable
     * endpoints](https://docs.aws.amazon.com//iot/latest/developerguide/iot-custom-endpoints-configurable.html)
     * from the AWS IoT Core Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificateconfig)
     */
    override fun serverCertificateConfig(): Any? = unwrap(this).getServerCertificateConfig()

    /**
     * The type of service delivered by the endpoint.
     *
     *
     * AWS IoT Core currently supports only the `DATA` service type.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servicetype)
     */
    override fun serviceType(): String? = unwrap(this).getServiceType()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * An object that specifies the TLS configuration for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tlsconfig)
     */
    override fun tlsConfig(): Any? = unwrap(this).getTlsConfig()

    /**
     * The certificate used to validate the server certificate and prove domain name ownership.
     *
     * This certificate must be signed by a public certificate authority. This value is not required
     * for AWS -managed domains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-validationcertificatearn)
     */
    override fun validationCertificateArn(): String? = unwrap(this).getValidationCertificateArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfigurationProps):
        CfnDomainConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnDomainConfigurationProps

    internal fun unwrap(wrapped: CfnDomainConfigurationProps):
        software.amazon.awscdk.services.iot.CfnDomainConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnDomainConfigurationProps
  }
}
