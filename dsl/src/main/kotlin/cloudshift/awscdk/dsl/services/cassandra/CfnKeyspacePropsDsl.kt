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
import software.amazon.awscdk.services.cassandra.CfnKeyspaceProps

/**
 * Properties for defining a `CfnKeyspace`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cassandra.*;
 * CfnKeyspaceProps cfnKeyspaceProps = CfnKeyspaceProps.builder()
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
public class CfnKeyspacePropsDsl {
    private val cdkBuilder: CfnKeyspaceProps.Builder = CfnKeyspaceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param keyspaceName The name of the keyspace to be created. The keyspace name is case
     *   sensitive. If you don't specify a name, AWS CloudFormation generates a unique ID and uses
     *   that ID for the keyspace name. For more information, see
     *   [Name type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     *   .
     *
     * *Length constraints:* Minimum length of 3. Maximum length of 255.
     *
     * *Pattern:* `^[a-zA-Z0-9][a-zA-Z0-9_]{1,47}$`
     */
    public fun keyspaceName(keyspaceName: String) {
        cdkBuilder.keyspaceName(keyspaceName)
    }

    /**
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     *   options are:.
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace
     * is replicated in.
     */
    public fun replicationSpecification(replicationSpecification: IResolvable) {
        cdkBuilder.replicationSpecification(replicationSpecification)
    }

    /**
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     *   options are:.
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace
     * is replicated in.
     */
    public fun replicationSpecification(
        replicationSpecification: CfnKeyspace.ReplicationSpecificationProperty
    ) {
        cdkBuilder.replicationSpecification(replicationSpecification)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnKeyspaceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
