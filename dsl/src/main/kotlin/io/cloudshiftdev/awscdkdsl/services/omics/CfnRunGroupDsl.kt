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

package io.cloudshiftdev.awscdkdsl.services.omics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.omics.CfnRunGroup
import software.constructs.Construct

/**
 * Creates a run group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.omics.*;
 * CfnRunGroup cfnRunGroup = CfnRunGroup.Builder.create(this, "MyCfnRunGroup")
 * .maxCpus(123)
 * .maxDuration(123)
 * .maxGpus(123)
 * .maxRuns(123)
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html)
 */
@CdkDslMarker
public class CfnRunGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRunGroup.Builder = CfnRunGroup.Builder.create(scope, id)

    /**
     * The group's maximum CPU count setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxcpus)
     *
     * @param maxCpus The group's maximum CPU count setting.
     */
    public fun maxCpus(maxCpus: Number) {
        cdkBuilder.maxCpus(maxCpus)
    }

    /**
     * The group's maximum duration setting in minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxduration)
     *
     * @param maxDuration The group's maximum duration setting in minutes.
     */
    public fun maxDuration(maxDuration: Number) {
        cdkBuilder.maxDuration(maxDuration)
    }

    /**
     * The maximum GPUs that can be used by a run group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxgpus)
     *
     * @param maxGpus The maximum GPUs that can be used by a run group.
     */
    public fun maxGpus(maxGpus: Number) {
        cdkBuilder.maxGpus(maxGpus)
    }

    /**
     * The group's maximum concurrent run setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxruns)
     *
     * @param maxRuns The group's maximum concurrent run setting.
     */
    public fun maxRuns(maxRuns: Number) {
        cdkBuilder.maxRuns(maxRuns)
    }

    /**
     * The group's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-name)
     *
     * @param name The group's name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Tags for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-tags)
     *
     * @param tags Tags for the group.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnRunGroup = cdkBuilder.build()
}
