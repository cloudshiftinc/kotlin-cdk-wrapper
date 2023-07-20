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

  public fun dbSecurityGroupIngress(vararg dbSecurityGroupIngress: Any) {
    _dbSecurityGroupIngress.addAll(listOf(*dbSecurityGroupIngress))
  }

  public fun dbSecurityGroupIngress(dbSecurityGroupIngress: Collection<Any>) {
    _dbSecurityGroupIngress.addAll(dbSecurityGroupIngress)
  }

  public fun dbSecurityGroupIngress(dbSecurityGroupIngress: IResolvable) {
    cdkBuilder.dbSecurityGroupIngress(dbSecurityGroupIngress)
  }

  public fun ec2VpcId(ec2VpcId: String) {
    cdkBuilder.ec2VpcId(ec2VpcId)
  }

  public fun groupDescription(groupDescription: String) {
    cdkBuilder.groupDescription(groupDescription)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

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
