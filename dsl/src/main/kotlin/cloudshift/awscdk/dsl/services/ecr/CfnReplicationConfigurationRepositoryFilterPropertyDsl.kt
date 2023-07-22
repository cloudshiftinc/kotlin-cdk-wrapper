@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration

@CdkDslMarker
public class CfnReplicationConfigurationRepositoryFilterPropertyDsl {
  private val cdkBuilder: CfnReplicationConfiguration.RepositoryFilterProperty.Builder =
      CfnReplicationConfiguration.RepositoryFilterProperty.builder()

  /**
   * @param filter The repository filter details. 
   * When the `PREFIX_MATCH` filter type is specified, this value is required and should be the
   * repository name prefix to configure replication for.
   */
  public fun filter(filter: String) {
    cdkBuilder.filter(filter)
  }

  /**
   * @param filterType The repository filter type. 
   * The only supported value is `PREFIX_MATCH` , which is a repository name prefix specified with
   * the `filter` parameter.
   */
  public fun filterType(filterType: String) {
    cdkBuilder.filterType(filterType)
  }

  public fun build(): CfnReplicationConfiguration.RepositoryFilterProperty = cdkBuilder.build()
}
