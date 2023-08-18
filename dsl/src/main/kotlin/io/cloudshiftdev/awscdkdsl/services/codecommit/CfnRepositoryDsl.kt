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

package io.cloudshiftdev.awscdkdsl.services.codecommit

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codecommit.CfnRepository
import software.constructs.Construct

/**
 * Creates a new, empty repository.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codecommit.*;
 * CfnRepository cfnRepository = CfnRepository.Builder.create(this, "MyCfnRepository")
 * .repositoryName("repositoryName")
 * // the properties below are optional
 * .code(CodeProperty.builder()
 * .s3(S3Property.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * // the properties below are optional
 * .branchName("branchName")
 * .build())
 * .repositoryDescription("repositoryDescription")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .triggers(List.of(RepositoryTriggerProperty.builder()
 * .destinationArn("destinationArn")
 * .events(List.of("events"))
 * .name("name")
 * // the properties below are optional
 * .branches(List.of("branches"))
 * .customData("customData")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html)
 */
@CdkDslMarker
public class CfnRepositoryDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRepository.Builder = CfnRepository.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _triggers: MutableList<Any> = mutableListOf()

    /**
     * Information about code to be committed to a repository after it is created in an AWS
     * CloudFormation stack.
     *
     * Information about code is only used in resource creation. Updates to a stack will not reflect
     * changes made to code properties after initial resource creation.
     *
     * You can only use this property to add code when creating a repository with a AWS
     * CloudFormation template at creation time. This property cannot be used for updating code to
     * an existing repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-code)
     *
     * @param code Information about code to be committed to a repository after it is created in an
     *   AWS CloudFormation stack.
     */
    public fun code(code: IResolvable) {
        cdkBuilder.code(code)
    }

    /**
     * Information about code to be committed to a repository after it is created in an AWS
     * CloudFormation stack.
     *
     * Information about code is only used in resource creation. Updates to a stack will not reflect
     * changes made to code properties after initial resource creation.
     *
     * You can only use this property to add code when creating a repository with a AWS
     * CloudFormation template at creation time. This property cannot be used for updating code to
     * an existing repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-code)
     *
     * @param code Information about code to be committed to a repository after it is created in an
     *   AWS CloudFormation stack.
     */
    public fun code(code: CfnRepository.CodeProperty) {
        cdkBuilder.code(code)
    }

    /**
     * A comment or description about the new repository.
     *
     * The description field for a repository accepts all HTML characters and all valid Unicode
     * characters. Applications that do not HTML-encode the description and display it in a webpage
     * can expose users to potentially malicious code. Make sure that you HTML-encode the
     * description field in any application that uses this API to display the repository description
     * on a webpage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription)
     *
     * @param repositoryDescription A comment or description about the new repository.
     */
    public fun repositoryDescription(repositoryDescription: String) {
        cdkBuilder.repositoryDescription(repositoryDescription)
    }

    /**
     * The name of the new repository to be created.
     *
     * The repository name must be unique across the calling AWS account . Repository names are
     * limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain
     * characters. For more information about the limits on repository names, see
     * [Quotas](https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html) in the *AWS
     * CodeCommit User Guide* . The suffix .git is prohibited.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositoryname)
     *
     * @param repositoryName The name of the new repository to be created.
     */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * One or more tag key-value pairs to use when tagging this repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-tags)
     *
     * @param tags One or more tag key-value pairs to use when tagging this repository.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * One or more tag key-value pairs to use when tagging this repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-tags)
     *
     * @param tags One or more tag key-value pairs to use when tagging this repository.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The JSON block of configuration information for each trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers)
     *
     * @param triggers The JSON block of configuration information for each trigger.
     */
    public fun triggers(vararg triggers: Any) {
        _triggers.addAll(listOf(*triggers))
    }

    /**
     * The JSON block of configuration information for each trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers)
     *
     * @param triggers The JSON block of configuration information for each trigger.
     */
    public fun triggers(triggers: Collection<Any>) {
        _triggers.addAll(triggers)
    }

    /**
     * The JSON block of configuration information for each trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers)
     *
     * @param triggers The JSON block of configuration information for each trigger.
     */
    public fun triggers(triggers: IResolvable) {
        cdkBuilder.triggers(triggers)
    }

    public fun build(): CfnRepository {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_triggers.isNotEmpty()) cdkBuilder.triggers(_triggers)
        return cdkBuilder.build()
    }
}
