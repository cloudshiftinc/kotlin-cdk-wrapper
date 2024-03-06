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

package io.cloudshiftdev.awscdkdsl.services.guardduty

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnIPSet
import software.constructs.Construct

/**
 * The `AWS::GuardDuty::IPSet` resource specifies a new `IPSet` .
 *
 * An `IPSet` is a list of trusted IP addresses from which secure communication is allowed with AWS
 * infrastructure and applications.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * CfnIPSet cfnIPSet = CfnIPSet.Builder.create(this, "MyCfnIPSet")
 * .format("format")
 * .location("location")
 * // the properties below are optional
 * .activate(false)
 * .detectorId("detectorId")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html)
 */
@CdkDslMarker
public class CfnIPSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIPSet.Builder = CfnIPSet.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Indicates whether or not GuardDuty uses the `IPSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-activate)
     *
     * @param activate Indicates whether or not GuardDuty uses the `IPSet` .
     */
    public fun activate(activate: Boolean) {
        cdkBuilder.activate(activate)
    }

    /**
     * Indicates whether or not GuardDuty uses the `IPSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-activate)
     *
     * @param activate Indicates whether or not GuardDuty uses the `IPSet` .
     */
    public fun activate(activate: IResolvable) {
        cdkBuilder.activate(activate)
    }

    /**
     * The unique ID of the detector of the GuardDuty account that you want to create an IPSet for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-detectorid)
     *
     * @param detectorId The unique ID of the detector of the GuardDuty account that you want to
     *   create an IPSet for.
     */
    public fun detectorId(detectorId: String) {
        cdkBuilder.detectorId(detectorId)
    }

    /**
     * The format of the file that contains the IPSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-format)
     *
     * @param format The format of the file that contains the IPSet.
     */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    /**
     * The URI of the file that contains the IPSet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-location)
     *
     * @param location The URI of the file that contains the IPSet.
     */
    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    /**
     * The user-friendly name to identify the IPSet.
     *
     * Allowed characters are alphanumeric, whitespace, dash (-), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-name)
     *
     * @param name The user-friendly name to identify the IPSet.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The tags to be added to a new IP set resource.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-tags)
     *
     * @param tags The tags to be added to a new IP set resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to be added to a new IP set resource.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-ipset.html#cfn-guardduty-ipset-tags)
     *
     * @param tags The tags to be added to a new IP set resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnIPSet {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
