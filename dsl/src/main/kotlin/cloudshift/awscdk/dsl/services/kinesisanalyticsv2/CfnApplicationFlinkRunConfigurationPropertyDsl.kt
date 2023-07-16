@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationFlinkRunConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.FlinkRunConfigurationProperty.Builder =
      CfnApplication.FlinkRunConfigurationProperty.builder()

  public fun allowNonRestoredState(allowNonRestoredState: Boolean) {
    cdkBuilder.allowNonRestoredState(allowNonRestoredState)
  }

  public fun allowNonRestoredState(allowNonRestoredState: IResolvable) {
    cdkBuilder.allowNonRestoredState(allowNonRestoredState)
  }

  public fun build(): CfnApplication.FlinkRunConfigurationProperty = cdkBuilder.build()
}
