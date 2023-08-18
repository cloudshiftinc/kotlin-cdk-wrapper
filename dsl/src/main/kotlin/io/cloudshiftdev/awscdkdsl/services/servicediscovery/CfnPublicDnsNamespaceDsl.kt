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

package io.cloudshiftdev.awscdkdsl.services.servicediscovery

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace
import software.constructs.Construct

/**
 * Creates a public namespace based on DNS, which is visible on the internet.
 *
 * The namespace defines your service naming scheme. For example, if you name your namespace
 * `example.com` and name your service `backend` , the resulting DNS name for the service is
 * `backend.example.com` . You can discover instances that were registered with a public DNS
 * namespace by using either a `DiscoverInstances` request or using DNS. For the current quota on
 * the number of namespaces that you can create using the same AWS account , see
 * [AWS Cloud Map quotas](https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html) in
 * the *AWS Cloud Map Developer Guide* .
 *
 * The `CreatePublicDnsNamespace` API operation is not supported in the AWS GovCloud (US) Regions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * CfnPublicDnsNamespace cfnPublicDnsNamespace = CfnPublicDnsNamespace.Builder.create(this,
 * "MyCfnPublicDnsNamespace")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .properties(PropertiesProperty.builder()
 * .dnsProperties(PublicDnsPropertiesMutableProperty.builder()
 * .soa(SOAProperty.builder()
 * .ttl(123)
 * .build())
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html)
 */
@CdkDslMarker
public class CfnPublicDnsNamespaceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPublicDnsNamespace.Builder =
        CfnPublicDnsNamespace.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description for the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-description)
     *
     * @param description A description for the namespace.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name that you want to assign to this namespace.
     *
     * Do not include sensitive information in the name. The name is publicly available using DNS
     * queries.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-name)
     *
     * @param name The name that you want to assign to this namespace.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Properties for the public DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-properties)
     *
     * @param properties Properties for the public DNS namespace.
     */
    public fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties)
    }

    /**
     * Properties for the public DNS namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-properties)
     *
     * @param properties Properties for the public DNS namespace.
     */
    public fun properties(properties: CfnPublicDnsNamespace.PropertiesProperty) {
        cdkBuilder.properties(properties)
    }

    /**
     * The tags for the namespace.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-tags)
     *
     * @param tags The tags for the namespace.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags for the namespace.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html#cfn-servicediscovery-publicdnsnamespace-tags)
     *
     * @param tags The tags for the namespace.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPublicDnsNamespace {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
