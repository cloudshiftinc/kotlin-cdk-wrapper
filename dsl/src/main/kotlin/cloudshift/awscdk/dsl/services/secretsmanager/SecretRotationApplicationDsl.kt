@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplication

@CdkDslMarker
public class SecretRotationApplicationDsl(
  arg0: String,
  arg1: String,
) {
  private val cdkBuilder: SecretRotationApplication.Builder =
      SecretRotationApplication.Builder.create(arg0, arg1)

  public fun isMultiUser(isMultiUser: Boolean) {
    cdkBuilder.isMultiUser(isMultiUser)
  }

  public fun build(): SecretRotationApplication = cdkBuilder.build()
}
