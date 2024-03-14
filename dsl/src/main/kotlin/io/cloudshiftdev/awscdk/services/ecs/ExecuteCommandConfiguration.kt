package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ExecuteCommandConfiguration {
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  public fun logConfiguration(): ExecuteCommandLogConfiguration? =
      unwrap(this).getLogConfiguration()?.let(ExecuteCommandLogConfiguration::wrap)

  public fun logging(): ExecuteCommandLogging? =
      unwrap(this).getLogging()?.let(ExecuteCommandLogging::wrap)

  public interface Builder {
    public fun kmsKey(kmsKey: IKey) {
    }

    public fun logConfiguration(logConfiguration: ExecuteCommandLogConfiguration) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec714f7e5ac80d6b9294aba4d2276f21851c72d1b5c99d2e6133640fbad3fa73")
    public
        fun logConfiguration(logConfiguration: ExecuteCommandLogConfiguration.Builder.() -> Unit) {
    }

    public fun logging(logging: ExecuteCommandLogging) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration.Builder
        = software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration.builder()

    public override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    public override fun logConfiguration(logConfiguration: ExecuteCommandLogConfiguration) {
      cdkBuilder.logConfiguration(logConfiguration.let(ExecuteCommandLogConfiguration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec714f7e5ac80d6b9294aba4d2276f21851c72d1b5c99d2e6133640fbad3fa73")
    public override
        fun logConfiguration(logConfiguration: ExecuteCommandLogConfiguration.Builder.() -> Unit):
        Unit = logConfiguration(ExecuteCommandLogConfiguration(logConfiguration))

    public override fun logging(logging: ExecuteCommandLogging) {
      cdkBuilder.logging(logging.let(ExecuteCommandLogging::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration,
  ) : ExecuteCommandConfiguration {
    public override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    public override fun logConfiguration(): ExecuteCommandLogConfiguration? =
        unwrap(this).getLogConfiguration()?.let(ExecuteCommandLogConfiguration::wrap)

    public override fun logging(): ExecuteCommandLogging? =
        unwrap(this).getLogging()?.let(ExecuteCommandLogging::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ExecuteCommandConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration):
        ExecuteCommandConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExecuteCommandConfiguration):
        software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration = (wrapped as
        Wrapper).cdkObject
  }
}
