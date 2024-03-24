@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A complex type that contains information about a service, which defines the configuration of the
 * following entities:.
 *
 * * For public and private DNS namespaces, one of the following combinations of DNS records in
 * Amazon Route 53:
 * * A
 * * AAAA
 * * A and AAAA
 * * SRV
 * * CNAME
 * * Optionally, a health check
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * CfnService cfnService = CfnService.Builder.create(this, "MyCfnService")
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
public open class CfnService(
  cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.servicediscovery.CfnService(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServiceProps,
  ) :
      this(software.amazon.awscdk.services.servicediscovery.CfnService(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnServiceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServiceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnServiceProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the service.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the service.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name that you assigned to the service.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The description of the service.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the service.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud
   * Map to create when you register an instance.
   */
  public open fun dnsConfig(): Any? = unwrap(this).getDnsConfig()

  /**
   * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud
   * Map to create when you register an instance.
   */
  public open fun dnsConfig(`value`: IResolvable) {
    unwrap(this).setDnsConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud
   * Map to create when you register an instance.
   */
  public open fun dnsConfig(`value`: DnsConfigProperty) {
    unwrap(this).setDnsConfig(`value`.let(DnsConfigProperty::unwrap))
  }

  /**
   * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud
   * Map to create when you register an instance.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("18314d422d4a9654e04853b7932e775e25918085c7c8ce87b40e5df71164bd82")
  public open fun dnsConfig(`value`: DnsConfigProperty.Builder.() -> Unit): Unit =
      dnsConfig(DnsConfigProperty(`value`))

  /**
   * *Public DNS and HTTP namespaces only.* A complex type that contains settings for an optional
   * health check. If you specify settings for a health check, AWS Cloud Map associates the health
   * check with the records that you specify in `DnsConfig` .
   */
  public open fun healthCheckConfig(): Any? = unwrap(this).getHealthCheckConfig()

  /**
   * *Public DNS and HTTP namespaces only.* A complex type that contains settings for an optional
   * health check. If you specify settings for a health check, AWS Cloud Map associates the health
   * check with the records that you specify in `DnsConfig` .
   */
  public open fun healthCheckConfig(`value`: IResolvable) {
    unwrap(this).setHealthCheckConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * *Public DNS and HTTP namespaces only.* A complex type that contains settings for an optional
   * health check. If you specify settings for a health check, AWS Cloud Map associates the health
   * check with the records that you specify in `DnsConfig` .
   */
  public open fun healthCheckConfig(`value`: HealthCheckConfigProperty) {
    unwrap(this).setHealthCheckConfig(`value`.let(HealthCheckConfigProperty::unwrap))
  }

  /**
   * *Public DNS and HTTP namespaces only.* A complex type that contains settings for an optional
   * health check. If you specify settings for a health check, AWS Cloud Map associates the health
   * check with the records that you specify in `DnsConfig` .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b9f80b31b418a5edf6b039586791ef720c9c0e790cfbe487910c6472d9e81629")
  public open fun healthCheckConfig(`value`: HealthCheckConfigProperty.Builder.() -> Unit): Unit =
      healthCheckConfig(HealthCheckConfigProperty(`value`))

  /**
   * A complex type that contains information about an optional custom health check.
   */
  public open fun healthCheckCustomConfig(): Any? = unwrap(this).getHealthCheckCustomConfig()

  /**
   * A complex type that contains information about an optional custom health check.
   */
  public open fun healthCheckCustomConfig(`value`: IResolvable) {
    unwrap(this).setHealthCheckCustomConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A complex type that contains information about an optional custom health check.
   */
  public open fun healthCheckCustomConfig(`value`: HealthCheckCustomConfigProperty) {
    unwrap(this).setHealthCheckCustomConfig(`value`.let(HealthCheckCustomConfigProperty::unwrap))
  }

  /**
   * A complex type that contains information about an optional custom health check.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cd5ecf02a06f848a4c7b772a60bf2f9c860dd243a78b0ee5e77c6ec72f54362b")
  public open
      fun healthCheckCustomConfig(`value`: HealthCheckCustomConfigProperty.Builder.() -> Unit): Unit
      = healthCheckCustomConfig(HealthCheckCustomConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the service.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the service.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ID of the namespace that was used to create the service.
   */
  public open fun namespaceId(): String? = unwrap(this).getNamespaceId()

  /**
   * The ID of the namespace that was used to create the service.
   */
  public open fun namespaceId(`value`: String) {
    unwrap(this).setNamespaceId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the service.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the service.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the service.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * If present, specifies that the service instances are only discoverable using the
   * `DiscoverInstances` API operation.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * If present, specifies that the service instances are only discoverable using the
   * `DiscoverInstances` API operation.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicediscovery.CfnService].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-description)
     * @param description The description of the service. 
     */
    public fun description(description: String)

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
     * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
     * you want AWS Cloud Map to create when you register an instance. 
     */
    public fun dnsConfig(dnsConfig: IResolvable)

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
     * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
     * you want AWS Cloud Map to create when you register an instance. 
     */
    public fun dnsConfig(dnsConfig: DnsConfigProperty)

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
     * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
     * you want AWS Cloud Map to create when you register an instance. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f002efabd7962ee41501b0c21d1e615b899fe64a0ca2daa0e852ee50a84649fc")
    public fun dnsConfig(dnsConfig: DnsConfigProperty.Builder.() -> Unit)

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
    public fun healthCheckConfig(healthCheckConfig: IResolvable)

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
    public fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac2156a60e1455cc9620b2bd69d1ab3f2693489a2361975f1b938fe49bf58071")
    public fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty.Builder.() -> Unit)

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
    public fun healthCheckCustomConfig(healthCheckCustomConfig: IResolvable)

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
    public fun healthCheckCustomConfig(healthCheckCustomConfig: HealthCheckCustomConfigProperty)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f6de31d733a25e3ecf040986ecff0a18b4ad9a6ba8cbd452732d3e1e91b76ab")
    public
        fun healthCheckCustomConfig(healthCheckCustomConfig: HealthCheckCustomConfigProperty.Builder.() -> Unit)

    /**
     * The name of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-name)
     * @param name The name of the service. 
     */
    public fun name(name: String)

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
    public fun namespaceId(namespaceId: String)

    /**
     * The tags for the service.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-tags)
     * @param tags The tags for the service. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the service.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-tags)
     * @param tags The tags for the service. 
     */
    public fun tags(vararg tags: CfnTag)

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
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.CfnService.Builder =
        software.amazon.awscdk.services.servicediscovery.CfnService.Builder.create(scope, id)

    /**
     * The description of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-description)
     * @param description The description of the service. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

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
     * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
     * you want AWS Cloud Map to create when you register an instance. 
     */
    override fun dnsConfig(dnsConfig: IResolvable) {
      cdkBuilder.dnsConfig(dnsConfig.let(IResolvable::unwrap))
    }

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
     * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
     * you want AWS Cloud Map to create when you register an instance. 
     */
    override fun dnsConfig(dnsConfig: DnsConfigProperty) {
      cdkBuilder.dnsConfig(dnsConfig.let(DnsConfigProperty::unwrap))
    }

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
     * @param dnsConfig A complex type that contains information about the Route 53 DNS records that
     * you want AWS Cloud Map to create when you register an instance. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f002efabd7962ee41501b0c21d1e615b899fe64a0ca2daa0e852ee50a84649fc")
    override fun dnsConfig(dnsConfig: DnsConfigProperty.Builder.() -> Unit): Unit =
        dnsConfig(DnsConfigProperty(dnsConfig))

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
    override fun healthCheckConfig(healthCheckConfig: IResolvable) {
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(IResolvable::unwrap))
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
    override fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty) {
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(HealthCheckConfigProperty::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac2156a60e1455cc9620b2bd69d1ab3f2693489a2361975f1b938fe49bf58071")
    override fun healthCheckConfig(healthCheckConfig: HealthCheckConfigProperty.Builder.() -> Unit):
        Unit = healthCheckConfig(HealthCheckConfigProperty(healthCheckConfig))

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
    override fun healthCheckCustomConfig(healthCheckCustomConfig: IResolvable) {
      cdkBuilder.healthCheckCustomConfig(healthCheckCustomConfig.let(IResolvable::unwrap))
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
    override fun healthCheckCustomConfig(healthCheckCustomConfig: HealthCheckCustomConfigProperty) {
      cdkBuilder.healthCheckCustomConfig(healthCheckCustomConfig.let(HealthCheckCustomConfigProperty::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f6de31d733a25e3ecf040986ecff0a18b4ad9a6ba8cbd452732d3e1e91b76ab")
    override
        fun healthCheckCustomConfig(healthCheckCustomConfig: HealthCheckCustomConfigProperty.Builder.() -> Unit):
        Unit = healthCheckCustomConfig(HealthCheckCustomConfigProperty(healthCheckCustomConfig))

    /**
     * The name of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-name)
     * @param name The name of the service. 
     */
    override fun name(name: String) {
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
    override fun namespaceId(namespaceId: String) {
      cdkBuilder.namespaceId(namespaceId)
    }

    /**
     * The tags for the service.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-tags)
     * @param tags The tags for the service. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the service.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html#cfn-servicediscovery-service-tags)
     * @param tags The tags for the service. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnService =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.servicediscovery.CfnService.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService):
        CfnService = CfnService(cdkObject)

    internal fun unwrap(wrapped: CfnService):
        software.amazon.awscdk.services.servicediscovery.CfnService = wrapped.cdkObject as
        software.amazon.awscdk.services.servicediscovery.CfnService
  }

  /**
   * A complex type that contains information about the Amazon Route 53 DNS records that you want
   * AWS Cloud Map to create when you register an instance.
   *
   *
   * The record types of a service can only be changed by deleting the service and recreating it
   * with a new `Dnsconfig` .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
   * DnsConfigProperty dnsConfigProperty = DnsConfigProperty.builder()
   * .dnsRecords(List.of(DnsRecordProperty.builder()
   * .ttl(123)
   * .type("type")
   * .build()))
   * // the properties below are optional
   * .namespaceId("namespaceId")
   * .routingPolicy("routingPolicy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html)
   */
  public interface DnsConfigProperty {
    /**
     * An array that contains one `DnsRecord` object for each Route 53 DNS record that you want AWS
     * Cloud Map to create when you register an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-dnsrecords)
     */
    public fun dnsRecords(): Any

    /**
     * The ID of the namespace to use for DNS configuration.
     *
     *
     * You must specify a value for `NamespaceId` either for `DnsConfig` or for the [service
     * properties](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html)
     * . Don't specify a value in both places.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-namespaceid)
     */
    public fun namespaceId(): String? = unwrap(this).getNamespaceId()

    /**
     * The routing policy that you want to apply to all Route 53 DNS records that AWS Cloud Map
     * creates when you register an instance and specify this service.
     *
     *
     * If you want to use this service to register instances that create alias records, specify
     * `WEIGHTED` for the routing policy.
     *
     *
     * You can specify the following values:
     *
     * * **MULTIVALUE** - If you define a health check for the service and the health check is
     * healthy, Route 53 returns the applicable value for up to eight instances.
     *
     * For example, suppose that the service includes configurations for one `A` record and a health
     * check. You use the service to register 10 instances. Route 53 responds to DNS queries with IP
     * addresses for up to eight healthy instances. If fewer than eight instances are healthy, Route 53
     * responds to every DNS query with the IP addresses for all of the healthy instances.
     *
     * If you don't define a health check for the service, Route 53 assumes that all instances are
     * healthy and returns the values for up to eight instances.
     *
     * For more information about the multivalue routing policy, see [Multivalue Answer
     * Routing](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-multivalue)
     * in the *Route 53 Developer Guide* .
     *
     * * **WEIGHTED** - Route 53 returns the applicable value from one randomly selected instance
     * from among the instances that you registered using the same service. Currently, all records have
     * the same weight, so you can't route more or less traffic to any instances.
     *
     * For example, suppose that the service includes configurations for one `A` record and a health
     * check. You use the service to register 10 instances. Route 53 responds to DNS queries with the
     * IP address for one randomly selected instance from among the healthy instances. If no instances
     * are healthy, Route 53 responds to DNS queries as if all of the instances were healthy.
     *
     * If you don't define a health check for the service, Route 53 assumes that all instances are
     * healthy and returns the applicable value for one randomly selected instance.
     *
     * For more information about the weighted routing policy, see [Weighted
     * Routing](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted)
     * in the *Route 53 Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-routingpolicy)
     */
    public fun routingPolicy(): String? = unwrap(this).getRoutingPolicy()

    /**
     * A builder for [DnsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dnsRecords An array that contains one `DnsRecord` object for each Route 53 DNS
       * record that you want AWS Cloud Map to create when you register an instance. 
       */
      public fun dnsRecords(dnsRecords: IResolvable)

      /**
       * @param dnsRecords An array that contains one `DnsRecord` object for each Route 53 DNS
       * record that you want AWS Cloud Map to create when you register an instance. 
       */
      public fun dnsRecords(dnsRecords: List<Any>)

      /**
       * @param dnsRecords An array that contains one `DnsRecord` object for each Route 53 DNS
       * record that you want AWS Cloud Map to create when you register an instance. 
       */
      public fun dnsRecords(vararg dnsRecords: Any)

      /**
       * @param namespaceId The ID of the namespace to use for DNS configuration.
       *
       * You must specify a value for `NamespaceId` either for `DnsConfig` or for the [service
       * properties](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html)
       * . Don't specify a value in both places.
       */
      public fun namespaceId(namespaceId: String)

      /**
       * @param routingPolicy The routing policy that you want to apply to all Route 53 DNS records
       * that AWS Cloud Map creates when you register an instance and specify this service.
       *
       * If you want to use this service to register instances that create alias records, specify
       * `WEIGHTED` for the routing policy.
       *
       *
       * You can specify the following values:
       *
       * * **MULTIVALUE** - If you define a health check for the service and the health check is
       * healthy, Route 53 returns the applicable value for up to eight instances.
       *
       * For example, suppose that the service includes configurations for one `A` record and a
       * health check. You use the service to register 10 instances. Route 53 responds to DNS queries
       * with IP addresses for up to eight healthy instances. If fewer than eight instances are
       * healthy, Route 53 responds to every DNS query with the IP addresses for all of the healthy
       * instances.
       *
       * If you don't define a health check for the service, Route 53 assumes that all instances are
       * healthy and returns the values for up to eight instances.
       *
       * For more information about the multivalue routing policy, see [Multivalue Answer
       * Routing](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-multivalue)
       * in the *Route 53 Developer Guide* .
       *
       * * **WEIGHTED** - Route 53 returns the applicable value from one randomly selected instance
       * from among the instances that you registered using the same service. Currently, all records
       * have the same weight, so you can't route more or less traffic to any instances.
       *
       * For example, suppose that the service includes configurations for one `A` record and a
       * health check. You use the service to register 10 instances. Route 53 responds to DNS queries
       * with the IP address for one randomly selected instance from among the healthy instances. If no
       * instances are healthy, Route 53 responds to DNS queries as if all of the instances were
       * healthy.
       *
       * If you don't define a health check for the service, Route 53 assumes that all instances are
       * healthy and returns the applicable value for one randomly selected instance.
       *
       * For more information about the weighted routing policy, see [Weighted
       * Routing](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted)
       * in the *Route 53 Developer Guide* .
       */
      public fun routingPolicy(routingPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty.Builder =
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty.builder()

      /**
       * @param dnsRecords An array that contains one `DnsRecord` object for each Route 53 DNS
       * record that you want AWS Cloud Map to create when you register an instance. 
       */
      override fun dnsRecords(dnsRecords: IResolvable) {
        cdkBuilder.dnsRecords(dnsRecords.let(IResolvable::unwrap))
      }

      /**
       * @param dnsRecords An array that contains one `DnsRecord` object for each Route 53 DNS
       * record that you want AWS Cloud Map to create when you register an instance. 
       */
      override fun dnsRecords(dnsRecords: List<Any>) {
        cdkBuilder.dnsRecords(dnsRecords.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param dnsRecords An array that contains one `DnsRecord` object for each Route 53 DNS
       * record that you want AWS Cloud Map to create when you register an instance. 
       */
      override fun dnsRecords(vararg dnsRecords: Any): Unit = dnsRecords(dnsRecords.toList())

      /**
       * @param namespaceId The ID of the namespace to use for DNS configuration.
       *
       * You must specify a value for `NamespaceId` either for `DnsConfig` or for the [service
       * properties](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html)
       * . Don't specify a value in both places.
       */
      override fun namespaceId(namespaceId: String) {
        cdkBuilder.namespaceId(namespaceId)
      }

      /**
       * @param routingPolicy The routing policy that you want to apply to all Route 53 DNS records
       * that AWS Cloud Map creates when you register an instance and specify this service.
       *
       * If you want to use this service to register instances that create alias records, specify
       * `WEIGHTED` for the routing policy.
       *
       *
       * You can specify the following values:
       *
       * * **MULTIVALUE** - If you define a health check for the service and the health check is
       * healthy, Route 53 returns the applicable value for up to eight instances.
       *
       * For example, suppose that the service includes configurations for one `A` record and a
       * health check. You use the service to register 10 instances. Route 53 responds to DNS queries
       * with IP addresses for up to eight healthy instances. If fewer than eight instances are
       * healthy, Route 53 responds to every DNS query with the IP addresses for all of the healthy
       * instances.
       *
       * If you don't define a health check for the service, Route 53 assumes that all instances are
       * healthy and returns the values for up to eight instances.
       *
       * For more information about the multivalue routing policy, see [Multivalue Answer
       * Routing](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-multivalue)
       * in the *Route 53 Developer Guide* .
       *
       * * **WEIGHTED** - Route 53 returns the applicable value from one randomly selected instance
       * from among the instances that you registered using the same service. Currently, all records
       * have the same weight, so you can't route more or less traffic to any instances.
       *
       * For example, suppose that the service includes configurations for one `A` record and a
       * health check. You use the service to register 10 instances. Route 53 responds to DNS queries
       * with the IP address for one randomly selected instance from among the healthy instances. If no
       * instances are healthy, Route 53 responds to DNS queries as if all of the instances were
       * healthy.
       *
       * If you don't define a health check for the service, Route 53 assumes that all instances are
       * healthy and returns the applicable value for one randomly selected instance.
       *
       * For more information about the weighted routing policy, see [Weighted
       * Routing](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted)
       * in the *Route 53 Developer Guide* .
       */
      override fun routingPolicy(routingPolicy: String) {
        cdkBuilder.routingPolicy(routingPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty,
    ) : CdkObject(cdkObject), DnsConfigProperty {
      /**
       * An array that contains one `DnsRecord` object for each Route 53 DNS record that you want
       * AWS Cloud Map to create when you register an instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-dnsrecords)
       */
      override fun dnsRecords(): Any = unwrap(this).getDnsRecords()

      /**
       * The ID of the namespace to use for DNS configuration.
       *
       *
       * You must specify a value for `NamespaceId` either for `DnsConfig` or for the [service
       * properties](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-service.html)
       * . Don't specify a value in both places.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-namespaceid)
       */
      override fun namespaceId(): String? = unwrap(this).getNamespaceId()

      /**
       * The routing policy that you want to apply to all Route 53 DNS records that AWS Cloud Map
       * creates when you register an instance and specify this service.
       *
       *
       * If you want to use this service to register instances that create alias records, specify
       * `WEIGHTED` for the routing policy.
       *
       *
       * You can specify the following values:
       *
       * * **MULTIVALUE** - If you define a health check for the service and the health check is
       * healthy, Route 53 returns the applicable value for up to eight instances.
       *
       * For example, suppose that the service includes configurations for one `A` record and a
       * health check. You use the service to register 10 instances. Route 53 responds to DNS queries
       * with IP addresses for up to eight healthy instances. If fewer than eight instances are
       * healthy, Route 53 responds to every DNS query with the IP addresses for all of the healthy
       * instances.
       *
       * If you don't define a health check for the service, Route 53 assumes that all instances are
       * healthy and returns the values for up to eight instances.
       *
       * For more information about the multivalue routing policy, see [Multivalue Answer
       * Routing](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-multivalue)
       * in the *Route 53 Developer Guide* .
       *
       * * **WEIGHTED** - Route 53 returns the applicable value from one randomly selected instance
       * from among the instances that you registered using the same service. Currently, all records
       * have the same weight, so you can't route more or less traffic to any instances.
       *
       * For example, suppose that the service includes configurations for one `A` record and a
       * health check. You use the service to register 10 instances. Route 53 responds to DNS queries
       * with the IP address for one randomly selected instance from among the healthy instances. If no
       * instances are healthy, Route 53 responds to DNS queries as if all of the instances were
       * healthy.
       *
       * If you don't define a health check for the service, Route 53 assumes that all instances are
       * healthy and returns the applicable value for one randomly selected instance.
       *
       * For more information about the weighted routing policy, see [Weighted
       * Routing](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted)
       * in the *Route 53 Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-routingpolicy)
       */
      override fun routingPolicy(): String? = unwrap(this).getRoutingPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DnsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty):
          DnsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? DnsConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DnsConfigProperty):
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty
    }
  }

  /**
   * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud
   * Map to create when you register an instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
   * DnsRecordProperty dnsRecordProperty = DnsRecordProperty.builder()
   * .ttl(123)
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html)
   */
  public interface DnsRecordProperty {
    /**
     * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this
     * record.
     *
     *
     * Alias records don't include a TTL because Route 53 uses the TTL for the AWS resource that an
     * alias record routes traffic to. If you include the `AWS_ALIAS_DNS_NAME` attribute when you
     * submit a
     * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html)
     * request, the `TTL` value is ignored. Always specify a TTL for the service; you can use a service
     * to register instances that create either alias or non-alias records.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-ttl)
     */
    public fun ttl(): Number

    /**
     * The type of the resource, which indicates the type of value that Route 53 returns in response
     * to DNS queries.
     *
     * You can specify values for `Type` in the following combinations:
     *
     * * `A`
     * * `AAAA`
     * * `A` and `AAAA`
     * * `SRV`
     * * `CNAME`
     *
     * If you want AWS Cloud Map to create a Route 53 alias record when you register an instance,
     * specify `A` or `AAAA` for `Type` .
     *
     * You specify other settings, such as the IP address for `A` and `AAAA` records, when you
     * register an instance. For more information, see
     * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html) .
     *
     * The following values are supported:
     *
     * * **A** - Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     * * **AAAA** - Route 53 returns the IP address of the resource in IPv6 format, such as
     * 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * * **CNAME** - Route 53 returns the domain name of the resource, such as www.example.com. Note
     * the following:
     * * You specify the domain name that you want to route traffic to when you register an
     * instance. For more information, see
     * [Attributes](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#cloudmap-RegisterInstance-request-Attributes)
     * in the topic
     * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html) .
     * * You must specify `WEIGHTED` for the value of `RoutingPolicy` .
     * * You can't specify both `CNAME` for `Type` and settings for `HealthCheckConfig` . If you do,
     * the request will fail with an `InvalidInput` error.
     * * **SRV** - Route 53 returns the value for an `SRV` record. The value for an `SRV` record
     * uses the following values:
     *
     * `priority weight port service-hostname`
     *
     * Note the following about the values:
     *
     * * The values of `priority` and `weight` are both set to `1` and can't be changed.
     * * The value of `port` comes from the value that you specify for the `AWS_INSTANCE_PORT`
     * attribute when you submit a
     * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html)
     * request.
     * * The value of `service-hostname` is a concatenation of the following values:
     * * The value that you specify for `InstanceId` when you register an instance.
     * * The name of the service.
     * * The name of the namespace.
     *
     * For example, if the value of `InstanceId` is `test` , the name of the service is `backend` ,
     * and the name of the namespace is `example.com` , the value of `service-hostname` is:
     *
     * `test.backend.example.com`
     *
     * If you specify settings for an `SRV` record and if you specify values for `AWS_INSTANCE_IPV4`
     * , `AWS_INSTANCE_IPV6` , or both in the `RegisterInstance` request, AWS Cloud Map automatically
     * creates `A` and/or `AAAA` records that have the same name as the value of `service-hostname` in
     * the `SRV` record. You can ignore these records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-type)
     */
    public fun type(): String

    /**
     * A builder for [DnsRecordProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ttl The amount of time, in seconds, that you want DNS resolvers to cache the
       * settings for this record. 
       *
       * Alias records don't include a TTL because Route 53 uses the TTL for the AWS resource that
       * an alias record routes traffic to. If you include the `AWS_ALIAS_DNS_NAME` attribute when you
       * submit a
       * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html)
       * request, the `TTL` value is ignored. Always specify a TTL for the service; you can use a
       * service to register instances that create either alias or non-alias records.
       */
      public fun ttl(ttl: Number)

      /**
       * @param type The type of the resource, which indicates the type of value that Route 53
       * returns in response to DNS queries. 
       * You can specify values for `Type` in the following combinations:
       *
       * * `A`
       * * `AAAA`
       * * `A` and `AAAA`
       * * `SRV`
       * * `CNAME`
       *
       * If you want AWS Cloud Map to create a Route 53 alias record when you register an instance,
       * specify `A` or `AAAA` for `Type` .
       *
       * You specify other settings, such as the IP address for `A` and `AAAA` records, when you
       * register an instance. For more information, see
       * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html)
       * .
       *
       * The following values are supported:
       *
       * * **A** - Route 53 returns the IP address of the resource in IPv4 format, such as
       * 192.0.2.44.
       * * **AAAA** - Route 53 returns the IP address of the resource in IPv6 format, such as
       * 2001:0db8:85a3:0000:0000:abcd:0001:2345.
       * * **CNAME** - Route 53 returns the domain name of the resource, such as www.example.com.
       * Note the following:
       * * You specify the domain name that you want to route traffic to when you register an
       * instance. For more information, see
       * [Attributes](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#cloudmap-RegisterInstance-request-Attributes)
       * in the topic
       * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html)
       * .
       * * You must specify `WEIGHTED` for the value of `RoutingPolicy` .
       * * You can't specify both `CNAME` for `Type` and settings for `HealthCheckConfig` . If you
       * do, the request will fail with an `InvalidInput` error.
       * * **SRV** - Route 53 returns the value for an `SRV` record. The value for an `SRV` record
       * uses the following values:
       *
       * `priority weight port service-hostname`
       *
       * Note the following about the values:
       *
       * * The values of `priority` and `weight` are both set to `1` and can't be changed.
       * * The value of `port` comes from the value that you specify for the `AWS_INSTANCE_PORT`
       * attribute when you submit a
       * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html)
       * request.
       * * The value of `service-hostname` is a concatenation of the following values:
       * * The value that you specify for `InstanceId` when you register an instance.
       * * The name of the service.
       * * The name of the namespace.
       *
       * For example, if the value of `InstanceId` is `test` , the name of the service is `backend`
       * , and the name of the namespace is `example.com` , the value of `service-hostname` is:
       *
       * `test.backend.example.com`
       *
       * If you specify settings for an `SRV` record and if you specify values for
       * `AWS_INSTANCE_IPV4` , `AWS_INSTANCE_IPV6` , or both in the `RegisterInstance` request, AWS
       * Cloud Map automatically creates `A` and/or `AAAA` records that have the same name as the value
       * of `service-hostname` in the `SRV` record. You can ignore these records.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty.Builder =
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty.builder()

      /**
       * @param ttl The amount of time, in seconds, that you want DNS resolvers to cache the
       * settings for this record. 
       *
       * Alias records don't include a TTL because Route 53 uses the TTL for the AWS resource that
       * an alias record routes traffic to. If you include the `AWS_ALIAS_DNS_NAME` attribute when you
       * submit a
       * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html)
       * request, the `TTL` value is ignored. Always specify a TTL for the service; you can use a
       * service to register instances that create either alias or non-alias records.
       */
      override fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
      }

      /**
       * @param type The type of the resource, which indicates the type of value that Route 53
       * returns in response to DNS queries. 
       * You can specify values for `Type` in the following combinations:
       *
       * * `A`
       * * `AAAA`
       * * `A` and `AAAA`
       * * `SRV`
       * * `CNAME`
       *
       * If you want AWS Cloud Map to create a Route 53 alias record when you register an instance,
       * specify `A` or `AAAA` for `Type` .
       *
       * You specify other settings, such as the IP address for `A` and `AAAA` records, when you
       * register an instance. For more information, see
       * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html)
       * .
       *
       * The following values are supported:
       *
       * * **A** - Route 53 returns the IP address of the resource in IPv4 format, such as
       * 192.0.2.44.
       * * **AAAA** - Route 53 returns the IP address of the resource in IPv6 format, such as
       * 2001:0db8:85a3:0000:0000:abcd:0001:2345.
       * * **CNAME** - Route 53 returns the domain name of the resource, such as www.example.com.
       * Note the following:
       * * You specify the domain name that you want to route traffic to when you register an
       * instance. For more information, see
       * [Attributes](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#cloudmap-RegisterInstance-request-Attributes)
       * in the topic
       * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html)
       * .
       * * You must specify `WEIGHTED` for the value of `RoutingPolicy` .
       * * You can't specify both `CNAME` for `Type` and settings for `HealthCheckConfig` . If you
       * do, the request will fail with an `InvalidInput` error.
       * * **SRV** - Route 53 returns the value for an `SRV` record. The value for an `SRV` record
       * uses the following values:
       *
       * `priority weight port service-hostname`
       *
       * Note the following about the values:
       *
       * * The values of `priority` and `weight` are both set to `1` and can't be changed.
       * * The value of `port` comes from the value that you specify for the `AWS_INSTANCE_PORT`
       * attribute when you submit a
       * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html)
       * request.
       * * The value of `service-hostname` is a concatenation of the following values:
       * * The value that you specify for `InstanceId` when you register an instance.
       * * The name of the service.
       * * The name of the namespace.
       *
       * For example, if the value of `InstanceId` is `test` , the name of the service is `backend`
       * , and the name of the namespace is `example.com` , the value of `service-hostname` is:
       *
       * `test.backend.example.com`
       *
       * If you specify settings for an `SRV` record and if you specify values for
       * `AWS_INSTANCE_IPV4` , `AWS_INSTANCE_IPV6` , or both in the `RegisterInstance` request, AWS
       * Cloud Map automatically creates `A` and/or `AAAA` records that have the same name as the value
       * of `service-hostname` in the `SRV` record. You can ignore these records.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty,
    ) : CdkObject(cdkObject), DnsRecordProperty {
      /**
       * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this
       * record.
       *
       *
       * Alias records don't include a TTL because Route 53 uses the TTL for the AWS resource that
       * an alias record routes traffic to. If you include the `AWS_ALIAS_DNS_NAME` attribute when you
       * submit a
       * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html)
       * request, the `TTL` value is ignored. Always specify a TTL for the service; you can use a
       * service to register instances that create either alias or non-alias records.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-ttl)
       */
      override fun ttl(): Number = unwrap(this).getTtl()

      /**
       * The type of the resource, which indicates the type of value that Route 53 returns in
       * response to DNS queries.
       *
       * You can specify values for `Type` in the following combinations:
       *
       * * `A`
       * * `AAAA`
       * * `A` and `AAAA`
       * * `SRV`
       * * `CNAME`
       *
       * If you want AWS Cloud Map to create a Route 53 alias record when you register an instance,
       * specify `A` or `AAAA` for `Type` .
       *
       * You specify other settings, such as the IP address for `A` and `AAAA` records, when you
       * register an instance. For more information, see
       * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html)
       * .
       *
       * The following values are supported:
       *
       * * **A** - Route 53 returns the IP address of the resource in IPv4 format, such as
       * 192.0.2.44.
       * * **AAAA** - Route 53 returns the IP address of the resource in IPv6 format, such as
       * 2001:0db8:85a3:0000:0000:abcd:0001:2345.
       * * **CNAME** - Route 53 returns the domain name of the resource, such as www.example.com.
       * Note the following:
       * * You specify the domain name that you want to route traffic to when you register an
       * instance. For more information, see
       * [Attributes](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#cloudmap-RegisterInstance-request-Attributes)
       * in the topic
       * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html)
       * .
       * * You must specify `WEIGHTED` for the value of `RoutingPolicy` .
       * * You can't specify both `CNAME` for `Type` and settings for `HealthCheckConfig` . If you
       * do, the request will fail with an `InvalidInput` error.
       * * **SRV** - Route 53 returns the value for an `SRV` record. The value for an `SRV` record
       * uses the following values:
       *
       * `priority weight port service-hostname`
       *
       * Note the following about the values:
       *
       * * The values of `priority` and `weight` are both set to `1` and can't be changed.
       * * The value of `port` comes from the value that you specify for the `AWS_INSTANCE_PORT`
       * attribute when you submit a
       * [RegisterInstance](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html)
       * request.
       * * The value of `service-hostname` is a concatenation of the following values:
       * * The value that you specify for `InstanceId` when you register an instance.
       * * The name of the service.
       * * The name of the namespace.
       *
       * For example, if the value of `InstanceId` is `test` , the name of the service is `backend`
       * , and the name of the namespace is `example.com` , the value of `service-hostname` is:
       *
       * `test.backend.example.com`
       *
       * If you specify settings for an `SRV` record and if you specify values for
       * `AWS_INSTANCE_IPV4` , `AWS_INSTANCE_IPV6` , or both in the `RegisterInstance` request, AWS
       * Cloud Map automatically creates `A` and/or `AAAA` records that have the same name as the value
       * of `service-hostname` in the `SRV` record. You can ignore these records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DnsRecordProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty):
          DnsRecordProperty = CdkObjectWrappers.wrap(cdkObject) as? DnsRecordProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DnsRecordProperty):
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicediscovery.CfnService.DnsRecordProperty
    }
  }

  /**
   * *Public DNS and HTTP namespaces only.* A complex type that contains settings for an optional
   * health check. If you specify settings for a health check, AWS Cloud Map associates the health
   * check with the records that you specify in `DnsConfig` .
   *
   *
   * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
   * or `HealthCheckConfig` but not both.
   *
   *
   * Health checks are basic Route 53 health checks that monitor an AWS endpoint. For information
   * about pricing for health checks, see [Amazon Route 53
   * Pricing](https://docs.aws.amazon.com/route53/pricing/) .
   *
   * Note the following about configuring health checks.
   *
   * * **A and AAAA records** - If `DnsConfig` includes configurations for both `A` and `AAAA`
   * records, AWS Cloud Map creates a health check that uses the IPv4 address to check the health of
   * the resource. If the endpoint tthat's specified by the IPv4 address is unhealthy, Route 53
   * considers both the `A` and `AAAA` records to be unhealthy.
   * * **CNAME records** - You can't specify settings for `HealthCheckConfig` when the `DNSConfig`
   * includes `CNAME` for the value of `Type` . If you do, the `CreateService` request will fail with
   * an `InvalidInput` error.
   * * **Request interval** - A Route 53 health checker in each health-checking AWS Region sends a
   * health check request to an endpoint every 30 seconds. On average, your endpoint receives a health
   * check request about every two seconds. However, health checkers don't coordinate with one another.
   * Therefore, you might sometimes see several requests in one second that's followed by a few seconds
   * with no health checks at all.
   * * **Health checking regions** - Health checkers perform checks from all Route 53
   * health-checking Regions. For a list of the current Regions, see
   * [Regions](https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html#Route53-Type-HealthCheckConfig-Regions)
   * .
   * * **Alias records** - When you register an instance, if you include the `AWS_ALIAS_DNS_NAME`
   * attribute, AWS Cloud Map creates a Route 53 alias record. Note the following:
   * * Route 53 automatically sets `EvaluateTargetHealth` to true for alias records. When
   * `EvaluateTargetHealth` is true, the alias record inherits the health of the referenced AWS
   * resource. such as an ELB load balancer. For more information, see
   * [EvaluateTargetHealth](https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-EvaluateTargetHealth)
   * .
   * * If you include `HealthCheckConfig` and then use the service to register an instance that
   * creates an alias record, Route 53 doesn't create the health check.
   * * **Charges for health checks** - Health checks are basic Route 53 health checks that monitor
   * an AWS endpoint. For information about pricing for health checks, see [Amazon Route 53
   * Pricing](https://docs.aws.amazon.com/route53/pricing/) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
   * HealthCheckConfigProperty healthCheckConfigProperty = HealthCheckConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .failureThreshold(123)
   * .resourcePath("resourcePath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html)
   */
  public interface HealthCheckConfigProperty {
    /**
     * The number of consecutive health checks that an endpoint must pass or fail for Route 53 to
     * change the current status of the endpoint from unhealthy to healthy or the other way around.
     *
     * For more information, see [How Route 53 Determines Whether an Endpoint Is
     * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
     * in the *Route 53 Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-failurethreshold)
     */
    public fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

    /**
     * The path that you want Route 53 to request when performing health checks.
     *
     * The path can be any value that your endpoint returns an HTTP status code of a 2xx or 3xx
     * format for when the endpoint is healthy. An example file is `/docs/route53-health-check.html` .
     * Route 53 automatically adds the DNS name for the service. If you don't specify a value for
     * `ResourcePath` , the default value is `/` .
     *
     * If you specify `TCP` for `Type` , you must *not* specify a value for `ResourcePath` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-resourcepath)
     */
    public fun resourcePath(): String? = unwrap(this).getResourcePath()

    /**
     * The type of health check that you want to create, which indicates how Route 53 determines
     * whether an endpoint is healthy.
     *
     *
     * You can't change the value of `Type` after you create a health check.
     *
     *
     * You can create the following types of health checks:
     *
     * * *HTTP* : Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     * HTTP request and waits for an HTTP status code of 200 or greater and less than 400.
     * * *HTTPS* : Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     * HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.
     *
     *
     * If you specify HTTPS for the value of `Type` , the endpoint must support TLS v1.0 or later.
     *
     *
     * * *TCP* : Route 53 tries to establish a TCP connection.
     *
     * If you specify `TCP` for `Type` , don't specify a value for `ResourcePath` .
     *
     * For more information, see [How Route 53 Determines Whether an Endpoint Is
     * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
     * in the *Route 53 Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-type)
     */
    public fun type(): String

    /**
     * A builder for [HealthCheckConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param failureThreshold The number of consecutive health checks that an endpoint must pass
       * or fail for Route 53 to change the current status of the endpoint from unhealthy to healthy or
       * the other way around.
       * For more information, see [How Route 53 Determines Whether an Endpoint Is
       * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
       * in the *Route 53 Developer Guide* .
       */
      public fun failureThreshold(failureThreshold: Number)

      /**
       * @param resourcePath The path that you want Route 53 to request when performing health
       * checks.
       * The path can be any value that your endpoint returns an HTTP status code of a 2xx or 3xx
       * format for when the endpoint is healthy. An example file is `/docs/route53-health-check.html`
       * . Route 53 automatically adds the DNS name for the service. If you don't specify a value for
       * `ResourcePath` , the default value is `/` .
       *
       * If you specify `TCP` for `Type` , you must *not* specify a value for `ResourcePath` .
       */
      public fun resourcePath(resourcePath: String)

      /**
       * @param type The type of health check that you want to create, which indicates how Route 53
       * determines whether an endpoint is healthy. 
       *
       * You can't change the value of `Type` after you create a health check.
       *
       *
       * You can create the following types of health checks:
       *
       * * *HTTP* : Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
       * HTTP request and waits for an HTTP status code of 200 or greater and less than 400.
       * * *HTTPS* : Route 53 tries to establish a TCP connection. If successful, Route 53 submits
       * an HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.
       *
       *
       * If you specify HTTPS for the value of `Type` , the endpoint must support TLS v1.0 or later.
       *
       *
       * * *TCP* : Route 53 tries to establish a TCP connection.
       *
       * If you specify `TCP` for `Type` , don't specify a value for `ResourcePath` .
       *
       * For more information, see [How Route 53 Determines Whether an Endpoint Is
       * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
       * in the *Route 53 Developer Guide* .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty.builder()

      /**
       * @param failureThreshold The number of consecutive health checks that an endpoint must pass
       * or fail for Route 53 to change the current status of the endpoint from unhealthy to healthy or
       * the other way around.
       * For more information, see [How Route 53 Determines Whether an Endpoint Is
       * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
       * in the *Route 53 Developer Guide* .
       */
      override fun failureThreshold(failureThreshold: Number) {
        cdkBuilder.failureThreshold(failureThreshold)
      }

      /**
       * @param resourcePath The path that you want Route 53 to request when performing health
       * checks.
       * The path can be any value that your endpoint returns an HTTP status code of a 2xx or 3xx
       * format for when the endpoint is healthy. An example file is `/docs/route53-health-check.html`
       * . Route 53 automatically adds the DNS name for the service. If you don't specify a value for
       * `ResourcePath` , the default value is `/` .
       *
       * If you specify `TCP` for `Type` , you must *not* specify a value for `ResourcePath` .
       */
      override fun resourcePath(resourcePath: String) {
        cdkBuilder.resourcePath(resourcePath)
      }

      /**
       * @param type The type of health check that you want to create, which indicates how Route 53
       * determines whether an endpoint is healthy. 
       *
       * You can't change the value of `Type` after you create a health check.
       *
       *
       * You can create the following types of health checks:
       *
       * * *HTTP* : Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
       * HTTP request and waits for an HTTP status code of 200 or greater and less than 400.
       * * *HTTPS* : Route 53 tries to establish a TCP connection. If successful, Route 53 submits
       * an HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.
       *
       *
       * If you specify HTTPS for the value of `Type` , the endpoint must support TLS v1.0 or later.
       *
       *
       * * *TCP* : Route 53 tries to establish a TCP connection.
       *
       * If you specify `TCP` for `Type` , don't specify a value for `ResourcePath` .
       *
       * For more information, see [How Route 53 Determines Whether an Endpoint Is
       * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
       * in the *Route 53 Developer Guide* .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty,
    ) : CdkObject(cdkObject), HealthCheckConfigProperty {
      /**
       * The number of consecutive health checks that an endpoint must pass or fail for Route 53 to
       * change the current status of the endpoint from unhealthy to healthy or the other way around.
       *
       * For more information, see [How Route 53 Determines Whether an Endpoint Is
       * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
       * in the *Route 53 Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-failurethreshold)
       */
      override fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

      /**
       * The path that you want Route 53 to request when performing health checks.
       *
       * The path can be any value that your endpoint returns an HTTP status code of a 2xx or 3xx
       * format for when the endpoint is healthy. An example file is `/docs/route53-health-check.html`
       * . Route 53 automatically adds the DNS name for the service. If you don't specify a value for
       * `ResourcePath` , the default value is `/` .
       *
       * If you specify `TCP` for `Type` , you must *not* specify a value for `ResourcePath` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-resourcepath)
       */
      override fun resourcePath(): String? = unwrap(this).getResourcePath()

      /**
       * The type of health check that you want to create, which indicates how Route 53 determines
       * whether an endpoint is healthy.
       *
       *
       * You can't change the value of `Type` after you create a health check.
       *
       *
       * You can create the following types of health checks:
       *
       * * *HTTP* : Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
       * HTTP request and waits for an HTTP status code of 200 or greater and less than 400.
       * * *HTTPS* : Route 53 tries to establish a TCP connection. If successful, Route 53 submits
       * an HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.
       *
       *
       * If you specify HTTPS for the value of `Type` , the endpoint must support TLS v1.0 or later.
       *
       *
       * * *TCP* : Route 53 tries to establish a TCP connection.
       *
       * If you specify `TCP` for `Type` , don't specify a value for `ResourcePath` .
       *
       * For more information, see [How Route 53 Determines Whether an Endpoint Is
       * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
       * in the *Route 53 Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckconfig.html#cfn-servicediscovery-service-healthcheckconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty):
          HealthCheckConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HealthCheckConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckConfigProperty):
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty
    }
  }

  /**
   * A complex type that contains information about an optional custom health check.
   *
   * A custom health check, which requires that you use a third-party health checker to evaluate the
   * health of your resources, is useful in the following circumstances:
   *
   * * You can't use a health check that's defined by `HealthCheckConfig` because the resource isn't
   * available over the internet. For example, you can use a custom health check when the instance is
   * in an Amazon VPC. (To check the health of resources in a VPC, the health checker must also be in
   * the VPC.)
   * * You want to use a third-party health checker regardless of where your resources are located.
   *
   *
   * If you specify a health check configuration, you can specify either `HealthCheckCustomConfig`
   * or `HealthCheckConfig` but not both.
   *
   *
   * To change the status of a custom health check, submit an `UpdateInstanceCustomHealthStatus`
   * request. AWS Cloud Map doesn't monitor the status of the resource, it just keeps a record of the
   * status specified in the most recent `UpdateInstanceCustomHealthStatus` request.
   *
   * Here's how custom health checks work:
   *
   * * You create a service.
   * * You register an instance.
   * * You configure a third-party health checker to monitor the resource that's associated with the
   * new instance.
   *
   *
   * AWS Cloud Map doesn't check the health of the resource directly.
   *
   *
   * * The third-party health-checker determines that the resource is unhealthy and notifies your
   * application.
   * * Your application submits an `UpdateInstanceCustomHealthStatus` request.
   * * AWS Cloud Map waits for 30 seconds.
   * * If another `UpdateInstanceCustomHealthStatus` request doesn't arrive during that time to
   * change the status back to healthy, AWS Cloud Map stops routing traffic to the resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
   * HealthCheckCustomConfigProperty healthCheckCustomConfigProperty =
   * HealthCheckCustomConfigProperty.builder()
   * .failureThreshold(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html)
   */
  public interface HealthCheckCustomConfigProperty {
    /**
     * This parameter is no longer supported and is always set to 1.
     *
     * AWS Cloud Map waits for approximately 30 seconds after receiving an
     * `UpdateInstanceCustomHealthStatus` request before changing the status of the service instance.
     *
     * The number of 30-second intervals that you want AWS Cloud Map to wait after receiving an
     * `UpdateInstanceCustomHealthStatus` request before it changes the health status of a service
     * instance.
     *
     * Sending a second or subsequent `UpdateInstanceCustomHealthStatus` request with the same value
     * before 30 seconds has passed doesn't accelerate the change. AWS Cloud Map still waits `30`
     * seconds after the first request to make the change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html#cfn-servicediscovery-service-healthcheckcustomconfig-failurethreshold)
     */
    public fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()

    /**
     * A builder for [HealthCheckCustomConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param failureThreshold This parameter is no longer supported and is always set to 1.
       * AWS Cloud Map waits for approximately 30 seconds after receiving an
       * `UpdateInstanceCustomHealthStatus` request before changing the status of the service instance.
       *
       * The number of 30-second intervals that you want AWS Cloud Map to wait after receiving an
       * `UpdateInstanceCustomHealthStatus` request before it changes the health status of a service
       * instance.
       *
       * Sending a second or subsequent `UpdateInstanceCustomHealthStatus` request with the same
       * value before 30 seconds has passed doesn't accelerate the change. AWS Cloud Map still waits
       * `30` seconds after the first request to make the change.
       */
      public fun failureThreshold(failureThreshold: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty.Builder
          =
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty.builder()

      /**
       * @param failureThreshold This parameter is no longer supported and is always set to 1.
       * AWS Cloud Map waits for approximately 30 seconds after receiving an
       * `UpdateInstanceCustomHealthStatus` request before changing the status of the service instance.
       *
       * The number of 30-second intervals that you want AWS Cloud Map to wait after receiving an
       * `UpdateInstanceCustomHealthStatus` request before it changes the health status of a service
       * instance.
       *
       * Sending a second or subsequent `UpdateInstanceCustomHealthStatus` request with the same
       * value before 30 seconds has passed doesn't accelerate the change. AWS Cloud Map still waits
       * `30` seconds after the first request to make the change.
       */
      override fun failureThreshold(failureThreshold: Number) {
        cdkBuilder.failureThreshold(failureThreshold)
      }

      public fun build():
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty,
    ) : CdkObject(cdkObject), HealthCheckCustomConfigProperty {
      /**
       * This parameter is no longer supported and is always set to 1.
       *
       * AWS Cloud Map waits for approximately 30 seconds after receiving an
       * `UpdateInstanceCustomHealthStatus` request before changing the status of the service instance.
       *
       * The number of 30-second intervals that you want AWS Cloud Map to wait after receiving an
       * `UpdateInstanceCustomHealthStatus` request before it changes the health status of a service
       * instance.
       *
       * Sending a second or subsequent `UpdateInstanceCustomHealthStatus` request with the same
       * value before 30 seconds has passed doesn't accelerate the change. AWS Cloud Map still waits
       * `30` seconds after the first request to make the change.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-healthcheckcustomconfig.html#cfn-servicediscovery-service-healthcheckcustomconfig-failurethreshold)
       */
      override fun failureThreshold(): Number? = unwrap(this).getFailureThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckCustomConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty):
          HealthCheckCustomConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HealthCheckCustomConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckCustomConfigProperty):
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty
    }
  }
}
