@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDefaultNewSheetConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.DefaultNewSheetConfigurationProperty.Builder =
      CfnTemplate.DefaultNewSheetConfigurationProperty.builder()

  /**
   * @param interactiveLayoutConfiguration The options that determine the default settings for
   * interactive layout configuration.
   */
  public fun interactiveLayoutConfiguration(interactiveLayoutConfiguration: IResolvable) {
    cdkBuilder.interactiveLayoutConfiguration(interactiveLayoutConfiguration)
  }

  /**
   * @param interactiveLayoutConfiguration The options that determine the default settings for
   * interactive layout configuration.
   */
  public
      fun interactiveLayoutConfiguration(interactiveLayoutConfiguration: CfnTemplate.DefaultInteractiveLayoutConfigurationProperty) {
    cdkBuilder.interactiveLayoutConfiguration(interactiveLayoutConfiguration)
  }

  /**
   * @param paginatedLayoutConfiguration The options that determine the default settings for a
   * paginated layout configuration.
   */
  public fun paginatedLayoutConfiguration(paginatedLayoutConfiguration: IResolvable) {
    cdkBuilder.paginatedLayoutConfiguration(paginatedLayoutConfiguration)
  }

  /**
   * @param paginatedLayoutConfiguration The options that determine the default settings for a
   * paginated layout configuration.
   */
  public
      fun paginatedLayoutConfiguration(paginatedLayoutConfiguration: CfnTemplate.DefaultPaginatedLayoutConfigurationProperty) {
    cdkBuilder.paginatedLayoutConfiguration(paginatedLayoutConfiguration)
  }

  /**
   * @param sheetContentType The option that determines the sheet content type.
   */
  public fun sheetContentType(sheetContentType: String) {
    cdkBuilder.sheetContentType(sheetContentType)
  }

  public fun build(): CfnTemplate.DefaultNewSheetConfigurationProperty = cdkBuilder.build()
}
