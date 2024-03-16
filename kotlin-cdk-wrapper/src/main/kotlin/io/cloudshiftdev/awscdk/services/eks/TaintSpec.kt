@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Taint interface.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * TaintSpec taintSpec = TaintSpec.builder()
 * .effect(TaintEffect.NO_SCHEDULE)
 * .key("key")
 * .value("value")
 * .build();
 * ```
 */
public interface TaintSpec {
  /**
   * Effect type.
   *
   * Default: - None
   */
  public fun effect(): TaintEffect? = unwrap(this).getEffect()?.let(TaintEffect::wrap)

  /**
   * Taint key.
   *
   * Default: - None
   */
  public fun key(): String? = unwrap(this).getKey()

  /**
   * Taint value.
   *
   * Default: - None
   */
  public fun `value`(): String? = unwrap(this).getValue()

  /**
   * A builder for [TaintSpec]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param effect Effect type.
     */
    public fun effect(effect: TaintEffect)

    /**
     * @param key Taint key.
     */
    public fun key(key: String)

    /**
     * @param value Taint value.
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.TaintSpec.Builder =
        software.amazon.awscdk.services.eks.TaintSpec.builder()

    /**
     * @param effect Effect type.
     */
    override fun effect(effect: TaintEffect) {
      cdkBuilder.effect(effect.let(TaintEffect::unwrap))
    }

    /**
     * @param key Taint key.
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param value Taint value.
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.eks.TaintSpec = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.TaintSpec,
  ) : CdkObject(cdkObject), TaintSpec {
    /**
     * Effect type.
     *
     * Default: - None
     */
    override fun effect(): TaintEffect? = unwrap(this).getEffect()?.let(TaintEffect::wrap)

    /**
     * Taint key.
     *
     * Default: - None
     */
    override fun key(): String? = unwrap(this).getKey()

    /**
     * Taint value.
     *
     * Default: - None
     */
    override fun `value`(): String? = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TaintSpec {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.TaintSpec): TaintSpec =
        CdkObjectWrappers.wrap(cdkObject) as TaintSpec

    internal fun unwrap(wrapped: TaintSpec): software.amazon.awscdk.services.eks.TaintSpec =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.TaintSpec
  }
}
