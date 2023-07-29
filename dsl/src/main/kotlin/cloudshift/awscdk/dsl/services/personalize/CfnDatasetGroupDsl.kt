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

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.personalize.CfnDatasetGroup
import software.constructs.Construct

/**
 * A dataset group is a collection of related datasets (Interactions, User, and Item).
 *
 * You create a dataset group by calling
 * [CreateDatasetGroup](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetGroup.html)
 * . You then create a dataset and add it to a dataset group by calling
 * [CreateDataset](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html) . The
 * dataset group is used to create and train a solution by calling
 * [CreateSolution](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html) . A
 * dataset group can contain only one of each type of dataset.
 *
 * You can specify an AWS Key Management Service (KMS) key to encrypt the datasets in the group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.personalize.*;
 * CfnDatasetGroup cfnDatasetGroup = CfnDatasetGroup.Builder.create(this, "MyCfnDatasetGroup")
 * .name("name")
 * // the properties below are optional
 * .domain("domain")
 * .kmsKeyArn("kmsKeyArn")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html)
 */
@CdkDslMarker
public class CfnDatasetGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDatasetGroup.Builder = CfnDatasetGroup.Builder.create(scope, id)

    /**
     * The domain of a Domain dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-domain)
     *
     * @param domain The domain of a Domain dataset group.
     */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt
     * the datasets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-kmskeyarn)
     *
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key
     *   used to encrypt the datasets.
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * The name of the dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-name)
     *
     * @param name The name of the dataset group.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The ARN of the IAM role that has permissions to create the dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-datasetgroup.html#cfn-personalize-datasetgroup-rolearn)
     *
     * @param roleArn The ARN of the IAM role that has permissions to create the dataset group.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnDatasetGroup = cdkBuilder.build()
}
