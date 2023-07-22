@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * The parameters for Spark.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SparkParametersProperty sparkParametersProperty = SparkParametersProperty.builder()
 * .host("host")
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sparkparameters.html)
 */
@CdkDslMarker
public class CfnDataSourceSparkParametersPropertyDsl {
  private val cdkBuilder: CfnDataSource.SparkParametersProperty.Builder =
      CfnDataSource.SparkParametersProperty.builder()

  /**
   * @param host Host. 
   */
  public fun host(host: String) {
    cdkBuilder.host(host)
  }

  /**
   * @param port Port. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnDataSource.SparkParametersProperty = cdkBuilder.build()
}
