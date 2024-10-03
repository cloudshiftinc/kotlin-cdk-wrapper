@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Details about a [Code signing
 * configuration](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * CfnCodeSigningConfig cfnCodeSigningConfig = CfnCodeSigningConfig.Builder.create(this,
 * "MyCfnCodeSigningConfig")
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
public open class CfnCodeSigningConfig(
  cdkObject: software.amazon.awscdk.services.lambda.CfnCodeSigningConfig,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCodeSigningConfigProps,
  ) :
      this(software.amazon.awscdk.services.lambda.CfnCodeSigningConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCodeSigningConfigProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCodeSigningConfigProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCodeSigningConfigProps(props)
  )

  /**
   * List of allowed publishers.
   */
  public open fun allowedPublishers(): Any = unwrap(this).getAllowedPublishers()

  /**
   * List of allowed publishers.
   */
  public open fun allowedPublishers(`value`: IResolvable) {
    unwrap(this).setAllowedPublishers(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * List of allowed publishers.
   */
  public open fun allowedPublishers(`value`: AllowedPublishersProperty) {
    unwrap(this).setAllowedPublishers(`value`.let(AllowedPublishersProperty.Companion::unwrap))
  }

  /**
   * List of allowed publishers.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7664f939fdb01cca43ac2c240abfd9d052c562a12ef5438c5670dfc627e96536")
  public open fun allowedPublishers(`value`: AllowedPublishersProperty.Builder.() -> Unit): Unit =
      allowedPublishers(AllowedPublishersProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the code signing configuration.
   */
  public open fun attrCodeSigningConfigArn(): String = unwrap(this).getAttrCodeSigningConfigArn()

  /**
   * The code signing configuration ID.
   */
  public open fun attrCodeSigningConfigId(): String = unwrap(this).getAttrCodeSigningConfigId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The code signing policy controls the validation failure action for signature mismatch or
   * expiry.
   */
  public open fun codeSigningPolicies(): Any? = unwrap(this).getCodeSigningPolicies()

  /**
   * The code signing policy controls the validation failure action for signature mismatch or
   * expiry.
   */
  public open fun codeSigningPolicies(`value`: IResolvable) {
    unwrap(this).setCodeSigningPolicies(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The code signing policy controls the validation failure action for signature mismatch or
   * expiry.
   */
  public open fun codeSigningPolicies(`value`: CodeSigningPoliciesProperty) {
    unwrap(this).setCodeSigningPolicies(`value`.let(CodeSigningPoliciesProperty.Companion::unwrap))
  }

  /**
   * The code signing policy controls the validation failure action for signature mismatch or
   * expiry.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5f8eeb727f6c737f39415bd844347442f436c956edade458b12695875066bd78")
  public open fun codeSigningPolicies(`value`: CodeSigningPoliciesProperty.Builder.() -> Unit): Unit
      = codeSigningPolicies(CodeSigningPoliciesProperty(`value`))

  /**
   * Code signing configuration description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Code signing configuration description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A list of tags to apply to CodeSigningConfig resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of tags to apply to CodeSigningConfig resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags to apply to CodeSigningConfig resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.CfnCodeSigningConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * List of allowed publishers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-allowedpublishers)
     * @param allowedPublishers List of allowed publishers. 
     */
    public fun allowedPublishers(allowedPublishers: IResolvable)

    /**
     * List of allowed publishers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-allowedpublishers)
     * @param allowedPublishers List of allowed publishers. 
     */
    public fun allowedPublishers(allowedPublishers: AllowedPublishersProperty)

    /**
     * List of allowed publishers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-allowedpublishers)
     * @param allowedPublishers List of allowed publishers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c2395a9a65c86a919fe259c9e87bafb8370a17fc1a777d0393a8be7354c0731")
    public fun allowedPublishers(allowedPublishers: AllowedPublishersProperty.Builder.() -> Unit)

    /**
     * The code signing policy controls the validation failure action for signature mismatch or
     * expiry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-codesigningpolicies)
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     * signature mismatch or expiry. 
     */
    public fun codeSigningPolicies(codeSigningPolicies: IResolvable)

    /**
     * The code signing policy controls the validation failure action for signature mismatch or
     * expiry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-codesigningpolicies)
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     * signature mismatch or expiry. 
     */
    public fun codeSigningPolicies(codeSigningPolicies: CodeSigningPoliciesProperty)

    /**
     * The code signing policy controls the validation failure action for signature mismatch or
     * expiry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-codesigningpolicies)
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     * signature mismatch or expiry. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e89c4bb122d8303bbd07d0c45a8ccec11bfba0a9205276573e8b3bdf0af14c6")
    public
        fun codeSigningPolicies(codeSigningPolicies: CodeSigningPoliciesProperty.Builder.() -> Unit)

    /**
     * Code signing configuration description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-description)
     * @param description Code signing configuration description. 
     */
    public fun description(description: String)

    /**
     * A list of tags to apply to CodeSigningConfig resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-tags)
     * @param tags A list of tags to apply to CodeSigningConfig resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags to apply to CodeSigningConfig resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-tags)
     * @param tags A list of tags to apply to CodeSigningConfig resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.Builder =
        software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.Builder.create(scope, id)

    /**
     * List of allowed publishers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-allowedpublishers)
     * @param allowedPublishers List of allowed publishers. 
     */
    override fun allowedPublishers(allowedPublishers: IResolvable) {
      cdkBuilder.allowedPublishers(allowedPublishers.let(IResolvable.Companion::unwrap))
    }

    /**
     * List of allowed publishers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-allowedpublishers)
     * @param allowedPublishers List of allowed publishers. 
     */
    override fun allowedPublishers(allowedPublishers: AllowedPublishersProperty) {
      cdkBuilder.allowedPublishers(allowedPublishers.let(AllowedPublishersProperty.Companion::unwrap))
    }

    /**
     * List of allowed publishers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-allowedpublishers)
     * @param allowedPublishers List of allowed publishers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c2395a9a65c86a919fe259c9e87bafb8370a17fc1a777d0393a8be7354c0731")
    override fun allowedPublishers(allowedPublishers: AllowedPublishersProperty.Builder.() -> Unit):
        Unit = allowedPublishers(AllowedPublishersProperty(allowedPublishers))

    /**
     * The code signing policy controls the validation failure action for signature mismatch or
     * expiry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-codesigningpolicies)
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     * signature mismatch or expiry. 
     */
    override fun codeSigningPolicies(codeSigningPolicies: IResolvable) {
      cdkBuilder.codeSigningPolicies(codeSigningPolicies.let(IResolvable.Companion::unwrap))
    }

    /**
     * The code signing policy controls the validation failure action for signature mismatch or
     * expiry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-codesigningpolicies)
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     * signature mismatch or expiry. 
     */
    override fun codeSigningPolicies(codeSigningPolicies: CodeSigningPoliciesProperty) {
      cdkBuilder.codeSigningPolicies(codeSigningPolicies.let(CodeSigningPoliciesProperty.Companion::unwrap))
    }

    /**
     * The code signing policy controls the validation failure action for signature mismatch or
     * expiry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-codesigningpolicies)
     * @param codeSigningPolicies The code signing policy controls the validation failure action for
     * signature mismatch or expiry. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e89c4bb122d8303bbd07d0c45a8ccec11bfba0a9205276573e8b3bdf0af14c6")
    override
        fun codeSigningPolicies(codeSigningPolicies: CodeSigningPoliciesProperty.Builder.() -> Unit):
        Unit = codeSigningPolicies(CodeSigningPoliciesProperty(codeSigningPolicies))

    /**
     * Code signing configuration description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-description)
     * @param description Code signing configuration description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A list of tags to apply to CodeSigningConfig resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-tags)
     * @param tags A list of tags to apply to CodeSigningConfig resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of tags to apply to CodeSigningConfig resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-codesigningconfig.html#cfn-lambda-codesigningconfig-tags)
     * @param tags A list of tags to apply to CodeSigningConfig resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lambda.CfnCodeSigningConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCodeSigningConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCodeSigningConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnCodeSigningConfig):
        CfnCodeSigningConfig = CfnCodeSigningConfig(cdkObject)

    internal fun unwrap(wrapped: CfnCodeSigningConfig):
        software.amazon.awscdk.services.lambda.CfnCodeSigningConfig = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.CfnCodeSigningConfig
  }

  /**
   * List of signing profiles that can sign a code package.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * AllowedPublishersProperty allowedPublishersProperty = AllowedPublishersProperty.builder()
   * .signingProfileVersionArns(List.of("signingProfileVersionArns"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-codesigningconfig-allowedpublishers.html)
   */
  public interface AllowedPublishersProperty {
    /**
     * The Amazon Resource Name (ARN) for each of the signing profiles.
     *
     * A signing profile defines a trusted user who can sign a code package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-codesigningconfig-allowedpublishers.html#cfn-lambda-codesigningconfig-allowedpublishers-signingprofileversionarns)
     */
    public fun signingProfileVersionArns(): List<String>

    /**
     * A builder for [AllowedPublishersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param signingProfileVersionArns The Amazon Resource Name (ARN) for each of the signing
       * profiles. 
       * A signing profile defines a trusted user who can sign a code package.
       */
      public fun signingProfileVersionArns(signingProfileVersionArns: List<String>)

      /**
       * @param signingProfileVersionArns The Amazon Resource Name (ARN) for each of the signing
       * profiles. 
       * A signing profile defines a trusted user who can sign a code package.
       */
      public fun signingProfileVersionArns(vararg signingProfileVersionArns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty.builder()

      /**
       * @param signingProfileVersionArns The Amazon Resource Name (ARN) for each of the signing
       * profiles. 
       * A signing profile defines a trusted user who can sign a code package.
       */
      override fun signingProfileVersionArns(signingProfileVersionArns: List<String>) {
        cdkBuilder.signingProfileVersionArns(signingProfileVersionArns)
      }

      /**
       * @param signingProfileVersionArns The Amazon Resource Name (ARN) for each of the signing
       * profiles. 
       * A signing profile defines a trusted user who can sign a code package.
       */
      override fun signingProfileVersionArns(vararg signingProfileVersionArns: String): Unit =
          signingProfileVersionArns(signingProfileVersionArns.toList())

      public fun build():
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty,
    ) : CdkObject(cdkObject),
        AllowedPublishersProperty {
      /**
       * The Amazon Resource Name (ARN) for each of the signing profiles.
       *
       * A signing profile defines a trusted user who can sign a code package.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-codesigningconfig-allowedpublishers.html#cfn-lambda-codesigningconfig-allowedpublishers-signingprofileversionarns)
       */
      override fun signingProfileVersionArns(): List<String> =
          unwrap(this).getSigningProfileVersionArns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AllowedPublishersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty):
          AllowedPublishersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AllowedPublishersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AllowedPublishersProperty):
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty
    }
  }

  /**
   * Code signing configuration
   * [policies](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html#config-codesigning-policies)
   * specify the validation failure action for signature mismatch or expiry.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * CodeSigningPoliciesProperty codeSigningPoliciesProperty = CodeSigningPoliciesProperty.builder()
   * .untrustedArtifactOnDeployment("untrustedArtifactOnDeployment")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-codesigningconfig-codesigningpolicies.html)
   */
  public interface CodeSigningPoliciesProperty {
    /**
     * Code signing configuration policy for deployment validation failure.
     *
     * If you set the policy to `Enforce` , Lambda blocks the deployment request if signature
     * validation checks fail. If you set the policy to `Warn` , Lambda allows the deployment and
     * creates a CloudWatch log.
     *
     * Default value: `Warn`
     *
     * Default: - "Warn"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-codesigningconfig-codesigningpolicies.html#cfn-lambda-codesigningconfig-codesigningpolicies-untrustedartifactondeployment)
     */
    public fun untrustedArtifactOnDeployment(): String

    /**
     * A builder for [CodeSigningPoliciesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param untrustedArtifactOnDeployment Code signing configuration policy for deployment
       * validation failure. 
       * If you set the policy to `Enforce` , Lambda blocks the deployment request if signature
       * validation checks fail. If you set the policy to `Warn` , Lambda allows the deployment and
       * creates a CloudWatch log.
       *
       * Default value: `Warn`
       */
      public fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty.builder()

      /**
       * @param untrustedArtifactOnDeployment Code signing configuration policy for deployment
       * validation failure. 
       * If you set the policy to `Enforce` , Lambda blocks the deployment request if signature
       * validation checks fail. If you set the policy to `Warn` , Lambda allows the deployment and
       * creates a CloudWatch log.
       *
       * Default value: `Warn`
       */
      override fun untrustedArtifactOnDeployment(untrustedArtifactOnDeployment: String) {
        cdkBuilder.untrustedArtifactOnDeployment(untrustedArtifactOnDeployment)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty,
    ) : CdkObject(cdkObject),
        CodeSigningPoliciesProperty {
      /**
       * Code signing configuration policy for deployment validation failure.
       *
       * If you set the policy to `Enforce` , Lambda blocks the deployment request if signature
       * validation checks fail. If you set the policy to `Warn` , Lambda allows the deployment and
       * creates a CloudWatch log.
       *
       * Default value: `Warn`
       *
       * Default: - "Warn"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-codesigningconfig-codesigningpolicies.html#cfn-lambda-codesigningconfig-codesigningpolicies-untrustedartifactondeployment)
       */
      override fun untrustedArtifactOnDeployment(): String =
          unwrap(this).getUntrustedArtifactOnDeployment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeSigningPoliciesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty):
          CodeSigningPoliciesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CodeSigningPoliciesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeSigningPoliciesProperty):
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.CodeSigningPoliciesProperty
    }
  }
}
