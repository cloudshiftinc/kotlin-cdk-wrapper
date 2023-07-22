@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.s3.LocationDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CodeConfig
import software.amazon.awscdk.services.lambda.CodeImageConfig
import software.amazon.awscdk.services.s3.Location

@CdkDslMarker
public class CodeConfigDsl {
  private val cdkBuilder: CodeConfig.Builder = CodeConfig.builder()

  /**
   * @param image Docker image configuration (mutually exclusive with `s3Location` and
   * `inlineCode`).
   */
  public fun image(image: CodeImageConfigDsl.() -> Unit = {}) {
    val builder = CodeImageConfigDsl()
    builder.apply(image)
    cdkBuilder.image(builder.build())
  }

  /**
   * @param image Docker image configuration (mutually exclusive with `s3Location` and
   * `inlineCode`).
   */
  public fun image(image: CodeImageConfig) {
    cdkBuilder.image(image)
  }

  /**
   * @param inlineCode Inline code (mutually exclusive with `s3Location` and `image`).
   */
  public fun inlineCode(inlineCode: String) {
    cdkBuilder.inlineCode(inlineCode)
  }

  /**
   * @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode` and
   * `image`).
   */
  public fun s3Location(s3Location: LocationDsl.() -> Unit = {}) {
    val builder = LocationDsl()
    builder.apply(s3Location)
    cdkBuilder.s3Location(builder.build())
  }

  /**
   * @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode` and
   * `image`).
   */
  public fun s3Location(s3Location: Location) {
    cdkBuilder.s3Location(s3Location)
  }

  public fun build(): CodeConfig = cdkBuilder.build()
}
