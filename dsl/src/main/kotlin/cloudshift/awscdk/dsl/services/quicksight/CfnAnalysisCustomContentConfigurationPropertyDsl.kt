@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisCustomContentConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.CustomContentConfigurationProperty.Builder =
      CfnAnalysis.CustomContentConfigurationProperty.builder()

  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  public fun contentUrl(contentUrl: String) {
    cdkBuilder.contentUrl(contentUrl)
  }

  public fun imageScaling(imageScaling: String) {
    cdkBuilder.imageScaling(imageScaling)
  }

  public fun build(): CfnAnalysis.CustomContentConfigurationProperty = cdkBuilder.build()
}
