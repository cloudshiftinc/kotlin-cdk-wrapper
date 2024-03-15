@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class Runtime internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.synthetics.Runtime,
) : CdkObject(cdkObject) {
  public open fun family(): RuntimeFamily = unwrap(this).getFamily().let(RuntimeFamily::wrap)

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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.Runtime): Runtime =
        Runtime(cdkObject)

    internal fun unwrap(wrapped: Runtime): software.amazon.awscdk.services.synthetics.Runtime =
        wrapped.cdkObject
  }
}
