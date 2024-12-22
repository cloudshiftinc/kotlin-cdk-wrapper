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
 * Creates a resource gateway for a service.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnResourceGateway cfnResourceGateway = CfnResourceGateway.Builder.create(this,
 * "MyCfnResourceGateway")
 * .ipAddressType("ipAddressType")
 * .name("name")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcIdentifier("vpcIdentifier")
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
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.vpclattice.CfnResourceGateway(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

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
   *
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
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
   *
   */
  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   *
   */
  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  /**
   *
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   *
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ID of one or more security groups to associate with the endpoint network interface.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * The ID of one or more security groups to associate with the endpoint network interface.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The ID of one or more security groups to associate with the endpoint network interface.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * The ID of one or more subnets in which to create an endpoint network interface.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * The ID of one or more subnets in which to create an endpoint network interface.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The ID of one or more subnets in which to create an endpoint network interface.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   *
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   *
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   *
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   *
   */
  public open fun vpcIdentifier(): String? = unwrap(this).getVpcIdentifier()

  /**
   *
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-ipaddresstype)
     * @param ipAddressType 
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-name)
     * @param name 
     */
    public fun name(name: String)

    /**
     * The ID of one or more security groups to associate with the endpoint network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-securitygroupids)
     * @param securityGroupIds The ID of one or more security groups to associate with the endpoint
     * network interface. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The ID of one or more security groups to associate with the endpoint network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-securitygroupids)
     * @param securityGroupIds The ID of one or more security groups to associate with the endpoint
     * network interface. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * The ID of one or more subnets in which to create an endpoint network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-subnetids)
     * @param subnetIds The ID of one or more subnets in which to create an endpoint network
     * interface. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * The ID of one or more subnets in which to create an endpoint network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-subnetids)
     * @param subnetIds The ID of one or more subnets in which to create an endpoint network
     * interface. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-tags)
     * @param tags 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-tags)
     * @param tags 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-vpcidentifier)
     * @param vpcIdentifier 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-ipaddresstype)
     * @param ipAddressType 
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-name)
     * @param name 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ID of one or more security groups to associate with the endpoint network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-securitygroupids)
     * @param securityGroupIds The ID of one or more security groups to associate with the endpoint
     * network interface. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The ID of one or more security groups to associate with the endpoint network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-securitygroupids)
     * @param securityGroupIds The ID of one or more security groups to associate with the endpoint
     * network interface. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * The ID of one or more subnets in which to create an endpoint network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-subnetids)
     * @param subnetIds The ID of one or more subnets in which to create an endpoint network
     * interface. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * The ID of one or more subnets in which to create an endpoint network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-subnetids)
     * @param subnetIds The ID of one or more subnets in which to create an endpoint network
     * interface. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-tags)
     * @param tags 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-tags)
     * @param tags 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcegateway.html#cfn-vpclattice-resourcegateway-vpcidentifier)
     * @param vpcIdentifier 
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
