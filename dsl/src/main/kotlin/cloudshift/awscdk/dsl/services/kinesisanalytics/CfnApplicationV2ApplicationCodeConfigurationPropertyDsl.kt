@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2ApplicationCodeConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.ApplicationCodeConfigurationProperty.Builder =
      CfnApplicationV2.ApplicationCodeConfigurationProperty.builder()

  /**
   * @param codeContent The location and type of the application code. 
   */
  public fun codeContent(codeContent: IResolvable) {
    cdkBuilder.codeContent(codeContent)
  }

  /**
   * @param codeContent The location and type of the application code. 
   */
  public fun codeContent(codeContent: CfnApplicationV2.CodeContentProperty) {
    cdkBuilder.codeContent(codeContent)
  }

  /**
   * @param codeContentType Specifies whether the code content is in text or zip format. 
   */
  public fun codeContentType(codeContentType: String) {
    cdkBuilder.codeContentType(codeContentType)
  }

  public fun build(): CfnApplicationV2.ApplicationCodeConfigurationProperty = cdkBuilder.build()
}
