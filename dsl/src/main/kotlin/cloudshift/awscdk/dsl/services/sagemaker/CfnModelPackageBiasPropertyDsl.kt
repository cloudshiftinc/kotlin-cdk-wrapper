@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageBiasPropertyDsl {
  private val cdkBuilder: CfnModelPackage.BiasProperty.Builder =
      CfnModelPackage.BiasProperty.builder()

  public fun postTrainingReport(postTrainingReport: IResolvable) {
    cdkBuilder.postTrainingReport(postTrainingReport)
  }

  public fun postTrainingReport(postTrainingReport: CfnModelPackage.MetricsSourceProperty) {
    cdkBuilder.postTrainingReport(postTrainingReport)
  }

  public fun preTrainingReport(preTrainingReport: IResolvable) {
    cdkBuilder.preTrainingReport(preTrainingReport)
  }

  public fun preTrainingReport(preTrainingReport: CfnModelPackage.MetricsSourceProperty) {
    cdkBuilder.preTrainingReport(preTrainingReport)
  }

  public fun report(report: IResolvable) {
    cdkBuilder.report(report)
  }

  public fun report(report: CfnModelPackage.MetricsSourceProperty) {
    cdkBuilder.report(report)
  }

  public fun build(): CfnModelPackage.BiasProperty = cdkBuilder.build()
}
