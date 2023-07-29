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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * Information about an Amazon EC2 tag filter.
 *
 * For more information about using tags and tag groups to help manage your Amazon EC2 instances and
 * on-premises instances, see
 * [Tagging Instances for Deployment Groups in AWS CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-tagging.html)
 * in the *AWS CodeDeploy User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * EC2TagFilterProperty eC2TagFilterProperty = EC2TagFilterProperty.builder()
 * .key("key")
 * .type("type")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagfilter.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupEC2TagFilterPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.EC2TagFilterProperty.Builder =
        CfnDeploymentGroup.EC2TagFilterProperty.builder()

    /** @param key The tag filter key. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param type The tag filter type:.
     * * `KEY_ONLY` : Key only.
     * * `VALUE_ONLY` : Value only.
     * * `KEY_AND_VALUE` : Key and value.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param value The tag filter value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDeploymentGroup.EC2TagFilterProperty = cdkBuilder.build()
}
