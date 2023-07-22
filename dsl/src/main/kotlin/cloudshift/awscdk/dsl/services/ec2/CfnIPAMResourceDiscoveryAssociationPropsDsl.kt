@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps

@CdkDslMarker
public class CfnIPAMResourceDiscoveryAssociationPropsDsl {
  private val cdkBuilder: CfnIPAMResourceDiscoveryAssociationProps.Builder =
      CfnIPAMResourceDiscoveryAssociationProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param ipamId The IPAM ID. 
   */
  public fun ipamId(ipamId: String) {
    cdkBuilder.ipamId(ipamId)
  }

  /**
   * @param ipamResourceDiscoveryId The resource discovery ID. 
   */
  public fun ipamResourceDiscoveryId(ipamResourceDiscoveryId: String) {
    cdkBuilder.ipamResourceDiscoveryId(ipamResourceDiscoveryId)
  }

  /**
   * @param tags A tag is a label that you assign to an AWS resource.
   * Each tag consists of a key and an optional value. You can use tags to search and filter your
   * resources or track your AWS costs.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A tag is a label that you assign to an AWS resource.
   * Each tag consists of a key and an optional value. You can use tags to search and filter your
   * resources or track your AWS costs.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnIPAMResourceDiscoveryAssociationProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
