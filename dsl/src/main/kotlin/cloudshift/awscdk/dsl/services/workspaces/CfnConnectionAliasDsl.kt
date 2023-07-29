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

package cloudshift.awscdk.dsl.services.workspaces

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.workspaces.CfnConnectionAlias
import software.constructs.Construct

/**
 * The `AWS::WorkSpaces::ConnectionAlias` resource specifies a connection alias.
 *
 * Connection aliases are used for cross-Region redirection. For more information, see
 * [Cross-Region Redirection for Amazon WorkSpaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspaces.*;
 * CfnConnectionAlias cfnConnectionAlias = CfnConnectionAlias.Builder.create(this,
 * "MyCfnConnectionAlias")
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
public class CfnConnectionAliasDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConnectionAlias.Builder =
        CfnConnectionAlias.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The connection string specified for the connection alias.
     *
     * The connection string must be in the form of a fully qualified domain name (FQDN), such as
     * `www.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html#cfn-workspaces-connectionalias-connectionstring)
     *
     * @param connectionString The connection string specified for the connection alias.
     */
    public fun connectionString(connectionString: String) {
        cdkBuilder.connectionString(connectionString)
    }

    /**
     * The tags to associate with the connection alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html#cfn-workspaces-connectionalias-tags)
     *
     * @param tags The tags to associate with the connection alias.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to associate with the connection alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html#cfn-workspaces-connectionalias-tags)
     *
     * @param tags The tags to associate with the connection alias.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnConnectionAlias {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
