@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class DockerBuildSecret internal constructor(
  internal override val cdkObject: software.amazon.awscdk.DockerBuildSecret,
) : CdkObject(cdkObject) {
  public companion object {
    public fun fromSrc(src: String): String = software.amazon.awscdk.DockerBuildSecret.fromSrc(src)

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerBuildSecret): DockerBuildSecret =
        DockerBuildSecret(cdkObject)

    internal fun unwrap(wrapped: DockerBuildSecret): software.amazon.awscdk.DockerBuildSecret =
        wrapped.cdkObject
  }
}
