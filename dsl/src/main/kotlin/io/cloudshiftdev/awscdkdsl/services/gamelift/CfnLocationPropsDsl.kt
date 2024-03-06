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

package io.cloudshiftdev.awscdkdsl.services.gamelift

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.gamelift.CfnLocationProps

/**
 * Properties for defining a `CfnLocation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * CfnLocationProps cfnLocationProps = CfnLocationProps.builder()
 * .locationName("locationName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-location.html)
 */
@CdkDslMarker
public class CfnLocationPropsDsl {
    private val cdkBuilder: CfnLocationProps.Builder = CfnLocationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param locationName A descriptive name for the custom location. */
    public fun locationName(locationName: String) {
        cdkBuilder.locationName(locationName)
    }

    /**
     * @param tags A list of labels to assign to the new matchmaking configuration resource. Tags
     *   are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     *   management, access management and cost allocation. For more information, see
     *   [Tagging AWS Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     *   the *AWS General Rareference* .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of labels to assign to the new matchmaking configuration resource. Tags
     *   are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     *   management, access management and cost allocation. For more information, see
     *   [Tagging AWS Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     *   the *AWS General Rareference* .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLocationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
