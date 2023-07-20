@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTableFieldURLConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableFieldURLConfigurationProperty.Builder =
      CfnTemplate.TableFieldURLConfigurationProperty.builder()

  public fun imageConfiguration(imageConfiguration: IResolvable) {
    cdkBuilder.imageConfiguration(imageConfiguration)
  }

  public
      fun imageConfiguration(imageConfiguration: CfnTemplate.TableFieldImageConfigurationProperty) {
    cdkBuilder.imageConfiguration(imageConfiguration)
  }

  public fun linkConfiguration(linkConfiguration: IResolvable) {
    cdkBuilder.linkConfiguration(linkConfiguration)
  }

  public fun linkConfiguration(linkConfiguration: CfnTemplate.TableFieldLinkConfigurationProperty) {
    cdkBuilder.linkConfiguration(linkConfiguration)
  }

  public fun build(): CfnTemplate.TableFieldURLConfigurationProperty = cdkBuilder.build()
}
