package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCustomDBEngineVersion
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
    /** The ARN of the custom engine version. */
    public open fun attrDbEngineVersionArn(): String = unwrap(this).getAttrDbEngineVersionArn()

    /** Tag Manager which manages the tags for this resource. */
    public override fun cdkTagManager(): TagManager =
        unwrap(this).getCdkTagManager().let(TagManager::wrap)

    /** The name of an Amazon S3 bucket that contains database installation files for your CEV. */
    public open fun databaseInstallationFilesS3BucketName(): String =
        unwrap(this).getDatabaseInstallationFilesS3BucketName()

    /** The name of an Amazon S3 bucket that contains database installation files for your CEV. */
    public open fun databaseInstallationFilesS3BucketName(`value`: String) {
        unwrap(this).setDatabaseInstallationFilesS3BucketName(`value`)
    }

    /** The Amazon S3 directory that contains the database installation files for your CEV. */
    public open fun databaseInstallationFilesS3Prefix(): String? =
        unwrap(this).getDatabaseInstallationFilesS3Prefix()

    /** The Amazon S3 directory that contains the database installation files for your CEV. */
    public open fun databaseInstallationFilesS3Prefix(`value`: String) {
        unwrap(this).setDatabaseInstallationFilesS3Prefix(`value`)
    }

    /** An optional description of your CEV. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** An optional description of your CEV. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /** The database engine to use for your custom engine version (CEV). */
    public open fun engine(): String = unwrap(this).getEngine()

    /** The database engine to use for your custom engine version (CEV). */
    public open fun engine(`value`: String) {
        unwrap(this).setEngine(`value`)
    }

    /** The name of your CEV. */
    public open fun engineVersion(): String = unwrap(this).getEngineVersion()

    /** The name of your CEV. */
    public open fun engineVersion(`value`: String) {
        unwrap(this).setEngineVersion(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The AWS KMS key identifier for an encrypted CEV. */
    public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /** The AWS KMS key identifier for an encrypted CEV. */
    public open fun kmsKeyId(`value`: String) {
        unwrap(this).setKmsKeyId(`value`)
    }

    /**
     * The CEV manifest, which is a JSON document that describes the installation .zip files stored
     * in Amazon S3. Specify the name/value pairs in a file or a quoted string. RDS Custom applies
     * the patches in the order in which they are listed.
     */
    public open fun manifest(): String? = unwrap(this).getManifest()

    /**
     * The CEV manifest, which is a JSON document that describes the installation .zip files stored
     * in Amazon S3. Specify the name/value pairs in a file or a quoted string. RDS Custom applies
     * the patches in the order in which they are listed.
     */
    public open fun manifest(`value`: String) {
        unwrap(this).setManifest(`value`)
    }

    /** A value that indicates the status of a custom engine version (CEV). */
    public open fun status(): String? = unwrap(this).getStatus()

    /** A value that indicates the status of a custom engine version (CEV). */
    public open fun status(`value`: String) {
        unwrap(this).setStatus(`value`)
    }

    /** A list of tags. */
    public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /** A list of tags. */
    public open fun tags(`value`: List<CfnTag>) {
        unwrap(this).setTags(`value`.map(CfnTag::unwrap))
    }

    /** A list of tags. */
    public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnCustomDBEngineVersion]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of an Amazon S3 bucket that contains database installation files for your CEV.
         *
         * For example, a valid bucket name is `my-custom-installation-files` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-databaseinstallationfiless3bucketname)
         *
         * @param databaseInstallationFilesS3BucketName The name of an Amazon S3 bucket that
         *   contains database installation files for your CEV.
         */
        public fun databaseInstallationFilesS3BucketName(
            databaseInstallationFilesS3BucketName: String
        )

        /**
         * The Amazon S3 directory that contains the database installation files for your CEV.
         *
         * For example, a valid bucket name is `123456789012/cev1` . If this setting isn't
         * specified, no prefix is assumed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-databaseinstallationfiless3prefix)
         *
         * @param databaseInstallationFilesS3Prefix The Amazon S3 directory that contains the
         *   database installation files for your CEV.
         */
        public fun databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix: String)

        /**
         * An optional description of your CEV.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-description)
         *
         * @param description An optional description of your CEV.
         */
        public fun description(description: String)

        /**
         * The database engine to use for your custom engine version (CEV).
         *
         * Valid values:
         * * `custom-oracle-ee`
         * * `custom-oracle-ee-cdb`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-engine)
         *
         * @param engine The database engine to use for your custom engine version (CEV).
         */
        public fun engine(engine: String)

        /**
         * The name of your CEV.
         *
         * The name format is `major version.customized_string` . For example, a valid CEV name is
         * `19.my_cev1` . This setting is required for RDS Custom for Oracle, but optional for
         * Amazon RDS. The combination of `Engine` and `EngineVersion` is unique per customer per
         * Region.
         *
         * *Constraints:* Minimum length is 1. Maximum length is 60.
         *
         * *Pattern:* `^[a-z0-9_.-]{1,60$` }
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-engineversion)
         *
         * @param engineVersion The name of your CEV.
         */
        public fun engineVersion(engineVersion: String)

        /**
         * The AWS KMS key identifier for an encrypted CEV.
         *
         * A symmetric encryption KMS key is required for RDS Custom, but optional for Amazon RDS.
         *
         * If you have an existing symmetric encryption KMS key in your account, you can use it with
         * RDS Custom. No further action is necessary. If you don't already have a symmetric
         * encryption KMS key in your account, follow the instructions in
         * [Creating a symmetric encryption KMS key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html#create-symmetric-cmk)
         * in the *AWS Key Management Service Developer Guide* .
         *
         * You can choose the same symmetric encryption key when you create a CEV and a DB instance,
         * or choose different keys.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-kmskeyid)
         *
         * @param kmsKeyId The AWS KMS key identifier for an encrypted CEV.
         */
        public fun kmsKeyId(kmsKeyId: String)

        /**
         * The CEV manifest, which is a JSON document that describes the installation .zip files
         * stored in Amazon S3. Specify the name/value pairs in a file or a quoted string. RDS
         * Custom applies the patches in the order in which they are listed.
         *
         * The following JSON fields are valid:
         * * **MediaImportTemplateVersion** - Version of the CEV manifest. The date is in the format
         *   `YYYY-MM-DD` .
         * * **databaseInstallationFileNames** - Ordered list of installation files for the CEV.
         * * **opatchFileNames** - Ordered list of OPatch installers used for the Oracle DB engine.
         * * **psuRuPatchFileNames** - The PSU and RU patches for this CEV.
         * * **OtherPatchFileNames** - The patches that are not in the list of PSU and RU patches.
         *   Amazon RDS applies these patches after applying the PSU and RU patches.
         *
         * For more information, see
         * [Creating the CEV manifest](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.preparing.manifest)
         * in the *Amazon RDS User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-manifest)
         *
         * @param manifest The CEV manifest, which is a JSON document that describes the
         *   installation .zip files stored in Amazon S3. Specify the name/value pairs in a file or
         *   a quoted string. RDS Custom applies the patches in the order in which they are listed.
         */
        public fun manifest(manifest: String)

        /**
         * A value that indicates the status of a custom engine version (CEV).
         *
         * Default: - "available"
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-status)
         *
         * @param status A value that indicates the status of a custom engine version (CEV).
         */
        public fun status(status: String)

        /**
         * A list of tags.
         *
         * For more information, see
         * [Tagging Amazon RDS Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html)
         * in the *Amazon RDS User Guide.*
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-tags)
         *
         * @param tags A list of tags.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * A list of tags.
         *
         * For more information, see
         * [Tagging Amazon RDS Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html)
         * in the *Amazon RDS User Guide.*
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-tags)
         *
         * @param tags A list of tags.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion.Builder =
            software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion.Builder.create(scope, id)

        /**
         * The name of an Amazon S3 bucket that contains database installation files for your CEV.
         *
         * For example, a valid bucket name is `my-custom-installation-files` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-databaseinstallationfiless3bucketname)
         *
         * @param databaseInstallationFilesS3BucketName The name of an Amazon S3 bucket that
         *   contains database installation files for your CEV.
         */
        override fun databaseInstallationFilesS3BucketName(
            databaseInstallationFilesS3BucketName: String
        ) {
            cdkBuilder.databaseInstallationFilesS3BucketName(databaseInstallationFilesS3BucketName)
        }

        /**
         * The Amazon S3 directory that contains the database installation files for your CEV.
         *
         * For example, a valid bucket name is `123456789012/cev1` . If this setting isn't
         * specified, no prefix is assumed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-databaseinstallationfiless3prefix)
         *
         * @param databaseInstallationFilesS3Prefix The Amazon S3 directory that contains the
         *   database installation files for your CEV.
         */
        override fun databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix: String) {
            cdkBuilder.databaseInstallationFilesS3Prefix(databaseInstallationFilesS3Prefix)
        }

        /**
         * An optional description of your CEV.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-description)
         *
         * @param description An optional description of your CEV.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * The database engine to use for your custom engine version (CEV).
         *
         * Valid values:
         * * `custom-oracle-ee`
         * * `custom-oracle-ee-cdb`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-engine)
         *
         * @param engine The database engine to use for your custom engine version (CEV).
         */
        override fun engine(engine: String) {
            cdkBuilder.engine(engine)
        }

        /**
         * The name of your CEV.
         *
         * The name format is `major version.customized_string` . For example, a valid CEV name is
         * `19.my_cev1` . This setting is required for RDS Custom for Oracle, but optional for
         * Amazon RDS. The combination of `Engine` and `EngineVersion` is unique per customer per
         * Region.
         *
         * *Constraints:* Minimum length is 1. Maximum length is 60.
         *
         * *Pattern:* `^[a-z0-9_.-]{1,60$` }
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-engineversion)
         *
         * @param engineVersion The name of your CEV.
         */
        override fun engineVersion(engineVersion: String) {
            cdkBuilder.engineVersion(engineVersion)
        }

        /**
         * The AWS KMS key identifier for an encrypted CEV.
         *
         * A symmetric encryption KMS key is required for RDS Custom, but optional for Amazon RDS.
         *
         * If you have an existing symmetric encryption KMS key in your account, you can use it with
         * RDS Custom. No further action is necessary. If you don't already have a symmetric
         * encryption KMS key in your account, follow the instructions in
         * [Creating a symmetric encryption KMS key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html#create-symmetric-cmk)
         * in the *AWS Key Management Service Developer Guide* .
         *
         * You can choose the same symmetric encryption key when you create a CEV and a DB instance,
         * or choose different keys.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-kmskeyid)
         *
         * @param kmsKeyId The AWS KMS key identifier for an encrypted CEV.
         */
        override fun kmsKeyId(kmsKeyId: String) {
            cdkBuilder.kmsKeyId(kmsKeyId)
        }

        /**
         * The CEV manifest, which is a JSON document that describes the installation .zip files
         * stored in Amazon S3. Specify the name/value pairs in a file or a quoted string. RDS
         * Custom applies the patches in the order in which they are listed.
         *
         * The following JSON fields are valid:
         * * **MediaImportTemplateVersion** - Version of the CEV manifest. The date is in the format
         *   `YYYY-MM-DD` .
         * * **databaseInstallationFileNames** - Ordered list of installation files for the CEV.
         * * **opatchFileNames** - Ordered list of OPatch installers used for the Oracle DB engine.
         * * **psuRuPatchFileNames** - The PSU and RU patches for this CEV.
         * * **OtherPatchFileNames** - The patches that are not in the list of PSU and RU patches.
         *   Amazon RDS applies these patches after applying the PSU and RU patches.
         *
         * For more information, see
         * [Creating the CEV manifest](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html#custom-cev.preparing.manifest)
         * in the *Amazon RDS User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-manifest)
         *
         * @param manifest The CEV manifest, which is a JSON document that describes the
         *   installation .zip files stored in Amazon S3. Specify the name/value pairs in a file or
         *   a quoted string. RDS Custom applies the patches in the order in which they are listed.
         */
        override fun manifest(manifest: String) {
            cdkBuilder.manifest(manifest)
        }

        /**
         * A value that indicates the status of a custom engine version (CEV).
         *
         * Default: - "available"
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-status)
         *
         * @param status A value that indicates the status of a custom engine version (CEV).
         */
        override fun status(status: String) {
            cdkBuilder.status(status)
        }

        /**
         * A list of tags.
         *
         * For more information, see
         * [Tagging Amazon RDS Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html)
         * in the *Amazon RDS User Guide.*
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-tags)
         *
         * @param tags A list of tags.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * A list of tags.
         *
         * For more information, see
         * [Tagging Amazon RDS Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html)
         * in the *Amazon RDS User Guide.*
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-customdbengineversion.html#cfn-rds-customdbengineversion-tags)
         *
         * @param tags A list of tags.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnCustomDBEngineVersion {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnCustomDBEngineVersion(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion
        ): CfnCustomDBEngineVersion = CfnCustomDBEngineVersion(cdkObject)

        internal fun unwrap(
            wrapped: CfnCustomDBEngineVersion
        ): software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion = wrapped.cdkObject
    }
}
