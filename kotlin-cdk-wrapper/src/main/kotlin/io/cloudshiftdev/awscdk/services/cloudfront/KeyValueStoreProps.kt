@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The properties to create a Key Value Store.
 *
 * Example:
 *
 * ```
 * KeyValueStore storeAsset = KeyValueStore.Builder.create(this, "KeyValueStoreAsset")
 * .keyValueStoreName("KeyValueStoreAsset")
 * .source(ImportSource.fromAsset("path-to-data.json"))
 * .build();
 * KeyValueStore storeInline = KeyValueStore.Builder.create(this, "KeyValueStoreInline")
 * .keyValueStoreName("KeyValueStoreInline")
 * .source(ImportSource.fromInline(JSON.stringify(Map.of(
 * "data", List.of(Map.of(
 * "key", "key1",
 * "value", "value1"), Map.of(
 * "key", "key2",
 * "value", "value2"))))))
 * .build();
 * ```
 */
public interface KeyValueStoreProps {
  /**
   * A comment for the Key Value Store.
   *
   * Default: No comment will be specified
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * The unique name of the Key Value Store.
   *
   * Default: A generated name
   */
  public fun keyValueStoreName(): String? = unwrap(this).getKeyValueStoreName()

  /**
   * The import source for the Key Value Store.
   *
   * This will populate the initial items in the Key Value Store. The
   * source data must be in a valid JSON format.
   *
   * Default: No data will be imported to the store
   */
  public fun source(): ImportSource? = unwrap(this).getSource()?.let(ImportSource::wrap)

  /**
   * A builder for [KeyValueStoreProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment A comment for the Key Value Store.
     */
    public fun comment(comment: String)

    /**
     * @param keyValueStoreName The unique name of the Key Value Store.
     */
    public fun keyValueStoreName(keyValueStoreName: String)

    /**
     * @param source The import source for the Key Value Store.
     * This will populate the initial items in the Key Value Store. The
     * source data must be in a valid JSON format.
     */
    public fun source(source: ImportSource)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.KeyValueStoreProps.Builder =
        software.amazon.awscdk.services.cloudfront.KeyValueStoreProps.builder()

    /**
     * @param comment A comment for the Key Value Store.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param keyValueStoreName The unique name of the Key Value Store.
     */
    override fun keyValueStoreName(keyValueStoreName: String) {
      cdkBuilder.keyValueStoreName(keyValueStoreName)
    }

    /**
     * @param source The import source for the Key Value Store.
     * This will populate the initial items in the Key Value Store. The
     * source data must be in a valid JSON format.
     */
    override fun source(source: ImportSource) {
      cdkBuilder.source(source.let(ImportSource::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.KeyValueStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.KeyValueStoreProps,
  ) : CdkObject(cdkObject), KeyValueStoreProps {
    /**
     * A comment for the Key Value Store.
     *
     * Default: No comment will be specified
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * The unique name of the Key Value Store.
     *
     * Default: A generated name
     */
    override fun keyValueStoreName(): String? = unwrap(this).getKeyValueStoreName()

    /**
     * The import source for the Key Value Store.
     *
     * This will populate the initial items in the Key Value Store. The
     * source data must be in a valid JSON format.
     *
     * Default: No data will be imported to the store
     */
    override fun source(): ImportSource? = unwrap(this).getSource()?.let(ImportSource::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeyValueStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.KeyValueStoreProps):
        KeyValueStoreProps = CdkObjectWrappers.wrap(cdkObject) as? KeyValueStoreProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyValueStoreProps):
        software.amazon.awscdk.services.cloudfront.KeyValueStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.KeyValueStoreProps
  }
}
