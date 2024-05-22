@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDBProxyEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnDBProxyEndpointProps cfnDBProxyEndpointProps = CfnDBProxyEndpointProps.builder()
 * .dbProxyEndpointName("dbProxyEndpointName")
 * .dbProxyName("dbProxyName")
 * .vpcSubnetIds(List.of("vpcSubnetIds"))
 * // the properties below are optional
 * .tags(List.of(TagFormatProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetRole("targetRole")
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html)
 */
public interface CfnDBProxyEndpointProps {
  /**
   * The name of the DB proxy endpoint to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-dbproxyendpointname)
   */
  public fun dbProxyEndpointName(): String

  /**
   * The name of the DB proxy associated with the DB proxy endpoint that you create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-dbproxyname)
   */
  public fun dbProxyName(): String

  /**
   * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-tags)
   */
  public fun tags(): List<CfnDBProxyEndpoint.TagFormatProperty> =
      unwrap(this).getTags()?.map(CfnDBProxyEndpoint.TagFormatProperty::wrap) ?: emptyList()

  /**
   * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only
   * operations.
   *
   * Valid Values: `READ_WRITE | READ_ONLY`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-targetrole)
   */
  public fun targetRole(): String? = unwrap(this).getTargetRole()

  /**
   * The VPC security group IDs for the DB proxy endpoint that you create.
   *
   * You can specify a different set of security group IDs than for the original DB proxy. The
   * default is the default security group for the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsecuritygroupids)
   */
  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * The VPC subnet IDs for the DB proxy endpoint that you create.
   *
   * You can specify a different set of subnet IDs than for the original DB proxy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsubnetids)
   */
  public fun vpcSubnetIds(): List<String>

  /**
   * A builder for [CfnDBProxyEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dbProxyEndpointName The name of the DB proxy endpoint to create. 
     */
    public fun dbProxyEndpointName(dbProxyEndpointName: String)

    /**
     * @param dbProxyName The name of the DB proxy associated with the DB proxy endpoint that you
     * create. 
     */
    public fun dbProxyName(dbProxyName: String)

    /**
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy.
     */
    public fun tags(tags: List<CfnDBProxyEndpoint.TagFormatProperty>)

    /**
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy.
     */
    public fun tags(vararg tags: CfnDBProxyEndpoint.TagFormatProperty)

    /**
     * @param targetRole A value that indicates whether the DB proxy endpoint can be used for
     * read/write or read-only operations.
     * Valid Values: `READ_WRITE | READ_ONLY`
     */
    public fun targetRole(targetRole: String)

    /**
     * @param vpcSecurityGroupIds The VPC security group IDs for the DB proxy endpoint that you
     * create.
     * You can specify a different set of security group IDs than for the original DB proxy. The
     * default is the default security group for the VPC.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * @param vpcSecurityGroupIds The VPC security group IDs for the DB proxy endpoint that you
     * create.
     * You can specify a different set of security group IDs than for the original DB proxy. The
     * default is the default security group for the VPC.
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)

    /**
     * @param vpcSubnetIds The VPC subnet IDs for the DB proxy endpoint that you create. 
     * You can specify a different set of subnet IDs than for the original DB proxy.
     */
    public fun vpcSubnetIds(vpcSubnetIds: List<String>)

    /**
     * @param vpcSubnetIds The VPC subnet IDs for the DB proxy endpoint that you create. 
     * You can specify a different set of subnet IDs than for the original DB proxy.
     */
    public fun vpcSubnetIds(vararg vpcSubnetIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps.builder()

    /**
     * @param dbProxyEndpointName The name of the DB proxy endpoint to create. 
     */
    override fun dbProxyEndpointName(dbProxyEndpointName: String) {
      cdkBuilder.dbProxyEndpointName(dbProxyEndpointName)
    }

    /**
     * @param dbProxyName The name of the DB proxy associated with the DB proxy endpoint that you
     * create. 
     */
    override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    /**
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy.
     */
    override fun tags(tags: List<CfnDBProxyEndpoint.TagFormatProperty>) {
      cdkBuilder.tags(tags.map(CfnDBProxyEndpoint.TagFormatProperty.Companion::unwrap))
    }

    /**
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy.
     */
    override fun tags(vararg tags: CfnDBProxyEndpoint.TagFormatProperty): Unit = tags(tags.toList())

    /**
     * @param targetRole A value that indicates whether the DB proxy endpoint can be used for
     * read/write or read-only operations.
     * Valid Values: `READ_WRITE | READ_ONLY`
     */
    override fun targetRole(targetRole: String) {
      cdkBuilder.targetRole(targetRole)
    }

    /**
     * @param vpcSecurityGroupIds The VPC security group IDs for the DB proxy endpoint that you
     * create.
     * You can specify a different set of security group IDs than for the original DB proxy. The
     * default is the default security group for the VPC.
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * @param vpcSecurityGroupIds The VPC security group IDs for the DB proxy endpoint that you
     * create.
     * You can specify a different set of security group IDs than for the original DB proxy. The
     * default is the default security group for the VPC.
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    /**
     * @param vpcSubnetIds The VPC subnet IDs for the DB proxy endpoint that you create. 
     * You can specify a different set of subnet IDs than for the original DB proxy.
     */
    override fun vpcSubnetIds(vpcSubnetIds: List<String>) {
      cdkBuilder.vpcSubnetIds(vpcSubnetIds)
    }

    /**
     * @param vpcSubnetIds The VPC subnet IDs for the DB proxy endpoint that you create. 
     * You can specify a different set of subnet IDs than for the original DB proxy.
     */
    override fun vpcSubnetIds(vararg vpcSubnetIds: String): Unit =
        vpcSubnetIds(vpcSubnetIds.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps,
  ) : CdkObject(cdkObject), CfnDBProxyEndpointProps {
    /**
     * The name of the DB proxy endpoint to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-dbproxyendpointname)
     */
    override fun dbProxyEndpointName(): String = unwrap(this).getDbProxyEndpointName()

    /**
     * The name of the DB proxy associated with the DB proxy endpoint that you create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-dbproxyname)
     */
    override fun dbProxyName(): String = unwrap(this).getDbProxyName()

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the
     * proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-tags)
     */
    override fun tags(): List<CfnDBProxyEndpoint.TagFormatProperty> =
        unwrap(this).getTags()?.map(CfnDBProxyEndpoint.TagFormatProperty::wrap) ?: emptyList()

    /**
     * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only
     * operations.
     *
     * Valid Values: `READ_WRITE | READ_ONLY`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-targetrole)
     */
    override fun targetRole(): String? = unwrap(this).getTargetRole()

    /**
     * The VPC security group IDs for the DB proxy endpoint that you create.
     *
     * You can specify a different set of security group IDs than for the original DB proxy. The
     * default is the default security group for the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsecuritygroupids)
     */
    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()

    /**
     * The VPC subnet IDs for the DB proxy endpoint that you create.
     *
     * You can specify a different set of subnet IDs than for the original DB proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsubnetids)
     */
    override fun vpcSubnetIds(): List<String> = unwrap(this).getVpcSubnetIds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBProxyEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps):
        CfnDBProxyEndpointProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDBProxyEndpointProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBProxyEndpointProps):
        software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps
  }
}
