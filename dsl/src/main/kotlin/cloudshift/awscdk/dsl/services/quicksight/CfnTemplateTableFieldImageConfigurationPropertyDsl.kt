@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTableFieldImageConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableFieldImageConfigurationProperty.Builder =
      CfnTemplate.TableFieldImageConfigurationProperty.builder()

  /**
   * @param sizingOptions The sizing options for the table image configuration.
   */
  public fun sizingOptions(sizingOptions: IResolvable) {
    cdkBuilder.sizingOptions(sizingOptions)
  }

  /**
   * @param sizingOptions The sizing options for the table image configuration.
   */
  public fun sizingOptions(sizingOptions: CfnTemplate.TableCellImageSizingConfigurationProperty) {
    cdkBuilder.sizingOptions(sizingOptions)
  }

  public fun build(): CfnTemplate.TableFieldImageConfigurationProperty = cdkBuilder.build()
}
