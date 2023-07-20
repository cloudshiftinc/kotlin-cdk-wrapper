@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@CdkDslMarker
public class CfnScheduledQueryTargetConfigurationPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.TargetConfigurationProperty.Builder =
      CfnScheduledQuery.TargetConfigurationProperty.builder()

  public fun timestreamConfiguration(timestreamConfiguration: IResolvable) {
    cdkBuilder.timestreamConfiguration(timestreamConfiguration)
  }

  public
      fun timestreamConfiguration(timestreamConfiguration: CfnScheduledQuery.TimestreamConfigurationProperty) {
    cdkBuilder.timestreamConfiguration(timestreamConfiguration)
  }

  public fun build(): CfnScheduledQuery.TargetConfigurationProperty = cdkBuilder.build()
}
