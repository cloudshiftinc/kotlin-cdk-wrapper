@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The type returned from the `IInstanceEngine.bind` method.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * OptionGroup optionGroup;
 * InstanceEngineConfig instanceEngineConfig = InstanceEngineConfig.builder()
 * .features(InstanceEngineFeatures.builder()
 * .s3Export("s3Export")
 * .s3Import("s3Import")
 * .build())
 * .optionGroup(optionGroup)
 * .build();
 * ```
 */
public interface InstanceEngineConfig {
  /**
   * Features supported by the database engine.
   *
   * Default: - no features
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DBEngineVersion.html)
   */
  public fun features(): InstanceEngineFeatures? =
      unwrap(this).getFeatures()?.let(InstanceEngineFeatures::wrap)

  /**
   * Option group of the database.
   *
   * Default: - none
   */
  public fun optionGroup(): IOptionGroup? = unwrap(this).getOptionGroup()?.let(IOptionGroup::wrap)

  /**
   * A builder for [InstanceEngineConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param features Features supported by the database engine.
     */
    public fun features(features: InstanceEngineFeatures)

    /**
     * @param features Features supported by the database engine.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("750c4e3d367a1eed55fd985b9a583a4a5eed9ef9c237c45095fb2870144a2a65")
    public fun features(features: InstanceEngineFeatures.Builder.() -> Unit)

    /**
     * @param optionGroup Option group of the database.
     */
    public fun optionGroup(optionGroup: IOptionGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.InstanceEngineConfig.Builder =
        software.amazon.awscdk.services.rds.InstanceEngineConfig.builder()

    /**
     * @param features Features supported by the database engine.
     */
    override fun features(features: InstanceEngineFeatures) {
      cdkBuilder.features(features.let(InstanceEngineFeatures.Companion::unwrap))
    }

    /**
     * @param features Features supported by the database engine.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("750c4e3d367a1eed55fd985b9a583a4a5eed9ef9c237c45095fb2870144a2a65")
    override fun features(features: InstanceEngineFeatures.Builder.() -> Unit): Unit =
        features(InstanceEngineFeatures(features))

    /**
     * @param optionGroup Option group of the database.
     */
    override fun optionGroup(optionGroup: IOptionGroup) {
      cdkBuilder.optionGroup(optionGroup.let(IOptionGroup.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.InstanceEngineConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.InstanceEngineConfig,
  ) : CdkObject(cdkObject), InstanceEngineConfig {
    /**
     * Features supported by the database engine.
     *
     * Default: - no features
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DBEngineVersion.html)
     */
    override fun features(): InstanceEngineFeatures? =
        unwrap(this).getFeatures()?.let(InstanceEngineFeatures::wrap)

    /**
     * Option group of the database.
     *
     * Default: - none
     */
    override fun optionGroup(): IOptionGroup? =
        unwrap(this).getOptionGroup()?.let(IOptionGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceEngineConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.InstanceEngineConfig):
        InstanceEngineConfig = CdkObjectWrappers.wrap(cdkObject) as? InstanceEngineConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstanceEngineConfig):
        software.amazon.awscdk.services.rds.InstanceEngineConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.InstanceEngineConfig
  }
}
