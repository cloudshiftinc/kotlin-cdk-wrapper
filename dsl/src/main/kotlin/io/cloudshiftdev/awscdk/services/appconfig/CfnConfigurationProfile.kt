package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfigurationProfile internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.appconfig.CfnConfigurationProfile,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The application ID.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The application ID.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * The configuration profile ID.
   */
  public open fun attrConfigurationProfileId(): String =
      unwrap(this).getAttrConfigurationProfileId()

  /**
   * The Amazon Resource Name of the AWS Key Management Service key to encrypt new configuration
   * data versions in the AWS AppConfig hosted configuration store.
   *
   * This attribute is only used for hosted configuration types. To encrypt data managed in other
   * configuration stores, see the documentation for how to specify an AWS KMS key for that particular
   * service.
   */
  public open fun attrKmsKeyArn(): String = unwrap(this).getAttrKmsKeyArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A description of the configuration profile.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the configuration profile.
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The AWS Key Management Service key identifier (key ID, key alias, or key ARN) provided when the
   * resource was created or updated.
   */
  public open fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  /**
   * The AWS Key Management Service key identifier (key ID, key alias, or key ARN) provided when the
   * resource was created or updated.
   */
  public open fun kmsKeyIdentifier(`value`: String) {
    unwrap(this).setKmsKeyIdentifier(`value`)
  }

  /**
   * A URI to locate the configuration.
   *
   * You can specify the following:.
   */
  public open fun locationUri(): String = unwrap(this).getLocationUri()

  /**
   * A URI to locate the configuration.
   *
   * You can specify the following:.
   */
  public open fun locationUri(`value`: String) {
    unwrap(this).setLocationUri(`value`)
  }

  /**
   * A name for the configuration profile.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for the configuration profile.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ARN of an IAM role with permission to access the configuration at the specified
   * `LocationUri` .
   */
  public open fun retrievalRoleArn(): String? = unwrap(this).getRetrievalRoleArn()

  /**
   * The ARN of an IAM role with permission to access the configuration at the specified
   * `LocationUri` .
   */
  public open fun retrievalRoleArn(`value`: String) {
    unwrap(this).setRetrievalRoleArn(`value`)
  }

  /**
   * Metadata to assign to the configuration profile.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Metadata to assign to the configuration profile.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata to assign to the configuration profile.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The type of configurations contained in the profile.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The type of configurations contained in the profile.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A list of methods for validating the configuration.
   */
  public open fun validators(): Any? = unwrap(this).getValidators()

  /**
   * A list of methods for validating the configuration.
   */
  public open fun validators(`value`: IResolvable) {
    unwrap(this).setValidators(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of methods for validating the configuration.
   */
  public open fun validators(__idx_ac66f0: List<Any>) {
    unwrap(this).setValidators(__idx_ac66f0)
  }

  /**
   * A list of methods for validating the configuration.
   */
  public open fun validators(vararg __idx_ac66f0: Any): Unit = validators(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appconfig.CfnConfigurationProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The application ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-applicationid)
     * @param applicationId The application ID. 
     */
    public fun applicationId(applicationId: String)

    /**
     * A description of the configuration profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-description)
     * @param description A description of the configuration profile. 
     */
    public fun description(description: String)

    /**
     * The AWS Key Management Service key identifier (key ID, key alias, or key ARN) provided when
     * the resource was created or updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-kmskeyidentifier)
     * @param kmsKeyIdentifier The AWS Key Management Service key identifier (key ID, key alias, or
     * key ARN) provided when the resource was created or updated. 
     */
    public fun kmsKeyIdentifier(kmsKeyIdentifier: String)

    /**
     * A URI to locate the configuration. You can specify the following:.
     *
     * * For the AWS AppConfig hosted configuration store and for feature flags, specify `hosted` .
     * * For an AWS Systems Manager Parameter Store parameter, specify either the parameter name in
     * the format `ssm-parameter://&lt;parameter name&gt;` or the ARN.
     * * For an AWS CodePipeline pipeline, specify the URI in the following format: `codepipeline`
     * ://<pipeline name>.
     * * For an AWS Secrets Manager secret, specify the URI in the following format:
     * `secretsmanager` ://<secret name>.
     * * For an Amazon S3 object, specify the URI in the following format:
     * `s3://&lt;bucket&gt;/&lt;objectKey&gt;` . Here is an example:
     * `s3://my-bucket/my-app/us-east-1/my-config.json`
     * * For an SSM document, specify either the document name in the format
     * `ssm-document://&lt;document name&gt;` or the Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-locationuri)
     * @param locationUri A URI to locate the configuration. You can specify the following:. 
     */
    public fun locationUri(locationUri: String)

    /**
     * A name for the configuration profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-name)
     * @param name A name for the configuration profile. 
     */
    public fun name(name: String)

    /**
     * The ARN of an IAM role with permission to access the configuration at the specified
     * `LocationUri` .
     *
     *
     * A retrieval role ARN is not required for configurations stored in the AWS AppConfig hosted
     * configuration store. It is required for all other sources that store your configuration.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-retrievalrolearn)
     * @param retrievalRoleArn The ARN of an IAM role with permission to access the configuration at
     * the specified `LocationUri` . 
     */
    public fun retrievalRoleArn(retrievalRoleArn: String)

    /**
     * Metadata to assign to the configuration profile.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-tags)
     * @param tags Metadata to assign to the configuration profile. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata to assign to the configuration profile.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-tags)
     * @param tags Metadata to assign to the configuration profile. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of configurations contained in the profile.
     *
     * AWS AppConfig supports `feature flags` and `freeform` configurations. We recommend you create
     * feature flag configurations to enable or disable new features and freeform configurations to
     * distribute configurations to an application. When calling this API, enter one of the following
     * values for `Type` :
     *
     * `AWS.AppConfig.FeatureFlags`
     *
     * `AWS.Freeform`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-type)
     * @param type The type of configurations contained in the profile. 
     */
    public fun type(type: String)

    /**
     * A list of methods for validating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-validators)
     * @param validators A list of methods for validating the configuration. 
     */
    public fun validators(validators: IResolvable)

    /**
     * A list of methods for validating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-validators)
     * @param validators A list of methods for validating the configuration. 
     */
    public fun validators(validators: List<Any>)

    /**
     * A list of methods for validating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-validators)
     * @param validators A list of methods for validating the configuration. 
     */
    public fun validators(vararg validators: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.Builder =
        software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.Builder.create(scope, id)

    /**
     * The application ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-applicationid)
     * @param applicationId The application ID. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * A description of the configuration profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-description)
     * @param description A description of the configuration profile. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The AWS Key Management Service key identifier (key ID, key alias, or key ARN) provided when
     * the resource was created or updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-kmskeyidentifier)
     * @param kmsKeyIdentifier The AWS Key Management Service key identifier (key ID, key alias, or
     * key ARN) provided when the resource was created or updated. 
     */
    override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
      cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    /**
     * A URI to locate the configuration. You can specify the following:.
     *
     * * For the AWS AppConfig hosted configuration store and for feature flags, specify `hosted` .
     * * For an AWS Systems Manager Parameter Store parameter, specify either the parameter name in
     * the format `ssm-parameter://&lt;parameter name&gt;` or the ARN.
     * * For an AWS CodePipeline pipeline, specify the URI in the following format: `codepipeline`
     * ://<pipeline name>.
     * * For an AWS Secrets Manager secret, specify the URI in the following format:
     * `secretsmanager` ://<secret name>.
     * * For an Amazon S3 object, specify the URI in the following format:
     * `s3://&lt;bucket&gt;/&lt;objectKey&gt;` . Here is an example:
     * `s3://my-bucket/my-app/us-east-1/my-config.json`
     * * For an SSM document, specify either the document name in the format
     * `ssm-document://&lt;document name&gt;` or the Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-locationuri)
     * @param locationUri A URI to locate the configuration. You can specify the following:. 
     */
    override fun locationUri(locationUri: String) {
      cdkBuilder.locationUri(locationUri)
    }

    /**
     * A name for the configuration profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-name)
     * @param name A name for the configuration profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ARN of an IAM role with permission to access the configuration at the specified
     * `LocationUri` .
     *
     *
     * A retrieval role ARN is not required for configurations stored in the AWS AppConfig hosted
     * configuration store. It is required for all other sources that store your configuration.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-retrievalrolearn)
     * @param retrievalRoleArn The ARN of an IAM role with permission to access the configuration at
     * the specified `LocationUri` . 
     */
    override fun retrievalRoleArn(retrievalRoleArn: String) {
      cdkBuilder.retrievalRoleArn(retrievalRoleArn)
    }

    /**
     * Metadata to assign to the configuration profile.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-tags)
     * @param tags Metadata to assign to the configuration profile. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata to assign to the configuration profile.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-tags)
     * @param tags Metadata to assign to the configuration profile. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of configurations contained in the profile.
     *
     * AWS AppConfig supports `feature flags` and `freeform` configurations. We recommend you create
     * feature flag configurations to enable or disable new features and freeform configurations to
     * distribute configurations to an application. When calling this API, enter one of the following
     * values for `Type` :
     *
     * `AWS.AppConfig.FeatureFlags`
     *
     * `AWS.Freeform`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-type)
     * @param type The type of configurations contained in the profile. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * A list of methods for validating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-validators)
     * @param validators A list of methods for validating the configuration. 
     */
    override fun validators(validators: IResolvable) {
      cdkBuilder.validators(validators.let(IResolvable::unwrap))
    }

    /**
     * A list of methods for validating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-validators)
     * @param validators A list of methods for validating the configuration. 
     */
    override fun validators(validators: List<Any>) {
      cdkBuilder.validators(validators)
    }

    /**
     * A list of methods for validating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-validators)
     * @param validators A list of methods for validating the configuration. 
     */
    override fun validators(vararg validators: Any): Unit = validators(validators.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnConfigurationProfile =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnConfigurationProfile):
        CfnConfigurationProfile = CfnConfigurationProfile(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationProfile):
        software.amazon.awscdk.services.appconfig.CfnConfigurationProfile = wrapped.cdkObject
  }

  public interface ValidatorsProperty {
    /**
     * Either the JSON Schema content or the Amazon Resource Name (ARN) of an Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-configurationprofile-validators.html#cfn-appconfig-configurationprofile-validators-content)
     */
    public fun content(): String? = unwrap(this).getContent()

    /**
     * AWS AppConfig supports validators of type `JSON_SCHEMA` and `LAMBDA`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-configurationprofile-validators.html#cfn-appconfig-configurationprofile-validators-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [ValidatorsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param content Either the JSON Schema content or the Amazon Resource Name (ARN) of an
       * Lambda function.
       */
      public fun content(content: String)

      /**
       * @param type AWS AppConfig supports validators of type `JSON_SCHEMA` and `LAMBDA`.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty.Builder
          =
          software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty.builder()

      /**
       * @param content Either the JSON Schema content or the Amazon Resource Name (ARN) of an
       * Lambda function.
       */
      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      /**
       * @param type AWS AppConfig supports validators of type `JSON_SCHEMA` and `LAMBDA`.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty,
    ) : CdkObject(cdkObject), ValidatorsProperty {
      /**
       * Either the JSON Schema content or the Amazon Resource Name (ARN) of an Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-configurationprofile-validators.html#cfn-appconfig-configurationprofile-validators-content)
       */
      override fun content(): String? = unwrap(this).getContent()

      /**
       * AWS AppConfig supports validators of type `JSON_SCHEMA` and `LAMBDA`.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-configurationprofile-validators.html#cfn-appconfig-configurationprofile-validators-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ValidatorsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty):
          ValidatorsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValidatorsProperty):
          software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appconfig.CfnConfigurationProfile.ValidatorsProperty
    }
  }
}
