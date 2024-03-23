@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Specify a test that the canary should run.
 *
 * Example:
 *
 * ```
 * Canary canary = Canary.Builder.create(this, "MyCanary")
 * .schedule(Schedule.rate(Duration.minutes(5)))
 * .test(Test.custom(CustomTestOptions.builder()
 * .code(Code.fromAsset(join(__dirname, "canary")))
 * .handler("index.handler")
 * .build()))
 * .runtime(Runtime.SYNTHETICS_NODEJS_PUPPETEER_6_2)
 * .environmentVariables(Map.of(
 * "stage", "prod"))
 * .build();
 * ```
 */
public open class Test(
  cdkObject: software.amazon.awscdk.services.synthetics.Test,
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9751a1027e751f9c259ce442960e603f2d6df7ed16fa356804ec2849517b6c85")
    public fun custom(options: CustomTestOptions.Builder.() -> Unit): Test =
        custom(CustomTestOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.Test): Test =
        Test(cdkObject)

    internal fun unwrap(wrapped: Test): software.amazon.awscdk.services.synthetics.Test =
        wrapped.cdkObject as software.amazon.awscdk.services.synthetics.Test
  }
}
