@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableFieldLinkConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TableFieldLinkConfigurationProperty.Builder =
      CfnAnalysis.TableFieldLinkConfigurationProperty.builder()

  public fun content(content: IResolvable) {
    cdkBuilder.content(content)
  }

  public fun content(content: CfnAnalysis.TableFieldLinkContentConfigurationProperty) {
    cdkBuilder.content(content)
  }

  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnAnalysis.TableFieldLinkConfigurationProperty = cdkBuilder.build()
}
