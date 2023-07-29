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

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53recoverycontrol.CfnClusterProps

/**
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoverycontrol.*;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
 * .name("name")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-cluster.html)
 */
@CdkDslMarker
public class CfnClusterPropsDsl {
    private val cdkBuilder: CfnClusterProps.Builder = CfnClusterProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param name Name of the cluster. You can use any non-white space character in the name except
     *   the following: &amp; &gt; &lt; ' (single quote) " (double quote) ; (semicolon).
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags The value for a tag. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The value for a tag. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnClusterProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
