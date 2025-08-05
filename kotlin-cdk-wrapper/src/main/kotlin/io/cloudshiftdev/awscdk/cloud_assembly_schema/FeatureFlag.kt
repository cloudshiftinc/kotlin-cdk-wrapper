@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * A single feature flag.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Object recommendedValue;
 * Object userValue;
 * FeatureFlag featureFlag = FeatureFlag.builder()
 * .explanation("explanation")
 * .recommendedValue(recommendedValue)
 * .userValue(userValue)
 * .build();
 * ```
 */
public interface FeatureFlag {
  /**
   * Explanation about the purpose of this flag that can be shown to the user.
   *
   * Default: - No description
   */
  public fun explanation(): String? = unwrap(this).getExplanation()

  /**
   * The library-recommended value for this flag, if any.
   *
   * It is possible that there is no recommended value.
   *
   * Default: - No recommended value.
   */
  public fun recommendedValue(): Any? = unwrap(this).getRecommendedValue()

  /**
   * The value configured by the user.
   *
   * This is the value configured at the root of the tree. Users may also have
   * configured values at specific locations in the tree; we don't report on
   * those.
   *
   * Default: - Not configured by the user
   */
  public fun userValue(): Any? = unwrap(this).getUserValue()

  /**
   * A builder for [FeatureFlag]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param explanation Explanation about the purpose of this flag that can be shown to the user.
     */
    public fun explanation(explanation: String)

    /**
     * @param recommendedValue The library-recommended value for this flag, if any.
     * It is possible that there is no recommended value.
     */
    public fun recommendedValue(recommendedValue: Any)

    /**
     * @param userValue The value configured by the user.
     * This is the value configured at the root of the tree. Users may also have
     * configured values at specific locations in the tree; we don't report on
     * those.
     */
    public fun userValue(userValue: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.FeatureFlag.Builder =
        software.amazon.awscdk.cloud_assembly_schema.FeatureFlag.builder()

    /**
     * @param explanation Explanation about the purpose of this flag that can be shown to the user.
     */
    override fun explanation(explanation: String) {
      cdkBuilder.explanation(explanation)
    }

    /**
     * @param recommendedValue The library-recommended value for this flag, if any.
     * It is possible that there is no recommended value.
     */
    override fun recommendedValue(recommendedValue: Any) {
      cdkBuilder.recommendedValue(recommendedValue)
    }

    /**
     * @param userValue The value configured by the user.
     * This is the value configured at the root of the tree. Users may also have
     * configured values at specific locations in the tree; we don't report on
     * those.
     */
    override fun userValue(userValue: Any) {
      cdkBuilder.userValue(userValue)
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.FeatureFlag =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.FeatureFlag,
  ) : CdkObject(cdkObject),
      FeatureFlag {
    /**
     * Explanation about the purpose of this flag that can be shown to the user.
     *
     * Default: - No description
     */
    override fun explanation(): String? = unwrap(this).getExplanation()

    /**
     * The library-recommended value for this flag, if any.
     *
     * It is possible that there is no recommended value.
     *
     * Default: - No recommended value.
     */
    override fun recommendedValue(): Any? = unwrap(this).getRecommendedValue()

    /**
     * The value configured by the user.
     *
     * This is the value configured at the root of the tree. Users may also have
     * configured values at specific locations in the tree; we don't report on
     * those.
     *
     * Default: - Not configured by the user
     */
    override fun userValue(): Any? = unwrap(this).getUserValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FeatureFlag {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.FeatureFlag):
        FeatureFlag = CdkObjectWrappers.wrap(cdkObject) as? FeatureFlag ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FeatureFlag):
        software.amazon.awscdk.cloud_assembly_schema.FeatureFlag = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloud_assembly_schema.FeatureFlag
  }
}
