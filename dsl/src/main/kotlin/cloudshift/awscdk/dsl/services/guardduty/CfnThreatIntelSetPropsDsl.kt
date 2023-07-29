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

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps

/**
 * Properties for defining a `CfnThreatIntelSet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * CfnThreatIntelSetProps cfnThreatIntelSetProps = CfnThreatIntelSetProps.builder()
 * .activate(false)
 * .detectorId("detectorId")
 * .format("format")
 * .location("location")
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-threatintelset.html)
 */
@CdkDslMarker
public class CfnThreatIntelSetPropsDsl {
    private val cdkBuilder: CfnThreatIntelSetProps.Builder = CfnThreatIntelSetProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param activate A Boolean value that indicates whether GuardDuty is to start using the
     *   uploaded ThreatIntelSet.
     */
    public fun activate(activate: Boolean) {
        cdkBuilder.activate(activate)
    }

    /**
     * @param activate A Boolean value that indicates whether GuardDuty is to start using the
     *   uploaded ThreatIntelSet.
     */
    public fun activate(activate: IResolvable) {
        cdkBuilder.activate(activate)
    }

    /**
     * @param detectorId The unique ID of the detector of the GuardDuty account that you want to
     *   create a threatIntelSet for.
     */
    public fun detectorId(detectorId: String) {
        cdkBuilder.detectorId(detectorId)
    }

    /** @param format The format of the file that contains the ThreatIntelSet. */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    /** @param location The URI of the file that contains the ThreatIntelSet. */
    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    /**
     * @param name A user-friendly ThreatIntelSet name displayed in all findings that are generated
     *   by activity that involves IP addresses included in this ThreatIntelSet.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags The tags to be added to a new threat list resource. Each tag consists of a key
     *   and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags to be added to a new threat list resource. Each tag consists of a key
     *   and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnThreatIntelSetProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
