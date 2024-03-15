@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface FirelensConfig {
  public fun options(): FirelensOptions? = unwrap(this).getOptions()?.let(FirelensOptions::wrap)

  public fun type(): FirelensLogRouterType

  @CdkDslMarker
  public interface Builder {
    public fun options(options: FirelensOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b2a56dc7893552029c77062db91cbc8d0a2a2f1898db47586a83f479af359a2")
    public fun options(options: FirelensOptions.Builder.() -> Unit)

    public fun type(type: FirelensLogRouterType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FirelensConfig.Builder =
        software.amazon.awscdk.services.ecs.FirelensConfig.builder()

    override fun options(options: FirelensOptions) {
      cdkBuilder.options(options.let(FirelensOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b2a56dc7893552029c77062db91cbc8d0a2a2f1898db47586a83f479af359a2")
    override fun options(options: FirelensOptions.Builder.() -> Unit): Unit =
        options(FirelensOptions(options))

    override fun type(type: FirelensLogRouterType) {
      cdkBuilder.type(type.let(FirelensLogRouterType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.FirelensConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.FirelensConfig,
  ) : CdkObject(cdkObject), FirelensConfig {
    override fun options(): FirelensOptions? = unwrap(this).getOptions()?.let(FirelensOptions::wrap)

    override fun type(): FirelensLogRouterType =
        unwrap(this).getType().let(FirelensLogRouterType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FirelensConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FirelensConfig): FirelensConfig
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FirelensConfig): software.amazon.awscdk.services.ecs.FirelensConfig
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.FirelensConfig
  }
}
