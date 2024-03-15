@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ExecuteCommandConfiguration {
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  public fun logConfiguration(): ExecuteCommandLogConfiguration? =
      unwrap(this).getLogConfiguration()?.let(ExecuteCommandLogConfiguration::wrap)

  public fun logging(): ExecuteCommandLogging? =
      unwrap(this).getLogging()?.let(ExecuteCommandLogging::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun kmsKey(kmsKey: IKey)

    public fun logConfiguration(logConfiguration: ExecuteCommandLogConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec714f7e5ac80d6b9294aba4d2276f21851c72d1b5c99d2e6133640fbad3fa73")
    public fun logConfiguration(logConfiguration: ExecuteCommandLogConfiguration.Builder.() -> Unit)

    public fun logging(logging: ExecuteCommandLogging)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration.Builder
        = software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration.builder()

    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    override fun logConfiguration(logConfiguration: ExecuteCommandLogConfiguration) {
      cdkBuilder.logConfiguration(logConfiguration.let(ExecuteCommandLogConfiguration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec714f7e5ac80d6b9294aba4d2276f21851c72d1b5c99d2e6133640fbad3fa73")
    override
        fun logConfiguration(logConfiguration: ExecuteCommandLogConfiguration.Builder.() -> Unit):
        Unit = logConfiguration(ExecuteCommandLogConfiguration(logConfiguration))

    override fun logging(logging: ExecuteCommandLogging) {
      cdkBuilder.logging(logging.let(ExecuteCommandLogging::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration,
  ) : CdkObject(cdkObject), ExecuteCommandConfiguration {
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    override fun logConfiguration(): ExecuteCommandLogConfiguration? =
        unwrap(this).getLogConfiguration()?.let(ExecuteCommandLogConfiguration::wrap)

    override fun logging(): ExecuteCommandLogging? =
        unwrap(this).getLogging()?.let(ExecuteCommandLogging::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExecuteCommandConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration):
        ExecuteCommandConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExecuteCommandConfiguration):
        software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration
  }
}
