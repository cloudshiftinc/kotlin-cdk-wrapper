@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * S3KeyFilterRuleProperty s3KeyFilterRuleProperty = S3KeyFilterRuleProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3keyfilterrule.html)
 */
@CdkDslMarker
public class CfnFunctionS3KeyFilterRulePropertyDsl {
  private val cdkBuilder: CfnFunction.S3KeyFilterRuleProperty.Builder =
      CfnFunction.S3KeyFilterRuleProperty.builder()

  /**
   * @param name the value to be set. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value the value to be set. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnFunction.S3KeyFilterRuleProperty = cdkBuilder.build()
}
