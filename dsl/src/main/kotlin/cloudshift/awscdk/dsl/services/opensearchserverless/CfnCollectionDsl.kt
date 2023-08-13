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
import software.amazon.awscdk.services.opensearchserverless.CfnCollection
import software.constructs.Construct

/**
 * Specifies an OpenSearch Serverless collection.
 *
 * For more information, see
 * [Creating and managing Amazon OpenSearch Serverless collections](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html)
 * in the *Amazon OpenSearch Service Developer Guide* .
 *
 * You must create a matching
 * [encryption policy](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html)
 * in order for a collection to be created successfully. You can specify the policy resource within
 * the same CloudFormation template as the collection resource if you use the
 * [DependsOn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * attribute. See
 * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#aws-resource-opensearchserverless-collection--examples)
 * for a sample template. Otherwise the encryption policy must already exist before you create the
 * collection.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchserverless.*;
 * CfnCollection cfnCollection = CfnCollection.Builder.create(this, "MyCfnCollection")
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
public class CfnCollectionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCollection.Builder = CfnCollection.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description of the collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-description)
     *
     * @param description A description of the collection.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the collection.
     *
     * Collection names must meet the following criteria:
     * * Starts with a lowercase letter
     * * Unique to your account and AWS Region
     * * Contains between 3 and 28 characters
     * * Contains only lowercase letters a-z, the numbers 0-9, and the hyphen (-)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-name)
     *
     * @param name The name of the collection.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the collection.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-tags)
     *
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the collection.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the collection.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-tags)
     *
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the collection.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The type of collection.
     *
     * Possible values are `SEARCH` , `TIMESERIES` , and `VECTORSEARCH` . For more information, see
     * [Choosing a collection type](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html#serverless-usecase)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#cfn-opensearchserverless-collection-type)
     *
     * @param type The type of collection.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnCollection {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
