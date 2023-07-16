@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSourceProps

@CdkDslMarker
public class CfnApplicationReferenceDataSourcePropsDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSourceProps.Builder =
      CfnApplicationReferenceDataSourceProps.builder()

  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  public fun referenceDataSource(referenceDataSource: IResolvable) {
    cdkBuilder.referenceDataSource(referenceDataSource)
  }

  public
      fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSource.ReferenceDataSourceProperty) {
    cdkBuilder.referenceDataSource(referenceDataSource)
  }

  public fun build(): CfnApplicationReferenceDataSourceProps = cdkBuilder.build()
}
