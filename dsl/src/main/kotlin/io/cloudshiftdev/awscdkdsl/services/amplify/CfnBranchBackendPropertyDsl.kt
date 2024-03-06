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

package io.cloudshiftdev.awscdkdsl.services.amplify

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplify.CfnBranch

/**
 * Describes the backend properties associated with an Amplify `Branch` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplify.*;
 * BackendProperty backendProperty = BackendProperty.builder()
 * .stackArn("stackArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-backend.html)
 */
@CdkDslMarker
public class CfnBranchBackendPropertyDsl {
    private val cdkBuilder: CfnBranch.BackendProperty.Builder = CfnBranch.BackendProperty.builder()

    /** @param stackArn The Amazon Resource Name (ARN) for the AWS CloudFormation stack. */
    public fun stackArn(stackArn: String) {
        cdkBuilder.stackArn(stackArn)
    }

    public fun build(): CfnBranch.BackendProperty = cdkBuilder.build()
}
