@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.comprehend.CfnFlywheel

/**
 * Configuration about the model associated with a flywheel.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.comprehend.*;
 * TaskConfigProperty taskConfigProperty = TaskConfigProperty.builder()
 * .languageCode("languageCode")
 * // the properties below are optional
 * .documentClassificationConfig(DocumentClassificationConfigProperty.builder()
 * .mode("mode")
 * // the properties below are optional
 * .labels(List.of("labels"))
 * .build())
 * .entityRecognitionConfig(EntityRecognitionConfigProperty.builder()
 * .entityTypes(List.of(EntityTypesListItemProperty.builder()
 * .type("type")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-taskconfig.html)
 */
@CdkDslMarker
public class CfnFlywheelTaskConfigPropertyDsl {
  private val cdkBuilder: CfnFlywheel.TaskConfigProperty.Builder =
      CfnFlywheel.TaskConfigProperty.builder()

  /**
   * @param documentClassificationConfig Configuration required for a document classification model.
   */
  public fun documentClassificationConfig(documentClassificationConfig: IResolvable) {
    cdkBuilder.documentClassificationConfig(documentClassificationConfig)
  }

  /**
   * @param documentClassificationConfig Configuration required for a document classification model.
   */
  public
      fun documentClassificationConfig(documentClassificationConfig: CfnFlywheel.DocumentClassificationConfigProperty) {
    cdkBuilder.documentClassificationConfig(documentClassificationConfig)
  }

  /**
   * @param entityRecognitionConfig Configuration required for an entity recognition model.
   */
  public fun entityRecognitionConfig(entityRecognitionConfig: IResolvable) {
    cdkBuilder.entityRecognitionConfig(entityRecognitionConfig)
  }

  /**
   * @param entityRecognitionConfig Configuration required for an entity recognition model.
   */
  public
      fun entityRecognitionConfig(entityRecognitionConfig: CfnFlywheel.EntityRecognitionConfigProperty) {
    cdkBuilder.entityRecognitionConfig(entityRecognitionConfig)
  }

  /**
   * @param languageCode Language code for the language that the model supports. 
   */
  public fun languageCode(languageCode: String) {
    cdkBuilder.languageCode(languageCode)
  }

  public fun build(): CfnFlywheel.TaskConfigProperty = cdkBuilder.build()
}
