package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Boolean

public open class InitConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InitConfig,
) : CdkObject(cdkObject) {
  /**
   * Add one or more elements to the config.
   *
   * @param elements 
   */
  public open fun add(elements: InitElement) {
    unwrap(this).add(elements.let(InitElement::unwrap))
  }

  /**
   * Whether this configset has elements or not.
   */
  public open fun isEmpty(): Boolean = unwrap(this).isEmpty()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitConfig): InitConfig =
        InitConfig(cdkObject)

    internal fun unwrap(wrapped: InitConfig): software.amazon.awscdk.services.ec2.InitConfig =
        wrapped.cdkObject
  }
}
