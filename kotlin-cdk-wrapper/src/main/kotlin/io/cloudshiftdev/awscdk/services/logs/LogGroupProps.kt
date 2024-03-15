@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for a LogGroup.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * Key kmsKey = new Key(this, "KmsKey");
 * // Pass the KMS key in the `encryptionKey` field to associate the key to the log group
 * LogGroup logGroup = LogGroup.Builder.create(this, "LogGroup")
 * .encryptionKey(kmsKey)
 * .build();
 * // Pass the KMS key in the `encryptionKey` field to associate the key to the S3 bucket
 * Bucket execBucket = Bucket.Builder.create(this, "EcsExecBucket")
 * .encryptionKey(kmsKey)
 * .build();
 * Cluster cluster = Cluster.Builder.create(this, "Cluster")
 * .vpc(vpc)
 * .executeCommandConfiguration(ExecuteCommandConfiguration.builder()
 * .kmsKey(kmsKey)
 * .logConfiguration(ExecuteCommandLogConfiguration.builder()
 * .cloudWatchLogGroup(logGroup)
 * .cloudWatchEncryptionEnabled(true)
 * .s3Bucket(execBucket)
 * .s3EncryptionEnabled(true)
 * .s3KeyPrefix("exec-command-output")
 * .build())
 * .logging(ExecuteCommandLogging.OVERRIDE)
 * .build())
 * .build();
 * ```
 */
public interface LogGroupProps {
  /**
   * Data Protection Policy for this log group.
   *
   * Default: - no data protection policy
   */
  public fun dataProtectionPolicy(): DataProtectionPolicy? =
      unwrap(this).getDataProtectionPolicy()?.let(DataProtectionPolicy::wrap)

  /**
   * The KMS customer managed key to encrypt the log group with.
   *
   * Default: Server-side encrpytion managed by the CloudWatch Logs service
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * The class of the log group. Possible values are: STANDARD and INFREQUENT_ACCESS.
   *
   * INFREQUENT_ACCESS class provides customers a cost-effective way to consolidate
   * logs which supports querying using Logs Insights. The logGroupClass property cannot
   * be changed once the log group is created.
   *
   * Default: LogGroupClass.STANDARD
   */
  public fun logGroupClass(): LogGroupClass? =
      unwrap(this).getLogGroupClass()?.let(LogGroupClass::wrap)

  /**
   * Name of the log group.
   *
   * Default: Automatically generated
   */
  public fun logGroupName(): String? = unwrap(this).getLogGroupName()

  /**
   * Determine the removal policy of this log group.
   *
   * Normally you want to retain the log group so you can diagnose issues
   * from logs even after a deployment that no longer includes the log group.
   * In that case, use the normal date-based retention policy to age out your
   * logs.
   *
   * Default: RemovalPolicy.Retain
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * How long, in days, the log contents will be retained.
   *
   * To retain all logs, set this value to RetentionDays.INFINITE.
   *
   * Default: RetentionDays.TWO_YEARS
   */
  public fun retention(): RetentionDays? = unwrap(this).getRetention()?.let(RetentionDays::wrap)

  /**
   * A builder for [LogGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataProtectionPolicy Data Protection Policy for this log group.
     */
    public fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy)

    /**
     * @param dataProtectionPolicy Data Protection Policy for this log group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23c975333c66f98e22b4bdd5260945068df979b1fd575fe24db11a4f0d82a331")
    public fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy.Builder.() -> Unit)

    /**
     * @param encryptionKey The KMS customer managed key to encrypt the log group with.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param logGroupClass The class of the log group. Possible values are: STANDARD and
     * INFREQUENT_ACCESS.
     * INFREQUENT_ACCESS class provides customers a cost-effective way to consolidate
     * logs which supports querying using Logs Insights. The logGroupClass property cannot
     * be changed once the log group is created.
     */
    public fun logGroupClass(logGroupClass: LogGroupClass)

    /**
     * @param logGroupName Name of the log group.
     */
    public fun logGroupName(logGroupName: String)

    /**
     * @param removalPolicy Determine the removal policy of this log group.
     * Normally you want to retain the log group so you can diagnose issues
     * from logs even after a deployment that no longer includes the log group.
     * In that case, use the normal date-based retention policy to age out your
     * logs.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param retention How long, in days, the log contents will be retained.
     * To retain all logs, set this value to RetentionDays.INFINITE.
     */
    public fun retention(retention: RetentionDays)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.LogGroupProps.Builder =
        software.amazon.awscdk.services.logs.LogGroupProps.builder()

    /**
     * @param dataProtectionPolicy Data Protection Policy for this log group.
     */
    override fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy) {
      cdkBuilder.dataProtectionPolicy(dataProtectionPolicy.let(DataProtectionPolicy::unwrap))
    }

    /**
     * @param dataProtectionPolicy Data Protection Policy for this log group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23c975333c66f98e22b4bdd5260945068df979b1fd575fe24db11a4f0d82a331")
    override
        fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy.Builder.() -> Unit):
        Unit = dataProtectionPolicy(DataProtectionPolicy(dataProtectionPolicy))

    /**
     * @param encryptionKey The KMS customer managed key to encrypt the log group with.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * @param logGroupClass The class of the log group. Possible values are: STANDARD and
     * INFREQUENT_ACCESS.
     * INFREQUENT_ACCESS class provides customers a cost-effective way to consolidate
     * logs which supports querying using Logs Insights. The logGroupClass property cannot
     * be changed once the log group is created.
     */
    override fun logGroupClass(logGroupClass: LogGroupClass) {
      cdkBuilder.logGroupClass(logGroupClass.let(LogGroupClass::unwrap))
    }

    /**
     * @param logGroupName Name of the log group.
     */
    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * @param removalPolicy Determine the removal policy of this log group.
     * Normally you want to retain the log group so you can diagnose issues
     * from logs even after a deployment that no longer includes the log group.
     * In that case, use the normal date-based retention policy to age out your
     * logs.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param retention How long, in days, the log contents will be retained.
     * To retain all logs, set this value to RetentionDays.INFINITE.
     */
    override fun retention(retention: RetentionDays) {
      cdkBuilder.retention(retention.let(RetentionDays::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.LogGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.LogGroupProps,
  ) : CdkObject(cdkObject), LogGroupProps {
    /**
     * Data Protection Policy for this log group.
     *
     * Default: - no data protection policy
     */
    override fun dataProtectionPolicy(): DataProtectionPolicy? =
        unwrap(this).getDataProtectionPolicy()?.let(DataProtectionPolicy::wrap)

    /**
     * The KMS customer managed key to encrypt the log group with.
     *
     * Default: Server-side encrpytion managed by the CloudWatch Logs service
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * The class of the log group. Possible values are: STANDARD and INFREQUENT_ACCESS.
     *
     * INFREQUENT_ACCESS class provides customers a cost-effective way to consolidate
     * logs which supports querying using Logs Insights. The logGroupClass property cannot
     * be changed once the log group is created.
     *
     * Default: LogGroupClass.STANDARD
     */
    override fun logGroupClass(): LogGroupClass? =
        unwrap(this).getLogGroupClass()?.let(LogGroupClass::wrap)

    /**
     * Name of the log group.
     *
     * Default: Automatically generated
     */
    override fun logGroupName(): String? = unwrap(this).getLogGroupName()

    /**
     * Determine the removal policy of this log group.
     *
     * Normally you want to retain the log group so you can diagnose issues
     * from logs even after a deployment that no longer includes the log group.
     * In that case, use the normal date-based retention policy to age out your
     * logs.
     *
     * Default: RemovalPolicy.Retain
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * How long, in days, the log contents will be retained.
     *
     * To retain all logs, set this value to RetentionDays.INFINITE.
     *
     * Default: RetentionDays.TWO_YEARS
     */
    override fun retention(): RetentionDays? = unwrap(this).getRetention()?.let(RetentionDays::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.LogGroupProps): LogGroupProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogGroupProps): software.amazon.awscdk.services.logs.LogGroupProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.logs.LogGroupProps
  }
}
