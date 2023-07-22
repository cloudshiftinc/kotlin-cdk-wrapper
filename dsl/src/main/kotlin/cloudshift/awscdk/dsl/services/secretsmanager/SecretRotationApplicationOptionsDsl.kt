@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplicationOptions

@CdkDslMarker
public class SecretRotationApplicationOptionsDsl {
  private val cdkBuilder: SecretRotationApplicationOptions.Builder =
      SecretRotationApplicationOptions.builder()

  /**
   * @param isMultiUser Whether the rotation application uses the mutli user scheme.
   */
  public fun isMultiUser(isMultiUser: Boolean) {
    cdkBuilder.isMultiUser(isMultiUser)
  }

  public fun build(): SecretRotationApplicationOptions = cdkBuilder.build()
}
