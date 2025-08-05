@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * This processor takes a list of objects that contain key fields, and converts them into a map of
 * target keys.
 *
 * For more information about this processor including examples, see listToMap in the CloudWatch
 * Logs User Guide.
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
 */
public interface ListToMapProperty {
  /**
   * A Boolean value to indicate whether the list will be flattened into single items.
   *
   * Default: false
   */
  public fun flatten(): Boolean? = unwrap(this).getFlatten()

  /**
   * If you set flatten to true, use flattenedElement to specify which element, first or last, to
   * keep.
   *
   * You must specify this parameter if flatten is true.
   *
   * Default: - Must be specified if flatten is true and if flatten is false, has no effect
   */
  public fun flattenedElement(): String? = unwrap(this).getFlattenedElement()

  /**
   * The key of the field to be extracted as keys in the generated map.
   */
  public fun key(): String

  /**
   * The key in the log event that has a list of objects that will be converted to a map.
   */
  public fun source(): String

  /**
   * The key of the field that will hold the generated map.
   *
   * Default: - Stored at the root of the log event
   */
  public fun target(): String? = unwrap(this).getTarget()

  /**
   * If this is specified, the values that you specify in this parameter will be extracted from the
   * source objects and put into the values of the generated map.
   *
   * Default: - Original objects in the source list will be put into the values of the generated map
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
     */
    public fun flatten(flatten: Boolean)

    /**
     * @param flattenedElement If you set flatten to true, use flattenedElement to specify which
     * element, first or last, to keep.
     * You must specify this parameter if flatten is true.
     */
    public fun flattenedElement(flattenedElement: String)

    /**
     * @param key The key of the field to be extracted as keys in the generated map. 
     */
    public fun key(key: String)

    /**
     * @param source The key in the log event that has a list of objects that will be converted to a
     * map. 
     */
    public fun source(source: String)

    /**
     * @param target The key of the field that will hold the generated map.
     */
    public fun target(target: String)

    /**
     * @param valueKey If this is specified, the values that you specify in this parameter will be
     * extracted from the source objects and put into the values of the generated map.
     */
    public fun valueKey(valueKey: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.ListToMapProperty.Builder =
        software.amazon.awscdk.services.logs.ListToMapProperty.builder()

    /**
     * @param flatten A Boolean value to indicate whether the list will be flattened into single
     * items.
     */
    override fun flatten(flatten: Boolean) {
      cdkBuilder.flatten(flatten)
    }

    /**
     * @param flattenedElement If you set flatten to true, use flattenedElement to specify which
     * element, first or last, to keep.
     * You must specify this parameter if flatten is true.
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
     * @param source The key in the log event that has a list of objects that will be converted to a
     * map. 
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
     * extracted from the source objects and put into the values of the generated map.
     */
    override fun valueKey(valueKey: String) {
      cdkBuilder.valueKey(valueKey)
    }

    public fun build(): software.amazon.awscdk.services.logs.ListToMapProperty = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.ListToMapProperty,
  ) : CdkObject(cdkObject),
      ListToMapProperty {
    /**
     * A Boolean value to indicate whether the list will be flattened into single items.
     *
     * Default: false
     */
    override fun flatten(): Boolean? = unwrap(this).getFlatten()

    /**
     * If you set flatten to true, use flattenedElement to specify which element, first or last, to
     * keep.
     *
     * You must specify this parameter if flatten is true.
     *
     * Default: - Must be specified if flatten is true and if flatten is false, has no effect
     */
    override fun flattenedElement(): String? = unwrap(this).getFlattenedElement()

    /**
     * The key of the field to be extracted as keys in the generated map.
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * The key in the log event that has a list of objects that will be converted to a map.
     */
    override fun source(): String = unwrap(this).getSource()

    /**
     * The key of the field that will hold the generated map.
     *
     * Default: - Stored at the root of the log event
     */
    override fun target(): String? = unwrap(this).getTarget()

    /**
     * If this is specified, the values that you specify in this parameter will be extracted from
     * the source objects and put into the values of the generated map.
     *
     * Default: - Original objects in the source list will be put into the values of the generated
     * map
     */
    override fun valueKey(): String? = unwrap(this).getValueKey()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ListToMapProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ListToMapProperty):
        ListToMapProperty = CdkObjectWrappers.wrap(cdkObject) as? ListToMapProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ListToMapProperty):
        software.amazon.awscdk.services.logs.ListToMapProperty = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.ListToMapProperty
  }
}
