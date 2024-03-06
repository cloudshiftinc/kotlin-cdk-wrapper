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
import software.amazon.awscdk.services.fis.CfnTargetAccountConfiguration
import software.constructs.Construct

/**
 * Creates a target account configuration for the experiment template.
 *
 * A target account configuration is required when `accountTargeting` of `experimentOptions` is set
 * to `multi-account` . For more information, see
 * [experiment options](https://docs.aws.amazon.com/fis/latest/userguide/experiment-options.html) in
 * the *AWS Fault Injection Service User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fis.*;
 * CfnTargetAccountConfiguration cfnTargetAccountConfiguration =
 * CfnTargetAccountConfiguration.Builder.create(this, "MyCfnTargetAccountConfiguration")
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
public class CfnTargetAccountConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTargetAccountConfiguration.Builder =
        CfnTargetAccountConfiguration.Builder.create(scope, id)

    /**
     * The AWS account ID of the target account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-accountid)
     *
     * @param accountId The AWS account ID of the target account.
     */
    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    /**
     * The description of the target account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-description)
     *
     * @param description The description of the target account.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The ID of the experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-experimenttemplateid)
     *
     * @param experimentTemplateId The ID of the experiment template.
     */
    public fun experimentTemplateId(experimentTemplateId: String) {
        cdkBuilder.experimentTemplateId(experimentTemplateId)
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role for the target account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-targetaccountconfiguration.html#cfn-fis-targetaccountconfiguration-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role for the target account.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnTargetAccountConfiguration = cdkBuilder.build()
}
