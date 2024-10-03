@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a custom DB engine version (CEV).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnCustomDBEngineVersion cfnCustomDBEngineVersion = CfnCustomDBEngineVersion.Builder.create(this,
 * "MyCfnCustomDBEngineVersion")
 * .engine("engine")
 * .engineVersion("engineVersion")
 * // the properties below are optional
 * .databaseInstallationFilesS3BucketName("databaseInstallationFilesS3BucketName")
 * .databaseInstallationFilesS3Prefix("databaseInstallationFilesS3Prefix")
 * .description("description")
 * .imageId("imageId")
 * .kmsKeyId("kmsKeyId")
 * .manifest("manifest")
 * .sourceCustomDbEngineVersionIdentifier("sourceCustomDbEngineVersionIdentifier")
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .useAwsProvidedLatestImage(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html)
 */
public open class CfnCustomDBEngineVersion(
  cdkObject: software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomDBEngineVersionProps,
  ) :
      this(software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCustomDBEngineVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomDBEngineVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCustomDBEngineVersionProps(props)
  )

  /**
   * The ARN of the custom engine version.
   */
  public open fun attrDbEngineVersionArn(): String = unwrap(this).getAttrDbEngineVersionArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The name of an Amazon S3 bucket that contains database installation files for your CEV.
   */
  public open fun databaseInstallationFilesS3BucketName(): String? =
      unwrap(this).getDatabaseInstallationFilesS3BucketName()

  /**
   * The name of an Amazon S3 bucket that contains database installation files for your CEV.
   */
  public open fun databaseInstallationFilesS3BucketName(`value`: String) {
    unwrap(this).setDatabaseInstallationFilesS3BucketName(`value`)
  }

  /**
   * The Amazon S3 directory that contains the database installation files for your CEV.
   */
  public open fun databaseInstallationFilesS3Prefix(): String? =
      unwrap(this).getDatabaseInstallationFilesS3Prefix()

  /**
   * The Amazon S3 directory that contains the database installation files for your CEV.
   */
  public open fun databaseInstallationFilesS3Prefix(`value`: String) {
    unwrap(this).setDatabaseInstallationFilesS3Prefix(`value`)
  }

  /**
   * An optional description of your CEV.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * An optional description of your CEV.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The database engine to use for your custom engine version (CEV).
   */
  public open fun engine(): String = unwrap(this).getEngine()

  /**
   * The database engine to use for your custom engine version (CEV).
   */
  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  /**
   * The name of your CEV.
   */
  public open fun engineVersion(): String = unwrap(this).getEngineVersion()

  /**
   * The name of your CEV.
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  /**
   * A value that indicates the ID of the AMI.
   */
  public open fun imageId(): String? = unwrap(this).getImageId()

  /**
   * A value that indicates the ID of the AMI.
   */
  public open fun imageId(`value`: String) {
    unwrap(this).setImageId(`value`)
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
   * The AWS KMS key identifier for an encrypted CEV.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The AWS KMS key identifier for an encrypted CEV.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The CEV manifest, which is a JSON document that describes the installation .zip files stored in
   * Amazon S3. Specify the name/value pairs in a file or a quoted string. RDS Custom applies the
   * patches in the order in which they are listed.
   */
  public open fun manifest(): String? = unwrap(this).getManifest()

  /**
   * The CEV manifest, which is a JSON document that describes the installation .zip files stored in
   * Amazon S3. Specify the name/value pairs in a file or a quoted string. RDS Custom applies the
   * patches in the order in which they are listed.
   */
  public open fun manifest(`value`: String) {
    unwrap(this).setManifest(`value`)
  }

  /**
   * The ARN of a CEV to use as a source for creating a new CEV.
   */
  public open fun sourceCustomDbEngineVersionIdentifier(): String? =
      unwrap(this).getSourceCustomDbEngineVersionIdentifier()

  /**
   * The ARN of a CEV to use as a source for creating a new CEV.
   */
  public open fun sourceCustomDbEngineVersionIdentifier(`value`: String) {
    unwrap(this).setSourceCustomDbEngineVersionIdentifier(`value`)
  }

  /**
   * A value that indicates the status of a custom engine version (CEV).
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * A value that indicates the status of a custom engine version (CEV).
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * A list of tags.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of tags.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * Specifies whether to use the latest service-provided Amazon Machine Image (AMI) for the CEV.
   */
  public open fun useAwsProvidedLatestImage(): Any? = unwrap(this).getUseAwsProvidedLatestImage()

  /**
   * Specifies whether to use the latest service-provided Amazon Machine Image (AMI) for the CEV.
   */
  public open fun useAwsProvidedLatestImage(`value`: Boolean) {
    unwrap(this).setUseAwsProvidedLatestImage(`value`)
  }

  /**
   * Specifies whether to use the latest service-provided Amazon Machine Image (AMI) for the CEV.
   */
  public open fun useAwsProvidedLatestImage(`value`: IResolvable) {
    unwrap(this).setUseAwsProvidedLatestImage(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnCustomDBEngineVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of an Amazon S3 bucket that contains database installation files for your CEV.
     *
     * For example, a valid bucket name is `my-custom-installation-files` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-databaseinstallationfiless3bucketname)
     * @param databaseInstallationFilesS3BucketName The name of an Amazon S3 bucket that contains
     * database installation files for your CEV. 
     */
    public fun databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName: String)

    /**
     * The Amazon S3 directory that contains the database installation files for your CEV.
     *
     * For example, a valid bucket name is `123456789012/cev1` . If this setting isn't specified, no
     * prefix is assumed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-databaseinstallationfiless3prefix)
     * @param databaseInstallationFilesS3Prefix The Amazon S3 directory that contains the database
     * installation files for your CEV. 
     */
    public fun databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix: String)

    /**
     * An optional description of your CEV.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-description)
     * @param description An optional description of your CEV. 
     */
    public fun description(description: String)

    /**
     * The database engine to use for your custom engine version (CEV).
     *
     * Valid values:
     *
     * * `custom-oracle-ee`
     * * `custom-oracle-ee-cdb`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-engine)
     * @param engine The database engine to use for your custom engine version (CEV). 
     */
    public fun engine(engine: String)

    /**
     * The name of your CEV.
     *
     * The name format is `major version.customized_string` . For example, a valid CEV name is
     * `19.my_cev1` . This setting is required for RDS Custom for Oracle, but optional for Amazon RDS.
     * The combination of `Engine` and `EngineVersion` is unique per customer per Region.
     *
     * *Constraints:* Minimum length is 1. Maximum length is 60.
     *
     * *Pattern:* `^[a-z0-9_.-]{1,60$` }
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-engineversion)
     * @param engineVersion The name of your CEV. 
     */
    public fun engineVersion(engineVersion: String)

    /**
     * A value that indicates the ID of the AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-imageid)
     * @param imageId A value that indicates the ID of the AMI. 
     */
    public fun imageId(imageId: String)

    /**
     * The AWS KMS key identifier for an encrypted CEV.
     *
     * A symmetric encryption KMS key is required for RDS Custom, but optional for Amazon RDS.
     *
     * If you have an existing symmetric encryption KMS key in your account, you can use it with RDS
     * Custom. No further action is necessary. If you don't already have a symmetric encryption KMS key
     * in your account, follow the instructions in [Creating a symmetric encryption KMS
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html#create-symmetric-cmk)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * You can choose the same symmetric encryption key when you create a CEV and a DB instance, or
     * choose different keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-kmskeyid)
     * @param kmsKeyId The AWS KMS key identifier for an encrypted CEV. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The CEV manifest, which is a JSON document that describes the installation .zip files stored
     * in Amazon S3. Specify the name/value pairs in a file or a quoted string. RDS Custom applies the
     * patches in the order in which they are listed.
     *
     * The following JSON fields are valid:
     *
     * * **MediaImportTemplateVersion** - Version of the CEV manifest. The date is in the format
     * `YYYY-MM-DD` .
     * * **databaseInstallationFileNames** - Ordered list of installation files for the CEV.
     * * **opatchFileNames** - Ordered list of OPatch installers used for the Oracle DB engine.
     * * **psuRuPatchFileNames** - The PSU and RU patches for this CEV.
     * * **OtherPatchFileNames** - The patches that are not in the list of PSU and RU patches.
     * Amazon RDS applies these patches after applying the PSU and RU patches.
     *
     * For more information, see [Creating the CEV
     * manifest](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.preparing.manifest)
     * in the *Amazon RDS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-manifest)
     * @param manifest The CEV manifest, which is a JSON document that describes the installation
     * .zip files stored in Amazon S3. Specify the name/value pairs in a file or a quoted string. RDS
     * Custom applies the patches in the order in which they are listed. 
     */
    public fun manifest(manifest: String)

    /**
     * The ARN of a CEV to use as a source for creating a new CEV.
     *
     * You can specify a different Amazon Machine Imagine (AMI) by using either `Source` or
     * `UseAwsProvidedLatestImage` . You can't specify a different JSON manifest when you specify
     * `SourceCustomDbEngineVersionIdentifier` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-sourcecustomdbengineversionidentifier)
     * @param sourceCustomDbEngineVersionIdentifier The ARN of a CEV to use as a source for creating
     * a new CEV. 
     */
    public fun sourceCustomDbEngineVersionIdentifier(sourceCustomDbEngineVersionIdentifier: String)

    /**
     * A value that indicates the status of a custom engine version (CEV).
     *
     * Default: - "available"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-status)
     * @param status A value that indicates the status of a custom engine version (CEV). 
     */
    public fun status(status: String)

    /**
     * A list of tags.
     *
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-tags)
     * @param tags A list of tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags.
     *
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-tags)
     * @param tags A list of tags. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Specifies whether to use the latest service-provided Amazon Machine Image (AMI) for the CEV.
     *
     * If you specify `UseAwsProvidedLatestImage` , you can't also specify `ImageId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-useawsprovidedlatestimage)
     * @param useAwsProvidedLatestImage Specifies whether to use the latest service-provided Amazon
     * Machine Image (AMI) for the CEV. 
     */
    public fun useAwsProvidedLatestImage(useAwsProvidedLatestImage: Boolean)

    /**
     * Specifies whether to use the latest service-provided Amazon Machine Image (AMI) for the CEV.
     *
     * If you specify `UseAwsProvidedLatestImage` , you can't also specify `ImageId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-useawsprovidedlatestimage)
     * @param useAwsProvidedLatestImage Specifies whether to use the latest service-provided Amazon
     * Machine Image (AMI) for the CEV. 
     */
    public fun useAwsProvidedLatestImage(useAwsProvidedLatestImage: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion.Builder =
        software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion.Builder.create(scope, id)

    /**
     * The name of an Amazon S3 bucket that contains database installation files for your CEV.
     *
     * For example, a valid bucket name is `my-custom-installation-files` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-databaseinstallationfiless3bucketname)
     * @param databaseInstallationFilesS3BucketName The name of an Amazon S3 bucket that contains
     * database installation files for your CEV. 
     */
    override
        fun databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName: String) {
      cdkBuilder.databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName)
    }

    /**
     * The Amazon S3 directory that contains the database installation files for your CEV.
     *
     * For example, a valid bucket name is `123456789012/cev1` . If this setting isn't specified, no
     * prefix is assumed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-databaseinstallationfiless3prefix)
     * @param databaseInstallationFilesS3Prefix The Amazon S3 directory that contains the database
     * installation files for your CEV. 
     */
    override fun databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix: String) {
      cdkBuilder.databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix)
    }

    /**
     * An optional description of your CEV.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-description)
     * @param description An optional description of your CEV. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The database engine to use for your custom engine version (CEV).
     *
     * Valid values:
     *
     * * `custom-oracle-ee`
     * * `custom-oracle-ee-cdb`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-engine)
     * @param engine The database engine to use for your custom engine version (CEV). 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * The name of your CEV.
     *
     * The name format is `major version.customized_string` . For example, a valid CEV name is
     * `19.my_cev1` . This setting is required for RDS Custom for Oracle, but optional for Amazon RDS.
     * The combination of `Engine` and `EngineVersion` is unique per customer per Region.
     *
     * *Constraints:* Minimum length is 1. Maximum length is 60.
     *
     * *Pattern:* `^[a-z0-9_.-]{1,60$` }
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-engineversion)
     * @param engineVersion The name of your CEV. 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * A value that indicates the ID of the AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-imageid)
     * @param imageId A value that indicates the ID of the AMI. 
     */
    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    /**
     * The AWS KMS key identifier for an encrypted CEV.
     *
     * A symmetric encryption KMS key is required for RDS Custom, but optional for Amazon RDS.
     *
     * If you have an existing symmetric encryption KMS key in your account, you can use it with RDS
     * Custom. No further action is necessary. If you don't already have a symmetric encryption KMS key
     * in your account, follow the instructions in [Creating a symmetric encryption KMS
     * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html#create-symmetric-cmk)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * You can choose the same symmetric encryption key when you create a CEV and a DB instance, or
     * choose different keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-kmskeyid)
     * @param kmsKeyId The AWS KMS key identifier for an encrypted CEV. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The CEV manifest, which is a JSON document that describes the installation .zip files stored
     * in Amazon S3. Specify the name/value pairs in a file or a quoted string. RDS Custom applies the
     * patches in the order in which they are listed.
     *
     * The following JSON fields are valid:
     *
     * * **MediaImportTemplateVersion** - Version of the CEV manifest. The date is in the format
     * `YYYY-MM-DD` .
     * * **databaseInstallationFileNames** - Ordered list of installation files for the CEV.
     * * **opatchFileNames** - Ordered list of OPatch installers used for the Oracle DB engine.
     * * **psuRuPatchFileNames** - The PSU and RU patches for this CEV.
     * * **OtherPatchFileNames** - The patches that are not in the list of PSU and RU patches.
     * Amazon RDS applies these patches after applying the PSU and RU patches.
     *
     * For more information, see [Creating the CEV
     * manifest](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.preparing.manifest)
     * in the *Amazon RDS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-manifest)
     * @param manifest The CEV manifest, which is a JSON document that describes the installation
     * .zip files stored in Amazon S3. Specify the name/value pairs in a file or a quoted string. RDS
     * Custom applies the patches in the order in which they are listed. 
     */
    override fun manifest(manifest: String) {
      cdkBuilder.manifest(manifest)
    }

    /**
     * The ARN of a CEV to use as a source for creating a new CEV.
     *
     * You can specify a different Amazon Machine Imagine (AMI) by using either `Source` or
     * `UseAwsProvidedLatestImage` . You can't specify a different JSON manifest when you specify
     * `SourceCustomDbEngineVersionIdentifier` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-sourcecustomdbengineversionidentifier)
     * @param sourceCustomDbEngineVersionIdentifier The ARN of a CEV to use as a source for creating
     * a new CEV. 
     */
    override
        fun sourceCustomDbEngineVersionIdentifier(sourceCustomDbEngineVersionIdentifier: String) {
      cdkBuilder.sourceCustomDbEngineVersionIdentifier(sourceCustomDbEngineVersionIdentifier)
    }

    /**
     * A value that indicates the status of a custom engine version (CEV).
     *
     * Default: - "available"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-status)
     * @param status A value that indicates the status of a custom engine version (CEV). 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * A list of tags.
     *
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-tags)
     * @param tags A list of tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of tags.
     *
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-tags)
     * @param tags A list of tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Specifies whether to use the latest service-provided Amazon Machine Image (AMI) for the CEV.
     *
     * If you specify `UseAwsProvidedLatestImage` , you can't also specify `ImageId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-useawsprovidedlatestimage)
     * @param useAwsProvidedLatestImage Specifies whether to use the latest service-provided Amazon
     * Machine Image (AMI) for the CEV. 
     */
    override fun useAwsProvidedLatestImage(useAwsProvidedLatestImage: Boolean) {
      cdkBuilder.useAwsProvidedLatestImage(useAwsProvidedLatestImage)
    }

    /**
     * Specifies whether to use the latest service-provided Amazon Machine Image (AMI) for the CEV.
     *
     * If you specify `UseAwsProvidedLatestImage` , you can't also specify `ImageId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-useawsprovidedlatestimage)
     * @param useAwsProvidedLatestImage Specifies whether to use the latest service-provided Amazon
     * Machine Image (AMI) for the CEV. 
     */
    override fun useAwsProvidedLatestImage(useAwsProvidedLatestImage: IResolvable) {
      cdkBuilder.useAwsProvidedLatestImage(useAwsProvidedLatestImage.let(IResolvable.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomDBEngineVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomDBEngineVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion):
        CfnCustomDBEngineVersion = CfnCustomDBEngineVersion(cdkObject)

    internal fun unwrap(wrapped: CfnCustomDBEngineVersion):
        software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion
  }
}
