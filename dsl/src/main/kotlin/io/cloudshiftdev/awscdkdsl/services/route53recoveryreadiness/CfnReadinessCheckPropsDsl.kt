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

package io.cloudshiftdev.awscdkdsl.services.route53recoveryreadiness

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps

/**
 * Properties for defining a `CfnReadinessCheck`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoveryreadiness.*;
 * CfnReadinessCheckProps cfnReadinessCheckProps = CfnReadinessCheckProps.builder()
 * .readinessCheckName("readinessCheckName")
 * .resourceSetName("resourceSetName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html)
 */
@CdkDslMarker
public class CfnReadinessCheckPropsDsl {
    private val cdkBuilder: CfnReadinessCheckProps.Builder = CfnReadinessCheckProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param readinessCheckName The name of the readiness check to create. */
    public fun readinessCheckName(readinessCheckName: String) {
        cdkBuilder.readinessCheckName(readinessCheckName)
    }

    /** @param resourceSetName The name of the resource set to check. */
    public fun resourceSetName(resourceSetName: String) {
        cdkBuilder.resourceSetName(resourceSetName)
    }

    /** @param tags A collection of tags associated with a resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags A collection of tags associated with a resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnReadinessCheckProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
