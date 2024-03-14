package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class InitUser internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InitUser,
) : InitElement(cdkObject) {
  /**
   * Returns the init element type for this element.
   */
  public override fun elementType(): String = unwrap(this).getElementType()

  public companion object {
    public fun fromName(userName: String): InitUser =
        software.amazon.awscdk.services.ec2.InitUser.fromName(userName).let(InitUser::wrap)

    public fun fromName(userName: String, options: InitUserOptions): InitUser =
        software.amazon.awscdk.services.ec2.InitUser.fromName(userName,
        options.let(InitUserOptions::unwrap)).let(InitUser::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a26924dae7a8166afd97f6d7679d8e626cdef31a879e208222d57659d8c37f9")
    public fun fromName(userName: String, options: InitUserOptions.Builder.() -> Unit): InitUser =
        fromName(userName, InitUserOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitUser): InitUser =
        InitUser(cdkObject)

    internal fun unwrap(wrapped: InitUser): software.amazon.awscdk.services.ec2.InitUser =
        wrapped.cdkObject
  }
}
