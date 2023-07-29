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

package cloudshift.awscdk.dsl.services.eventschemas

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eventschemas.CfnDiscoverer
import software.amazon.awscdk.services.eventschemas.CfnDiscovererProps
import software.amazon.awscdk.services.eventschemas.CfnRegistry
import software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy
import software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps
import software.amazon.awscdk.services.eventschemas.CfnRegistryProps
import software.amazon.awscdk.services.eventschemas.CfnSchema
import software.amazon.awscdk.services.eventschemas.CfnSchemaProps
import software.constructs.Construct

public object eventschemas {
    /**
     * Use the `AWS::EventSchemas::Discoverer` resource to specify a *discoverer* that is associated
     * with an event bus.
     *
     * A discoverer allows the Amazon EventBridge Schema Registry to automatically generate schemas
     * based on events on an event bus.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eventschemas.*;
     * CfnDiscoverer cfnDiscoverer = CfnDiscoverer.Builder.create(this, "MyCfnDiscoverer")
     * .sourceArn("sourceArn")
     * // the properties below are optional
     * .crossAccount(false)
     * .description("description")
     * .tags(List.of(TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html)
     */
    public inline fun cfnDiscoverer(
        scope: Construct,
        id: String,
        block: CfnDiscovererDsl.() -> Unit = {},
    ): CfnDiscoverer {
        val builder = CfnDiscovererDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDiscoverer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eventschemas.*;
     * CfnDiscovererProps cfnDiscovererProps = CfnDiscovererProps.builder()
     * .sourceArn("sourceArn")
     * // the properties below are optional
     * .crossAccount(false)
     * .description("description")
     * .tags(List.of(TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html)
     */
    public inline fun cfnDiscovererProps(
        block: CfnDiscovererPropsDsl.() -> Unit = {}
    ): CfnDiscovererProps {
        val builder = CfnDiscovererPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Tags to associate with the discoverer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eventschemas.*;
     * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eventschemas-discoverer-tagsentry.html)
     */
    public inline fun cfnDiscovererTagsEntryProperty(
        block: CfnDiscovererTagsEntryPropertyDsl.() -> Unit = {}
    ): CfnDiscoverer.TagsEntryProperty {
        val builder = CfnDiscovererTagsEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::EventSchemas::Registry` to specify a schema registry.
     *
     * Schema registries are containers for Schemas. Registries collect and organize schemas so that
     * your schemas are in logical groups.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eventschemas.*;
     * CfnRegistry cfnRegistry = CfnRegistry.Builder.create(this, "MyCfnRegistry")
     * .description("description")
     * .registryName("registryName")
     * .tags(List.of(TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registry.html)
     */
    public inline fun cfnRegistry(
        scope: Construct,
        id: String,
        block: CfnRegistryDsl.() -> Unit = {},
    ): CfnRegistry {
        val builder = CfnRegistryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::EventSchemas::RegistryPolicy` resource to specify resource-based policies for
     * an EventBridge Schema Registry.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eventschemas.*;
     * Object policy;
     * CfnRegistryPolicy cfnRegistryPolicy = CfnRegistryPolicy.Builder.create(this,
     * "MyCfnRegistryPolicy")
     * .policy(policy)
     * .registryName("registryName")
     * // the properties below are optional
     * .revisionId("revisionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html)
     */
    public inline fun cfnRegistryPolicy(
        scope: Construct,
        id: String,
        block: CfnRegistryPolicyDsl.() -> Unit = {},
    ): CfnRegistryPolicy {
        val builder = CfnRegistryPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRegistryPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eventschemas.*;
     * Object policy;
     * CfnRegistryPolicyProps cfnRegistryPolicyProps = CfnRegistryPolicyProps.builder()
     * .policy(policy)
     * .registryName("registryName")
     * // the properties below are optional
     * .revisionId("revisionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registrypolicy.html)
     */
    public inline fun cfnRegistryPolicyProps(
        block: CfnRegistryPolicyPropsDsl.() -> Unit = {}
    ): CfnRegistryPolicyProps {
        val builder = CfnRegistryPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRegistry`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eventschemas.*;
     * CfnRegistryProps cfnRegistryProps = CfnRegistryProps.builder()
     * .description("description")
     * .registryName("registryName")
     * .tags(List.of(TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registry.html)
     */
    public inline fun cfnRegistryProps(
        block: CfnRegistryPropsDsl.() -> Unit = {}
    ): CfnRegistryProps {
        val builder = CfnRegistryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Tags to associate with the schema registry.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eventschemas.*;
     * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eventschemas-registry-tagsentry.html)
     */
    public inline fun cfnRegistryTagsEntryProperty(
        block: CfnRegistryTagsEntryPropertyDsl.() -> Unit = {}
    ): CfnRegistry.TagsEntryProperty {
        val builder = CfnRegistryTagsEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AWS::EventSchemas::Schema` resource to specify an event schema.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eventschemas.*;
     * CfnSchema cfnSchema = CfnSchema.Builder.create(this, "MyCfnSchema")
     * .content("content")
     * .registryName("registryName")
     * .type("type")
     * // the properties below are optional
     * .description("description")
     * .schemaName("schemaName")
     * .tags(List.of(TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html)
     */
    public inline fun cfnSchema(
        scope: Construct,
        id: String,
        block: CfnSchemaDsl.() -> Unit = {},
    ): CfnSchema {
        val builder = CfnSchemaDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSchema`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eventschemas.*;
     * CfnSchemaProps cfnSchemaProps = CfnSchemaProps.builder()
     * .content("content")
     * .registryName("registryName")
     * .type("type")
     * // the properties below are optional
     * .description("description")
     * .schemaName("schemaName")
     * .tags(List.of(TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html)
     */
    public inline fun cfnSchemaProps(block: CfnSchemaPropsDsl.() -> Unit = {}): CfnSchemaProps {
        val builder = CfnSchemaPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Tags to associate with the schema.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eventschemas.*;
     * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eventschemas-schema-tagsentry.html)
     */
    public inline fun cfnSchemaTagsEntryProperty(
        block: CfnSchemaTagsEntryPropertyDsl.() -> Unit = {}
    ): CfnSchema.TagsEntryProperty {
        val builder = CfnSchemaTagsEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
