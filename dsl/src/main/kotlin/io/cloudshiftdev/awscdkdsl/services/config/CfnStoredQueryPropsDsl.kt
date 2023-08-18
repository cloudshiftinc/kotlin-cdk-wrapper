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

package io.cloudshiftdev.awscdkdsl.services.config

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.config.CfnStoredQueryProps

/**
 * Properties for defining a `CfnStoredQuery`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * CfnStoredQueryProps cfnStoredQueryProps = CfnStoredQueryProps.builder()
 * .queryExpression("queryExpression")
 * .queryName("queryName")
 * // the properties below are optional
 * .queryDescription("queryDescription")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html)
 */
@CdkDslMarker
public class CfnStoredQueryPropsDsl {
    private val cdkBuilder: CfnStoredQueryProps.Builder = CfnStoredQueryProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param queryDescription A unique description for the query. */
    public fun queryDescription(queryDescription: String) {
        cdkBuilder.queryDescription(queryDescription)
    }

    /**
     * @param queryExpression The expression of the query. For example, `SELECT resourceId,
     *   resourceType, supplementaryConfiguration.BucketVersioningConfiguration.status WHERE
     *   resourceType = 'AWS::S3::Bucket' AND
     *   supplementaryConfiguration.BucketVersioningConfiguration.status = 'Off'.`
     */
    public fun queryExpression(queryExpression: String) {
        cdkBuilder.queryExpression(queryExpression)
    }

    /** @param queryName The name of the query. */
    public fun queryName(queryName: String) {
        cdkBuilder.queryName(queryName)
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStoredQueryProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
