@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.VolumeAttributes
import software.amazon.awscdk.services.kms.IKey

@CdkDslMarker
public class VolumeAttributesDsl {
  private val cdkBuilder: VolumeAttributes.Builder = VolumeAttributes.builder()

  /**
   * @param availabilityZone The availability zone that the EBS Volume is contained within (ex:
   * us-west-2a). 
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param encryptionKey The customer-managed encryption key that is used to encrypt the Volume.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param volumeId The EBS Volume's ID. 
   */
  public fun volumeId(volumeId: String) {
    cdkBuilder.volumeId(volumeId)
  }

  public fun build(): VolumeAttributes = cdkBuilder.build()
}
