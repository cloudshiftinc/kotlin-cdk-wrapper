package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLogStream internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.CfnLogStream,
) : CfnResource(cdkObject), IInspectable {
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
    init {

    }

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
        wrapped.cdkObject
  }
}
