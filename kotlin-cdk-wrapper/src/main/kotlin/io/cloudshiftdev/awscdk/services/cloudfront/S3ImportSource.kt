@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String

/**
 * An import source from an S3 object.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * DockerImage dockerImage;
 * IGrantable grantable;
 * ILocalBundling localBundling;
 * ImportSource s3ImportSource = S3ImportSource.fromAsset("path", AssetOptions.builder()
 * .assetHash("assetHash")
 * .assetHashType(AssetHashType.SOURCE)
 * .bundling(BundlingOptions.builder()
 * .image(dockerImage)
 * // the properties below are optional
 * .bundlingFileAccess(BundlingFileAccess.VOLUME_COPY)
 * .command(List.of("command"))
 * .entrypoint(List.of("entrypoint"))
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .local(localBundling)
 * .network("network")
 * .outputType(BundlingOutput.ARCHIVED)
 * .platform("platform")
 * .securityOpt("securityOpt")
 * .user("user")
 * .volumes(List.of(DockerVolume.builder()
 * .containerPath("containerPath")
 * .hostPath("hostPath")
 * // the properties below are optional
 * .consistency(DockerVolumeConsistency.CONSISTENT)
 * .build()))
 * .volumesFrom(List.of("volumesFrom"))
 * .workingDirectory("workingDirectory")
 * .build())
 * .deployTime(false)
 * .exclude(List.of("exclude"))
 * .followSymlinks(SymlinkFollowMode.NEVER)
 * .ignoreMode(IgnoreMode.GLOB)
 * .readers(List.of(grantable))
 * .build());
 * ```
 */
public open class S3ImportSource(
  cdkObject: software.amazon.awscdk.services.cloudfront.S3ImportSource,
) : ImportSource(cdkObject) {
  public constructor(bucket: IBucket, key: String) :
      this(software.amazon.awscdk.services.cloudfront.S3ImportSource(bucket.let(IBucket.Companion::unwrap),
      key)
  )

  /**
   * the S3 bucket that contains the data.
   */
  public open fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

  /**
   * the key within the S3 bucket that contains the data.
   */
  public open fun key(): String = unwrap(this).getKey()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.S3ImportSource):
        S3ImportSource = S3ImportSource(cdkObject)

    internal fun unwrap(wrapped: S3ImportSource):
        software.amazon.awscdk.services.cloudfront.S3ImportSource = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.S3ImportSource
  }
}
