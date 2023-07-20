@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CustomAttributeConfig
import software.amazon.awscdk.services.cognito.NumberAttributeConstraints
import software.amazon.awscdk.services.cognito.StringAttributeConstraints

@CdkDslMarker
public class CustomAttributeConfigDsl {
  private val cdkBuilder: CustomAttributeConfig.Builder = CustomAttributeConfig.builder()

  public fun dataType(dataType: String) {
    cdkBuilder.dataType(dataType)
  }

  public fun mutable(mutable: Boolean) {
    cdkBuilder.mutable(mutable)
  }

  public fun numberConstraints(block: NumberAttributeConstraintsDsl.() -> Unit = {}) {
    val builder = NumberAttributeConstraintsDsl()
    builder.apply(block)
    cdkBuilder.numberConstraints(builder.build())
  }

  public fun numberConstraints(numberConstraints: NumberAttributeConstraints) {
    cdkBuilder.numberConstraints(numberConstraints)
  }

  public fun stringConstraints(block: StringAttributeConstraintsDsl.() -> Unit = {}) {
    val builder = StringAttributeConstraintsDsl()
    builder.apply(block)
    cdkBuilder.stringConstraints(builder.build())
  }

  public fun stringConstraints(stringConstraints: StringAttributeConstraints) {
    cdkBuilder.stringConstraints(stringConstraints)
  }

  public fun build(): CustomAttributeConfig = cdkBuilder.build()
}
