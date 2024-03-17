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
 * KeyValueStore store = KeyValueStore.Builder.create(this, "KeyValueStore")
 * .keyValueStoreName("KeyValueStore")
 * .source(ImportSource.fromAsset("path-to-data.json"))
 * .build();
 * ```
 */
public abstract class ImportSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.ImportSource,
) : CdkObject(cdkObject) {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.ImportSource,
  ) : ImportSource(cdkObject)

  public companion object {
    public fun fromAsset(path: String): ImportSource =
        software.amazon.awscdk.services.cloudfront.ImportSource.fromAsset(path).let(ImportSource::wrap)

    public fun fromAsset(path: String, options: AssetOptions): ImportSource =
        software.amazon.awscdk.services.cloudfront.ImportSource.fromAsset(path,
        options.let(AssetOptions::unwrap)).let(ImportSource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f124ce3ae32c31d3514a4d8c0a2163847255a9bb91b1e1eb8db2fc74831f451f")
    public fun fromAsset(path: String, options: AssetOptions.Builder.() -> Unit): ImportSource =
        fromAsset(path, AssetOptions(options))

    public fun fromBucket(bucket: IBucket, key: String): ImportSource =
        software.amazon.awscdk.services.cloudfront.ImportSource.fromBucket(bucket.let(IBucket::unwrap),
        key).let(ImportSource::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ImportSource):
        ImportSource = CdkObjectWrappers.wrap(cdkObject) as? ImportSource ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ImportSource):
        software.amazon.awscdk.services.cloudfront.ImportSource = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.ImportSource
  }
}
