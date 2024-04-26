@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String

/**
 * An import source from an inline string.
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
 * ImportSource inlineImportSource = InlineImportSource.fromAsset("path", AssetOptions.builder()
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
public open class InlineImportSource(
  cdkObject: software.amazon.awscdk.services.cloudfront.InlineImportSource,
) : ImportSource(cdkObject) {
  public constructor(`data`: String) :
      this(software.amazon.awscdk.services.cloudfront.InlineImportSource(`data`)
  )

  /**
   * the contents of the KeyValueStore.
   */
  public open fun `data`(): String = unwrap(this).getData()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.InlineImportSource):
        InlineImportSource = InlineImportSource(cdkObject)

    internal fun unwrap(wrapped: InlineImportSource):
        software.amazon.awscdk.services.cloudfront.InlineImportSource = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.InlineImportSource
  }
}
