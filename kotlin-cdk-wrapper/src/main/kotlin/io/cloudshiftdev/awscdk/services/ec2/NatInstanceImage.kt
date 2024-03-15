@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

/**
 * Machine image representing the latest NAT instance image.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * NatInstanceImage natInstanceImage = new NatInstanceImage();
 * ```
 */
public open class NatInstanceImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.NatInstanceImage,
) : LookupMachineImage(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.ec2.NatInstanceImage()
  )

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NatInstanceImage):
        NatInstanceImage = NatInstanceImage(cdkObject)

    internal fun unwrap(wrapped: NatInstanceImage):
        software.amazon.awscdk.services.ec2.NatInstanceImage = wrapped.cdkObject
  }
}
