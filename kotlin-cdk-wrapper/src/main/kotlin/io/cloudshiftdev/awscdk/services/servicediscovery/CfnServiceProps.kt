@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

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
 * Properties for defining a `CfnService`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * Object serviceAttributes;
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
 * .serviceAttributes(serviceAttributes)
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
public interface CfnServiceProps {
  /**
   * The description of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

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
   */
  public fun dnsConfig(): Any? = unwrap(this).getDnsConfig()

  /**
   * *Public DNS and HTTP namespaces only.* A complex type that contains settings for an optional
   * health check. If you specify settings for a health check, AWS Cloud Map associates the health
   * check with the records that you specify in `DnsConfig` .
   *
   * For information about the charges for health checks, see [Amazon Route 53
   * Pricing](https://docs.aws.amazon.com/route53/pricing/) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-healthcheckconfig)
   */
  public fun healthCheckConfig(): Any? = unwrap(this).getHealthCheckConfig()

  /**
   * A complex type that contains information about an optional custom health check.
   *
   *
   * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
   * or `HealthCheckConfig` but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-healthcheckcustomconfig)
   */
  public fun healthCheckCustomConfig(): Any? = unwrap(this).getHealthCheckCustomConfig()

  /**
   * The name of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-name)
   */
  public fun name(): String? = unwrap(this).getName()

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
   */
  public fun namespaceId(): String? = unwrap(this).getNamespaceId()

  /**
   * A string map that contains the following information for the service:.
   *
   * * The attributes that apply to the service
   * * For each attribute, the applicable value.
   *
   * You can specify a total of 30 attributes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-serviceattributes)
   */
  public fun serviceAttributes(): Any? = unwrap(this).getServiceAttributes()

  /**
   * The tags for the service.
   *
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * If present, specifies that the service instances are only discoverable using the
   * `DiscoverInstances` API operation.
   *
   * No DNS records is registered for the service instances. The only valid value is `HTTP` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A builder for [CfnServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the service.
     */
    public fun description(description: String)

    /**
     * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
     * you want AWS Cloud Map to create when you register an instance.
     *
     * The record types of a service can only be changed by deleting the service and recreating it
     * with a new `Dnsconfig` .
     */
    public fun dnsConfig(dnsConfig: IResolvable)

    /**
     * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
     * you want AWS Cloud Map to create when you register an instance.
     *
     * The record types of a service can only be changed by deleting the service and recreating it
     * with a new `Dnsconfig` .
     */
    public fun dnsConfig(dnsConfig: CfnService.DnsConfigProperty)

    /**
     * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
     * you want AWS Cloud Map to create when you register an instance.
     *
     * The record types of a service can only be changed by deleting the service and recreating it
     * with a new `Dnsconfig` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ac04bbef3c87fd3b1b70e12d6abc89c0890a88370e1313f1f765223457287bd")
    public fun dnsConfig(dnsConfig: CfnService.DnsConfigProperty.Builder.() -> Unit)

    /**
     * @param healthCheckConfig *Public DNS and HTTP namespaces only.* A complex type that contains
     * settings for an optional health check. If you specify settings for a health check, AWS Cloud Map
     * associates the health check with the records that you specify in `DnsConfig` .
     * For information about the charges for health checks, see [Amazon Route 53
     * Pricing](https://docs.aws.amazon.com/route53/pricing/) .
     */
    public fun healthCheckConfig(healthCheckConfig: IResolvable)

    /**
     * @param healthCheckConfig *Public DNS and HTTP namespaces only.* A complex type that contains
     * settings for an optional health check. If you specify settings for a health check, AWS Cloud Map
     * associates the health check with the records that you specify in `DnsConfig` .
     * For information about the charges for health checks, see [Amazon Route 53
     * Pricing](https://docs.aws.amazon.com/route53/pricing/) .
     */
    public fun healthCheckConfig(healthCheckConfig: CfnService.HealthCheckConfigProperty)

    /**
     * @param healthCheckConfig *Public DNS and HTTP namespaces only.* A complex type that contains
     * settings for an optional health check. If you specify settings for a health check, AWS Cloud Map
     * associates the health check with the records that you specify in `DnsConfig` .
     * For information about the charges for health checks, see [Amazon Route 53
     * Pricing](https://docs.aws.amazon.com/route53/pricing/) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2cc3e3fe8c1377e2423bc37d5c554fb0a99ef2be96a63d6d5b17ee755d7c047c")
    public
        fun healthCheckConfig(healthCheckConfig: CfnService.HealthCheckConfigProperty.Builder.() -> Unit)

    /**
     * @param healthCheckCustomConfig A complex type that contains information about an optional
     * custom health check.
     *
     * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
     * or `HealthCheckConfig` but not both.
     */
    public fun healthCheckCustomConfig(healthCheckCustomConfig: IResolvable)

