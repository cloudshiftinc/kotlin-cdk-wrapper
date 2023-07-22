@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

@CdkDslMarker
public class CfnDataSourceRedshiftParametersPropertyDsl {
  private val cdkBuilder: CfnDataSource.RedshiftParametersProperty.Builder =
      CfnDataSource.RedshiftParametersProperty.builder()

  /**
   * @param clusterId Cluster ID.
   * This field can be blank if the `Host` and `Port` are provided.
   */
  public fun clusterId(clusterId: String) {
    cdkBuilder.clusterId(clusterId)
  }

  /**
   * @param database Database. 
   */
  public fun database(database: String) {
    cdkBuilder.database(database)
  }

  /**
   * @param host Host.
   * This field can be blank if `ClusterId` is provided.
   */
  public fun host(host: String) {
    cdkBuilder.host(host)
  }

  /**
   * @param port Port.
   * This field can be blank if the `ClusterId` is provided.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnDataSource.RedshiftParametersProperty = cdkBuilder.build()
}
