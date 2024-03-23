@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Logs::LogStream` resource specifies an Amazon CloudWatch Logs log stream in a specific
 * log group.
 *
 * A log stream represents the sequence of events coming from an application instance or resource
 * that you are monitoring.
 *
 * There is no limit on the number of log streams that you can create for a log group.
 *
 * You must use the following guidelines when naming a log stream:
 *
 * * Log stream names must be unique within the log group.
 * * Log stream names can be between 1 and 512 characters long.
 * * The ':' (colon) and '*' (asterisk) characters are not allowed.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnLogStream cfnLogStream = CfnLogStream.Builder.create(this, "MyCfnLogStream")
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .logStreamName("logStreamName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html)
 */
public open class CfnLogStream(
  cdkObject: software.amazon.awscdk.services.logs.CfnLogStream,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLogStreamProps,
  ) :
      this(software.amazon.awscdk.services.logs.CfnLogStream(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnLogStreamProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLogStreamProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLogStreamProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the log group where the log stream is created.
   */
  public open fun logGroupName(): String = unwrap(this).getLogGroupName()

  /**
   * The name of the log group where the log stream is created.
   */
  public open fun logGroupName(`value`: String) {
    unwrap(this).setLogGroupName(`value`)
  }

  /**
   * The name of the log stream.
   */
  public open fun logStreamName(): String? = unwrap(this).getLogStreamName()

  /**
   * The name of the log stream.
   */
  public open fun logStreamName(`value`: String) {
    unwrap(this).setLogStreamName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CfnLogStream].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the log group where the log stream is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-loggroupname)
     * @param logGroupName The name of the log group where the log stream is created. 
     */
    public fun logGroupName(logGroupName: String)

    /**
     * The name of the log stream.
     *
     * The name must be unique within the log group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-logstreamname)
     * @param logStreamName The name of the log stream. 
     */
    public fun logStreamName(logStreamName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnLogStream.Builder =
        software.amazon.awscdk.services.logs.CfnLogStream.Builder.create(scope, id)

    /**
     * The name of the log group where the log stream is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-loggroupname)
     * @param logGroupName The name of the log group where the log stream is created. 
     */
    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * The name of the log stream.
     *
     * The name must be unique within the log group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-logstreamname)
     * @param logStreamName The name of the log stream. 
     */
    override fun logStreamName(logStreamName: String) {
      cdkBuilder.logStreamName(logStreamName)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnLogStream = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.logs.CfnLogStream.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLogStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLogStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnLogStream): CfnLogStream =
        CfnLogStream(cdkObject)

    internal fun unwrap(wrapped: CfnLogStream): software.amazon.awscdk.services.logs.CfnLogStream =
        wrapped.cdkObject as software.amazon.awscdk.services.logs.CfnLogStream
  }
}
