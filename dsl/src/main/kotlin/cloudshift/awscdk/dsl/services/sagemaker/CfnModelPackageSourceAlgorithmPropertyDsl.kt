@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageSourceAlgorithmPropertyDsl {
  private val cdkBuilder: CfnModelPackage.SourceAlgorithmProperty.Builder =
      CfnModelPackage.SourceAlgorithmProperty.builder()

  /**
   * @param algorithmName The name of an algorithm that was used to create the model package. 
   * The algorithm must be either an algorithm resource in your SageMaker account or an algorithm in
   * AWS Marketplace that you are subscribed to.
   */
  public fun algorithmName(algorithmName: String) {
    cdkBuilder.algorithmName(algorithmName)
  }

  /**
   * @param modelDataUrl The Amazon S3 path where the model artifacts, which result from model
   * training, are stored.
   * This path must point to a single `gzip` compressed tar archive ( `.tar.gz` suffix).
   *
   *
   * The model artifacts must be in an S3 bucket that is in the same AWS region as the algorithm.
   */
  public fun modelDataUrl(modelDataUrl: String) {
    cdkBuilder.modelDataUrl(modelDataUrl)
  }

  public fun build(): CfnModelPackage.SourceAlgorithmProperty = cdkBuilder.build()
}
