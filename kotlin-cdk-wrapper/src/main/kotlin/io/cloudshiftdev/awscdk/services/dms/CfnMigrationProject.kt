@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Provides information that defines a migration project.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dms.*;
 * CfnMigrationProject cfnMigrationProject = CfnMigrationProject.Builder.create(this,
 * "MyCfnMigrationProject")
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
public open class CfnMigrationProject internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dms.CfnMigrationProject,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The ARN string that uniquely identifies the migration project.
   */
  public open fun attrMigrationProjectArn(): String = unwrap(this).getAttrMigrationProjectArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A user-friendly description of the migration project.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A user-friendly description of the migration project.
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
   * The Amazon Resource Name (ARN) of the instance profile for your migration project.
   */
  public open fun instanceProfileArn(): String? = unwrap(this).getInstanceProfileArn()

  /**
   * The Amazon Resource Name (ARN) of the instance profile for your migration project.
   */
  public open fun instanceProfileArn(`value`: String) {
    unwrap(this).setInstanceProfileArn(`value`)
  }

  /**
   * The identifier of the instance profile for your migration project.
   */
  public open fun instanceProfileIdentifier(): String? = unwrap(this).getInstanceProfileIdentifier()

  /**
   * The identifier of the instance profile for your migration project.
   */
  public open fun instanceProfileIdentifier(`value`: String) {
    unwrap(this).setInstanceProfileIdentifier(`value`)
  }

  /**
   * The name of the associated instance profile.
   */
  public open fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

  /**
   * The name of the associated instance profile.
   */
  public open fun instanceProfileName(`value`: String) {
    unwrap(this).setInstanceProfileName(`value`)
  }

  /**
   * (deprecated) The property describes a creating time of the migration project.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun migrationProjectCreationTime(): String? =
      unwrap(this).getMigrationProjectCreationTime()

  /**
   * (deprecated) The property describes a creating time of the migration project.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun migrationProjectCreationTime(`value`: String) {
    unwrap(this).setMigrationProjectCreationTime(`value`)
  }

  /**
   * The identifier of the migration project.
   */
  public open fun migrationProjectIdentifier(): String? =
      unwrap(this).getMigrationProjectIdentifier()

  /**
   * The identifier of the migration project.
   */
  public open fun migrationProjectIdentifier(`value`: String) {
    unwrap(this).setMigrationProjectIdentifier(`value`)
  }

  /**
   * The name of the migration project.
   */
  public open fun migrationProjectName(): String? = unwrap(this).getMigrationProjectName()

  /**
   * The name of the migration project.
   */
  public open fun migrationProjectName(`value`: String) {
    unwrap(this).setMigrationProjectName(`value`)
  }

  /**
   * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon S3
   * role ARN.
   */
  public open fun schemaConversionApplicationAttributes(): Any? =
      unwrap(this).getSchemaConversionApplicationAttributes()

  /**
   * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon S3
   * role ARN.
   */
  public open fun schemaConversionApplicationAttributes(`value`: IResolvable) {
    unwrap(this).setSchemaConversionApplicationAttributes(`value`.let(IResolvable::unwrap))
  }

  /**
   * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon S3
   * role ARN.
   */
  public open
      fun schemaConversionApplicationAttributes(`value`: SchemaConversionApplicationAttributesProperty) {
    unwrap(this).setSchemaConversionApplicationAttributes(`value`.let(SchemaConversionApplicationAttributesProperty::unwrap))
  }

  /**
   * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon S3
   * role ARN.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c7dc53d07f0b30c5f1f7fb91859546ac2e3b8e7d3b0687bb1f1813d1229780fb")
  public open
      fun schemaConversionApplicationAttributes(`value`: SchemaConversionApplicationAttributesProperty.Builder.() -> Unit):
      Unit =
      schemaConversionApplicationAttributes(SchemaConversionApplicationAttributesProperty(`value`))

  /**
   * Information about the source data provider, including the name or ARN, and AWS Secrets Manager
   * parameters.
   */
  public open fun sourceDataProviderDescriptors(): Any? =
      unwrap(this).getSourceDataProviderDescriptors()

  /**
   * Information about the source data provider, including the name or ARN, and AWS Secrets Manager
   * parameters.
   */
  public open fun sourceDataProviderDescriptors(`value`: IResolvable) {
    unwrap(this).setSourceDataProviderDescriptors(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the source data provider, including the name or ARN, and AWS Secrets Manager
   * parameters.
   */
  public open fun sourceDataProviderDescriptors(`value`: List<Any>) {
    unwrap(this).setSourceDataProviderDescriptors(`value`)
  }

  /**
   * Information about the source data provider, including the name or ARN, and AWS Secrets Manager
   * parameters.
   */
  public open fun sourceDataProviderDescriptors(vararg `value`: Any): Unit =
      sourceDataProviderDescriptors(`value`.toList())

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * Information about the target data provider, including the name or ARN, and AWS Secrets Manager
   * parameters.
   */
  public open fun targetDataProviderDescriptors(): Any? =
      unwrap(this).getTargetDataProviderDescriptors()

  /**
   * Information about the target data provider, including the name or ARN, and AWS Secrets Manager
   * parameters.
   */
  public open fun targetDataProviderDescriptors(`value`: IResolvable) {
    unwrap(this).setTargetDataProviderDescriptors(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the target data provider, including the name or ARN, and AWS Secrets Manager
   * parameters.
   */
  public open fun targetDataProviderDescriptors(`value`: List<Any>) {
    unwrap(this).setTargetDataProviderDescriptors(`value`)
  }

  /**
   * Information about the target data provider, including the name or ARN, and AWS Secrets Manager
   * parameters.
   */
  public open fun targetDataProviderDescriptors(vararg `value`: Any): Unit =
      targetDataProviderDescriptors(`value`.toList())

  /**
   * The settings in JSON format for migration rules.
   */
  public open fun transformationRules(): String? = unwrap(this).getTransformationRules()

  /**
   * The settings in JSON format for migration rules.
   */
  public open fun transformationRules(`value`: String) {
    unwrap(this).setTransformationRules(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dms.CfnMigrationProject].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A user-friendly description of the migration project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-description)
     * @param description A user-friendly description of the migration project. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN) of the instance profile for your migration project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-instanceprofilearn)
     * @param instanceProfileArn The Amazon Resource Name (ARN) of the instance profile for your
     * migration project. 
     */
    public fun instanceProfileArn(instanceProfileArn: String)

    /**
     * The identifier of the instance profile for your migration project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-instanceprofileidentifier)
     * @param instanceProfileIdentifier The identifier of the instance profile for your migration
     * project. 
     */
    public fun instanceProfileIdentifier(instanceProfileIdentifier: String)

    /**
     * The name of the associated instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-instanceprofilename)
     * @param instanceProfileName The name of the associated instance profile. 
     */
    public fun instanceProfileName(instanceProfileName: String)

    /**
     * (deprecated) The property describes a creating time of the migration project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-migrationprojectcreationtime)
     * @deprecated this property has been deprecated
     * @param migrationProjectCreationTime The property describes a creating time of the migration
     * project. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun migrationProjectCreationTime(migrationProjectCreationTime: String)

    /**
     * The identifier of the migration project.
     *
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-migrationprojectidentifier)
     * @param migrationProjectIdentifier The identifier of the migration project. 
     */
    public fun migrationProjectIdentifier(migrationProjectIdentifier: String)

    /**
     * The name of the migration project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-migrationprojectname)
     * @param migrationProjectName The name of the migration project. 
     */
    public fun migrationProjectName(migrationProjectName: String)

    /**
     * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon
     * S3 role ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-schemaconversionapplicationattributes)
     * @param schemaConversionApplicationAttributes The schema conversion application attributes,
     * including the Amazon S3 bucket name and Amazon S3 role ARN. 
     */
    public
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: IResolvable)

    /**
     * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon
     * S3 role ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-schemaconversionapplicationattributes)
     * @param schemaConversionApplicationAttributes The schema conversion application attributes,
     * including the Amazon S3 bucket name and Amazon S3 role ARN. 
     */
    public
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: SchemaConversionApplicationAttributesProperty)

    /**
     * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon
     * S3 role ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-schemaconversionapplicationattributes)
     * @param schemaConversionApplicationAttributes The schema conversion application attributes,
     * including the Amazon S3 bucket name and Amazon S3 role ARN. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84a92f567083155da430c6daef80fa05ef799b413046f64455802538986c4714")
    public
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: SchemaConversionApplicationAttributesProperty.Builder.() -> Unit)

    /**
     * Information about the source data provider, including the name or ARN, and AWS Secrets
     * Manager parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-sourcedataproviderdescriptors)
     * @param sourceDataProviderDescriptors Information about the source data provider, including
     * the name or ARN, and AWS Secrets Manager parameters. 
     */
    public fun sourceDataProviderDescriptors(sourceDataProviderDescriptors: IResolvable)

    /**
     * Information about the source data provider, including the name or ARN, and AWS Secrets
     * Manager parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-sourcedataproviderdescriptors)
     * @param sourceDataProviderDescriptors Information about the source data provider, including
     * the name or ARN, and AWS Secrets Manager parameters. 
     */
    public fun sourceDataProviderDescriptors(sourceDataProviderDescriptors: List<Any>)

    /**
     * Information about the source data provider, including the name or ARN, and AWS Secrets
     * Manager parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-sourcedataproviderdescriptors)
     * @param sourceDataProviderDescriptors Information about the source data provider, including
     * the name or ARN, and AWS Secrets Manager parameters. 
     */
    public fun sourceDataProviderDescriptors(vararg sourceDataProviderDescriptors: Any)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Information about the target data provider, including the name or ARN, and AWS Secrets
     * Manager parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-targetdataproviderdescriptors)
     * @param targetDataProviderDescriptors Information about the target data provider, including
     * the name or ARN, and AWS Secrets Manager parameters. 
     */
    public fun targetDataProviderDescriptors(targetDataProviderDescriptors: IResolvable)

    /**
     * Information about the target data provider, including the name or ARN, and AWS Secrets
     * Manager parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-targetdataproviderdescriptors)
     * @param targetDataProviderDescriptors Information about the target data provider, including
     * the name or ARN, and AWS Secrets Manager parameters. 
     */
    public fun targetDataProviderDescriptors(targetDataProviderDescriptors: List<Any>)

    /**
     * Information about the target data provider, including the name or ARN, and AWS Secrets
     * Manager parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-targetdataproviderdescriptors)
     * @param targetDataProviderDescriptors Information about the target data provider, including
     * the name or ARN, and AWS Secrets Manager parameters. 
     */
    public fun targetDataProviderDescriptors(vararg targetDataProviderDescriptors: Any)

    /**
     * The settings in JSON format for migration rules.
     *
     * Migration rules make it possible for you to change the object names according to the rules
     * that you specify. For example, you can change an object name to lowercase or uppercase, add or
     * remove a prefix or suffix, or rename objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-transformationrules)
     * @param transformationRules The settings in JSON format for migration rules. 
     */
    public fun transformationRules(transformationRules: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnMigrationProject.Builder =
        software.amazon.awscdk.services.dms.CfnMigrationProject.Builder.create(scope, id)

    /**
     * A user-friendly description of the migration project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-description)
     * @param description A user-friendly description of the migration project. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the instance profile for your migration project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-instanceprofilearn)
     * @param instanceProfileArn The Amazon Resource Name (ARN) of the instance profile for your
     * migration project. 
     */
    override fun instanceProfileArn(instanceProfileArn: String) {
      cdkBuilder.instanceProfileArn(instanceProfileArn)
    }

    /**
     * The identifier of the instance profile for your migration project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-instanceprofileidentifier)
     * @param instanceProfileIdentifier The identifier of the instance profile for your migration
     * project. 
     */
    override fun instanceProfileIdentifier(instanceProfileIdentifier: String) {
      cdkBuilder.instanceProfileIdentifier(instanceProfileIdentifier)
    }

    /**
     * The name of the associated instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-instanceprofilename)
     * @param instanceProfileName The name of the associated instance profile. 
     */
    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    /**
     * (deprecated) The property describes a creating time of the migration project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-migrationprojectcreationtime)
     * @deprecated this property has been deprecated
     * @param migrationProjectCreationTime The property describes a creating time of the migration
     * project. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun migrationProjectCreationTime(migrationProjectCreationTime: String) {
      cdkBuilder.migrationProjectCreationTime(migrationProjectCreationTime)
    }

    /**
     * The identifier of the migration project.
     *
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-migrationprojectidentifier)
     * @param migrationProjectIdentifier The identifier of the migration project. 
     */
    override fun migrationProjectIdentifier(migrationProjectIdentifier: String) {
      cdkBuilder.migrationProjectIdentifier(migrationProjectIdentifier)
    }

    /**
     * The name of the migration project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-migrationprojectname)
     * @param migrationProjectName The name of the migration project. 
     */
    override fun migrationProjectName(migrationProjectName: String) {
      cdkBuilder.migrationProjectName(migrationProjectName)
    }

    /**
     * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon
     * S3 role ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-schemaconversionapplicationattributes)
     * @param schemaConversionApplicationAttributes The schema conversion application attributes,
     * including the Amazon S3 bucket name and Amazon S3 role ARN. 
     */
    override
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: IResolvable) {
      cdkBuilder.schemaConversionApplicationAttributes(schemaConversionApplicationAttributes.let(IResolvable::unwrap))
    }

    /**
     * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon
     * S3 role ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-schemaconversionapplicationattributes)
     * @param schemaConversionApplicationAttributes The schema conversion application attributes,
     * including the Amazon S3 bucket name and Amazon S3 role ARN. 
     */
    override
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: SchemaConversionApplicationAttributesProperty) {
      cdkBuilder.schemaConversionApplicationAttributes(schemaConversionApplicationAttributes.let(SchemaConversionApplicationAttributesProperty::unwrap))
    }

    /**
     * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon
     * S3 role ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-schemaconversionapplicationattributes)
     * @param schemaConversionApplicationAttributes The schema conversion application attributes,
     * including the Amazon S3 bucket name and Amazon S3 role ARN. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84a92f567083155da430c6daef80fa05ef799b413046f64455802538986c4714")
    override
        fun schemaConversionApplicationAttributes(schemaConversionApplicationAttributes: SchemaConversionApplicationAttributesProperty.Builder.() -> Unit):
        Unit =
        schemaConversionApplicationAttributes(SchemaConversionApplicationAttributesProperty(schemaConversionApplicationAttributes))

    /**
     * Information about the source data provider, including the name or ARN, and AWS Secrets
     * Manager parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-sourcedataproviderdescriptors)
     * @param sourceDataProviderDescriptors Information about the source data provider, including
     * the name or ARN, and AWS Secrets Manager parameters. 
     */
    override fun sourceDataProviderDescriptors(sourceDataProviderDescriptors: IResolvable) {
      cdkBuilder.sourceDataProviderDescriptors(sourceDataProviderDescriptors.let(IResolvable::unwrap))
    }

    /**
     * Information about the source data provider, including the name or ARN, and AWS Secrets
     * Manager parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-sourcedataproviderdescriptors)
     * @param sourceDataProviderDescriptors Information about the source data provider, including
     * the name or ARN, and AWS Secrets Manager parameters. 
     */
    override fun sourceDataProviderDescriptors(sourceDataProviderDescriptors: List<Any>) {
      cdkBuilder.sourceDataProviderDescriptors(sourceDataProviderDescriptors)
    }

    /**
     * Information about the source data provider, including the name or ARN, and AWS Secrets
     * Manager parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-sourcedataproviderdescriptors)
     * @param sourceDataProviderDescriptors Information about the source data provider, including
     * the name or ARN, and AWS Secrets Manager parameters. 
     */
    override fun sourceDataProviderDescriptors(vararg sourceDataProviderDescriptors: Any): Unit =
        sourceDataProviderDescriptors(sourceDataProviderDescriptors.toList())

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Information about the target data provider, including the name or ARN, and AWS Secrets
     * Manager parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-targetdataproviderdescriptors)
     * @param targetDataProviderDescriptors Information about the target data provider, including
     * the name or ARN, and AWS Secrets Manager parameters. 
     */
    override fun targetDataProviderDescriptors(targetDataProviderDescriptors: IResolvable) {
      cdkBuilder.targetDataProviderDescriptors(targetDataProviderDescriptors.let(IResolvable::unwrap))
    }

    /**
     * Information about the target data provider, including the name or ARN, and AWS Secrets
     * Manager parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-targetdataproviderdescriptors)
     * @param targetDataProviderDescriptors Information about the target data provider, including
     * the name or ARN, and AWS Secrets Manager parameters. 
     */
    override fun targetDataProviderDescriptors(targetDataProviderDescriptors: List<Any>) {
      cdkBuilder.targetDataProviderDescriptors(targetDataProviderDescriptors)
    }

    /**
     * Information about the target data provider, including the name or ARN, and AWS Secrets
     * Manager parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-targetdataproviderdescriptors)
     * @param targetDataProviderDescriptors Information about the target data provider, including
     * the name or ARN, and AWS Secrets Manager parameters. 
     */
    override fun targetDataProviderDescriptors(vararg targetDataProviderDescriptors: Any): Unit =
        targetDataProviderDescriptors(targetDataProviderDescriptors.toList())

    /**
     * The settings in JSON format for migration rules.
     *
     * Migration rules make it possible for you to change the object names according to the rules
     * that you specify. For example, you can change an object name to lowercase or uppercase, add or
     * remove a prefix or suffix, or rename objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-migrationproject.html#cfn-dms-migrationproject-transformationrules)
     * @param transformationRules The settings in JSON format for migration rules. 
     */
    override fun transformationRules(transformationRules: String) {
      cdkBuilder.transformationRules(transformationRules)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnMigrationProject = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dms.CfnMigrationProject.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMigrationProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMigrationProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnMigrationProject):
        CfnMigrationProject = CfnMigrationProject(cdkObject)

    internal fun unwrap(wrapped: CfnMigrationProject):
        software.amazon.awscdk.services.dms.CfnMigrationProject = wrapped.cdkObject
  }

  /**
   * Information about a data provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dms.*;
   * DataProviderDescriptorProperty dataProviderDescriptorProperty =
   * DataProviderDescriptorProperty.builder()
   * .dataProviderArn("dataProviderArn")
   * .dataProviderIdentifier("dataProviderIdentifier")
   * .dataProviderName("dataProviderName")
   * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
   * .secretsManagerSecretId("secretsManagerSecretId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-dataproviderdescriptor.html)
   */
  public interface DataProviderDescriptorProperty {
    /**
     * The Amazon Resource Name (ARN) of the data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-dataproviderdescriptor.html#cfn-dms-migrationproject-dataproviderdescriptor-dataproviderarn)
     */
    public fun dataProviderArn(): String? = unwrap(this).getDataProviderArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-dataproviderdescriptor.html#cfn-dms-migrationproject-dataproviderdescriptor-dataprovideridentifier)
     */
    public fun dataProviderIdentifier(): String? = unwrap(this).getDataProviderIdentifier()

    /**
     * The user-friendly name of the data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-dataproviderdescriptor.html#cfn-dms-migrationproject-dataproviderdescriptor-dataprovidername)
     */
    public fun dataProviderName(): String? = unwrap(this).getDataProviderName()

    /**
     * The ARN of the role used to access AWS Secrets Manager.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-dataproviderdescriptor.html#cfn-dms-migrationproject-dataproviderdescriptor-secretsmanageraccessrolearn)
     */
    public fun secretsManagerAccessRoleArn(): String? =
        unwrap(this).getSecretsManagerAccessRoleArn()

    /**
     * The identifier of the AWS Secrets Manager Secret used to store access credentials for the
     * data provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-dataproviderdescriptor.html#cfn-dms-migrationproject-dataproviderdescriptor-secretsmanagersecretid)
     */
    public fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()

    /**
     * A builder for [DataProviderDescriptorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataProviderArn The Amazon Resource Name (ARN) of the data provider.
       */
      public fun dataProviderArn(dataProviderArn: String)

      /**
       * @param dataProviderIdentifier the value to be set.
       */
      public fun dataProviderIdentifier(dataProviderIdentifier: String)

      /**
       * @param dataProviderName The user-friendly name of the data provider.
       */
      public fun dataProviderName(dataProviderName: String)

      /**
       * @param secretsManagerAccessRoleArn The ARN of the role used to access AWS Secrets Manager.
       */
      public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String)

      /**
       * @param secretsManagerSecretId The identifier of the AWS Secrets Manager Secret used to
       * store access credentials for the data provider.
       */
      public fun secretsManagerSecretId(secretsManagerSecretId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnMigrationProject.DataProviderDescriptorProperty.Builder
          =
          software.amazon.awscdk.services.dms.CfnMigrationProject.DataProviderDescriptorProperty.builder()

      /**
       * @param dataProviderArn The Amazon Resource Name (ARN) of the data provider.
       */
      override fun dataProviderArn(dataProviderArn: String) {
        cdkBuilder.dataProviderArn(dataProviderArn)
      }

      /**
       * @param dataProviderIdentifier the value to be set.
       */
      override fun dataProviderIdentifier(dataProviderIdentifier: String) {
        cdkBuilder.dataProviderIdentifier(dataProviderIdentifier)
      }

      /**
       * @param dataProviderName The user-friendly name of the data provider.
       */
      override fun dataProviderName(dataProviderName: String) {
        cdkBuilder.dataProviderName(dataProviderName)
      }

      /**
       * @param secretsManagerAccessRoleArn The ARN of the role used to access AWS Secrets Manager.
       */
      override fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
      }

      /**
       * @param secretsManagerSecretId The identifier of the AWS Secrets Manager Secret used to
       * store access credentials for the data provider.
       */
      override fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
      }

      public fun build():
          software.amazon.awscdk.services.dms.CfnMigrationProject.DataProviderDescriptorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnMigrationProject.DataProviderDescriptorProperty,
    ) : CdkObject(cdkObject), DataProviderDescriptorProperty {
      /**
       * The Amazon Resource Name (ARN) of the data provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-dataproviderdescriptor.html#cfn-dms-migrationproject-dataproviderdescriptor-dataproviderarn)
       */
      override fun dataProviderArn(): String? = unwrap(this).getDataProviderArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-dataproviderdescriptor.html#cfn-dms-migrationproject-dataproviderdescriptor-dataprovideridentifier)
       */
      override fun dataProviderIdentifier(): String? = unwrap(this).getDataProviderIdentifier()

      /**
       * The user-friendly name of the data provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-dataproviderdescriptor.html#cfn-dms-migrationproject-dataproviderdescriptor-dataprovidername)
       */
      override fun dataProviderName(): String? = unwrap(this).getDataProviderName()

      /**
       * The ARN of the role used to access AWS Secrets Manager.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-dataproviderdescriptor.html#cfn-dms-migrationproject-dataproviderdescriptor-secretsmanageraccessrolearn)
       */
      override fun secretsManagerAccessRoleArn(): String? =
          unwrap(this).getSecretsManagerAccessRoleArn()

      /**
       * The identifier of the AWS Secrets Manager Secret used to store access credentials for the
       * data provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-dataproviderdescriptor.html#cfn-dms-migrationproject-dataproviderdescriptor-secretsmanagersecretid)
       */
      override fun secretsManagerSecretId(): String? = unwrap(this).getSecretsManagerSecretId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataProviderDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnMigrationProject.DataProviderDescriptorProperty):
          DataProviderDescriptorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataProviderDescriptorProperty):
          software.amazon.awscdk.services.dms.CfnMigrationProject.DataProviderDescriptorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnMigrationProject.DataProviderDescriptorProperty
    }
  }

  /**
   * The property describes schema conversion application attributes for the migration project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dms.*;
   * SchemaConversionApplicationAttributesProperty schemaConversionApplicationAttributesProperty =
   * SchemaConversionApplicationAttributesProperty.builder()
   * .s3BucketPath("s3BucketPath")
   * .s3BucketRoleArn("s3BucketRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-schemaconversionapplicationattributes.html)
   */
  public interface SchemaConversionApplicationAttributesProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-schemaconversionapplicationattributes.html#cfn-dms-migrationproject-schemaconversionapplicationattributes-s3bucketpath)
     */
    public fun s3BucketPath(): String? = unwrap(this).getS3BucketPath()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-schemaconversionapplicationattributes.html#cfn-dms-migrationproject-schemaconversionapplicationattributes-s3bucketrolearn)
     */
    public fun s3BucketRoleArn(): String? = unwrap(this).getS3BucketRoleArn()

    /**
     * A builder for [SchemaConversionApplicationAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3BucketPath the value to be set.
       */
      public fun s3BucketPath(s3BucketPath: String)

      /**
       * @param s3BucketRoleArn the value to be set.
       */
      public fun s3BucketRoleArn(s3BucketRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnMigrationProject.SchemaConversionApplicationAttributesProperty.Builder
          =
          software.amazon.awscdk.services.dms.CfnMigrationProject.SchemaConversionApplicationAttributesProperty.builder()

      /**
       * @param s3BucketPath the value to be set.
       */
      override fun s3BucketPath(s3BucketPath: String) {
        cdkBuilder.s3BucketPath(s3BucketPath)
      }

      /**
       * @param s3BucketRoleArn the value to be set.
       */
      override fun s3BucketRoleArn(s3BucketRoleArn: String) {
        cdkBuilder.s3BucketRoleArn(s3BucketRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.dms.CfnMigrationProject.SchemaConversionApplicationAttributesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dms.CfnMigrationProject.SchemaConversionApplicationAttributesProperty,
    ) : CdkObject(cdkObject), SchemaConversionApplicationAttributesProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-schemaconversionapplicationattributes.html#cfn-dms-migrationproject-schemaconversionapplicationattributes-s3bucketpath)
       */
      override fun s3BucketPath(): String? = unwrap(this).getS3BucketPath()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-schemaconversionapplicationattributes.html#cfn-dms-migrationproject-schemaconversionapplicationattributes-s3bucketrolearn)
       */
      override fun s3BucketRoleArn(): String? = unwrap(this).getS3BucketRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SchemaConversionApplicationAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnMigrationProject.SchemaConversionApplicationAttributesProperty):
          SchemaConversionApplicationAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaConversionApplicationAttributesProperty):
          software.amazon.awscdk.services.dms.CfnMigrationProject.SchemaConversionApplicationAttributesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dms.CfnMigrationProject.SchemaConversionApplicationAttributesProperty
    }
  }
}
