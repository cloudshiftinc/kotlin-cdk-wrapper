@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnTaskTemplate

@CdkDslMarker
public class CfnTaskTemplateFieldIdentifierPropertyDsl {
  private val cdkBuilder: CfnTaskTemplate.FieldIdentifierProperty.Builder =
      CfnTaskTemplate.FieldIdentifierProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnTaskTemplate.FieldIdentifierProperty = cdkBuilder.build()
}
