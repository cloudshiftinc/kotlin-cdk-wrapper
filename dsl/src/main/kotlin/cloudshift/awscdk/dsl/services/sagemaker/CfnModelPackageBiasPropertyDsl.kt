@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageBiasPropertyDsl {
  private val cdkBuilder: CfnModelPackage.BiasProperty.Builder =
      CfnModelPackage.BiasProperty.builder()

  /**
   * @param postTrainingReport The post-training bias report for a model.
   */
  public fun postTrainingReport(postTrainingReport: IResolvable) {
    cdkBuilder.postTrainingReport(postTrainingReport)
  }

  /**
   * @param postTrainingReport The post-training bias report for a model.
   */
  public fun postTrainingReport(postTrainingReport: CfnModelPackage.MetricsSourceProperty) {
    cdkBuilder.postTrainingReport(postTrainingReport)
  }

  /**
   * @param preTrainingReport The pre-training bias report for a model.
   */
  public fun preTrainingReport(preTrainingReport: IResolvable) {
    cdkBuilder.preTrainingReport(preTrainingReport)
  }

  /**
   * @param preTrainingReport The pre-training bias report for a model.
   */
  public fun preTrainingReport(preTrainingReport: CfnModelPackage.MetricsSourceProperty) {
    cdkBuilder.preTrainingReport(preTrainingReport)
  }

  /**
   * @param report The bias report for a model.
   */
  public fun report(report: IResolvable) {
    cdkBuilder.report(report)
  }

  /**
   * @param report The bias report for a model.
   */
  public fun report(report: CfnModelPackage.MetricsSourceProperty) {
    cdkBuilder.report(report)
  }

  public fun build(): CfnModelPackage.BiasProperty = cdkBuilder.build()
}
