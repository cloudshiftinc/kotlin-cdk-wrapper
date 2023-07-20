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

package cloudshift.awscdk.dsl.services.resiliencehub

import software.amazon.awscdk.services.resiliencehub.CfnApp
import software.amazon.awscdk.services.resiliencehub.CfnAppProps
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicyProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object resiliencehub {
    public inline fun cfnApp(
        scope: Construct,
        id: String,
        block: CfnAppDsl.() -> Unit = {},
    ): CfnApp {
        val builder = CfnAppDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAppPhysicalResourceIdProperty(
        block: CfnAppPhysicalResourceIdPropertyDsl.() -> Unit =
            {},
    ): CfnApp.PhysicalResourceIdProperty {
        val builder = CfnAppPhysicalResourceIdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAppProps(block: CfnAppPropsDsl.() -> Unit = {}): CfnAppProps {
        val builder = CfnAppPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAppResourceMappingProperty(
        block: CfnAppResourceMappingPropertyDsl.() -> Unit =
            {},
    ): CfnApp.ResourceMappingProperty {
        val builder = CfnAppResourceMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResiliencyPolicy(
        scope: Construct,
        id: String,
        block: CfnResiliencyPolicyDsl.() -> Unit = {},
    ): CfnResiliencyPolicy {
        val builder = CfnResiliencyPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResiliencyPolicyFailurePolicyProperty(
        block: CfnResiliencyPolicyFailurePolicyPropertyDsl.() -> Unit =
            {},
    ): CfnResiliencyPolicy.FailurePolicyProperty {
        val builder = CfnResiliencyPolicyFailurePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResiliencyPolicyProps(block: CfnResiliencyPolicyPropsDsl.() -> Unit = {}): CfnResiliencyPolicyProps {
        val builder = CfnResiliencyPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
