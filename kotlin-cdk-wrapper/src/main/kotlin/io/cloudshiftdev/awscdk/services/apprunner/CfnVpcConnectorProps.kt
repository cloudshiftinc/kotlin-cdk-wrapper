@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnVpcConnector`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apprunner.*;
 * CfnVpcConnectorProps cfnVpcConnectorProps = CfnVpcConnectorProps.builder()
 * .subnets(List.of("subnets"))
 * // the properties below are optional
 * .securityGroups(List.of("securityGroups"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcConnectorName("vpcConnectorName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html)
 */
public interface CfnVpcConnectorProps {
  /**
   * A list of IDs of security groups that App Runner should use for access to AWS resources under
   * the specified subnets.
   *
   * If not specified, App Runner uses the default security group of the Amazon VPC. The default
   * security group allows all outbound traffic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-securitygroups)
   */
  public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  /**
   * A list of IDs of subnets that App Runner should use when it associates your service with a
   * custom Amazon VPC.
   *
   * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the
   * subnets you specify.
   *
   *
   * App Runner currently only provides support for IPv4.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-subnets)
   */
  public fun subnets(): List<String>

  /**
   * A list of metadata items that you can associate with your VPC connector resource.
   *
   * A tag is a key-value pair.
   *
   *
   * A `VpcConnector` is immutable, so you cannot update its tags. To change the tags, replace the
   * resource. To replace a `VpcConnector` , you must provide a new combination of security groups.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A name for the VPC connector.
   *
   * If you don't specify a name, AWS CloudFormation generates a name for your VPC connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-vpcconnectorname)
   */
  public fun vpcConnectorName(): String? = unwrap(this).getVpcConnectorName()

  /**
   * A builder for [CfnVpcConnectorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param securityGroups A list of IDs of security groups that App Runner should use for access
     * to AWS resources under the specified subnets.
     * If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * @param securityGroups A list of IDs of security groups that App Runner should use for access
     * to AWS resources under the specified subnets.
     * If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     */
    public fun securityGroups(vararg securityGroups: String)

    /**
     * @param subnets A list of IDs of subnets that App Runner should use when it associates your
     * service with a custom Amazon VPC. 
     * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the
     * subnets you specify.
     *
     *
     * App Runner currently only provides support for IPv4.
     */
    public fun subnets(subnets: List<String>)

    /**
     * @param subnets A list of IDs of subnets that App Runner should use when it associates your
     * service with a custom Amazon VPC. 
     * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the
     * subnets you specify.
     *
     *
     * App Runner currently only provides support for IPv4.
     */
    public fun subnets(vararg subnets: String)

    /**
     * @param tags A list of metadata items that you can associate with your VPC connector resource.
     * A tag is a key-value pair.
     *
     *
     * A `VpcConnector` is immutable, so you cannot update its tags. To change the tags, replace the
     * resource. To replace a `VpcConnector` , you must provide a new combination of security groups.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of metadata items that you can associate with your VPC connector resource.
     * A tag is a key-value pair.
     *
     *
     * A `VpcConnector` is immutable, so you cannot update its tags. To change the tags, replace the
     * resource. To replace a `VpcConnector` , you must provide a new combination of security groups.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcConnectorName A name for the VPC connector.
     * If you don't specify a name, AWS CloudFormation generates a name for your VPC connector.
     */
    public fun vpcConnectorName(vpcConnectorName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps.Builder =
        software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps.builder()

    /**
     * @param securityGroups A list of IDs of security groups that App Runner should use for access
     * to AWS resources under the specified subnets.
     * If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * @param securityGroups A list of IDs of security groups that App Runner should use for access
     * to AWS resources under the specified subnets.
     * If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param subnets A list of IDs of subnets that App Runner should use when it associates your
     * service with a custom Amazon VPC. 
     * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the
     * subnets you specify.
     *
     *
     * App Runner currently only provides support for IPv4.
     */
    override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

    /**
     * @param subnets A list of IDs of subnets that App Runner should use when it associates your
     * service with a custom Amazon VPC. 
     * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the
     * subnets you specify.
     *
     *
     * App Runner currently only provides support for IPv4.
     */
    override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

    /**
     * @param tags A list of metadata items that you can associate with your VPC connector resource.
     * A tag is a key-value pair.
     *
     *
     * A `VpcConnector` is immutable, so you cannot update its tags. To change the tags, replace the
     * resource. To replace a `VpcConnector` , you must provide a new combination of security groups.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of metadata items that you can associate with your VPC connector resource.
     * A tag is a key-value pair.
     *
     *
     * A `VpcConnector` is immutable, so you cannot update its tags. To change the tags, replace the
     * resource. To replace a `VpcConnector` , you must provide a new combination of security groups.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcConnectorName A name for the VPC connector.
     * If you don't specify a name, AWS CloudFormation generates a name for your VPC connector.
     */
    override fun vpcConnectorName(vpcConnectorName: String) {
      cdkBuilder.vpcConnectorName(vpcConnectorName)
    }

    public fun build(): software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps,
  ) : CdkObject(cdkObject), CfnVpcConnectorProps {
    /**
     * A list of IDs of security groups that App Runner should use for access to AWS resources under
     * the specified subnets.
     *
     * If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-securitygroups)
     */
    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * A list of IDs of subnets that App Runner should use when it associates your service with a
     * custom Amazon VPC.
     *
     * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the
     * subnets you specify.
     *
     *
     * App Runner currently only provides support for IPv4.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-subnets)
     */
    override fun subnets(): List<String> = unwrap(this).getSubnets()

    /**
     * A list of metadata items that you can associate with your VPC connector resource.
     *
     * A tag is a key-value pair.
     *
     *
     * A `VpcConnector` is immutable, so you cannot update its tags. To change the tags, replace the
     * resource. To replace a `VpcConnector` , you must provide a new combination of security groups.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A name for the VPC connector.
     *
     * If you don't specify a name, AWS CloudFormation generates a name for your VPC connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-vpcconnectorname)
     */
    override fun vpcConnectorName(): String? = unwrap(this).getVpcConnectorName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVpcConnectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps):
        CfnVpcConnectorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVpcConnectorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVpcConnectorProps):
        software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps
  }
}
