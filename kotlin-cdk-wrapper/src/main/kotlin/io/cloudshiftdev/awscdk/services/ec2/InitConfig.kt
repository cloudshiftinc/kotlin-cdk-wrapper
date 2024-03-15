@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean

public open class InitConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InitConfig,
) : CdkObject(cdkObject) {
  public open fun add(elements: InitElement) {
    unwrap(this).add(elements.let(InitElement::unwrap))
  }

  public open fun isEmpty(): Boolean = unwrap(this).isEmpty()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitConfig): InitConfig =
        InitConfig(cdkObject)

    internal fun unwrap(wrapped: InitConfig): software.amazon.awscdk.services.ec2.InitConfig =
        wrapped.cdkObject
  }
}
