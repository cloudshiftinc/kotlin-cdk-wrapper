@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecretAttachmentTarget
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
  public fun metricCpuUtilization(): Metric

  /**
   * The percentage of CPU utilization.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricCpuUtilization(props: MetricOptions): Metric

  /**
   * The percentage of CPU utilization.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
  public fun metricCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric

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
  public fun metricReadIops(): Metric

  /**
   * The average number of disk write I/O operations per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricReadIops(props: MetricOptions): Metric

  /**
   * The average number of disk write I/O operations per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("49526da03d196d2f975a43ba7ac595a380f6b4f4817805d76831acb9d384a0dc")
  public fun metricReadIops(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The average number of disk read I/O operations per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricWriteIops(): Metric

  /**
   * The average number of disk read I/O operations per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricWriteIops(props: MetricOptions): Metric

  /**
   * The average number of disk read I/O operations per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c0e40270e6e53bc6598d5ec2710a93c940874139b12355a5e5d9925c9ff439a")
  public fun metricWriteIops(props: MetricOptions.Builder.() -> Unit): Metric

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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IDatabaseInstance):
        IDatabaseInstance = CdkObjectWrappers.wrap(cdkObject) as IDatabaseInstance

    internal fun unwrap(wrapped: IDatabaseInstance):
        software.amazon.awscdk.services.rds.IDatabaseInstance = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.IDatabaseInstance
  }
}
