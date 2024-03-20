@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a Log Stream in a Log Group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * LogGroup logGroup;
 * LogStream logStream = LogStream.Builder.create(this, "MyLogStream")
 * .logGroup(logGroup)
 * // the properties below are optional
 * .logStreamName("logStreamName")
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .build();
 * ```
 */
public open class LogStream internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.LogStream,
) : Resource(cdkObject), ILogStream {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LogStreamProps,
  ) :
      this(software.amazon.awscdk.services.logs.LogStream(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(LogStreamProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LogStreamProps.Builder.() -> Unit,
  ) : this(scope, id, LogStreamProps(props)
  )

  /**
   * The name of this log stream.
   */
  public override fun logStreamName(): String = unwrap(this).getLogStreamName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.LogStream].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The log group to create a log stream for.
     *
     * @param logGroup The log group to create a log stream for. 
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * The name of the log stream to create.
     *
     * The name must be unique within the log group.
     *
     * Default: Automatically generated
     *
     * @param logStreamName The name of the log stream to create. 
     */
    public fun logStreamName(logStreamName: String)

    /**
     * Determine what happens when the log stream resource is removed from the app.
     *
     * Normally you want to retain the log stream so you can diagnose issues from
     * logs even after a deployment that no longer includes the log stream.
     *
     * The date-based retention policy of your log group will age out the logs
     * after a certain time.
     *
     * Default: RemovalPolicy.Retain
     *
     * @param removalPolicy Determine what happens when the log stream resource is removed from the
     * app. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.LogStream.Builder =
        software.amazon.awscdk.services.logs.LogStream.Builder.create(scope, id)

    /**
     * The log group to create a log stream for.
     *
     * @param logGroup The log group to create a log stream for. 
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    /**
     * The name of the log stream to create.
     *
     * The name must be unique within the log group.
     *
     * Default: Automatically generated
     *
     * @param logStreamName The name of the log stream to create. 
     */
    override fun logStreamName(logStreamName: String) {
      cdkBuilder.logStreamName(logStreamName)
    }

    /**
     * Determine what happens when the log stream resource is removed from the app.
     *
     * Normally you want to retain the log stream so you can diagnose issues from
     * logs even after a deployment that no longer includes the log stream.
     *
     * The date-based retention policy of your log group will age out the logs
     * after a certain time.
     *
     * Default: RemovalPolicy.Retain
     *
     * @param removalPolicy Determine what happens when the log stream resource is removed from the
     * app. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.LogStream = cdkBuilder.build()
  }

  public companion object {
    public fun fromLogStreamName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      logStreamName: String,
    ): ILogStream =
        software.amazon.awscdk.services.logs.LogStream.fromLogStreamName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, logStreamName).let(ILogStream::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LogStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LogStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.LogStream): LogStream =
        LogStream(cdkObject)

    internal fun unwrap(wrapped: LogStream): software.amazon.awscdk.services.logs.LogStream =
        wrapped.cdkObject
  }
}
