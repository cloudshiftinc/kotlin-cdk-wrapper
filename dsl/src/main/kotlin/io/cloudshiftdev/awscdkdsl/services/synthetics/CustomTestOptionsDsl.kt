@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.synthetics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.synthetics.Code
import software.amazon.awscdk.services.synthetics.CustomTestOptions

/**
 * Properties for specifying a test.
 *
 * Example:
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
@CdkDslMarker
public class CustomTestOptionsDsl {
    private val cdkBuilder: CustomTestOptions.Builder = CustomTestOptions.builder()

    /** @param code The code of the canary script. */
    public fun code(code: Code) {
        cdkBuilder.code(code)
    }

    /** @param handler The handler for the code. Must end with `.handler`. */
    public fun handler(handler: String) {
        cdkBuilder.handler(handler)
    }

    public fun build(): CustomTestOptions = cdkBuilder.build()
}
