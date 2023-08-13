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

package cloudshift.awscdk.dsl.services.opensearchserverless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.opensearchserverless.CfnCollectionProps

/**
 * Properties for defining a `CfnCollection`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchserverless.*;
 * CfnCollectionProps cfnCollectionProps = CfnCollectionProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html)
 */
@CdkDslMarker
public class CfnCollectionPropsDsl {
    private val cdkBuilder: CfnCollectionProps.Builder = CfnCollectionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description of the collection. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param name The name of the collection. Collection names must meet the following criteria:
     * * Starts with a lowercase letter
     * * Unique to your account and AWS Region
     * * Contains between 3 and 28 characters
     * * Contains only lowercase letters a-z, the numbers 0-9, and the hyphen (-)
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the collection. For
     *   more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the collection. For
     *   more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param type The type of collection. Possible values are `SEARCH` , `TIMESERIES` , and
     *   `VECTORSEARCH` . For more information, see
     *   [Choosing a collection type](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html#serverless-usecase)
     *   .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnCollectionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
