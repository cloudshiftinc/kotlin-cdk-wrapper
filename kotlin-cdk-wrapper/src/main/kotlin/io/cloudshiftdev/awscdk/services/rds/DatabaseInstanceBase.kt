@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A new or imported database instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * IInstanceEngine instanceEngine;
 * SecurityGroup securityGroup;
 * IDatabaseInstance databaseInstanceBase =
 * DatabaseInstanceBase.fromDatabaseInstanceAttributes(this, "MyDatabaseInstanceBase",
 * DatabaseInstanceAttributes.builder()
 * .instanceEndpointAddress("instanceEndpointAddress")
 * .instanceIdentifier("instanceIdentifier")
 * .port(123)
 * .securityGroups(List.of(securityGroup))
 * // the properties below are optional
 * .engine(instanceEngine)
 * .instanceResourceId("instanceResourceId")
 * .build());
 * ```
 */
public abstract class DatabaseInstanceBase(
  cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceBase,
) : Resource(cdkObject),
    IDatabaseInstance {
  /**
   * Add a new db proxy to this instance.
   *
   * @param id 
   * @param options 
   */
  public override fun addProxy(id: String, options: DatabaseProxyOptions): DatabaseProxy =
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
  public override fun addProxy(id: String, options: DatabaseProxyOptions.Builder.() -> Unit):
      DatabaseProxy = addProxy(id, DatabaseProxyOptions(options))

  /**
   * Renders the secret attachment target specifications.
   */
  public override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
      unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

  /**
   * Access to network connections.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The instance endpoint address.
   */
  public override fun dbInstanceEndpointAddress(): String =
      unwrap(this).getDbInstanceEndpointAddress()

  /**
   * The instance endpoint port.
   */
  public override fun dbInstanceEndpointPort(): String = unwrap(this).getDbInstanceEndpointPort()

  /**
   * The engine of this database Instance.
   *
   * May be not known for imported Instances if it wasn't provided explicitly,
   * or for read replicas.
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
      unwrap(this).grantConnect(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Grant the given identity connection access to the database.
   *
   * @param grantee 
   * @param dbUser
   */
  public override fun grantConnect(grantee: IGrantable, dbUser: String): Grant =
      unwrap(this).grantConnect(grantee.let(IGrantable.Companion::unwrap), dbUser).let(Grant::wrap)

  /**
   * The instance arn.
   */
  public override fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The instance endpoint.
   */
  public override fun instanceEndpoint(): Endpoint =
      unwrap(this).getInstanceEndpoint().let(Endpoint::wrap)

  /**
   * The instance identifier.
   */
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
      unwrap(this).metric(metricName, props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this DBInstance.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * The percentage of CPU utilization.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricCPUUtilization(): Metric =
      unwrap(this).metricCPUUtilization().let(Metric::wrap)

  /**
   * The percentage of CPU utilization.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricCPUUtilization(props: MetricOptions): Metric =
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
  public override fun metricCPUUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCPUUtilization(MetricOptions(props))

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
  public override fun metricFreeableMemory(props: MetricOptions.Builder.() -> Unit): Metric =
      metricFreeableMemory(MetricOptions(props))

  /**
   * The average number of disk write I/O operations per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricReadIOPS(): Metric = unwrap(this).metricReadIOPS().let(Metric::wrap)

  /**
   * The average number of disk write I/O operations per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricReadIOPS(props: MetricOptions): Metric =
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
  public override fun metricReadIOPS(props: MetricOptions.Builder.() -> Unit): Metric =
      metricReadIOPS(MetricOptions(props))

  /**
   * The average number of disk read I/O operations per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricWriteIOPS(): Metric = unwrap(this).metricWriteIOPS().let(Metric::wrap)

  /**
   * The average number of disk read I/O operations per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricWriteIOPS(props: MetricOptions): Metric =
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
  public override fun metricWriteIOPS(props: MetricOptions.Builder.() -> Unit): Metric =
      metricWriteIOPS(MetricOptions(props))

  /**
   * Defines a CloudWatch event rule which triggers for instance events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

  /**
   * Defines a CloudWatch event rule which triggers for instance events.
   *
   * Use
   * `rule.addEventPattern(pattern)` to specify a filter.
   *
   * @param id 
   * @param options
   */
  public override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
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
  public override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onEvent(id, OnEventOptions(options))

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceBase,
  ) : DatabaseInstanceBase(cdkObject)

  public companion object {
    public fun fromDatabaseInstanceAttributes(
      scope: Construct,
      id: String,
      attrs: DatabaseInstanceAttributes,
    ): IDatabaseInstance =
        software.amazon.awscdk.services.rds.DatabaseInstanceBase.fromDatabaseInstanceAttributes(scope.let(Construct.Companion::unwrap),
        id, attrs.let(DatabaseInstanceAttributes.Companion::unwrap)).let(IDatabaseInstance::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52b4f9d96e036ac67cd887860424c987385d8311ffaddd1b73e3d6d487335e3b")
    public fun fromDatabaseInstanceAttributes(
      scope: Construct,
      id: String,
      attrs: DatabaseInstanceAttributes.Builder.() -> Unit,
    ): IDatabaseInstance = fromDatabaseInstanceAttributes(scope, id,
        DatabaseInstanceAttributes(attrs))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceBase):
        DatabaseInstanceBase = CdkObjectWrappers.wrap(cdkObject) as? DatabaseInstanceBase ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseInstanceBase):
        software.amazon.awscdk.services.rds.DatabaseInstanceBase = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.DatabaseInstanceBase
  }
}
