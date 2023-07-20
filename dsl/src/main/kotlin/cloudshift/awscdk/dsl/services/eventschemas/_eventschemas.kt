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

package cloudshift.awscdk.dsl.services.eventschemas

import software.amazon.awscdk.services.eventschemas.CfnDiscoverer
import software.amazon.awscdk.services.eventschemas.CfnDiscovererProps
import software.amazon.awscdk.services.eventschemas.CfnRegistry
import software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy
import software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps
import software.amazon.awscdk.services.eventschemas.CfnRegistryProps
import software.amazon.awscdk.services.eventschemas.CfnSchema
import software.amazon.awscdk.services.eventschemas.CfnSchemaProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object eventschemas {
    public inline fun cfnDiscoverer(
        scope: Construct,
        id: String,
        block: CfnDiscovererDsl.() -> Unit = {},
    ): CfnDiscoverer {
        val builder = CfnDiscovererDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDiscovererProps(block: CfnDiscovererPropsDsl.() -> Unit = {}): CfnDiscovererProps {
        val builder = CfnDiscovererPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDiscovererTagsEntryProperty(
        block: CfnDiscovererTagsEntryPropertyDsl.() -> Unit = {
        },
    ): CfnDiscoverer.TagsEntryProperty {
        val builder = CfnDiscovererTagsEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRegistry(
        scope: Construct,
        id: String,
        block: CfnRegistryDsl.() -> Unit = {},
    ): CfnRegistry {
        val builder = CfnRegistryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRegistryPolicy(
        scope: Construct,
        id: String,
        block: CfnRegistryPolicyDsl.() -> Unit = {},
    ): CfnRegistryPolicy {
        val builder = CfnRegistryPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRegistryPolicyProps(block: CfnRegistryPolicyPropsDsl.() -> Unit = {}): CfnRegistryPolicyProps {
        val builder = CfnRegistryPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRegistryProps(block: CfnRegistryPropsDsl.() -> Unit = {}): CfnRegistryProps {
        val builder = CfnRegistryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRegistryTagsEntryProperty(
        block: CfnRegistryTagsEntryPropertyDsl.() -> Unit =
            {},
    ): CfnRegistry.TagsEntryProperty {
        val builder = CfnRegistryTagsEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSchema(
        scope: Construct,
        id: String,
        block: CfnSchemaDsl.() -> Unit = {},
    ): CfnSchema {
        val builder = CfnSchemaDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSchemaProps(block: CfnSchemaPropsDsl.() -> Unit = {}): CfnSchemaProps {
        val builder = CfnSchemaPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSchemaTagsEntryProperty(
        block: CfnSchemaTagsEntryPropertyDsl.() -> Unit =
            {},
    ): CfnSchema.TagsEntryProperty {
        val builder = CfnSchemaTagsEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
