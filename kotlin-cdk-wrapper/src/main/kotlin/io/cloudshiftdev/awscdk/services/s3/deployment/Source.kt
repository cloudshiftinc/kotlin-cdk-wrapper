@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Specifies bucket deployment source.
 *
 * Usage:
 *
 * ```
 * Source.bucket(bucket, key)
 * Source.asset('/local/path/to/directory')
 * Source.asset('/local/path/to/a/file.zip')
 * Source.data('hello/world/file.txt', 'Hello, world!')
 * Source.jsonData('config.json', { baz: topic.topicArn })
 * Source.yamlData('config.yaml', { baz: topic.topicArn })
 * ```
 *
 * Example:
 *
 * ```
 * Bucket destinationBucket;
 * BucketDeployment deployment = BucketDeployment.Builder.create(this, "DeployFiles")
 * .sources(List.of(Source.asset(join(__dirname, "source-files"))))
 * .destinationBucket(destinationBucket)
 * .build();
 * deployment.handlerRole.addToPolicy(
 * PolicyStatement.Builder.create()
 * .actions(List.of("kms:Decrypt", "kms:DescribeKey"))
 * .effect(Effect.ALLOW)
 * .resources(List.of("&lt;encryption key ARN&gt;"))
 * .build());
 * ```
 */
public open class Source(
  cdkObject: software.amazon.awscdk.services.s3.deployment.Source,
) : CdkObject(cdkObject) {
  public companion object {
    public fun asset(path: String): ISource =
        software.amazon.awscdk.services.s3.deployment.Source.asset(path).let(ISource::wrap)

    public fun asset(path: String, options: AssetOptions): ISource =
        software.amazon.awscdk.services.s3.deployment.Source.asset(path,
        options.let(AssetOptions.Companion::unwrap)).let(ISource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b77eb868095f325ddfb755b455f0094b4fee540fdd33a0edf9ca830bf8cdb1d")
    public fun asset(path: String, options: AssetOptions.Builder.() -> Unit): ISource = asset(path,
        AssetOptions(options))

    public fun bucket(bucket: IBucket, zipObjectKey: String): ISource =
        software.amazon.awscdk.services.s3.deployment.Source.bucket(bucket.let(IBucket.Companion::unwrap),
        zipObjectKey).let(ISource::wrap)

    public fun `data`(objectKey: String, `data`: String): ISource =
        software.amazon.awscdk.services.s3.deployment.Source.`data`(objectKey,
        `data`).let(ISource::wrap)

    public fun `data`(
      objectKey: String,
      `data`: String,
      markersConfig: MarkersConfig,
    ): ISource = software.amazon.awscdk.services.s3.deployment.Source.`data`(objectKey, `data`,
        markersConfig.let(MarkersConfig.Companion::unwrap)).let(ISource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5751b70e1b1d7e262b0b7eae3b01b2623df99f145e5d66ebeba1384043fbb98a")
    public fun `data`(
      objectKey: String,
      `data`: String,
      markersConfig: MarkersConfig.Builder.() -> Unit,
    ): ISource = `data`(objectKey, `data`, MarkersConfig(markersConfig))

    public fun jsonData(objectKey: String, obj: Any): ISource =
        software.amazon.awscdk.services.s3.deployment.Source.jsonData(objectKey,
        obj).let(ISource::wrap)

    public fun jsonData(
      objectKey: String,
      obj: Any,
      jsonProcessingOptions: JsonProcessingOptions,
    ): ISource = software.amazon.awscdk.services.s3.deployment.Source.jsonData(objectKey, obj,
        jsonProcessingOptions.let(JsonProcessingOptions.Companion::unwrap)).let(ISource::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54fb6bce4fcea6a93cd3e2e8e028eea78cf8ded3ec7b28b8e233b0ced1d60a88")
    public fun jsonData(
      objectKey: String,
      obj: Any,
      jsonProcessingOptions: JsonProcessingOptions.Builder.() -> Unit,
    ): ISource = jsonData(objectKey, obj, JsonProcessingOptions(jsonProcessingOptions))

    public fun yamlData(objectKey: String, obj: Any): ISource =
        software.amazon.awscdk.services.s3.deployment.Source.yamlData(objectKey,
        obj).let(ISource::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.Source): Source =
        Source(cdkObject)

    internal fun unwrap(wrapped: Source): software.amazon.awscdk.services.s3.deployment.Source =
        wrapped.cdkObject as software.amazon.awscdk.services.s3.deployment.Source
  }
}
