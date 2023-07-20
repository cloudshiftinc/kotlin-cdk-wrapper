@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2
import software.constructs.Construct

@CdkDslMarker
public class CfnApplicationReferenceDataSourceV2Dsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplicationReferenceDataSourceV2.Builder =
      CfnApplicationReferenceDataSourceV2.Builder.create(scope, id)

  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  public fun referenceDataSource(referenceDataSource: IResolvable) {
    cdkBuilder.referenceDataSource(referenceDataSource)
  }

  public
      fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty) {
    cdkBuilder.referenceDataSource(referenceDataSource)
  }

  public fun build(): CfnApplicationReferenceDataSourceV2 = cdkBuilder.build()
}
