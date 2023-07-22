@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageTransformJobDefinitionPropertyDsl {
  private val cdkBuilder: CfnModelPackage.TransformJobDefinitionProperty.Builder =
      CfnModelPackage.TransformJobDefinitionProperty.builder()

  /**
   * @param batchStrategy A string that determines the number of records included in a single
   * mini-batch.
   * `SingleRecord` means only one record is used per mini-batch. `MultiRecord` means a mini-batch
   * is set to contain as many records that can fit within the `MaxPayloadInMB` limit.
   */
  public fun batchStrategy(batchStrategy: String) {
    cdkBuilder.batchStrategy(batchStrategy)
  }

  /**
   * @param environment The environment variables to set in the Docker container.
   * We support up to 16 key and values entries in the map.
   */
  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param environment The environment variables to set in the Docker container.
   * We support up to 16 key and values entries in the map.
   */
  public fun environment(environment: IResolvable) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param maxConcurrentTransforms The maximum number of parallel requests that can be sent to each
   * instance in a transform job.
   * The default value is 1.
   */
  public fun maxConcurrentTransforms(maxConcurrentTransforms: Number) {
    cdkBuilder.maxConcurrentTransforms(maxConcurrentTransforms)
  }

  /**
   * @param maxPayloadInMb The maximum payload size allowed, in MB.
   * A payload is the data portion of a record (without metadata).
   */
  public fun maxPayloadInMb(maxPayloadInMb: Number) {
    cdkBuilder.maxPayloadInMb(maxPayloadInMb)
  }

  /**
   * @param transformInput A description of the input source and the way the transform job consumes
   * it. 
   */
  public fun transformInput(transformInput: IResolvable) {
    cdkBuilder.transformInput(transformInput)
  }

  /**
   * @param transformInput A description of the input source and the way the transform job consumes
   * it. 
   */
  public fun transformInput(transformInput: CfnModelPackage.TransformInputProperty) {
    cdkBuilder.transformInput(transformInput)
  }

  /**
   * @param transformOutput Identifies the Amazon S3 location where you want Amazon SageMaker to
   * save the results from the transform job. 
   */
  public fun transformOutput(transformOutput: IResolvable) {
    cdkBuilder.transformOutput(transformOutput)
  }

  /**
   * @param transformOutput Identifies the Amazon S3 location where you want Amazon SageMaker to
   * save the results from the transform job. 
   */
  public fun transformOutput(transformOutput: CfnModelPackage.TransformOutputProperty) {
    cdkBuilder.transformOutput(transformOutput)
  }

  /**
   * @param transformResources Identifies the ML compute instances for the transform job. 
   */
  public fun transformResources(transformResources: IResolvable) {
    cdkBuilder.transformResources(transformResources)
  }

  /**
   * @param transformResources Identifies the ML compute instances for the transform job. 
   */
  public fun transformResources(transformResources: CfnModelPackage.TransformResourcesProperty) {
    cdkBuilder.transformResources(transformResources)
  }

  public fun build(): CfnModelPackage.TransformJobDefinitionProperty = cdkBuilder.build()
}
