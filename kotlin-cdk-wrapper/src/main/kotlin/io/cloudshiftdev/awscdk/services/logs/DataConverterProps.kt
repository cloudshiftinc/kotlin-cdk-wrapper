@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for creating data converter processors.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * DataConverterProps dataConverterProps = DataConverterProps.builder()
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
public interface DataConverterProps : BaseProcessorProps {
  /**
   * Options for datetime conversion.
   *
   * Required when type is DATETIME_CONVERTER.
   *
   * Default: - No date time converter processor is created if not set
   */
  public fun dateTimeConverterOptions(): DateTimeConverterProperty? =
      unwrap(this).getDateTimeConverterOptions()?.let(DateTimeConverterProperty::wrap)

  /**
   * The type of data conversion operation.
   */
  public fun type(): DataConverterType

  /**
   * Options for type conversion.
   *
   * Required when type is TYPE_CONVERTER.
   *
   * Default: - No type convertor processor is created if not set
   */
  public fun typeConverterOptions(): TypeConverterProperty? =
      unwrap(this).getTypeConverterOptions()?.let(TypeConverterProperty::wrap)

  /**
   * A builder for [DataConverterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dateTimeConverterOptions Options for datetime conversion.
     * Required when type is DATETIME_CONVERTER.
     */
    public fun dateTimeConverterOptions(dateTimeConverterOptions: DateTimeConverterProperty)

    /**
     * @param dateTimeConverterOptions Options for datetime conversion.
     * Required when type is DATETIME_CONVERTER.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c8bb4ccf005355156edd858053e4b13ff93716bac2b7edaa2237dae7ec4ce93")
    public
        fun dateTimeConverterOptions(dateTimeConverterOptions: DateTimeConverterProperty.Builder.() -> Unit)

    /**
     * @param type The type of data conversion operation. 
     */
    public fun type(type: DataConverterType)

    /**
     * @param typeConverterOptions Options for type conversion.
     * Required when type is TYPE_CONVERTER.
     */
    public fun typeConverterOptions(typeConverterOptions: TypeConverterProperty)

    /**
     * @param typeConverterOptions Options for type conversion.
     * Required when type is TYPE_CONVERTER.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b9d18a881e52f9b15d099add1e782aa2b256451cc583db1257ed83f480e623e")
    public fun typeConverterOptions(typeConverterOptions: TypeConverterProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.DataConverterProps.Builder =
        software.amazon.awscdk.services.logs.DataConverterProps.builder()

    /**
     * @param dateTimeConverterOptions Options for datetime conversion.
     * Required when type is DATETIME_CONVERTER.
     */
    override fun dateTimeConverterOptions(dateTimeConverterOptions: DateTimeConverterProperty) {
      cdkBuilder.dateTimeConverterOptions(dateTimeConverterOptions.let(DateTimeConverterProperty.Companion::unwrap))
    }

    /**
     * @param dateTimeConverterOptions Options for datetime conversion.
     * Required when type is DATETIME_CONVERTER.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c8bb4ccf005355156edd858053e4b13ff93716bac2b7edaa2237dae7ec4ce93")
    override
        fun dateTimeConverterOptions(dateTimeConverterOptions: DateTimeConverterProperty.Builder.() -> Unit):
        Unit = dateTimeConverterOptions(DateTimeConverterProperty(dateTimeConverterOptions))

    /**
     * @param type The type of data conversion operation. 
     */
    override fun type(type: DataConverterType) {
      cdkBuilder.type(type.let(DataConverterType.Companion::unwrap))
    }

    /**
     * @param typeConverterOptions Options for type conversion.
     * Required when type is TYPE_CONVERTER.
     */
    override fun typeConverterOptions(typeConverterOptions: TypeConverterProperty) {
      cdkBuilder.typeConverterOptions(typeConverterOptions.let(TypeConverterProperty.Companion::unwrap))
    }

    /**
     * @param typeConverterOptions Options for type conversion.
     * Required when type is TYPE_CONVERTER.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b9d18a881e52f9b15d099add1e782aa2b256451cc583db1257ed83f480e623e")
    override
        fun typeConverterOptions(typeConverterOptions: TypeConverterProperty.Builder.() -> Unit):
        Unit = typeConverterOptions(TypeConverterProperty(typeConverterOptions))

    public fun build(): software.amazon.awscdk.services.logs.DataConverterProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.DataConverterProps,
  ) : CdkObject(cdkObject),
      DataConverterProps {
    /**
     * Options for datetime conversion.
     *
     * Required when type is DATETIME_CONVERTER.
     *
     * Default: - No date time converter processor is created if not set
     */
    override fun dateTimeConverterOptions(): DateTimeConverterProperty? =
        unwrap(this).getDateTimeConverterOptions()?.let(DateTimeConverterProperty::wrap)

    /**
     * The type of data conversion operation.
     */
    override fun type(): DataConverterType = unwrap(this).getType().let(DataConverterType::wrap)

    /**
     * Options for type conversion.
     *
     * Required when type is TYPE_CONVERTER.
     *
     * Default: - No type convertor processor is created if not set
     */
    override fun typeConverterOptions(): TypeConverterProperty? =
        unwrap(this).getTypeConverterOptions()?.let(TypeConverterProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DataConverterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.DataConverterProps):
        DataConverterProps = CdkObjectWrappers.wrap(cdkObject) as? DataConverterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DataConverterProps):
        software.amazon.awscdk.services.logs.DataConverterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.DataConverterProps
  }
}
