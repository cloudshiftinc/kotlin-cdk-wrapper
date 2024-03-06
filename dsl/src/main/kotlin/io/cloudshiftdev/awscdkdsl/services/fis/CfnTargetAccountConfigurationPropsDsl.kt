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

package io.cloudshiftdev.awscdkdsl.services.fis

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fis.CfnTargetAccountConfigurationProps

/**
 * Properties for defining a `CfnTargetAccountConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fis.*;
 * CfnTargetAccountConfigurationProps cfnTargetAccountConfigurationProps =
 * CfnTargetAccountConfigurationProps.builder()
 * .accountId("accountId")
 * .experimentTemplateId("experimentTemplateId")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html)
 */
@CdkDslMarker
public class CfnTargetAccountConfigurationPropsDsl {
    private val cdkBuilder: CfnTargetAccountConfigurationProps.Builder =
        CfnTargetAccountConfigurationProps.builder()

    /** @param accountId The AWS account ID of the target account. */
    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    /** @param description The description of the target account. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param experimentTemplateId The ID of the experiment template. */
    public fun experimentTemplateId(experimentTemplateId: String) {
        cdkBuilder.experimentTemplateId(experimentTemplateId)
    }

    /** @param roleArn The Amazon Resource Name (ARN) of an IAM role for the target account. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnTargetAccountConfigurationProps = cdkBuilder.build()
}
