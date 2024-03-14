package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String

public abstract class InitElement internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.InitElement,
) {
  public open fun elementType(): String = unwrap(this).getElementType()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.InitElement,
  ) : InitElement(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitElement): InitElement =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: InitElement): software.amazon.awscdk.services.ec2.InitElement =
        (wrapped as Wrapper).cdkObject
  }
}
