@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * This object defines one value type that will be converted using the typeConverter processor.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * TypeConverterEntryProperty typeConverterEntryProperty = TypeConverterEntryProperty.builder()
 * .key("key")
 * .type(TypeConverterType.BOOLEAN)
 * .build();
 * ```
 */
public interface TypeConverterEntryProperty {
  /**
   * The key with the value that is to be converted to a different type.
   */
  public fun key(): String

  /**
   * The data type to convert the field value to.
   */
  public fun type(): TypeConverterType

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
     * @param type The data type to convert the field value to. 
     */
    public fun type(type: TypeConverterType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.TypeConverterEntryProperty.Builder
        = software.amazon.awscdk.services.logs.TypeConverterEntryProperty.builder()

    /**
     * @param key The key with the value that is to be converted to a different type. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param type The data type to convert the field value to. 
     */
    override fun type(type: TypeConverterType) {
      cdkBuilder.type(type.let(TypeConverterType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.TypeConverterEntryProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.TypeConverterEntryProperty,
  ) : CdkObject(cdkObject),
      TypeConverterEntryProperty {
    /**
     * The key with the value that is to be converted to a different type.
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * The data type to convert the field value to.
     */
    override fun type(): TypeConverterType = unwrap(this).getType().let(TypeConverterType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TypeConverterEntryProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.TypeConverterEntryProperty):
        TypeConverterEntryProperty = CdkObjectWrappers.wrap(cdkObject) as?
        TypeConverterEntryProperty ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TypeConverterEntryProperty):
        software.amazon.awscdk.services.logs.TypeConverterEntryProperty = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.TypeConverterEntryProperty
  }
}
