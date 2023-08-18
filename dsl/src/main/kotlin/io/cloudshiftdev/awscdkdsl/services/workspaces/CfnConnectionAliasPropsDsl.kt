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

package io.cloudshiftdev.awscdkdsl.services.workspaces

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps

/**
 * Properties for defining a `CfnConnectionAlias`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspaces.*;
 * CfnConnectionAliasProps cfnConnectionAliasProps = CfnConnectionAliasProps.builder()
 * .connectionString("connectionString")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html)
 */
@CdkDslMarker
public class CfnConnectionAliasPropsDsl {
    private val cdkBuilder: CfnConnectionAliasProps.Builder = CfnConnectionAliasProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param connectionString The connection string specified for the connection alias. The
     *   connection string must be in the form of a fully qualified domain name (FQDN), such as
     *   `www.example.com` .
     */
    public fun connectionString(connectionString: String) {
        cdkBuilder.connectionString(connectionString)
    }

    /** @param tags The tags to associate with the connection alias. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to associate with the connection alias. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnConnectionAliasProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
