@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class CredentialSpec internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.CredentialSpec,
) : CdkObject(cdkObject) {
  public open fun bind(): CredentialSpecConfig = unwrap(this).bind().let(CredentialSpecConfig::wrap)

  public open fun fileLocation(): String = unwrap(this).getFileLocation()

  public open fun prefixId(): String = unwrap(this).getPrefixId()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CredentialSpec): CredentialSpec
        = CredentialSpec(cdkObject)

    internal fun unwrap(wrapped: CredentialSpec): software.amazon.awscdk.services.ecs.CredentialSpec
        = wrapped.cdkObject
  }
}
