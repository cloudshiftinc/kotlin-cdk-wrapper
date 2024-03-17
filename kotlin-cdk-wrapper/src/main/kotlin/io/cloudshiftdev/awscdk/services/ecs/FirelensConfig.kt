@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Firelens Configuration
 * https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html#firelens-taskdef.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * FirelensConfig firelensConfig = FirelensConfig.builder()
 * .type(FirelensLogRouterType.FLUENTBIT)
 * // the properties below are optional
 * .options(FirelensOptions.builder()
 * .configFileType(FirelensConfigFileType.S3)
 * .configFileValue("configFileValue")
 * .enableECSLogMetadata(false)
 * .build())
 * .build();
 * ```
 */
public interface FirelensConfig {
  /**
   * Firelens options.
   *
   * Default: - no additional options
   */
  public fun options(): FirelensOptions? = unwrap(this).getOptions()?.let(FirelensOptions::wrap)

  /**
   * The log router to use.
   *
   * Default: - fluentbit
   */
  public fun type(): FirelensLogRouterType

  /**
   * A builder for [FirelensConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param options Firelens options.
     */
    public fun options(options: FirelensOptions)

    /**
     * @param options Firelens options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b2a56dc7893552029c77062db91cbc8d0a2a2f1898db47586a83f479af359a2")
    public fun options(options: FirelensOptions.Builder.() -> Unit)

    /**
     * @param type The log router to use. 
     */
    public fun type(type: FirelensLogRouterType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FirelensConfig.Builder =
        software.amazon.awscdk.services.ecs.FirelensConfig.builder()

    /**
     * @param options Firelens options.
     */
    override fun options(options: FirelensOptions) {
      cdkBuilder.options(options.let(FirelensOptions::unwrap))
    }

    /**
     * @param options Firelens options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b2a56dc7893552029c77062db91cbc8d0a2a2f1898db47586a83f479af359a2")
    override fun options(options: FirelensOptions.Builder.() -> Unit): Unit =
        options(FirelensOptions(options))

    /**
     * @param type The log router to use. 
     */
    override fun type(type: FirelensLogRouterType) {
      cdkBuilder.type(type.let(FirelensLogRouterType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.FirelensConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.FirelensConfig,
  ) : CdkObject(cdkObject), FirelensConfig {
    /**
     * Firelens options.
     *
     * Default: - no additional options
     */
    override fun options(): FirelensOptions? = unwrap(this).getOptions()?.let(FirelensOptions::wrap)

    /**
     * The log router to use.
     *
     * Default: - fluentbit
     */
    override fun type(): FirelensLogRouterType =
        unwrap(this).getType().let(FirelensLogRouterType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FirelensConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FirelensConfig): FirelensConfig
        = CdkObjectWrappers.wrap(cdkObject) as? FirelensConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FirelensConfig): software.amazon.awscdk.services.ecs.FirelensConfig
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.FirelensConfig
  }
}
