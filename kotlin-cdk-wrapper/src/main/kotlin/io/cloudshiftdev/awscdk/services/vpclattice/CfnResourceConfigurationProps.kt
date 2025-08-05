@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnResourceConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnResourceConfigurationProps cfnResourceConfigurationProps =
 * CfnResourceConfigurationProps.builder()
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
public interface CfnResourceConfigurationProps {
  /**
   * Specifies whether the resource configuration can be associated with a sharable service network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-allowassociationtosharableservicenetwork)
   */
  public fun allowAssociationToSharableServiceNetwork(): Any? =
      unwrap(this).getAllowAssociationToSharableServiceNetwork()

  /**
   * The name of the resource configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-name)
   */
  public fun name(): String

  /**
   * (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to access a resource
   * configuration (for example: 1-65535).
   *
   * You can separate port ranges using commas (for example: 1,2,22-30).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-portranges)
   */
  public fun portRanges(): List<String> = unwrap(this).getPortRanges() ?: emptyList()

  /**
   * (SINGLE, GROUP) The protocol accepted by the resource configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-protocoltype)
   */
  public fun protocolType(): String? = unwrap(this).getProtocolType()

  /**
   * The auth type for the resource configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationauthtype)
   */
  public fun resourceConfigurationAuthType(): String? =
      unwrap(this).getResourceConfigurationAuthType()

  /**
   * Identifies the resource configuration in one of the following ways:.
   *
   * * *Amazon Resource Name (ARN)* - Supported resource-types that are provisioned by AWS services,
   * such as RDS databases, can be identified by their ARN.
   * * *Domain name* - Any domain name that is publicly resolvable.
   * * *IP address* - For IPv4 and IPv6, only IP addresses in the VPC are supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
   */
  public fun resourceConfigurationDefinition(): Any? =
      unwrap(this).getResourceConfigurationDefinition()

  /**
   * The ID of the group resource configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationgroupid)
   */
  public fun resourceConfigurationGroupId(): String? =
      unwrap(this).getResourceConfigurationGroupId()

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
   */
  public fun resourceConfigurationType(): String

  /**
   * The ID of the resource gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourcegatewayid)
   */
  public fun resourceGatewayId(): String? = unwrap(this).getResourceGatewayId()

