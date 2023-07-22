@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.actions.AddHeaderProps

@CdkDslMarker
public class AddHeaderPropsDsl {
  private val cdkBuilder: AddHeaderProps.Builder = AddHeaderProps.builder()

  /**
   * @param name The name of the header to add. 
   * Must be between 1 and 50 characters,
   * inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters
   * and dashes only.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value of the header to add. 
   * Must be less than 2048 characters,
   * and must not contain newline characters ("\r" or "\n").
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): AddHeaderProps = cdkBuilder.build()
}
