@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnNetworkSettings`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
 * CfnNetworkSettingsProps cfnNetworkSettingsProps = CfnNetworkSettingsProps.builder()
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
public interface CfnNetworkSettingsProps {
  /**
   * One or more security groups used to control access from streaming instances to your VPC.
   *
   * *Pattern* : `^[\w+\-]+$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-securitygroupids)
   */
  public fun securityGroupIds(): List<String>

  /**
   * The subnets in which network interfaces are created to connect streaming instances to your VPC.
   *
   * At least two of these subnets must be in different availability zones.
   *
   * *Pattern* : `^subnet-([0-9a-f]{8}|[0-9a-f]{17})$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * The tags to add to the network settings resource.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The VPC that streaming instances will connect to.
   *
   * *Pattern* : `^vpc-[0-9a-z]*$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnNetworkSettingsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param securityGroupIds One or more security groups used to control access from streaming
     * instances to your VPC. 
     * *Pattern* : `^[\w+\-]+$`
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds One or more security groups used to control access from streaming
     * instances to your VPC. 
     * *Pattern* : `^[\w+\-]+$`
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param subnetIds The subnets in which network interfaces are created to connect streaming
     * instances to your VPC. 
     * At least two of these subnets must be in different availability zones.
     *
     * *Pattern* : `^subnet-([0-9a-f]{8}|[0-9a-f]{17})$`
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The subnets in which network interfaces are created to connect streaming
     * instances to your VPC. 
     * At least two of these subnets must be in different availability zones.
     *
     * *Pattern* : `^subnet-([0-9a-f]{8}|[0-9a-f]{17})$`
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags The tags to add to the network settings resource.
     * A tag is a key-value pair.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to the network settings resource.
     * A tag is a key-value pair.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcId The VPC that streaming instances will connect to. 
     * *Pattern* : `^vpc-[0-9a-z]*$`
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnNetworkSettingsProps.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnNetworkSettingsProps.builder()

    /**
     * @param securityGroupIds One or more security groups used to control access from streaming
     * instances to your VPC. 
     * *Pattern* : `^[\w+\-]+$`
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds One or more security groups used to control access from streaming
     * instances to your VPC. 
     * *Pattern* : `^[\w+\-]+$`
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param subnetIds The subnets in which network interfaces are created to connect streaming
     * instances to your VPC. 
     * At least two of these subnets must be in different availability zones.
     *
     * *Pattern* : `^subnet-([0-9a-f]{8}|[0-9a-f]{17})$`
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The subnets in which network interfaces are created to connect streaming
     * instances to your VPC. 
     * At least two of these subnets must be in different availability zones.
     *
     * *Pattern* : `^subnet-([0-9a-f]{8}|[0-9a-f]{17})$`
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags The tags to add to the network settings resource.
     * A tag is a key-value pair.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to add to the network settings resource.
     * A tag is a key-value pair.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcId The VPC that streaming instances will connect to. 
     * *Pattern* : `^vpc-[0-9a-z]*$`
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnNetworkSettingsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.workspacesweb.CfnNetworkSettingsProps,
  ) : CdkObject(cdkObject),
      CfnNetworkSettingsProps {
    /**
     * One or more security groups used to control access from streaming instances to your VPC.
     *
     * *Pattern* : `^[\w+\-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

    /**
     * The subnets in which network interfaces are created to connect streaming instances to your
     * VPC.
     *
     * At least two of these subnets must be in different availability zones.
     *
     * *Pattern* : `^subnet-([0-9a-f]{8}|[0-9a-f]{17})$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * The tags to add to the network settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The VPC that streaming instances will connect to.
     *
     * *Pattern* : `^vpc-[0-9a-z]*$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html#cfn-workspacesweb-networksettings-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkSettingsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnNetworkSettingsProps):
        CfnNetworkSettingsProps = CdkObjectWrappers.wrap(cdkObject) as? CfnNetworkSettingsProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkSettingsProps):
        software.amazon.awscdk.services.workspacesweb.CfnNetworkSettingsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.workspacesweb.CfnNetworkSettingsProps
  }
}
