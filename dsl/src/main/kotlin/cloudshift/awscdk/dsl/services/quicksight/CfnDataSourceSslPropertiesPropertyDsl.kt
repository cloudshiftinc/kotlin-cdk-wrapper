@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSource

@CdkDslMarker
public class CfnDataSourceSslPropertiesPropertyDsl {
  private val cdkBuilder: CfnDataSource.SslPropertiesProperty.Builder =
      CfnDataSource.SslPropertiesProperty.builder()

  /**
   * @param disableSsl A Boolean option to control whether SSL should be disabled.
   */
  public fun disableSsl(disableSsl: Boolean) {
    cdkBuilder.disableSsl(disableSsl)
  }

  /**
   * @param disableSsl A Boolean option to control whether SSL should be disabled.
   */
  public fun disableSsl(disableSsl: IResolvable) {
    cdkBuilder.disableSsl(disableSsl)
  }

  public fun build(): CfnDataSource.SslPropertiesProperty = cdkBuilder.build()
}
