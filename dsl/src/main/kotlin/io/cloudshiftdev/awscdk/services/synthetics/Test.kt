package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class Test internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.synthetics.Test,
) : CdkObject(cdkObject) {
  /**
   * The code that the canary should run.
   */
  public open fun code(): Code = unwrap(this).getCode().let(Code::wrap)

  /**
   * The handler of the canary.
   */
  public open fun handler(): String = unwrap(this).getHandler()

  public companion object {
    public fun custom(options: CustomTestOptions): Test =
        software.amazon.awscdk.services.synthetics.Test.custom(options.let(CustomTestOptions::unwrap)).let(Test::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9751a1027e751f9c259ce442960e603f2d6df7ed16fa356804ec2849517b6c85")
    public fun custom(options: CustomTestOptions.Builder.() -> Unit): Test =
        custom(CustomTestOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.Test): Test =
        Test(cdkObject)

    internal fun unwrap(wrapped: Test): software.amazon.awscdk.services.synthetics.Test =
        wrapped.cdkObject
  }
}
