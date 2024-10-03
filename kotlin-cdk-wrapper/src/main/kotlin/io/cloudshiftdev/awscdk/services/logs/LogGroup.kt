@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a CloudWatch Log Group.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * LogGroup logGroup = new LogGroup(this, "Log Group");
 * Bucket logBucket = new Bucket(this, "S3 Bucket");
 * EmrContainersStartJobRun.Builder.create(this, "EMR Containers Start Job Run")
 * .virtualCluster(VirtualClusterInput.fromVirtualClusterId("de92jdei2910fwedz"))
 * .releaseLabel(ReleaseLabel.EMR_6_2_0)
 * .jobDriver(JobDriver.builder()
 * .sparkSubmitJobDriver(SparkSubmitJobDriver.builder()
 * .entryPoint(TaskInput.fromText("local:///usr/lib/spark/examples/src/main/python/pi.py"))
 * .sparkSubmitParameters("--conf spark.executor.instances=2 --conf spark.executor.memory=2G --conf
 * spark.executor.cores=2 --conf spark.driver.cores=1")
 * .build())
 * .build())
 * .monitoring(Monitoring.builder()
 * .logGroup(logGroup)
 * .logBucket(logBucket)
 * .build())
 * .build();
 * ```
 */
public open class LogGroup(
  cdkObject: software.amazon.awscdk.services.logs.LogGroup,
) : Resource(cdkObject),
    ILogGroup {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.logs.LogGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LogGroupProps,
  ) :
      this(software.amazon.awscdk.services.logs.LogGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(LogGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LogGroupProps.Builder.() -> Unit,
  ) : this(scope, id, LogGroupProps(props)
  )

  /**
   * Create a new Metric Filter on this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the MetricFilter. 
   */
  public override fun addMetricFilter(id: String, props: MetricFilterOptions): MetricFilter =
      unwrap(this).addMetricFilter(id,
      props.let(MetricFilterOptions.Companion::unwrap)).let(MetricFilter::wrap)

  /**
   * Create a new Metric Filter on this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the MetricFilter. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa5eb338ced88e08a44a54871b849cb2cc0edd7ab75cdb3b68614fc030c321db")
  public override fun addMetricFilter(id: String, props: MetricFilterOptions.Builder.() -> Unit):
      MetricFilter = addMetricFilter(id, MetricFilterOptions(props))

  /**
   * Create a new Log Stream for this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the LogStream.
   */
  public override fun addStream(id: String): LogStream =
      unwrap(this).addStream(id).let(LogStream::wrap)

  /**
   * Create a new Log Stream for this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the LogStream.
   */
  public override fun addStream(id: String, props: StreamOptions): LogStream =
      unwrap(this).addStream(id, props.let(StreamOptions.Companion::unwrap)).let(LogStream::wrap)

  /**
   * Create a new Log Stream for this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the LogStream.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc0acd2b2aa5766d1e96b6ab06178eafd114af09cbd7db63af738298d3dc3245")
  public override fun addStream(id: String, props: StreamOptions.Builder.() -> Unit): LogStream =
      addStream(id, StreamOptions(props))

  /**
   * Create a new Subscription Filter on this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the SubscriptionFilter. 
   */
  public override fun addSubscriptionFilter(id: String, props: SubscriptionFilterOptions):
      SubscriptionFilter = unwrap(this).addSubscriptionFilter(id,
      props.let(SubscriptionFilterOptions.Companion::unwrap)).let(SubscriptionFilter::wrap)

  /**
   * Create a new Subscription Filter on this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the SubscriptionFilter. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6594bd057f7db2f9f802ecdd2581f361203d2614039afa6960709697b01a3d88")
  public override fun addSubscriptionFilter(id: String,
      props: SubscriptionFilterOptions.Builder.() -> Unit): SubscriptionFilter =
      addSubscriptionFilter(id, SubscriptionFilterOptions(props))

  /**
   * Adds a statement to the resource policy associated with this log group.
   *
   * A resource policy will be automatically created upon the first call to `addToResourcePolicy`.
   *
   * Any ARN Principals inside of the statement will be converted into AWS Account ID strings
   * because CloudWatch Logs Resource Policies do not accept ARN principals.
   *
   * @param statement The policy statement to add. 
   */
  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement.Companion::unwrap)).let(AddToResourcePolicyResult::wrap)

  /**
   * Adds a statement to the resource policy associated with this log group.
   *
   * A resource policy will be automatically created upon the first call to `addToResourcePolicy`.
   *
   * Any ARN Principals inside of the statement will be converted into AWS Account ID strings
   * because CloudWatch Logs Resource Policies do not accept ARN principals.
   *
   * @param statement The policy statement to add. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  /**
   * Extract a metric from structured log events in the LogGroup.
   *
   * Creates a MetricFilter on this LogGroup that will extract the value
   * of the indicated JSON field in all records where it occurs.
   *
   * The metric will be available in CloudWatch Metrics under the
   * indicated namespace and name.
   *
   * @return A Metric object representing the extracted metric
   * @param jsonField JSON field to extract (example: '$.myfield'). 
   * @param metricNamespace Namespace to emit the metric under. 
   * @param metricName Name to emit the metric under. 
   */
  public override fun extractMetric(
    jsonField: String,
    metricNamespace: String,
    metricName: String,
  ): Metric = unwrap(this).extractMetric(jsonField, metricNamespace, metricName).let(Metric::wrap)

  /**
   * Give the indicated permissions on this log group and all streams.
   *
   * @param grantee 
   * @param actions 
   */
  public override fun grant(grantee: IGrantable, vararg actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
      *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

  /**
   * Give permissions to read and filter events from this log group.
   *
   * @param grantee 
   */
  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Give permissions to create and write to streams in this log group.
   *
   * @param grantee 
   */
  public override fun grantWrite(grantee: IGrantable): Grant =
      unwrap(this).grantWrite(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * The ARN of this log group.
   */
  public override fun logGroupArn(): String = unwrap(this).getLogGroupArn()

  /**
   * The name of this log group.
   */
  public override fun logGroupName(): String = unwrap(this).getLogGroupName()

  /**
   * Public method to get the physical name of this log group.
   *
   * @return Physical name of log group
   */
  public override fun logGroupPhysicalName(): String = unwrap(this).logGroupPhysicalName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.LogGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Data Protection Policy for this log group.
     *
     * Default: - no data protection policy
     *
     * @param dataProtectionPolicy Data Protection Policy for this log group. 
     */
    public fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy)

    /**
     * Data Protection Policy for this log group.
     *
     * Default: - no data protection policy
     *
     * @param dataProtectionPolicy Data Protection Policy for this log group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc6cad86baae33f8b5b0d27b09aaae065f78d70995269a7073f3d2b5413994cd")
    public fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy.Builder.() -> Unit)

    /**
     * The KMS customer managed key to encrypt the log group with.
     *
     * Default: Server-side encryption managed by the CloudWatch Logs service
     *
     * @param encryptionKey The KMS customer managed key to encrypt the log group with. 
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * The class of the log group. Possible values are: STANDARD and INFREQUENT_ACCESS.
     *
     * INFREQUENT_ACCESS class provides customers a cost-effective way to consolidate
     * logs which supports querying using Logs Insights. The logGroupClass property cannot
     * be changed once the log group is created.
     *
     * Default: LogGroupClass.STANDARD
     *
     * @param logGroupClass The class of the log group. Possible values are: STANDARD and
     * INFREQUENT_ACCESS. 
     */
    public fun logGroupClass(logGroupClass: LogGroupClass)

    /**
     * Name of the log group.
     *
     * Default: Automatically generated
     *
     * @param logGroupName Name of the log group. 
     */
    public fun logGroupName(logGroupName: String)

    /**
     * Determine the removal policy of this log group.
     *
     * Normally you want to retain the log group so you can diagnose issues
     * from logs even after a deployment that no longer includes the log group.
     * In that case, use the normal date-based retention policy to age out your
     * logs.
     *
     * Default: RemovalPolicy.Retain
     *
     * @param removalPolicy Determine the removal policy of this log group. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * How long, in days, the log contents will be retained.
     *
     * To retain all logs, set this value to RetentionDays.INFINITE.
     *
     * Default: RetentionDays.TWO_YEARS
     *
     * @param retention How long, in days, the log contents will be retained. 
     */
    public fun retention(retention: RetentionDays)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.LogGroup.Builder =
        software.amazon.awscdk.services.logs.LogGroup.Builder.create(scope, id)

    /**
     * Data Protection Policy for this log group.
     *
     * Default: - no data protection policy
     *
     * @param dataProtectionPolicy Data Protection Policy for this log group. 
     */
    override fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy) {
      cdkBuilder.dataProtectionPolicy(dataProtectionPolicy.let(DataProtectionPolicy.Companion::unwrap))
    }

    /**
     * Data Protection Policy for this log group.
     *
     * Default: - no data protection policy
     *
     * @param dataProtectionPolicy Data Protection Policy for this log group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc6cad86baae33f8b5b0d27b09aaae065f78d70995269a7073f3d2b5413994cd")
    override
        fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy.Builder.() -> Unit):
        Unit = dataProtectionPolicy(DataProtectionPolicy(dataProtectionPolicy))

    /**
     * The KMS customer managed key to encrypt the log group with.
     *
     * Default: Server-side encryption managed by the CloudWatch Logs service
     *
     * @param encryptionKey The KMS customer managed key to encrypt the log group with. 
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * The class of the log group. Possible values are: STANDARD and INFREQUENT_ACCESS.
     *
     * INFREQUENT_ACCESS class provides customers a cost-effective way to consolidate
     * logs which supports querying using Logs Insights. The logGroupClass property cannot
     * be changed once the log group is created.
     *
     * Default: LogGroupClass.STANDARD
     *
     * @param logGroupClass The class of the log group. Possible values are: STANDARD and
     * INFREQUENT_ACCESS. 
     */
    override fun logGroupClass(logGroupClass: LogGroupClass) {
      cdkBuilder.logGroupClass(logGroupClass.let(LogGroupClass.Companion::unwrap))
    }

    /**
     * Name of the log group.
     *
     * Default: Automatically generated
     *
     * @param logGroupName Name of the log group. 
     */
    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * Determine the removal policy of this log group.
     *
     * Normally you want to retain the log group so you can diagnose issues
     * from logs even after a deployment that no longer includes the log group.
     * In that case, use the normal date-based retention policy to age out your
     * logs.
     *
     * Default: RemovalPolicy.Retain
     *
     * @param removalPolicy Determine the removal policy of this log group. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * How long, in days, the log contents will be retained.
     *
     * To retain all logs, set this value to RetentionDays.INFINITE.
     *
     * Default: RetentionDays.TWO_YEARS
     *
     * @param retention How long, in days, the log contents will be retained. 
     */
    override fun retention(retention: RetentionDays) {
      cdkBuilder.retention(retention.let(RetentionDays.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.LogGroup = cdkBuilder.build()
  }

  public companion object {
    public fun fromLogGroupArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      logGroupArn: String,
    ): ILogGroup =
        software.amazon.awscdk.services.logs.LogGroup.fromLogGroupArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, logGroupArn).let(ILogGroup::wrap)

    public fun fromLogGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      logGroupName: String,
    ): ILogGroup =
        software.amazon.awscdk.services.logs.LogGroup.fromLogGroupName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, logGroupName).let(ILogGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LogGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LogGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.LogGroup): LogGroup =
        LogGroup(cdkObject)

    internal fun unwrap(wrapped: LogGroup): software.amazon.awscdk.services.logs.LogGroup =
        wrapped.cdkObject as software.amazon.awscdk.services.logs.LogGroup
  }
}
