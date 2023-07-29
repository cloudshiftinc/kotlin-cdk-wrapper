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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnContainer
import software.amazon.awscdk.services.lightsail.CfnContainerProps

/**
 * Properties for defining a `CfnContainer`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * CfnContainerProps cfnContainerProps = CfnContainerProps.builder()
 * .power("power")
 * .scale(123)
 * .serviceName("serviceName")
 * // the properties below are optional
 * .containerServiceDeployment(ContainerServiceDeploymentProperty.builder()
 * .containers(List.of(ContainerProperty.builder()
 * .command(List.of("command"))
 * .containerName("containerName")
 * .environment(List.of(EnvironmentVariableProperty.builder()
 * .value("value")
 * .variable("variable")
 * .build()))
 * .image("image")
 * .ports(List.of(PortInfoProperty.builder()
 * .port("port")
 * .protocol("protocol")
 * .build()))
 * .build()))
 * .publicEndpoint(PublicEndpointProperty.builder()
 * .containerName("containerName")
 * .containerPort(123)
 * .healthCheckConfig(HealthCheckConfigProperty.builder()
 * .healthyThreshold(123)
 * .intervalSeconds(123)
 * .path("path")
 * .successCodes("successCodes")
 * .timeoutSeconds(123)
 * .unhealthyThreshold(123)
 * .build())
 * .build())
 * .build())
 * .isDisabled(false)
 * .publicDomainNames(List.of(PublicDomainNameProperty.builder()
 * .certificateName("certificateName")
 * .domainNames(List.of("domainNames"))
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html)
 */
@CdkDslMarker
public class CfnContainerPropsDsl {
    private val cdkBuilder: CfnContainerProps.Builder = CfnContainerProps.builder()

    private val _publicDomainNames: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param containerServiceDeployment An object that describes the current container deployment
     *   of the container service.
     */
    public fun containerServiceDeployment(containerServiceDeployment: IResolvable) {
        cdkBuilder.containerServiceDeployment(containerServiceDeployment)
    }

    /**
     * @param containerServiceDeployment An object that describes the current container deployment
     *   of the container service.
     */
    public fun containerServiceDeployment(
        containerServiceDeployment: CfnContainer.ContainerServiceDeploymentProperty
    ) {
        cdkBuilder.containerServiceDeployment(containerServiceDeployment)
    }

    /** @param isDisabled A Boolean value indicating whether the container service is disabled. */
    public fun isDisabled(isDisabled: Boolean) {
        cdkBuilder.isDisabled(isDisabled)
    }

    /** @param isDisabled A Boolean value indicating whether the container service is disabled. */
    public fun isDisabled(isDisabled: IResolvable) {
        cdkBuilder.isDisabled(isDisabled)
    }

    /**
     * @param power The power specification of the container service. The power specifies the amount
     *   of RAM, the number of vCPUs, and the base price of the container service.
     */
    public fun power(power: String) {
        cdkBuilder.power(power)
    }

    /**
     * @param publicDomainNames The public domain name of the container service, such as
     *   `example.com` and `www.example.com` . You can specify up to four public domain names for a
     *   container service. The domain names that you specify are used when you create a deployment
     *   with a container that is configured as the public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     */
    public fun publicDomainNames(vararg publicDomainNames: Any) {
        _publicDomainNames.addAll(listOf(*publicDomainNames))
    }

    /**
     * @param publicDomainNames The public domain name of the container service, such as
     *   `example.com` and `www.example.com` . You can specify up to four public domain names for a
     *   container service. The domain names that you specify are used when you create a deployment
     *   with a container that is configured as the public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     */
    public fun publicDomainNames(publicDomainNames: Collection<Any>) {
        _publicDomainNames.addAll(publicDomainNames)
    }

    /**
     * @param publicDomainNames The public domain name of the container service, such as
     *   `example.com` and `www.example.com` . You can specify up to four public domain names for a
     *   container service. The domain names that you specify are used when you create a deployment
     *   with a container that is configured as the public endpoint of your container service.
     *
     * If you don't specify public domain names, then you can use the default domain of the
     * container service.
     *
     * You must create and validate an SSL/TLS certificate before you can use public domain names
     * with your container service. Use the
     * [AWS::Lightsail::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html)
     * resource to create a certificate for the public domain names that you want to use with your
     * container service.
     */
    public fun publicDomainNames(publicDomainNames: IResolvable) {
        cdkBuilder.publicDomainNames(publicDomainNames)
    }

    /**
     * @param scale The scale specification of the container service. The scale specifies the
     *   allocated compute nodes of the container service.
     */
    public fun scale(scale: Number) {
        cdkBuilder.scale(scale)
    }

    /** @param serviceName The name of the container service. */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnContainerProps {
        if (_publicDomainNames.isNotEmpty()) cdkBuilder.publicDomainNames(_publicDomainNames)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
