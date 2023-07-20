@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.docdb.RotationMultiUserOptions
import software.amazon.awscdk.services.secretsmanager.ISecret

@CdkDslMarker
public class RotationMultiUserOptionsDsl {
  private val cdkBuilder: RotationMultiUserOptions.Builder = RotationMultiUserOptions.builder()

  public fun automaticallyAfter(automaticallyAfter: Duration) {
    cdkBuilder.automaticallyAfter(automaticallyAfter)
  }

  public fun secret(secret: ISecret) {
    cdkBuilder.secret(secret)
  }

  public fun build(): RotationMultiUserOptions = cdkBuilder.build()
}
