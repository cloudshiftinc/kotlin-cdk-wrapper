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

package cloudshift.awscdk.dsl.services.cassandra

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cassandra.CfnKeyspace
import software.constructs.Construct

/**
 * You can use the `AWS::Cassandra::Keyspace` resource to create a new keyspace in Amazon Keyspaces
 * (for Apache Cassandra).
 *
 * For more information, see
 * [Create a keyspace and a table](https://docs.aws.amazon.com/keyspaces/latest/devguide/getting-started.ddl.html)
 * in the *Amazon Keyspaces Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cassandra.*;
 * CfnKeyspace cfnKeyspace = CfnKeyspace.Builder.create(this, "MyCfnKeyspace")
 * .keyspaceName("keyspaceName")
 * .replicationSpecification(ReplicationSpecificationProperty.builder()
 * .regionList(List.of("regionList"))
 * .replicationStrategy("replicationStrategy")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html)
 */
@CdkDslMarker
public class CfnKeyspaceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnKeyspace.Builder = CfnKeyspace.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The name of the keyspace to be created.
     *
     * The keyspace name is case sensitive. If you don't specify a name, AWS CloudFormation
     * generates a unique ID and uses that ID for the keyspace name. For more information, see
     * [Name type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * .
     *
     * *Length constraints:* Minimum length of 3. Maximum length of 255.
     *
     * *Pattern:* `^[a-zA-Z0-9][a-zA-Z0-9_]{1,47}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-keyspacename)
     *
     * @param keyspaceName The name of the keyspace to be created.
     */
    public fun keyspaceName(keyspaceName: String) {
        cdkBuilder.keyspaceName(keyspaceName)
    }

    /**
     * Specifies the `ReplicationStrategy` of a keyspace. The options are:.
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace
     * is replicated in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-replicationspecification)
     *
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     *   options are:.
     */
    public fun replicationSpecification(replicationSpecification: IResolvable) {
        cdkBuilder.replicationSpecification(replicationSpecification)
    }

    /**
     * Specifies the `ReplicationStrategy` of a keyspace. The options are:.
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace
     * is replicated in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-replicationspecification)
     *
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     *   options are:.
     */
    public fun replicationSpecification(
        replicationSpecification: CfnKeyspace.ReplicationSpecificationProperty
    ) {
        cdkBuilder.replicationSpecification(replicationSpecification)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnKeyspace {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
