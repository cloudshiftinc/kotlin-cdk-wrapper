@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * A Capacity Provider strategy to use for the service.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * CapacityProviderStrategy capacityProviderStrategy = CapacityProviderStrategy.builder()
 * .capacityProvider("capacityProvider")
 * // the properties below are optional
 * .base(123)
 * .weight(123)
 * .build();
 * ```
 */
public interface CapacityProviderStrategy {
  /**
   * The base value designates how many tasks, at a minimum, to run on the specified capacity
   * provider.
   *
   * Only one
   * capacity provider in a capacity provider strategy can have a base defined. If no value is
   * specified, the default
   * value of 0 is used.
   *
   * Default: - none
   */
  public fun base(): Number? = unwrap(this).getBase()

  /**
   * The name of the capacity provider.
   */
  public fun capacityProvider(): String

  /**
   * The weight value designates the relative percentage of the total number of tasks launched that
   * should use the specified capacity provider.
   *
   * The weight value is taken into consideration after the base value, if defined, is satisfied.
   *
   * Default: - 0
   */
  public fun weight(): Number? = unwrap(this).getWeight()

  /**
   * A builder for [CapacityProviderStrategy]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param base The base value designates how many tasks, at a minimum, to run on the specified
     * capacity provider.
     * Only one
     * capacity provider in a capacity provider strategy can have a base defined. If no value is
     * specified, the default
     * value of 0 is used.
     */
    public fun base(base: Number)

    /**
     * @param capacityProvider The name of the capacity provider. 
     */
    public fun capacityProvider(capacityProvider: String)

    /**
     * @param weight The weight value designates the relative percentage of the total number of
     * tasks launched that should use the specified capacity provider.
     * The weight value is taken into consideration after the base value, if defined, is satisfied.
     */
    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CapacityProviderStrategy.Builder =
        software.amazon.awscdk.services.ecs.CapacityProviderStrategy.builder()

    /**
     * @param base The base value designates how many tasks, at a minimum, to run on the specified
     * capacity provider.
     * Only one
     * capacity provider in a capacity provider strategy can have a base defined. If no value is
     * specified, the default
     * value of 0 is used.
     */
    override fun base(base: Number) {
      cdkBuilder.base(base)
    }

    /**
     * @param capacityProvider The name of the capacity provider. 
     */
    override fun capacityProvider(capacityProvider: String) {
      cdkBuilder.capacityProvider(capacityProvider)
    }

    /**
     * @param weight The weight value designates the relative percentage of the total number of
     * tasks launched that should use the specified capacity provider.
     * The weight value is taken into consideration after the base value, if defined, is satisfied.
     */
    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CapacityProviderStrategy =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.CapacityProviderStrategy,
  ) : CdkObject(cdkObject), CapacityProviderStrategy {
    /**
     * The base value designates how many tasks, at a minimum, to run on the specified capacity
     * provider.
     *
     * Only one
     * capacity provider in a capacity provider strategy can have a base defined. If no value is
     * specified, the default
     * value of 0 is used.
     *
     * Default: - none
     */
    override fun base(): Number? = unwrap(this).getBase()

    /**
     * The name of the capacity provider.
     */
    override fun capacityProvider(): String = unwrap(this).getCapacityProvider()

    /**
     * The weight value designates the relative percentage of the total number of tasks launched
     * that should use the specified capacity provider.
     *
     * The weight value is taken into consideration after the base value, if defined, is satisfied.
     *
     * Default: - 0
     */
    override fun weight(): Number? = unwrap(this).getWeight()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CapacityProviderStrategy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CapacityProviderStrategy):
        CapacityProviderStrategy = CdkObjectWrappers.wrap(cdkObject) as? CapacityProviderStrategy ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CapacityProviderStrategy):
        software.amazon.awscdk.services.ecs.CapacityProviderStrategy = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.CapacityProviderStrategy
  }
}
