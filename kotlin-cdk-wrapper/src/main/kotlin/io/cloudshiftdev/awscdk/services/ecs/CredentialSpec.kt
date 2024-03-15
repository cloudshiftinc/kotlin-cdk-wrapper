@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Base construct for a credential specification (CredSpec).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * CredentialSpec credentialSpec = new CredentialSpec("prefixId", "fileLocation");
 * ```
 */
public open class CredentialSpec internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.CredentialSpec,
) : CdkObject(cdkObject) {
  /**
   * Called when the container is initialized to allow this object to bind to the stack.
   */
  public open fun bind(): CredentialSpecConfig = unwrap(this).bind().let(CredentialSpecConfig::wrap)

  /**
   * Location or ARN from where to retrieve the CredSpec file.
   */
  public open fun fileLocation(): String = unwrap(this).getFileLocation()

  /**
   * Prefix string based on the type of CredSpec.
   */
  public open fun prefixId(): String = unwrap(this).getPrefixId()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CredentialSpec): CredentialSpec
        = CredentialSpec(cdkObject)

    internal fun unwrap(wrapped: CredentialSpec): software.amazon.awscdk.services.ecs.CredentialSpec
        = wrapped.cdkObject
  }
}
