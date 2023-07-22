@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration

@CdkDslMarker
public class CfnReplicationConfigurationReplicationConfigurationPropertyDsl {
  private val cdkBuilder: CfnReplicationConfiguration.ReplicationConfigurationProperty.Builder =
      CfnReplicationConfiguration.ReplicationConfigurationProperty.builder()

  private val _rules: MutableList<Any> = mutableListOf()

  /**
   * @param rules An array of objects representing the replication destinations and repository
   * filters for a replication configuration. 
   */
  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  /**
   * @param rules An array of objects representing the replication destinations and repository
   * filters for a replication configuration. 
   */
  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  /**
   * @param rules An array of objects representing the replication destinations and repository
   * filters for a replication configuration. 
   */
  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun build(): CfnReplicationConfiguration.ReplicationConfigurationProperty {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    return cdkBuilder.build()
  }
}
