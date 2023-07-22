@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnMLTransform

@CdkDslMarker
public class CfnMLTransformTransformEncryptionPropertyDsl {
  private val cdkBuilder: CfnMLTransform.TransformEncryptionProperty.Builder =
      CfnMLTransform.TransformEncryptionProperty.builder()

  /**
   * @param mlUserDataEncryption The encryption-at-rest settings of the transform that apply to
   * accessing user data.
   */
  public fun mlUserDataEncryption(mlUserDataEncryption: IResolvable) {
    cdkBuilder.mlUserDataEncryption(mlUserDataEncryption)
  }

  /**
   * @param mlUserDataEncryption The encryption-at-rest settings of the transform that apply to
   * accessing user data.
   */
  public
      fun mlUserDataEncryption(mlUserDataEncryption: CfnMLTransform.MLUserDataEncryptionProperty) {
    cdkBuilder.mlUserDataEncryption(mlUserDataEncryption)
  }

  /**
   * @param taskRunSecurityConfigurationName The name of the security configuration.
   */
  public fun taskRunSecurityConfigurationName(taskRunSecurityConfigurationName: String) {
    cdkBuilder.taskRunSecurityConfigurationName(taskRunSecurityConfigurationName)
  }

  public fun build(): CfnMLTransform.TransformEncryptionProperty = cdkBuilder.build()
}
