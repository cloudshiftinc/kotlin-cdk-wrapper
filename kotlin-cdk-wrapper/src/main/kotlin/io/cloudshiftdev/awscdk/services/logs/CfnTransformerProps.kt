@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnTransformer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnTransformerProps cfnTransformerProps = CfnTransformerProps.builder()
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
public interface CfnTransformerProps {
  /**
   * Specify either the name or ARN of the log group to create the transformer for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-transformer.html#cfn-logs-transformer-loggroupidentifier)
   */
  public fun logGroupIdentifier(): String

  /**
   * This structure is an array that contains the configuration of this log transformer.
   *
   * A log transformer is an array of processors, where each processor applies one type of
   * transformation to the log events that are ingested.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-transformer.html#cfn-logs-transformer-transformerconfig)
   */
  public fun transformerConfig(): Any

  /**
   * A builder for [CfnTransformerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logGroupIdentifier Specify either the name or ARN of the log group to create the
     * transformer for. 
     */
    public fun logGroupIdentifier(logGroupIdentifier: String)

    /**
     * @param transformerConfig This structure is an array that contains the configuration of this
     * log transformer. 
     * A log transformer is an array of processors, where each processor applies one type of
     * transformation to the log events that are ingested.
     */
    public fun transformerConfig(transformerConfig: IResolvable)

    /**
     * @param transformerConfig This structure is an array that contains the configuration of this
     * log transformer. 
     * A log transformer is an array of processors, where each processor applies one type of
     * transformation to the log events that are ingested.
     */
    public fun transformerConfig(transformerConfig: List<Any>)

    /**
     * @param transformerConfig This structure is an array that contains the configuration of this
     * log transformer. 
     * A log transformer is an array of processors, where each processor applies one type of
     * transformation to the log events that are ingested.
     */
    public fun transformerConfig(vararg transformerConfig: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnTransformerProps.Builder =
        software.amazon.awscdk.services.logs.CfnTransformerProps.builder()

    /**
     * @param logGroupIdentifier Specify either the name or ARN of the log group to create the
     * transformer for. 
     */
    override fun logGroupIdentifier(logGroupIdentifier: String) {
      cdkBuilder.logGroupIdentifier(logGroupIdentifier)
    }

    /**
     * @param transformerConfig This structure is an array that contains the configuration of this
     * log transformer. 
     * A log transformer is an array of processors, where each processor applies one type of
     * transformation to the log events that are ingested.
     */
    override fun transformerConfig(transformerConfig: IResolvable) {
      cdkBuilder.transformerConfig(transformerConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param transformerConfig This structure is an array that contains the configuration of this
     * log transformer. 
     * A log transformer is an array of processors, where each processor applies one type of
     * transformation to the log events that are ingested.
     */
    override fun transformerConfig(transformerConfig: List<Any>) {
      cdkBuilder.transformerConfig(transformerConfig.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param transformerConfig This structure is an array that contains the configuration of this
     * log transformer. 
     * A log transformer is an array of processors, where each processor applies one type of
     * transformation to the log events that are ingested.
     */
    override fun transformerConfig(vararg transformerConfig: Any): Unit =
        transformerConfig(transformerConfig.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnTransformerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.CfnTransformerProps,
  ) : CdkObject(cdkObject),
      CfnTransformerProps {
    /**
     * Specify either the name or ARN of the log group to create the transformer for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-transformer.html#cfn-logs-transformer-loggroupidentifier)
     */
    override fun logGroupIdentifier(): String = unwrap(this).getLogGroupIdentifier()

    /**
     * This structure is an array that contains the configuration of this log transformer.
     *
     * A log transformer is an array of processors, where each processor applies one type of
     * transformation to the log events that are ingested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-transformer.html#cfn-logs-transformer-transformerconfig)
     */
    override fun transformerConfig(): Any = unwrap(this).getTransformerConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransformerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnTransformerProps):
        CfnTransformerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTransformerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransformerProps):
        software.amazon.awscdk.services.logs.CfnTransformerProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.CfnTransformerProps
  }
}
