@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * Error information for the data source creation or update.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataSourceErrorInfoProperty dataSourceErrorInfoProperty = DataSourceErrorInfoProperty.builder()
 * .message("message")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-datasourceerrorinfo.html)
 */
@CdkDslMarker
public class CfnDataSourceDataSourceErrorInfoPropertyDsl {
  private val cdkBuilder: CfnDataSource.DataSourceErrorInfoProperty.Builder =
      CfnDataSource.DataSourceErrorInfoProperty.builder()

  /**
   * @param message Error message.
   */
  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  /**
   * @param type Error type.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDataSource.DataSourceErrorInfoProperty = cdkBuilder.build()
}
