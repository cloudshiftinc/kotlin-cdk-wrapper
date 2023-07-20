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
import software.amazon.awscdk.services.voiceid.CfnDomainProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object voiceid {
    public inline fun cfnDomain(
        scope: Construct,
        id: String,
        block: CfnDomainDsl.() -> Unit = {},
    ): CfnDomain {
        val builder = CfnDomainDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDomainProps(block: CfnDomainPropsDsl.() -> Unit = {}): CfnDomainProps {
        val builder = CfnDomainPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDomainServerSideEncryptionConfigurationProperty(
        block: CfnDomainServerSideEncryptionConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDomain.ServerSideEncryptionConfigurationProperty {
        val builder = CfnDomainServerSideEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
