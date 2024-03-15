@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Greengrass::LoggerDefinitionVersion` resource represents a logger definition version
 * for AWS IoT Greengrass .
 *
 * A logger definition version contains a list of loggers.
 *
 *
 * To create a logger definition version, you must specify the ID of the logger definition that you
 * want to associate with the version. For information about creating a logger definition, see
 * [`AWS::Greengrass::LoggerDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html)
 * .
 *
 * After you create a logger definition version that contains the loggers you want to deploy, you
 * must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * CfnLoggerDefinitionVersion cfnLoggerDefinitionVersion =
 * CfnLoggerDefinitionVersion.Builder.create(this, "MyCfnLoggerDefinitionVersion")
 * .loggerDefinitionId("loggerDefinitionId")
 * .loggers(List.of(LoggerProperty.builder()
 * .component("component")
 * .id("id")
 * .level("level")
 * .type("type")
 * // the properties below are optional
 * .space(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
 */
public open class CfnLoggerDefinitionVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the logger definition associated with this version.
   */
  public open fun loggerDefinitionId(): String = unwrap(this).getLoggerDefinitionId()

  /**
   * The ID of the logger definition associated with this version.
   */
  public open fun loggerDefinitionId(`value`: String) {
    unwrap(this).setLoggerDefinitionId(`value`)
  }

  /**
   * The loggers in this version.
   */
  public open fun loggers(): Any = unwrap(this).getLoggers()

  /**
   * The loggers in this version.
   */
  public open fun loggers(`value`: IResolvable) {
    unwrap(this).setLoggers(`value`.let(IResolvable::unwrap))
  }

  /**
   * The loggers in this version.
   */
  public open fun loggers(_idx_ac66f0: List<Any>) {
    unwrap(this).setLoggers(_idx_ac66f0)
  }

  /**
   * The loggers in this version.
   */
  public open fun loggers(vararg _idx_ac66f0: Any): Unit = loggers(_idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.greengrass.CfnLoggerDefinitionVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the logger definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggerdefinitionid)
     * @param loggerDefinitionId The ID of the logger definition associated with this version. 
     */
    public fun loggerDefinitionId(loggerDefinitionId: String)

    /**
     * The loggers in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
     * @param loggers The loggers in this version. 
     */
    public fun loggers(loggers: IResolvable)

    /**
     * The loggers in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
     * @param loggers The loggers in this version. 
     */
    public fun loggers(loggers: List<Any>)

    /**
     * The loggers in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
     * @param loggers The loggers in this version. 
     */
    public fun loggers(vararg loggers: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.Builder.create(scope,
        id)

    /**
     * The ID of the logger definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggerdefinitionid)
     * @param loggerDefinitionId The ID of the logger definition associated with this version. 
     */
    override fun loggerDefinitionId(loggerDefinitionId: String) {
      cdkBuilder.loggerDefinitionId(loggerDefinitionId)
    }

    /**
     * The loggers in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
     * @param loggers The loggers in this version. 
     */
    override fun loggers(loggers: IResolvable) {
      cdkBuilder.loggers(loggers.let(IResolvable::unwrap))
    }

    /**
     * The loggers in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
     * @param loggers The loggers in this version. 
     */
    override fun loggers(loggers: List<Any>) {
      cdkBuilder.loggers(loggers)
    }

    /**
     * The loggers in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html#cfn-greengrass-loggerdefinitionversion-loggers)
     * @param loggers The loggers in this version. 
     */
    override fun loggers(vararg loggers: Any): Unit = loggers(loggers.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoggerDefinitionVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoggerDefinitionVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion):
        CfnLoggerDefinitionVersion = CfnLoggerDefinitionVersion(cdkObject)

    internal fun unwrap(wrapped: CfnLoggerDefinitionVersion):
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion = wrapped.cdkObject
  }

  /**
   * A logger represents logging settings for the AWS IoT Greengrass group, which can be stored in
   * CloudWatch and the local file system of your core device.
   *
   * All log entries include a timestamp, log level, and information about the event. For more
   * information, see [Monitoring with AWS IoT Greengrass
   * Logs](https://docs.aws.amazon.com/greengrass/v1/developerguide/greengrass-logs-overview.html) in
   * the *Developer Guide* .
   *
   * In an AWS CloudFormation template, the `Loggers` property of the
   * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
   * resource contains a list of `Logger` property types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * LoggerProperty loggerProperty = LoggerProperty.builder()
   * .component("component")
   * .id("id")
   * .level("level")
   * .type("type")
   * // the properties below are optional
   * .space(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html)
   */
  public interface LoggerProperty {
    /**
     * The source of the log event.
     *
     * Valid values are `GreengrassSystem` or `Lambda` . When `GreengrassSystem` is used, events
     * from Greengrass system components are logged. When `Lambda` is used, events from user-defined
     * Lambda functions are logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-component)
     */
    public fun component(): String

    /**
     * A descriptive or arbitrary ID for the logger.
     *
     * This value must be unique within the logger definition version. Maximum length is 128
     * characters with pattern `[a-zA-Z0-9:_-]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-id)
     */
    public fun id(): String

    /**
     * The log-level threshold.
     *
     * Log events below this threshold are filtered out and aren't stored. Valid values are `DEBUG`
     * , `INFO` (recommended), `WARN` , `ERROR` , or `FATAL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-level)
     */
    public fun level(): String

    /**
     * The amount of file space (in KB) to use when writing logs to the local file system.
     *
     * This property does not apply for CloudWatch Logs .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-space)
     */
    public fun space(): Number? = unwrap(this).getSpace()

    /**
     * The storage mechanism for log events.
     *
     * Valid values are `FileSystem` or `AWSCloudWatch` . When `AWSCloudWatch` is used, log events
     * are sent to CloudWatch Logs . When `FileSystem` is used, log events are stored on the local file
     * system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-type)
     */
    public fun type(): String

    /**
     * A builder for [LoggerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param component The source of the log event. 
       * Valid values are `GreengrassSystem` or `Lambda` . When `GreengrassSystem` is used, events
       * from Greengrass system components are logged. When `Lambda` is used, events from user-defined
       * Lambda functions are logged.
       */
      public fun component(component: String)

      /**
       * @param id A descriptive or arbitrary ID for the logger. 
       * This value must be unique within the logger definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      public fun id(id: String)

      /**
       * @param level The log-level threshold. 
       * Log events below this threshold are filtered out and aren't stored. Valid values are
       * `DEBUG` , `INFO` (recommended), `WARN` , `ERROR` , or `FATAL` .
       */
      public fun level(level: String)

      /**
       * @param space The amount of file space (in KB) to use when writing logs to the local file
       * system.
       * This property does not apply for CloudWatch Logs .
       */
      public fun space(space: Number)

      /**
       * @param type The storage mechanism for log events. 
       * Valid values are `FileSystem` or `AWSCloudWatch` . When `AWSCloudWatch` is used, log events
       * are sent to CloudWatch Logs . When `FileSystem` is used, log events are stored on the local
       * file system.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty.builder()

      /**
       * @param component The source of the log event. 
       * Valid values are `GreengrassSystem` or `Lambda` . When `GreengrassSystem` is used, events
       * from Greengrass system components are logged. When `Lambda` is used, events from user-defined
       * Lambda functions are logged.
       */
      override fun component(component: String) {
        cdkBuilder.component(component)
      }

      /**
       * @param id A descriptive or arbitrary ID for the logger. 
       * This value must be unique within the logger definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param level The log-level threshold. 
       * Log events below this threshold are filtered out and aren't stored. Valid values are
       * `DEBUG` , `INFO` (recommended), `WARN` , `ERROR` , or `FATAL` .
       */
      override fun level(level: String) {
        cdkBuilder.level(level)
      }

      /**
       * @param space The amount of file space (in KB) to use when writing logs to the local file
       * system.
       * This property does not apply for CloudWatch Logs .
       */
      override fun space(space: Number) {
        cdkBuilder.space(space)
      }

      /**
       * @param type The storage mechanism for log events. 
       * Valid values are `FileSystem` or `AWSCloudWatch` . When `AWSCloudWatch` is used, log events
       * are sent to CloudWatch Logs . When `FileSystem` is used, log events are stored on the local
       * file system.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty,
    ) : CdkObject(cdkObject), LoggerProperty {
      /**
       * The source of the log event.
       *
       * Valid values are `GreengrassSystem` or `Lambda` . When `GreengrassSystem` is used, events
       * from Greengrass system components are logged. When `Lambda` is used, events from user-defined
       * Lambda functions are logged.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-component)
       */
      override fun component(): String = unwrap(this).getComponent()

      /**
       * A descriptive or arbitrary ID for the logger.
       *
       * This value must be unique within the logger definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The log-level threshold.
       *
       * Log events below this threshold are filtered out and aren't stored. Valid values are
       * `DEBUG` , `INFO` (recommended), `WARN` , `ERROR` , or `FATAL` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-level)
       */
      override fun level(): String = unwrap(this).getLevel()

      /**
       * The amount of file space (in KB) to use when writing logs to the local file system.
       *
       * This property does not apply for CloudWatch Logs .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-space)
       */
      override fun space(): Number? = unwrap(this).getSpace()

      /**
       * The storage mechanism for log events.
       *
       * Valid values are `FileSystem` or `AWSCloudWatch` . When `AWSCloudWatch` is used, log events
       * are sent to CloudWatch Logs . When `FileSystem` is used, log events are stored on the local
       * file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html#cfn-greengrass-loggerdefinitionversion-logger-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty):
          LoggerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggerProperty):
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion.LoggerProperty
    }
  }
}
