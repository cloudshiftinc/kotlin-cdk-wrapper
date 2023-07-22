@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableFieldLinkConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.TableFieldLinkConfigurationProperty.Builder =
      CfnDashboard.TableFieldLinkConfigurationProperty.builder()

  /**
   * @param content The URL content (text, icon) for the table link configuration. 
   */
  public fun content(content: IResolvable) {
    cdkBuilder.content(content)
  }

  /**
   * @param content The URL content (text, icon) for the table link configuration. 
   */
  public fun content(content: CfnDashboard.TableFieldLinkContentConfigurationProperty) {
    cdkBuilder.content(content)
  }

  /**
   * @param target The URL target (new tab, new window, same tab) for the table link configuration. 
   */
  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnDashboard.TableFieldLinkConfigurationProperty = cdkBuilder.build()
}
