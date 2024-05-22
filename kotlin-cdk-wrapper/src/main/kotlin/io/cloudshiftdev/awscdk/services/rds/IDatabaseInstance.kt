@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecretAttachmentTarget
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A database instance.
 */
public interface IDatabaseInstance : IResource, IConnectable, ISecretAttachmentTarget {
  /**
   * Add a new db proxy to this instance.
   *
   * @param id 
   * @param options 
   */
  public fun addProxy(id: String, options: DatabaseProxyOptions): DatabaseProxy

  /**
   * Add a new db proxy to this instance.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("88c3f7afe80587682acb73327f437ae531d6b1be89cc947d8c70a770c539b4be")
  public fun addProxy(id: String, options: DatabaseProxyOptions.Builder.() -> Unit): DatabaseProxy

  /**
   * The instance endpoint address.
   */
  public fun dbInstanceEndpointAddress(): String

  /**
   * The instance endpoint port.
   */
  public fun dbInstanceEndpointPort(): String

  /**
   * The engine of this database Instance.
   *
   * May be not known for imported Instances if it wasn't provided explicitly,
   * or for read replicas.
   */
  public fun engine(): IInstanceEngine? = unwrap(this).getEngine()?.let(IInstanceEngine::wrap)

  /**
   * Grant the given identity connection access to the database.
   *
   * @param grantee the Principal to grant the permissions to. 
   * @param dbUser the name of the database user to allow connecting as to the db instance.
   */
  public fun grantConnect(grantee: IGrantable): Grant

  /**
   * Grant the given identity connection access to the database.
   *
   * @param grantee the Principal to grant the permissions to. 
   * @param dbUser the name of the database user to allow connecting as to the db instance.
   */
  public fun grantConnect(grantee: IGrantable, dbUser: String): Grant

  /**
   * The instance arn.
   */
  public fun instanceArn(): String

  /**
   * The instance endpoint.
   */
  public fun instanceEndpoint(): Endpoint

  /**
   * The instance identifier.
   */
  public fun instanceIdentifier(): String

  /**
   * The AWS Region-unique, immutable identifier for the DB instance.
   *
   * This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB
   * instance is accessed.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#aws-resource-rds-dbinstance-return-values)
   */
  public fun instanceResourceId(): String? = unwrap(this).getInstanceResourceId()

  /**
   * Return the given named metric for this DBInstance.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String): Metric

  /**
   * Return the given named metric for this DBInstance.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this DBInstance.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The percentage of CPU utilization.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricCPUUtilization(): Metric

  /**
   * The percentage of CPU utilization.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricCPUUtilization(props: MetricOptions): Metric

  /**
   * The percentage of CPU utilization.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("66a273587ca08857c76d1952aa0bb360d86bfe06cc24788a922415fa0fa097ef")
  public fun metricCPUUtilization(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of database connections in use.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricDatabaseConnections(): Metric

  /**
   * The number of database connections in use.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricDatabaseConnections(props: MetricOptions): Metric

  /**
   * The number of database connections in use.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("da93b368080fddd327564c3f008e4c664a1799b65b054ae9fec1c7433068712b")
  public fun metricDatabaseConnections(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The amount of available storage space.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricFreeStorageSpace(): Metric

  /**
   * The amount of available storage space.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricFreeStorageSpace(props: MetricOptions): Metric

  /**
   * The amount of available storage space.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("368af7ac3be4f10e672f08286b7e70f8633b6e9198d1685bfedc9108b3414e62")
  public fun metricFreeStorageSpace(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The amount of available random access memory.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricFreeableMemory(): Metric

  /**
   * The amount of available random access memory.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricFreeableMemory(props: MetricOptions): Metric

  /**
   * The amount of available random access memory.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("52581dbf24aa60f3a3d2a22ad5c3a44848ddd52404f8b8dd8e3c0d665b77d5cf")
  public fun metricFreeableMemory(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The average number of disk write I/O operations per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricReadIOPS(): Metric

  /**
   * The average number of disk write I/O operations per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricReadIOPS(props: MetricOptions): Metric

  /**
   * The average number of disk write I/O operations per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("675d709aa97b4b2ffd49350ba825728b633d56482af787ad3be691dc8bd8db1a")
  public fun metricReadIOPS(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The average number of disk read I/O operations per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricWriteIOPS(): Metric

  /**
   * The average number of disk read I/O operations per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricWriteIOPS(props: MetricOptions): Metric

  /**
   * The average number of disk read I/O operations per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83e54c79d3dbc0c025ceae17bc1f212a92688e30a3f4fafdc9abae8356ba6325")
  public fun metricWriteIOPS(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Defines a CloudWatch event rule which triggers for instance events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public fun onEvent(id: String): Rule

  /**
   * Defines a CloudWatch event rule which triggers for instance events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public fun onEvent(id: String, options: OnEventOptions): Rule

  /**
   * Defines a CloudWatch event rule which triggers for instance events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.IDatabaseInstance,
  ) : CdkObject(cdkObject), IDatabaseInstance {
    /**
     * Add a new db proxy to this instance.
     *
     * @param id 
     * @param options 
     */
    override fun addProxy(id: String, options: DatabaseProxyOptions): DatabaseProxy =
        unwrap(this).addProxy(id,
        options.let(DatabaseProxyOptions.Companion::unwrap)).let(DatabaseProxy::wrap)

