@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.stepfunctions.tasks.TransformResources

@CdkDslMarker
public class TransformResourcesDsl {
  private val cdkBuilder: TransformResources.Builder = TransformResources.builder()

  /**
   * @param instanceCount Number of ML compute instances to use in the transform job. 
   */
  public fun instanceCount(instanceCount: Number) {
    cdkBuilder.instanceCount(instanceCount)
  }

  /**
   * @param instanceType ML compute instance type for the transform job. 
   */
  public fun instanceType(instanceType: InstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param volumeEncryptionKey AWS KMS key that Amazon SageMaker uses to encrypt data on the
   * storage volume attached to the ML compute instance(s).
   */
  public fun volumeEncryptionKey(volumeEncryptionKey: IKey) {
    cdkBuilder.volumeEncryptionKey(volumeEncryptionKey)
  }

  public fun build(): TransformResources = cdkBuilder.build()
}
