@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps

@CdkDslMarker
public class CfnReplicationSetPropsDsl {
  private val cdkBuilder: CfnReplicationSetProps.Builder = CfnReplicationSetProps.builder()

  private val _regions: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param deletionProtected Determines if the replication set deletion protection is enabled or
   * not.
   * If deletion protection is enabled, you can't delete the last Region in the replication set.
   */
  public fun deletionProtected(deletionProtected: Boolean) {
    cdkBuilder.deletionProtected(deletionProtected)
  }

  /**
   * @param deletionProtected Determines if the replication set deletion protection is enabled or
   * not.
   * If deletion protection is enabled, you can't delete the last Region in the replication set.
   */
  public fun deletionProtected(deletionProtected: IResolvable) {
    cdkBuilder.deletionProtected(deletionProtected)
  }

  /**
   * @param regions Specifies the Regions of the replication set. 
   */
  public fun regions(vararg regions: Any) {
    _regions.addAll(listOf(*regions))
  }

  /**
   * @param regions Specifies the Regions of the replication set. 
   */
  public fun regions(regions: Collection<Any>) {
    _regions.addAll(regions)
  }

  /**
   * @param regions Specifies the Regions of the replication set. 
   */
  public fun regions(regions: IResolvable) {
    cdkBuilder.regions(regions)
  }

  /**
   * @param tags A list of tags to add to the replication set.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of tags to add to the replication set.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnReplicationSetProps {
    if(_regions.isNotEmpty()) cdkBuilder.regions(_regions)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
