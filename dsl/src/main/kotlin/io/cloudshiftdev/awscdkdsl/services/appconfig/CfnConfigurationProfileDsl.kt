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

package io.cloudshiftdev.awscdkdsl.services.appconfig

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfile
import software.constructs.Construct

/**
 * The `AWS::AppConfig::ConfigurationProfile` resource creates a configuration profile that enables
 * AWS AppConfig to access the configuration source.
 *
 * Valid configuration sources include AWS Systems Manager (SSM) documents, SSM Parameter Store
 * parameters, and Amazon S3 . A configuration profile includes the following information.
 * * The Uri location of the configuration data.
 * * The AWS Identity and Access Management ( IAM ) role that provides access to the configuration
 *   data.
 * * A validator for the configuration data. Available validators include either a JSON Schema or
 *   the Amazon Resource Name (ARN) of an AWS Lambda function.
 *
 * AWS AppConfig requires that you create resources and deploy a configuration in the following
 * order:
 * * Create an application
 * * Create an environment
 * * Create a configuration profile
 * * Create a deployment strategy
 * * Deploy the configuration
 *
 * For more information, see
 * [AWS AppConfig](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in
 * the *AWS AppConfig User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * CfnConfigurationProfile cfnConfigurationProfile = CfnConfigurationProfile.Builder.create(this,
 * "MyCfnConfigurationProfile")
 * .applicationId("applicationId")
 * .locationUri("locationUri")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .retrievalRoleArn("retrievalRoleArn")
 * .tags(List.of(TagsProperty.builder()
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
@CdkDslMarker
public class CfnConfigurationProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConfigurationProfile.Builder =
        CfnConfigurationProfile.Builder.create(scope, id)

    private val _tags: MutableList<CfnConfigurationProfile.TagsProperty> = mutableListOf()

    private val _validators: MutableList<Any> = mutableListOf()

    /**
     * The application ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-applicationid)
     *
     * @param applicationId The application ID.
     */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * A description of the configuration profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-description)
     *
     * @param description A description of the configuration profile.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * A URI to locate the configuration. You can specify the following:.
     * * For the AWS AppConfig hosted configuration store and for feature flags, specify `hosted` .
     * * For an AWS Systems Manager Parameter Store parameter, specify either the parameter name in
     *   the format `ssm-parameter://&lt;parameter name&gt;` or the ARN.
     * * For an AWS CodePipeline pipeline, specify the URI in the following format: `codepipeline`
     *   ://<pipeline name>.
     * * For an AWS Secrets Manager secret, specify the URI in the following format:
     *   `secretsmanager` ://<secret name>.
     * * For an Amazon S3 object, specify the URI in the following format:
     *   `s3://&lt;bucket&gt;/&lt;objectKey&gt;` . Here is an example:
     *   `s3://my-bucket/my-app/us-east-1/my-config.json`
     * * For an SSM document, specify either the document name in the format
     *   `ssm-document://&lt;document name&gt;` or the Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-locationuri)
     *
     * @param locationUri A URI to locate the configuration. You can specify the following:.
     */
    public fun locationUri(locationUri: String) {
        cdkBuilder.locationUri(locationUri)
    }

    /**
     * A name for the configuration profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-name)
     *
     * @param name A name for the configuration profile.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The ARN of an IAM role with permission to access the configuration at the specified
     * `LocationUri` .
     *
     * A retrieval role ARN is not required for configurations stored in the AWS AppConfig hosted
     * configuration store. It is required for all other sources that store your configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-retrievalrolearn)
     *
     * @param retrievalRoleArn The ARN of an IAM role with permission to access the configuration at
     *   the specified `LocationUri` .
     */
    public fun retrievalRoleArn(retrievalRoleArn: String) {
        cdkBuilder.retrievalRoleArn(retrievalRoleArn)
    }

    /**
     * Metadata to assign to the configuration profile.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-tags)
     *
     * @param tags Metadata to assign to the configuration profile.
     */
    public fun tags(tags: CfnConfigurationProfileTagsPropertyDsl.() -> Unit) {
        _tags.add(CfnConfigurationProfileTagsPropertyDsl().apply(tags).build())
    }

    /**
     * Metadata to assign to the configuration profile.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-tags)
     *
     * @param tags Metadata to assign to the configuration profile.
     */
    public fun tags(tags: Collection<CfnConfigurationProfile.TagsProperty>) {
        _tags.addAll(tags)
    }

    /**
     * The type of configurations contained in the profile.
     *
     * AWS AppConfig supports `feature flags` and `freeform` configurations. We recommend you create
     * feature flag configurations to enable or disable new features and freeform configurations to
     * distribute configurations to an application. When calling this API, enter one of the
     * following values for `Type` :
     *
     * `AWS.AppConfig.FeatureFlags`
     *
     * `AWS.Freeform`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-type)
     *
     * @param type The type of configurations contained in the profile.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * A list of methods for validating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-validators)
     *
     * @param validators A list of methods for validating the configuration.
     */
    public fun validators(vararg validators: Any) {
        _validators.addAll(listOf(*validators))
    }

    /**
     * A list of methods for validating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-validators)
     *
     * @param validators A list of methods for validating the configuration.
     */
    public fun validators(validators: Collection<Any>) {
        _validators.addAll(validators)
    }

    /**
     * A list of methods for validating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-configurationprofile.html#cfn-appconfig-configurationprofile-validators)
     *
     * @param validators A list of methods for validating the configuration.
     */
    public fun validators(validators: IResolvable) {
        cdkBuilder.validators(validators)
    }

    public fun build(): CfnConfigurationProfile {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_validators.isNotEmpty()) cdkBuilder.validators(_validators)
        return cdkBuilder.build()
    }
}
