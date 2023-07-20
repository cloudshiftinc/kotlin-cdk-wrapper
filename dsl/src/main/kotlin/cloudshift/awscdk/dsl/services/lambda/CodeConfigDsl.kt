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

  public fun image(block: CodeImageConfigDsl.() -> Unit = {}) {
    val builder = CodeImageConfigDsl()
    builder.apply(block)
    cdkBuilder.image(builder.build())
  }

  public fun image(image: CodeImageConfig) {
    cdkBuilder.image(image)
  }

  public fun inlineCode(inlineCode: String) {
    cdkBuilder.inlineCode(inlineCode)
  }

  public fun s3Location(block: LocationDsl.() -> Unit = {}) {
    val builder = LocationDsl()
    builder.apply(block)
    cdkBuilder.s3Location(builder.build())
  }

  public fun s3Location(s3Location: Location) {
    cdkBuilder.s3Location(s3Location)
  }

  public fun build(): CodeConfig = cdkBuilder.build()
}
