@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.panorama

import software.amazon.awscdk.services.panorama.CfnApplicationInstance
import software.amazon.awscdk.services.panorama.CfnPackage
import kotlin.Unit

public inline fun CfnPackage.setStorageLocation(block: CfnPackageStorageLocationPropertyDsl.() -> Unit = {}) {
    val builder = CfnPackageStorageLocationPropertyDsl()
    builder.apply(block)
    return setStorageLocation(builder.build())
}

public inline fun CfnApplicationInstance.setManifestPayload(
    block: CfnApplicationInstanceManifestPayloadPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApplicationInstanceManifestPayloadPropertyDsl()
    builder.apply(block)
    return setManifestPayload(builder.build())
}

public inline fun CfnApplicationInstance.setManifestOverridesPayload(
    block: CfnApplicationInstanceManifestOverridesPayloadPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApplicationInstanceManifestOverridesPayloadPropertyDsl()
    builder.apply(block)
    return setManifestOverridesPayload(builder.build())
}
