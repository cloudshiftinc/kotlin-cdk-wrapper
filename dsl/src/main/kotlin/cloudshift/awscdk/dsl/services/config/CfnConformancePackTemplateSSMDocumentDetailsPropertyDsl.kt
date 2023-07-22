@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.config.CfnConformancePack

@CdkDslMarker
public class CfnConformancePackTemplateSSMDocumentDetailsPropertyDsl {
  private val cdkBuilder: CfnConformancePack.TemplateSSMDocumentDetailsProperty.Builder =
      CfnConformancePack.TemplateSSMDocumentDetailsProperty.builder()

  /**
   * @param documentName The name or Amazon Resource Name (ARN) of the SSM document to use to create
   * a conformance pack.
   * If you use the document name, AWS Config checks only your account and AWS Region for the SSM
   * document. If you want to use an SSM document from another Region or account, you must provide the
   * ARN.
   */
  public fun documentName(documentName: String) {
    cdkBuilder.documentName(documentName)
  }

  /**
   * @param documentVersion The version of the SSM document to use to create a conformance pack.
   * By default, AWS Config uses the latest version.
   *
   *
   * This field is optional.
   */
  public fun documentVersion(documentVersion: String) {
    cdkBuilder.documentVersion(documentVersion)
  }

  public fun build(): CfnConformancePack.TemplateSSMDocumentDetailsProperty = cdkBuilder.build()
}
