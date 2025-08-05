@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A resource gateway is a point of ingress into the VPC where a resource resides.
 *
 * It spans multiple Availability Zones. For your resource to be accessible from all Availability
 * Zones, you should create your resource gateways to span as many Availability Zones as possible. A
 * VPC can have multiple resource gateways.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnResourceGateway cfnResourceGateway = CfnResourceGateway.Builder.create(this,
 * "MyCfnResourceGateway")
 * .name("name")
 * .subnetIds(List.of("subnetIds"))
 * .vpcIdentifier("vpcIdentifier")
 * // the properties below are optional
 * .ipAddressType("ipAddressType")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html)
 */
public open class CfnResourceGateway(
  cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceGateway,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceGatewayProps,
  ) :
      this(software.amazon.awscdk.services.vpclattice.CfnResourceGateway(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnResourceGatewayProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceGatewayProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResourceGatewayProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the resource gateway.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the resource gateway.
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
   * The type of IP address used by the resource gateway.
   */
  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * The type of IP address used by the resource gateway.
   */
  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  /**
   * The name of the resource gateway.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the resource gateway.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The IDs of the security groups applied to the resource gateway.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * The IDs of the security groups applied to the resource gateway.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The IDs of the security groups applied to the resource gateway.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * The IDs of the VPC subnets for the resource gateway.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * The IDs of the VPC subnets for the resource gateway.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The IDs of the VPC subnets for the resource gateway.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * The tags for the resource gateway.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags for the resource gateway.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags for the resource gateway.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The ID of the VPC for the resource gateway.
   */
  public open fun vpcIdentifier(): String = unwrap(this).getVpcIdentifier()

  /**
   * The ID of the VPC for the resource gateway.
   */
  public open fun vpcIdentifier(`value`: String) {
    unwrap(this).setVpcIdentifier(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.vpclattice.CfnResourceGateway].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The type of IP address used by the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-ipaddresstype)
     * @param ipAddressType The type of IP address used by the resource gateway. 
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * The name of the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-name)
     * @param name The name of the resource gateway. 
     */
    public fun name(name: String)

    /**
     * The IDs of the security groups applied to the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-securitygroupids)
     * @param securityGroupIds The IDs of the security groups applied to the resource gateway. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The IDs of the security groups applied to the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-securitygroupids)
     * @param securityGroupIds The IDs of the security groups applied to the resource gateway. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * The IDs of the VPC subnets for the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-subnetids)
     * @param subnetIds The IDs of the VPC subnets for the resource gateway. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * The IDs of the VPC subnets for the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-subnetids)
     * @param subnetIds The IDs of the VPC subnets for the resource gateway. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * The tags for the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-tags)
     * @param tags The tags for the resource gateway. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-tags)
     * @param tags The tags for the resource gateway. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the VPC for the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-vpcidentifier)
     * @param vpcIdentifier The ID of the VPC for the resource gateway. 
     */
    public fun vpcIdentifier(vpcIdentifier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnResourceGateway.Builder =
        software.amazon.awscdk.services.vpclattice.CfnResourceGateway.Builder.create(scope, id)

    /**
     * The type of IP address used by the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-ipaddresstype)
     * @param ipAddressType The type of IP address used by the resource gateway. 
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * The name of the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-name)
     * @param name The name of the resource gateway. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The IDs of the security groups applied to the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-securitygroupids)
     * @param securityGroupIds The IDs of the security groups applied to the resource gateway. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The IDs of the security groups applied to the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-securitygroupids)
     * @param securityGroupIds The IDs of the security groups applied to the resource gateway. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * The IDs of the VPC subnets for the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-subnetids)
     * @param subnetIds The IDs of the VPC subnets for the resource gateway. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * The IDs of the VPC subnets for the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-subnetids)
     * @param subnetIds The IDs of the VPC subnets for the resource gateway. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * The tags for the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-tags)
     * @param tags The tags for the resource gateway. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags for the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-tags)
     * @param tags The tags for the resource gateway. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the VPC for the resource gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-vpcidentifier)
     * @param vpcIdentifier The ID of the VPC for the resource gateway. 
     */
    override fun vpcIdentifier(vpcIdentifier: String) {
      cdkBuilder.vpcIdentifier(vpcIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnResourceGateway =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.vpclattice.CfnResourceGateway.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourceGateway):
        CfnResourceGateway = CfnResourceGateway(cdkObject)

    internal fun unwrap(wrapped: CfnResourceGateway):
        software.amazon.awscdk.services.vpclattice.CfnResourceGateway = wrapped.cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnResourceGateway
  }
}
