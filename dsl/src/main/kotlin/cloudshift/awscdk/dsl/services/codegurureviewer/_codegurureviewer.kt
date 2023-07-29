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

package cloudshift.awscdk.dsl.services.codegurureviewer

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation
import software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps
import software.constructs.Construct

public object codegurureviewer {
    /**
     * This resource configures how Amazon CodeGuru Reviewer retrieves the source code to be
     * reviewed.
     *
     * You can use an AWS CloudFormation template to create an association with the following
     * repository types:
     * * AWS CodeCommit - For more information, see
     *   [Create an AWS CodeCommit repository association](https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/create-codecommit-association.html)
     *   in the *Amazon CodeGuru Reviewer User Guide* .
     * * Bitbucket - For more information, see
     *   [Create a Bitbucket repository association](https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/create-bitbucket-association.html)
     *   in the *Amazon CodeGuru Reviewer User Guide* .
     * * GitHub Enterprise Server - For more information, see
     *   [Create a GitHub Enterprise Server repository association](https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/create-github-enterprise-association.html)
     *   in the *Amazon CodeGuru Reviewer User Guide* .
     * * S3Bucket - For more information, see
     *   [Create code reviews with GitHub Actions](https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/working-with-cicd.html)
     *   in the *Amazon CodeGuru Reviewer User Guide* .
     *
     * You cannot use a CloudFormation template to create an association with a GitHub repository.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codegurureviewer.*;
     * CfnRepositoryAssociation cfnRepositoryAssociation =
     * CfnRepositoryAssociation.Builder.create(this, "MyCfnRepositoryAssociation")
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .bucketName("bucketName")
     * .connectionArn("connectionArn")
     * .owner("owner")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html)
     */
    public inline fun cfnRepositoryAssociation(
        scope: Construct,
        id: String,
        block: CfnRepositoryAssociationDsl.() -> Unit = {},
    ): CfnRepositoryAssociation {
        val builder = CfnRepositoryAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRepositoryAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codegurureviewer.*;
     * CfnRepositoryAssociationProps cfnRepositoryAssociationProps =
     * CfnRepositoryAssociationProps.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .bucketName("bucketName")
     * .connectionArn("connectionArn")
     * .owner("owner")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html)
     */
    public inline fun cfnRepositoryAssociationProps(
        block: CfnRepositoryAssociationPropsDsl.() -> Unit = {}
    ): CfnRepositoryAssociationProps {
        val builder = CfnRepositoryAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
