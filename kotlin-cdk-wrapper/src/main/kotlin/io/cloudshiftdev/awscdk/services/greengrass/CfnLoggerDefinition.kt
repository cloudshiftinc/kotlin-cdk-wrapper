@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Greengrass::LoggerDefinition` resource represents a logger definition for AWS IoT
 * Greengrass .
 *
 * Logger definitions are used to organize your logger definition versions.
 *
 * Logger definitions can reference multiple logger definition versions. All logger definition
 * versions must be associated with a logger definition. Each logger definition version can contain one
 * or more loggers.
 *
 *
 * When you create a logger definition, you can optionally include an initial logger definition
 * version. To associate a logger definition version later, create an
 * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
 * resource and specify the ID of this logger definition.
 *
 * After you create the logger definition version that contains the loggers you want to deploy, you
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
 * Object tags;
 * CfnLoggerDefinition cfnLoggerDefinition = CfnLoggerDefinition.Builder.create(this,
 * "MyCfnLoggerDefinition")
 * .name("name")
 * // the properties below are optional
 * .initialVersion(LoggerDefinitionVersionProperty.builder()
 * .loggers(List.of(LoggerProperty.builder()
 * .component("component")
 * .id("id")
 * .level("level")
 * .type("type")
 * // the properties below are optional
 * .space(123)
 * .build()))
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html)
 */
public open class CfnLoggerDefinition(
  cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLoggerDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.greengrass.CfnLoggerDefinition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnLoggerDefinitionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLoggerDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLoggerDefinitionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the `LoggerDefinition` , such as
   * `arn:aws:greengrass:us-east-1: 
   * :/greengrass/definition/loggers/1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the `LoggerDefinition` , such as `1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ARN of the last `LoggerDefinitionVersion` that was added to the `LoggerDefinition` , such
   * as `arn:aws:greengrass:us-east-1: 
   * :/greengrass/definition/loggers/1234a5b6-78cd-901e-2fgh-3i45j6k178l9/versions/9876ac30-4bdb-4f9d-95af-b5fdb66be1a2`
   * .
   */
  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  /**
   * The name of the `LoggerDefinition` , such as `MyLoggerDefinition` .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The logger definition version to include when the logger definition is created.
   */
  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  /**
   * The logger definition version to include when the logger definition is created.
   */
  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable::unwrap))
  }

  /**
   * The logger definition version to include when the logger definition is created.
   */
  public open fun initialVersion(`value`: LoggerDefinitionVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(LoggerDefinitionVersionProperty::unwrap))
  }

  /**
   * The logger definition version to include when the logger definition is created.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dfcae09ab4c5beede673395f0bf853578b20abb2afd40416d10f0e28e7eaf4bc")
  public open fun initialVersion(`value`: LoggerDefinitionVersionProperty.Builder.() -> Unit): Unit
      = initialVersion(LoggerDefinitionVersionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the logger definition.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the logger definition.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Application-specific metadata to attach to the logger definition.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * Application-specific metadata to attach to the logger definition.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.greengrass.CfnLoggerDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The logger definition version to include when the logger definition is created.
     *
     * A logger definition version contains a list of
     * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * property types.
     *
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-initialversion)
     * @param initialVersion The logger definition version to include when the logger definition is
     * created. 
     */
    public fun initialVersion(initialVersion: IResolvable)

    /**
     * The logger definition version to include when the logger definition is created.
     *
     * A logger definition version contains a list of
     * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * property types.
     *
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-initialversion)
     * @param initialVersion The logger definition version to include when the logger definition is
     * created. 
     */
    public fun initialVersion(initialVersion: LoggerDefinitionVersionProperty)

    /**
     * The logger definition version to include when the logger definition is created.
     *
     * A logger definition version contains a list of
     * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * property types.
     *
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-initialversion)
     * @param initialVersion The logger definition version to include when the logger definition is
     * created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff51c6a522dd0e33bb35210369ae1aabab9f410e36ef84e09d2939d7cfd3b367")
    public fun initialVersion(initialVersion: LoggerDefinitionVersionProperty.Builder.() -> Unit)

    /**
     * The name of the logger definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-name)
     * @param name The name of the logger definition. 
     */
    public fun name(name: String)

    /**
     * Application-specific metadata to attach to the logger definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-tags)
     * @param tags Application-specific metadata to attach to the logger definition. 
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.Builder =
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.Builder.create(scope, id)

    /**
     * The logger definition version to include when the logger definition is created.
     *
     * A logger definition version contains a list of
     * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * property types.
     *
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-initialversion)
     * @param initialVersion The logger definition version to include when the logger definition is
     * created. 
     */
    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    /**
     * The logger definition version to include when the logger definition is created.
     *
     * A logger definition version contains a list of
     * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * property types.
     *
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-initialversion)
     * @param initialVersion The logger definition version to include when the logger definition is
     * created. 
     */
    override fun initialVersion(initialVersion: LoggerDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(LoggerDefinitionVersionProperty::unwrap))
    }

    /**
     * The logger definition version to include when the logger definition is created.
     *
     * A logger definition version contains a list of
     * [`logger`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * property types.
     *
     *
     * To associate a logger definition version after the logger definition is created, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-initialversion)
     * @param initialVersion The logger definition version to include when the logger definition is
     * created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff51c6a522dd0e33bb35210369ae1aabab9f410e36ef84e09d2939d7cfd3b367")
    override fun initialVersion(initialVersion: LoggerDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(LoggerDefinitionVersionProperty(initialVersion))

    /**
     * The name of the logger definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-name)
     * @param name The name of the logger definition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Application-specific metadata to attach to the logger definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html#cfn-greengrass-loggerdefinition-tags)
     * @param tags Application-specific metadata to attach to the logger definition. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnLoggerDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoggerDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoggerDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinition):
        CfnLoggerDefinition = CfnLoggerDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnLoggerDefinition):
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.greengrass.CfnLoggerDefinition
  }

  /**
   * A logger definition version contains a list of
   * [loggers](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
   * .
   *
   *
   * After you create a logger definition version that contains the loggers you want to deploy, you
   * must add it to your group version. For more information, see
   * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
   * .
   *
   *
   * In an AWS CloudFormation template, `LoggerDefinitionVersion` is the property type of the
   * `InitialVersion` property in the
   * [`AWS::Greengrass::LoggerDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * LoggerDefinitionVersionProperty loggerDefinitionVersionProperty =
   * LoggerDefinitionVersionProperty.builder()
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-loggerdefinitionversion.html)
   */
  public interface LoggerDefinitionVersionProperty {
    /**
     * The loggers in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-loggerdefinitionversion.html#cfn-greengrass-loggerdefinition-loggerdefinitionversion-loggers)
     */
    public fun loggers(): Any

    /**
     * A builder for [LoggerDefinitionVersionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param loggers The loggers in this version. 
       */
      public fun loggers(loggers: IResolvable)

      /**
       * @param loggers The loggers in this version. 
       */
      public fun loggers(loggers: List<Any>)

      /**
       * @param loggers The loggers in this version. 
       */
      public fun loggers(vararg loggers: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty.builder()

      /**
       * @param loggers The loggers in this version. 
       */
      override fun loggers(loggers: IResolvable) {
        cdkBuilder.loggers(loggers.let(IResolvable::unwrap))
      }

      /**
       * @param loggers The loggers in this version. 
       */
      override fun loggers(loggers: List<Any>) {
        cdkBuilder.loggers(loggers)
      }

      /**
       * @param loggers The loggers in this version. 
       */
      override fun loggers(vararg loggers: Any): Unit = loggers(loggers.toList())

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty,
    ) : CdkObject(cdkObject), LoggerDefinitionVersionProperty {
      /**
       * The loggers in this version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-loggerdefinitionversion.html#cfn-greengrass-loggerdefinition-loggerdefinitionversion-loggers)
       */
      override fun loggers(): Any = unwrap(this).getLoggers()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggerDefinitionVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty):
          LoggerDefinitionVersionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LoggerDefinitionVersionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggerDefinitionVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerDefinitionVersionProperty
    }
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
   * [`LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-loggerdefinitionversion.html)
   * property type contains a list of `Logger` property types.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
   */
  public interface LoggerProperty {
    /**
     * The source of the log event.
     *
     * Valid values are `GreengrassSystem` or `Lambda` . When `GreengrassSystem` is used, events
     * from Greengrass system components are logged. When `Lambda` is used, events from user-defined
     * Lambda functions are logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html#cfn-greengrass-loggerdefinition-logger-component)
     */
    public fun component(): String

    /**
     * A descriptive or arbitrary ID for the logger.
     *
     * This value must be unique within the logger definition version. Maximum length is 128
     * characters with pattern `[a-zA-Z0-9:_-]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html#cfn-greengrass-loggerdefinition-logger-id)
     */
    public fun id(): String

    /**
     * The log-level threshold.
     *
     * Log events below this threshold are filtered out and aren't stored. Valid values are `DEBUG`
     * , `INFO` (recommended), `WARN` , `ERROR` , or `FATAL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html#cfn-greengrass-loggerdefinition-logger-level)
     */
    public fun level(): String

    /**
     * The amount of file space (in KB) to use when writing logs to the local file system.
     *
     * This property does not apply for CloudWatch Logs .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html#cfn-greengrass-loggerdefinition-logger-space)
     */
    public fun space(): Number? = unwrap(this).getSpace()

    /**
     * The storage mechanism for log events.
     *
     * Valid values are `FileSystem` or `AWSCloudWatch` . When `AWSCloudWatch` is used, log events
     * are sent to CloudWatch Logs . When `FileSystem` is used, log events are stored on the local file
     * system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html#cfn-greengrass-loggerdefinition-logger-type)
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
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerProperty.Builder =
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerProperty.builder()

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
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerProperty,
    ) : CdkObject(cdkObject), LoggerProperty {
      /**
       * The source of the log event.
       *
       * Valid values are `GreengrassSystem` or `Lambda` . When `GreengrassSystem` is used, events
       * from Greengrass system components are logged. When `Lambda` is used, events from user-defined
       * Lambda functions are logged.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html#cfn-greengrass-loggerdefinition-logger-component)
       */
      override fun component(): String = unwrap(this).getComponent()

      /**
       * A descriptive or arbitrary ID for the logger.
       *
       * This value must be unique within the logger definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html#cfn-greengrass-loggerdefinition-logger-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The log-level threshold.
       *
       * Log events below this threshold are filtered out and aren't stored. Valid values are
       * `DEBUG` , `INFO` (recommended), `WARN` , `ERROR` , or `FATAL` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html#cfn-greengrass-loggerdefinition-logger-level)
       */
      override fun level(): String = unwrap(this).getLevel()

      /**
       * The amount of file space (in KB) to use when writing logs to the local file system.
       *
       * This property does not apply for CloudWatch Logs .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html#cfn-greengrass-loggerdefinition-logger-space)
       */
      override fun space(): Number? = unwrap(this).getSpace()

      /**
       * The storage mechanism for log events.
       *
       * Valid values are `FileSystem` or `AWSCloudWatch` . When `AWSCloudWatch` is used, log events
       * are sent to CloudWatch Logs . When `FileSystem` is used, log events are stored on the local
       * file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html#cfn-greengrass-loggerdefinition-logger-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerProperty):
          LoggerProperty = CdkObjectWrappers.wrap(cdkObject) as? LoggerProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggerProperty):
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnLoggerDefinition.LoggerProperty
    }
  }
}
