@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CodeConfig

@CdkDslMarker
public class CodeConfigDsl {
  private val cdkBuilder: CodeConfig.Builder = CodeConfig.builder()

  /**
   * @param inlineCode Inline code (mutually exclusive with `s3Location`).
   */
  public fun inlineCode(inlineCode: String) {
    cdkBuilder.inlineCode(inlineCode)
  }

  /**
   * @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode`.
   */
  public fun s3Location(s3Location: String) {
    cdkBuilder.s3Location(s3Location)
  }

  public fun build(): CodeConfig = cdkBuilder.build()
}
