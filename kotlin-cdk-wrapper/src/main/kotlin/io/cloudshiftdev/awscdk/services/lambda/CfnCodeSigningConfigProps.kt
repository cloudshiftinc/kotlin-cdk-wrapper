@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

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
 * Properties for defining a `CfnCodeSigningConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * CfnCodeSigningConfigProps cfnCodeSigningConfigProps = CfnCodeSigningConfigProps.builder()
 * .allowedPublishers(AllowedPublishersProperty.builder()
 * .signingProfileVersionArns(List.of("signingProfileVersionArns"))
 * .build())
 * // the properties below are optional
 * .codeSigningPolicies(CodeSigningPoliciesProperty.builder()
 * .untrustedArtifactOnDeployment("untrustedArtifactOnDeployment")
 * .build())
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html)
 */
public interface CfnCodeSigningConfigProps {
  /**
   * List of allowed publishers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-allowedpublishers)
   */
  public fun allowedPublishers(): Any

  /**
   * The code signing policy controls the validation failure action for signature mismatch or
   * expiry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-codesigningpolicies)
   */
  public fun codeSigningPolicies(): Any? = unwrap(this).getCodeSigningPolicies()

  /**
   * Code signing configuration description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A list of tags to add to the code signing configuration.
   *
   *
   * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
   * permissions for your [IAM
   * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
   * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
   * unexpected behavior with stack-level tags propagating to the resource during resource creation and
   * update.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCodeSigningConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedPublishers List of allowed publishers. 
     */
    public fun allowedPublishers(allowedPublishers: IResolvable)

    /**
     * @param allowedPublishers List of allowed publishers. 
     */
    public fun allowedPublishers(allowedPublishers: CfnCodeSigningConfig.AllowedPublishersProperty)

    /**
     * @param allowedPublishers List of allowed publishers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7f1db813d05358885ef0302df434985d9ad461af6e278401a18997373901505")
    public
        fun allowedPublishers(allowedPublishers: CfnCodeSigningConfig.AllowedPublishersProperty.Builder.() -> Unit)

    /**
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     * signature mismatch or expiry.
     */
    public fun codeSigningPolicies(codeSigningPolicies: IResolvable)

    /**
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     * signature mismatch or expiry.
     */
    public
        fun codeSigningPolicies(codeSigningPolicies: CfnCodeSigningConfig.CodeSigningPoliciesProperty)

    /**
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     * signature mismatch or expiry.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f3501c9047c847cd43d9f53eace8c4e59b90fd6fffd1b1a3912796a63d689ff")
    public
        fun codeSigningPolicies(codeSigningPolicies: CfnCodeSigningConfig.CodeSigningPoliciesProperty.Builder.() -> Unit)

    /**
     * @param description Code signing configuration description.
     */
    public fun description(description: String)

    /**
     * @param tags A list of tags to add to the code signing configuration.
     *
     * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
     * permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags to add to the code signing configuration.
     *
     * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
     * permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps.Builder
        = software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps.builder()

    /**
     * @param allowedPublishers List of allowed publishers. 
     */
    override fun allowedPublishers(allowedPublishers: IResolvable) {
      cdkBuilder.allowedPublishers(allowedPublishers.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param allowedPublishers List of allowed publishers. 
     */
    override
        fun allowedPublishers(allowedPublishers: CfnCodeSigningConfig.AllowedPublishersProperty) {
      cdkBuilder.allowedPublishers(allowedPublishers.let(CfnCodeSigningConfig.AllowedPublishersProperty.Companion::unwrap))
    }

    /**
     * @param allowedPublishers List of allowed publishers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7f1db813d05358885ef0302df434985d9ad461af6e278401a18997373901505")
    override
        fun allowedPublishers(allowedPublishers: CfnCodeSigningConfig.AllowedPublishersProperty.Builder.() -> Unit):
        Unit = allowedPublishers(CfnCodeSigningConfig.AllowedPublishersProperty(allowedPublishers))

    /**
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     * signature mismatch or expiry.
     */
    override fun codeSigningPolicies(codeSigningPolicies: IResolvable) {
      cdkBuilder.codeSigningPolicies(codeSigningPolicies.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     * signature mismatch or expiry.
     */
    override
        fun codeSigningPolicies(codeSigningPolicies: CfnCodeSigningConfig.CodeSigningPoliciesProperty) {
      cdkBuilder.codeSigningPolicies(codeSigningPolicies.let(CfnCodeSigningConfig.CodeSigningPoliciesProperty.Companion::unwrap))
    }

    /**
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     * signature mismatch or expiry.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f3501c9047c847cd43d9f53eace8c4e59b90fd6fffd1b1a3912796a63d689ff")
    override
        fun codeSigningPolicies(codeSigningPolicies: CfnCodeSigningConfig.CodeSigningPoliciesProperty.Builder.() -> Unit):
        Unit =
        codeSigningPolicies(CfnCodeSigningConfig.CodeSigningPoliciesProperty(codeSigningPolicies))

    /**
     * @param description Code signing configuration description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param tags A list of tags to add to the code signing configuration.
     *
     * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
     * permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tags to add to the code signing configuration.
     *
     * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
     * permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps,
  ) : CdkObject(cdkObject),
      CfnCodeSigningConfigProps {
    /**
     * List of allowed publishers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-allowedpublishers)
     */
    override fun allowedPublishers(): Any = unwrap(this).getAllowedPublishers()

    /**
     * The code signing policy controls the validation failure action for signature mismatch or
     * expiry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-codesigningpolicies)
     */
    override fun codeSigningPolicies(): Any? = unwrap(this).getCodeSigningPolicies()

    /**
     * Code signing configuration description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A list of tags to add to the code signing configuration.
     *
     *
     * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
     * permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCodeSigningConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps):
        CfnCodeSigningConfigProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCodeSigningConfigProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeSigningConfigProps):
        software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps
  }
}
