@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnService
import software.constructs.Construct

@CdkDslMarker
public class CfnServiceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnService.Builder = CfnService.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The description of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-description)
   * @param description The description of the service. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud
   * Map to create when you register an instance.
   *
   *
   * The record types of a service can only be changed by deleting the service and recreating it
   * with a new `Dnsconfig` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-dnsconfig)
   * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
   * you want AWS Cloud Map to create when you register an instance. 
   */
  public fun dnsConfig(dnsConfig: IResolvable) {
    cdkBuilder.dnsConfig(dnsConfig)
  }

  /**
   * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud
   * Map to create when you register an instance.
   *
   *
   * The record types of a service can only be changed by deleting the service and recreating it
   * with a new `Dnsconfig` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-dnsconfig)
   * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
   * you want AWS Cloud Map to create when you register an instance. 
   */
  public fun dnsConfig(dnsConfig: CfnService.DnsConfigProperty) {
    cdkBuilder.dnsConfig(dnsConfig)
  }

  /**
   * *Public DNS and HTTP namespaces only.* A complex type that contains settings for an optional
   * health check. If you specify settings for a health check, AWS Cloud Map associates the health
   * check with the records that you specify in `DnsConfig` .
   *
   * For information about the charges for health checks, see [Amazon Route 53
   * Pricing](https://docs.aws.amazon.com/route53/pricing/) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-healthcheckconfig)
   * @param healthCheckConfig *Public DNS and HTTP namespaces only.* A complex type that contains
   * settings for an optional health check. If you specify settings for a health check, AWS Cloud Map
   * associates the health check with the records that you specify in `DnsConfig` . 
   */
  public fun healthCheckConfig(healthCheckConfig: IResolvable) {
    cdkBuilder.healthCheckConfig(healthCheckConfig)
  }

  /**
   * *Public DNS and HTTP namespaces only.* A complex type that contains settings for an optional
   * health check. If you specify settings for a health check, AWS Cloud Map associates the health
   * check with the records that you specify in `DnsConfig` .
   *
   * For information about the charges for health checks, see [Amazon Route 53
   * Pricing](https://docs.aws.amazon.com/route53/pricing/) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-healthcheckconfig)
   * @param healthCheckConfig *Public DNS and HTTP namespaces only.* A complex type that contains
   * settings for an optional health check. If you specify settings for a health check, AWS Cloud Map
   * associates the health check with the records that you specify in `DnsConfig` . 
   */
  public fun healthCheckConfig(healthCheckConfig: CfnService.HealthCheckConfigProperty) {
    cdkBuilder.healthCheckConfig(healthCheckConfig)
  }

  /**
   * A complex type that contains information about an optional custom health check.
   *
   *
   * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
   * or `HealthCheckConfig` but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-healthcheckcustomconfig)
   * @param healthCheckCustomConfig A complex type that contains information about an optional
   * custom health check. 
   */
  public fun healthCheckCustomConfig(healthCheckCustomConfig: IResolvable) {
    cdkBuilder.healthCheckCustomConfig(healthCheckCustomConfig)
  }

  /**
   * A complex type that contains information about an optional custom health check.
   *
   *
   * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
   * or `HealthCheckConfig` but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-healthcheckcustomconfig)
   * @param healthCheckCustomConfig A complex type that contains information about an optional
   * custom health check. 
   */
  public
      fun healthCheckCustomConfig(healthCheckCustomConfig: CfnService.HealthCheckCustomConfigProperty) {
    cdkBuilder.healthCheckCustomConfig(healthCheckCustomConfig)
  }

  /**
   * The name of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-name)
   * @param name The name of the service. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The ID of the namespace that was used to create the service.
   *
   *
   * You must specify a value for `NamespaceId` either for the service properties or for
   * [DnsConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html)
   * . Don't specify a value in both places.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-namespaceid)
   * @param namespaceId The ID of the namespace that was used to create the service. 
   */
  public fun namespaceId(namespaceId: String) {
    cdkBuilder.namespaceId(namespaceId)
  }

  /**
   * The tags for the service.
   *
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-tags)
   * @param tags The tags for the service. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags for the service.
   *
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-tags)
   * @param tags The tags for the service. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * If present, specifies that the service instances are only discoverable using the
   * `DiscoverInstances` API operation.
   *
   * No DNS records is registered for the service instances. The only valid value is `HTTP` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-type)
   * @param type If present, specifies that the service instances are only discoverable using the
   * `DiscoverInstances` API operation. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnService {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
