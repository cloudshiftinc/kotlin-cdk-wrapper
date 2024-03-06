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

package io.cloudshiftdev.awscdkdsl.services.lakeformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnResource
import software.constructs.Construct

/**
 * The `AWS::LakeFormation::Resource` represents the data ( buckets and folders) that is being
 * registered with AWS Lake Formation .
 *
 * During a stack operation, AWS CloudFormation calls the AWS Lake Formation
 * [`RegisterResource`](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-credential-vending.html#aws-lake-formation-api-credential-vending-RegisterResource)
 * API operation to register the resource. To remove a `Resource` type, AWS CloudFormation calls the
 * AWS Lake Formation
 * [`DeregisterResource`](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-credential-vending.html#aws-lake-formation-api-credential-vending-DeregisterResource)
 * API operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * CfnResource cfnResource = CfnResource.Builder.create(this, "MyCfnResource")
 * .resourceArn("resourceArn")
 * .useServiceLinkedRole(false)
 * // the properties below are optional
 * .hybridAccessEnabled(false)
 * .roleArn("roleArn")
 * .withFederation(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html)
 */
@CdkDslMarker
public class CfnResourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResource.Builder = CfnResource.Builder.create(scope, id)

    /**
     * Indicates whether the data access of tables pointing to the location can be managed by both
     * Lake Formation permissions as well as Amazon S3 bucket policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-hybridaccessenabled)
     *
     * @param hybridAccessEnabled Indicates whether the data access of tables pointing to the
     *   location can be managed by both Lake Formation permissions as well as Amazon S3 bucket
     *   policies.
     */
    public fun hybridAccessEnabled(hybridAccessEnabled: Boolean) {
        cdkBuilder.hybridAccessEnabled(hybridAccessEnabled)
    }

    /**
     * Indicates whether the data access of tables pointing to the location can be managed by both
     * Lake Formation permissions as well as Amazon S3 bucket policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-hybridaccessenabled)
     *
     * @param hybridAccessEnabled Indicates whether the data access of tables pointing to the
     *   location can be managed by both Lake Formation permissions as well as Amazon S3 bucket
     *   policies.
     */
    public fun hybridAccessEnabled(hybridAccessEnabled: IResolvable) {
        cdkBuilder.hybridAccessEnabled(hybridAccessEnabled)
    }

    /**
     * The Amazon Resource Name (ARN) of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-resourcearn)
     *
     * @param resourceArn The Amazon Resource Name (ARN) of the resource.
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * The IAM role that registered a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-rolearn)
     *
     * @param roleArn The IAM role that registered a resource.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * Designates a trusted caller, an IAM principal, by registering this caller with the Data
     * Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-useservicelinkedrole)
     *
     * @param useServiceLinkedRole Designates a trusted caller, an IAM principal, by registering
     *   this caller with the Data Catalog .
     */
    public fun useServiceLinkedRole(useServiceLinkedRole: Boolean) {
        cdkBuilder.useServiceLinkedRole(useServiceLinkedRole)
    }

    /**
     * Designates a trusted caller, an IAM principal, by registering this caller with the Data
     * Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-useservicelinkedrole)
     *
     * @param useServiceLinkedRole Designates a trusted caller, an IAM principal, by registering
     *   this caller with the Data Catalog .
     */
    public fun useServiceLinkedRole(useServiceLinkedRole: IResolvable) {
        cdkBuilder.useServiceLinkedRole(useServiceLinkedRole)
    }

    /**
     * Allows Lake Formation to assume a role to access tables in a federated database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-withfederation)
     *
     * @param withFederation Allows Lake Formation to assume a role to access tables in a federated
     *   database.
     */
    public fun withFederation(withFederation: Boolean) {
        cdkBuilder.withFederation(withFederation)
    }

    /**
     * Allows Lake Formation to assume a role to access tables in a federated database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html#cfn-lakeformation-resource-withfederation)
     *
     * @param withFederation Allows Lake Formation to assume a role to access tables in a federated
     *   database.
     */
    public fun withFederation(withFederation: IResolvable) {
        cdkBuilder.withFederation(withFederation)
    }

    public fun build(): CfnResource = cdkBuilder.build()
}
