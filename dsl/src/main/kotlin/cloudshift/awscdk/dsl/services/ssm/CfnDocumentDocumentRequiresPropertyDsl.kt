@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssm.CfnDocument

@CdkDslMarker
public class CfnDocumentDocumentRequiresPropertyDsl {
  private val cdkBuilder: CfnDocument.DocumentRequiresProperty.Builder =
      CfnDocument.DocumentRequiresProperty.builder()

  /**
   * @param name The name of the required SSM document.
   * The name can be an Amazon Resource Name (ARN).
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param version The document version required by the current document.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnDocument.DocumentRequiresProperty = cdkBuilder.build()
}
