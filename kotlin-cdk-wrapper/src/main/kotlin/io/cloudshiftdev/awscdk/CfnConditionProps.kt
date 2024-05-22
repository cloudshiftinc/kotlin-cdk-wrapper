@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

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
public interface CfnConditionProps {
  /**
   * The expression that the condition will evaluate.
   *
   * Default: - None.
   */
  public fun expression(): ICfnConditionExpression? =
      unwrap(this).getExpression()?.let(ICfnConditionExpression::wrap)

  /**
   * A builder for [CfnConditionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param expression The expression that the condition will evaluate.
     */
    public fun expression(expression: ICfnConditionExpression)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnConditionProps.Builder =
        software.amazon.awscdk.CfnConditionProps.builder()

    /**
     * @param expression The expression that the condition will evaluate.
     */
    override fun expression(expression: ICfnConditionExpression) {
      cdkBuilder.expression(expression.let(ICfnConditionExpression.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.CfnConditionProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnConditionProps,
  ) : CdkObject(cdkObject), CfnConditionProps {
    /**
     * The expression that the condition will evaluate.
     *
     * Default: - None.
     */
    override fun expression(): ICfnConditionExpression? =
        unwrap(this).getExpression()?.let(ICfnConditionExpression::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConditionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnConditionProps): CfnConditionProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnConditionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConditionProps): software.amazon.awscdk.CfnConditionProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CfnConditionProps
  }
}
