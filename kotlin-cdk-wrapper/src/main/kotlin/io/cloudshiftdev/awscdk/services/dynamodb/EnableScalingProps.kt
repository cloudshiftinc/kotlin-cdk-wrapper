@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Properties for enabling DynamoDB capacity scaling.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * Table table;
 * IScalableTableAttribute readCapacity = table.autoScaleReadCapacity(EnableScalingProps.builder()
 * .minCapacity(10)
 * .maxCapacity(1000)
 * .build());
 * readCapacity.scaleOnUtilization(UtilizationScalingProps.builder()
 * .targetUtilizationPercent(60)
 * .build());
 * ```
 */
public interface EnableScalingProps {
  /**
   * Maximum capacity to scale to.
   */
  public fun maxCapacity(): Number

  /**
   * Minimum capacity to scale to.
   */
  public fun minCapacity(): Number

  /**
   * A builder for [EnableScalingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxCapacity Maximum capacity to scale to. 
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * @param minCapacity Minimum capacity to scale to. 
     */
    public fun minCapacity(minCapacity: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.EnableScalingProps.Builder =
        software.amazon.awscdk.services.dynamodb.EnableScalingProps.builder()

    /**
     * @param maxCapacity Maximum capacity to scale to. 
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param minCapacity Minimum capacity to scale to. 
     */
    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.EnableScalingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.EnableScalingProps,
  ) : CdkObject(cdkObject), EnableScalingProps {
    /**
     * Maximum capacity to scale to.
     */
    override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

    /**
     * Minimum capacity to scale to.
     */
    override fun minCapacity(): Number = unwrap(this).getMinCapacity()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EnableScalingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.EnableScalingProps):
        EnableScalingProps = CdkObjectWrappers.wrap(cdkObject) as? EnableScalingProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnableScalingProps):
        software.amazon.awscdk.services.dynamodb.EnableScalingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.EnableScalingProps
  }
}
