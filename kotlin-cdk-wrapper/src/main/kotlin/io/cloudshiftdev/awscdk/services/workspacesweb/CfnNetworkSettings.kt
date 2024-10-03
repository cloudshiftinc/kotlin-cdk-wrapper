@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

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
 * This resource specifies network settings that can be associated with a web portal.
 *
 * Once associated with a web portal, network settings define how streaming instances will connect
 * with your specified VPC.
 *
 * The VPC must have default tenancy. VPCs with dedicated tenancy are not supported.
 *
 * For availability consideration, you must have at least two subnets created in two different
 * Availability Zones. WorkSpaces Secure Browser is available in a subset of the Availability Zones for
 * each supported Region. For more information, see [Supported Availability
 * Zones](https://docs.aws.amazon.com/workspaces-web/latest/adminguide/availability-zones.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
 * CfnNetworkSettings cfnNetworkSettings = CfnNetworkSettings.Builder.create(this,
 * "MyCfnNetworkSettings")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html)
 */
public open class CfnNetworkSettings(
  cdkObject: software.amazon.awscdk.services.workspacesweb.CfnNetworkSettings,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNetworkSettingsProps,
  ) :
      this(software.amazon.awscdk.services.workspacesweb.CfnNetworkSettings(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnNetworkSettingsProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNetworkSettingsProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNetworkSettingsProps(props)
  )

  /**
   * A list of web portal ARNs that this network settings is associated with.
   */
  public open fun attrAssociatedPortalArns(): List<String> =
      unwrap(this).getAttrAssociatedPortalArns()

  /**
   * The ARN of the network settings.
   */
  public open fun attrNetworkSettingsArn(): String = unwrap(this).getAttrNetworkSettingsArn()

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
   * One or more security groups used to control access from streaming instances to your VPC.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

  /**
   * One or more security groups used to control access from streaming instances to your VPC.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * One or more security groups used to control access from streaming instances to your VPC.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * The subnets in which network interfaces are created to connect streaming instances to your VPC.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * The subnets in which network interfaces are created to connect streaming instances to your VPC.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The subnets in which network interfaces are created to connect streaming instances to your VPC.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * The tags to add to the network settings resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to add to the network settings resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to add to the network settings resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The VPC that streaming instances will connect to.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The VPC that streaming instances will connect to.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.workspacesweb.CfnNetworkSettings].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * One or more security groups used to control access from streaming instances to your VPC.
     *
     * *Pattern* : `^[\w+\-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-securitygroupids)
     * @param securityGroupIds One or more security groups used to control access from streaming
     * instances to your VPC. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * One or more security groups used to control access from streaming instances to your VPC.
     *
     * *Pattern* : `^[\w+\-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-securitygroupids)
     * @param securityGroupIds One or more security groups used to control access from streaming
     * instances to your VPC. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * The subnets in which network interfaces are created to connect streaming instances to your
     * VPC.
     *
     * At least two of these subnets must be in different availability zones.
     *
     * *Pattern* : `^subnet-([0-9a-f]{8}|[0-9a-f]{17})$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-subnetids)
     * @param subnetIds The subnets in which network interfaces are created to connect streaming
     * instances to your VPC. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * The subnets in which network interfaces are created to connect streaming instances to your
     * VPC.
     *
     * At least two of these subnets must be in different availability zones.
     *
     * *Pattern* : `^subnet-([0-9a-f]{8}|[0-9a-f]{17})$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-subnetids)
     * @param subnetIds The subnets in which network interfaces are created to connect streaming
     * instances to your VPC. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * The tags to add to the network settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-tags)
     * @param tags The tags to add to the network settings resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to add to the network settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-tags)
     * @param tags The tags to add to the network settings resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The VPC that streaming instances will connect to.
     *
     * *Pattern* : `^vpc-[0-9a-z]*$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-vpcid)
     * @param vpcId The VPC that streaming instances will connect to. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspacesweb.CfnNetworkSettings.Builder
        = software.amazon.awscdk.services.workspacesweb.CfnNetworkSettings.Builder.create(scope, id)

    /**
     * One or more security groups used to control access from streaming instances to your VPC.
     *
     * *Pattern* : `^[\w+\-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-securitygroupids)
     * @param securityGroupIds One or more security groups used to control access from streaming
     * instances to your VPC. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * One or more security groups used to control access from streaming instances to your VPC.
     *
     * *Pattern* : `^[\w+\-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-securitygroupids)
     * @param securityGroupIds One or more security groups used to control access from streaming
     * instances to your VPC. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * The subnets in which network interfaces are created to connect streaming instances to your
     * VPC.
     *
     * At least two of these subnets must be in different availability zones.
     *
     * *Pattern* : `^subnet-([0-9a-f]{8}|[0-9a-f]{17})$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-subnetids)
     * @param subnetIds The subnets in which network interfaces are created to connect streaming
     * instances to your VPC. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * The subnets in which network interfaces are created to connect streaming instances to your
     * VPC.
     *
     * At least two of these subnets must be in different availability zones.
     *
     * *Pattern* : `^subnet-([0-9a-f]{8}|[0-9a-f]{17})$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-subnetids)
     * @param subnetIds The subnets in which network interfaces are created to connect streaming
     * instances to your VPC. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * The tags to add to the network settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-tags)
     * @param tags The tags to add to the network settings resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to add to the network settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-tags)
     * @param tags The tags to add to the network settings resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The VPC that streaming instances will connect to.
     *
     * *Pattern* : `^vpc-[0-9a-z]*$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-vpcid)
     * @param vpcId The VPC that streaming instances will connect to. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnNetworkSettings =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.workspacesweb.CfnNetworkSettings.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkSettings {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkSettings(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnNetworkSettings):
        CfnNetworkSettings = CfnNetworkSettings(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkSettings):
        software.amazon.awscdk.services.workspacesweb.CfnNetworkSettings = wrapped.cdkObject as
        software.amazon.awscdk.services.workspacesweb.CfnNetworkSettings
  }
}
