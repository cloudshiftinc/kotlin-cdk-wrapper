package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class DatabaseInstanceBase
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceBase,
) : Resource(cdkObject), IDatabaseInstance {
    /**
     * Add a new db proxy to this instance.
     *
     * @param id
     * @param options
     */
    public override fun addProxy(id: String, options: DatabaseProxyOptions): DatabaseProxy =
        unwrap(this)
            .addProxy(id, options.let(DatabaseProxyOptions::unwrap))
            .let(DatabaseProxy::wrap)

    /**
     * Add a new db proxy to this instance.
     *
     * @param id
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88c3f7afe80587682acb73327f437ae531d6b1be89cc947d8c70a770c539b4be")
    public override fun addProxy(
        id: String,
        options: DatabaseProxyOptions.Builder.() -> Unit
    ): DatabaseProxy = addProxy(id, DatabaseProxyOptions(options))

    /** Renders the secret attachment target specifications. */
    public override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
        unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

    /** Access to network connections. */
    public override fun connections(): Connections =
        unwrap(this).getConnections().let(Connections::wrap)

    /** The instance endpoint address. */
    public override fun dbInstanceEndpointAddress(): String =
        unwrap(this).getDbInstanceEndpointAddress()

    /** The instance endpoint port. */
    public override fun dbInstanceEndpointPort(): String = unwrap(this).getDbInstanceEndpointPort()

    /**
     * The engine of this database Instance.
     *
     * May be not known for imported Instances if it wasn't provided explicitly, or for read
     * replicas.
     */
    public override fun engine(): IInstanceEngine? =
        unwrap(this).getEngine()?.let(IInstanceEngine::wrap)

    /**
     * Grant the given identity connection access to the database.
     *
     * @param grantee
     * @param dbUser
     */
    public override fun grantConnect(grantee: IGrantable): Grant =
        unwrap(this).grantConnect(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Grant the given identity connection access to the database.
     *
     * @param grantee
     * @param dbUser
     */
    public override fun grantConnect(grantee: IGrantable, dbUser: String): Grant =
        unwrap(this).grantConnect(grantee.let(IGrantable::unwrap), dbUser).let(Grant::wrap)

    /** The instance arn. */
    public override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /** The instance endpoint. */
    public override fun instanceEndpoint(): Endpoint =
        unwrap(this).getInstanceEndpoint().let(Endpoint::wrap)

    /** The instance identifier. */
    public override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

    /**
     * The AWS Region-unique, immutable identifier for the DB instance.
     *
     * This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB
     * instance is accessed.
     */
    public override fun instanceResourceId(): String? = unwrap(this).getInstanceResourceId()

    /**
     * Return the given named metric for this DBInstance.
     *
     * @param metricName
     * @param props
     */
    public override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Return the given named metric for this DBInstance.
     *
     * @param metricName
     * @param props
     */
    public override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Return the given named metric for this DBInstance.
     *
     * @param metricName
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    public override fun metric(
        metricName: String,
        props: MetricOptions.Builder.() -> Unit
    ): Metric = metric(metricName, MetricOptions(props))

    /**
     * The percentage of CPU utilization.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    public override fun metricCpuUtilization(): Metric =
        unwrap(this).metricCPUUtilization().let(Metric::wrap)

    /**
     * The percentage of CPU utilization.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    public override fun metricCpuUtilization(props: MetricOptions): Metric =
        unwrap(this).metricCPUUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The percentage of CPU utilization.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
    public override fun metricCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
        metricCpuUtilization(MetricOptions(props))

    /**
     * The number of database connections in use.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    public override fun metricDatabaseConnections(): Metric =
        unwrap(this).metricDatabaseConnections().let(Metric::wrap)

    /**
     * The number of database connections in use.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    public override fun metricDatabaseConnections(props: MetricOptions): Metric =
        unwrap(this).metricDatabaseConnections(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of database connections in use.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da93b368080fddd327564c3f008e4c664a1799b65b054ae9fec1c7433068712b")
    public override fun metricDatabaseConnections(props: MetricOptions.Builder.() -> Unit): Metric =
        metricDatabaseConnections(MetricOptions(props))

    /**
     * The amount of available storage space.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    public override fun metricFreeStorageSpace(): Metric =
        unwrap(this).metricFreeStorageSpace().let(Metric::wrap)

    /**
     * The amount of available storage space.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    public override fun metricFreeStorageSpace(props: MetricOptions): Metric =
        unwrap(this).metricFreeStorageSpace(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The amount of available storage space.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("368af7ac3be4f10e672f08286b7e70f8633b6e9198d1685bfedc9108b3414e62")
    public override fun metricFreeStorageSpace(props: MetricOptions.Builder.() -> Unit): Metric =
        metricFreeStorageSpace(MetricOptions(props))

    /**
     * The amount of available random access memory.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    public override fun metricFreeableMemory(): Metric =
        unwrap(this).metricFreeableMemory().let(Metric::wrap)

    /**
     * The amount of available random access memory.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    public override fun metricFreeableMemory(props: MetricOptions): Metric =
        unwrap(this).metricFreeableMemory(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The amount of available random access memory.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52581dbf24aa60f3a3d2a22ad5c3a44848ddd52404f8b8dd8e3c0d665b77d5cf")
    public override fun metricFreeableMemory(props: MetricOptions.Builder.() -> Unit): Metric =
        metricFreeableMemory(MetricOptions(props))

    /**
     * The average number of disk write I/O operations per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    public override fun metricReadIops(): Metric = unwrap(this).metricReadIOPS().let(Metric::wrap)

    /**
     * The average number of disk write I/O operations per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    public override fun metricReadIops(props: MetricOptions): Metric =
        unwrap(this).metricReadIOPS(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The average number of disk write I/O operations per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49526da03d196d2f975a43ba7ac595a380f6b4f4817805d76831acb9d384a0dc")
    public override fun metricReadIops(props: MetricOptions.Builder.() -> Unit): Metric =
        metricReadIops(MetricOptions(props))

    /**
     * The average number of disk read I/O operations per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    public override fun metricWriteIops(): Metric = unwrap(this).metricWriteIOPS().let(Metric::wrap)

    /**
     * The average number of disk read I/O operations per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    public override fun metricWriteIops(props: MetricOptions): Metric =
        unwrap(this).metricWriteIOPS(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The average number of disk read I/O operations per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c0e40270e6e53bc6598d5ec2710a93c940874139b12355a5e5d9925c9ff439a")
    public override fun metricWriteIops(props: MetricOptions.Builder.() -> Unit): Metric =
        metricWriteIops(MetricOptions(props))

    /**
     * Defines a CloudWatch event rule which triggers for instance events.
     *
     * Use `rule.addEventPattern(pattern)` to specify a filter.
     *
     * @param id
     * @param options
     */
    public override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

    /**
     * Defines a CloudWatch event rule which triggers for instance events.
     *
     * Use `rule.addEventPattern(pattern)` to specify a filter.
     *
     * @param id
     * @param options
     */
    public override fun onEvent(id: String, options: OnEventOptions): Rule =
        unwrap(this).onEvent(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

    /**
     * Defines a CloudWatch event rule which triggers for instance events.
     *
     * Use `rule.addEventPattern(pattern)` to specify a filter.
     *
     * @param id
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
    public override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
        onEvent(id, OnEventOptions(options))

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceBase,
    ) : DatabaseInstanceBase(cdkObject)

    public companion object {
        public fun fromDatabaseInstanceAttributes(
            scope: Construct,
            id: String,
            attrs: DatabaseInstanceAttributes,
        ): IDatabaseInstance =
            software.amazon.awscdk.services.rds.DatabaseInstanceBase.fromDatabaseInstanceAttributes(
                    scope.let(Construct::unwrap),
                    id,
                    attrs.let(DatabaseInstanceAttributes::unwrap)
                )
                .let(IDatabaseInstance::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("52b4f9d96e036ac67cd887860424c987385d8311ffaddd1b73e3d6d487335e3b")
        public fun fromDatabaseInstanceAttributes(
            scope: Construct,
            id: String,
            attrs: DatabaseInstanceAttributes.Builder.() -> Unit,
        ): IDatabaseInstance =
            fromDatabaseInstanceAttributes(scope, id, DatabaseInstanceAttributes(attrs))

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceBase
        ): DatabaseInstanceBase = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: DatabaseInstanceBase
        ): software.amazon.awscdk.services.rds.DatabaseInstanceBase = (wrapped as Wrapper).cdkObject
    }
}
