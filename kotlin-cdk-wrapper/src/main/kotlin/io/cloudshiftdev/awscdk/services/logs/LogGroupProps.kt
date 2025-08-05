@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for a LogGroup.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * LogGroup logGroupDestination = LogGroup.Builder.create(this, "LogGroupLambdaAudit")
 * .logGroupName("auditDestinationForCDK")
 * .build();
 * Bucket bucket = new Bucket(this, "audit-bucket");
 * S3Bucket s3Destination = new S3Bucket(bucket);
 * DeliveryStream deliveryStream = DeliveryStream.Builder.create(this, "Delivery Stream")
 * .destination(s3Destination)
 * .build();
 * DataProtectionPolicy dataProtectionPolicy = DataProtectionPolicy.Builder.create()
 * .name("data protection policy")
 * .description("policy description")
 * .identifiers(List.of(DataIdentifier.DRIVERSLICENSE_US,  // managed data identifier
 * new DataIdentifier("EmailAddress"),  // forward compatibility for new managed data identifiers
 * new CustomDataIdentifier("EmployeeId", "EmployeeId-\\d{9}"))) // custom data identifier
 * .logGroupAuditDestination(logGroupDestination)
 * .s3BucketAuditDestination(bucket)
 * .deliveryStreamNameAuditDestination(deliveryStream.getDeliveryStreamName())
 * .build();
 * LogGroup.Builder.create(this, "LogGroupLambda")
 * .logGroupName("cdkIntegLogGroup")
 * .dataProtectionPolicy(dataProtectionPolicy)
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
   * Default: Server-side encryption managed by the CloudWatch Logs service
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Field Index Policies for this log group.
   *
   * Default: - no field index policies for this log group.
   */
  public fun fieldIndexPolicies(): List<FieldIndexPolicy> =
      unwrap(this).getFieldIndexPolicies()?.map(FieldIndexPolicy::wrap) ?: emptyList()

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
     * @param fieldIndexPolicies Field Index Policies for this log group.
     */
    public fun fieldIndexPolicies(fieldIndexPolicies: List<FieldIndexPolicy>)

    /**
     * @param fieldIndexPolicies Field Index Policies for this log group.
     */
    public fun fieldIndexPolicies(vararg fieldIndexPolicies: FieldIndexPolicy)

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
      cdkBuilder.dataProtectionPolicy(dataProtectionPolicy.let(DataProtectionPolicy.Companion::unwrap))
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
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param fieldIndexPolicies Field Index Policies for this log group.
     */
    override fun fieldIndexPolicies(fieldIndexPolicies: List<FieldIndexPolicy>) {
      cdkBuilder.fieldIndexPolicies(fieldIndexPolicies.map(FieldIndexPolicy.Companion::unwrap))
    }

    /**
     * @param fieldIndexPolicies Field Index Policies for this log group.
     */
    override fun fieldIndexPolicies(vararg fieldIndexPolicies: FieldIndexPolicy): Unit =
        fieldIndexPolicies(fieldIndexPolicies.toList())

    /**
     * @param logGroupClass The class of the log group. Possible values are: STANDARD and
     * INFREQUENT_ACCESS.
     * INFREQUENT_ACCESS class provides customers a cost-effective way to consolidate
     * logs which supports querying using Logs Insights. The logGroupClass property cannot
     * be changed once the log group is created.
     */
    override fun logGroupClass(logGroupClass: LogGroupClass) {
      cdkBuilder.logGroupClass(logGroupClass.let(LogGroupClass.Companion::unwrap))
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
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * @param retention How long, in days, the log contents will be retained.
     * To retain all logs, set this value to RetentionDays.INFINITE.
     */
    override fun retention(retention: RetentionDays) {
      cdkBuilder.retention(retention.let(RetentionDays.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.LogGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.LogGroupProps,
  ) : CdkObject(cdkObject),
      LogGroupProps {
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
     * Default: Server-side encryption managed by the CloudWatch Logs service
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * Field Index Policies for this log group.
     *
     * Default: - no field index policies for this log group.
     */
    override fun fieldIndexPolicies(): List<FieldIndexPolicy> =
        unwrap(this).getFieldIndexPolicies()?.map(FieldIndexPolicy::wrap) ?: emptyList()

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
        = CdkObjectWrappers.wrap(cdkObject) as? LogGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogGroupProps): software.amazon.awscdk.services.logs.LogGroupProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.logs.LogGroupProps
  }
}
