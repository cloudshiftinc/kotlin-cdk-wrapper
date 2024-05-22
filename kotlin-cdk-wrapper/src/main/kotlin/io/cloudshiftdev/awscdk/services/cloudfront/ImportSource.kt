@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The data to be imported to the key value store.
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
public abstract class ImportSource(
  cdkObject: software.amazon.awscdk.services.cloudfront.ImportSource,
) : CdkObject(cdkObject) {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.ImportSource,
  ) : ImportSource(cdkObject)

  public companion object {
    public fun fromAsset(path: String): ImportSource =
        software.amazon.awscdk.services.cloudfront.ImportSource.fromAsset(path).let(ImportSource::wrap)

    public fun fromAsset(path: String, options: AssetOptions): ImportSource =
        software.amazon.awscdk.services.cloudfront.ImportSource.fromAsset(path,
        options.let(AssetOptions.Companion::unwrap)).let(ImportSource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f124ce3ae32c31d3514a4d8c0a2163847255a9bb91b1e1eb8db2fc74831f451f")
    public fun fromAsset(path: String, options: AssetOptions.Builder.() -> Unit): ImportSource =
        fromAsset(path, AssetOptions(options))

    public fun fromBucket(bucket: IBucket, key: String): ImportSource =
        software.amazon.awscdk.services.cloudfront.ImportSource.fromBucket(bucket.let(IBucket.Companion::unwrap),
        key).let(ImportSource::wrap)

    public fun fromInline(`data`: String): ImportSource =
        software.amazon.awscdk.services.cloudfront.ImportSource.fromInline(`data`).let(ImportSource::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ImportSource):
        ImportSource = CdkObjectWrappers.wrap(cdkObject) as? ImportSource ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ImportSource):
        software.amazon.awscdk.services.cloudfront.ImportSource = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.ImportSource
  }
}
