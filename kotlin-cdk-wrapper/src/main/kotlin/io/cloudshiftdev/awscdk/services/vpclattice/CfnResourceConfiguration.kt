@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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
 * Creates a resource configuration.
 *
 * A resource configuration defines a specific resource. You can associate a resource configuration
 * with a service network or a VPC endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnResourceConfiguration cfnResourceConfiguration = CfnResourceConfiguration.Builder.create(this,
 * "MyCfnResourceConfiguration")
 * .name("name")
 * .resourceConfigurationType("resourceConfigurationType")
 * // the properties below are optional
 * .allowAssociationToSharableServiceNetwork(false)
 * .portRanges(List.of("portRanges"))
 * .protocolType("protocolType")
 * .resourceConfigurationAuthType("resourceConfigurationAuthType")
 * .resourceConfigurationDefinition(ResourceConfigurationDefinitionProperty.builder()
 * .arnResource("arnResource")
 * .dnsResource(DnsResourceProperty.builder()
 * .domainName("domainName")
 * .ipAddressType("ipAddressType")
 * .build())
 * .ipResource("ipResource")
 * .build())
 * .resourceConfigurationGroupId("resourceConfigurationGroupId")
 * .resourceGatewayId("resourceGatewayId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html)
 */
public open class CfnResourceConfiguration(
  cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnResourceConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResourceConfigurationProps(props)
  )

  /**
   * Specifies whether the resource configuration can be associated with a sharable service network.
   */
  public open fun allowAssociationToSharableServiceNetwork(): Any? =
      unwrap(this).getAllowAssociationToSharableServiceNetwork()

  /**
   * Specifies whether the resource configuration can be associated with a sharable service network.
   */
  public open fun allowAssociationToSharableServiceNetwork(`value`: Boolean) {
    unwrap(this).setAllowAssociationToSharableServiceNetwork(`value`)
  }

  /**
   * Specifies whether the resource configuration can be associated with a sharable service network.
   */
  public open fun allowAssociationToSharableServiceNetwork(`value`: IResolvable) {
    unwrap(this).setAllowAssociationToSharableServiceNetwork(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the resource configuration.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the resource configuration.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the resource configuration.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the resource configuration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to access a resource
   * configuration (for example: 1-65535).
   */
  public open fun portRanges(): List<String> = unwrap(this).getPortRanges() ?: emptyList()

  /**
   * (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to access a resource
   * configuration (for example: 1-65535).
   */
  public open fun portRanges(`value`: List<String>) {
    unwrap(this).setPortRanges(`value`)
  }

  /**
   * (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to access a resource
   * configuration (for example: 1-65535).
   */
  public open fun portRanges(vararg `value`: String): Unit = portRanges(`value`.toList())

  /**
   * (SINGLE, GROUP) The protocol accepted by the resource configuration.
   */
  public open fun protocolType(): String? = unwrap(this).getProtocolType()

  /**
   * (SINGLE, GROUP) The protocol accepted by the resource configuration.
   */
  public open fun protocolType(`value`: String) {
    unwrap(this).setProtocolType(`value`)
  }

  /**
   * The auth type for the resource configuration.
   */
  public open fun resourceConfigurationAuthType(): String? =
      unwrap(this).getResourceConfigurationAuthType()

  /**
   * The auth type for the resource configuration.
   */
  public open fun resourceConfigurationAuthType(`value`: String) {
    unwrap(this).setResourceConfigurationAuthType(`value`)
  }

  /**
   * Identifies the resource configuration in one of the following ways:.
   */
  public open fun resourceConfigurationDefinition(): Any? =
      unwrap(this).getResourceConfigurationDefinition()

  /**
   * Identifies the resource configuration in one of the following ways:.
   */
  public open fun resourceConfigurationDefinition(`value`: IResolvable) {
    unwrap(this).setResourceConfigurationDefinition(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Identifies the resource configuration in one of the following ways:.
   */
  public open
      fun resourceConfigurationDefinition(`value`: ResourceConfigurationDefinitionProperty) {
    unwrap(this).setResourceConfigurationDefinition(`value`.let(ResourceConfigurationDefinitionProperty.Companion::unwrap))
  }

  /**
   * Identifies the resource configuration in one of the following ways:.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("753683cdec356a2d940832d84eda5f41fd22df800f700cc5bf19398b18462fa1")
  public open
      fun resourceConfigurationDefinition(`value`: ResourceConfigurationDefinitionProperty.Builder.() -> Unit):
      Unit = resourceConfigurationDefinition(ResourceConfigurationDefinitionProperty(`value`))

  /**
   * The ID of the group resource configuration.
   */
  public open fun resourceConfigurationGroupId(): String? =
      unwrap(this).getResourceConfigurationGroupId()

  /**
   * The ID of the group resource configuration.
   */
  public open fun resourceConfigurationGroupId(`value`: String) {
    unwrap(this).setResourceConfigurationGroupId(`value`)
  }

  /**
   * The type of resource configuration.
   *
   * A resource configuration can be one of the following types:.
   */
  public open fun resourceConfigurationType(): String = unwrap(this).getResourceConfigurationType()

  /**
   * The type of resource configuration.
   *
   * A resource configuration can be one of the following types:.
   */
  public open fun resourceConfigurationType(`value`: String) {
    unwrap(this).setResourceConfigurationType(`value`)
  }

  /**
   * The ID of the resource gateway.
   */
  public open fun resourceGatewayId(): String? = unwrap(this).getResourceGatewayId()

  /**
   * The ID of the resource gateway.
   */
  public open fun resourceGatewayId(`value`: String) {
    unwrap(this).setResourceGatewayId(`value`)
  }

  /**
   * The tags for the resource configuration.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags for the resource configuration.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags for the resource configuration.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.vpclattice.CfnResourceConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether the resource configuration can be associated with a sharable service
     * network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-allowassociationtosharableservicenetwork)
     * @param allowAssociationToSharableServiceNetwork Specifies whether the resource configuration
     * can be associated with a sharable service network. 
     */
    public
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: Boolean)

    /**
     * Specifies whether the resource configuration can be associated with a sharable service
     * network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-allowassociationtosharableservicenetwork)
     * @param allowAssociationToSharableServiceNetwork Specifies whether the resource configuration
     * can be associated with a sharable service network. 
     */
    public
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: IResolvable)

    /**
     * The name of the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-name)
     * @param name The name of the resource configuration. 
     */
    public fun name(name: String)

    /**
     * (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to access a resource
     * configuration (for example: 1-65535).
     *
     * You can separate port ranges using commas (for example: 1,2,22-30).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-portranges)
     * @param portRanges (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to
     * access a resource configuration (for example: 1-65535). 
     */
    public fun portRanges(portRanges: List<String>)

    /**
     * (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to access a resource
     * configuration (for example: 1-65535).
     *
     * You can separate port ranges using commas (for example: 1,2,22-30).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-portranges)
     * @param portRanges (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to
     * access a resource configuration (for example: 1-65535). 
     */
    public fun portRanges(vararg portRanges: String)

    /**
     * (SINGLE, GROUP) The protocol accepted by the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-protocoltype)
     * @param protocolType (SINGLE, GROUP) The protocol accepted by the resource configuration. 
     */
    public fun protocolType(protocolType: String)

    /**
     * The auth type for the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationauthtype)
     * @param resourceConfigurationAuthType The auth type for the resource configuration. 
     */
    public fun resourceConfigurationAuthType(resourceConfigurationAuthType: String)

    /**
     * Identifies the resource configuration in one of the following ways:.
     *
     * * *Amazon Resource Name (ARN)* - Supported resource-types that are provisioned by AWS
     * services, such as RDS databases, can be identified by their ARN.
     * * *Domain name* - Any domain name that is publicly resolvable.
     * * *IP address* - For IPv4 and IPv6, only IP addresses in the VPC are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
     * @param resourceConfigurationDefinition Identifies the resource configuration in one of the
     * following ways:. 
     */
    public fun resourceConfigurationDefinition(resourceConfigurationDefinition: IResolvable)

    /**
     * Identifies the resource configuration in one of the following ways:.
     *
     * * *Amazon Resource Name (ARN)* - Supported resource-types that are provisioned by AWS
     * services, such as RDS databases, can be identified by their ARN.
     * * *Domain name* - Any domain name that is publicly resolvable.
     * * *IP address* - For IPv4 and IPv6, only IP addresses in the VPC are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
     * @param resourceConfigurationDefinition Identifies the resource configuration in one of the
     * following ways:. 
     */
    public
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: ResourceConfigurationDefinitionProperty)

    /**
     * Identifies the resource configuration in one of the following ways:.
     *
     * * *Amazon Resource Name (ARN)* - Supported resource-types that are provisioned by AWS
     * services, such as RDS databases, can be identified by their ARN.
     * * *Domain name* - Any domain name that is publicly resolvable.
     * * *IP address* - For IPv4 and IPv6, only IP addresses in the VPC are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
     * @param resourceConfigurationDefinition Identifies the resource configuration in one of the
     * following ways:. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43cc195d1c74e028240ae8c6de32449e5ef4a8c655009bf2c3d73b88f2266a0a")
    public
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: ResourceConfigurationDefinitionProperty.Builder.() -> Unit)

    /**
     * The ID of the group resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationgroupid)
     * @param resourceConfigurationGroupId The ID of the group resource configuration. 
     */
    public fun resourceConfigurationGroupId(resourceConfigurationGroupId: String)

    /**
     * The type of resource configuration. A resource configuration can be one of the following
     * types:.
     *
     * * *SINGLE* - A single resource.
     * * *GROUP* - A group of resources. You must create a group resource configuration before you
     * create a child resource configuration.
     * * *CHILD* - A single resource that is part of a group resource configuration.
     * * *ARN* - An AWS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationtype)
     * @param resourceConfigurationType The type of resource configuration. A resource configuration
     * can be one of the following types:. 
     */
    public fun resourceConfigurationType(resourceConfigurationType: String)

    /**
     * The ID of the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourcegatewayid)
     * @param resourceGatewayId The ID of the resource gateway. 
     */
    public fun resourceGatewayId(resourceGatewayId: String)

    /**
     * The tags for the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-tags)
     * @param tags The tags for the resource configuration. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-tags)
     * @param tags The tags for the resource configuration. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.Builder =
        software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.Builder.create(scope,
        id)

    /**
     * Specifies whether the resource configuration can be associated with a sharable service
     * network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-allowassociationtosharableservicenetwork)
     * @param allowAssociationToSharableServiceNetwork Specifies whether the resource configuration
     * can be associated with a sharable service network. 
     */
    override
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: Boolean) {
      cdkBuilder.allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork)
    }

    /**
     * Specifies whether the resource configuration can be associated with a sharable service
     * network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-allowassociationtosharableservicenetwork)
     * @param allowAssociationToSharableServiceNetwork Specifies whether the resource configuration
     * can be associated with a sharable service network. 
     */
    override
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: IResolvable) {
      cdkBuilder.allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork.let(IResolvable.Companion::unwrap))
    }

    /**
     * The name of the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-name)
     * @param name The name of the resource configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to access a resource
     * configuration (for example: 1-65535).
     *
     * You can separate port ranges using commas (for example: 1,2,22-30).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-portranges)
     * @param portRanges (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to
     * access a resource configuration (for example: 1-65535). 
     */
    override fun portRanges(portRanges: List<String>) {
      cdkBuilder.portRanges(portRanges)
    }

    /**
     * (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to access a resource
     * configuration (for example: 1-65535).
     *
     * You can separate port ranges using commas (for example: 1,2,22-30).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-portranges)
     * @param portRanges (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to
     * access a resource configuration (for example: 1-65535). 
     */
    override fun portRanges(vararg portRanges: String): Unit = portRanges(portRanges.toList())

    /**
     * (SINGLE, GROUP) The protocol accepted by the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-protocoltype)
     * @param protocolType (SINGLE, GROUP) The protocol accepted by the resource configuration. 
     */
    override fun protocolType(protocolType: String) {
      cdkBuilder.protocolType(protocolType)
    }

    /**
     * The auth type for the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationauthtype)
     * @param resourceConfigurationAuthType The auth type for the resource configuration. 
     */
    override fun resourceConfigurationAuthType(resourceConfigurationAuthType: String) {
      cdkBuilder.resourceConfigurationAuthType(resourceConfigurationAuthType)
    }

    /**
     * Identifies the resource configuration in one of the following ways:.
     *
     * * *Amazon Resource Name (ARN)* - Supported resource-types that are provisioned by AWS
     * services, such as RDS databases, can be identified by their ARN.
     * * *Domain name* - Any domain name that is publicly resolvable.
     * * *IP address* - For IPv4 and IPv6, only IP addresses in the VPC are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
     * @param resourceConfigurationDefinition Identifies the resource configuration in one of the
     * following ways:. 
     */
    override fun resourceConfigurationDefinition(resourceConfigurationDefinition: IResolvable) {
      cdkBuilder.resourceConfigurationDefinition(resourceConfigurationDefinition.let(IResolvable.Companion::unwrap))
    }

    /**
     * Identifies the resource configuration in one of the following ways:.
     *
     * * *Amazon Resource Name (ARN)* - Supported resource-types that are provisioned by AWS
     * services, such as RDS databases, can be identified by their ARN.
     * * *Domain name* - Any domain name that is publicly resolvable.
     * * *IP address* - For IPv4 and IPv6, only IP addresses in the VPC are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
     * @param resourceConfigurationDefinition Identifies the resource configuration in one of the
     * following ways:. 
     */
    override
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: ResourceConfigurationDefinitionProperty) {
      cdkBuilder.resourceConfigurationDefinition(resourceConfigurationDefinition.let(ResourceConfigurationDefinitionProperty.Companion::unwrap))
    }

    /**
     * Identifies the resource configuration in one of the following ways:.
     *
     * * *Amazon Resource Name (ARN)* - Supported resource-types that are provisioned by AWS
     * services, such as RDS databases, can be identified by their ARN.
     * * *Domain name* - Any domain name that is publicly resolvable.
     * * *IP address* - For IPv4 and IPv6, only IP addresses in the VPC are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
     * @param resourceConfigurationDefinition Identifies the resource configuration in one of the
     * following ways:. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43cc195d1c74e028240ae8c6de32449e5ef4a8c655009bf2c3d73b88f2266a0a")
    override
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: ResourceConfigurationDefinitionProperty.Builder.() -> Unit):
        Unit =
        resourceConfigurationDefinition(ResourceConfigurationDefinitionProperty(resourceConfigurationDefinition))

    /**
     * The ID of the group resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationgroupid)
     * @param resourceConfigurationGroupId The ID of the group resource configuration. 
     */
    override fun resourceConfigurationGroupId(resourceConfigurationGroupId: String) {
      cdkBuilder.resourceConfigurationGroupId(resourceConfigurationGroupId)
    }

    /**
     * The type of resource configuration. A resource configuration can be one of the following
     * types:.
     *
     * * *SINGLE* - A single resource.
     * * *GROUP* - A group of resources. You must create a group resource configuration before you
     * create a child resource configuration.
     * * *CHILD* - A single resource that is part of a group resource configuration.
     * * *ARN* - An AWS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationtype)
     * @param resourceConfigurationType The type of resource configuration. A resource configuration
     * can be one of the following types:. 
     */
    override fun resourceConfigurationType(resourceConfigurationType: String) {
      cdkBuilder.resourceConfigurationType(resourceConfigurationType)
    }

    /**
     * The ID of the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourcegatewayid)
     * @param resourceGatewayId The ID of the resource gateway. 
     */
    override fun resourceGatewayId(resourceGatewayId: String) {
      cdkBuilder.resourceGatewayId(resourceGatewayId)
    }

    /**
     * The tags for the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-tags)
     * @param tags The tags for the resource configuration. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags for the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-tags)
     * @param tags The tags for the resource configuration. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration):
        CfnResourceConfiguration = CfnResourceConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnResourceConfiguration):
        software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration = wrapped.cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration
  }

  /**
   * The domain name of the resource configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * DnsResourceProperty dnsResourceProperty = DnsResourceProperty.builder()
   * .domainName("domainName")
   * .ipAddressType("ipAddressType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-resourceconfiguration-dnsresource.html)
   */
  public interface DnsResourceProperty {
    /**
     * The domain name of the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-resourceconfiguration-dnsresource.html#cfn-vpclattice-resourceconfiguration-dnsresource-domainname)
     */
    public fun domainName(): String

    /**
     * The IP address type for the resource configuration.
     *
     * Dualstack is not currently supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-resourceconfiguration-dnsresource.html#cfn-vpclattice-resourceconfiguration-dnsresource-ipaddresstype)
     */
    public fun ipAddressType(): String

    /**
     * A builder for [DnsResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param domainName The domain name of the resource configuration. 
       */
      public fun domainName(domainName: String)

      /**
       * @param ipAddressType The IP address type for the resource configuration. 
       * Dualstack is not currently supported.
       */
      public fun ipAddressType(ipAddressType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.DnsResourceProperty.Builder
          =
          software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.DnsResourceProperty.builder()

      /**
       * @param domainName The domain name of the resource configuration. 
       */
      override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      /**
       * @param ipAddressType The IP address type for the resource configuration. 
       * Dualstack is not currently supported.
       */
      override fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.DnsResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.DnsResourceProperty,
    ) : CdkObject(cdkObject),
        DnsResourceProperty {
      /**
       * The domain name of the resource configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-resourceconfiguration-dnsresource.html#cfn-vpclattice-resourceconfiguration-dnsresource-domainname)
       */
      override fun domainName(): String = unwrap(this).getDomainName()

      /**
       * The IP address type for the resource configuration.
       *
       * Dualstack is not currently supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-resourceconfiguration-dnsresource.html#cfn-vpclattice-resourceconfiguration-dnsresource-ipaddresstype)
       */
      override fun ipAddressType(): String = unwrap(this).getIpAddressType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DnsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.DnsResourceProperty):
          DnsResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? DnsResourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DnsResourceProperty):
          software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.DnsResourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.DnsResourceProperty
    }
  }

  /**
   * Identifies the resource configuration in one of the following ways:.
   *
   * * *Amazon Resource Name (ARN)* - Supported resource-types that are provisioned by AWS services,
   * such as RDS databases, can be identified by their ARN.
   * * *Domain name* - Any domain name that is publicly resolvable.
   * * *IP address* - For IPv4 and IPv6, only IP addresses in the VPC are supported.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * ResourceConfigurationDefinitionProperty resourceConfigurationDefinitionProperty =
   * ResourceConfigurationDefinitionProperty.builder()
   * .arnResource("arnResource")
   * .dnsResource(DnsResourceProperty.builder()
   * .domainName("domainName")
   * .ipAddressType("ipAddressType")
   * .build())
   * .ipResource("ipResource")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-resourceconfiguration-resourceconfigurationdefinition.html)
   */
  public interface ResourceConfigurationDefinitionProperty {
    /**
     * The Amazon Resource Name (ARN) of the resource configuration.
     *
     * For the ARN syntax and format, see [ARN
     * format](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html#arns-syntax) in the
     * *AWS Identity and Access Management user guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-resourceconfiguration-resourceconfigurationdefinition.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition-arnresource)
     */
    public fun arnResource(): String? = unwrap(this).getArnResource()

    /**
     * The DNS name of the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-resourceconfiguration-resourceconfigurationdefinition.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition-dnsresource)
     */
    public fun dnsResource(): Any? = unwrap(this).getDnsResource()

    /**
     * The IP address of the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-resourceconfiguration-resourceconfigurationdefinition.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition-ipresource)
     */
    public fun ipResource(): String? = unwrap(this).getIpResource()

    /**
     * A builder for [ResourceConfigurationDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arnResource The Amazon Resource Name (ARN) of the resource configuration.
       * For the ARN syntax and format, see [ARN
       * format](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html#arns-syntax) in
       * the *AWS Identity and Access Management user guide* .
       */
      public fun arnResource(arnResource: String)

      /**
       * @param dnsResource The DNS name of the resource configuration.
       */
      public fun dnsResource(dnsResource: IResolvable)

      /**
       * @param dnsResource The DNS name of the resource configuration.
       */
      public fun dnsResource(dnsResource: DnsResourceProperty)

      /**
       * @param dnsResource The DNS name of the resource configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5c66a59484e3706a3304ed012707285e64d3b98a393d644c351f9c3972fac1c")
      public fun dnsResource(dnsResource: DnsResourceProperty.Builder.() -> Unit)

      /**
       * @param ipResource The IP address of the resource configuration.
       */
      public fun ipResource(ipResource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.ResourceConfigurationDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.ResourceConfigurationDefinitionProperty.builder()

      /**
       * @param arnResource The Amazon Resource Name (ARN) of the resource configuration.
       * For the ARN syntax and format, see [ARN
       * format](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html#arns-syntax) in
       * the *AWS Identity and Access Management user guide* .
       */
      override fun arnResource(arnResource: String) {
        cdkBuilder.arnResource(arnResource)
      }

      /**
       * @param dnsResource The DNS name of the resource configuration.
       */
      override fun dnsResource(dnsResource: IResolvable) {
        cdkBuilder.dnsResource(dnsResource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dnsResource The DNS name of the resource configuration.
       */
      override fun dnsResource(dnsResource: DnsResourceProperty) {
        cdkBuilder.dnsResource(dnsResource.let(DnsResourceProperty.Companion::unwrap))
      }

      /**
       * @param dnsResource The DNS name of the resource configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5c66a59484e3706a3304ed012707285e64d3b98a393d644c351f9c3972fac1c")
      override fun dnsResource(dnsResource: DnsResourceProperty.Builder.() -> Unit): Unit =
          dnsResource(DnsResourceProperty(dnsResource))

      /**
       * @param ipResource The IP address of the resource configuration.
       */
      override fun ipResource(ipResource: String) {
        cdkBuilder.ipResource(ipResource)
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.ResourceConfigurationDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.ResourceConfigurationDefinitionProperty,
    ) : CdkObject(cdkObject),
        ResourceConfigurationDefinitionProperty {
      /**
       * The Amazon Resource Name (ARN) of the resource configuration.
       *
       * For the ARN syntax and format, see [ARN
       * format](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html#arns-syntax) in
       * the *AWS Identity and Access Management user guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-resourceconfiguration-resourceconfigurationdefinition.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition-arnresource)
       */
      override fun arnResource(): String? = unwrap(this).getArnResource()

      /**
       * The DNS name of the resource configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-resourceconfiguration-resourceconfigurationdefinition.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition-dnsresource)
       */
      override fun dnsResource(): Any? = unwrap(this).getDnsResource()

      /**
       * The IP address of the resource configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-resourceconfiguration-resourceconfigurationdefinition.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition-ipresource)
       */
      override fun ipResource(): String? = unwrap(this).getIpResource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResourceConfigurationDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.ResourceConfigurationDefinitionProperty):
          ResourceConfigurationDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResourceConfigurationDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceConfigurationDefinitionProperty):
          software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.ResourceConfigurationDefinitionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnResourceConfiguration.ResourceConfigurationDefinitionProperty
    }
  }
}
