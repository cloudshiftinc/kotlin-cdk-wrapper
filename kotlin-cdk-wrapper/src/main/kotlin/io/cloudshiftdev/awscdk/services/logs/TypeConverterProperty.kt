@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Use this processor to convert a value type associated with the specified key to the specified
 * type.
 *
 * It's a casting processor that changes the types of the specified fields.
 * For more information about this processor including examples, see typeConverter in the CloudWatch
 * Logs User Guide.
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
 * .type(TypeConverterType.BOOLEAN)
 * .build()))
 * .build();
 * ```
 */
public interface TypeConverterProperty {
  /**
   * An array of TypeConverterEntry objects, where each object contains information about one field
   * to change the type of.
   */
  public fun entries(): List<TypeConverterEntryProperty>

  /**
   * A builder for [TypeConverterProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param entries An array of TypeConverterEntry objects, where each object contains information
     * about one field to change the type of. 
     */
    public fun entries(entries: List<TypeConverterEntryProperty>)

    /**
     * @param entries An array of TypeConverterEntry objects, where each object contains information
     * about one field to change the type of. 
     */
    public fun entries(vararg entries: TypeConverterEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.TypeConverterProperty.Builder =
        software.amazon.awscdk.services.logs.TypeConverterProperty.builder()

    /**
     * @param entries An array of TypeConverterEntry objects, where each object contains information
     * about one field to change the type of. 
     */
    override fun entries(entries: List<TypeConverterEntryProperty>) {
      cdkBuilder.entries(entries.map(TypeConverterEntryProperty.Companion::unwrap))
    }

    /**
     * @param entries An array of TypeConverterEntry objects, where each object contains information
     * about one field to change the type of. 
     */
    override fun entries(vararg entries: TypeConverterEntryProperty): Unit =
        entries(entries.toList())

    public fun build(): software.amazon.awscdk.services.logs.TypeConverterProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.TypeConverterProperty,
  ) : CdkObject(cdkObject),
      TypeConverterProperty {
    /**
     * An array of TypeConverterEntry objects, where each object contains information about one
     * field to change the type of.
     */
    override fun entries(): List<TypeConverterEntryProperty> =
        unwrap(this).getEntries().map(TypeConverterEntryProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TypeConverterProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.TypeConverterProperty):
        TypeConverterProperty = CdkObjectWrappers.wrap(cdkObject) as? TypeConverterProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TypeConverterProperty):
        software.amazon.awscdk.services.logs.TypeConverterProperty = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.TypeConverterProperty
  }
}
