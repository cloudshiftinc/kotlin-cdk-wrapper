@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps

@CdkDslMarker
public class CfnDBSecurityGroupPropsDsl {
  private val cdkBuilder: CfnDBSecurityGroupProps.Builder = CfnDBSecurityGroupProps.builder()

  private val _dbSecurityGroupIngress: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group. 
   */
  public fun dbSecurityGroupIngress(vararg dbSecurityGroupIngress: Any) {
    _dbSecurityGroupIngress.addAll(listOf(*dbSecurityGroupIngress))
  }

  /**
   * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group. 
   */
  public fun dbSecurityGroupIngress(dbSecurityGroupIngress: Collection<Any>) {
    _dbSecurityGroupIngress.addAll(dbSecurityGroupIngress)
  }

  /**
   * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group. 
   */
  public fun dbSecurityGroupIngress(dbSecurityGroupIngress: IResolvable) {
    cdkBuilder.dbSecurityGroupIngress(dbSecurityGroupIngress)
  }

  /**
   * @param ec2VpcId The identifier of an Amazon VPC. This property indicates the VPC that this DB
   * security group belongs to.
   *
   * The `EC2VpcId` property is for backward compatibility with older regions, and is no longer
   * recommended for providing security information to an RDS DB instance.
   */
  public fun ec2VpcId(ec2VpcId: String) {
    cdkBuilder.ec2VpcId(ec2VpcId)
  }

  /**
   * @param groupDescription Provides the description of the DB security group. 
   */
  public fun groupDescription(groupDescription: String) {
    cdkBuilder.groupDescription(groupDescription)
  }

  /**
   * @param tags An optional array of key-value pairs to apply to this DB security group.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An optional array of key-value pairs to apply to this DB security group.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDBSecurityGroupProps {
    if(_dbSecurityGroupIngress.isNotEmpty())
        cdkBuilder.dbSecurityGroupIngress(_dbSecurityGroupIngress)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
