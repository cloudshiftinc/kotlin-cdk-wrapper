@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.comprehend.CfnFlywheel

/**
 * Configuration required for an entity recognition model.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.comprehend.*;
 * EntityRecognitionConfigProperty entityRecognitionConfigProperty =
 * EntityRecognitionConfigProperty.builder()
 * .entityTypes(List.of(EntityTypesListItemProperty.builder()
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-entityrecognitionconfig.html)
 */
@CdkDslMarker
public class CfnFlywheelEntityRecognitionConfigPropertyDsl {
  private val cdkBuilder: CfnFlywheel.EntityRecognitionConfigProperty.Builder =
      CfnFlywheel.EntityRecognitionConfigProperty.builder()

  private val _entityTypes: MutableList<Any> = mutableListOf()

  /**
   * @param entityTypes Up to 25 entity types that the model is trained to recognize.
   */
  public fun entityTypes(vararg entityTypes: Any) {
    _entityTypes.addAll(listOf(*entityTypes))
  }

  /**
   * @param entityTypes Up to 25 entity types that the model is trained to recognize.
   */
  public fun entityTypes(entityTypes: Collection<Any>) {
    _entityTypes.addAll(entityTypes)
  }

  /**
   * @param entityTypes Up to 25 entity types that the model is trained to recognize.
   */
  public fun entityTypes(entityTypes: IResolvable) {
    cdkBuilder.entityTypes(entityTypes)
  }

  public fun build(): CfnFlywheel.EntityRecognitionConfigProperty {
    if(_entityTypes.isNotEmpty()) cdkBuilder.entityTypes(_entityTypes)
    return cdkBuilder.build()
  }
}