  /**
   * The tags for the resource configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnResourceConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowAssociationToSharableServiceNetwork Specifies whether the resource configuration
     * can be associated with a sharable service network.
     */
    public
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: Boolean)

    /**
     * @param allowAssociationToSharableServiceNetwork Specifies whether the resource configuration
     * can be associated with a sharable service network.
     */
    public
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: IResolvable)

    /**
     * @param name The name of the resource configuration. 
     */
    public fun name(name: String)

    /**
     * @param portRanges (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to
     * access a resource configuration (for example: 1-65535).
     * You can separate port ranges using commas (for example: 1,2,22-30).
     */
    public fun portRanges(portRanges: List<String>)

    /**
     * @param portRanges (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to
     * access a resource configuration (for example: 1-65535).
     * You can separate port ranges using commas (for example: 1,2,22-30).
     */
    public fun portRanges(vararg portRanges: String)

    /**
     * @param protocolType (SINGLE, GROUP) The protocol accepted by the resource configuration.
     */
    public fun protocolType(protocolType: String)

    /**
     * @param resourceConfigurationAuthType The auth type for the resource configuration.
     */
    public fun resourceConfigurationAuthType(resourceConfigurationAuthType: String)

    /**
     * @param resourceConfigurationDefinition Identifies the resource configuration in one of the
     * following ways:.
     * * *Amazon Resource Name (ARN)* - Supported resource-types that are provisioned by AWS
     * services, such as RDS databases, can be identified by their ARN.
     * * *Domain name* - Any domain name that is publicly resolvable.
     * * *IP address* - For IPv4 and IPv6, only IP addresses in the VPC are supported.
     */
    public fun resourceConfigurationDefinition(resourceConfigurationDefinition: IResolvable)

    /**
     * @param resourceConfigurationDefinition Identifies the resource configuration in one of the
     * following ways:.
     * * *Amazon Resource Name (ARN)* - Supported resource-types that are provisioned by AWS
     * services, such as RDS databases, can be identified by their ARN.
     * * *Domain name* - Any domain name that is publicly resolvable.
     * * *IP address* - For IPv4 and IPv6, only IP addresses in the VPC are supported.
     */
    public
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: CfnResourceConfiguration.ResourceConfigurationDefinitionProperty)

    /**
     * @param resourceConfigurationDefinition Identifies the resource configuration in one of the
     * following ways:.
     * * *Amazon Resource Name (ARN)* - Supported resource-types that are provisioned by AWS
     * services, such as RDS databases, can be identified by their ARN.
     * * *Domain name* - Any domain name that is publicly resolvable.
     * * *IP address* - For IPv4 and IPv6, only IP addresses in the VPC are supported.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53bb3a0a57f4fc564db4fc154f86abc46ee3b86ecb81f434eb20ddf0f8c5a565")
    public
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: CfnResourceConfiguration.ResourceConfigurationDefinitionProperty.Builder.() -> Unit)

    /**
     * @param resourceConfigurationGroupId The ID of the group resource configuration.
     */
    public fun resourceConfigurationGroupId(resourceConfigurationGroupId: String)

    /**
     * @param resourceConfigurationType The type of resource configuration. A resource configuration
     * can be one of the following types:. 
     * * *SINGLE* - A single resource.
     * * *GROUP* - A group of resources. You must create a group resource configuration before you
     * create a child resource configuration.
     * * *CHILD* - A single resource that is part of a group resource configuration.
     * * *ARN* - An AWS resource.
     */
    public fun resourceConfigurationType(resourceConfigurationType: String)

    /**
     * @param resourceGatewayId The ID of the resource gateway.
     */
    public fun resourceGatewayId(resourceGatewayId: String)

    /**
     * @param tags The tags for the resource configuration.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the resource configuration.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnResourceConfigurationProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnResourceConfigurationProps.builder()

    /**
     * @param allowAssociationToSharableServiceNetwork Specifies whether the resource configuration
     * can be associated with a sharable service network.
     */
    override
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: Boolean) {
      cdkBuilder.allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork)
    }

    /**
     * @param allowAssociationToSharableServiceNetwork Specifies whether the resource configuration
     * can be associated with a sharable service network.
     */
    override
        fun allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork: IResolvable) {
      cdkBuilder.allowAssociationToSharableServiceNetwork(allowAssociationToSharableServiceNetwork.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param name The name of the resource configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param portRanges (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to
     * access a resource configuration (for example: 1-65535).
     * You can separate port ranges using commas (for example: 1,2,22-30).
     */
    override fun portRanges(portRanges: List<String>) {
      cdkBuilder.portRanges(portRanges)
    }

    /**
     * @param portRanges (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to
     * access a resource configuration (for example: 1-65535).
     * You can separate port ranges using commas (for example: 1,2,22-30).
     */
    override fun portRanges(vararg portRanges: String): Unit = portRanges(portRanges.toList())

    /**
     * @param protocolType (SINGLE, GROUP) The protocol accepted by the resource configuration.
     */
    override fun protocolType(protocolType: String) {
      cdkBuilder.protocolType(protocolType)
    }

    /**
     * @param resourceConfigurationAuthType The auth type for the resource configuration.
     */
    override fun resourceConfigurationAuthType(resourceConfigurationAuthType: String) {
      cdkBuilder.resourceConfigurationAuthType(resourceConfigurationAuthType)
    }

    /**
     * @param resourceConfigurationDefinition Identifies the resource configuration in one of the
     * following ways:.
     * * *Amazon Resource Name (ARN)* - Supported resource-types that are provisioned by AWS
     * services, such as RDS databases, can be identified by their ARN.
     * * *Domain name* - Any domain name that is publicly resolvable.
     * * *IP address* - For IPv4 and IPv6, only IP addresses in the VPC are supported.
     */
    override fun resourceConfigurationDefinition(resourceConfigurationDefinition: IResolvable) {
      cdkBuilder.resourceConfigurationDefinition(resourceConfigurationDefinition.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param resourceConfigurationDefinition Identifies the resource configuration in one of the
     * following ways:.
     * * *Amazon Resource Name (ARN)* - Supported resource-types that are provisioned by AWS
     * services, such as RDS databases, can be identified by their ARN.
     * * *Domain name* - Any domain name that is publicly resolvable.
     * * *IP address* - For IPv4 and IPv6, only IP addresses in the VPC are supported.
     */
    override
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: CfnResourceConfiguration.ResourceConfigurationDefinitionProperty) {
      cdkBuilder.resourceConfigurationDefinition(resourceConfigurationDefinition.let(CfnResourceConfiguration.ResourceConfigurationDefinitionProperty.Companion::unwrap))
    }

    /**
     * @param resourceConfigurationDefinition Identifies the resource configuration in one of the
     * following ways:.
     * * *Amazon Resource Name (ARN)* - Supported resource-types that are provisioned by AWS
     * services, such as RDS databases, can be identified by their ARN.
     * * *Domain name* - Any domain name that is publicly resolvable.
     * * *IP address* - For IPv4 and IPv6, only IP addresses in the VPC are supported.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53bb3a0a57f4fc564db4fc154f86abc46ee3b86ecb81f434eb20ddf0f8c5a565")
    override
        fun resourceConfigurationDefinition(resourceConfigurationDefinition: CfnResourceConfiguration.ResourceConfigurationDefinitionProperty.Builder.() -> Unit):
        Unit =
        resourceConfigurationDefinition(CfnResourceConfiguration.ResourceConfigurationDefinitionProperty(resourceConfigurationDefinition))

    /**
     * @param resourceConfigurationGroupId The ID of the group resource configuration.
     */
    override fun resourceConfigurationGroupId(resourceConfigurationGroupId: String) {
      cdkBuilder.resourceConfigurationGroupId(resourceConfigurationGroupId)
    }

    /**
     * @param resourceConfigurationType The type of resource configuration. A resource configuration
     * can be one of the following types:. 
     * * *SINGLE* - A single resource.
     * * *GROUP* - A group of resources. You must create a group resource configuration before you
     * create a child resource configuration.
     * * *CHILD* - A single resource that is part of a group resource configuration.
     * * *ARN* - An AWS resource.
     */
    override fun resourceConfigurationType(resourceConfigurationType: String) {
      cdkBuilder.resourceConfigurationType(resourceConfigurationType)
    }

    /**
     * @param resourceGatewayId The ID of the resource gateway.
     */
    override fun resourceGatewayId(resourceGatewayId: String) {
      cdkBuilder.resourceGatewayId(resourceGatewayId)
    }

    /**
     * @param tags The tags for the resource configuration.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags for the resource configuration.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnResourceConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnResourceConfigurationProps {
    /**
     * Specifies whether the resource configuration can be associated with a sharable service
     * network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-allowassociationtosharableservicenetwork)
     */
    override fun allowAssociationToSharableServiceNetwork(): Any? =
        unwrap(this).getAllowAssociationToSharableServiceNetwork()

    /**
     * The name of the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * (SINGLE, GROUP, CHILD) The TCP port ranges that a consumer can use to access a resource
     * configuration (for example: 1-65535).
     *
     * You can separate port ranges using commas (for example: 1,2,22-30).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-portranges)
     */
    override fun portRanges(): List<String> = unwrap(this).getPortRanges() ?: emptyList()

    /**
     * (SINGLE, GROUP) The protocol accepted by the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-protocoltype)
     */
    override fun protocolType(): String? = unwrap(this).getProtocolType()

    /**
     * The auth type for the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationauthtype)
     */
    override fun resourceConfigurationAuthType(): String? =
        unwrap(this).getResourceConfigurationAuthType()

    /**
     * Identifies the resource configuration in one of the following ways:.
     *
     * * *Amazon Resource Name (ARN)* - Supported resource-types that are provisioned by AWS
     * services, such as RDS databases, can be identified by their ARN.
     * * *Domain name* - Any domain name that is publicly resolvable.
     * * *IP address* - For IPv4 and IPv6, only IP addresses in the VPC are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationdefinition)
     */
    override fun resourceConfigurationDefinition(): Any? =
        unwrap(this).getResourceConfigurationDefinition()

    /**
     * The ID of the group resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourceconfigurationgroupid)
     */
    override fun resourceConfigurationGroupId(): String? =
        unwrap(this).getResourceConfigurationGroupId()

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
     */
    override fun resourceConfigurationType(): String = unwrap(this).getResourceConfigurationType()

    /**
     * The ID of the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-resourcegatewayid)
     */
    override fun resourceGatewayId(): String? = unwrap(this).getResourceGatewayId()

    /**
     * The tags for the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourceconfiguration.html#cfn-vpclattice-resourceconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceConfigurationProps):
        CfnResourceConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnResourceConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceConfigurationProps):
        software.amazon.awscdk.services.vpclattice.CfnResourceConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnResourceConfigurationProps
  }
}
