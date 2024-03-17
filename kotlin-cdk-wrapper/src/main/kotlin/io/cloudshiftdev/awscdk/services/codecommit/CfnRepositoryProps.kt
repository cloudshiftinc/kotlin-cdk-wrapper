@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnRepository`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codecommit.*;
 * CfnRepositoryProps cfnRepositoryProps = CfnRepositoryProps.builder()
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
 * .kmsKeyId("kmsKeyId")
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
public interface CfnRepositoryProps {
  /**
   * Information about code to be committed to a repository after it is created in an AWS
   * CloudFormation stack.
   *
   * Information about code is only used in resource creation. Updates to a stack will not reflect
   * changes made to code properties after initial resource creation.
   *
   *
   * You can only use this property to add code when creating a repository with a AWS CloudFormation
   * template at creation time. This property cannot be used for updating code to an existing
   * repository.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-code)
   */
  public fun code(): Any? = unwrap(this).getCode()

  /**
   * The ID of the AWS Key Management Service encryption key used to encrypt and decrypt the
   * repository.
   *
   *
   * The input can be the full ARN, the key ID, or the key alias. For more information, see [Finding
   * the key ID and key
   * ARN](https://docs.aws.amazon.com/kms/latest/developerguide/find-cmk-id-arn.html) .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * A comment or description about the new repository.
   *
   *
   * The description field for a repository accepts all HTML characters and all valid Unicode
   * characters. Applications that do not HTML-encode the description and display it in a webpage can
   * expose users to potentially malicious code. Make sure that you HTML-encode the description field
   * in any application that uses this API to display the repository description on a webpage.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription)
   */
  public fun repositoryDescription(): String? = unwrap(this).getRepositoryDescription()

  /**
   * The name of the new repository to be created.
   *
   *
   * The repository name must be unique across the calling AWS account . Repository names are
   * limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain
   * characters. For more information about the limits on repository names, see
   * [Quotas](https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html) in the *AWS
   * CodeCommit User Guide* . The suffix .git is prohibited.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositoryname)
   */
  public fun repositoryName(): String

  /**
   * One or more tag key-value pairs to use when tagging this repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The JSON block of configuration information for each trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers)
   */
  public fun triggers(): Any? = unwrap(this).getTriggers()

  /**
   * A builder for [CfnRepositoryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack.
     * Information about code is only used in resource creation. Updates to a stack will not reflect
     * changes made to code properties after initial resource creation.
     *
     *
     * You can only use this property to add code when creating a repository with a AWS
     * CloudFormation template at creation time. This property cannot be used for updating code to an
     * existing repository.
     */
    public fun code(code: IResolvable)

    /**
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack.
     * Information about code is only used in resource creation. Updates to a stack will not reflect
     * changes made to code properties after initial resource creation.
     *
     *
     * You can only use this property to add code when creating a repository with a AWS
     * CloudFormation template at creation time. This property cannot be used for updating code to an
     * existing repository.
     */
    public fun code(code: CfnRepository.CodeProperty)

    /**
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack.
     * Information about code is only used in resource creation. Updates to a stack will not reflect
     * changes made to code properties after initial resource creation.
     *
     *
     * You can only use this property to add code when creating a repository with a AWS
     * CloudFormation template at creation time. This property cannot be used for updating code to an
     * existing repository.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3362cd5fbc6378c72f0770c9179381e51ab802c441811b23c2b68da11403ad39")
    public fun code(code: CfnRepository.CodeProperty.Builder.() -> Unit)

    /**
     * @param kmsKeyId The ID of the AWS Key Management Service encryption key used to encrypt and
     * decrypt the repository.
     *
     * The input can be the full ARN, the key ID, or the key alias. For more information, see
     * [Finding the key ID and key
     * ARN](https://docs.aws.amazon.com/kms/latest/developerguide/find-cmk-id-arn.html) .
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param repositoryDescription A comment or description about the new repository.
     *
     * The description field for a repository accepts all HTML characters and all valid Unicode
     * characters. Applications that do not HTML-encode the description and display it in a webpage can
     * expose users to potentially malicious code. Make sure that you HTML-encode the description field
     * in any application that uses this API to display the repository description on a webpage.
     */
    public fun repositoryDescription(repositoryDescription: String)

    /**
     * @param repositoryName The name of the new repository to be created. 
     *
     * The repository name must be unique across the calling AWS account . Repository names are
     * limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain
     * characters. For more information about the limits on repository names, see
     * [Quotas](https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html) in the *AWS
     * CodeCommit User Guide* . The suffix .git is prohibited.
     */
    public fun repositoryName(repositoryName: String)

    /**
     * @param tags One or more tag key-value pairs to use when tagging this repository.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags One or more tag key-value pairs to use when tagging this repository.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param triggers The JSON block of configuration information for each trigger.
     */
    public fun triggers(triggers: IResolvable)

    /**
     * @param triggers The JSON block of configuration information for each trigger.
     */
    public fun triggers(triggers: List<Any>)

    /**
     * @param triggers The JSON block of configuration information for each trigger.
     */
    public fun triggers(vararg triggers: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codecommit.CfnRepositoryProps.Builder =
        software.amazon.awscdk.services.codecommit.CfnRepositoryProps.builder()

    /**
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack.
     * Information about code is only used in resource creation. Updates to a stack will not reflect
     * changes made to code properties after initial resource creation.
     *
     *
     * You can only use this property to add code when creating a repository with a AWS
     * CloudFormation template at creation time. This property cannot be used for updating code to an
     * existing repository.
     */
    override fun code(code: IResolvable) {
      cdkBuilder.code(code.let(IResolvable::unwrap))
    }

    /**
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack.
     * Information about code is only used in resource creation. Updates to a stack will not reflect
     * changes made to code properties after initial resource creation.
     *
     *
     * You can only use this property to add code when creating a repository with a AWS
     * CloudFormation template at creation time. This property cannot be used for updating code to an
     * existing repository.
     */
    override fun code(code: CfnRepository.CodeProperty) {
      cdkBuilder.code(code.let(CfnRepository.CodeProperty::unwrap))
    }

    /**
     * @param code Information about code to be committed to a repository after it is created in an
     * AWS CloudFormation stack.
     * Information about code is only used in resource creation. Updates to a stack will not reflect
     * changes made to code properties after initial resource creation.
     *
     *
     * You can only use this property to add code when creating a repository with a AWS
     * CloudFormation template at creation time. This property cannot be used for updating code to an
     * existing repository.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3362cd5fbc6378c72f0770c9179381e51ab802c441811b23c2b68da11403ad39")
    override fun code(code: CfnRepository.CodeProperty.Builder.() -> Unit): Unit =
        code(CfnRepository.CodeProperty(code))

    /**
     * @param kmsKeyId The ID of the AWS Key Management Service encryption key used to encrypt and
     * decrypt the repository.
     *
     * The input can be the full ARN, the key ID, or the key alias. For more information, see
     * [Finding the key ID and key
     * ARN](https://docs.aws.amazon.com/kms/latest/developerguide/find-cmk-id-arn.html) .
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param repositoryDescription A comment or description about the new repository.
     *
     * The description field for a repository accepts all HTML characters and all valid Unicode
     * characters. Applications that do not HTML-encode the description and display it in a webpage can
     * expose users to potentially malicious code. Make sure that you HTML-encode the description field
     * in any application that uses this API to display the repository description on a webpage.
     */
    override fun repositoryDescription(repositoryDescription: String) {
      cdkBuilder.repositoryDescription(repositoryDescription)
    }

    /**
     * @param repositoryName The name of the new repository to be created. 
     *
     * The repository name must be unique across the calling AWS account . Repository names are
     * limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain
     * characters. For more information about the limits on repository names, see
     * [Quotas](https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html) in the *AWS
     * CodeCommit User Guide* . The suffix .git is prohibited.
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * @param tags One or more tag key-value pairs to use when tagging this repository.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags One or more tag key-value pairs to use when tagging this repository.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param triggers The JSON block of configuration information for each trigger.
     */
    override fun triggers(triggers: IResolvable) {
      cdkBuilder.triggers(triggers.let(IResolvable::unwrap))
    }

    /**
     * @param triggers The JSON block of configuration information for each trigger.
     */
    override fun triggers(triggers: List<Any>) {
      cdkBuilder.triggers(triggers)
    }

    /**
     * @param triggers The JSON block of configuration information for each trigger.
     */
    override fun triggers(vararg triggers: Any): Unit = triggers(triggers.toList())

    public fun build(): software.amazon.awscdk.services.codecommit.CfnRepositoryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codecommit.CfnRepositoryProps,
  ) : CdkObject(cdkObject), CfnRepositoryProps {
    /**
     * Information about code to be committed to a repository after it is created in an AWS
     * CloudFormation stack.
     *
     * Information about code is only used in resource creation. Updates to a stack will not reflect
     * changes made to code properties after initial resource creation.
     *
     *
     * You can only use this property to add code when creating a repository with a AWS
     * CloudFormation template at creation time. This property cannot be used for updating code to an
     * existing repository.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-code)
     */
    override fun code(): Any? = unwrap(this).getCode()

    /**
     * The ID of the AWS Key Management Service encryption key used to encrypt and decrypt the
     * repository.
     *
     *
     * The input can be the full ARN, the key ID, or the key alias. For more information, see
     * [Finding the key ID and key
     * ARN](https://docs.aws.amazon.com/kms/latest/developerguide/find-cmk-id-arn.html) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A comment or description about the new repository.
     *
     *
     * The description field for a repository accepts all HTML characters and all valid Unicode
     * characters. Applications that do not HTML-encode the description and display it in a webpage can
     * expose users to potentially malicious code. Make sure that you HTML-encode the description field
     * in any application that uses this API to display the repository description on a webpage.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription)
     */
    override fun repositoryDescription(): String? = unwrap(this).getRepositoryDescription()

    /**
     * The name of the new repository to be created.
     *
     *
     * The repository name must be unique across the calling AWS account . Repository names are
     * limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain
     * characters. For more information about the limits on repository names, see
     * [Quotas](https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html) in the *AWS
     * CodeCommit User Guide* . The suffix .git is prohibited.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositoryname)
     */
    override fun repositoryName(): String = unwrap(this).getRepositoryName()

    /**
     * One or more tag key-value pairs to use when tagging this repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The JSON block of configuration information for each trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers)
     */
    override fun triggers(): Any? = unwrap(this).getTriggers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRepositoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.CfnRepositoryProps):
        CfnRepositoryProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRepositoryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryProps):
        software.amazon.awscdk.services.codecommit.CfnRepositoryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codecommit.CfnRepositoryProps
  }
}
