@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMigrationProject`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dms.*;
 * CfnMigrationProjectProps cfnMigrationProjectProps = CfnMigrationProjectProps.builder()
 * .description("description")
 * .instanceProfileArn("instanceProfileArn")
 * .instanceProfileIdentifier("instanceProfileIdentifier")
 * .instanceProfileName("instanceProfileName")
 * .migrationProjectCreationTime("migrationProjectCreationTime")
 * .migrationProjectIdentifier("migrationProjectIdentifier")
 * .migrationProjectName("migrationProjectName")
 * .schemaConversionApplicationAttributes(SchemaConversionApplicationAttributesProperty.builder()
 * .s3BucketPath("s3BucketPath")
 * .s3BucketRoleArn("s3BucketRoleArn")
 * .build())
 * .sourceDataProviderDescriptors(List.of(DataProviderDescriptorProperty.builder()
 * .dataProviderArn("dataProviderArn")
 * .dataProviderIdentifier("dataProviderIdentifier")
 * .dataProviderName("dataProviderName")
 * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
 * .secretsManagerSecretId("secretsManagerSecretId")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetDataProviderDescriptors(List.of(DataProviderDescriptorProperty.builder()
 * .dataProviderArn("dataProviderArn")
 * .dataProviderIdentifier("dataProviderIdentifier")
 * .dataProviderName("dataProviderName")
 * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
 * .secretsManagerSecretId("secretsManagerSecretId")
 * .build()))
 * .transformationRules("transformationRules")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html)
 */
public interface CfnMigrationProjectProps {
  /**
   * A user-friendly description of the migration project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the instance profile for your migration project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-instanceprofilearn)
   */
  public fun instanceProfileArn(): String? = unwrap(this).getInstanceProfileArn()

  /**
   * The identifier of the instance profile for your migration project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-instanceprofileidentifier)
   */
  public fun instanceProfileIdentifier(): String? = unwrap(this).getInstanceProfileIdentifier()

  /**
   * The name of the associated instance profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-instanceprofilename)
   */
  public fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

  /**
   * (deprecated) The property describes a creating time of the migration project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-migrationprojectcreationtime)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun migrationProjectCreationTime(): String? =
      unwrap(this).getMigrationProjectCreationTime()

  /**
   * The identifier of the migration project.
   *
   * Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens.
   * They can't end with a hyphen, or contain two consecutive hyphens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-migrationprojectidentifier)
   */
  public fun migrationProjectIdentifier(): String? = unwrap(this).getMigrationProjectIdentifier()

  /**
   * The name of the migration project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-migrationprojectname)
   */
  public fun migrationProjectName(): String? = unwrap(this).getMigrationProjectName()

  /**
   * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon S3
   * role ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-schemaconversionapplicationattributes)
   */
  public fun schemaConversionApplicationAttributes(): Any? =
      unwrap(this).getSchemaConversionApplicationAttributes()

  /**
   * Information about the source data provider, including the name or ARN, and AWS Secrets Manager
   * parameters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-sourcedataproviderdescriptors)
   */
  public fun sourceDataProviderDescriptors(): Any? = unwrap(this).getSourceDataProviderDescriptors()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Information about the target data provider, including the name or ARN, and AWS Secrets Manager
   * parameters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-targetdataproviderdescriptors)
   */
  public fun targetDataProviderDescriptors(): Any? = unwrap(this).getTargetDataProviderDescriptors()

  /**
   * The settings in JSON format for migration rules.
   *
   * Migration rules make it possible for you to change the object names according to the rules that
   * you specify. For example, you can change an object name to lowercase or uppercase, add or remove a
   * prefix or suffix, or rename objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-transformationrules)
   */
  public fun transformationRules(): String? = unwrap(this).getTransformationRules()

  /**
   * A builder for [CfnMigrationProjectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A user-friendly description of the migration project.
     */
    public fun description(description: String)

    /**
     * @param instanceProfileArn The Amazon Resource Name (ARN) of the instance profile for your
     * migration project.
     */
    public fun instanceProfileArn(instanceProfileArn: String)

    /**
     * @param instanceProfileIdentifier The identifier of the instance profile for your migration
     * project.
     */
    public fun instanceProfileIdentifier(instanceProfileIdentifier: String)

    /**
     * @param instanceProfileName The name of the associated instance profile.
     */
    public fun instanceProfileName(instanceProfileName: String)

    /**
     * @param migrationProjectCreationTime The property describes a creating time of the migration
     * project.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun migrationProjectCreationTime(migrationProjectCreationTime: String)

    /**
     * @param migrationProjectIdentifier The identifier of the migration project.
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     */
    public fun migrationProjectIdentifier(migrationProjectIdentifier: String)

    /**
     * @param migrationProjectName The name of the migration project.
     */
    public fun migrationProjectName(migrationProjectName: String)

    /**
     * @param schemaConversionApplicationAttributes The schema conversion application attributes,
     * including the Amazon S3 bucket name and Amazon S3 role ARN.
     */
    public
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: IResolvable)

    /**
     * @param schemaConversionApplicationAttributes The schema conversion application attributes,
     * including the Amazon S3 bucket name and Amazon S3 role ARN.
     */
    public
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: CfnMigrationProject.SchemaConversionApplicationAttributesProperty)

    /**
     * @param schemaConversionApplicationAttributes The schema conversion application attributes,
     * including the Amazon S3 bucket name and Amazon S3 role ARN.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("230a9858a868eb2140c80c8d42270fbf0ea0337e5d8eb0345372a5166edc39fb")
    public
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: CfnMigrationProject.SchemaConversionApplicationAttributesProperty.Builder.() -> Unit)

    /**
     * @param sourceDataProviderDescriptors Information about the source data provider, including
     * the name or ARN, and AWS Secrets Manager parameters.
     */
    public fun sourceDataProviderDescriptors(sourceDataProviderDescriptors: IResolvable)

    /**
     * @param sourceDataProviderDescriptors Information about the source data provider, including
     * the name or ARN, and AWS Secrets Manager parameters.
     */
    public fun sourceDataProviderDescriptors(sourceDataProviderDescriptors: List<Any>)

    /**
     * @param sourceDataProviderDescriptors Information about the source data provider, including
     * the name or ARN, and AWS Secrets Manager parameters.
     */
    public fun sourceDataProviderDescriptors(vararg sourceDataProviderDescriptors: Any)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetDataProviderDescriptors Information about the target data provider, including
     * the name or ARN, and AWS Secrets Manager parameters.
     */
    public fun targetDataProviderDescriptors(targetDataProviderDescriptors: IResolvable)

    /**
     * @param targetDataProviderDescriptors Information about the target data provider, including
     * the name or ARN, and AWS Secrets Manager parameters.
     */
    public fun targetDataProviderDescriptors(targetDataProviderDescriptors: List<Any>)

    /**
     * @param targetDataProviderDescriptors Information about the target data provider, including
     * the name or ARN, and AWS Secrets Manager parameters.
     */
    public fun targetDataProviderDescriptors(vararg targetDataProviderDescriptors: Any)

    /**
     * @param transformationRules The settings in JSON format for migration rules.
     * Migration rules make it possible for you to change the object names according to the rules
     * that you specify. For example, you can change an object name to lowercase or uppercase, add or
     * remove a prefix or suffix, or rename objects.
     */
    public fun transformationRules(transformationRules: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnMigrationProjectProps.Builder =
        software.amazon.awscdk.services.dms.CfnMigrationProjectProps.builder()

    /**
     * @param description A user-friendly description of the migration project.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param instanceProfileArn The Amazon Resource Name (ARN) of the instance profile for your
     * migration project.
     */
    override fun instanceProfileArn(instanceProfileArn: String) {
      cdkBuilder.instanceProfileArn(instanceProfileArn)
    }

    /**
     * @param instanceProfileIdentifier The identifier of the instance profile for your migration
     * project.
     */
    override fun instanceProfileIdentifier(instanceProfileIdentifier: String) {
      cdkBuilder.instanceProfileIdentifier(instanceProfileIdentifier)
    }

    /**
     * @param instanceProfileName The name of the associated instance profile.
     */
    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    /**
     * @param migrationProjectCreationTime The property describes a creating time of the migration
     * project.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun migrationProjectCreationTime(migrationProjectCreationTime: String) {
      cdkBuilder.migrationProjectCreationTime(migrationProjectCreationTime)
    }

    /**
     * @param migrationProjectIdentifier The identifier of the migration project.
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     */
    override fun migrationProjectIdentifier(migrationProjectIdentifier: String) {
      cdkBuilder.migrationProjectIdentifier(migrationProjectIdentifier)
    }

    /**
     * @param migrationProjectName The name of the migration project.
     */
    override fun migrationProjectName(migrationProjectName: String) {
      cdkBuilder.migrationProjectName(migrationProjectName)
    }

    /**
     * @param schemaConversionApplicationAttributes The schema conversion application attributes,
     * including the Amazon S3 bucket name and Amazon S3 role ARN.
     */
    override
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: IResolvable) {
      cdkBuilder.schemaConversionApplicationAttributes(schemaConversionApplicationAttributes.let(IResolvable::unwrap))
    }

    /**
     * @param schemaConversionApplicationAttributes The schema conversion application attributes,
     * including the Amazon S3 bucket name and Amazon S3 role ARN.
     */
    override
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: CfnMigrationProject.SchemaConversionApplicationAttributesProperty) {
      cdkBuilder.schemaConversionApplicationAttributes(schemaConversionApplicationAttributes.let(CfnMigrationProject.SchemaConversionApplicationAttributesProperty::unwrap))
    }

    /**
     * @param schemaConversionApplicationAttributes The schema conversion application attributes,
     * including the Amazon S3 bucket name and Amazon S3 role ARN.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("230a9858a868eb2140c80c8d42270fbf0ea0337e5d8eb0345372a5166edc39fb")
    override
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: CfnMigrationProject.SchemaConversionApplicationAttributesProperty.Builder.() -> Unit):
        Unit =
        schemaConversionApplicationAttributes(CfnMigrationProject.SchemaConversionApplicationAttributesProperty(schemaConversionApplicationAttributes))

    /**
     * @param sourceDataProviderDescriptors Information about the source data provider, including
     * the name or ARN, and AWS Secrets Manager parameters.
     */
    override fun sourceDataProviderDescriptors(sourceDataProviderDescriptors: IResolvable) {
      cdkBuilder.sourceDataProviderDescriptors(sourceDataProviderDescriptors.let(IResolvable::unwrap))
    }

    /**
     * @param sourceDataProviderDescriptors Information about the source data provider, including
     * the name or ARN, and AWS Secrets Manager parameters.
     */
    override fun sourceDataProviderDescriptors(sourceDataProviderDescriptors: List<Any>) {
      cdkBuilder.sourceDataProviderDescriptors(sourceDataProviderDescriptors)
    }

    /**
     * @param sourceDataProviderDescriptors Information about the source data provider, including
     * the name or ARN, and AWS Secrets Manager parameters.
     */
    override fun sourceDataProviderDescriptors(vararg sourceDataProviderDescriptors: Any): Unit =
        sourceDataProviderDescriptors(sourceDataProviderDescriptors.toList())

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetDataProviderDescriptors Information about the target data provider, including
     * the name or ARN, and AWS Secrets Manager parameters.
     */
    override fun targetDataProviderDescriptors(targetDataProviderDescriptors: IResolvable) {
      cdkBuilder.targetDataProviderDescriptors(targetDataProviderDescriptors.let(IResolvable::unwrap))
    }

    /**
     * @param targetDataProviderDescriptors Information about the target data provider, including
     * the name or ARN, and AWS Secrets Manager parameters.
     */
    override fun targetDataProviderDescriptors(targetDataProviderDescriptors: List<Any>) {
      cdkBuilder.targetDataProviderDescriptors(targetDataProviderDescriptors)
    }

    /**
     * @param targetDataProviderDescriptors Information about the target data provider, including
     * the name or ARN, and AWS Secrets Manager parameters.
     */
    override fun targetDataProviderDescriptors(vararg targetDataProviderDescriptors: Any): Unit =
        targetDataProviderDescriptors(targetDataProviderDescriptors.toList())

    /**
     * @param transformationRules The settings in JSON format for migration rules.
     * Migration rules make it possible for you to change the object names according to the rules
     * that you specify. For example, you can change an object name to lowercase or uppercase, add or
     * remove a prefix or suffix, or rename objects.
     */
    override fun transformationRules(transformationRules: String) {
      cdkBuilder.transformationRules(transformationRules)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnMigrationProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dms.CfnMigrationProjectProps,
  ) : CdkObject(cdkObject), CfnMigrationProjectProps {
    /**
     * A user-friendly description of the migration project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of the instance profile for your migration project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-instanceprofilearn)
     */
    override fun instanceProfileArn(): String? = unwrap(this).getInstanceProfileArn()

    /**
     * The identifier of the instance profile for your migration project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-instanceprofileidentifier)
     */
    override fun instanceProfileIdentifier(): String? = unwrap(this).getInstanceProfileIdentifier()

    /**
     * The name of the associated instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-instanceprofilename)
     */
    override fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

    /**
     * (deprecated) The property describes a creating time of the migration project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-migrationprojectcreationtime)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun migrationProjectCreationTime(): String? =
        unwrap(this).getMigrationProjectCreationTime()

    /**
     * The identifier of the migration project.
     *
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-migrationprojectidentifier)
     */
    override fun migrationProjectIdentifier(): String? =
        unwrap(this).getMigrationProjectIdentifier()

    /**
     * The name of the migration project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-migrationprojectname)
     */
    override fun migrationProjectName(): String? = unwrap(this).getMigrationProjectName()

    /**
     * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon
     * S3 role ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-schemaconversionapplicationattributes)
     */
    override fun schemaConversionApplicationAttributes(): Any? =
        unwrap(this).getSchemaConversionApplicationAttributes()

    /**
     * Information about the source data provider, including the name or ARN, and AWS Secrets
     * Manager parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-sourcedataproviderdescriptors)
     */
    override fun sourceDataProviderDescriptors(): Any? =
        unwrap(this).getSourceDataProviderDescriptors()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Information about the target data provider, including the name or ARN, and AWS Secrets
     * Manager parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-targetdataproviderdescriptors)
     */
    override fun targetDataProviderDescriptors(): Any? =
        unwrap(this).getTargetDataProviderDescriptors()

    /**
     * The settings in JSON format for migration rules.
     *
     * Migration rules make it possible for you to change the object names according to the rules
     * that you specify. For example, you can change an object name to lowercase or uppercase, add or
     * remove a prefix or suffix, or rename objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-transformationrules)
     */
    override fun transformationRules(): String? = unwrap(this).getTransformationRules()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMigrationProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnMigrationProjectProps):
        CfnMigrationProjectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMigrationProjectProps):
        software.amazon.awscdk.services.dms.CfnMigrationProjectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dms.CfnMigrationProjectProps
  }
}
