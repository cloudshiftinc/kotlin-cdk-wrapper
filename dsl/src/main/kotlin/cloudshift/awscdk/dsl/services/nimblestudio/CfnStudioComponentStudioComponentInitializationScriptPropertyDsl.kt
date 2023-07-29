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

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

/**
 * Initialization scripts for studio components.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * StudioComponentInitializationScriptProperty studioComponentInitializationScriptProperty =
 * StudioComponentInitializationScriptProperty.builder()
 * .launchProfileProtocolVersion("launchProfileProtocolVersion")
 * .platform("platform")
 * .runContext("runContext")
 * .script("script")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html)
 */
@CdkDslMarker
public class CfnStudioComponentStudioComponentInitializationScriptPropertyDsl {
    private val cdkBuilder: CfnStudioComponent.StudioComponentInitializationScriptProperty.Builder =
        CfnStudioComponent.StudioComponentInitializationScriptProperty.builder()

    /**
     * @param launchProfileProtocolVersion The version number of the protocol that is used by the
     *   launch profile. The only valid version is "2021-03-31".
     */
    public fun launchProfileProtocolVersion(launchProfileProtocolVersion: String) {
        cdkBuilder.launchProfileProtocolVersion(launchProfileProtocolVersion)
    }

    /** @param platform The platform of the initialization script, either Windows or Linux. */
    public fun platform(platform: String) {
        cdkBuilder.platform(platform)
    }

    /** @param runContext The method to use when running the initialization script. */
    public fun runContext(runContext: String) {
        cdkBuilder.runContext(runContext)
    }

    /** @param script The initialization script. */
    public fun script(script: String) {
        cdkBuilder.script(script)
    }

    public fun build(): CfnStudioComponent.StudioComponentInitializationScriptProperty =
        cdkBuilder.build()
}
