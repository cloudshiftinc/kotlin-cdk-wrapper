@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * S3KeyFilterProperty s3KeyFilterProperty = S3KeyFilterProperty.builder()
 * .rules(List.of(S3KeyFilterRuleProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3keyfilter.html)
 */
@CdkDslMarker
public class CfnFunctionS3KeyFilterPropertyDsl {
  private val cdkBuilder: CfnFunction.S3KeyFilterProperty.Builder =
      CfnFunction.S3KeyFilterProperty.builder()

  private val _rules: MutableList<Any> = mutableListOf()

  /**
   * @param rules the value to be set. 
   */
  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  /**
   * @param rules the value to be set. 
   */
  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  /**
   * @param rules the value to be set. 
   */
  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun build(): CfnFunction.S3KeyFilterProperty {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    return cdkBuilder.build()
  }
}
