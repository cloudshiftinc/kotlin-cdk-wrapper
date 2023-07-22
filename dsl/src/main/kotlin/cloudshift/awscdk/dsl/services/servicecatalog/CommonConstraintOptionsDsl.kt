@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CommonConstraintOptions
import software.amazon.awscdk.services.servicecatalog.MessageLanguage

@CdkDslMarker
public class CommonConstraintOptionsDsl {
  private val cdkBuilder: CommonConstraintOptions.Builder = CommonConstraintOptions.builder()

  /**
   * @param description The description of the constraint.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param messageLanguage The language code.
   * Configures the language for error messages from service catalog.
   */
  public fun messageLanguage(messageLanguage: MessageLanguage) {
    cdkBuilder.messageLanguage(messageLanguage)
  }

  public fun build(): CommonConstraintOptions = cdkBuilder.build()
}