    /**
     * @param healthCheckCustomConfig A complex type that contains information about an optional
     * custom health check.
     *
     * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
     * or `HealthCheckConfig` but not both.
     */
    public
        fun healthCheckCustomConfig(healthCheckCustomConfig: CfnService.HealthCheckCustomConfigProperty)

    /**
     * @param healthCheckCustomConfig A complex type that contains information about an optional
     * custom health check.
     *
     * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
     * or `HealthCheckConfig` but not both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c62fadfbefe8d556e5f1fea201921900a443ba7a8206acaf92766e4047b76213")
    public
        fun healthCheckCustomConfig(healthCheckCustomConfig: CfnService.HealthCheckCustomConfigProperty.Builder.() -> Unit)

    /**
     * @param name The name of the service.
     */
    public fun name(name: String)

    /**
     * @param namespaceId The ID of the namespace that was used to create the service.
     *
     * You must specify a value for `NamespaceId` either for the service properties or for
     * [DnsConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html)
     * . Don't specify a value in both places.
     */
    public fun namespaceId(namespaceId: String)

    /**
     * @param serviceAttributes A string map that contains the following information for the
     * service:.
     * * The attributes that apply to the service
     * * For each attribute, the applicable value.
     *
     * You can specify a total of 30 attributes.
     */
    public fun serviceAttributes(serviceAttributes: Any)

