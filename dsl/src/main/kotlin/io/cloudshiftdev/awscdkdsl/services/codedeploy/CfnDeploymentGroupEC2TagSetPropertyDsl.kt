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

package io.cloudshiftdev.awscdkdsl.services.codedeploy

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * The `EC2TagSet` property type specifies information about groups of tags applied to Amazon EC2
 * instances.
 *
 * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
 * `EC2TagSet` cannot be used in the same template as `EC2TagFilter` .
 *
 * For information about using tags and tag groups to help manage your Amazon EC2 instances and
 * on-premises instances, see
 * [Tagging Instances for Deployment Groups in AWS CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-tagging.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * EC2TagSetProperty eC2TagSetProperty = EC2TagSetProperty.builder()
 * .ec2TagSetList(List.of(EC2TagSetListObjectProperty.builder()
 * .ec2TagGroup(List.of(EC2TagFilterProperty.builder()
 * .key("key")
 * .type("type")
 * .value("value")
 * .build()))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagset.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupEC2TagSetPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.EC2TagSetProperty.Builder =
        CfnDeploymentGroup.EC2TagSetProperty.builder()

    private val _ec2TagSetList: MutableList<Any> = mutableListOf()

    /**
     * @param ec2TagSetList The Amazon EC2 tags that are already applied to Amazon EC2 instances
     *   that you want to include in the deployment group. CodeDeploy includes all Amazon EC2
     *   instances identified by any of the tags you specify in this deployment group.
     *
     * Duplicates are not allowed.
     */
    public fun ec2TagSetList(vararg ec2TagSetList: Any) {
        _ec2TagSetList.addAll(listOf(*ec2TagSetList))
    }

    /**
     * @param ec2TagSetList The Amazon EC2 tags that are already applied to Amazon EC2 instances
     *   that you want to include in the deployment group. CodeDeploy includes all Amazon EC2
     *   instances identified by any of the tags you specify in this deployment group.
     *
     * Duplicates are not allowed.
     */
    public fun ec2TagSetList(ec2TagSetList: Collection<Any>) {
        _ec2TagSetList.addAll(ec2TagSetList)
    }

    /**
     * @param ec2TagSetList The Amazon EC2 tags that are already applied to Amazon EC2 instances
     *   that you want to include in the deployment group. CodeDeploy includes all Amazon EC2
     *   instances identified by any of the tags you specify in this deployment group.
     *
     * Duplicates are not allowed.
     */
    public fun ec2TagSetList(ec2TagSetList: IResolvable) {
        cdkBuilder.ec2TagSetList(ec2TagSetList)
    }

    public fun build(): CfnDeploymentGroup.EC2TagSetProperty {
        if (_ec2TagSetList.isNotEmpty()) cdkBuilder.ec2TagSetList(_ec2TagSetList)
        return cdkBuilder.build()
    }
}
