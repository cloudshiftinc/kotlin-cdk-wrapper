@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public open class NatInstanceImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.NatInstanceImage,
) : LookupMachineImage(cdkObject) {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NatInstanceImage):
        NatInstanceImage = NatInstanceImage(cdkObject)

    internal fun unwrap(wrapped: NatInstanceImage):
        software.amazon.awscdk.services.ec2.NatInstanceImage = wrapped.cdkObject
  }
}
