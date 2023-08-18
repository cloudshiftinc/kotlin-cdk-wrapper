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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * Information about the user who created or modified an experiment, trial, trial component, lineage
 * group, project, or model card.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * UserContextProperty userContextProperty = UserContextProperty.builder()
 * .domainId("domainId")
 * .userProfileArn("userProfileArn")
 * .userProfileName("userProfileName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-usercontext.html)
 */
@CdkDslMarker
public class CfnModelCardUserContextPropertyDsl {
    private val cdkBuilder: CfnModelCard.UserContextProperty.Builder =
        CfnModelCard.UserContextProperty.builder()

    /** @param domainId The domain associated with the user. */
    public fun domainId(domainId: String) {
        cdkBuilder.domainId(domainId)
    }

    /** @param userProfileArn The Amazon Resource Name (ARN) of the user's profile. */
    public fun userProfileArn(userProfileArn: String) {
        cdkBuilder.userProfileArn(userProfileArn)
    }

    /** @param userProfileName The name of the user's profile. */
    public fun userProfileName(userProfileName: String) {
        cdkBuilder.userProfileName(userProfileName)
    }

    public fun build(): CfnModelCard.UserContextProperty = cdkBuilder.build()
}
