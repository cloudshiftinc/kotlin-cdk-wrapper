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

import kotlin.Unit
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile
import software.amazon.awscdk.services.nimblestudio.CfnStudio
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

/** A configuration for a streaming session. */
public inline fun CfnLaunchProfile.setStreamConfiguration(
    block: CfnLaunchProfileStreamConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnLaunchProfileStreamConfigurationPropertyDsl()
    builder.apply(block)
    return setStreamConfiguration(builder.build())
}

/** Configuration of the encryption method that is used for the studio. */
public inline fun CfnStudio.setStudioEncryptionConfiguration(
    block: CfnStudioStudioEncryptionConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStudioStudioEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return setStudioEncryptionConfiguration(builder.build())
}

/** The configuration of the studio component, based on component type. */
public inline fun CfnStudioComponent.setConfiguration(
    block: CfnStudioComponentStudioComponentConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStudioComponentStudioComponentConfigurationPropertyDsl()
    builder.apply(block)
    return setConfiguration(builder.build())
}
