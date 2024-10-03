@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The following table describes all of the available fields for a flow log record.
 *
 * Example:
 *
 * ```
 * Vpc vpc = new Vpc(this, "Vpc");
 * vpc.addFlowLog("FlowLog", FlowLogOptions.builder()
 * .logFormat(List.of(LogFormat.DST_PORT, LogFormat.SRC_PORT))
 * .build());
 * // If you just want to add a field to the default field
 * vpc.addFlowLog("FlowLog", FlowLogOptions.builder()
 * .logFormat(List.of(LogFormat.VERSION, LogFormat.ALL_DEFAULT_FIELDS))
 * .build());
 * // If AWS CDK does not support the new fields
 * vpc.addFlowLog("FlowLog", FlowLogOptions.builder()
 * .logFormat(List.of(LogFormat.SRC_PORT, LogFormat.custom("${new-field}")))
 * .build());
 * ```
 */
public open class LogFormat(
  cdkObject: software.amazon.awscdk.services.ec2.LogFormat,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public val ACCOUNT_ID: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.ACCOUNT_ID)

    public val ACTION: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.ACTION)

    public val ALL_DEFAULT_FIELDS: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.ALL_DEFAULT_FIELDS)

    public val AZ_ID: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.AZ_ID)

    public val BYTES: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.BYTES)

    public val DST_ADDR: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.DST_ADDR)

    public val DST_PORT: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.DST_PORT)

    public val ECS_CLUSTER_ARN: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.ECS_CLUSTER_ARN)

    public val ECS_CLUSTER_NAME: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.ECS_CLUSTER_NAME)

    public val ECS_CONTAINER_ID: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.ECS_CONTAINER_ID)

    public val ECS_CONTAINER_INSTANCE_ARN: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.ECS_CONTAINER_INSTANCE_ARN)

    public val ECS_CONTAINER_INSTANCE_ID: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.ECS_CONTAINER_INSTANCE_ID)

    public val ECS_SECOND_CONTAINER_ID: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.ECS_SECOND_CONTAINER_ID)

    public val ECS_SERVICE_NAME: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.ECS_SERVICE_NAME)

    public val ECS_TASK_ARN: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.ECS_TASK_ARN)

    public val ECS_TASK_DEFINITION_ARN: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.ECS_TASK_DEFINITION_ARN)

    public val ECS_TASK_ID: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.ECS_TASK_ID)

    public val END_TIMESTAMP: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.END_TIMESTAMP)

    public val FLOW_DIRECTION: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.FLOW_DIRECTION)

    public val INSTANCE_ID: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.INSTANCE_ID)

    public val INTERFACE_ID: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.INTERFACE_ID)

    public val LOG_STATUS: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.LOG_STATUS)

    public val PACKETS: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.PACKETS)

    public val PKT_DST_ADDR: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.PKT_DST_ADDR)

    public val PKT_DST_AWS_SERVICE: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.PKT_DST_AWS_SERVICE)

    public val PKT_SRC_ADDR: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.PKT_SRC_ADDR)

    public val PKT_SRC_AWS_SERVICE: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.PKT_SRC_AWS_SERVICE)

    public val PROTOCOL: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.PROTOCOL)

    public val REGION: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.REGION)

    public val SRC_ADDR: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.SRC_ADDR)

    public val SRC_PORT: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.SRC_PORT)

    public val START_TIMESTAMP: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.START_TIMESTAMP)

    public val SUBLOCATION_ID: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.SUBLOCATION_ID)

    public val SUBLOCATION_TYPE: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.SUBLOCATION_TYPE)

    public val SUBNET_ID: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.SUBNET_ID)

    public val TCP_FLAGS: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.TCP_FLAGS)

    public val TRAFFIC_PATH: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.TRAFFIC_PATH)

    public val TRAFFIC_TYPE: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.TRAFFIC_TYPE)

    public val VERSION: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.VERSION)

    public val VPC_ID: LogFormat =
        LogFormat.wrap(software.amazon.awscdk.services.ec2.LogFormat.VPC_ID)

    public fun custom(formatString: String): LogFormat =
        software.amazon.awscdk.services.ec2.LogFormat.custom(formatString).let(LogFormat::wrap)

    public fun `field`(`field`: String): LogFormat =
        software.amazon.awscdk.services.ec2.LogFormat.`field`(`field`).let(LogFormat::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LogFormat): LogFormat =
        LogFormat(cdkObject)

    internal fun unwrap(wrapped: LogFormat): software.amazon.awscdk.services.ec2.LogFormat =
        wrapped.cdkObject as software.amazon.awscdk.services.ec2.LogFormat
  }
}
