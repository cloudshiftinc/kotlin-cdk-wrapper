@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cassandra

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cassandra.CfnKeyspace
import software.amazon.awscdk.services.cassandra.CfnKeyspaceProps

@CdkDslMarker
public class CfnKeyspacePropsDsl {
  private val cdkBuilder: CfnKeyspaceProps.Builder = CfnKeyspaceProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun keyspaceName(keyspaceName: String) {
    cdkBuilder.keyspaceName(keyspaceName)
  }

  public fun replicationSpecification(replicationSpecification: IResolvable) {
    cdkBuilder.replicationSpecification(replicationSpecification)
  }

  public
      fun replicationSpecification(replicationSpecification: CfnKeyspace.ReplicationSpecificationProperty) {
    cdkBuilder.replicationSpecification(replicationSpecification)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnKeyspaceProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
