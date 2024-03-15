@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class Source internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.deployment.Source,
) : CdkObject(cdkObject) {
  public companion object {
    public fun asset(path: String): ISource =
        software.amazon.awscdk.services.s3.deployment.Source.asset(path).let(ISource::wrap)

    public fun asset(path: String, options: AssetOptions): ISource =
        software.amazon.awscdk.services.s3.deployment.Source.asset(path,
        options.let(AssetOptions::unwrap)).let(ISource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b77eb868095f325ddfb755b455f0094b4fee540fdd33a0edf9ca830bf8cdb1d")
    public fun asset(path: String, options: AssetOptions.Builder.() -> Unit): ISource = asset(path,
        AssetOptions(options))

    public fun bucket(bucket: IBucket, zipObjectKey: String): ISource =
        software.amazon.awscdk.services.s3.deployment.Source.bucket(bucket.let(IBucket::unwrap),
        zipObjectKey).let(ISource::wrap)

    public fun `data`(objectKey: String, `data`: String): ISource =
        software.amazon.awscdk.services.s3.deployment.Source.`data`(objectKey,
        `data`).let(ISource::wrap)

    public fun jsonData(objectKey: String, obj: Any): ISource =
        software.amazon.awscdk.services.s3.deployment.Source.jsonData(objectKey,
        obj).let(ISource::wrap)

    public fun yamlData(objectKey: String, obj: Any): ISource =
        software.amazon.awscdk.services.s3.deployment.Source.yamlData(objectKey,
        obj).let(ISource::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.Source): Source =
        Source(cdkObject)

    internal fun unwrap(wrapped: Source): software.amazon.awscdk.services.s3.deployment.Source =
        wrapped.cdkObject
  }
}
