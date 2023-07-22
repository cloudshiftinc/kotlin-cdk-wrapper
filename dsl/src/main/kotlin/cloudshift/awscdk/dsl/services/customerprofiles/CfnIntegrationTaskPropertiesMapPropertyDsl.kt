@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * A map used to store task-related information.
 *
 * The execution service looks for particular information based on the `TaskType` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * TaskPropertiesMapProperty taskPropertiesMapProperty = TaskPropertiesMapProperty.builder()
 * .operatorPropertyKey("operatorPropertyKey")
 * .property("property")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-taskpropertiesmap.html)
 */
@CdkDslMarker
public class CfnIntegrationTaskPropertiesMapPropertyDsl {
  private val cdkBuilder: CfnIntegration.TaskPropertiesMapProperty.Builder =
      CfnIntegration.TaskPropertiesMapProperty.builder()

  /**
   * @param operatorPropertyKey The task property key. 
   */
  public fun operatorPropertyKey(operatorPropertyKey: String) {
    cdkBuilder.operatorPropertyKey(operatorPropertyKey)
  }

  /**
   * @param property The task property value. 
   */
  public fun `property`(`property`: String) {
    cdkBuilder.`property`(`property`)
  }

  public fun build(): CfnIntegration.TaskPropertiesMapProperty = cdkBuilder.build()
}
