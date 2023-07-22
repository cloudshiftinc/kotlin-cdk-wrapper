@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnConditionProps
import software.amazon.awscdk.ICfnConditionExpression

/**
 * Example:
 *
 * ```
 * CfnBucket rawBucket = CfnBucket.Builder.create(this, "Bucket").build();
 * // -or-
 * CfnBucket rawBucketAlt = (CfnBucket)myBucket.getNode().getDefaultChild();
 * // then
 * rawBucket.getCfnOptions().getCondition() = CfnCondition.Builder.create(this,
 * "EnableBucket").build();
 * rawBucket.getCfnOptions().getMetadata() = Map.of(
 * "metadataKey", "MetadataValue");
 * ```
 */
@CdkDslMarker
public class CfnConditionPropsDsl {
  private val cdkBuilder: CfnConditionProps.Builder = CfnConditionProps.builder()

  /**
   * @param expression The expression that the condition will evaluate.
   */
  public fun expression(expression: ICfnConditionExpression) {
    cdkBuilder.expression(expression)
  }

  public fun build(): CfnConditionProps = cdkBuilder.build()
}
