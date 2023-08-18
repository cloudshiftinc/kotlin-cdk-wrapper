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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.CfnPublisher
import software.amazon.awscdk.IResolvable
import software.constructs.Construct

/**
 * Registers your account as a publisher of public extensions in the CloudFormation registry.
 *
 * Public extensions are available for use by all CloudFormation users.
 *
 * For information on requirements for registering as a public extension publisher, see
 * [Registering your account to publish CloudFormation extensions](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs)
 * in the *CloudFormation CLI User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnPublisher cfnPublisher = CfnPublisher.Builder.create(this, "MyCfnPublisher")
 * .acceptTermsAndConditions(false)
 * // the properties below are optional
 * .connectionArn("connectionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html)
 */
@CdkDslMarker
public class CfnPublisherDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPublisher.Builder = CfnPublisher.Builder.create(scope, id)

    /**
     * Whether you accept the
     * [Terms and Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     * for publishing extensions in the CloudFormation registry. You must accept the terms and
     * conditions in order to register to publish public extensions to the CloudFormation registry.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html#cfn-cloudformation-publisher-accepttermsandconditions)
     *
     * @param acceptTermsAndConditions Whether you accept the
     *   [Terms and Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     *   for publishing extensions in the CloudFormation registry. You must accept the terms and
     *   conditions in order to register to publish public extensions to the CloudFormation
     *   registry.
     */
    public fun acceptTermsAndConditions(acceptTermsAndConditions: Boolean) {
        cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions)
    }

    /**
     * Whether you accept the
     * [Terms and Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     * for publishing extensions in the CloudFormation registry. You must accept the terms and
     * conditions in order to register to publish public extensions to the CloudFormation registry.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html#cfn-cloudformation-publisher-accepttermsandconditions)
     *
     * @param acceptTermsAndConditions Whether you accept the
     *   [Terms and Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
     *   for publishing extensions in the CloudFormation registry. You must accept the terms and
     *   conditions in order to register to publish public extensions to the CloudFormation
     *   registry.
     */
    public fun acceptTermsAndConditions(acceptTermsAndConditions: IResolvable) {
        cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions)
    }

    /**
     * If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource
     * Name (ARN) for your connection to that account.
     *
     * For more information, see
     * [Registering your account to publish CloudFormation extensions](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs)
     * in the *CloudFormation CLI User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html#cfn-cloudformation-publisher-connectionarn)
     *
     * @param connectionArn If you are using a Bitbucket or GitHub account for identity
     *   verification, the Amazon Resource Name (ARN) for your connection to that account.
     */
    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
    }

    public fun build(): CfnPublisher = cdkBuilder.build()
}
