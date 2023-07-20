@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig

@CdkDslMarker
public class ResourceConfigDsl {
  private val cdkBuilder: ResourceConfig.Builder = ResourceConfig.builder()

  public fun instanceCount(instanceCount: Number) {
    cdkBuilder.instanceCount(instanceCount)
  }

  public fun instanceType(instanceType: InstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun volumeEncryptionKey(volumeEncryptionKey: IKey) {
    cdkBuilder.volumeEncryptionKey(volumeEncryptionKey)
  }

  public fun volumeSize(volumeSize: Size) {
    cdkBuilder.volumeSize(volumeSize)
  }

  public fun build(): ResourceConfig = cdkBuilder.build()
}
