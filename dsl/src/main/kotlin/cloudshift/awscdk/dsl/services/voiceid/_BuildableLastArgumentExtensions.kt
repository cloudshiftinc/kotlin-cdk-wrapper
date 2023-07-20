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

package cloudshift.awscdk.dsl.services.voiceid

import software.amazon.awscdk.services.voiceid.CfnDomain
import kotlin.Unit

public inline fun CfnDomain.setServerSideEncryptionConfiguration(
    block: CfnDomainServerSideEncryptionConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDomainServerSideEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return setServerSideEncryptionConfiguration(builder.build())
}