    /**
     * Add a new db proxy to this instance.
     *
     * @param id 
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88c3f7afe80587682acb73327f437ae531d6b1be89cc947d8c70a770c539b4be")
    override fun addProxy(id: String, options: DatabaseProxyOptions.Builder.() -> Unit):
        DatabaseProxy = addProxy(id, DatabaseProxyOptions(options))

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * Renders the target specifications.
     */
    override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
        unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

    /**
     * The network connections associated with this resource.
     */
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    /**
     * The instance endpoint address.
     */
    override fun dbInstanceEndpointAddress(): String = unwrap(this).getDbInstanceEndpointAddress()

    /**
     * The instance endpoint port.
     */
    override fun dbInstanceEndpointPort(): String = unwrap(this).getDbInstanceEndpointPort()

    /**
     * The engine of this database Instance.
     *
     * May be not known for imported Instances if it wasn't provided explicitly,
     * or for read replicas.
     */
    override fun engine(): IInstanceEngine? = unwrap(this).getEngine()?.let(IInstanceEngine::wrap)

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Grant the given identity connection access to the database.
     *
     * @param grantee the Principal to grant the permissions to. 
     * @param dbUser the name of the database user to allow connecting as to the db instance.
     */
    override fun grantConnect(grantee: IGrantable): Grant =
        unwrap(this).grantConnect(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grant the given identity connection access to the database.
     *
     * @param grantee the Principal to grant the permissions to. 
     * @param dbUser the name of the database user to allow connecting as to the db instance.
     */
    override fun grantConnect(grantee: IGrantable, dbUser: String): Grant =
        unwrap(this).grantConnect(grantee.let(IGrantable.Companion::unwrap),
        dbUser).let(Grant::wrap)

    /**
     * The instance arn.
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The instance endpoint.
     */
    override fun instanceEndpoint(): Endpoint =
        unwrap(this).getInstanceEndpoint().let(Endpoint::wrap)

    /**
     * The instance identifier.
     */
    override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

    /**
     * The AWS Region-unique, immutable identifier for the DB instance.
     *
     * This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB
     * instance is accessed.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbinstance.html#aws-resource-rds-dbinstance-return-values)
     */
    override fun instanceResourceId(): String? = unwrap(this).getInstanceResourceId()

    /**
     * Return the given named metric for this DBInstance.
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Return the given named metric for this DBInstance.
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName,
        props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Return the given named metric for this DBInstance.
     *
     * @param metricName 
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    /**
     * The percentage of CPU utilization.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricCPUUtilization(): Metric =
        unwrap(this).metricCPUUtilization().let(Metric::wrap)

    /**
     * The percentage of CPU utilization.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricCPUUtilization(props: MetricOptions): Metric =
        unwrap(this).metricCPUUtilization(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The percentage of CPU utilization.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66a273587ca08857c76d1952aa0bb360d86bfe06cc24788a922415fa0fa097ef")
    override fun metricCPUUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
        metricCPUUtilization(MetricOptions(props))

    /**
     * The number of database connections in use.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricDatabaseConnections(): Metric =
        unwrap(this).metricDatabaseConnections().let(Metric::wrap)

    /**
     * The number of database connections in use.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricDatabaseConnections(props: MetricOptions): Metric =
        unwrap(this).metricDatabaseConnections(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of database connections in use.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da93b368080fddd327564c3f008e4c664a1799b65b054ae9fec1c7433068712b")
    override fun metricDatabaseConnections(props: MetricOptions.Builder.() -> Unit): Metric =
        metricDatabaseConnections(MetricOptions(props))

    /**
     * The amount of available storage space.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricFreeStorageSpace(): Metric =
        unwrap(this).metricFreeStorageSpace().let(Metric::wrap)

    /**
     * The amount of available storage space.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricFreeStorageSpace(props: MetricOptions): Metric =
        unwrap(this).metricFreeStorageSpace(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The amount of available storage space.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("368af7ac3be4f10e672f08286b7e70f8633b6e9198d1685bfedc9108b3414e62")
    override fun metricFreeStorageSpace(props: MetricOptions.Builder.() -> Unit): Metric =
        metricFreeStorageSpace(MetricOptions(props))

    /**
     * The amount of available random access memory.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricFreeableMemory(): Metric =
        unwrap(this).metricFreeableMemory().let(Metric::wrap)

    /**
     * The amount of available random access memory.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricFreeableMemory(props: MetricOptions): Metric =
        unwrap(this).metricFreeableMemory(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The amount of available random access memory.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52581dbf24aa60f3a3d2a22ad5c3a44848ddd52404f8b8dd8e3c0d665b77d5cf")
    override fun metricFreeableMemory(props: MetricOptions.Builder.() -> Unit): Metric =
        metricFreeableMemory(MetricOptions(props))

    /**
     * The average number of disk write I/O operations per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricReadIOPS(): Metric = unwrap(this).metricReadIOPS().let(Metric::wrap)

    /**
     * The average number of disk write I/O operations per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricReadIOPS(props: MetricOptions): Metric =
        unwrap(this).metricReadIOPS(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The average number of disk write I/O operations per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("675d709aa97b4b2ffd49350ba825728b633d56482af787ad3be691dc8bd8db1a")
    override fun metricReadIOPS(props: MetricOptions.Builder.() -> Unit): Metric =
        metricReadIOPS(MetricOptions(props))

    /**
     * The average number of disk read I/O operations per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricWriteIOPS(): Metric = unwrap(this).metricWriteIOPS().let(Metric::wrap)

    /**
     * The average number of disk read I/O operations per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricWriteIOPS(props: MetricOptions): Metric =
        unwrap(this).metricWriteIOPS(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The average number of disk read I/O operations per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83e54c79d3dbc0c025ceae17bc1f212a92688e30a3f4fafdc9abae8356ba6325")
    override fun metricWriteIOPS(props: MetricOptions.Builder.() -> Unit): Metric =
        metricWriteIOPS(MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * Defines a CloudWatch event rule which triggers for instance events.
     *
     * Use
     * `rule.addEventPattern(pattern)` to specify a filter.
     *
     * @param id 
     * @param options
     */
    override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

    /**
     * Defines a CloudWatch event rule which triggers for instance events.
     *
     * Use
     * `rule.addEventPattern(pattern)` to specify a filter.
     *
     * @param id 
     * @param options
     */
    override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
        options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

    /**
     * Defines a CloudWatch event rule which triggers for instance events.
     *
     * Use
     * `rule.addEventPattern(pattern)` to specify a filter.
     *
     * @param id 
     * @param options
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
    override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule = onEvent(id,
        OnEventOptions(options))

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IDatabaseInstance):
        IDatabaseInstance = CdkObjectWrappers.wrap(cdkObject) as? IDatabaseInstance ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDatabaseInstance):
        software.amazon.awscdk.services.rds.IDatabaseInstance = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.IDatabaseInstance
  }
}
