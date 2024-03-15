@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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

public open class LogGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.LogGroup,
) : Resource(cdkObject), ILogGroup {
  public override fun addMetricFilter(id: String, props: MetricFilterOptions): MetricFilter =
      unwrap(this).addMetricFilter(id,
      props.let(MetricFilterOptions::unwrap)).let(MetricFilter::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa5eb338ced88e08a44a54871b849cb2cc0edd7ab75cdb3b68614fc030c321db")
  public override fun addMetricFilter(id: String, props: MetricFilterOptions.Builder.() -> Unit):
      MetricFilter = addMetricFilter(id, MetricFilterOptions(props))

  public override fun addStream(id: String): LogStream =
      unwrap(this).addStream(id).let(LogStream::wrap)

  public override fun addStream(id: String, props: StreamOptions): LogStream =
      unwrap(this).addStream(id, props.let(StreamOptions::unwrap)).let(LogStream::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc0acd2b2aa5766d1e96b6ab06178eafd114af09cbd7db63af738298d3dc3245")
  public override fun addStream(id: String, props: StreamOptions.Builder.() -> Unit): LogStream =
      addStream(id, StreamOptions(props))

  public override fun addSubscriptionFilter(id: String, props: SubscriptionFilterOptions):
      SubscriptionFilter = unwrap(this).addSubscriptionFilter(id,
      props.let(SubscriptionFilterOptions::unwrap)).let(SubscriptionFilter::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6594bd057f7db2f9f802ecdd2581f361203d2614039afa6960709697b01a3d88")
  public override fun addSubscriptionFilter(id: String,
      props: SubscriptionFilterOptions.Builder.() -> Unit): SubscriptionFilter =
      addSubscriptionFilter(id, SubscriptionFilterOptions(props))

  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  public override fun extractMetric(
    jsonField: String,
    metricNamespace: String,
    metricName: String,
  ): Metric = unwrap(this).extractMetric(jsonField, metricNamespace, metricName).let(Metric::wrap)

  public override fun grant(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantWrite(grantee: IGrantable): Grant =
      unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun logGroupArn(): String = unwrap(this).getLogGroupArn()

  public override fun logGroupName(): String = unwrap(this).getLogGroupName()

  public override fun logGroupPhysicalName(): String = unwrap(this).logGroupPhysicalName()

  @CdkDslMarker
  public interface Builder {
    public fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc6cad86baae33f8b5b0d27b09aaae065f78d70995269a7073f3d2b5413994cd")
    public fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy.Builder.() -> Unit)

    public fun encryptionKey(encryptionKey: IKey)

    public fun logGroupClass(logGroupClass: LogGroupClass)

    public fun logGroupName(logGroupName: String)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun retention(retention: RetentionDays)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.LogGroup.Builder =
        software.amazon.awscdk.services.logs.LogGroup.Builder.create(scope, id)

    override fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy) {
      cdkBuilder.dataProtectionPolicy(dataProtectionPolicy.let(DataProtectionPolicy::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc6cad86baae33f8b5b0d27b09aaae065f78d70995269a7073f3d2b5413994cd")
    override
        fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy.Builder.() -> Unit):
        Unit = dataProtectionPolicy(DataProtectionPolicy(dataProtectionPolicy))

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun logGroupClass(logGroupClass: LogGroupClass) {
      cdkBuilder.logGroupClass(logGroupClass.let(LogGroupClass::unwrap))
    }

    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun retention(retention: RetentionDays) {
      cdkBuilder.retention(retention.let(RetentionDays::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.LogGroup = cdkBuilder.build()
  }

  public companion object {
    public fun fromLogGroupArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      logGroupArn: String,
    ): ILogGroup =
        software.amazon.awscdk.services.logs.LogGroup.fromLogGroupArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, logGroupArn).let(ILogGroup::wrap)

    public fun fromLogGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      logGroupName: String,
    ): ILogGroup =
        software.amazon.awscdk.services.logs.LogGroup.fromLogGroupName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
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
        wrapped.cdkObject
  }
}
