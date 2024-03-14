package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Boolean

public open class InitConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.InitConfig,
) {
  public open fun add(elements: InitElement) {
    unwrap(this).add(elements.let(InitElement::unwrap))
  }

  public open fun isEmpty(): Boolean = unwrap(this).isEmpty()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitConfig): InitConfig =
        InitConfig(cdkObject)

    internal fun unwrap(wrapped: InitConfig): software.amazon.awscdk.services.ec2.InitConfig =
        wrapped.cdkObject
  }
}
