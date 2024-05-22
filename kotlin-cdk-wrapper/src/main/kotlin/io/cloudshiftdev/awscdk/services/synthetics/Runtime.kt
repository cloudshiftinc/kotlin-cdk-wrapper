@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Runtime options for a canary.
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
public open class Runtime(
  cdkObject: software.amazon.awscdk.services.synthetics.Runtime,
) : CdkObject(cdkObject) {
  public constructor(name: String, family: RuntimeFamily) :
      this(software.amazon.awscdk.services.synthetics.Runtime(name,
      family.let(RuntimeFamily.Companion::unwrap))
  )

  /**
   * The Lambda runtime family.
   */
  public open fun family(): RuntimeFamily = unwrap(this).getFamily().let(RuntimeFamily::wrap)

  /**
   * The name of the runtime version.
   */
  public open fun name(): String = unwrap(this).getName()

  public companion object {
    public val SYNTHETICS_NODEJS_PUPPETEER_3_5: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_NODEJS_PUPPETEER_3_5)

    public val SYNTHETICS_NODEJS_PUPPETEER_3_6: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_NODEJS_PUPPETEER_3_6)

    public val SYNTHETICS_NODEJS_PUPPETEER_3_7: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_NODEJS_PUPPETEER_3_7)

    public val SYNTHETICS_NODEJS_PUPPETEER_3_8: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_NODEJS_PUPPETEER_3_8)

    public val SYNTHETICS_NODEJS_PUPPETEER_3_9: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_NODEJS_PUPPETEER_3_9)

    public val SYNTHETICS_NODEJS_PUPPETEER_4_0: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_NODEJS_PUPPETEER_4_0)

    public val SYNTHETICS_NODEJS_PUPPETEER_5_0: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_NODEJS_PUPPETEER_5_0)

    public val SYNTHETICS_NODEJS_PUPPETEER_5_1: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_NODEJS_PUPPETEER_5_1)

    public val SYNTHETICS_NODEJS_PUPPETEER_5_2: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_NODEJS_PUPPETEER_5_2)

    public val SYNTHETICS_NODEJS_PUPPETEER_6_0: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_NODEJS_PUPPETEER_6_0)

    public val SYNTHETICS_NODEJS_PUPPETEER_6_1: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_NODEJS_PUPPETEER_6_1)

    public val SYNTHETICS_NODEJS_PUPPETEER_6_2: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_NODEJS_PUPPETEER_6_2)

    public val SYNTHETICS_NODEJS_PUPPETEER_7_0: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_NODEJS_PUPPETEER_7_0)

    public val SYNTHETICS_PYTHON_SELENIUM_1_0: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_PYTHON_SELENIUM_1_0)

    public val SYNTHETICS_PYTHON_SELENIUM_1_1: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_PYTHON_SELENIUM_1_1)

    public val SYNTHETICS_PYTHON_SELENIUM_1_2: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_PYTHON_SELENIUM_1_2)

    public val SYNTHETICS_PYTHON_SELENIUM_1_3: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_PYTHON_SELENIUM_1_3)

    public val SYNTHETICS_PYTHON_SELENIUM_2_0: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_PYTHON_SELENIUM_2_0)

    public val SYNTHETICS_PYTHON_SELENIUM_2_1: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_PYTHON_SELENIUM_2_1)

    public val SYNTHETICS_PYTHON_SELENIUM_3_0: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.synthetics.Runtime.SYNTHETICS_PYTHON_SELENIUM_3_0)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.Runtime): Runtime =
        Runtime(cdkObject)

    internal fun unwrap(wrapped: Runtime): software.amazon.awscdk.services.synthetics.Runtime =
        wrapped.cdkObject as software.amazon.awscdk.services.synthetics.Runtime
  }
}
