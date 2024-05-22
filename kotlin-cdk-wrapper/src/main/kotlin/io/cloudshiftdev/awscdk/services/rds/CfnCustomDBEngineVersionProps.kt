@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCustomDBEngineVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnCustomDBEngineVersionProps cfnCustomDBEngineVersionProps =
 * CfnCustomDBEngineVersionProps.builder()
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
public interface CfnCustomDBEngineVersionProps {
  /**
   * The name of an Amazon S3 bucket that contains database installation files for your CEV.
   *
   * For example, a valid bucket name is `my-custom-installation-files` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-databaseinstallationfiless3bucketname)
   */
  public fun databaseInstallationFilesS3BucketName(): String? =
      unwrap(this).getDatabaseInstallationFilesS3BucketName()

  /**
   * The Amazon S3 directory that contains the database installation files for your CEV.
   *
   * For example, a valid bucket name is `123456789012/cev1` . If this setting isn't specified, no
   * prefix is assumed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-databaseinstallationfiless3prefix)
   */
  public fun databaseInstallationFilesS3Prefix(): String? =
      unwrap(this).getDatabaseInstallationFilesS3Prefix()

  /**
   * An optional description of your CEV.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The database engine to use for your custom engine version (CEV).
   *
   * Valid values:
   *
   * * `custom-oracle-ee`
   * * `custom-oracle-ee-cdb`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-engine)
   */
  public fun engine(): String

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
   */
  public fun engineVersion(): String

