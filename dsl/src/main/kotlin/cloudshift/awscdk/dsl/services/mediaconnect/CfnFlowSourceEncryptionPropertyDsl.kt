@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnFlowSource

@CdkDslMarker
public class CfnFlowSourceEncryptionPropertyDsl {
  private val cdkBuilder: CfnFlowSource.EncryptionProperty.Builder =
      CfnFlowSource.EncryptionProperty.builder()

  /**
   * @param algorithm The type of algorithm that is used for static key encryption (such as aes128,
   * aes192, or aes256).
   * If you are using SPEKE or SRT-password encryption, this property must be left blank.
   */
  public fun algorithm(algorithm: String) {
    cdkBuilder.algorithm(algorithm)
  }

  /**
   * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a 32-character
   * string, to be used with the key for encrypting content.
   * This parameter is not valid for static key encryption.
   */
  public fun constantInitializationVector(constantInitializationVector: String) {
    cdkBuilder.constantInitializationVector(constantInitializationVector)
  }

  /**
   * @param deviceId The value of one of the devices that you configured with your digital rights
   * management (DRM) platform key provider.
   * This parameter is required for SPEKE encryption and is not valid for static key encryption.
   */
  public fun deviceId(deviceId: String) {
    cdkBuilder.deviceId(deviceId)
  }

  /**
   * @param keyType The type of key that is used for the encryption.
   * If you don't specify a `keyType` value, the service uses the default setting ( `static-key` ).
   * Valid key types are: `static-key` , `speke` , and `srt-password` .
   */
  public fun keyType(keyType: String) {
    cdkBuilder.keyType(keyType)
  }

  /**
   * @param region The AWS Region that the API Gateway proxy endpoint was created in.
   * This parameter is required for SPEKE encryption and is not valid for static key encryption.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param resourceId An identifier for the content.
   * The service sends this value to the key server to identify the current endpoint. The resource
   * ID is also known as the content ID. This parameter is required for SPEKE encryption and is not
   * valid for static key encryption.
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of the role that you created during setup (when
   * you set up MediaConnect as a trusted entity). 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param secretArn The ARN of the secret that you created in AWS Secrets Manager to store the
   * encryption key.
   */
  public fun secretArn(secretArn: String) {
    cdkBuilder.secretArn(secretArn)
  }

  /**
   * @param url The URL from the API Gateway proxy that you set up to talk to your key server.
   * This parameter is required for SPEKE encryption and is not valid for static key encryption.
   */
  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnFlowSource.EncryptionProperty = cdkBuilder.build()
}
