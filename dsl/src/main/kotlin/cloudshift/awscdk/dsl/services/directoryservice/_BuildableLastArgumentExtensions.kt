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

package cloudshift.awscdk.dsl.services.directoryservice

import kotlin.Unit
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD
import software.amazon.awscdk.services.directoryservice.CfnSimpleAD

/** Specifies the VPC settings of the Microsoft AD directory server in AWS . */
public inline fun CfnMicrosoftAD.setVpcSettings(
    block: CfnMicrosoftADVpcSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMicrosoftADVpcSettingsPropertyDsl()
    builder.apply(block)
    return setVpcSettings(builder.build())
}

/**
 * A
 * [DirectoryVpcSettings](https://docs.aws.amazon.com/directoryservice/latest/devguide/API_DirectoryVpcSettings.html)
 * object that contains additional information for the operation.
 */
public inline fun CfnSimpleAD.setVpcSettings(
    block: CfnSimpleADVpcSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSimpleADVpcSettingsPropertyDsl()
    builder.apply(block)
    return setVpcSettings(builder.build())
}
