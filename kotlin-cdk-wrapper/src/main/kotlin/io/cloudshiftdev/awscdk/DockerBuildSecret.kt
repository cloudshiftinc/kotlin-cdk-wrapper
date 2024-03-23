@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Methods to build Docker CLI arguments for builds using secrets.
 *
 * Docker BuildKit must be enabled to use build secrets.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * DockerBuildSecret dockerBuildSecret = new DockerBuildSecret();
 * ```
 *
 * [Documentation](https://docs.docker.com/build/buildkit/)
 */
public open class DockerBuildSecret(
  cdkObject: software.amazon.awscdk.DockerBuildSecret,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.DockerBuildSecret()
  )

  public companion object {
    public fun fromSrc(src: String): String = software.amazon.awscdk.DockerBuildSecret.fromSrc(src)

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerBuildSecret): DockerBuildSecret =
        DockerBuildSecret(cdkObject)

    internal fun unwrap(wrapped: DockerBuildSecret): software.amazon.awscdk.DockerBuildSecret =
        wrapped.cdkObject as software.amazon.awscdk.DockerBuildSecret
  }
}
