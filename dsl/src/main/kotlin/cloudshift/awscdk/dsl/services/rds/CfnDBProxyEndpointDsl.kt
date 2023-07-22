@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.rds.CfnDBProxyEndpoint
import software.constructs.Construct

@CdkDslMarker
public class CfnDBProxyEndpointDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDBProxyEndpoint.Builder = CfnDBProxyEndpoint.Builder.create(scope, id)

  private val _tags: MutableList<CfnDBProxyEndpoint.TagFormatProperty> = mutableListOf()

  private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

  private val _vpcSubnetIds: MutableList<String> = mutableListOf()

  /**
   * The name of the DB proxy endpoint to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-dbproxyendpointname)
   * @param dbProxyEndpointName The name of the DB proxy endpoint to create. 
   */
  public fun dbProxyEndpointName(dbProxyEndpointName: String) {
    cdkBuilder.dbProxyEndpointName(dbProxyEndpointName)
  }

  /**
   * The name of the DB proxy associated with the DB proxy endpoint that you create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-dbproxyname)
   * @param dbProxyName The name of the DB proxy associated with the DB proxy endpoint that you
   * create. 
   */
  public fun dbProxyName(dbProxyName: String) {
    cdkBuilder.dbProxyName(dbProxyName)
  }

  /**
   * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-tags)
   * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
   * with the proxy. 
   */
  public fun tags(tags: CfnDBProxyEndpointTagFormatPropertyDsl.() -> Unit) {
    _tags.add(CfnDBProxyEndpointTagFormatPropertyDsl().apply(tags).build())
  }

  /**
   * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-tags)
   * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
   * with the proxy. 
   */
  public fun tags(tags: Collection<CfnDBProxyEndpoint.TagFormatProperty>) {
    _tags.addAll(tags)
  }

  /**
   * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only
   * operations.
   *
   * Valid Values: `READ_WRITE | READ_ONLY`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-targetrole)
   * @param targetRole A value that indicates whether the DB proxy endpoint can be used for
   * read/write or read-only operations. 
   */
  public fun targetRole(targetRole: String) {
    cdkBuilder.targetRole(targetRole)
  }

  /**
   * The VPC security group IDs for the DB proxy endpoint that you create.
   *
   * You can specify a different set of security group IDs than for the original DB proxy. The
   * default is the default security group for the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsecuritygroupids)
   * @param vpcSecurityGroupIds The VPC security group IDs for the DB proxy endpoint that you
   * create. 
   */
  public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
    _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
  }

  /**
   * The VPC security group IDs for the DB proxy endpoint that you create.
   *
   * You can specify a different set of security group IDs than for the original DB proxy. The
   * default is the default security group for the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsecuritygroupids)
   * @param vpcSecurityGroupIds The VPC security group IDs for the DB proxy endpoint that you
   * create. 
   */
  public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
    _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
  }

  /**
   * The VPC subnet IDs for the DB proxy endpoint that you create.
   *
   * You can specify a different set of subnet IDs than for the original DB proxy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsubnetids)
   * @param vpcSubnetIds The VPC subnet IDs for the DB proxy endpoint that you create. 
   */
  public fun vpcSubnetIds(vararg vpcSubnetIds: String) {
    _vpcSubnetIds.addAll(listOf(*vpcSubnetIds))
  }

  /**
   * The VPC subnet IDs for the DB proxy endpoint that you create.
   *
   * You can specify a different set of subnet IDs than for the original DB proxy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsubnetids)
   * @param vpcSubnetIds The VPC subnet IDs for the DB proxy endpoint that you create. 
   */
  public fun vpcSubnetIds(vpcSubnetIds: Collection<String>) {
    _vpcSubnetIds.addAll(vpcSubnetIds)
  }

  public fun build(): CfnDBProxyEndpoint {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
    if(_vpcSubnetIds.isNotEmpty()) cdkBuilder.vpcSubnetIds(_vpcSubnetIds)
    return cdkBuilder.build()
  }
}
