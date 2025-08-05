@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Processor for data conversion operations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * DataConverterProcessor dataConverterProcessor = DataConverterProcessor.Builder.create()
 * .type(DataConverterType.TYPE_CONVERTER)
 * // the properties below are optional
 * .dateTimeConverterOptions(DateTimeConverterProperty.builder()
 * .locale("locale")
 * .matchPatterns(List.of("matchPatterns"))
 * .source("source")
 * .target("target")
 * // the properties below are optional
 * .sourceTimezone("sourceTimezone")
 * .targetFormat("targetFormat")
 * .targetTimezone("targetTimezone")
 * .build())
 * .typeConverterOptions(TypeConverterProperty.builder()
 * .entries(List.of(TypeConverterEntryProperty.builder()
 * .key("key")
 * .type(TypeConverterType.BOOLEAN)
 * .build()))
 * .build())
 * .build();
 * ```
 */
public open class DataConverterProcessor(
  cdkObject: software.amazon.awscdk.services.logs.DataConverterProcessor,
) : CdkObject(cdkObject),
    IProcessor {
  public constructor(props: DataConverterProps) :
      this(software.amazon.awscdk.services.logs.DataConverterProcessor(props.let(DataConverterProps.Companion::unwrap))
  )

  public constructor(props: DataConverterProps.Builder.() -> Unit) : this(DataConverterProps(props)
  )

  /**
   * The type of data conversion operation.
   */
  public open fun type(): DataConverterType = unwrap(this).getType().let(DataConverterType::wrap)

  /**
   * The type of data conversion operation.
   */
  public open fun type(`value`: DataConverterType) {
    unwrap(this).setType(`value`.let(DataConverterType.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.DataConverterProcessor].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Options for datetime conversion.
     *
     * Required when type is DATETIME_CONVERTER.
     *
     * Default: - No date time converter processor is created if not set
     *
     * @param dateTimeConverterOptions Options for datetime conversion. 
     */
    public fun dateTimeConverterOptions(dateTimeConverterOptions: DateTimeConverterProperty)

    /**
     * Options for datetime conversion.
     *
     * Required when type is DATETIME_CONVERTER.
     *
     * Default: - No date time converter processor is created if not set
     *
     * @param dateTimeConverterOptions Options for datetime conversion. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5b6b0b5bee83ce067d67c609802fd51098f50274a25b1e16f88fcd6a8ec0131")
    public
        fun dateTimeConverterOptions(dateTimeConverterOptions: DateTimeConverterProperty.Builder.() -> Unit)

    /**
     * The type of data conversion operation.
     *
     * @param type The type of data conversion operation. 
     */
    public fun type(type: DataConverterType)

    /**
     * Options for type conversion.
     *
     * Required when type is TYPE_CONVERTER.
     *
     * Default: - No type convertor processor is created if not set
     *
     * @param typeConverterOptions Options for type conversion. 
     */
    public fun typeConverterOptions(typeConverterOptions: TypeConverterProperty)

    /**
     * Options for type conversion.
     *
     * Required when type is TYPE_CONVERTER.
     *
     * Default: - No type convertor processor is created if not set
     *
     * @param typeConverterOptions Options for type conversion. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34cf2fbbdc24bb9624cb051acca728b2489244d605999f8c197a129f2b27388a")
    public fun typeConverterOptions(typeConverterOptions: TypeConverterProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.DataConverterProcessor.Builder =
        software.amazon.awscdk.services.logs.DataConverterProcessor.Builder.create()

    /**
     * Options for datetime conversion.
     *
     * Required when type is DATETIME_CONVERTER.
     *
     * Default: - No date time converter processor is created if not set
     *
     * @param dateTimeConverterOptions Options for datetime conversion. 
     */
    override fun dateTimeConverterOptions(dateTimeConverterOptions: DateTimeConverterProperty) {
      cdkBuilder.dateTimeConverterOptions(dateTimeConverterOptions.let(DateTimeConverterProperty.Companion::unwrap))
    }

    /**
     * Options for datetime conversion.
     *
     * Required when type is DATETIME_CONVERTER.
     *
     * Default: - No date time converter processor is created if not set
     *
     * @param dateTimeConverterOptions Options for datetime conversion. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5b6b0b5bee83ce067d67c609802fd51098f50274a25b1e16f88fcd6a8ec0131")
    override
        fun dateTimeConverterOptions(dateTimeConverterOptions: DateTimeConverterProperty.Builder.() -> Unit):
        Unit = dateTimeConverterOptions(DateTimeConverterProperty(dateTimeConverterOptions))

    /**
     * The type of data conversion operation.
     *
     * @param type The type of data conversion operation. 
     */
    override fun type(type: DataConverterType) {
      cdkBuilder.type(type.let(DataConverterType.Companion::unwrap))
    }

    /**
     * Options for type conversion.
     *
     * Required when type is TYPE_CONVERTER.
     *
     * Default: - No type convertor processor is created if not set
     *
     * @param typeConverterOptions Options for type conversion. 
     */
    override fun typeConverterOptions(typeConverterOptions: TypeConverterProperty) {
      cdkBuilder.typeConverterOptions(typeConverterOptions.let(TypeConverterProperty.Companion::unwrap))
    }

    /**
     * Options for type conversion.
     *
     * Required when type is TYPE_CONVERTER.
     *
     * Default: - No type convertor processor is created if not set
     *
     * @param typeConverterOptions Options for type conversion. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34cf2fbbdc24bb9624cb051acca728b2489244d605999f8c197a129f2b27388a")
    override
        fun typeConverterOptions(typeConverterOptions: TypeConverterProperty.Builder.() -> Unit):
        Unit = typeConverterOptions(TypeConverterProperty(typeConverterOptions))

    public fun build(): software.amazon.awscdk.services.logs.DataConverterProcessor =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DataConverterProcessor {
      val builderImpl = BuilderImpl()
      return DataConverterProcessor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.DataConverterProcessor):
        DataConverterProcessor = DataConverterProcessor(cdkObject)

    internal fun unwrap(wrapped: DataConverterProcessor):
        software.amazon.awscdk.services.logs.DataConverterProcessor = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.DataConverterProcessor
  }
}
