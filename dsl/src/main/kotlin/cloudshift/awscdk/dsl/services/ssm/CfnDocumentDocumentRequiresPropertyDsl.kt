@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssm.CfnDocument

@CdkDslMarker
public class CfnDocumentDocumentRequiresPropertyDsl {
  private val cdkBuilder: CfnDocument.DocumentRequiresProperty.Builder =
      CfnDocument.DocumentRequiresProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnDocument.DocumentRequiresProperty = cdkBuilder.build()
}
