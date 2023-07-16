@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.ssm.SecureStringParameterAttributes

@CdkDslMarker
public class SecureStringParameterAttributesDsl {
  private val cdkBuilder: SecureStringParameterAttributes.Builder =
      SecureStringParameterAttributes.builder()

  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun simpleName(simpleName: Boolean) {
    cdkBuilder.simpleName(simpleName)
  }

  public fun version(version: Number) {
    cdkBuilder.version(version)
  }

  public fun build(): SecureStringParameterAttributes = cdkBuilder.build()
}
