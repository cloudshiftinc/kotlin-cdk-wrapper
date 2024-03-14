package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ExecuteCommandConfiguration {
  /**
   * The AWS Key Management Service key ID to encrypt the data between the local client and the
   * container.
   *
   * Default: - none
   */
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * The log configuration for the results of the execute command actions.
   *
   * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket.
   *
   * Default: - none
   */
  public fun logConfiguration(): ExecuteCommandLogConfiguration? =
      unwrap(this).getLogConfiguration()?.let(ExecuteCommandLogConfiguration::wrap)

  /**
   * The log settings to use for logging the execute command session.
   *
   * Default: - none
   */
  public fun logging(): ExecuteCommandLogging? =
      unwrap(this).getLogging()?.let(ExecuteCommandLogging::wrap)

  /**
   * A builder for [ExecuteCommandConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param kmsKey The AWS Key Management Service key ID to encrypt the data between the local
     * client and the container.
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * @param logConfiguration The log configuration for the results of the execute command actions.
     * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket.
     */
    public fun logConfiguration(logConfiguration: ExecuteCommandLogConfiguration)

    /**
     * @param logConfiguration The log configuration for the results of the execute command actions.
     * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec714f7e5ac80d6b9294aba4d2276f21851c72d1b5c99d2e6133640fbad3fa73")
    public fun logConfiguration(logConfiguration: ExecuteCommandLogConfiguration.Builder.() -> Unit)

    /**
     * @param logging The log settings to use for logging the execute command session.
     */
    public fun logging(logging: ExecuteCommandLogging)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration.Builder
        = software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration.builder()

    /**
     * @param kmsKey The AWS Key Management Service key ID to encrypt the data between the local
     * client and the container.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    /**
     * @param logConfiguration The log configuration for the results of the execute command actions.
     * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket.
     */
    override fun logConfiguration(logConfiguration: ExecuteCommandLogConfiguration) {
      cdkBuilder.logConfiguration(logConfiguration.let(ExecuteCommandLogConfiguration::unwrap))
    }

    /**
     * @param logConfiguration The log configuration for the results of the execute command actions.
     * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec714f7e5ac80d6b9294aba4d2276f21851c72d1b5c99d2e6133640fbad3fa73")
    override
        fun logConfiguration(logConfiguration: ExecuteCommandLogConfiguration.Builder.() -> Unit):
        Unit = logConfiguration(ExecuteCommandLogConfiguration(logConfiguration))

    /**
     * @param logging The log settings to use for logging the execute command session.
     */
    override fun logging(logging: ExecuteCommandLogging) {
      cdkBuilder.logging(logging.let(ExecuteCommandLogging::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration,
  ) : ExecuteCommandConfiguration {
    /**
     * The AWS Key Management Service key ID to encrypt the data between the local client and the
     * container.
     *
     * Default: - none
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    /**
     * The log configuration for the results of the execute command actions.
     *
     * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket.
     *
     * Default: - none
     */
    override fun logConfiguration(): ExecuteCommandLogConfiguration? =
        unwrap(this).getLogConfiguration()?.let(ExecuteCommandLogConfiguration::wrap)

    /**
     * The log settings to use for logging the execute command session.
     *
     * Default: - none
     */
    override fun logging(): ExecuteCommandLogging? =
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
