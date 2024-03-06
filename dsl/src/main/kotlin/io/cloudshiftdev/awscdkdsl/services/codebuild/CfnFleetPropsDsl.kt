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

package io.cloudshiftdev.awscdkdsl.services.codebuild

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.codebuild.CfnFleetProps

/**
 * Properties for defining a `CfnFleet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * CfnFleetProps cfnFleetProps = CfnFleetProps.builder()
 * .baseCapacity(123)
 * .computeType("computeType")
 * .environmentType("environmentType")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html)
 */
@CdkDslMarker
public class CfnFleetPropsDsl {
    private val cdkBuilder: CfnFleetProps.Builder = CfnFleetProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param baseCapacity The initial number of machines allocated to the compute ﬂeet, which
     *   deﬁnes the number of builds that can run in parallel.
     */
    public fun baseCapacity(baseCapacity: Number) {
        cdkBuilder.baseCapacity(baseCapacity)
    }

    /**
     * @param computeType Information about the compute resources the compute fleet uses. Available
     *   values include:.
     * * `BUILD_GENERAL1_SMALL` : Use up to 3 GB memory and 2 vCPUs for builds.
     * * `BUILD_GENERAL1_MEDIUM` : Use up to 7 GB memory and 4 vCPUs for builds.
     * * `BUILD_GENERAL1_LARGE` : Use up to 16 GB memory and 8 vCPUs for builds, depending on your
     *   environment type.
     * * `BUILD_GENERAL1_XLARGE` : Use up to 70 GB memory and 36 vCPUs for builds, depending on your
     *   environment type.
     * * `BUILD_GENERAL1_2XLARGE` : Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for
     *   builds. This compute type supports Docker images up to 100 GB uncompressed.
     *
     * If you use `BUILD_GENERAL1_SMALL` :
     * * For environment type `LINUX_CONTAINER` , you can use up to 3 GB memory and 2 vCPUs for
     *   builds.
     * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 16 GB memory, 4 vCPUs, and 1
     *   NVIDIA A10G Tensor Core GPU for builds.
     * * For environment type `ARM_CONTAINER` , you can use up to 4 GB memory and 2 vCPUs on
     *   ARM-based processors for builds.
     *
     * If you use `BUILD_GENERAL1_LARGE` :
     * * For environment type `LINUX_CONTAINER` , you can use up to 15 GB memory and 8 vCPUs for
     *   builds.
     * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 255 GB memory, 32 vCPUs, and
     *   4 NVIDIA Tesla V100 GPUs for builds.
     * * For environment type `ARM_CONTAINER` , you can use up to 16 GB memory and 8 vCPUs on
     *   ARM-based processors for builds.
     *
     * For more information, see
     * [Build environment compute types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html)
     * in the *AWS CodeBuild User Guide.*
     */
    public fun computeType(computeType: String) {
        cdkBuilder.computeType(computeType)
    }

    /**
     * @param environmentType The environment type of the compute fleet.
     * * The environment type `ARM_CONTAINER` is available only in regions US East (N. Virginia), US
     *   East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo),
     *   Asia Pacific (Singapore), Asia Pacific (Sydney), EU (Frankfurt), and South America (São
     *   Paulo).
     * * The environment type `LINUX_CONTAINER` is available only in regions US East (N. Virginia),
     *   US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     *   Pacific (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific
     *   (Mumbai).
     * * The environment type `LINUX_GPU_CONTAINER` is available only in regions US East (N.
     *   Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific
     *   (Tokyo), and Asia Pacific (Sydney).
     * * The environment type `WINDOWS_SERVER_2019_CONTAINER` is available only in regions US East
     *   (N. Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Sydney), Asia Pacific
     *   (Tokyo), Asia Pacific (Mumbai) and EU (Ireland).
     * * The environment type `WINDOWS_SERVER_2022_CONTAINER` is available only in regions US East
     *   (N. Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific
     *   (Sydney), Asia Pacific (Singapore), Asia Pacific (Tokyo), South America (São Paulo) and
     *   Asia Pacific (Mumbai).
     *
     * For more information, see
     * [Build environment compute types](https://docs.aws.amazon.com//codebuild/latest/userguide/build-env-ref-compute-types.html)
     * in the *AWS CodeBuild user guide* .
     */
    public fun environmentType(environmentType: String) {
        cdkBuilder.environmentType(environmentType)
    }

    /** @param name The name of the compute fleet. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags A list of tag key and value pairs associated with this compute fleet. These tags
     *   are available for use by AWS services that support AWS CodeBuild compute fleet tags.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of tag key and value pairs associated with this compute fleet. These tags
     *   are available for use by AWS services that support AWS CodeBuild compute fleet tags.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFleetProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
