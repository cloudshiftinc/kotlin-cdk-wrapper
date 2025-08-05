@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates or updates a *log transformer* for a single log group.
 *
 * You use log transformers to transform log events into a different format, making them easier for
 * you to process and analyze. You can also transform logs from different sources into standardized
 * formats that contains relevant, source-specific information.
 *
 * After you have created a transformer, CloudWatch Logs performs the transformations at the time of
 * log ingestion. You can then refer to the transformed versions of the logs during operations such as
 * querying with CloudWatch Logs Insights or creating metric filters or subscription filers.
 *
 * You can also use a transformer to copy metadata from metadata keys into the log events
 * themselves. This metadata can include log group name, log stream name, account ID and Region.
 *
 * A transformer for a log group is a series of processors, where each processor applies one type of
 * transformation to the log events ingested into this log group. The processors work one after
 * another, in the order that you list them, like a pipeline. For more information about the available
 * processors to use in a transformer, see [Processors that you can
 * use](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-Processors)
 * .
 *
 * Having log events in standardized format enables visibility across your applications for your log
 * analysis, reporting, and alarming needs. CloudWatch Logs provides transformation for common log
 * types with out-of-the-box transformation templates for major AWS log sources such as VPC flow logs,
 * Lambda, and Amazon RDS. You can use pre-built transformation templates or create custom
 * transformation policies.
 *
 * You can create transformers only for the log groups in the Standard log class.
 *
 * You can also set up a transformer at the account level. For more information, see
 * [PutAccountPolicy](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutAccountPolicy.html)
 * . If there is both a log-group level transformer created with `PutTransformer` and an account-level
 * transformer that could apply to the same log group, the log group uses only the log-group level
 * transformer. It ignores the account-level transformer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnTransformer cfnTransformer = CfnTransformer.Builder.create(this, "MyCfnTransformer")
 * .logGroupIdentifier("logGroupIdentifier")
 * .transformerConfig(List.of(ProcessorProperty.builder()
 * .addKeys(AddKeysProperty.builder()
 * .entries(List.of(AddKeyEntryProperty.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .overwriteIfExists(false)
 * .build()))
 * .build())
 * .copyValue(CopyValueProperty.builder()
 * .entries(List.of(CopyValueEntryProperty.builder()
 * .source("source")
 * .target("target")
 * // the properties below are optional
 * .overwriteIfExists(false)
 * .build()))
 * .build())
 * .csv(CsvProperty.builder()
 * .columns(List.of("columns"))
 * .delimiter("delimiter")
 * .quoteCharacter("quoteCharacter")
 * .source("source")
 * .build())
 * .dateTimeConverter(DateTimeConverterProperty.builder()
 * .matchPatterns(List.of("matchPatterns"))
 * .source("source")
 * .target("target")
 * // the properties below are optional
 * .locale("locale")
 * .sourceTimezone("sourceTimezone")
 * .targetFormat("targetFormat")
 * .targetTimezone("targetTimezone")
 * .build())
 * .deleteKeys(DeleteKeysProperty.builder()
 * .withKeys(List.of("withKeys"))
 * .build())
 * .grok(GrokProperty.builder()
 * .match("match")
 * // the properties below are optional
 * .source("source")
 * .build())
 * .listToMap(ListToMapProperty.builder()
 * .key("key")
 * .source("source")
 * // the properties below are optional
 * .flatten(false)
 * .flattenedElement("flattenedElement")
 * .target("target")
 * .valueKey("valueKey")
 * .build())
 * .lowerCaseString(LowerCaseStringProperty.builder()
 * .withKeys(List.of("withKeys"))
 * .build())
 * .moveKeys(MoveKeysProperty.builder()
 * .entries(List.of(MoveKeyEntryProperty.builder()
 * .source("source")
 * .target("target")
 * // the properties below are optional
 * .overwriteIfExists(false)
 * .build()))
 * .build())
 * .parseCloudfront(ParseCloudfrontProperty.builder()
 * .source("source")
 * .build())
 * .parseJson(ParseJSONProperty.builder()
 * .destination("destination")
 * .source("source")
 * .build())
 * .parseKeyValue(ParseKeyValueProperty.builder()
 * .destination("destination")
 * .fieldDelimiter("fieldDelimiter")
 * .keyPrefix("keyPrefix")
 * .keyValueDelimiter("keyValueDelimiter")
 * .nonMatchValue("nonMatchValue")
 * .overwriteIfExists(false)
 * .source("source")
 * .build())
 * .parsePostgres(ParsePostgresProperty.builder()
 * .source("source")
 * .build())
 * .parseRoute53(ParseRoute53Property.builder()
 * .source("source")
 * .build())
 * .parseToOcsf(ParseToOCSFProperty.builder()
 * .eventSource("eventSource")
 * .ocsfVersion("ocsfVersion")
 * // the properties below are optional
 * .source("source")
 * .build())
 * .parseVpc(ParseVPCProperty.builder()
 * .source("source")
 * .build())
 * .parseWaf(ParseWAFProperty.builder()
 * .source("source")
 * .build())
 * .renameKeys(RenameKeysProperty.builder()
 * .entries(List.of(RenameKeyEntryProperty.builder()
 * .key("key")
 * .renameTo("renameTo")
 * // the properties below are optional
 * .overwriteIfExists(false)
 * .build()))
 * .build())
 * .splitString(SplitStringProperty.builder()
 * .entries(List.of(SplitStringEntryProperty.builder()
 * .delimiter("delimiter")
 * .source("source")
 * .build()))
 * .build())
 * .substituteString(SubstituteStringProperty.builder()
 * .entries(List.of(SubstituteStringEntryProperty.builder()
 * .from("from")
 * .source("source")
 * .to("to")
 * .build()))
 * .build())
 * .trimString(TrimStringProperty.builder()
 * .withKeys(List.of("withKeys"))
 * .build())
 * .typeConverter(TypeConverterProperty.builder()
 * .entries(List.of(TypeConverterEntryProperty.builder()
 * .key("key")
 * .type("type")
 * .build()))
 * .build())
 * .upperCaseString(UpperCaseStringProperty.builder()
 * .withKeys(List.of("withKeys"))
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-transformer.html)
 */
public open class CfnTransformer(
  cdkObject: software.amazon.awscdk.services.logs.CfnTransformer,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransformerProps,
  ) :
      this(software.amazon.awscdk.services.logs.CfnTransformer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTransformerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransformerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTransformerProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Specify either the name or ARN of the log group to create the transformer for.
   */
  public open fun logGroupIdentifier(): String = unwrap(this).getLogGroupIdentifier()

  /**
   * Specify either the name or ARN of the log group to create the transformer for.
   */
  public open fun logGroupIdentifier(`value`: String) {
    unwrap(this).setLogGroupIdentifier(`value`)
  }

  /**
   * This structure is an array that contains the configuration of this log transformer.
   */
  public open fun transformerConfig(): Any = unwrap(this).getTransformerConfig()

  /**
   * This structure is an array that contains the configuration of this log transformer.
   */
  public open fun transformerConfig(`value`: IResolvable) {
    unwrap(this).setTransformerConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * This structure is an array that contains the configuration of this log transformer.
   */
  public open fun transformerConfig(`value`: List<Any>) {
    unwrap(this).setTransformerConfig(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * This structure is an array that contains the configuration of this log transformer.
   */
  public open fun transformerConfig(vararg `value`: Any): Unit = transformerConfig(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CfnTransformer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specify either the name or ARN of the log group to create the transformer for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-transformer.html#cfn-logs-transformer-loggroupidentifier)
     * @param logGroupIdentifier Specify either the name or ARN of the log group to create the
     * transformer for. 
     */
    public fun logGroupIdentifier(logGroupIdentifier: String)

    /**
     * This structure is an array that contains the configuration of this log transformer.
     *
     * A log transformer is an array of processors, where each processor applies one type of
     * transformation to the log events that are ingested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-transformer.html#cfn-logs-transformer-transformerconfig)
     * @param transformerConfig This structure is an array that contains the configuration of this
     * log transformer. 
     */
    public fun transformerConfig(transformerConfig: IResolvable)

    /**
     * This structure is an array that contains the configuration of this log transformer.
     *
     * A log transformer is an array of processors, where each processor applies one type of
     * transformation to the log events that are ingested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-transformer.html#cfn-logs-transformer-transformerconfig)
     * @param transformerConfig This structure is an array that contains the configuration of this
     * log transformer. 
     */
    public fun transformerConfig(transformerConfig: List<Any>)

    /**
     * This structure is an array that contains the configuration of this log transformer.
     *
     * A log transformer is an array of processors, where each processor applies one type of
     * transformation to the log events that are ingested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-transformer.html#cfn-logs-transformer-transformerconfig)
     * @param transformerConfig This structure is an array that contains the configuration of this
     * log transformer. 
     */
    public fun transformerConfig(vararg transformerConfig: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnTransformer.Builder =
        software.amazon.awscdk.services.logs.CfnTransformer.Builder.create(scope, id)

    /**
     * Specify either the name or ARN of the log group to create the transformer for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-transformer.html#cfn-logs-transformer-loggroupidentifier)
     * @param logGroupIdentifier Specify either the name or ARN of the log group to create the
     * transformer for. 
     */
    override fun logGroupIdentifier(logGroupIdentifier: String) {
      cdkBuilder.logGroupIdentifier(logGroupIdentifier)
    }

    /**
     * This structure is an array that contains the configuration of this log transformer.
     *
     * A log transformer is an array of processors, where each processor applies one type of
     * transformation to the log events that are ingested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-transformer.html#cfn-logs-transformer-transformerconfig)
     * @param transformerConfig This structure is an array that contains the configuration of this
     * log transformer. 
     */
    override fun transformerConfig(transformerConfig: IResolvable) {
      cdkBuilder.transformerConfig(transformerConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * This structure is an array that contains the configuration of this log transformer.
     *
     * A log transformer is an array of processors, where each processor applies one type of
     * transformation to the log events that are ingested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-transformer.html#cfn-logs-transformer-transformerconfig)
     * @param transformerConfig This structure is an array that contains the configuration of this
     * log transformer. 
     */
    override fun transformerConfig(transformerConfig: List<Any>) {
      cdkBuilder.transformerConfig(transformerConfig.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * This structure is an array that contains the configuration of this log transformer.
     *
     * A log transformer is an array of processors, where each processor applies one type of
     * transformation to the log events that are ingested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-transformer.html#cfn-logs-transformer-transformerconfig)
     * @param transformerConfig This structure is an array that contains the configuration of this
     * log transformer. 
     */
    override fun transformerConfig(vararg transformerConfig: Any): Unit =
        transformerConfig(transformerConfig.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnTransformer = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.logs.CfnTransformer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransformer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransformer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer):
        CfnTransformer = CfnTransformer(cdkObject)

    internal fun unwrap(wrapped: CfnTransformer):
        software.amazon.awscdk.services.logs.CfnTransformer = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.CfnTransformer
  }

  /**
   * This object defines one key that will be added with the
   * [addKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-addKey)
   * processor.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * AddKeyEntryProperty addKeyEntryProperty = AddKeyEntryProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .overwriteIfExists(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-addkeyentry.html)
   */
  public interface AddKeyEntryProperty {
    /**
     * The key of the new entry to be added to the log event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-addkeyentry.html#cfn-logs-transformer-addkeyentry-key)
     */
    public fun key(): String

    /**
     * Specifies whether to overwrite the value if the key already exists in the log event.
     *
     * If you omit this, the default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-addkeyentry.html#cfn-logs-transformer-addkeyentry-overwriteifexists)
     */
    public fun overwriteIfExists(): Any? = unwrap(this).getOverwriteIfExists()

    /**
     * The value of the new entry to be added to the log event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-addkeyentry.html#cfn-logs-transformer-addkeyentry-value)
     */
    public fun `value`(): String

    /**
     * A builder for [AddKeyEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key of the new entry to be added to the log event. 
       */
      public fun key(key: String)

      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the key already exists
       * in the log event.
       * If you omit this, the default is `false` .
       */
      public fun overwriteIfExists(overwriteIfExists: Boolean)

      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the key already exists
       * in the log event.
       * If you omit this, the default is `false` .
       */
      public fun overwriteIfExists(overwriteIfExists: IResolvable)

      /**
       * @param value The value of the new entry to be added to the log event. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.AddKeyEntryProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.AddKeyEntryProperty.builder()

      /**
       * @param key The key of the new entry to be added to the log event. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the key already exists
       * in the log event.
       * If you omit this, the default is `false` .
       */
      override fun overwriteIfExists(overwriteIfExists: Boolean) {
        cdkBuilder.overwriteIfExists(overwriteIfExists)
      }

      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the key already exists
       * in the log event.
       * If you omit this, the default is `false` .
       */
      override fun overwriteIfExists(overwriteIfExists: IResolvable) {
        cdkBuilder.overwriteIfExists(overwriteIfExists.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param value The value of the new entry to be added to the log event. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.AddKeyEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.AddKeyEntryProperty,
    ) : CdkObject(cdkObject),
        AddKeyEntryProperty {
      /**
       * The key of the new entry to be added to the log event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-addkeyentry.html#cfn-logs-transformer-addkeyentry-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * Specifies whether to overwrite the value if the key already exists in the log event.
       *
       * If you omit this, the default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-addkeyentry.html#cfn-logs-transformer-addkeyentry-overwriteifexists)
       */
      override fun overwriteIfExists(): Any? = unwrap(this).getOverwriteIfExists()

      /**
       * The value of the new entry to be added to the log event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-addkeyentry.html#cfn-logs-transformer-addkeyentry-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AddKeyEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.AddKeyEntryProperty):
          AddKeyEntryProperty = CdkObjectWrappers.wrap(cdkObject) as? AddKeyEntryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddKeyEntryProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.AddKeyEntryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.AddKeyEntryProperty
    }
  }

  /**
   * This processor adds new key-value pairs to the log event.
   *
   * For more information about this processor including examples, see
   * [addKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-addKeys)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * AddKeysProperty addKeysProperty = AddKeysProperty.builder()
   * .entries(List.of(AddKeyEntryProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .overwriteIfExists(false)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-addkeys.html)
   */
  public interface AddKeysProperty {
    /**
     * An array of objects, where each object contains the information about one key to add to the
     * log event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-addkeys.html#cfn-logs-transformer-addkeys-entries)
     */
    public fun entries(): Any

    /**
     * A builder for [AddKeysProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to add to the log event. 
       */
      public fun entries(entries: IResolvable)

      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to add to the log event. 
       */
      public fun entries(entries: List<Any>)

      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to add to the log event. 
       */
      public fun entries(vararg entries: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.AddKeysProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.AddKeysProperty.builder()

      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to add to the log event. 
       */
      override fun entries(entries: IResolvable) {
        cdkBuilder.entries(entries.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to add to the log event. 
       */
      override fun entries(entries: List<Any>) {
        cdkBuilder.entries(entries.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to add to the log event. 
       */
      override fun entries(vararg entries: Any): Unit = entries(entries.toList())

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.AddKeysProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.AddKeysProperty,
    ) : CdkObject(cdkObject),
        AddKeysProperty {
      /**
       * An array of objects, where each object contains the information about one key to add to the
       * log event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-addkeys.html#cfn-logs-transformer-addkeys-entries)
       */
      override fun entries(): Any = unwrap(this).getEntries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AddKeysProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.AddKeysProperty):
          AddKeysProperty = CdkObjectWrappers.wrap(cdkObject) as? AddKeysProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddKeysProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.AddKeysProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.AddKeysProperty
    }
  }

  /**
   * This object defines one value to be copied with the
   * [copyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-copyValue)
   * processor.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * CopyValueEntryProperty copyValueEntryProperty = CopyValueEntryProperty.builder()
   * .source("source")
   * .target("target")
   * // the properties below are optional
   * .overwriteIfExists(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-copyvalueentry.html)
   */
  public interface CopyValueEntryProperty {
    /**
     * Specifies whether to overwrite the value if the destination key already exists.
     *
     * If you omit this, the default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-copyvalueentry.html#cfn-logs-transformer-copyvalueentry-overwriteifexists)
     */
    public fun overwriteIfExists(): Any? = unwrap(this).getOverwriteIfExists()

    /**
     * The key to copy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-copyvalueentry.html#cfn-logs-transformer-copyvalueentry-source)
     */
    public fun source(): String

    /**
     * The key of the field to copy the value to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-copyvalueentry.html#cfn-logs-transformer-copyvalueentry-target)
     */
    public fun target(): String

    /**
     * A builder for [CopyValueEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the destination key
       * already exists.
       * If you omit this, the default is `false` .
       */
      public fun overwriteIfExists(overwriteIfExists: Boolean)

      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the destination key
       * already exists.
       * If you omit this, the default is `false` .
       */
      public fun overwriteIfExists(overwriteIfExists: IResolvable)

      /**
       * @param source The key to copy. 
       */
      public fun source(source: String)

      /**
       * @param target The key of the field to copy the value to. 
       */
      public fun target(target: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.CopyValueEntryProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.CopyValueEntryProperty.builder()

      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the destination key
       * already exists.
       * If you omit this, the default is `false` .
       */
      override fun overwriteIfExists(overwriteIfExists: Boolean) {
        cdkBuilder.overwriteIfExists(overwriteIfExists)
      }

      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the destination key
       * already exists.
       * If you omit this, the default is `false` .
       */
      override fun overwriteIfExists(overwriteIfExists: IResolvable) {
        cdkBuilder.overwriteIfExists(overwriteIfExists.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param source The key to copy. 
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      /**
       * @param target The key of the field to copy the value to. 
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.CopyValueEntryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.CopyValueEntryProperty,
    ) : CdkObject(cdkObject),
        CopyValueEntryProperty {
      /**
       * Specifies whether to overwrite the value if the destination key already exists.
       *
       * If you omit this, the default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-copyvalueentry.html#cfn-logs-transformer-copyvalueentry-overwriteifexists)
       */
      override fun overwriteIfExists(): Any? = unwrap(this).getOverwriteIfExists()

      /**
       * The key to copy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-copyvalueentry.html#cfn-logs-transformer-copyvalueentry-source)
       */
      override fun source(): String = unwrap(this).getSource()

      /**
       * The key of the field to copy the value to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-copyvalueentry.html#cfn-logs-transformer-copyvalueentry-target)
       */
      override fun target(): String = unwrap(this).getTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CopyValueEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.CopyValueEntryProperty):
          CopyValueEntryProperty = CdkObjectWrappers.wrap(cdkObject) as? CopyValueEntryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CopyValueEntryProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.CopyValueEntryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.CopyValueEntryProperty
    }
  }

  /**
   * This processor copies values within a log event.
   *
   * You can also use this processor to add metadata to log events by copying the values of the
   * following metadata keys into the log events: `&#64;logGroupName` , `&#64;logGroupStream` ,
   * `&#64;accountId` , `&#64;regionName` .
   *
   * For more information about this processor including examples, see
   * [copyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-copyValue)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * CopyValueProperty copyValueProperty = CopyValueProperty.builder()
   * .entries(List.of(CopyValueEntryProperty.builder()
   * .source("source")
   * .target("target")
   * // the properties below are optional
   * .overwriteIfExists(false)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-copyvalue.html)
   */
  public interface CopyValueProperty {
    /**
     * An array of `CopyValueEntry` objects, where each object contains the information about one
     * field value to copy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-copyvalue.html#cfn-logs-transformer-copyvalue-entries)
     */
    public fun entries(): Any

    /**
     * A builder for [CopyValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param entries An array of `CopyValueEntry` objects, where each object contains the
       * information about one field value to copy. 
       */
      public fun entries(entries: IResolvable)

      /**
       * @param entries An array of `CopyValueEntry` objects, where each object contains the
       * information about one field value to copy. 
       */
      public fun entries(entries: List<Any>)

      /**
       * @param entries An array of `CopyValueEntry` objects, where each object contains the
       * information about one field value to copy. 
       */
      public fun entries(vararg entries: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.CopyValueProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.CopyValueProperty.builder()

      /**
       * @param entries An array of `CopyValueEntry` objects, where each object contains the
       * information about one field value to copy. 
       */
      override fun entries(entries: IResolvable) {
        cdkBuilder.entries(entries.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param entries An array of `CopyValueEntry` objects, where each object contains the
       * information about one field value to copy. 
       */
      override fun entries(entries: List<Any>) {
        cdkBuilder.entries(entries.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param entries An array of `CopyValueEntry` objects, where each object contains the
       * information about one field value to copy. 
       */
      override fun entries(vararg entries: Any): Unit = entries(entries.toList())

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.CopyValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.CopyValueProperty,
    ) : CdkObject(cdkObject),
        CopyValueProperty {
      /**
       * An array of `CopyValueEntry` objects, where each object contains the information about one
       * field value to copy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-copyvalue.html#cfn-logs-transformer-copyvalue-entries)
       */
      override fun entries(): Any = unwrap(this).getEntries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CopyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.CopyValueProperty):
          CopyValueProperty = CdkObjectWrappers.wrap(cdkObject) as? CopyValueProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CopyValueProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.CopyValueProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.CopyValueProperty
    }
  }

  /**
   * The `CSV` processor parses comma-separated values (CSV) from the log events into columns.
   *
   * For more information about this processor including examples, see
   * [csv](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-csv)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * CsvProperty csvProperty = CsvProperty.builder()
   * .columns(List.of("columns"))
   * .delimiter("delimiter")
   * .quoteCharacter("quoteCharacter")
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-csv.html)
   */
  public interface CsvProperty {
    /**
     * An array of names to use for the columns in the transformed log event.
     *
     * If you omit this, default column names ( `[column_1, column_2 ...]` ) are used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-csv.html#cfn-logs-transformer-csv-columns)
     */
    public fun columns(): List<String> = unwrap(this).getColumns() ?: emptyList()

    /**
     * The character used to separate each column in the original comma-separated value log event.
     *
     * If you omit this, the processor looks for the comma `,` character as the delimiter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-csv.html#cfn-logs-transformer-csv-delimiter)
     */
    public fun delimiter(): String? = unwrap(this).getDelimiter()

    /**
     * The character used used as a text qualifier for a single column of data.
     *
     * If you omit this, the double quotation mark `"` character is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-csv.html#cfn-logs-transformer-csv-quotecharacter)
     */
    public fun quoteCharacter(): String? = unwrap(this).getQuoteCharacter()

    /**
     * The path to the field in the log event that has the comma separated values to be parsed.
     *
     * If you omit this value, the whole log message is processed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-csv.html#cfn-logs-transformer-csv-source)
     */
    public fun source(): String? = unwrap(this).getSource()

    /**
     * A builder for [CsvProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columns An array of names to use for the columns in the transformed log event.
       * If you omit this, default column names ( `[column_1, column_2 ...]` ) are used.
       */
      public fun columns(columns: List<String>)

      /**
       * @param columns An array of names to use for the columns in the transformed log event.
       * If you omit this, default column names ( `[column_1, column_2 ...]` ) are used.
       */
      public fun columns(vararg columns: String)

      /**
       * @param delimiter The character used to separate each column in the original comma-separated
       * value log event.
       * If you omit this, the processor looks for the comma `,` character as the delimiter.
       */
      public fun delimiter(delimiter: String)

      /**
       * @param quoteCharacter The character used used as a text qualifier for a single column of
       * data.
       * If you omit this, the double quotation mark `"` character is used.
       */
      public fun quoteCharacter(quoteCharacter: String)

      /**
       * @param source The path to the field in the log event that has the comma separated values to
       * be parsed.
       * If you omit this value, the whole log message is processed.
       */
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.CsvProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.CsvProperty.builder()

      /**
       * @param columns An array of names to use for the columns in the transformed log event.
       * If you omit this, default column names ( `[column_1, column_2 ...]` ) are used.
       */
      override fun columns(columns: List<String>) {
        cdkBuilder.columns(columns)
      }

      /**
       * @param columns An array of names to use for the columns in the transformed log event.
       * If you omit this, default column names ( `[column_1, column_2 ...]` ) are used.
       */
      override fun columns(vararg columns: String): Unit = columns(columns.toList())

      /**
       * @param delimiter The character used to separate each column in the original comma-separated
       * value log event.
       * If you omit this, the processor looks for the comma `,` character as the delimiter.
       */
      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      /**
       * @param quoteCharacter The character used used as a text qualifier for a single column of
       * data.
       * If you omit this, the double quotation mark `"` character is used.
       */
      override fun quoteCharacter(quoteCharacter: String) {
        cdkBuilder.quoteCharacter(quoteCharacter)
      }

      /**
       * @param source The path to the field in the log event that has the comma separated values to
       * be parsed.
       * If you omit this value, the whole log message is processed.
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.CsvProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.CsvProperty,
    ) : CdkObject(cdkObject),
        CsvProperty {
      /**
       * An array of names to use for the columns in the transformed log event.
       *
       * If you omit this, default column names ( `[column_1, column_2 ...]` ) are used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-csv.html#cfn-logs-transformer-csv-columns)
       */
      override fun columns(): List<String> = unwrap(this).getColumns() ?: emptyList()

      /**
       * The character used to separate each column in the original comma-separated value log event.
       *
       * If you omit this, the processor looks for the comma `,` character as the delimiter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-csv.html#cfn-logs-transformer-csv-delimiter)
       */
      override fun delimiter(): String? = unwrap(this).getDelimiter()

      /**
       * The character used used as a text qualifier for a single column of data.
       *
       * If you omit this, the double quotation mark `"` character is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-csv.html#cfn-logs-transformer-csv-quotecharacter)
       */
      override fun quoteCharacter(): String? = unwrap(this).getQuoteCharacter()

      /**
       * The path to the field in the log event that has the comma separated values to be parsed.
       *
       * If you omit this value, the whole log message is processed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-csv.html#cfn-logs-transformer-csv-source)
       */
      override fun source(): String? = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CsvProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.CsvProperty):
          CsvProperty = CdkObjectWrappers.wrap(cdkObject) as? CsvProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.CsvProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.logs.CfnTransformer.CsvProperty
    }
  }

  /**
   * This processor converts a datetime string into a format that you specify.
   *
   * For more information about this processor including examples, see
   * [datetimeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-datetimeConverter)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * DateTimeConverterProperty dateTimeConverterProperty = DateTimeConverterProperty.builder()
   * .matchPatterns(List.of("matchPatterns"))
   * .source("source")
   * .target("target")
   * // the properties below are optional
   * .locale("locale")
   * .sourceTimezone("sourceTimezone")
   * .targetFormat("targetFormat")
   * .targetTimezone("targetTimezone")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-datetimeconverter.html)
   */
  public interface DateTimeConverterProperty {
    /**
     * The locale of the source field.
     *
     * If you omit this, the default of `locale.ROOT` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-datetimeconverter.html#cfn-logs-transformer-datetimeconverter-locale)
     */
    public fun locale(): String? = unwrap(this).getLocale()

    /**
     * A list of patterns to match against the `source` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-datetimeconverter.html#cfn-logs-transformer-datetimeconverter-matchpatterns)
     */
    public fun matchPatterns(): List<String>

    /**
     * The key to apply the date conversion to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-datetimeconverter.html#cfn-logs-transformer-datetimeconverter-source)
     */
    public fun source(): String

    /**
     * The time zone of the source field.
     *
     * If you omit this, the default used is the UTC zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-datetimeconverter.html#cfn-logs-transformer-datetimeconverter-sourcetimezone)
     */
    public fun sourceTimezone(): String? = unwrap(this).getSourceTimezone()

    /**
     * The JSON field to store the result in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-datetimeconverter.html#cfn-logs-transformer-datetimeconverter-target)
     */
    public fun target(): String

    /**
     * The datetime format to use for the converted data in the target field.
     *
     * If you omit this, the default of `yyyy-MM-dd'T'HH:mm:ss.SSS'Z` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-datetimeconverter.html#cfn-logs-transformer-datetimeconverter-targetformat)
     */
    public fun targetFormat(): String? = unwrap(this).getTargetFormat()

    /**
     * The time zone of the target field.
     *
     * If you omit this, the default used is the UTC zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-datetimeconverter.html#cfn-logs-transformer-datetimeconverter-targettimezone)
     */
    public fun targetTimezone(): String? = unwrap(this).getTargetTimezone()

    /**
     * A builder for [DateTimeConverterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param locale The locale of the source field.
       * If you omit this, the default of `locale.ROOT` is used.
       */
      public fun locale(locale: String)

      /**
       * @param matchPatterns A list of patterns to match against the `source` field. 
       */
      public fun matchPatterns(matchPatterns: List<String>)

      /**
       * @param matchPatterns A list of patterns to match against the `source` field. 
       */
      public fun matchPatterns(vararg matchPatterns: String)

      /**
       * @param source The key to apply the date conversion to. 
       */
      public fun source(source: String)

      /**
       * @param sourceTimezone The time zone of the source field.
       * If you omit this, the default used is the UTC zone.
       */
      public fun sourceTimezone(sourceTimezone: String)

      /**
       * @param target The JSON field to store the result in. 
       */
      public fun target(target: String)

      /**
       * @param targetFormat The datetime format to use for the converted data in the target field.
       * If you omit this, the default of `yyyy-MM-dd'T'HH:mm:ss.SSS'Z` is used.
       */
      public fun targetFormat(targetFormat: String)

      /**
       * @param targetTimezone The time zone of the target field.
       * If you omit this, the default used is the UTC zone.
       */
      public fun targetTimezone(targetTimezone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.DateTimeConverterProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.DateTimeConverterProperty.builder()

      /**
       * @param locale The locale of the source field.
       * If you omit this, the default of `locale.ROOT` is used.
       */
      override fun locale(locale: String) {
        cdkBuilder.locale(locale)
      }

      /**
       * @param matchPatterns A list of patterns to match against the `source` field. 
       */
      override fun matchPatterns(matchPatterns: List<String>) {
        cdkBuilder.matchPatterns(matchPatterns)
      }

      /**
       * @param matchPatterns A list of patterns to match against the `source` field. 
       */
      override fun matchPatterns(vararg matchPatterns: String): Unit =
          matchPatterns(matchPatterns.toList())

      /**
       * @param source The key to apply the date conversion to. 
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      /**
       * @param sourceTimezone The time zone of the source field.
       * If you omit this, the default used is the UTC zone.
       */
      override fun sourceTimezone(sourceTimezone: String) {
        cdkBuilder.sourceTimezone(sourceTimezone)
      }

      /**
       * @param target The JSON field to store the result in. 
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      /**
       * @param targetFormat The datetime format to use for the converted data in the target field.
       * If you omit this, the default of `yyyy-MM-dd'T'HH:mm:ss.SSS'Z` is used.
       */
      override fun targetFormat(targetFormat: String) {
        cdkBuilder.targetFormat(targetFormat)
      }

      /**
       * @param targetTimezone The time zone of the target field.
       * If you omit this, the default used is the UTC zone.
       */
      override fun targetTimezone(targetTimezone: String) {
        cdkBuilder.targetTimezone(targetTimezone)
      }

      public fun build():
          software.amazon.awscdk.services.logs.CfnTransformer.DateTimeConverterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.DateTimeConverterProperty,
    ) : CdkObject(cdkObject),
        DateTimeConverterProperty {
      /**
       * The locale of the source field.
       *
       * If you omit this, the default of `locale.ROOT` is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-datetimeconverter.html#cfn-logs-transformer-datetimeconverter-locale)
       */
      override fun locale(): String? = unwrap(this).getLocale()

      /**
       * A list of patterns to match against the `source` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-datetimeconverter.html#cfn-logs-transformer-datetimeconverter-matchpatterns)
       */
      override fun matchPatterns(): List<String> = unwrap(this).getMatchPatterns()

      /**
       * The key to apply the date conversion to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-datetimeconverter.html#cfn-logs-transformer-datetimeconverter-source)
       */
      override fun source(): String = unwrap(this).getSource()

      /**
       * The time zone of the source field.
       *
       * If you omit this, the default used is the UTC zone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-datetimeconverter.html#cfn-logs-transformer-datetimeconverter-sourcetimezone)
       */
      override fun sourceTimezone(): String? = unwrap(this).getSourceTimezone()

      /**
       * The JSON field to store the result in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-datetimeconverter.html#cfn-logs-transformer-datetimeconverter-target)
       */
      override fun target(): String = unwrap(this).getTarget()

      /**
       * The datetime format to use for the converted data in the target field.
       *
       * If you omit this, the default of `yyyy-MM-dd'T'HH:mm:ss.SSS'Z` is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-datetimeconverter.html#cfn-logs-transformer-datetimeconverter-targetformat)
       */
      override fun targetFormat(): String? = unwrap(this).getTargetFormat()

      /**
       * The time zone of the target field.
       *
       * If you omit this, the default used is the UTC zone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-datetimeconverter.html#cfn-logs-transformer-datetimeconverter-targettimezone)
       */
      override fun targetTimezone(): String? = unwrap(this).getTargetTimezone()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DateTimeConverterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.DateTimeConverterProperty):
          DateTimeConverterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DateTimeConverterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DateTimeConverterProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.DateTimeConverterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.DateTimeConverterProperty
    }
  }

  /**
   * This processor deletes entries from a log event. These entries are key-value pairs.
   *
   * For more information about this processor including examples, see
   * [deleteKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-deleteKeys)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * DeleteKeysProperty deleteKeysProperty = DeleteKeysProperty.builder()
   * .withKeys(List.of("withKeys"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-deletekeys.html)
   */
  public interface DeleteKeysProperty {
    /**
     * The list of keys to delete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-deletekeys.html#cfn-logs-transformer-deletekeys-withkeys)
     */
    public fun withKeys(): List<String>

    /**
     * A builder for [DeleteKeysProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param withKeys The list of keys to delete. 
       */
      public fun withKeys(withKeys: List<String>)

      /**
       * @param withKeys The list of keys to delete. 
       */
      public fun withKeys(vararg withKeys: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.DeleteKeysProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.DeleteKeysProperty.builder()

      /**
       * @param withKeys The list of keys to delete. 
       */
      override fun withKeys(withKeys: List<String>) {
        cdkBuilder.withKeys(withKeys)
      }

      /**
       * @param withKeys The list of keys to delete. 
       */
      override fun withKeys(vararg withKeys: String): Unit = withKeys(withKeys.toList())

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.DeleteKeysProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.DeleteKeysProperty,
    ) : CdkObject(cdkObject),
        DeleteKeysProperty {
      /**
       * The list of keys to delete.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-deletekeys.html#cfn-logs-transformer-deletekeys-withkeys)
       */
      override fun withKeys(): List<String> = unwrap(this).getWithKeys()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeleteKeysProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.DeleteKeysProperty):
          DeleteKeysProperty = CdkObjectWrappers.wrap(cdkObject) as? DeleteKeysProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeleteKeysProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.DeleteKeysProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.DeleteKeysProperty
    }
  }

  /**
   * This processor uses pattern matching to parse and structure unstructured data.
   *
   * This processor can also extract fields from log messages.
   *
   * For more information about this processor including examples, see
   * [grok](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-Grok)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * GrokProperty grokProperty = GrokProperty.builder()
   * .match("match")
   * // the properties below are optional
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-grok.html)
   */
  public interface GrokProperty {
    /**
     * The grok pattern to match against the log event.
     *
     * For a list of supported grok patterns, see [Supported grok
     * patterns](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#Grok-Patterns)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-grok.html#cfn-logs-transformer-grok-match)
     */
    public fun match(): String

    /**
     * The path to the field in the log event that you want to parse.
     *
     * If you omit this value, the whole log message is parsed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-grok.html#cfn-logs-transformer-grok-source)
     */
    public fun source(): String? = unwrap(this).getSource()

    /**
     * A builder for [GrokProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param match The grok pattern to match against the log event. 
       * For a list of supported grok patterns, see [Supported grok
       * patterns](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#Grok-Patterns)
       * .
       */
      public fun match(match: String)

      /**
       * @param source The path to the field in the log event that you want to parse.
       * If you omit this value, the whole log message is parsed.
       */
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.GrokProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.GrokProperty.builder()

      /**
       * @param match The grok pattern to match against the log event. 
       * For a list of supported grok patterns, see [Supported grok
       * patterns](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#Grok-Patterns)
       * .
       */
      override fun match(match: String) {
        cdkBuilder.match(match)
      }

      /**
       * @param source The path to the field in the log event that you want to parse.
       * If you omit this value, the whole log message is parsed.
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.GrokProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.GrokProperty,
    ) : CdkObject(cdkObject),
        GrokProperty {
      /**
       * The grok pattern to match against the log event.
       *
       * For a list of supported grok patterns, see [Supported grok
       * patterns](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#Grok-Patterns)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-grok.html#cfn-logs-transformer-grok-match)
       */
      override fun match(): String = unwrap(this).getMatch()

      /**
       * The path to the field in the log event that you want to parse.
       *
       * If you omit this value, the whole log message is parsed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-grok.html#cfn-logs-transformer-grok-source)
       */
      override fun source(): String? = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrokProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.GrokProperty):
          GrokProperty = CdkObjectWrappers.wrap(cdkObject) as? GrokProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrokProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.GrokProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.logs.CfnTransformer.GrokProperty
    }
  }

  /**
   * This processor takes a list of objects that contain key fields, and converts them into a map of
   * target keys.
   *
   * For more information about this processor including examples, see
   * [listToMap](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-listToMap)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * ListToMapProperty listToMapProperty = ListToMapProperty.builder()
   * .key("key")
   * .source("source")
   * // the properties below are optional
   * .flatten(false)
   * .flattenedElement("flattenedElement")
   * .target("target")
   * .valueKey("valueKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-listtomap.html)
   */
  public interface ListToMapProperty {
    /**
     * A Boolean value to indicate whether the list will be flattened into single items.
     *
     * Specify `true` to flatten the list. The default is `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-listtomap.html#cfn-logs-transformer-listtomap-flatten)
     */
    public fun flatten(): Any? = unwrap(this).getFlatten()

    /**
     * If you set `flatten` to `true` , use `flattenedElement` to specify which element, `first` or
     * `last` , to keep.
     *
     * You must specify this parameter if `flatten` is `true`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-listtomap.html#cfn-logs-transformer-listtomap-flattenedelement)
     */
    public fun flattenedElement(): String? = unwrap(this).getFlattenedElement()

    /**
     * The key of the field to be extracted as keys in the generated map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-listtomap.html#cfn-logs-transformer-listtomap-key)
     */
    public fun key(): String

    /**
     * The key in the log event that has a list of objects that will be converted to a map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-listtomap.html#cfn-logs-transformer-listtomap-source)
     */
    public fun source(): String

    /**
     * The key of the field that will hold the generated map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-listtomap.html#cfn-logs-transformer-listtomap-target)
     */
    public fun target(): String? = unwrap(this).getTarget()

    /**
     * If this is specified, the values that you specify in this parameter will be extracted from
     * the `source` objects and put into the values of the generated map.
     *
     * Otherwise, original objects in the source list will be put into the values of the generated
     * map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-listtomap.html#cfn-logs-transformer-listtomap-valuekey)
     */
    public fun valueKey(): String? = unwrap(this).getValueKey()

    /**
     * A builder for [ListToMapProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param flatten A Boolean value to indicate whether the list will be flattened into single
       * items.
       * Specify `true` to flatten the list. The default is `false`
       */
      public fun flatten(flatten: Boolean)

      /**
       * @param flatten A Boolean value to indicate whether the list will be flattened into single
       * items.
       * Specify `true` to flatten the list. The default is `false`
       */
      public fun flatten(flatten: IResolvable)

      /**
       * @param flattenedElement If you set `flatten` to `true` , use `flattenedElement` to specify
       * which element, `first` or `last` , to keep.
       * You must specify this parameter if `flatten` is `true`
       */
      public fun flattenedElement(flattenedElement: String)

      /**
       * @param key The key of the field to be extracted as keys in the generated map. 
       */
      public fun key(key: String)

      /**
       * @param source The key in the log event that has a list of objects that will be converted to
       * a map. 
       */
      public fun source(source: String)

      /**
       * @param target The key of the field that will hold the generated map.
       */
      public fun target(target: String)

      /**
       * @param valueKey If this is specified, the values that you specify in this parameter will be
       * extracted from the `source` objects and put into the values of the generated map.
       * Otherwise, original objects in the source list will be put into the values of the generated
       * map.
       */
      public fun valueKey(valueKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.ListToMapProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.ListToMapProperty.builder()

      /**
       * @param flatten A Boolean value to indicate whether the list will be flattened into single
       * items.
       * Specify `true` to flatten the list. The default is `false`
       */
      override fun flatten(flatten: Boolean) {
        cdkBuilder.flatten(flatten)
      }

      /**
       * @param flatten A Boolean value to indicate whether the list will be flattened into single
       * items.
       * Specify `true` to flatten the list. The default is `false`
       */
      override fun flatten(flatten: IResolvable) {
        cdkBuilder.flatten(flatten.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param flattenedElement If you set `flatten` to `true` , use `flattenedElement` to specify
       * which element, `first` or `last` , to keep.
       * You must specify this parameter if `flatten` is `true`
       */
      override fun flattenedElement(flattenedElement: String) {
        cdkBuilder.flattenedElement(flattenedElement)
      }

      /**
       * @param key The key of the field to be extracted as keys in the generated map. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param source The key in the log event that has a list of objects that will be converted to
       * a map. 
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      /**
       * @param target The key of the field that will hold the generated map.
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      /**
       * @param valueKey If this is specified, the values that you specify in this parameter will be
       * extracted from the `source` objects and put into the values of the generated map.
       * Otherwise, original objects in the source list will be put into the values of the generated
       * map.
       */
      override fun valueKey(valueKey: String) {
        cdkBuilder.valueKey(valueKey)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.ListToMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ListToMapProperty,
    ) : CdkObject(cdkObject),
        ListToMapProperty {
      /**
       * A Boolean value to indicate whether the list will be flattened into single items.
       *
       * Specify `true` to flatten the list. The default is `false`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-listtomap.html#cfn-logs-transformer-listtomap-flatten)
       */
      override fun flatten(): Any? = unwrap(this).getFlatten()

      /**
       * If you set `flatten` to `true` , use `flattenedElement` to specify which element, `first`
       * or `last` , to keep.
       *
       * You must specify this parameter if `flatten` is `true`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-listtomap.html#cfn-logs-transformer-listtomap-flattenedelement)
       */
      override fun flattenedElement(): String? = unwrap(this).getFlattenedElement()

      /**
       * The key of the field to be extracted as keys in the generated map.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-listtomap.html#cfn-logs-transformer-listtomap-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The key in the log event that has a list of objects that will be converted to a map.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-listtomap.html#cfn-logs-transformer-listtomap-source)
       */
      override fun source(): String = unwrap(this).getSource()

      /**
       * The key of the field that will hold the generated map.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-listtomap.html#cfn-logs-transformer-listtomap-target)
       */
      override fun target(): String? = unwrap(this).getTarget()

      /**
       * If this is specified, the values that you specify in this parameter will be extracted from
       * the `source` objects and put into the values of the generated map.
       *
       * Otherwise, original objects in the source list will be put into the values of the generated
       * map.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-listtomap.html#cfn-logs-transformer-listtomap-valuekey)
       */
      override fun valueKey(): String? = unwrap(this).getValueKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ListToMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ListToMapProperty):
          ListToMapProperty = CdkObjectWrappers.wrap(cdkObject) as? ListToMapProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListToMapProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.ListToMapProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.ListToMapProperty
    }
  }

  /**
   * This processor converts a string to lowercase.
   *
   * For more information about this processor including examples, see
   * [lowerCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-lowerCaseString)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * LowerCaseStringProperty lowerCaseStringProperty = LowerCaseStringProperty.builder()
   * .withKeys(List.of("withKeys"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-lowercasestring.html)
   */
  public interface LowerCaseStringProperty {
    /**
     * The array caontaining the keys of the fields to convert to lowercase.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-lowercasestring.html#cfn-logs-transformer-lowercasestring-withkeys)
     */
    public fun withKeys(): List<String>

    /**
     * A builder for [LowerCaseStringProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param withKeys The array caontaining the keys of the fields to convert to lowercase. 
       */
      public fun withKeys(withKeys: List<String>)

      /**
       * @param withKeys The array caontaining the keys of the fields to convert to lowercase. 
       */
      public fun withKeys(vararg withKeys: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.LowerCaseStringProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.LowerCaseStringProperty.builder()

      /**
       * @param withKeys The array caontaining the keys of the fields to convert to lowercase. 
       */
      override fun withKeys(withKeys: List<String>) {
        cdkBuilder.withKeys(withKeys)
      }

      /**
       * @param withKeys The array caontaining the keys of the fields to convert to lowercase. 
       */
      override fun withKeys(vararg withKeys: String): Unit = withKeys(withKeys.toList())

      public fun build():
          software.amazon.awscdk.services.logs.CfnTransformer.LowerCaseStringProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.LowerCaseStringProperty,
    ) : CdkObject(cdkObject),
        LowerCaseStringProperty {
      /**
       * The array caontaining the keys of the fields to convert to lowercase.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-lowercasestring.html#cfn-logs-transformer-lowercasestring-withkeys)
       */
      override fun withKeys(): List<String> = unwrap(this).getWithKeys()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LowerCaseStringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.LowerCaseStringProperty):
          LowerCaseStringProperty = CdkObjectWrappers.wrap(cdkObject) as? LowerCaseStringProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LowerCaseStringProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.LowerCaseStringProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.LowerCaseStringProperty
    }
  }

  /**
   * This object defines one key that will be moved with the
   * [moveKey](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-moveKey)
   * processor.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * MoveKeyEntryProperty moveKeyEntryProperty = MoveKeyEntryProperty.builder()
   * .source("source")
   * .target("target")
   * // the properties below are optional
   * .overwriteIfExists(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-movekeyentry.html)
   */
  public interface MoveKeyEntryProperty {
    /**
     * Specifies whether to overwrite the value if the destination key already exists.
     *
     * If you omit this, the default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-movekeyentry.html#cfn-logs-transformer-movekeyentry-overwriteifexists)
     */
    public fun overwriteIfExists(): Any? = unwrap(this).getOverwriteIfExists()

    /**
     * The key to move.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-movekeyentry.html#cfn-logs-transformer-movekeyentry-source)
     */
    public fun source(): String

    /**
     * The key to move to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-movekeyentry.html#cfn-logs-transformer-movekeyentry-target)
     */
    public fun target(): String

    /**
     * A builder for [MoveKeyEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the destination key
       * already exists.
       * If you omit this, the default is `false` .
       */
      public fun overwriteIfExists(overwriteIfExists: Boolean)

      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the destination key
       * already exists.
       * If you omit this, the default is `false` .
       */
      public fun overwriteIfExists(overwriteIfExists: IResolvable)

      /**
       * @param source The key to move. 
       */
      public fun source(source: String)

      /**
       * @param target The key to move to. 
       */
      public fun target(target: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.MoveKeyEntryProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.MoveKeyEntryProperty.builder()

      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the destination key
       * already exists.
       * If you omit this, the default is `false` .
       */
      override fun overwriteIfExists(overwriteIfExists: Boolean) {
        cdkBuilder.overwriteIfExists(overwriteIfExists)
      }

      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the destination key
       * already exists.
       * If you omit this, the default is `false` .
       */
      override fun overwriteIfExists(overwriteIfExists: IResolvable) {
        cdkBuilder.overwriteIfExists(overwriteIfExists.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param source The key to move. 
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      /**
       * @param target The key to move to. 
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.MoveKeyEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.MoveKeyEntryProperty,
    ) : CdkObject(cdkObject),
        MoveKeyEntryProperty {
      /**
       * Specifies whether to overwrite the value if the destination key already exists.
       *
       * If you omit this, the default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-movekeyentry.html#cfn-logs-transformer-movekeyentry-overwriteifexists)
       */
      override fun overwriteIfExists(): Any? = unwrap(this).getOverwriteIfExists()

      /**
       * The key to move.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-movekeyentry.html#cfn-logs-transformer-movekeyentry-source)
       */
      override fun source(): String = unwrap(this).getSource()

      /**
       * The key to move to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-movekeyentry.html#cfn-logs-transformer-movekeyentry-target)
       */
      override fun target(): String = unwrap(this).getTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MoveKeyEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.MoveKeyEntryProperty):
          MoveKeyEntryProperty = CdkObjectWrappers.wrap(cdkObject) as? MoveKeyEntryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MoveKeyEntryProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.MoveKeyEntryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.MoveKeyEntryProperty
    }
  }

  /**
   * This processor moves a key from one field to another. The original key is deleted.
   *
   * For more information about this processor including examples, see
   * [moveKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-moveKeys)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * MoveKeysProperty moveKeysProperty = MoveKeysProperty.builder()
   * .entries(List.of(MoveKeyEntryProperty.builder()
   * .source("source")
   * .target("target")
   * // the properties below are optional
   * .overwriteIfExists(false)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-movekeys.html)
   */
  public interface MoveKeysProperty {
    /**
     * An array of objects, where each object contains the information about one key to move.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-movekeys.html#cfn-logs-transformer-movekeys-entries)
     */
    public fun entries(): Any

    /**
     * A builder for [MoveKeysProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to move. 
       */
      public fun entries(entries: IResolvable)

      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to move. 
       */
      public fun entries(entries: List<Any>)

      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to move. 
       */
      public fun entries(vararg entries: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.MoveKeysProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.MoveKeysProperty.builder()

      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to move. 
       */
      override fun entries(entries: IResolvable) {
        cdkBuilder.entries(entries.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to move. 
       */
      override fun entries(entries: List<Any>) {
        cdkBuilder.entries(entries.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to move. 
       */
      override fun entries(vararg entries: Any): Unit = entries(entries.toList())

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.MoveKeysProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.MoveKeysProperty,
    ) : CdkObject(cdkObject),
        MoveKeysProperty {
      /**
       * An array of objects, where each object contains the information about one key to move.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-movekeys.html#cfn-logs-transformer-movekeys-entries)
       */
      override fun entries(): Any = unwrap(this).getEntries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MoveKeysProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.MoveKeysProperty):
          MoveKeysProperty = CdkObjectWrappers.wrap(cdkObject) as? MoveKeysProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MoveKeysProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.MoveKeysProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.MoveKeysProperty
    }
  }

  /**
   * This processor parses CloudFront vended logs, extract fields, and convert them into JSON
   * format.
   *
   * Encoded field values are decoded. Values that are integers and doubles are treated as such. For
   * more information about this processor including examples, see
   * [parseCloudfront](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseCloudfront)
   *
   * For more information about CloudFront log format, see [Configure and use standard logs (access
   * logs)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) .
   *
   * If you use this processor, it must be the first processor in your transformer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * ParseCloudfrontProperty parseCloudfrontProperty = ParseCloudfrontProperty.builder()
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsecloudfront.html)
   */
  public interface ParseCloudfrontProperty {
    /**
     * Omit this parameter and the whole log message will be processed by this processor.
     *
     * No other value than `&#64;message` is allowed for `source` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsecloudfront.html#cfn-logs-transformer-parsecloudfront-source)
     */
    public fun source(): String? = unwrap(this).getSource()

    /**
     * A builder for [ParseCloudfrontProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param source Omit this parameter and the whole log message will be processed by this
       * processor.
       * No other value than `&#64;message` is allowed for `source` .
       */
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.ParseCloudfrontProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.ParseCloudfrontProperty.builder()

      /**
       * @param source Omit this parameter and the whole log message will be processed by this
       * processor.
       * No other value than `&#64;message` is allowed for `source` .
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build():
          software.amazon.awscdk.services.logs.CfnTransformer.ParseCloudfrontProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParseCloudfrontProperty,
    ) : CdkObject(cdkObject),
        ParseCloudfrontProperty {
      /**
       * Omit this parameter and the whole log message will be processed by this processor.
       *
       * No other value than `&#64;message` is allowed for `source` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsecloudfront.html#cfn-logs-transformer-parsecloudfront-source)
       */
      override fun source(): String? = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParseCloudfrontProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParseCloudfrontProperty):
          ParseCloudfrontProperty = CdkObjectWrappers.wrap(cdkObject) as? ParseCloudfrontProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParseCloudfrontProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.ParseCloudfrontProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.ParseCloudfrontProperty
    }
  }

  /**
   * This processor parses log events that are in JSON format.
   *
   * It can extract JSON key-value pairs and place them under a destination that you specify.
   *
   * Additionally, because you must have at least one parse-type processor in a transformer, you can
   * use `ParseJSON` as that processor for JSON-format logs, so that you can also apply other
   * processors, such as mutate processors, to these logs.
   *
   * For more information about this processor including examples, see
   * [parseJSON](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseJSON)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * ParseJSONProperty parseJSONProperty = ParseJSONProperty.builder()
   * .destination("destination")
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsejson.html)
   */
  public interface ParseJSONProperty {
    /**
     * The location to put the parsed key value pair into.
     *
     * If you omit this parameter, it is placed under the root node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsejson.html#cfn-logs-transformer-parsejson-destination)
     */
    public fun destination(): String? = unwrap(this).getDestination()

    /**
     * Path to the field in the log event that will be parsed.
     *
     * Use dot notation to access child fields. For example, `store.book`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsejson.html#cfn-logs-transformer-parsejson-source)
     */
    public fun source(): String? = unwrap(this).getSource()

    /**
     * A builder for [ParseJSONProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination The location to put the parsed key value pair into.
       * If you omit this parameter, it is placed under the root node.
       */
      public fun destination(destination: String)

      /**
       * @param source Path to the field in the log event that will be parsed.
       * Use dot notation to access child fields. For example, `store.book`
       */
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.ParseJSONProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.ParseJSONProperty.builder()

      /**
       * @param destination The location to put the parsed key value pair into.
       * If you omit this parameter, it is placed under the root node.
       */
      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      /**
       * @param source Path to the field in the log event that will be parsed.
       * Use dot notation to access child fields. For example, `store.book`
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.ParseJSONProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParseJSONProperty,
    ) : CdkObject(cdkObject),
        ParseJSONProperty {
      /**
       * The location to put the parsed key value pair into.
       *
       * If you omit this parameter, it is placed under the root node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsejson.html#cfn-logs-transformer-parsejson-destination)
       */
      override fun destination(): String? = unwrap(this).getDestination()

      /**
       * Path to the field in the log event that will be parsed.
       *
       * Use dot notation to access child fields. For example, `store.book`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsejson.html#cfn-logs-transformer-parsejson-source)
       */
      override fun source(): String? = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParseJSONProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParseJSONProperty):
          ParseJSONProperty = CdkObjectWrappers.wrap(cdkObject) as? ParseJSONProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParseJSONProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.ParseJSONProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.ParseJSONProperty
    }
  }

  /**
   * This processor parses a specified field in the original log event into key-value pairs.
   *
   * For more information about this processor including examples, see
   * [parseKeyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parseKeyValue)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * ParseKeyValueProperty parseKeyValueProperty = ParseKeyValueProperty.builder()
   * .destination("destination")
   * .fieldDelimiter("fieldDelimiter")
   * .keyPrefix("keyPrefix")
   * .keyValueDelimiter("keyValueDelimiter")
   * .nonMatchValue("nonMatchValue")
   * .overwriteIfExists(false)
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsekeyvalue.html)
   */
  public interface ParseKeyValueProperty {
    /**
     * The destination field to put the extracted key-value pairs into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsekeyvalue.html#cfn-logs-transformer-parsekeyvalue-destination)
     */
    public fun destination(): String? = unwrap(this).getDestination()

    /**
     * The field delimiter string that is used between key-value pairs in the original log events.
     *
     * If you omit this, the ampersand `&amp;` character is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsekeyvalue.html#cfn-logs-transformer-parsekeyvalue-fielddelimiter)
     */
    public fun fieldDelimiter(): String? = unwrap(this).getFieldDelimiter()

    /**
     * If you want to add a prefix to all transformed keys, specify it here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsekeyvalue.html#cfn-logs-transformer-parsekeyvalue-keyprefix)
     */
    public fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

    /**
     * The delimiter string to use between the key and value in each pair in the transformed log
     * event.
     *
     * If you omit this, the equal `=` character is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsekeyvalue.html#cfn-logs-transformer-parsekeyvalue-keyvaluedelimiter)
     */
    public fun keyValueDelimiter(): String? = unwrap(this).getKeyValueDelimiter()

    /**
     * A value to insert into the value field in the result, when a key-value pair is not
     * successfully split.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsekeyvalue.html#cfn-logs-transformer-parsekeyvalue-nonmatchvalue)
     */
    public fun nonMatchValue(): String? = unwrap(this).getNonMatchValue()

    /**
     * Specifies whether to overwrite the value if the destination key already exists.
     *
     * If you omit this, the default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsekeyvalue.html#cfn-logs-transformer-parsekeyvalue-overwriteifexists)
     */
    public fun overwriteIfExists(): Any? = unwrap(this).getOverwriteIfExists()

    /**
     * Path to the field in the log event that will be parsed.
     *
     * Use dot notation to access child fields. For example, `store.book`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsekeyvalue.html#cfn-logs-transformer-parsekeyvalue-source)
     */
    public fun source(): String? = unwrap(this).getSource()

    /**
     * A builder for [ParseKeyValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination The destination field to put the extracted key-value pairs into.
       */
      public fun destination(destination: String)

      /**
       * @param fieldDelimiter The field delimiter string that is used between key-value pairs in
       * the original log events.
       * If you omit this, the ampersand `&amp;` character is used.
       */
      public fun fieldDelimiter(fieldDelimiter: String)

      /**
       * @param keyPrefix If you want to add a prefix to all transformed keys, specify it here.
       */
      public fun keyPrefix(keyPrefix: String)

      /**
       * @param keyValueDelimiter The delimiter string to use between the key and value in each pair
       * in the transformed log event.
       * If you omit this, the equal `=` character is used.
       */
      public fun keyValueDelimiter(keyValueDelimiter: String)

      /**
       * @param nonMatchValue A value to insert into the value field in the result, when a key-value
       * pair is not successfully split.
       */
      public fun nonMatchValue(nonMatchValue: String)

      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the destination key
       * already exists.
       * If you omit this, the default is `false` .
       */
      public fun overwriteIfExists(overwriteIfExists: Boolean)

      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the destination key
       * already exists.
       * If you omit this, the default is `false` .
       */
      public fun overwriteIfExists(overwriteIfExists: IResolvable)

      /**
       * @param source Path to the field in the log event that will be parsed.
       * Use dot notation to access child fields. For example, `store.book`
       */
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.ParseKeyValueProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.ParseKeyValueProperty.builder()

      /**
       * @param destination The destination field to put the extracted key-value pairs into.
       */
      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      /**
       * @param fieldDelimiter The field delimiter string that is used between key-value pairs in
       * the original log events.
       * If you omit this, the ampersand `&amp;` character is used.
       */
      override fun fieldDelimiter(fieldDelimiter: String) {
        cdkBuilder.fieldDelimiter(fieldDelimiter)
      }

      /**
       * @param keyPrefix If you want to add a prefix to all transformed keys, specify it here.
       */
      override fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
      }

      /**
       * @param keyValueDelimiter The delimiter string to use between the key and value in each pair
       * in the transformed log event.
       * If you omit this, the equal `=` character is used.
       */
      override fun keyValueDelimiter(keyValueDelimiter: String) {
        cdkBuilder.keyValueDelimiter(keyValueDelimiter)
      }

      /**
       * @param nonMatchValue A value to insert into the value field in the result, when a key-value
       * pair is not successfully split.
       */
      override fun nonMatchValue(nonMatchValue: String) {
        cdkBuilder.nonMatchValue(nonMatchValue)
      }

      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the destination key
       * already exists.
       * If you omit this, the default is `false` .
       */
      override fun overwriteIfExists(overwriteIfExists: Boolean) {
        cdkBuilder.overwriteIfExists(overwriteIfExists)
      }

      /**
       * @param overwriteIfExists Specifies whether to overwrite the value if the destination key
       * already exists.
       * If you omit this, the default is `false` .
       */
      override fun overwriteIfExists(overwriteIfExists: IResolvable) {
        cdkBuilder.overwriteIfExists(overwriteIfExists.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param source Path to the field in the log event that will be parsed.
       * Use dot notation to access child fields. For example, `store.book`
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.ParseKeyValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParseKeyValueProperty,
    ) : CdkObject(cdkObject),
        ParseKeyValueProperty {
      /**
       * The destination field to put the extracted key-value pairs into.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsekeyvalue.html#cfn-logs-transformer-parsekeyvalue-destination)
       */
      override fun destination(): String? = unwrap(this).getDestination()

      /**
       * The field delimiter string that is used between key-value pairs in the original log events.
       *
       * If you omit this, the ampersand `&amp;` character is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsekeyvalue.html#cfn-logs-transformer-parsekeyvalue-fielddelimiter)
       */
      override fun fieldDelimiter(): String? = unwrap(this).getFieldDelimiter()

      /**
       * If you want to add a prefix to all transformed keys, specify it here.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsekeyvalue.html#cfn-logs-transformer-parsekeyvalue-keyprefix)
       */
      override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

      /**
       * The delimiter string to use between the key and value in each pair in the transformed log
       * event.
       *
       * If you omit this, the equal `=` character is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsekeyvalue.html#cfn-logs-transformer-parsekeyvalue-keyvaluedelimiter)
       */
      override fun keyValueDelimiter(): String? = unwrap(this).getKeyValueDelimiter()

      /**
       * A value to insert into the value field in the result, when a key-value pair is not
       * successfully split.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsekeyvalue.html#cfn-logs-transformer-parsekeyvalue-nonmatchvalue)
       */
      override fun nonMatchValue(): String? = unwrap(this).getNonMatchValue()

      /**
       * Specifies whether to overwrite the value if the destination key already exists.
       *
       * If you omit this, the default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsekeyvalue.html#cfn-logs-transformer-parsekeyvalue-overwriteifexists)
       */
      override fun overwriteIfExists(): Any? = unwrap(this).getOverwriteIfExists()

      /**
       * Path to the field in the log event that will be parsed.
       *
       * Use dot notation to access child fields. For example, `store.book`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsekeyvalue.html#cfn-logs-transformer-parsekeyvalue-source)
       */
      override fun source(): String? = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParseKeyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParseKeyValueProperty):
          ParseKeyValueProperty = CdkObjectWrappers.wrap(cdkObject) as? ParseKeyValueProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParseKeyValueProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.ParseKeyValueProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.ParseKeyValueProperty
    }
  }

  /**
   * Use this processor to parse RDS for PostgreSQL vended logs, extract fields, and and convert
   * them into a JSON format.
   *
   * This processor always processes the entire log event message. For more information about this
   * processor including examples, see
   * [parsePostGres](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parsePostGres)
   * .
   *
   * For more information about RDS for PostgreSQL log format, see [RDS for PostgreSQL database log
   * filesTCP flag
   * sequence](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.Concepts.PostgreSQL.html#USER_LogAccess.Concepts.PostgreSQL.Log_Format.log-line-prefix)
   * .
   *
   *
   * If you use this processor, it must be the first processor in your transformer.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * ParsePostgresProperty parsePostgresProperty = ParsePostgresProperty.builder()
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsepostgres.html)
   */
  public interface ParsePostgresProperty {
    /**
     * Omit this parameter and the whole log message will be processed by this processor.
     *
     * No other value than `&#64;message` is allowed for `source` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsepostgres.html#cfn-logs-transformer-parsepostgres-source)
     */
    public fun source(): String? = unwrap(this).getSource()

    /**
     * A builder for [ParsePostgresProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param source Omit this parameter and the whole log message will be processed by this
       * processor.
       * No other value than `&#64;message` is allowed for `source` .
       */
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.ParsePostgresProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.ParsePostgresProperty.builder()

      /**
       * @param source Omit this parameter and the whole log message will be processed by this
       * processor.
       * No other value than `&#64;message` is allowed for `source` .
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.ParsePostgresProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParsePostgresProperty,
    ) : CdkObject(cdkObject),
        ParsePostgresProperty {
      /**
       * Omit this parameter and the whole log message will be processed by this processor.
       *
       * No other value than `&#64;message` is allowed for `source` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsepostgres.html#cfn-logs-transformer-parsepostgres-source)
       */
      override fun source(): String? = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParsePostgresProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParsePostgresProperty):
          ParsePostgresProperty = CdkObjectWrappers.wrap(cdkObject) as? ParsePostgresProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParsePostgresProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.ParsePostgresProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.ParsePostgresProperty
    }
  }

  /**
   * Use this processor to parse Route 53 vended logs, extract fields, and and convert them into a
   * JSON format.
   *
   * This processor always processes the entire log event message. For more information about this
   * processor including examples, see
   * [parseRoute53](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseRoute53)
   * .
   *
   *
   * If you use this processor, it must be the first processor in your transformer.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * ParseRoute53Property parseRoute53Property = ParseRoute53Property.builder()
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parseroute53.html)
   */
  public interface ParseRoute53Property {
    /**
     * Omit this parameter and the whole log message will be processed by this processor.
     *
     * No other value than `&#64;message` is allowed for `source` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parseroute53.html#cfn-logs-transformer-parseroute53-source)
     */
    public fun source(): String? = unwrap(this).getSource()

    /**
     * A builder for [ParseRoute53Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param source Omit this parameter and the whole log message will be processed by this
       * processor.
       * No other value than `&#64;message` is allowed for `source` .
       */
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.ParseRoute53Property.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.ParseRoute53Property.builder()

      /**
       * @param source Omit this parameter and the whole log message will be processed by this
       * processor.
       * No other value than `&#64;message` is allowed for `source` .
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.ParseRoute53Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParseRoute53Property,
    ) : CdkObject(cdkObject),
        ParseRoute53Property {
      /**
       * Omit this parameter and the whole log message will be processed by this processor.
       *
       * No other value than `&#64;message` is allowed for `source` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parseroute53.html#cfn-logs-transformer-parseroute53-source)
       */
      override fun source(): String? = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParseRoute53Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParseRoute53Property):
          ParseRoute53Property = CdkObjectWrappers.wrap(cdkObject) as? ParseRoute53Property ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParseRoute53Property):
          software.amazon.awscdk.services.logs.CfnTransformer.ParseRoute53Property = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.ParseRoute53Property
    }
  }

  /**
   * This processor converts logs into [Open Cybersecurity Schema Framework
   * (OCSF)](https://docs.aws.amazon.com/https://ocsf.io) events.
   *
   * For more information about this processor including examples, see
   * [parseToOSCF](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parseToOCSF)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * ParseToOCSFProperty parseToOCSFProperty = ParseToOCSFProperty.builder()
   * .eventSource("eventSource")
   * .ocsfVersion("ocsfVersion")
   * // the properties below are optional
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsetoocsf.html)
   */
  public interface ParseToOCSFProperty {
    /**
     * Specify the service or process that produces the log events that will be converted with this
     * processor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsetoocsf.html#cfn-logs-transformer-parsetoocsf-eventsource)
     */
    public fun eventSource(): String

    /**
     * Specify which version of the OCSF schema to use for the transformed log events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsetoocsf.html#cfn-logs-transformer-parsetoocsf-ocsfversion)
     */
    public fun ocsfVersion(): String

    /**
     * The path to the field in the log event that you want to parse.
     *
     * If you omit this value, the whole log message is parsed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsetoocsf.html#cfn-logs-transformer-parsetoocsf-source)
     */
    public fun source(): String? = unwrap(this).getSource()

    /**
     * A builder for [ParseToOCSFProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventSource Specify the service or process that produces the log events that will be
       * converted with this processor. 
       */
      public fun eventSource(eventSource: String)

      /**
       * @param ocsfVersion Specify which version of the OCSF schema to use for the transformed log
       * events. 
       */
      public fun ocsfVersion(ocsfVersion: String)

      /**
       * @param source The path to the field in the log event that you want to parse.
       * If you omit this value, the whole log message is parsed.
       */
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.ParseToOCSFProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.ParseToOCSFProperty.builder()

      /**
       * @param eventSource Specify the service or process that produces the log events that will be
       * converted with this processor. 
       */
      override fun eventSource(eventSource: String) {
        cdkBuilder.eventSource(eventSource)
      }

      /**
       * @param ocsfVersion Specify which version of the OCSF schema to use for the transformed log
       * events. 
       */
      override fun ocsfVersion(ocsfVersion: String) {
        cdkBuilder.ocsfVersion(ocsfVersion)
      }

      /**
       * @param source The path to the field in the log event that you want to parse.
       * If you omit this value, the whole log message is parsed.
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.ParseToOCSFProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParseToOCSFProperty,
    ) : CdkObject(cdkObject),
        ParseToOCSFProperty {
      /**
       * Specify the service or process that produces the log events that will be converted with
       * this processor.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsetoocsf.html#cfn-logs-transformer-parsetoocsf-eventsource)
       */
      override fun eventSource(): String = unwrap(this).getEventSource()

      /**
       * Specify which version of the OCSF schema to use for the transformed log events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsetoocsf.html#cfn-logs-transformer-parsetoocsf-ocsfversion)
       */
      override fun ocsfVersion(): String = unwrap(this).getOcsfVersion()

      /**
       * The path to the field in the log event that you want to parse.
       *
       * If you omit this value, the whole log message is parsed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsetoocsf.html#cfn-logs-transformer-parsetoocsf-source)
       */
      override fun source(): String? = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParseToOCSFProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParseToOCSFProperty):
          ParseToOCSFProperty = CdkObjectWrappers.wrap(cdkObject) as? ParseToOCSFProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParseToOCSFProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.ParseToOCSFProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.ParseToOCSFProperty
    }
  }

  /**
   * Use this processor to parse Amazon VPC vended logs, extract fields, and and convert them into a
   * JSON format.
   *
   * This processor always processes the entire log event message.
   *
   * This processor doesn't support custom log formats, such as NAT gateway logs. For more
   * information about custom log formats in Amazon VPC, see
   * [parseVPC](https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs-records-examples.html#flow-log-example-tcp-flag)
   * For more information about this processor including examples, see
   * [parseVPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parseVPC)
   * .
   *
   *
   * If you use this processor, it must be the first processor in your transformer.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * ParseVPCProperty parseVPCProperty = ParseVPCProperty.builder()
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsevpc.html)
   */
  public interface ParseVPCProperty {
    /**
     * Omit this parameter and the whole log message will be processed by this processor.
     *
     * No other value than `&#64;message` is allowed for `source` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsevpc.html#cfn-logs-transformer-parsevpc-source)
     */
    public fun source(): String? = unwrap(this).getSource()

    /**
     * A builder for [ParseVPCProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param source Omit this parameter and the whole log message will be processed by this
       * processor.
       * No other value than `&#64;message` is allowed for `source` .
       */
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.ParseVPCProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.ParseVPCProperty.builder()

      /**
       * @param source Omit this parameter and the whole log message will be processed by this
       * processor.
       * No other value than `&#64;message` is allowed for `source` .
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.ParseVPCProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParseVPCProperty,
    ) : CdkObject(cdkObject),
        ParseVPCProperty {
      /**
       * Omit this parameter and the whole log message will be processed by this processor.
       *
       * No other value than `&#64;message` is allowed for `source` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsevpc.html#cfn-logs-transformer-parsevpc-source)
       */
      override fun source(): String? = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParseVPCProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParseVPCProperty):
          ParseVPCProperty = CdkObjectWrappers.wrap(cdkObject) as? ParseVPCProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParseVPCProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.ParseVPCProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.ParseVPCProperty
    }
  }

  /**
   * Use this processor to parse AWS WAF vended logs, extract fields, and and convert them into a
   * JSON format.
   *
   * This processor always processes the entire log event message. For more information about this
   * processor including examples, see
   * [parseWAF](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parsePostGres)
   * .
   *
   * For more information about AWS WAF log format, see [Log examples for web ACL
   * traffic](https://docs.aws.amazon.com/waf/latest/developerguide/logging-examples.html) .
   *
   *
   * If you use this processor, it must be the first processor in your transformer.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * ParseWAFProperty parseWAFProperty = ParseWAFProperty.builder()
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsewaf.html)
   */
  public interface ParseWAFProperty {
    /**
     * Omit this parameter and the whole log message will be processed by this processor.
     *
     * No other value than `&#64;message` is allowed for `source` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsewaf.html#cfn-logs-transformer-parsewaf-source)
     */
    public fun source(): String? = unwrap(this).getSource()

    /**
     * A builder for [ParseWAFProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param source Omit this parameter and the whole log message will be processed by this
       * processor.
       * No other value than `&#64;message` is allowed for `source` .
       */
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.ParseWAFProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.ParseWAFProperty.builder()

      /**
       * @param source Omit this parameter and the whole log message will be processed by this
       * processor.
       * No other value than `&#64;message` is allowed for `source` .
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.ParseWAFProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParseWAFProperty,
    ) : CdkObject(cdkObject),
        ParseWAFProperty {
      /**
       * Omit this parameter and the whole log message will be processed by this processor.
       *
       * No other value than `&#64;message` is allowed for `source` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-parsewaf.html#cfn-logs-transformer-parsewaf-source)
       */
      override fun source(): String? = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParseWAFProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ParseWAFProperty):
          ParseWAFProperty = CdkObjectWrappers.wrap(cdkObject) as? ParseWAFProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParseWAFProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.ParseWAFProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.ParseWAFProperty
    }
  }

  /**
   * This structure contains the information about one processor in a log transformer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * ProcessorProperty processorProperty = ProcessorProperty.builder()
   * .addKeys(AddKeysProperty.builder()
   * .entries(List.of(AddKeyEntryProperty.builder()
   * .key("key")
   * .value("value")
   * // the properties below are optional
   * .overwriteIfExists(false)
   * .build()))
   * .build())
   * .copyValue(CopyValueProperty.builder()
   * .entries(List.of(CopyValueEntryProperty.builder()
   * .source("source")
   * .target("target")
   * // the properties below are optional
   * .overwriteIfExists(false)
   * .build()))
   * .build())
   * .csv(CsvProperty.builder()
   * .columns(List.of("columns"))
   * .delimiter("delimiter")
   * .quoteCharacter("quoteCharacter")
   * .source("source")
   * .build())
   * .dateTimeConverter(DateTimeConverterProperty.builder()
   * .matchPatterns(List.of("matchPatterns"))
   * .source("source")
   * .target("target")
   * // the properties below are optional
   * .locale("locale")
   * .sourceTimezone("sourceTimezone")
   * .targetFormat("targetFormat")
   * .targetTimezone("targetTimezone")
   * .build())
   * .deleteKeys(DeleteKeysProperty.builder()
   * .withKeys(List.of("withKeys"))
   * .build())
   * .grok(GrokProperty.builder()
   * .match("match")
   * // the properties below are optional
   * .source("source")
   * .build())
   * .listToMap(ListToMapProperty.builder()
   * .key("key")
   * .source("source")
   * // the properties below are optional
   * .flatten(false)
   * .flattenedElement("flattenedElement")
   * .target("target")
   * .valueKey("valueKey")
   * .build())
   * .lowerCaseString(LowerCaseStringProperty.builder()
   * .withKeys(List.of("withKeys"))
   * .build())
   * .moveKeys(MoveKeysProperty.builder()
   * .entries(List.of(MoveKeyEntryProperty.builder()
   * .source("source")
   * .target("target")
   * // the properties below are optional
   * .overwriteIfExists(false)
   * .build()))
   * .build())
   * .parseCloudfront(ParseCloudfrontProperty.builder()
   * .source("source")
   * .build())
   * .parseJson(ParseJSONProperty.builder()
   * .destination("destination")
   * .source("source")
   * .build())
   * .parseKeyValue(ParseKeyValueProperty.builder()
   * .destination("destination")
   * .fieldDelimiter("fieldDelimiter")
   * .keyPrefix("keyPrefix")
   * .keyValueDelimiter("keyValueDelimiter")
   * .nonMatchValue("nonMatchValue")
   * .overwriteIfExists(false)
   * .source("source")
   * .build())
   * .parsePostgres(ParsePostgresProperty.builder()
   * .source("source")
   * .build())
   * .parseRoute53(ParseRoute53Property.builder()
   * .source("source")
   * .build())
   * .parseToOcsf(ParseToOCSFProperty.builder()
   * .eventSource("eventSource")
   * .ocsfVersion("ocsfVersion")
   * // the properties below are optional
   * .source("source")
   * .build())
   * .parseVpc(ParseVPCProperty.builder()
   * .source("source")
   * .build())
   * .parseWaf(ParseWAFProperty.builder()
   * .source("source")
   * .build())
   * .renameKeys(RenameKeysProperty.builder()
   * .entries(List.of(RenameKeyEntryProperty.builder()
   * .key("key")
   * .renameTo("renameTo")
   * // the properties below are optional
   * .overwriteIfExists(false)
   * .build()))
   * .build())
   * .splitString(SplitStringProperty.builder()
   * .entries(List.of(SplitStringEntryProperty.builder()
   * .delimiter("delimiter")
   * .source("source")
   * .build()))
   * .build())
   * .substituteString(SubstituteStringProperty.builder()
   * .entries(List.of(SubstituteStringEntryProperty.builder()
   * .from("from")
   * .source("source")
   * .to("to")
   * .build()))
   * .build())
   * .trimString(TrimStringProperty.builder()
   * .withKeys(List.of("withKeys"))
   * .build())
   * .typeConverter(TypeConverterProperty.builder()
   * .entries(List.of(TypeConverterEntryProperty.builder()
   * .key("key")
   * .type("type")
   * .build()))
   * .build())
   * .upperCaseString(UpperCaseStringProperty.builder()
   * .withKeys(List.of("withKeys"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html)
   */
  public interface ProcessorProperty {
    /**
     * Use this parameter to include the
     * [addKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-addKeys)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-addkeys)
     */
    public fun addKeys(): Any? = unwrap(this).getAddKeys()

    /**
     * Use this parameter to include the
     * [copyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-copyValue)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-copyvalue)
     */
    public fun copyValue(): Any? = unwrap(this).getCopyValue()

    /**
     * Use this parameter to include the
     * [CSV](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-CSV)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-csv)
     */
    public fun csv(): Any? = unwrap(this).getCsv()

    /**
     * Use this parameter to include the
     * [datetimeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-datetimeConverter)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-datetimeconverter)
     */
    public fun dateTimeConverter(): Any? = unwrap(this).getDateTimeConverter()

    /**
     * Use this parameter to include the
     * [deleteKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-deleteKeys)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-deletekeys)
     */
    public fun deleteKeys(): Any? = unwrap(this).getDeleteKeys()

    /**
     * Use this parameter to include the
     * [grok](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-grok)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-grok)
     */
    public fun grok(): Any? = unwrap(this).getGrok()

    /**
     * Use this parameter to include the
     * [listToMap](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-listToMap)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-listtomap)
     */
    public fun listToMap(): Any? = unwrap(this).getListToMap()

    /**
     * Use this parameter to include the
     * [lowerCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-lowerCaseString)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-lowercasestring)
     */
    public fun lowerCaseString(): Any? = unwrap(this).getLowerCaseString()

    /**
     * Use this parameter to include the
     * [moveKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-moveKeys)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-movekeys)
     */
    public fun moveKeys(): Any? = unwrap(this).getMoveKeys()

    /**
     * Use this parameter to include the
     * [parseCloudfront](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseCloudfront)
     * processor in your transformer.
     *
     * If you use this processor, it must be the first processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parsecloudfront)
     */
    public fun parseCloudfront(): Any? = unwrap(this).getParseCloudfront()

    /**
     * Use this parameter to include the
     * [parseJSON](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseJSON)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parsejson)
     */
    public fun parseJson(): Any? = unwrap(this).getParseJson()

    /**
     * Use this parameter to include the
     * [parseKeyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseKeyValue)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parsekeyvalue)
     */
    public fun parseKeyValue(): Any? = unwrap(this).getParseKeyValue()

    /**
     * Use this parameter to include the
     * [parsePostGres](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parsePostGres)
     * processor in your transformer.
     *
     * If you use this processor, it must be the first processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parsepostgres)
     */
    public fun parsePostgres(): Any? = unwrap(this).getParsePostgres()

    /**
     * Use this parameter to include the
     * [parseRoute53](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseRoute53)
     * processor in your transformer.
     *
     * If you use this processor, it must be the first processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parseroute53)
     */
    public fun parseRoute53(): Any? = unwrap(this).getParseRoute53()

    /**
     * Use this parameter to convert logs into Open Cybersecurity Schema (OCSF) format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parsetoocsf)
     */
    public fun parseToOcsf(): Any? = unwrap(this).getParseToOcsf()

    /**
     * Use this parameter to include the
     * [parseVPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseVPC)
     * processor in your transformer.
     *
     * If you use this processor, it must be the first processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parsevpc)
     */
    public fun parseVpc(): Any? = unwrap(this).getParseVpc()

    /**
     * Use this parameter to include the
     * [parseWAF](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parseWAF)
     * processor in your transformer.
     *
     * If you use this processor, it must be the first processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parsewaf)
     */
    public fun parseWaf(): Any? = unwrap(this).getParseWaf()

    /**
     * Use this parameter to include the
     * [renameKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-renameKeys)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-renamekeys)
     */
    public fun renameKeys(): Any? = unwrap(this).getRenameKeys()

    /**
     * Use this parameter to include the
     * [splitString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-splitString)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-splitstring)
     */
    public fun splitString(): Any? = unwrap(this).getSplitString()

    /**
     * Use this parameter to include the
     * [substituteString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-substituteString)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-substitutestring)
     */
    public fun substituteString(): Any? = unwrap(this).getSubstituteString()

    /**
     * Use this parameter to include the
     * [trimString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-trimString)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-trimstring)
     */
    public fun trimString(): Any? = unwrap(this).getTrimString()

    /**
     * Use this parameter to include the
     * [typeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-typeConverter)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-typeconverter)
     */
    public fun typeConverter(): Any? = unwrap(this).getTypeConverter()

    /**
     * Use this parameter to include the
     * [upperCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-upperCaseString)
     * processor in your transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-uppercasestring)
     */
    public fun upperCaseString(): Any? = unwrap(this).getUpperCaseString()

    /**
     * A builder for [ProcessorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addKeys Use this parameter to include the
       * [addKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-addKeys)
       * processor in your transformer.
       */
      public fun addKeys(addKeys: IResolvable)

      /**
       * @param addKeys Use this parameter to include the
       * [addKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-addKeys)
       * processor in your transformer.
       */
      public fun addKeys(addKeys: AddKeysProperty)

      /**
       * @param addKeys Use this parameter to include the
       * [addKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-addKeys)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4dd9fd958293868212a0071639cbfb25f0bc807b00f4b4c3375fb01738e183a5")
      public fun addKeys(addKeys: AddKeysProperty.Builder.() -> Unit)

      /**
       * @param copyValue Use this parameter to include the
       * [copyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-copyValue)
       * processor in your transformer.
       */
      public fun copyValue(copyValue: IResolvable)

      /**
       * @param copyValue Use this parameter to include the
       * [copyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-copyValue)
       * processor in your transformer.
       */
      public fun copyValue(copyValue: CopyValueProperty)

      /**
       * @param copyValue Use this parameter to include the
       * [copyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-copyValue)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9073912507a5474462ace0b2d09244ecd993c9827d114a62e025b7ef6a4a96d")
      public fun copyValue(copyValue: CopyValueProperty.Builder.() -> Unit)

      /**
       * @param csv Use this parameter to include the
       * [CSV](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-CSV)
       * processor in your transformer.
       */
      public fun csv(csv: IResolvable)

      /**
       * @param csv Use this parameter to include the
       * [CSV](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-CSV)
       * processor in your transformer.
       */
      public fun csv(csv: CsvProperty)

      /**
       * @param csv Use this parameter to include the
       * [CSV](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-CSV)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("002a8e749c730b15678e1a2efcbbe1a61b4004a516af94573d3e8aaef9abb88f")
      public fun csv(csv: CsvProperty.Builder.() -> Unit)

      /**
       * @param dateTimeConverter Use this parameter to include the
       * [datetimeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-datetimeConverter)
       * processor in your transformer.
       */
      public fun dateTimeConverter(dateTimeConverter: IResolvable)

      /**
       * @param dateTimeConverter Use this parameter to include the
       * [datetimeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-datetimeConverter)
       * processor in your transformer.
       */
      public fun dateTimeConverter(dateTimeConverter: DateTimeConverterProperty)

      /**
       * @param dateTimeConverter Use this parameter to include the
       * [datetimeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-datetimeConverter)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fb371bca13030d56c1f770bbd1fd5588464b47d941af11bab1ab75feb28f044")
      public fun dateTimeConverter(dateTimeConverter: DateTimeConverterProperty.Builder.() -> Unit)

      /**
       * @param deleteKeys Use this parameter to include the
       * [deleteKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-deleteKeys)
       * processor in your transformer.
       */
      public fun deleteKeys(deleteKeys: IResolvable)

      /**
       * @param deleteKeys Use this parameter to include the
       * [deleteKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-deleteKeys)
       * processor in your transformer.
       */
      public fun deleteKeys(deleteKeys: DeleteKeysProperty)

      /**
       * @param deleteKeys Use this parameter to include the
       * [deleteKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-deleteKeys)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26cf7198c441ee0935ff536e9170cfcd7ec77735ccf8c63c82eb80f5d679dca9")
      public fun deleteKeys(deleteKeys: DeleteKeysProperty.Builder.() -> Unit)

      /**
       * @param grok Use this parameter to include the
       * [grok](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-grok)
       * processor in your transformer.
       */
      public fun grok(grok: IResolvable)

      /**
       * @param grok Use this parameter to include the
       * [grok](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-grok)
       * processor in your transformer.
       */
      public fun grok(grok: GrokProperty)

      /**
       * @param grok Use this parameter to include the
       * [grok](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-grok)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64d6211faa2cacfc74fa8fb4cf01dbc25b6ef9e68deb311620f50eeba6a8e9d7")
      public fun grok(grok: GrokProperty.Builder.() -> Unit)

      /**
       * @param listToMap Use this parameter to include the
       * [listToMap](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-listToMap)
       * processor in your transformer.
       */
      public fun listToMap(listToMap: IResolvable)

      /**
       * @param listToMap Use this parameter to include the
       * [listToMap](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-listToMap)
       * processor in your transformer.
       */
      public fun listToMap(listToMap: ListToMapProperty)

      /**
       * @param listToMap Use this parameter to include the
       * [listToMap](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-listToMap)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3b95cacb6f7e3d38b861b97e6a575c1bcf0ee50fcb97c3d7669cadec4e3ee77")
      public fun listToMap(listToMap: ListToMapProperty.Builder.() -> Unit)

      /**
       * @param lowerCaseString Use this parameter to include the
       * [lowerCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-lowerCaseString)
       * processor in your transformer.
       */
      public fun lowerCaseString(lowerCaseString: IResolvable)

      /**
       * @param lowerCaseString Use this parameter to include the
       * [lowerCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-lowerCaseString)
       * processor in your transformer.
       */
      public fun lowerCaseString(lowerCaseString: LowerCaseStringProperty)

      /**
       * @param lowerCaseString Use this parameter to include the
       * [lowerCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-lowerCaseString)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0fd1360801bb1190860b5d1ba296e97b91234c9c70c83ef6151f7176e8faa43")
      public fun lowerCaseString(lowerCaseString: LowerCaseStringProperty.Builder.() -> Unit)

      /**
       * @param moveKeys Use this parameter to include the
       * [moveKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-moveKeys)
       * processor in your transformer.
       */
      public fun moveKeys(moveKeys: IResolvable)

      /**
       * @param moveKeys Use this parameter to include the
       * [moveKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-moveKeys)
       * processor in your transformer.
       */
      public fun moveKeys(moveKeys: MoveKeysProperty)

      /**
       * @param moveKeys Use this parameter to include the
       * [moveKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-moveKeys)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e859d4f0a63419d30de941e7145fe92f43f9aea2f45caf28d18eea5c1dd6d503")
      public fun moveKeys(moveKeys: MoveKeysProperty.Builder.() -> Unit)

      /**
       * @param parseCloudfront Use this parameter to include the
       * [parseCloudfront](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseCloudfront)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      public fun parseCloudfront(parseCloudfront: IResolvable)

      /**
       * @param parseCloudfront Use this parameter to include the
       * [parseCloudfront](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseCloudfront)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      public fun parseCloudfront(parseCloudfront: ParseCloudfrontProperty)

      /**
       * @param parseCloudfront Use this parameter to include the
       * [parseCloudfront](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseCloudfront)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("594189c6a3bf569e6bb4ed85c84c3cc66cb4cadcfca61f54080ce023d2e9c2bf")
      public fun parseCloudfront(parseCloudfront: ParseCloudfrontProperty.Builder.() -> Unit)

      /**
       * @param parseJson Use this parameter to include the
       * [parseJSON](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseJSON)
       * processor in your transformer.
       */
      public fun parseJson(parseJson: IResolvable)

      /**
       * @param parseJson Use this parameter to include the
       * [parseJSON](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseJSON)
       * processor in your transformer.
       */
      public fun parseJson(parseJson: ParseJSONProperty)

      /**
       * @param parseJson Use this parameter to include the
       * [parseJSON](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseJSON)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("772b85e57dff7a477c156c22d4a95e9e95eb8ac949b1d5021dc8e08477274491")
      public fun parseJson(parseJson: ParseJSONProperty.Builder.() -> Unit)

      /**
       * @param parseKeyValue Use this parameter to include the
       * [parseKeyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseKeyValue)
       * processor in your transformer.
       */
      public fun parseKeyValue(parseKeyValue: IResolvable)

      /**
       * @param parseKeyValue Use this parameter to include the
       * [parseKeyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseKeyValue)
       * processor in your transformer.
       */
      public fun parseKeyValue(parseKeyValue: ParseKeyValueProperty)

      /**
       * @param parseKeyValue Use this parameter to include the
       * [parseKeyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseKeyValue)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0de86dba468d3a0e90022e462d01f1f6daab1859e500be6c7cdd934a045d98a7")
      public fun parseKeyValue(parseKeyValue: ParseKeyValueProperty.Builder.() -> Unit)

      /**
       * @param parsePostgres Use this parameter to include the
       * [parsePostGres](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parsePostGres)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      public fun parsePostgres(parsePostgres: IResolvable)

      /**
       * @param parsePostgres Use this parameter to include the
       * [parsePostGres](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parsePostGres)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      public fun parsePostgres(parsePostgres: ParsePostgresProperty)

      /**
       * @param parsePostgres Use this parameter to include the
       * [parsePostGres](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parsePostGres)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e24085864bb4f2b96a83d1b3dbf246e78f5a6823e4bd77939454b92035200a7")
      public fun parsePostgres(parsePostgres: ParsePostgresProperty.Builder.() -> Unit)

      /**
       * @param parseRoute53 Use this parameter to include the
       * [parseRoute53](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseRoute53)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      public fun parseRoute53(parseRoute53: IResolvable)

      /**
       * @param parseRoute53 Use this parameter to include the
       * [parseRoute53](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseRoute53)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      public fun parseRoute53(parseRoute53: ParseRoute53Property)

      /**
       * @param parseRoute53 Use this parameter to include the
       * [parseRoute53](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseRoute53)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1413a69a1403ed7c2be0030734e3bc790a442df11ec48a3e12d9e99050680ca8")
      public fun parseRoute53(parseRoute53: ParseRoute53Property.Builder.() -> Unit)

      /**
       * @param parseToOcsf Use this parameter to convert logs into Open Cybersecurity Schema (OCSF)
       * format.
       */
      public fun parseToOcsf(parseToOcsf: IResolvable)

      /**
       * @param parseToOcsf Use this parameter to convert logs into Open Cybersecurity Schema (OCSF)
       * format.
       */
      public fun parseToOcsf(parseToOcsf: ParseToOCSFProperty)

      /**
       * @param parseToOcsf Use this parameter to convert logs into Open Cybersecurity Schema (OCSF)
       * format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec0eddfff594e53999bd50569b6d17cce238b7a28c44310d138b6810d3c16176")
      public fun parseToOcsf(parseToOcsf: ParseToOCSFProperty.Builder.() -> Unit)

      /**
       * @param parseVpc Use this parameter to include the
       * [parseVPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseVPC)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      public fun parseVpc(parseVpc: IResolvable)

      /**
       * @param parseVpc Use this parameter to include the
       * [parseVPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseVPC)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      public fun parseVpc(parseVpc: ParseVPCProperty)

      /**
       * @param parseVpc Use this parameter to include the
       * [parseVPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseVPC)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("554fef1d0a6836880c4ace6476bca5572d67f89521bbd7c37aa6549de5e3ff31")
      public fun parseVpc(parseVpc: ParseVPCProperty.Builder.() -> Unit)

      /**
       * @param parseWaf Use this parameter to include the
       * [parseWAF](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parseWAF)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      public fun parseWaf(parseWaf: IResolvable)

      /**
       * @param parseWaf Use this parameter to include the
       * [parseWAF](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parseWAF)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      public fun parseWaf(parseWaf: ParseWAFProperty)

      /**
       * @param parseWaf Use this parameter to include the
       * [parseWAF](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parseWAF)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd7f35e082b4b785bd0cceffbdea90eac37bd648cdf2ac11bcf1972905633e00")
      public fun parseWaf(parseWaf: ParseWAFProperty.Builder.() -> Unit)

      /**
       * @param renameKeys Use this parameter to include the
       * [renameKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-renameKeys)
       * processor in your transformer.
       */
      public fun renameKeys(renameKeys: IResolvable)

      /**
       * @param renameKeys Use this parameter to include the
       * [renameKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-renameKeys)
       * processor in your transformer.
       */
      public fun renameKeys(renameKeys: RenameKeysProperty)

      /**
       * @param renameKeys Use this parameter to include the
       * [renameKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-renameKeys)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49f6165a6b60c158d8c14325912aa917ebfb54234bdcc2ea232c725ffbdef092")
      public fun renameKeys(renameKeys: RenameKeysProperty.Builder.() -> Unit)

      /**
       * @param splitString Use this parameter to include the
       * [splitString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-splitString)
       * processor in your transformer.
       */
      public fun splitString(splitString: IResolvable)

      /**
       * @param splitString Use this parameter to include the
       * [splitString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-splitString)
       * processor in your transformer.
       */
      public fun splitString(splitString: SplitStringProperty)

      /**
       * @param splitString Use this parameter to include the
       * [splitString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-splitString)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d7c28f563287b91967ed706dbf18fa6a86b33b2698969303be82617115b3eb0")
      public fun splitString(splitString: SplitStringProperty.Builder.() -> Unit)

      /**
       * @param substituteString Use this parameter to include the
       * [substituteString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-substituteString)
       * processor in your transformer.
       */
      public fun substituteString(substituteString: IResolvable)

      /**
       * @param substituteString Use this parameter to include the
       * [substituteString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-substituteString)
       * processor in your transformer.
       */
      public fun substituteString(substituteString: SubstituteStringProperty)

      /**
       * @param substituteString Use this parameter to include the
       * [substituteString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-substituteString)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ac0bd1bd745c65948abff807d55090c8b36f7f66d468a5732c15cede1269751")
      public fun substituteString(substituteString: SubstituteStringProperty.Builder.() -> Unit)

      /**
       * @param trimString Use this parameter to include the
       * [trimString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-trimString)
       * processor in your transformer.
       */
      public fun trimString(trimString: IResolvable)

      /**
       * @param trimString Use this parameter to include the
       * [trimString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-trimString)
       * processor in your transformer.
       */
      public fun trimString(trimString: TrimStringProperty)

      /**
       * @param trimString Use this parameter to include the
       * [trimString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-trimString)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b3ac807a54a6cd5868f087f7c158232d21bac9614ac587ab36bf76fd788b0e3")
      public fun trimString(trimString: TrimStringProperty.Builder.() -> Unit)

      /**
       * @param typeConverter Use this parameter to include the
       * [typeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-typeConverter)
       * processor in your transformer.
       */
      public fun typeConverter(typeConverter: IResolvable)

      /**
       * @param typeConverter Use this parameter to include the
       * [typeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-typeConverter)
       * processor in your transformer.
       */
      public fun typeConverter(typeConverter: TypeConverterProperty)

      /**
       * @param typeConverter Use this parameter to include the
       * [typeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-typeConverter)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bec58cb926d7db7061ebbaceb2aff209b57bc23b0110f5f4154a2728d46f80e")
      public fun typeConverter(typeConverter: TypeConverterProperty.Builder.() -> Unit)

      /**
       * @param upperCaseString Use this parameter to include the
       * [upperCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-upperCaseString)
       * processor in your transformer.
       */
      public fun upperCaseString(upperCaseString: IResolvable)

      /**
       * @param upperCaseString Use this parameter to include the
       * [upperCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-upperCaseString)
       * processor in your transformer.
       */
      public fun upperCaseString(upperCaseString: UpperCaseStringProperty)

      /**
       * @param upperCaseString Use this parameter to include the
       * [upperCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-upperCaseString)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e2028be3a9b08fe5804707c100bffd2c82160311e10d02424d1c69fef3ff04e")
      public fun upperCaseString(upperCaseString: UpperCaseStringProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.ProcessorProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.ProcessorProperty.builder()

      /**
       * @param addKeys Use this parameter to include the
       * [addKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-addKeys)
       * processor in your transformer.
       */
      override fun addKeys(addKeys: IResolvable) {
        cdkBuilder.addKeys(addKeys.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param addKeys Use this parameter to include the
       * [addKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-addKeys)
       * processor in your transformer.
       */
      override fun addKeys(addKeys: AddKeysProperty) {
        cdkBuilder.addKeys(addKeys.let(AddKeysProperty.Companion::unwrap))
      }

      /**
       * @param addKeys Use this parameter to include the
       * [addKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-addKeys)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4dd9fd958293868212a0071639cbfb25f0bc807b00f4b4c3375fb01738e183a5")
      override fun addKeys(addKeys: AddKeysProperty.Builder.() -> Unit): Unit =
          addKeys(AddKeysProperty(addKeys))

      /**
       * @param copyValue Use this parameter to include the
       * [copyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-copyValue)
       * processor in your transformer.
       */
      override fun copyValue(copyValue: IResolvable) {
        cdkBuilder.copyValue(copyValue.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param copyValue Use this parameter to include the
       * [copyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-copyValue)
       * processor in your transformer.
       */
      override fun copyValue(copyValue: CopyValueProperty) {
        cdkBuilder.copyValue(copyValue.let(CopyValueProperty.Companion::unwrap))
      }

      /**
       * @param copyValue Use this parameter to include the
       * [copyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-copyValue)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9073912507a5474462ace0b2d09244ecd993c9827d114a62e025b7ef6a4a96d")
      override fun copyValue(copyValue: CopyValueProperty.Builder.() -> Unit): Unit =
          copyValue(CopyValueProperty(copyValue))

      /**
       * @param csv Use this parameter to include the
       * [CSV](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-CSV)
       * processor in your transformer.
       */
      override fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param csv Use this parameter to include the
       * [CSV](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-CSV)
       * processor in your transformer.
       */
      override fun csv(csv: CsvProperty) {
        cdkBuilder.csv(csv.let(CsvProperty.Companion::unwrap))
      }

      /**
       * @param csv Use this parameter to include the
       * [CSV](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-CSV)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("002a8e749c730b15678e1a2efcbbe1a61b4004a516af94573d3e8aaef9abb88f")
      override fun csv(csv: CsvProperty.Builder.() -> Unit): Unit = csv(CsvProperty(csv))

      /**
       * @param dateTimeConverter Use this parameter to include the
       * [datetimeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-datetimeConverter)
       * processor in your transformer.
       */
      override fun dateTimeConverter(dateTimeConverter: IResolvable) {
        cdkBuilder.dateTimeConverter(dateTimeConverter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dateTimeConverter Use this parameter to include the
       * [datetimeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-datetimeConverter)
       * processor in your transformer.
       */
      override fun dateTimeConverter(dateTimeConverter: DateTimeConverterProperty) {
        cdkBuilder.dateTimeConverter(dateTimeConverter.let(DateTimeConverterProperty.Companion::unwrap))
      }

      /**
       * @param dateTimeConverter Use this parameter to include the
       * [datetimeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-datetimeConverter)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fb371bca13030d56c1f770bbd1fd5588464b47d941af11bab1ab75feb28f044")
      override
          fun dateTimeConverter(dateTimeConverter: DateTimeConverterProperty.Builder.() -> Unit):
          Unit = dateTimeConverter(DateTimeConverterProperty(dateTimeConverter))

      /**
       * @param deleteKeys Use this parameter to include the
       * [deleteKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-deleteKeys)
       * processor in your transformer.
       */
      override fun deleteKeys(deleteKeys: IResolvable) {
        cdkBuilder.deleteKeys(deleteKeys.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param deleteKeys Use this parameter to include the
       * [deleteKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-deleteKeys)
       * processor in your transformer.
       */
      override fun deleteKeys(deleteKeys: DeleteKeysProperty) {
        cdkBuilder.deleteKeys(deleteKeys.let(DeleteKeysProperty.Companion::unwrap))
      }

      /**
       * @param deleteKeys Use this parameter to include the
       * [deleteKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-deleteKeys)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26cf7198c441ee0935ff536e9170cfcd7ec77735ccf8c63c82eb80f5d679dca9")
      override fun deleteKeys(deleteKeys: DeleteKeysProperty.Builder.() -> Unit): Unit =
          deleteKeys(DeleteKeysProperty(deleteKeys))

      /**
       * @param grok Use this parameter to include the
       * [grok](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-grok)
       * processor in your transformer.
       */
      override fun grok(grok: IResolvable) {
        cdkBuilder.grok(grok.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param grok Use this parameter to include the
       * [grok](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-grok)
       * processor in your transformer.
       */
      override fun grok(grok: GrokProperty) {
        cdkBuilder.grok(grok.let(GrokProperty.Companion::unwrap))
      }

      /**
       * @param grok Use this parameter to include the
       * [grok](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-grok)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64d6211faa2cacfc74fa8fb4cf01dbc25b6ef9e68deb311620f50eeba6a8e9d7")
      override fun grok(grok: GrokProperty.Builder.() -> Unit): Unit = grok(GrokProperty(grok))

      /**
       * @param listToMap Use this parameter to include the
       * [listToMap](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-listToMap)
       * processor in your transformer.
       */
      override fun listToMap(listToMap: IResolvable) {
        cdkBuilder.listToMap(listToMap.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param listToMap Use this parameter to include the
       * [listToMap](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-listToMap)
       * processor in your transformer.
       */
      override fun listToMap(listToMap: ListToMapProperty) {
        cdkBuilder.listToMap(listToMap.let(ListToMapProperty.Companion::unwrap))
      }

      /**
       * @param listToMap Use this parameter to include the
       * [listToMap](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-listToMap)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3b95cacb6f7e3d38b861b97e6a575c1bcf0ee50fcb97c3d7669cadec4e3ee77")
      override fun listToMap(listToMap: ListToMapProperty.Builder.() -> Unit): Unit =
          listToMap(ListToMapProperty(listToMap))

      /**
       * @param lowerCaseString Use this parameter to include the
       * [lowerCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-lowerCaseString)
       * processor in your transformer.
       */
      override fun lowerCaseString(lowerCaseString: IResolvable) {
        cdkBuilder.lowerCaseString(lowerCaseString.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lowerCaseString Use this parameter to include the
       * [lowerCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-lowerCaseString)
       * processor in your transformer.
       */
      override fun lowerCaseString(lowerCaseString: LowerCaseStringProperty) {
        cdkBuilder.lowerCaseString(lowerCaseString.let(LowerCaseStringProperty.Companion::unwrap))
      }

      /**
       * @param lowerCaseString Use this parameter to include the
       * [lowerCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-lowerCaseString)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0fd1360801bb1190860b5d1ba296e97b91234c9c70c83ef6151f7176e8faa43")
      override fun lowerCaseString(lowerCaseString: LowerCaseStringProperty.Builder.() -> Unit):
          Unit = lowerCaseString(LowerCaseStringProperty(lowerCaseString))

      /**
       * @param moveKeys Use this parameter to include the
       * [moveKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-moveKeys)
       * processor in your transformer.
       */
      override fun moveKeys(moveKeys: IResolvable) {
        cdkBuilder.moveKeys(moveKeys.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param moveKeys Use this parameter to include the
       * [moveKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-moveKeys)
       * processor in your transformer.
       */
      override fun moveKeys(moveKeys: MoveKeysProperty) {
        cdkBuilder.moveKeys(moveKeys.let(MoveKeysProperty.Companion::unwrap))
      }

      /**
       * @param moveKeys Use this parameter to include the
       * [moveKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-moveKeys)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e859d4f0a63419d30de941e7145fe92f43f9aea2f45caf28d18eea5c1dd6d503")
      override fun moveKeys(moveKeys: MoveKeysProperty.Builder.() -> Unit): Unit =
          moveKeys(MoveKeysProperty(moveKeys))

      /**
       * @param parseCloudfront Use this parameter to include the
       * [parseCloudfront](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseCloudfront)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      override fun parseCloudfront(parseCloudfront: IResolvable) {
        cdkBuilder.parseCloudfront(parseCloudfront.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parseCloudfront Use this parameter to include the
       * [parseCloudfront](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseCloudfront)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      override fun parseCloudfront(parseCloudfront: ParseCloudfrontProperty) {
        cdkBuilder.parseCloudfront(parseCloudfront.let(ParseCloudfrontProperty.Companion::unwrap))
      }

      /**
       * @param parseCloudfront Use this parameter to include the
       * [parseCloudfront](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseCloudfront)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("594189c6a3bf569e6bb4ed85c84c3cc66cb4cadcfca61f54080ce023d2e9c2bf")
      override fun parseCloudfront(parseCloudfront: ParseCloudfrontProperty.Builder.() -> Unit):
          Unit = parseCloudfront(ParseCloudfrontProperty(parseCloudfront))

      /**
       * @param parseJson Use this parameter to include the
       * [parseJSON](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseJSON)
       * processor in your transformer.
       */
      override fun parseJson(parseJson: IResolvable) {
        cdkBuilder.parseJson(parseJson.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parseJson Use this parameter to include the
       * [parseJSON](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseJSON)
       * processor in your transformer.
       */
      override fun parseJson(parseJson: ParseJSONProperty) {
        cdkBuilder.parseJson(parseJson.let(ParseJSONProperty.Companion::unwrap))
      }

      /**
       * @param parseJson Use this parameter to include the
       * [parseJSON](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseJSON)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("772b85e57dff7a477c156c22d4a95e9e95eb8ac949b1d5021dc8e08477274491")
      override fun parseJson(parseJson: ParseJSONProperty.Builder.() -> Unit): Unit =
          parseJson(ParseJSONProperty(parseJson))

      /**
       * @param parseKeyValue Use this parameter to include the
       * [parseKeyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseKeyValue)
       * processor in your transformer.
       */
      override fun parseKeyValue(parseKeyValue: IResolvable) {
        cdkBuilder.parseKeyValue(parseKeyValue.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parseKeyValue Use this parameter to include the
       * [parseKeyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseKeyValue)
       * processor in your transformer.
       */
      override fun parseKeyValue(parseKeyValue: ParseKeyValueProperty) {
        cdkBuilder.parseKeyValue(parseKeyValue.let(ParseKeyValueProperty.Companion::unwrap))
      }

      /**
       * @param parseKeyValue Use this parameter to include the
       * [parseKeyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseKeyValue)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0de86dba468d3a0e90022e462d01f1f6daab1859e500be6c7cdd934a045d98a7")
      override fun parseKeyValue(parseKeyValue: ParseKeyValueProperty.Builder.() -> Unit): Unit =
          parseKeyValue(ParseKeyValueProperty(parseKeyValue))

      /**
       * @param parsePostgres Use this parameter to include the
       * [parsePostGres](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parsePostGres)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      override fun parsePostgres(parsePostgres: IResolvable) {
        cdkBuilder.parsePostgres(parsePostgres.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parsePostgres Use this parameter to include the
       * [parsePostGres](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parsePostGres)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      override fun parsePostgres(parsePostgres: ParsePostgresProperty) {
        cdkBuilder.parsePostgres(parsePostgres.let(ParsePostgresProperty.Companion::unwrap))
      }

      /**
       * @param parsePostgres Use this parameter to include the
       * [parsePostGres](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parsePostGres)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e24085864bb4f2b96a83d1b3dbf246e78f5a6823e4bd77939454b92035200a7")
      override fun parsePostgres(parsePostgres: ParsePostgresProperty.Builder.() -> Unit): Unit =
          parsePostgres(ParsePostgresProperty(parsePostgres))

      /**
       * @param parseRoute53 Use this parameter to include the
       * [parseRoute53](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseRoute53)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      override fun parseRoute53(parseRoute53: IResolvable) {
        cdkBuilder.parseRoute53(parseRoute53.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parseRoute53 Use this parameter to include the
       * [parseRoute53](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseRoute53)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      override fun parseRoute53(parseRoute53: ParseRoute53Property) {
        cdkBuilder.parseRoute53(parseRoute53.let(ParseRoute53Property.Companion::unwrap))
      }

      /**
       * @param parseRoute53 Use this parameter to include the
       * [parseRoute53](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseRoute53)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1413a69a1403ed7c2be0030734e3bc790a442df11ec48a3e12d9e99050680ca8")
      override fun parseRoute53(parseRoute53: ParseRoute53Property.Builder.() -> Unit): Unit =
          parseRoute53(ParseRoute53Property(parseRoute53))

      /**
       * @param parseToOcsf Use this parameter to convert logs into Open Cybersecurity Schema (OCSF)
       * format.
       */
      override fun parseToOcsf(parseToOcsf: IResolvable) {
        cdkBuilder.parseToOcsf(parseToOcsf.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parseToOcsf Use this parameter to convert logs into Open Cybersecurity Schema (OCSF)
       * format.
       */
      override fun parseToOcsf(parseToOcsf: ParseToOCSFProperty) {
        cdkBuilder.parseToOcsf(parseToOcsf.let(ParseToOCSFProperty.Companion::unwrap))
      }

      /**
       * @param parseToOcsf Use this parameter to convert logs into Open Cybersecurity Schema (OCSF)
       * format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec0eddfff594e53999bd50569b6d17cce238b7a28c44310d138b6810d3c16176")
      override fun parseToOcsf(parseToOcsf: ParseToOCSFProperty.Builder.() -> Unit): Unit =
          parseToOcsf(ParseToOCSFProperty(parseToOcsf))

      /**
       * @param parseVpc Use this parameter to include the
       * [parseVPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseVPC)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      override fun parseVpc(parseVpc: IResolvable) {
        cdkBuilder.parseVpc(parseVpc.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parseVpc Use this parameter to include the
       * [parseVPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseVPC)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      override fun parseVpc(parseVpc: ParseVPCProperty) {
        cdkBuilder.parseVpc(parseVpc.let(ParseVPCProperty.Companion::unwrap))
      }

      /**
       * @param parseVpc Use this parameter to include the
       * [parseVPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseVPC)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("554fef1d0a6836880c4ace6476bca5572d67f89521bbd7c37aa6549de5e3ff31")
      override fun parseVpc(parseVpc: ParseVPCProperty.Builder.() -> Unit): Unit =
          parseVpc(ParseVPCProperty(parseVpc))

      /**
       * @param parseWaf Use this parameter to include the
       * [parseWAF](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parseWAF)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      override fun parseWaf(parseWaf: IResolvable) {
        cdkBuilder.parseWaf(parseWaf.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parseWaf Use this parameter to include the
       * [parseWAF](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parseWAF)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      override fun parseWaf(parseWaf: ParseWAFProperty) {
        cdkBuilder.parseWaf(parseWaf.let(ParseWAFProperty.Companion::unwrap))
      }

      /**
       * @param parseWaf Use this parameter to include the
       * [parseWAF](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parseWAF)
       * processor in your transformer.
       * If you use this processor, it must be the first processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd7f35e082b4b785bd0cceffbdea90eac37bd648cdf2ac11bcf1972905633e00")
      override fun parseWaf(parseWaf: ParseWAFProperty.Builder.() -> Unit): Unit =
          parseWaf(ParseWAFProperty(parseWaf))

      /**
       * @param renameKeys Use this parameter to include the
       * [renameKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-renameKeys)
       * processor in your transformer.
       */
      override fun renameKeys(renameKeys: IResolvable) {
        cdkBuilder.renameKeys(renameKeys.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param renameKeys Use this parameter to include the
       * [renameKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-renameKeys)
       * processor in your transformer.
       */
      override fun renameKeys(renameKeys: RenameKeysProperty) {
        cdkBuilder.renameKeys(renameKeys.let(RenameKeysProperty.Companion::unwrap))
      }

      /**
       * @param renameKeys Use this parameter to include the
       * [renameKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-renameKeys)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49f6165a6b60c158d8c14325912aa917ebfb54234bdcc2ea232c725ffbdef092")
      override fun renameKeys(renameKeys: RenameKeysProperty.Builder.() -> Unit): Unit =
          renameKeys(RenameKeysProperty(renameKeys))

      /**
       * @param splitString Use this parameter to include the
       * [splitString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-splitString)
       * processor in your transformer.
       */
      override fun splitString(splitString: IResolvable) {
        cdkBuilder.splitString(splitString.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param splitString Use this parameter to include the
       * [splitString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-splitString)
       * processor in your transformer.
       */
      override fun splitString(splitString: SplitStringProperty) {
        cdkBuilder.splitString(splitString.let(SplitStringProperty.Companion::unwrap))
      }

      /**
       * @param splitString Use this parameter to include the
       * [splitString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-splitString)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d7c28f563287b91967ed706dbf18fa6a86b33b2698969303be82617115b3eb0")
      override fun splitString(splitString: SplitStringProperty.Builder.() -> Unit): Unit =
          splitString(SplitStringProperty(splitString))

      /**
       * @param substituteString Use this parameter to include the
       * [substituteString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-substituteString)
       * processor in your transformer.
       */
      override fun substituteString(substituteString: IResolvable) {
        cdkBuilder.substituteString(substituteString.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param substituteString Use this parameter to include the
       * [substituteString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-substituteString)
       * processor in your transformer.
       */
      override fun substituteString(substituteString: SubstituteStringProperty) {
        cdkBuilder.substituteString(substituteString.let(SubstituteStringProperty.Companion::unwrap))
      }

      /**
       * @param substituteString Use this parameter to include the
       * [substituteString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-substituteString)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ac0bd1bd745c65948abff807d55090c8b36f7f66d468a5732c15cede1269751")
      override fun substituteString(substituteString: SubstituteStringProperty.Builder.() -> Unit):
          Unit = substituteString(SubstituteStringProperty(substituteString))

      /**
       * @param trimString Use this parameter to include the
       * [trimString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-trimString)
       * processor in your transformer.
       */
      override fun trimString(trimString: IResolvable) {
        cdkBuilder.trimString(trimString.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param trimString Use this parameter to include the
       * [trimString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-trimString)
       * processor in your transformer.
       */
      override fun trimString(trimString: TrimStringProperty) {
        cdkBuilder.trimString(trimString.let(TrimStringProperty.Companion::unwrap))
      }

      /**
       * @param trimString Use this parameter to include the
       * [trimString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-trimString)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b3ac807a54a6cd5868f087f7c158232d21bac9614ac587ab36bf76fd788b0e3")
      override fun trimString(trimString: TrimStringProperty.Builder.() -> Unit): Unit =
          trimString(TrimStringProperty(trimString))

      /**
       * @param typeConverter Use this parameter to include the
       * [typeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-typeConverter)
       * processor in your transformer.
       */
      override fun typeConverter(typeConverter: IResolvable) {
        cdkBuilder.typeConverter(typeConverter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param typeConverter Use this parameter to include the
       * [typeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-typeConverter)
       * processor in your transformer.
       */
      override fun typeConverter(typeConverter: TypeConverterProperty) {
        cdkBuilder.typeConverter(typeConverter.let(TypeConverterProperty.Companion::unwrap))
      }

      /**
       * @param typeConverter Use this parameter to include the
       * [typeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-typeConverter)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bec58cb926d7db7061ebbaceb2aff209b57bc23b0110f5f4154a2728d46f80e")
      override fun typeConverter(typeConverter: TypeConverterProperty.Builder.() -> Unit): Unit =
          typeConverter(TypeConverterProperty(typeConverter))

      /**
       * @param upperCaseString Use this parameter to include the
       * [upperCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-upperCaseString)
       * processor in your transformer.
       */
      override fun upperCaseString(upperCaseString: IResolvable) {
        cdkBuilder.upperCaseString(upperCaseString.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param upperCaseString Use this parameter to include the
       * [upperCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-upperCaseString)
       * processor in your transformer.
       */
      override fun upperCaseString(upperCaseString: UpperCaseStringProperty) {
        cdkBuilder.upperCaseString(upperCaseString.let(UpperCaseStringProperty.Companion::unwrap))
      }

      /**
       * @param upperCaseString Use this parameter to include the
       * [upperCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-upperCaseString)
       * processor in your transformer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e2028be3a9b08fe5804707c100bffd2c82160311e10d02424d1c69fef3ff04e")
      override fun upperCaseString(upperCaseString: UpperCaseStringProperty.Builder.() -> Unit):
          Unit = upperCaseString(UpperCaseStringProperty(upperCaseString))

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.ProcessorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ProcessorProperty,
    ) : CdkObject(cdkObject),
        ProcessorProperty {
      /**
       * Use this parameter to include the
       * [addKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-addKeys)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-addkeys)
       */
      override fun addKeys(): Any? = unwrap(this).getAddKeys()

      /**
       * Use this parameter to include the
       * [copyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-copyValue)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-copyvalue)
       */
      override fun copyValue(): Any? = unwrap(this).getCopyValue()

      /**
       * Use this parameter to include the
       * [CSV](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-CSV)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-csv)
       */
      override fun csv(): Any? = unwrap(this).getCsv()

      /**
       * Use this parameter to include the
       * [datetimeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-datetimeConverter)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-datetimeconverter)
       */
      override fun dateTimeConverter(): Any? = unwrap(this).getDateTimeConverter()

      /**
       * Use this parameter to include the
       * [deleteKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-deleteKeys)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-deletekeys)
       */
      override fun deleteKeys(): Any? = unwrap(this).getDeleteKeys()

      /**
       * Use this parameter to include the
       * [grok](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-grok)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-grok)
       */
      override fun grok(): Any? = unwrap(this).getGrok()

      /**
       * Use this parameter to include the
       * [listToMap](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-listToMap)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-listtomap)
       */
      override fun listToMap(): Any? = unwrap(this).getListToMap()

      /**
       * Use this parameter to include the
       * [lowerCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-lowerCaseString)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-lowercasestring)
       */
      override fun lowerCaseString(): Any? = unwrap(this).getLowerCaseString()

      /**
       * Use this parameter to include the
       * [moveKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-moveKeys)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-movekeys)
       */
      override fun moveKeys(): Any? = unwrap(this).getMoveKeys()

      /**
       * Use this parameter to include the
       * [parseCloudfront](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseCloudfront)
       * processor in your transformer.
       *
       * If you use this processor, it must be the first processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parsecloudfront)
       */
      override fun parseCloudfront(): Any? = unwrap(this).getParseCloudfront()

      /**
       * Use this parameter to include the
       * [parseJSON](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseJSON)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parsejson)
       */
      override fun parseJson(): Any? = unwrap(this).getParseJson()

      /**
       * Use this parameter to include the
       * [parseKeyValue](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseKeyValue)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parsekeyvalue)
       */
      override fun parseKeyValue(): Any? = unwrap(this).getParseKeyValue()

      /**
       * Use this parameter to include the
       * [parsePostGres](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parsePostGres)
       * processor in your transformer.
       *
       * If you use this processor, it must be the first processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parsepostgres)
       */
      override fun parsePostgres(): Any? = unwrap(this).getParsePostgres()

      /**
       * Use this parameter to include the
       * [parseRoute53](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseRoute53)
       * processor in your transformer.
       *
       * If you use this processor, it must be the first processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parseroute53)
       */
      override fun parseRoute53(): Any? = unwrap(this).getParseRoute53()

      /**
       * Use this parameter to convert logs into Open Cybersecurity Schema (OCSF) format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parsetoocsf)
       */
      override fun parseToOcsf(): Any? = unwrap(this).getParseToOcsf()

      /**
       * Use this parameter to include the
       * [parseVPC](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-parseVPC)
       * processor in your transformer.
       *
       * If you use this processor, it must be the first processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parsevpc)
       */
      override fun parseVpc(): Any? = unwrap(this).getParseVpc()

      /**
       * Use this parameter to include the
       * [parseWAF](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-parseWAF)
       * processor in your transformer.
       *
       * If you use this processor, it must be the first processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-parsewaf)
       */
      override fun parseWaf(): Any? = unwrap(this).getParseWaf()

      /**
       * Use this parameter to include the
       * [renameKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation.html#CloudWatch-Logs-Transformation-renameKeys)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-renamekeys)
       */
      override fun renameKeys(): Any? = unwrap(this).getRenameKeys()

      /**
       * Use this parameter to include the
       * [splitString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-splitString)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-splitstring)
       */
      override fun splitString(): Any? = unwrap(this).getSplitString()

      /**
       * Use this parameter to include the
       * [substituteString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-substituteString)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-substitutestring)
       */
      override fun substituteString(): Any? = unwrap(this).getSubstituteString()

      /**
       * Use this parameter to include the
       * [trimString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-trimString)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-trimstring)
       */
      override fun trimString(): Any? = unwrap(this).getTrimString()

      /**
       * Use this parameter to include the
       * [typeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-typeConverter)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-typeconverter)
       */
      override fun typeConverter(): Any? = unwrap(this).getTypeConverter()

      /**
       * Use this parameter to include the
       * [upperCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-upperCaseString)
       * processor in your transformer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-processor.html#cfn-logs-transformer-processor-uppercasestring)
       */
      override fun upperCaseString(): Any? = unwrap(this).getUpperCaseString()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProcessorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.ProcessorProperty):
          ProcessorProperty = CdkObjectWrappers.wrap(cdkObject) as? ProcessorProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProcessorProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.ProcessorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.ProcessorProperty
    }
  }

  /**
   * This object defines one key that will be renamed with the
   * [renameKey](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-renameKey)
   * processor.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * RenameKeyEntryProperty renameKeyEntryProperty = RenameKeyEntryProperty.builder()
   * .key("key")
   * .renameTo("renameTo")
   * // the properties below are optional
   * .overwriteIfExists(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-renamekeyentry.html)
   */
  public interface RenameKeyEntryProperty {
    /**
     * The key to rename.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-renamekeyentry.html#cfn-logs-transformer-renamekeyentry-key)
     */
    public fun key(): String

    /**
     * Specifies whether to overwrite the existing value if the destination key already exists.
     *
     * The default is `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-renamekeyentry.html#cfn-logs-transformer-renamekeyentry-overwriteifexists)
     */
    public fun overwriteIfExists(): Any? = unwrap(this).getOverwriteIfExists()

    /**
     * The string to use for the new key name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-renamekeyentry.html#cfn-logs-transformer-renamekeyentry-renameto)
     */
    public fun renameTo(): String

    /**
     * A builder for [RenameKeyEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key to rename. 
       */
      public fun key(key: String)

      /**
       * @param overwriteIfExists Specifies whether to overwrite the existing value if the
       * destination key already exists.
       * The default is `false`
       */
      public fun overwriteIfExists(overwriteIfExists: Boolean)

      /**
       * @param overwriteIfExists Specifies whether to overwrite the existing value if the
       * destination key already exists.
       * The default is `false`
       */
      public fun overwriteIfExists(overwriteIfExists: IResolvable)

      /**
       * @param renameTo The string to use for the new key name. 
       */
      public fun renameTo(renameTo: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.RenameKeyEntryProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.RenameKeyEntryProperty.builder()

      /**
       * @param key The key to rename. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param overwriteIfExists Specifies whether to overwrite the existing value if the
       * destination key already exists.
       * The default is `false`
       */
      override fun overwriteIfExists(overwriteIfExists: Boolean) {
        cdkBuilder.overwriteIfExists(overwriteIfExists)
      }

      /**
       * @param overwriteIfExists Specifies whether to overwrite the existing value if the
       * destination key already exists.
       * The default is `false`
       */
      override fun overwriteIfExists(overwriteIfExists: IResolvable) {
        cdkBuilder.overwriteIfExists(overwriteIfExists.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param renameTo The string to use for the new key name. 
       */
      override fun renameTo(renameTo: String) {
        cdkBuilder.renameTo(renameTo)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.RenameKeyEntryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.RenameKeyEntryProperty,
    ) : CdkObject(cdkObject),
        RenameKeyEntryProperty {
      /**
       * The key to rename.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-renamekeyentry.html#cfn-logs-transformer-renamekeyentry-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * Specifies whether to overwrite the existing value if the destination key already exists.
       *
       * The default is `false`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-renamekeyentry.html#cfn-logs-transformer-renamekeyentry-overwriteifexists)
       */
      override fun overwriteIfExists(): Any? = unwrap(this).getOverwriteIfExists()

      /**
       * The string to use for the new key name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-renamekeyentry.html#cfn-logs-transformer-renamekeyentry-renameto)
       */
      override fun renameTo(): String = unwrap(this).getRenameTo()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RenameKeyEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.RenameKeyEntryProperty):
          RenameKeyEntryProperty = CdkObjectWrappers.wrap(cdkObject) as? RenameKeyEntryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RenameKeyEntryProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.RenameKeyEntryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.RenameKeyEntryProperty
    }
  }

  /**
   * Use this processor to rename keys in a log event.
   *
   * For more information about this processor including examples, see
   * [renameKeys](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-renameKeys)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * RenameKeysProperty renameKeysProperty = RenameKeysProperty.builder()
   * .entries(List.of(RenameKeyEntryProperty.builder()
   * .key("key")
   * .renameTo("renameTo")
   * // the properties below are optional
   * .overwriteIfExists(false)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-renamekeys.html)
   */
  public interface RenameKeysProperty {
    /**
     * An array of `RenameKeyEntry` objects, where each object contains the information about a
     * single key to rename.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-renamekeys.html#cfn-logs-transformer-renamekeys-entries)
     */
    public fun entries(): Any

    /**
     * A builder for [RenameKeysProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param entries An array of `RenameKeyEntry` objects, where each object contains the
       * information about a single key to rename. 
       */
      public fun entries(entries: IResolvable)

      /**
       * @param entries An array of `RenameKeyEntry` objects, where each object contains the
       * information about a single key to rename. 
       */
      public fun entries(entries: List<Any>)

      /**
       * @param entries An array of `RenameKeyEntry` objects, where each object contains the
       * information about a single key to rename. 
       */
      public fun entries(vararg entries: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.RenameKeysProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.RenameKeysProperty.builder()

      /**
       * @param entries An array of `RenameKeyEntry` objects, where each object contains the
       * information about a single key to rename. 
       */
      override fun entries(entries: IResolvable) {
        cdkBuilder.entries(entries.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param entries An array of `RenameKeyEntry` objects, where each object contains the
       * information about a single key to rename. 
       */
      override fun entries(entries: List<Any>) {
        cdkBuilder.entries(entries.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param entries An array of `RenameKeyEntry` objects, where each object contains the
       * information about a single key to rename. 
       */
      override fun entries(vararg entries: Any): Unit = entries(entries.toList())

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.RenameKeysProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.RenameKeysProperty,
    ) : CdkObject(cdkObject),
        RenameKeysProperty {
      /**
       * An array of `RenameKeyEntry` objects, where each object contains the information about a
       * single key to rename.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-renamekeys.html#cfn-logs-transformer-renamekeys-entries)
       */
      override fun entries(): Any = unwrap(this).getEntries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RenameKeysProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.RenameKeysProperty):
          RenameKeysProperty = CdkObjectWrappers.wrap(cdkObject) as? RenameKeysProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RenameKeysProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.RenameKeysProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.RenameKeysProperty
    }
  }

  /**
   * This object defines one log field that will be split with the
   * [splitString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-splitString)
   * processor.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * SplitStringEntryProperty splitStringEntryProperty = SplitStringEntryProperty.builder()
   * .delimiter("delimiter")
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-splitstringentry.html)
   */
  public interface SplitStringEntryProperty {
    /**
     * The separator characters to split the string entry on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-splitstringentry.html#cfn-logs-transformer-splitstringentry-delimiter)
     */
    public fun delimiter(): String

    /**
     * The key of the field to split.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-splitstringentry.html#cfn-logs-transformer-splitstringentry-source)
     */
    public fun source(): String

    /**
     * A builder for [SplitStringEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param delimiter The separator characters to split the string entry on. 
       */
      public fun delimiter(delimiter: String)

      /**
       * @param source The key of the field to split. 
       */
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.SplitStringEntryProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.SplitStringEntryProperty.builder()

      /**
       * @param delimiter The separator characters to split the string entry on. 
       */
      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      /**
       * @param source The key of the field to split. 
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build():
          software.amazon.awscdk.services.logs.CfnTransformer.SplitStringEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.SplitStringEntryProperty,
    ) : CdkObject(cdkObject),
        SplitStringEntryProperty {
      /**
       * The separator characters to split the string entry on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-splitstringentry.html#cfn-logs-transformer-splitstringentry-delimiter)
       */
      override fun delimiter(): String = unwrap(this).getDelimiter()

      /**
       * The key of the field to split.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-splitstringentry.html#cfn-logs-transformer-splitstringentry-source)
       */
      override fun source(): String = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SplitStringEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.SplitStringEntryProperty):
          SplitStringEntryProperty = CdkObjectWrappers.wrap(cdkObject) as? SplitStringEntryProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SplitStringEntryProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.SplitStringEntryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.SplitStringEntryProperty
    }
  }

  /**
   * Use this processor to split a field into an array of strings using a delimiting character.
   *
   * For more information about this processor including examples, see
   * [splitString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-splitString)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * SplitStringProperty splitStringProperty = SplitStringProperty.builder()
   * .entries(List.of(SplitStringEntryProperty.builder()
   * .delimiter("delimiter")
   * .source("source")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-splitstring.html)
   */
  public interface SplitStringProperty {
    /**
     * An array of `SplitStringEntry` objects, where each object contains the information about one
     * field to split.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-splitstring.html#cfn-logs-transformer-splitstring-entries)
     */
    public fun entries(): Any

    /**
     * A builder for [SplitStringProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param entries An array of `SplitStringEntry` objects, where each object contains the
       * information about one field to split. 
       */
      public fun entries(entries: IResolvable)

      /**
       * @param entries An array of `SplitStringEntry` objects, where each object contains the
       * information about one field to split. 
       */
      public fun entries(entries: List<Any>)

      /**
       * @param entries An array of `SplitStringEntry` objects, where each object contains the
       * information about one field to split. 
       */
      public fun entries(vararg entries: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.SplitStringProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.SplitStringProperty.builder()

      /**
       * @param entries An array of `SplitStringEntry` objects, where each object contains the
       * information about one field to split. 
       */
      override fun entries(entries: IResolvable) {
        cdkBuilder.entries(entries.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param entries An array of `SplitStringEntry` objects, where each object contains the
       * information about one field to split. 
       */
      override fun entries(entries: List<Any>) {
        cdkBuilder.entries(entries.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param entries An array of `SplitStringEntry` objects, where each object contains the
       * information about one field to split. 
       */
      override fun entries(vararg entries: Any): Unit = entries(entries.toList())

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.SplitStringProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.SplitStringProperty,
    ) : CdkObject(cdkObject),
        SplitStringProperty {
      /**
       * An array of `SplitStringEntry` objects, where each object contains the information about
       * one field to split.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-splitstring.html#cfn-logs-transformer-splitstring-entries)
       */
      override fun entries(): Any = unwrap(this).getEntries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SplitStringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.SplitStringProperty):
          SplitStringProperty = CdkObjectWrappers.wrap(cdkObject) as? SplitStringProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SplitStringProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.SplitStringProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.SplitStringProperty
    }
  }

  /**
   * This object defines one log field key that will be replaced using the
   * [substituteString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-substituteString)
   * processor.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * SubstituteStringEntryProperty substituteStringEntryProperty =
   * SubstituteStringEntryProperty.builder()
   * .from("from")
   * .source("source")
   * .to("to")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-substitutestringentry.html)
   */
  public interface SubstituteStringEntryProperty {
    /**
     * The regular expression string to be replaced.
     *
     * Special regex characters such as [ and ] must be escaped using \ when using double quotes and
     * with \ when using single quotes. For more information, see [Class
     * Pattern](https://docs.aws.amazon.com/https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html)
     * on the Oracle web site.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-substitutestringentry.html#cfn-logs-transformer-substitutestringentry-from)
     */
    public fun from(): String

    /**
     * The key to modify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-substitutestringentry.html#cfn-logs-transformer-substitutestringentry-source)
     */
    public fun source(): String

    /**
     * The string to be substituted for each match of `from`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-substitutestringentry.html#cfn-logs-transformer-substitutestringentry-to)
     */
    public fun to(): String

    /**
     * A builder for [SubstituteStringEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param from The regular expression string to be replaced. 
       * Special regex characters such as [ and ] must be escaped using \ when using double quotes
       * and with \ when using single quotes. For more information, see [Class
       * Pattern](https://docs.aws.amazon.com/https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html)
       * on the Oracle web site.
       */
      public fun from(from: String)

      /**
       * @param source The key to modify. 
       */
      public fun source(source: String)

      /**
       * @param to The string to be substituted for each match of `from`. 
       */
      public fun to(to: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.SubstituteStringEntryProperty.Builder
          =
          software.amazon.awscdk.services.logs.CfnTransformer.SubstituteStringEntryProperty.builder()

      /**
       * @param from The regular expression string to be replaced. 
       * Special regex characters such as [ and ] must be escaped using \ when using double quotes
       * and with \ when using single quotes. For more information, see [Class
       * Pattern](https://docs.aws.amazon.com/https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html)
       * on the Oracle web site.
       */
      override fun from(from: String) {
        cdkBuilder.from(from)
      }

      /**
       * @param source The key to modify. 
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      /**
       * @param to The string to be substituted for each match of `from`. 
       */
      override fun to(to: String) {
        cdkBuilder.to(to)
      }

      public fun build():
          software.amazon.awscdk.services.logs.CfnTransformer.SubstituteStringEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.SubstituteStringEntryProperty,
    ) : CdkObject(cdkObject),
        SubstituteStringEntryProperty {
      /**
       * The regular expression string to be replaced.
       *
       * Special regex characters such as [ and ] must be escaped using \ when using double quotes
       * and with \ when using single quotes. For more information, see [Class
       * Pattern](https://docs.aws.amazon.com/https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html)
       * on the Oracle web site.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-substitutestringentry.html#cfn-logs-transformer-substitutestringentry-from)
       */
      override fun from(): String = unwrap(this).getFrom()

      /**
       * The key to modify.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-substitutestringentry.html#cfn-logs-transformer-substitutestringentry-source)
       */
      override fun source(): String = unwrap(this).getSource()

      /**
       * The string to be substituted for each match of `from`.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-substitutestringentry.html#cfn-logs-transformer-substitutestringentry-to)
       */
      override fun to(): String = unwrap(this).getTo()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubstituteStringEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.SubstituteStringEntryProperty):
          SubstituteStringEntryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SubstituteStringEntryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubstituteStringEntryProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.SubstituteStringEntryProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.SubstituteStringEntryProperty
    }
  }

  /**
   * This processor matches a key’s value against a regular expression and replaces all matches with
   * a replacement string.
   *
   * For more information about this processor including examples, see
   * [substituteString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-substituteString)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * SubstituteStringProperty substituteStringProperty = SubstituteStringProperty.builder()
   * .entries(List.of(SubstituteStringEntryProperty.builder()
   * .from("from")
   * .source("source")
   * .to("to")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-substitutestring.html)
   */
  public interface SubstituteStringProperty {
    /**
     * An array of objects, where each object contains the information about one key to match and
     * replace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-substitutestring.html#cfn-logs-transformer-substitutestring-entries)
     */
    public fun entries(): Any

    /**
     * A builder for [SubstituteStringProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to match and replace. 
       */
      public fun entries(entries: IResolvable)

      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to match and replace. 
       */
      public fun entries(entries: List<Any>)

      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to match and replace. 
       */
      public fun entries(vararg entries: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.SubstituteStringProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.SubstituteStringProperty.builder()

      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to match and replace. 
       */
      override fun entries(entries: IResolvable) {
        cdkBuilder.entries(entries.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to match and replace. 
       */
      override fun entries(entries: List<Any>) {
        cdkBuilder.entries(entries.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param entries An array of objects, where each object contains the information about one
       * key to match and replace. 
       */
      override fun entries(vararg entries: Any): Unit = entries(entries.toList())

      public fun build():
          software.amazon.awscdk.services.logs.CfnTransformer.SubstituteStringProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.SubstituteStringProperty,
    ) : CdkObject(cdkObject),
        SubstituteStringProperty {
      /**
       * An array of objects, where each object contains the information about one key to match and
       * replace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-substitutestring.html#cfn-logs-transformer-substitutestring-entries)
       */
      override fun entries(): Any = unwrap(this).getEntries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubstituteStringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.SubstituteStringProperty):
          SubstituteStringProperty = CdkObjectWrappers.wrap(cdkObject) as? SubstituteStringProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubstituteStringProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.SubstituteStringProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.SubstituteStringProperty
    }
  }

  /**
   * Use this processor to remove leading and trailing whitespace.
   *
   * For more information about this processor including examples, see
   * [trimString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-trimString)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * TrimStringProperty trimStringProperty = TrimStringProperty.builder()
   * .withKeys(List.of("withKeys"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-trimstring.html)
   */
  public interface TrimStringProperty {
    /**
     * The array containing the keys of the fields to trim.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-trimstring.html#cfn-logs-transformer-trimstring-withkeys)
     */
    public fun withKeys(): List<String>

    /**
     * A builder for [TrimStringProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param withKeys The array containing the keys of the fields to trim. 
       */
      public fun withKeys(withKeys: List<String>)

      /**
       * @param withKeys The array containing the keys of the fields to trim. 
       */
      public fun withKeys(vararg withKeys: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.TrimStringProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.TrimStringProperty.builder()

      /**
       * @param withKeys The array containing the keys of the fields to trim. 
       */
      override fun withKeys(withKeys: List<String>) {
        cdkBuilder.withKeys(withKeys)
      }

      /**
       * @param withKeys The array containing the keys of the fields to trim. 
       */
      override fun withKeys(vararg withKeys: String): Unit = withKeys(withKeys.toList())

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.TrimStringProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.TrimStringProperty,
    ) : CdkObject(cdkObject),
        TrimStringProperty {
      /**
       * The array containing the keys of the fields to trim.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-trimstring.html#cfn-logs-transformer-trimstring-withkeys)
       */
      override fun withKeys(): List<String> = unwrap(this).getWithKeys()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrimStringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.TrimStringProperty):
          TrimStringProperty = CdkObjectWrappers.wrap(cdkObject) as? TrimStringProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrimStringProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.TrimStringProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.TrimStringProperty
    }
  }

  /**
   * This object defines one value type that will be converted using the
   * [typeConverter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-typeConverter)
   * processor.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * TypeConverterEntryProperty typeConverterEntryProperty = TypeConverterEntryProperty.builder()
   * .key("key")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-typeconverterentry.html)
   */
  public interface TypeConverterEntryProperty {
    /**
     * The key with the value that is to be converted to a different type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-typeconverterentry.html#cfn-logs-transformer-typeconverterentry-key)
     */
    public fun key(): String

    /**
     * The type to convert the field value to.
     *
     * Valid values are `integer` , `double` , `string` and `boolean` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-typeconverterentry.html#cfn-logs-transformer-typeconverterentry-type)
     */
    public fun type(): String

    /**
     * A builder for [TypeConverterEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key with the value that is to be converted to a different type. 
       */
      public fun key(key: String)

      /**
       * @param type The type to convert the field value to. 
       * Valid values are `integer` , `double` , `string` and `boolean` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.TypeConverterEntryProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.TypeConverterEntryProperty.builder()

      /**
       * @param key The key with the value that is to be converted to a different type. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param type The type to convert the field value to. 
       * Valid values are `integer` , `double` , `string` and `boolean` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.logs.CfnTransformer.TypeConverterEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.TypeConverterEntryProperty,
    ) : CdkObject(cdkObject),
        TypeConverterEntryProperty {
      /**
       * The key with the value that is to be converted to a different type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-typeconverterentry.html#cfn-logs-transformer-typeconverterentry-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The type to convert the field value to.
       *
       * Valid values are `integer` , `double` , `string` and `boolean` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-typeconverterentry.html#cfn-logs-transformer-typeconverterentry-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TypeConverterEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.TypeConverterEntryProperty):
          TypeConverterEntryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TypeConverterEntryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TypeConverterEntryProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.TypeConverterEntryProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.TypeConverterEntryProperty
    }
  }

  /**
   * Use this processor to convert a value type associated with the specified key to the specified
   * type.
   *
   * It's a casting processor that changes the types of the specified fields. Values can be
   * converted into one of the following datatypes: `integer` , `double` , `string` and `boolean` .
   *
   * For more information about this processor including examples, see
   * [trimString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-trimString)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * TypeConverterProperty typeConverterProperty = TypeConverterProperty.builder()
   * .entries(List.of(TypeConverterEntryProperty.builder()
   * .key("key")
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-typeconverter.html)
   */
  public interface TypeConverterProperty {
    /**
     * An array of `TypeConverterEntry` objects, where each object contains the information about
     * one field to change the type of.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-typeconverter.html#cfn-logs-transformer-typeconverter-entries)
     */
    public fun entries(): Any

    /**
     * A builder for [TypeConverterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param entries An array of `TypeConverterEntry` objects, where each object contains the
       * information about one field to change the type of. 
       */
      public fun entries(entries: IResolvable)

      /**
       * @param entries An array of `TypeConverterEntry` objects, where each object contains the
       * information about one field to change the type of. 
       */
      public fun entries(entries: List<Any>)

      /**
       * @param entries An array of `TypeConverterEntry` objects, where each object contains the
       * information about one field to change the type of. 
       */
      public fun entries(vararg entries: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.TypeConverterProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.TypeConverterProperty.builder()

      /**
       * @param entries An array of `TypeConverterEntry` objects, where each object contains the
       * information about one field to change the type of. 
       */
      override fun entries(entries: IResolvable) {
        cdkBuilder.entries(entries.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param entries An array of `TypeConverterEntry` objects, where each object contains the
       * information about one field to change the type of. 
       */
      override fun entries(entries: List<Any>) {
        cdkBuilder.entries(entries.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param entries An array of `TypeConverterEntry` objects, where each object contains the
       * information about one field to change the type of. 
       */
      override fun entries(vararg entries: Any): Unit = entries(entries.toList())

      public fun build(): software.amazon.awscdk.services.logs.CfnTransformer.TypeConverterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.TypeConverterProperty,
    ) : CdkObject(cdkObject),
        TypeConverterProperty {
      /**
       * An array of `TypeConverterEntry` objects, where each object contains the information about
       * one field to change the type of.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-typeconverter.html#cfn-logs-transformer-typeconverter-entries)
       */
      override fun entries(): Any = unwrap(this).getEntries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TypeConverterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.TypeConverterProperty):
          TypeConverterProperty = CdkObjectWrappers.wrap(cdkObject) as? TypeConverterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TypeConverterProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.TypeConverterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.TypeConverterProperty
    }
  }

  /**
   * This processor converts a string field to uppercase.
   *
   * For more information about this processor including examples, see
   * [upperCaseString](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CloudWatch-Logs-Transformation-Processors.html#CloudWatch-Logs-Transformation-upperCaseString)
   * in the *CloudWatch Logs User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.logs.*;
   * UpperCaseStringProperty upperCaseStringProperty = UpperCaseStringProperty.builder()
   * .withKeys(List.of("withKeys"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-uppercasestring.html)
   */
  public interface UpperCaseStringProperty {
    /**
     * The array of containing the keys of the field to convert to uppercase.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-uppercasestring.html#cfn-logs-transformer-uppercasestring-withkeys)
     */
    public fun withKeys(): List<String>

    /**
     * A builder for [UpperCaseStringProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param withKeys The array of containing the keys of the field to convert to uppercase. 
       */
      public fun withKeys(withKeys: List<String>)

      /**
       * @param withKeys The array of containing the keys of the field to convert to uppercase. 
       */
      public fun withKeys(vararg withKeys: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnTransformer.UpperCaseStringProperty.Builder =
          software.amazon.awscdk.services.logs.CfnTransformer.UpperCaseStringProperty.builder()

      /**
       * @param withKeys The array of containing the keys of the field to convert to uppercase. 
       */
      override fun withKeys(withKeys: List<String>) {
        cdkBuilder.withKeys(withKeys)
      }

      /**
       * @param withKeys The array of containing the keys of the field to convert to uppercase. 
       */
      override fun withKeys(vararg withKeys: String): Unit = withKeys(withKeys.toList())

      public fun build():
          software.amazon.awscdk.services.logs.CfnTransformer.UpperCaseStringProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.UpperCaseStringProperty,
    ) : CdkObject(cdkObject),
        UpperCaseStringProperty {
      /**
       * The array of containing the keys of the field to convert to uppercase.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-transformer-uppercasestring.html#cfn-logs-transformer-uppercasestring-withkeys)
       */
      override fun withKeys(): List<String> = unwrap(this).getWithKeys()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UpperCaseStringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformer.UpperCaseStringProperty):
          UpperCaseStringProperty = CdkObjectWrappers.wrap(cdkObject) as? UpperCaseStringProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpperCaseStringProperty):
          software.amazon.awscdk.services.logs.CfnTransformer.UpperCaseStringProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnTransformer.UpperCaseStringProperty
    }
  }
}