    /**
     * @param tags The tags for the service.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the service.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type If present, specifies that the service instances are only discoverable using the
     * `DiscoverInstances` API operation.
     * No DNS records is registered for the service instances. The only valid value is `HTTP` .
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.CfnServiceProps.Builder
        = software.amazon.awscdk.services.servicediscovery.CfnServiceProps.builder()

    /**
     * @param description The description of the service.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
     * you want AWS Cloud Map to create when you register an instance.
     *
     * The record types of a service can only be changed by deleting the service and recreating it
     * with a new `Dnsconfig` .
     */
    override fun dnsConfig(dnsConfig: IResolvable) {
      cdkBuilder.dnsConfig(dnsConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
     * you want AWS Cloud Map to create when you register an instance.
     *
     * The record types of a service can only be changed by deleting the service and recreating it
     * with a new `Dnsconfig` .
     */
    override fun dnsConfig(dnsConfig: CfnService.DnsConfigProperty) {
      cdkBuilder.dnsConfig(dnsConfig.let(CfnService.DnsConfigProperty.Companion::unwrap))
    }

    /**
     * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
     * you want AWS Cloud Map to create when you register an instance.
     *
     * The record types of a service can only be changed by deleting the service and recreating it
     * with a new `Dnsconfig` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ac04bbef3c87fd3b1b70e12d6abc89c0890a88370e1313f1f765223457287bd")
    override fun dnsConfig(dnsConfig: CfnService.DnsConfigProperty.Builder.() -> Unit): Unit =
        dnsConfig(CfnService.DnsConfigProperty(dnsConfig))

    /**
     * @param healthCheckConfig *Public DNS and HTTP namespaces only.* A complex type that contains
     * settings for an optional health check. If you specify settings for a health check, AWS Cloud Map
     * associates the health check with the records that you specify in `DnsConfig` .
     * For information about the charges for health checks, see [Amazon Route 53
     * Pricing](https://docs.aws.amazon.com/route53/pricing/) .
     */
    override fun healthCheckConfig(healthCheckConfig: IResolvable) {
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param healthCheckConfig *Public DNS and HTTP namespaces only.* A complex type that contains
     * settings for an optional health check. If you specify settings for a health check, AWS Cloud Map
     * associates the health check with the records that you specify in `DnsConfig` .
     * For information about the charges for health checks, see [Amazon Route 53
     * Pricing](https://docs.aws.amazon.com/route53/pricing/) .
     */
    override fun healthCheckConfig(healthCheckConfig: CfnService.HealthCheckConfigProperty) {
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(CfnService.HealthCheckConfigProperty.Companion::unwrap))
    }

    /**
     * @param healthCheckConfig *Public DNS and HTTP namespaces only.* A complex type that contains
     * settings for an optional health check. If you specify settings for a health check, AWS Cloud Map
     * associates the health check with the records that you specify in `DnsConfig` .
     * For information about the charges for health checks, see [Amazon Route 53
     * Pricing](https://docs.aws.amazon.com/route53/pricing/) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2cc3e3fe8c1377e2423bc37d5c554fb0a99ef2be96a63d6d5b17ee755d7c047c")
    override
        fun healthCheckConfig(healthCheckConfig: CfnService.HealthCheckConfigProperty.Builder.() -> Unit):
        Unit = healthCheckConfig(CfnService.HealthCheckConfigProperty(healthCheckConfig))

    /**
     * @param healthCheckCustomConfig A complex type that contains information about an optional
     * custom health check.
     *
     * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
     * or `HealthCheckConfig` but not both.
     */
    override fun healthCheckCustomConfig(healthCheckCustomConfig: IResolvable) {
      cdkBuilder.healthCheckCustomConfig(healthCheckCustomConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param healthCheckCustomConfig A complex type that contains information about an optional
     * custom health check.
     *
     * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
     * or `HealthCheckConfig` but not both.
     */
    override
        fun healthCheckCustomConfig(healthCheckCustomConfig: CfnService.HealthCheckCustomConfigProperty) {
      cdkBuilder.healthCheckCustomConfig(healthCheckCustomConfig.let(CfnService.HealthCheckCustomConfigProperty.Companion::unwrap))
    }

    /**
     * @param healthCheckCustomConfig A complex type that contains information about an optional
     * custom health check.
     *
     * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
     * or `HealthCheckConfig` but not both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c62fadfbefe8d556e5f1fea201921900a443ba7a8206acaf92766e4047b76213")
    override
        fun healthCheckCustomConfig(healthCheckCustomConfig: CfnService.HealthCheckCustomConfigProperty.Builder.() -> Unit):
        Unit =
        healthCheckCustomConfig(CfnService.HealthCheckCustomConfigProperty(healthCheckCustomConfig))

    /**
     * @param name The name of the service.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param namespaceId The ID of the namespace that was used to create the service.
     *
     * You must specify a value for `NamespaceId` either for the service properties or for
     * [DnsConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html)
     * . Don't specify a value in both places.
     */
    override fun namespaceId(namespaceId: String) {
      cdkBuilder.namespaceId(namespaceId)
    }

    /**
     * @param serviceAttributes A string map that contains the following information for the
     * service:.
     * * The attributes that apply to the service
     * * For each attribute, the applicable value.
     *
     * You can specify a total of 30 attributes.
     */
    override fun serviceAttributes(serviceAttributes: Any) {
      cdkBuilder.serviceAttributes(serviceAttributes)
    }

    /**
     * @param tags The tags for the service.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags for the service.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type If present, specifies that the service instances are only discoverable using the
     * `DiscoverInstances` API operation.
     * No DNS records is registered for the service instances. The only valid value is `HTTP` .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicediscovery.CfnServiceProps,
  ) : CdkObject(cdkObject),
      CfnServiceProps {
    /**
     * The description of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A complex type that contains information about the Route 53 DNS records that you want AWS
     * Cloud Map to create when you register an instance.
     *
     *
     * The record types of a service can only be changed by deleting the service and recreating it
     * with a new `Dnsconfig` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-dnsconfig)
     */
    override fun dnsConfig(): Any? = unwrap(this).getDnsConfig()

    /**
     * *Public DNS and HTTP namespaces only.* A complex type that contains settings for an optional
     * health check. If you specify settings for a health check, AWS Cloud Map associates the health
     * check with the records that you specify in `DnsConfig` .
     *
     * For information about the charges for health checks, see [Amazon Route 53
     * Pricing](https://docs.aws.amazon.com/route53/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-healthcheckconfig)
     */
    override fun healthCheckConfig(): Any? = unwrap(this).getHealthCheckConfig()

    /**
     * A complex type that contains information about an optional custom health check.
     *
     *
     * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
     * or `HealthCheckConfig` but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-healthcheckcustomconfig)
     */
    override fun healthCheckCustomConfig(): Any? = unwrap(this).getHealthCheckCustomConfig()

    /**
     * The name of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-name)
     */
    override fun name(): String? = unwrap(this).getName()

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
     */
    override fun namespaceId(): String? = unwrap(this).getNamespaceId()

    /**
     * A string map that contains the following information for the service:.
     *
     * * The attributes that apply to the service
     * * For each attribute, the applicable value.
     *
     * You can specify a total of 30 attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-serviceattributes)
     */
    override fun serviceAttributes(): Any? = unwrap(this).getServiceAttributes()

    /**
     * The tags for the service.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * If present, specifies that the service instances are only discoverable using the
     * `DiscoverInstances` API operation.
     *
     * No DNS records is registered for the service instances. The only valid value is `HTTP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-type)
     */
    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnServiceProps):
        CfnServiceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnServiceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceProps):
        software.amazon.awscdk.services.servicediscovery.CfnServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.CfnServiceProps
  }
}
