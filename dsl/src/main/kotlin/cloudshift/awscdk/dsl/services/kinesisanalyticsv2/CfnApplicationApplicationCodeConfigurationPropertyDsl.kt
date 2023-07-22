@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationApplicationCodeConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.ApplicationCodeConfigurationProperty.Builder =
      CfnApplication.ApplicationCodeConfigurationProperty.builder()

  /**
   * @param codeContent The location and type of the application code. 
   */
  public fun codeContent(codeContent: IResolvable) {
    cdkBuilder.codeContent(codeContent)
  }

  /**
   * @param codeContent The location and type of the application code. 
   */
  public fun codeContent(codeContent: CfnApplication.CodeContentProperty) {
    cdkBuilder.codeContent(codeContent)
  }

  /**
   * @param codeContentType Specifies whether the code content is in text or zip format. 
   */
  public fun codeContentType(codeContentType: String) {
    cdkBuilder.codeContentType(codeContentType)
  }

  public fun build(): CfnApplication.ApplicationCodeConfigurationProperty = cdkBuilder.build()
}
