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

package io.cloudshiftdev.awscdkdsl.services.servicediscovery

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnService
import software.amazon.awscdk.services.servicediscovery.CfnServiceProps

/**
 * Properties for defining a `CfnService`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * CfnServiceProps cfnServiceProps = CfnServiceProps.builder()
 * .description("description")
 * .dnsConfig(DnsConfigProperty.builder()
 * .dnsRecords(List.of(DnsRecordProperty.builder()
 * .ttl(123)
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .namespaceId("namespaceId")
 * .routingPolicy("routingPolicy")
 * .build())
 * .healthCheckConfig(HealthCheckConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .failureThreshold(123)
 * .resourcePath("resourcePath")
 * .build())
 * .healthCheckCustomConfig(HealthCheckCustomConfigProperty.builder()
 * .failureThreshold(123)
 * .build())
 * .name("name")
 * .namespaceId("namespaceId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html)
 */
@CdkDslMarker
public class CfnServicePropsDsl {
    private val cdkBuilder: CfnServiceProps.Builder = CfnServiceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description of the service. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
     *   you want AWS Cloud Map to create when you register an instance.
     *
     * The record types of a service can only be changed by deleting the service and recreating it
     * with a new `Dnsconfig` .
     */
    public fun dnsConfig(dnsConfig: IResolvable) {
        cdkBuilder.dnsConfig(dnsConfig)
    }

    /**
     * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
     *   you want AWS Cloud Map to create when you register an instance.
     *
     * The record types of a service can only be changed by deleting the service and recreating it
     * with a new `Dnsconfig` .
     */
    public fun dnsConfig(dnsConfig: CfnService.DnsConfigProperty) {
        cdkBuilder.dnsConfig(dnsConfig)
    }

    /**
     * @param healthCheckConfig *Public DNS and HTTP namespaces only.* A complex type that contains
     *   settings for an optional health check. If you specify settings for a health check, AWS
     *   Cloud Map associates the health check with the records that you specify in `DnsConfig` .
     *   For information about the charges for health checks, see
     *   [Amazon Route 53 Pricing](https://docs.aws.amazon.com/route53/pricing/) .
     */
    public fun healthCheckConfig(healthCheckConfig: IResolvable) {
        cdkBuilder.healthCheckConfig(healthCheckConfig)
    }

    /**
     * @param healthCheckConfig *Public DNS and HTTP namespaces only.* A complex type that contains
     *   settings for an optional health check. If you specify settings for a health check, AWS
     *   Cloud Map associates the health check with the records that you specify in `DnsConfig` .
     *   For information about the charges for health checks, see
     *   [Amazon Route 53 Pricing](https://docs.aws.amazon.com/route53/pricing/) .
     */
    public fun healthCheckConfig(healthCheckConfig: CfnService.HealthCheckConfigProperty) {
        cdkBuilder.healthCheckConfig(healthCheckConfig)
    }

    /**
     * @param healthCheckCustomConfig A complex type that contains information about an optional
     *   custom health check.
     *
     * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
     * or `HealthCheckConfig` but not both.
     */
    public fun healthCheckCustomConfig(healthCheckCustomConfig: IResolvable) {
        cdkBuilder.healthCheckCustomConfig(healthCheckCustomConfig)
    }

    /**
     * @param healthCheckCustomConfig A complex type that contains information about an optional
     *   custom health check.
     *
     * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
     * or `HealthCheckConfig` but not both.
     */
    public fun healthCheckCustomConfig(
        healthCheckCustomConfig: CfnService.HealthCheckCustomConfigProperty
    ) {
        cdkBuilder.healthCheckCustomConfig(healthCheckCustomConfig)
    }

    /** @param name The name of the service. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param namespaceId The ID of the namespace that was used to create the service.
     *
     * You must specify a value for `NamespaceId` either for the service properties or for
     * [DnsConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html)
     * . Don't specify a value in both places.
     */
    public fun namespaceId(namespaceId: String) {
        cdkBuilder.namespaceId(namespaceId)
    }

    /**
     * @param tags The tags for the service. Each tag consists of a key and an optional value, both
     *   of which you define. Tag keys can have a maximum character length of 128 characters, and
     *   tag values can have a maximum length of 256 characters.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags for the service. Each tag consists of a key and an optional value, both
     *   of which you define. Tag keys can have a maximum character length of 128 characters, and
     *   tag values can have a maximum length of 256 characters.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param type If present, specifies that the service instances are only discoverable using the
     *   `DiscoverInstances` API operation. No DNS records is registered for the service instances.
     *   The only valid value is `HTTP` .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnServiceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
