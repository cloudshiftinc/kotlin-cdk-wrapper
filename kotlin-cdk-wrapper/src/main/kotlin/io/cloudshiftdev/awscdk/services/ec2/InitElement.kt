@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public abstract class InitElement internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InitElement,
) : CdkObject(cdkObject) {
  public open fun elementType(): String = unwrap(this).getElementType()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.InitElement,
  ) : InitElement(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitElement): InitElement =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: InitElement): software.amazon.awscdk.services.ec2.InitElement =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.InitElement
  }
}
