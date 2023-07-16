@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.comprehend.CfnFlywheel

@CdkDslMarker
public class CfnFlywheelTaskConfigPropertyDsl {
  private val cdkBuilder: CfnFlywheel.TaskConfigProperty.Builder =
      CfnFlywheel.TaskConfigProperty.builder()

  public fun documentClassificationConfig(documentClassificationConfig: IResolvable) {
    cdkBuilder.documentClassificationConfig(documentClassificationConfig)
  }

  public
      fun documentClassificationConfig(documentClassificationConfig: CfnFlywheel.DocumentClassificationConfigProperty) {
    cdkBuilder.documentClassificationConfig(documentClassificationConfig)
  }

  public fun entityRecognitionConfig(entityRecognitionConfig: IResolvable) {
    cdkBuilder.entityRecognitionConfig(entityRecognitionConfig)
  }

  public
      fun entityRecognitionConfig(entityRecognitionConfig: CfnFlywheel.EntityRecognitionConfigProperty) {
    cdkBuilder.entityRecognitionConfig(entityRecognitionConfig)
  }

  public fun languageCode(languageCode: String) {
    cdkBuilder.languageCode(languageCode)
  }

  public fun build(): CfnFlywheel.TaskConfigProperty = cdkBuilder.build()
}