  /**
   * A value that indicates the ID of the AMI.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-imageid)
   */
  public fun imageId(): String? = unwrap(this).getImageId()

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
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The CEV manifest, which is a JSON document that describes the installation .zip files stored in
   * Amazon S3. Specify the name/value pairs in a file or a quoted string. RDS Custom applies the
   * patches in the order in which they are listed.
   *
   * The following JSON fields are valid:
   *
   * * **MediaImportTemplateVersion** - Version of the CEV manifest. The date is in the format
   * `YYYY-MM-DD` .
   * * **databaseInstallationFileNames** - Ordered list of installation files for the CEV.
   * * **opatchFileNames** - Ordered list of OPatch installers used for the Oracle DB engine.
   * * **psuRuPatchFileNames** - The PSU and RU patches for this CEV.
   * * **OtherPatchFileNames** - The patches that are not in the list of PSU and RU patches. Amazon
   * RDS applies these patches after applying the PSU and RU patches.
   *
   * For more information, see [Creating the CEV
   * manifest](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.preparing.manifest)
   * in the *Amazon RDS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-manifest)
   */
  public fun manifest(): String? = unwrap(this).getManifest()

  /**
   * The ARN of a CEV to use as a source for creating a new CEV.
   *
   * You can specify a different Amazon Machine Imagine (AMI) by using either `Source` or
   * `UseAwsProvidedLatestImage` . You can't specify a different JSON manifest when you specify
   * `SourceCustomDbEngineVersionIdentifier` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-sourcecustomdbengineversionidentifier)
   */
  public fun sourceCustomDbEngineVersionIdentifier(): String? =
      unwrap(this).getSourceCustomDbEngineVersionIdentifier()

  /**
   * A value that indicates the status of a custom engine version (CEV).
   *
   * Default: - "available"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * A list of tags.
   *
   * For more information, see [Tagging Amazon RDS
   * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
   * *Amazon RDS User Guide.*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies whether to use the latest service-provided Amazon Machine Image (AMI) for the CEV.
   *
   * If you specify `UseAwsProvidedLatestImage` , you can't also specify `ImageId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-useawsprovidedlatestimage)
   */
  public fun useAwsProvidedLatestImage(): Any? = unwrap(this).getUseAwsProvidedLatestImage()

  /**
   * A builder for [CfnCustomDBEngineVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param databaseInstallationFilesS3BucketName The name of an Amazon S3 bucket that contains
     * database installation files for your CEV.
     * For example, a valid bucket name is `my-custom-installation-files` .
     */
    public fun databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName: String)

    /**
     * @param databaseInstallationFilesS3Prefix The Amazon S3 directory that contains the database
     * installation files for your CEV.
     * For example, a valid bucket name is `123456789012/cev1` . If this setting isn't specified, no
     * prefix is assumed.
     */
    public fun databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix: String)

    /**
     * @param description An optional description of your CEV.
     */
    public fun description(description: String)

    /**
     * @param engine The database engine to use for your custom engine version (CEV). 
     * Valid values:
     *
     * * `custom-oracle-ee`
     * * `custom-oracle-ee-cdb`
     */
    public fun engine(engine: String)

    /**
     * @param engineVersion The name of your CEV. 
     * The name format is `major version.customized_string` . For example, a valid CEV name is
     * `19.my_cev1` . This setting is required for RDS Custom for Oracle, but optional for Amazon RDS.
     * The combination of `Engine` and `EngineVersion` is unique per customer per Region.
     *
     * *Constraints:* Minimum length is 1. Maximum length is 60.
     *
     * *Pattern:* `^[a-z0-9_.-]{1,60$` }
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param imageId A value that indicates the ID of the AMI.
     */
    public fun imageId(imageId: String)

    /**
     * @param kmsKeyId The AWS KMS key identifier for an encrypted CEV.
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
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param manifest The CEV manifest, which is a JSON document that describes the installation
     * .zip files stored in Amazon S3. Specify the name/value pairs in a file or a quoted string. RDS
     * Custom applies the patches in the order in which they are listed.
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
     */
    public fun manifest(manifest: String)

    /**
     * @param sourceCustomDbEngineVersionIdentifier The ARN of a CEV to use as a source for creating
     * a new CEV.
     * You can specify a different Amazon Machine Imagine (AMI) by using either `Source` or
     * `UseAwsProvidedLatestImage` . You can't specify a different JSON manifest when you specify
     * `SourceCustomDbEngineVersionIdentifier` .
     */
    public fun sourceCustomDbEngineVersionIdentifier(sourceCustomDbEngineVersionIdentifier: String)

    /**
     * @param status A value that indicates the status of a custom engine version (CEV).
     */
    public fun status(status: String)

    /**
     * @param tags A list of tags.
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.*
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags.
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.*
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param useAwsProvidedLatestImage Specifies whether to use the latest service-provided Amazon
     * Machine Image (AMI) for the CEV.
     * If you specify `UseAwsProvidedLatestImage` , you can't also specify `ImageId` .
     */
    public fun useAwsProvidedLatestImage(useAwsProvidedLatestImage: Boolean)

    /**
     * @param useAwsProvidedLatestImage Specifies whether to use the latest service-provided Amazon
     * Machine Image (AMI) for the CEV.
     * If you specify `UseAwsProvidedLatestImage` , you can't also specify `ImageId` .
     */
    public fun useAwsProvidedLatestImage(useAwsProvidedLatestImage: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps.Builder =
        software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps.builder()

    /**
     * @param databaseInstallationFilesS3BucketName The name of an Amazon S3 bucket that contains
     * database installation files for your CEV.
     * For example, a valid bucket name is `my-custom-installation-files` .
     */
    override
        fun databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName: String) {
      cdkBuilder.databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName)
    }

    /**
     * @param databaseInstallationFilesS3Prefix The Amazon S3 directory that contains the database
     * installation files for your CEV.
     * For example, a valid bucket name is `123456789012/cev1` . If this setting isn't specified, no
     * prefix is assumed.
     */
    override fun databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix: String) {
      cdkBuilder.databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix)
    }

    /**
     * @param description An optional description of your CEV.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param engine The database engine to use for your custom engine version (CEV). 
     * Valid values:
     *
     * * `custom-oracle-ee`
     * * `custom-oracle-ee-cdb`
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param engineVersion The name of your CEV. 
     * The name format is `major version.customized_string` . For example, a valid CEV name is
     * `19.my_cev1` . This setting is required for RDS Custom for Oracle, but optional for Amazon RDS.
     * The combination of `Engine` and `EngineVersion` is unique per customer per Region.
     *
     * *Constraints:* Minimum length is 1. Maximum length is 60.
     *
     * *Pattern:* `^[a-z0-9_.-]{1,60$` }
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param imageId A value that indicates the ID of the AMI.
     */
    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    /**
     * @param kmsKeyId The AWS KMS key identifier for an encrypted CEV.
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
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param manifest The CEV manifest, which is a JSON document that describes the installation
     * .zip files stored in Amazon S3. Specify the name/value pairs in a file or a quoted string. RDS
     * Custom applies the patches in the order in which they are listed.
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
     */
    override fun manifest(manifest: String) {
      cdkBuilder.manifest(manifest)
    }

    /**
     * @param sourceCustomDbEngineVersionIdentifier The ARN of a CEV to use as a source for creating
     * a new CEV.
     * You can specify a different Amazon Machine Imagine (AMI) by using either `Source` or
     * `UseAwsProvidedLatestImage` . You can't specify a different JSON manifest when you specify
     * `SourceCustomDbEngineVersionIdentifier` .
     */
    override
        fun sourceCustomDbEngineVersionIdentifier(sourceCustomDbEngineVersionIdentifier: String) {
      cdkBuilder.sourceCustomDbEngineVersionIdentifier(sourceCustomDbEngineVersionIdentifier)
    }

    /**
     * @param status A value that indicates the status of a custom engine version (CEV).
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags A list of tags.
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.*
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tags.
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.*
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param useAwsProvidedLatestImage Specifies whether to use the latest service-provided Amazon
     * Machine Image (AMI) for the CEV.
     * If you specify `UseAwsProvidedLatestImage` , you can't also specify `ImageId` .
     */
    override fun useAwsProvidedLatestImage(useAwsProvidedLatestImage: Boolean) {
      cdkBuilder.useAwsProvidedLatestImage(useAwsProvidedLatestImage)
    }

    /**
     * @param useAwsProvidedLatestImage Specifies whether to use the latest service-provided Amazon
     * Machine Image (AMI) for the CEV.
     * If you specify `UseAwsProvidedLatestImage` , you can't also specify `ImageId` .
     */
    override fun useAwsProvidedLatestImage(useAwsProvidedLatestImage: IResolvable) {
      cdkBuilder.useAwsProvidedLatestImage(useAwsProvidedLatestImage.let(IResolvable.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps,
  ) : CdkObject(cdkObject), CfnCustomDBEngineVersionProps {
    /**
     * The name of an Amazon S3 bucket that contains database installation files for your CEV.
     *
     * For example, a valid bucket name is `my-custom-installation-files` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-databaseinstallationfiless3bucketname)
     */
    override fun databaseInstallationFilesS3BucketName(): String? =
        unwrap(this).getDatabaseInstallationFilesS3BucketName()

    /**
     * The Amazon S3 directory that contains the database installation files for your CEV.
     *
     * For example, a valid bucket name is `123456789012/cev1` . If this setting isn't specified, no
     * prefix is assumed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-databaseinstallationfiless3prefix)
     */
    override fun databaseInstallationFilesS3Prefix(): String? =
        unwrap(this).getDatabaseInstallationFilesS3Prefix()

    /**
     * An optional description of your CEV.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The database engine to use for your custom engine version (CEV).
     *
     * Valid values:
     *
     * * `custom-oracle-ee`
     * * `custom-oracle-ee-cdb`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-engine)
     */
    override fun engine(): String = unwrap(this).getEngine()

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
     */
    override fun engineVersion(): String = unwrap(this).getEngineVersion()

    /**
     * A value that indicates the ID of the AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-imageid)
     */
    override fun imageId(): String? = unwrap(this).getImageId()

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
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

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
     */
    override fun manifest(): String? = unwrap(this).getManifest()

    /**
     * The ARN of a CEV to use as a source for creating a new CEV.
     *
     * You can specify a different Amazon Machine Imagine (AMI) by using either `Source` or
     * `UseAwsProvidedLatestImage` . You can't specify a different JSON manifest when you specify
     * `SourceCustomDbEngineVersionIdentifier` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-sourcecustomdbengineversionidentifier)
     */
    override fun sourceCustomDbEngineVersionIdentifier(): String? =
        unwrap(this).getSourceCustomDbEngineVersionIdentifier()

    /**
     * A value that indicates the status of a custom engine version (CEV).
     *
     * Default: - "available"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * A list of tags.
     *
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies whether to use the latest service-provided Amazon Machine Image (AMI) for the CEV.
     *
     * If you specify `UseAwsProvidedLatestImage` , you can't also specify `ImageId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-useawsprovidedlatestimage)
     */
    override fun useAwsProvidedLatestImage(): Any? = unwrap(this).getUseAwsProvidedLatestImage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomDBEngineVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps):
        CfnCustomDBEngineVersionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCustomDBEngineVersionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomDBEngineVersionProps):
        software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnCustomDBEngineVersionProps
  }
}
