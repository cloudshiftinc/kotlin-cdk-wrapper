@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnConfigurationProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * CfnConfigurationProfileProps cfnConfigurationProfileProps =
 * CfnConfigurationProfileProps.builder()
 * .applicationId("applicationId")
 * .locationUri("locationUri")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .kmsKeyIdentifier("kmsKeyIdentifier")
 * .retrievalRoleArn("retrievalRoleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .validators(List.of(ValidatorsProperty.builder()
 * .content("content")
 * .type("type")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html)
 */
public interface CfnConfigurationProfileProps {
  /**
   * The application ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-applicationid)
   */
  public fun applicationId(): String

  /**
   * A description of the configuration profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The AWS Key Management Service key identifier (key ID, key alias, or key ARN) provided when the
   * resource was created or updated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-kmskeyidentifier)
   */
  public fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  /**
   * A URI to locate the configuration. You can specify the following:.
   *
   * * For the AWS AppConfig hosted configuration store and for feature flags, specify `hosted` .
   * * For an AWS Systems Manager Parameter Store parameter, specify either the parameter name in
   * the format `ssm-parameter://&lt;parameter name&gt;` or the ARN.
   * * For an AWS CodePipeline pipeline, specify the URI in the following format: `codepipeline`
   * ://<pipeline name>.
   * * For an AWS Secrets Manager secret, specify the URI in the following format: `secretsmanager`
   * ://<secret name>.
   * * For an Amazon S3 object, specify the URI in the following format:
   * `s3://&lt;bucket&gt;/&lt;objectKey&gt;` . Here is an example:
   * `s3://my-bucket/my-app/us-east-1/my-config.json`
   * * For an SSM document, specify either the document name in the format
   * `ssm-document://&lt;document name&gt;` or the Amazon Resource Name (ARN).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-locationuri)
   */
  public fun locationUri(): String

  /**
   * A name for the configuration profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-name)
   */
  public fun name(): String

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
   */
  public fun retrievalRoleArn(): String? = unwrap(this).getRetrievalRoleArn()

  /**
   * Metadata to assign to the configuration profile.
   *
   * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key and
   * an optional value, both of which you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A list of methods for validating the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-validators)
   */
  public fun validators(): Any? = unwrap(this).getValidators()

  /**
   * A builder for [CfnConfigurationProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The application ID. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param description A description of the configuration profile.
     */
    public fun description(description: String)

    /**
     * @param kmsKeyIdentifier The AWS Key Management Service key identifier (key ID, key alias, or
     * key ARN) provided when the resource was created or updated.
     */
    public fun kmsKeyIdentifier(kmsKeyIdentifier: String)

    /**
     * @param locationUri A URI to locate the configuration. You can specify the following:. 
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
     */
    public fun locationUri(locationUri: String)

    /**
     * @param name A name for the configuration profile. 
     */
    public fun name(name: String)

    /**
     * @param retrievalRoleArn The ARN of an IAM role with permission to access the configuration at
     * the specified `LocationUri` .
     *
     * A retrieval role ARN is not required for configurations stored in the AWS AppConfig hosted
     * configuration store. It is required for all other sources that store your configuration.
     */
    public fun retrievalRoleArn(retrievalRoleArn: String)

    /**
     * @param tags Metadata to assign to the configuration profile.
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata to assign to the configuration profile.
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of configurations contained in the profile.
     * AWS AppConfig supports `feature flags` and `freeform` configurations. We recommend you create
     * feature flag configurations to enable or disable new features and freeform configurations to
     * distribute configurations to an application. When calling this API, enter one of the following
     * values for `Type` :
     *
     * `AWS.AppConfig.FeatureFlags`
     *
     * `AWS.Freeform`
     */
    public fun type(type: String)

    /**
     * @param validators A list of methods for validating the configuration.
     */
    public fun validators(validators: IResolvable)

    /**
     * @param validators A list of methods for validating the configuration.
     */
    public fun validators(validators: List<Any>)

    /**
     * @param validators A list of methods for validating the configuration.
     */
    public fun validators(vararg validators: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps.Builder =
        software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps.builder()

    /**
     * @param applicationId The application ID. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param description A description of the configuration profile.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param kmsKeyIdentifier The AWS Key Management Service key identifier (key ID, key alias, or
     * key ARN) provided when the resource was created or updated.
     */
    override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
      cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    /**
     * @param locationUri A URI to locate the configuration. You can specify the following:. 
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
     */
    override fun locationUri(locationUri: String) {
      cdkBuilder.locationUri(locationUri)
    }

    /**
     * @param name A name for the configuration profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param retrievalRoleArn The ARN of an IAM role with permission to access the configuration at
     * the specified `LocationUri` .
     *
     * A retrieval role ARN is not required for configurations stored in the AWS AppConfig hosted
     * configuration store. It is required for all other sources that store your configuration.
     */
    override fun retrievalRoleArn(retrievalRoleArn: String) {
      cdkBuilder.retrievalRoleArn(retrievalRoleArn)
    }

    /**
     * @param tags Metadata to assign to the configuration profile.
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Metadata to assign to the configuration profile.
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of configurations contained in the profile.
     * AWS AppConfig supports `feature flags` and `freeform` configurations. We recommend you create
     * feature flag configurations to enable or disable new features and freeform configurations to
     * distribute configurations to an application. When calling this API, enter one of the following
     * values for `Type` :
     *
     * `AWS.AppConfig.FeatureFlags`
     *
     * `AWS.Freeform`
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param validators A list of methods for validating the configuration.
     */
    override fun validators(validators: IResolvable) {
      cdkBuilder.validators(validators.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param validators A list of methods for validating the configuration.
     */
    override fun validators(validators: List<Any>) {
      cdkBuilder.validators(validators.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param validators A list of methods for validating the configuration.
     */
    override fun validators(vararg validators: Any): Unit = validators(validators.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps,
  ) : CdkObject(cdkObject), CfnConfigurationProfileProps {
    /**
     * The application ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * A description of the configuration profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The AWS Key Management Service key identifier (key ID, key alias, or key ARN) provided when
     * the resource was created or updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-kmskeyidentifier)
     */
    override fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

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
     */
    override fun locationUri(): String = unwrap(this).getLocationUri()

    /**
     * A name for the configuration profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-name)
     */
    override fun name(): String = unwrap(this).getName()

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
     */
    override fun retrievalRoleArn(): String? = unwrap(this).getRetrievalRoleArn()

    /**
     * Metadata to assign to the configuration profile.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun type(): String? = unwrap(this).getType()

    /**
     * A list of methods for validating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-validators)
     */
    override fun validators(): Any? = unwrap(this).getValidators()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps):
        CfnConfigurationProfileProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnConfigurationProfileProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationProfileProps):
        software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps
  }
}
