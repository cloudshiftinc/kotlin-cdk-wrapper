@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableFieldURLConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TableFieldURLConfigurationProperty.Builder =
      CfnAnalysis.TableFieldURLConfigurationProperty.builder()

  public fun imageConfiguration(imageConfiguration: IResolvable) {
    cdkBuilder.imageConfiguration(imageConfiguration)
  }

  public
      fun imageConfiguration(imageConfiguration: CfnAnalysis.TableFieldImageConfigurationProperty) {
    cdkBuilder.imageConfiguration(imageConfiguration)
  }

  public fun linkConfiguration(linkConfiguration: IResolvable) {
    cdkBuilder.linkConfiguration(linkConfiguration)
  }

  public fun linkConfiguration(linkConfiguration: CfnAnalysis.TableFieldLinkConfigurationProperty) {
    cdkBuilder.linkConfiguration(linkConfiguration)
  }

  public fun build(): CfnAnalysis.TableFieldURLConfigurationProperty = cdkBuilder.build()
}
