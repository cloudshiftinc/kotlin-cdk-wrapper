@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnDomainConfiguration
import software.constructs.Construct

/**
 * Specifies a domain configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnDomainConfiguration cfnDomainConfiguration = CfnDomainConfiguration.Builder.create(this,
 * "MyCfnDomainConfiguration")
 * .authorizerConfig(AuthorizerConfigProperty.builder()
 * .allowAuthorizerOverride(false)
 * .defaultAuthorizerName("defaultAuthorizerName")
 * .build())
 * .domainConfigurationName("domainConfigurationName")
 * .domainConfigurationStatus("domainConfigurationStatus")
 * .domainName("domainName")
 * .serverCertificateArns(List.of("serverCertificateArns"))
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
@CdkDslMarker
public class CfnDomainConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDomainConfiguration.Builder =
        CfnDomainConfiguration.Builder.create(scope, id)

    private val _serverCertificateArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * An object that specifies the authorization service for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-authorizerconfig)
     *
     * @param authorizerConfig An object that specifies the authorization service for a domain.
     */
    public fun authorizerConfig(authorizerConfig: IResolvable) {
        cdkBuilder.authorizerConfig(authorizerConfig)
    }

    /**
     * An object that specifies the authorization service for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-authorizerconfig)
     *
     * @param authorizerConfig An object that specifies the authorization service for a domain.
     */
    public fun authorizerConfig(authorizerConfig: CfnDomainConfiguration.AuthorizerConfigProperty) {
        cdkBuilder.authorizerConfig(authorizerConfig)
    }

    /**
     * The name of the domain configuration.
     *
     * This value must be unique to a region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-domainconfigurationname)
     *
     * @param domainConfigurationName The name of the domain configuration.
     */
    public fun domainConfigurationName(domainConfigurationName: String) {
        cdkBuilder.domainConfigurationName(domainConfigurationName)
    }

    /**
     * The status to which the domain configuration should be updated.
     *
     * Valid values: `ENABLED` | `DISABLED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-domainconfigurationstatus)
     *
     * @param domainConfigurationStatus The status to which the domain configuration should be
     *   updated.
     */
    public fun domainConfigurationStatus(domainConfigurationStatus: String) {
        cdkBuilder.domainConfigurationStatus(domainConfigurationStatus)
    }

    /**
     * The name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-domainname)
     *
     * @param domainName The name of the domain.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake.
     *
     * Currently you can specify only one certificate ARN. This value is not required for AWS
     * -managed domains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificatearns)
     *
     * @param serverCertificateArns The ARNs of the certificates that AWS IoT passes to the device
     *   during the TLS handshake.
     */
    public fun serverCertificateArns(vararg serverCertificateArns: String) {
        _serverCertificateArns.addAll(listOf(*serverCertificateArns))
    }

    /**
     * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake.
     *
     * Currently you can specify only one certificate ARN. This value is not required for AWS
     * -managed domains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servercertificatearns)
     *
     * @param serverCertificateArns The ARNs of the certificates that AWS IoT passes to the device
     *   during the TLS handshake.
     */
    public fun serverCertificateArns(serverCertificateArns: Collection<String>) {
        _serverCertificateArns.addAll(serverCertificateArns)
    }

    /**
     * The type of service delivered by the endpoint.
     *
     * AWS IoT Core currently supports only the `DATA` service type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-servicetype)
     *
     * @param serviceType The type of service delivered by the endpoint.
     */
    public fun serviceType(serviceType: String) {
        cdkBuilder.serviceType(serviceType)
    }

    /**
     * Metadata which can be used to manage the domain configuration.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tags)
     *
     * @param tags Metadata which can be used to manage the domain configuration.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Metadata which can be used to manage the domain configuration.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tags)
     *
     * @param tags Metadata which can be used to manage the domain configuration.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * An object that specifies the TLS configuration for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tlsconfig)
     *
     * @param tlsConfig An object that specifies the TLS configuration for a domain.
     */
    public fun tlsConfig(tlsConfig: IResolvable) {
        cdkBuilder.tlsConfig(tlsConfig)
    }

    /**
     * An object that specifies the TLS configuration for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-tlsconfig)
     *
     * @param tlsConfig An object that specifies the TLS configuration for a domain.
     */
    public fun tlsConfig(tlsConfig: CfnDomainConfiguration.TlsConfigProperty) {
        cdkBuilder.tlsConfig(tlsConfig)
    }

    /**
     * The certificate used to validate the server certificate and prove domain name ownership.
     *
     * This certificate must be signed by a public certificate authority. This value is not required
     * for AWS -managed domains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-domainconfiguration.html#cfn-iot-domainconfiguration-validationcertificatearn)
     *
     * @param validationCertificateArn The certificate used to validate the server certificate and
     *   prove domain name ownership.
     */
    public fun validationCertificateArn(validationCertificateArn: String) {
        cdkBuilder.validationCertificateArn(validationCertificateArn)
    }

    public fun build(): CfnDomainConfiguration {
        if (_serverCertificateArns.isNotEmpty())
            cdkBuilder.serverCertificateArns(_serverCertificateArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
