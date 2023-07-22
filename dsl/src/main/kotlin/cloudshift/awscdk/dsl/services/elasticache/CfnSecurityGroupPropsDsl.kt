@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps

@CdkDslMarker
public class CfnSecurityGroupPropsDsl {
  private val cdkBuilder: CfnSecurityGroupProps.Builder = CfnSecurityGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description A description for the cache security group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param tags A tag that can be added to an ElastiCache security group.
   * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
   * security groups. A tag with a null Value is permitted.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A tag that can be added to an ElastiCache security group.
   * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
   * security groups. A tag with a null Value is permitted.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSecurityGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
