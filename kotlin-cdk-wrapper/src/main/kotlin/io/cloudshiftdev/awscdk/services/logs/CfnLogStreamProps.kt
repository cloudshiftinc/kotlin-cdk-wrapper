@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnLogStream`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnLogStreamProps cfnLogStreamProps = CfnLogStreamProps.builder()
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .logStreamName("logStreamName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html)
 */
public interface CfnLogStreamProps {
  /**
   * The name of the log group where the log stream is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-loggroupname)
   */
  public fun logGroupName(): String

  /**
   * The name of the log stream.
   *
   * The name must be unique within the log group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-logstreamname)
   */
  public fun logStreamName(): String? = unwrap(this).getLogStreamName()

  /**
   * A builder for [CfnLogStreamProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logGroupName The name of the log group where the log stream is created. 
     */
    public fun logGroupName(logGroupName: String)

    /**
     * @param logStreamName The name of the log stream.
     * The name must be unique within the log group.
     */
    public fun logStreamName(logStreamName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnLogStreamProps.Builder =
        software.amazon.awscdk.services.logs.CfnLogStreamProps.builder()

    /**
     * @param logGroupName The name of the log group where the log stream is created. 
     */
    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * @param logStreamName The name of the log stream.
     * The name must be unique within the log group.
     */
    override fun logStreamName(logStreamName: String) {
      cdkBuilder.logStreamName(logStreamName)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnLogStreamProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.CfnLogStreamProps,
  ) : CdkObject(cdkObject), CfnLogStreamProps {
    /**
     * The name of the log group where the log stream is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-loggroupname)
     */
    override fun logGroupName(): String = unwrap(this).getLogGroupName()

    /**
     * The name of the log stream.
     *
     * The name must be unique within the log group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-logstreamname)
     */
    override fun logStreamName(): String? = unwrap(this).getLogStreamName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLogStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnLogStreamProps):
        CfnLogStreamProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLogStreamProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLogStreamProps):
        software.amazon.awscdk.services.logs.CfnLogStreamProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.CfnLogStreamProps
  }
}
