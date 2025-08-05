@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3tables

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a table bucket.
 *
 * For more information, see [Creating a table
 * bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-tables-buckets-create.html) in the
 * *Amazon Simple Storage Service User Guide* .
 *
 * * **Permissions** - - You must have the `s3tables:CreateTableBucket` permission to use this
 * operation.
 * * If you use this operation with the optional `encryptionConfiguration` parameter you must have
 * the `s3tables:PutTableBucketEncryption` permission.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3tables.*;
 * CfnTableBucket cfnTableBucket = CfnTableBucket.Builder.create(this, "MyCfnTableBucket")
 * .tableBucketName("tableBucketName")
 * // the properties below are optional
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .kmsKeyArn("kmsKeyArn")
 * .sseAlgorithm("sseAlgorithm")
 * .build())
 * .unreferencedFileRemoval(UnreferencedFileRemovalProperty.builder()
 * .noncurrentDays(123)
 * .status("status")
 * .unreferencedDays(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html)
 */
public open class CfnTableBucket(
  cdkObject: software.amazon.awscdk.services.s3tables.CfnTableBucket,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTableBucketProps,
  ) :
      this(software.amazon.awscdk.services.s3tables.CfnTableBucket(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTableBucketProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTableBucketProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTableBucketProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the table bucket.
   */
  public open fun attrTableBucketArn(): String = unwrap(this).getAttrTableBucketArn()

  /**
   * Configuration specifying how data should be encrypted.
   */
  public open fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  /**
   * Configuration specifying how data should be encrypted.
   */
  public open fun encryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setEncryptionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration specifying how data should be encrypted.
   */
  public open fun encryptionConfiguration(`value`: EncryptionConfigurationProperty) {
    unwrap(this).setEncryptionConfiguration(`value`.let(EncryptionConfigurationProperty.Companion::unwrap))
  }

  /**
   * Configuration specifying how data should be encrypted.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("66b05a00f0bc016a299ebaa114982b4bca431ff9d33b0c09ecd619e28f181ce7")
  public open
      fun encryptionConfiguration(`value`: EncryptionConfigurationProperty.Builder.() -> Unit): Unit
      = encryptionConfiguration(EncryptionConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name for the table bucket.
   */
  public open fun tableBucketName(): String = unwrap(this).getTableBucketName()

  /**
   * The name for the table bucket.
   */
  public open fun tableBucketName(`value`: String) {
    unwrap(this).setTableBucketName(`value`)
  }

  /**
   * The unreferenced file removal settings for your table bucket.
   */
  public open fun unreferencedFileRemoval(): Any? = unwrap(this).getUnreferencedFileRemoval()

  /**
   * The unreferenced file removal settings for your table bucket.
   */
  public open fun unreferencedFileRemoval(`value`: IResolvable) {
    unwrap(this).setUnreferencedFileRemoval(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The unreferenced file removal settings for your table bucket.
   */
  public open fun unreferencedFileRemoval(`value`: UnreferencedFileRemovalProperty) {
    unwrap(this).setUnreferencedFileRemoval(`value`.let(UnreferencedFileRemovalProperty.Companion::unwrap))
  }

  /**
   * The unreferenced file removal settings for your table bucket.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2c5caba77c7c63dc92e9d537323cad6f8c7735ca899bc6582e37d7af4e52dc11")
  public open
      fun unreferencedFileRemoval(`value`: UnreferencedFileRemovalProperty.Builder.() -> Unit): Unit
      = unreferencedFileRemoval(UnreferencedFileRemovalProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3tables.CfnTableBucket].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Configuration specifying how data should be encrypted.
     *
     * This structure defines the encryption algorithm and optional KMS key to be used for
     * server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-encryptionconfiguration)
     * @param encryptionConfiguration Configuration specifying how data should be encrypted. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * Configuration specifying how data should be encrypted.
     *
     * This structure defines the encryption algorithm and optional KMS key to be used for
     * server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-encryptionconfiguration)
     * @param encryptionConfiguration Configuration specifying how data should be encrypted. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

    /**
     * Configuration specifying how data should be encrypted.
     *
     * This structure defines the encryption algorithm and optional KMS key to be used for
     * server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-encryptionconfiguration)
     * @param encryptionConfiguration Configuration specifying how data should be encrypted. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ae44a571b3756c7ed768b66014da8c4e6b88f8b37b5b574593cf9f6dfbe9871")
    public
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * The name for the table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-tablebucketname)
     * @param tableBucketName The name for the table bucket. 
     */
    public fun tableBucketName(tableBucketName: String)

    /**
     * The unreferenced file removal settings for your table bucket.
     *
     * Unreferenced file removal identifies and deletes all objects that are not referenced by any
     * table snapshots. For more information, see the [*Amazon S3 User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-table-buckets-maintenance.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-unreferencedfileremoval)
     * @param unreferencedFileRemoval The unreferenced file removal settings for your table bucket. 
     */
    public fun unreferencedFileRemoval(unreferencedFileRemoval: IResolvable)

    /**
     * The unreferenced file removal settings for your table bucket.
     *
     * Unreferenced file removal identifies and deletes all objects that are not referenced by any
     * table snapshots. For more information, see the [*Amazon S3 User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-table-buckets-maintenance.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-unreferencedfileremoval)
     * @param unreferencedFileRemoval The unreferenced file removal settings for your table bucket. 
     */
    public fun unreferencedFileRemoval(unreferencedFileRemoval: UnreferencedFileRemovalProperty)

    /**
     * The unreferenced file removal settings for your table bucket.
     *
     * Unreferenced file removal identifies and deletes all objects that are not referenced by any
     * table snapshots. For more information, see the [*Amazon S3 User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-table-buckets-maintenance.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-unreferencedfileremoval)
     * @param unreferencedFileRemoval The unreferenced file removal settings for your table bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ae291372758725de5441d53931908f77e1f4abe538f65f62c252468a1629df3")
    public
        fun unreferencedFileRemoval(unreferencedFileRemoval: UnreferencedFileRemovalProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3tables.CfnTableBucket.Builder =
        software.amazon.awscdk.services.s3tables.CfnTableBucket.Builder.create(scope, id)

    /**
     * Configuration specifying how data should be encrypted.
     *
     * This structure defines the encryption algorithm and optional KMS key to be used for
     * server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-encryptionconfiguration)
     * @param encryptionConfiguration Configuration specifying how data should be encrypted. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration specifying how data should be encrypted.
     *
     * This structure defines the encryption algorithm and optional KMS key to be used for
     * server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-encryptionconfiguration)
     * @param encryptionConfiguration Configuration specifying how data should be encrypted. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * Configuration specifying how data should be encrypted.
     *
     * This structure defines the encryption algorithm and optional KMS key to be used for
     * server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-encryptionconfiguration)
     * @param encryptionConfiguration Configuration specifying how data should be encrypted. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ae44a571b3756c7ed768b66014da8c4e6b88f8b37b5b574593cf9f6dfbe9871")
    override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * The name for the table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-tablebucketname)
     * @param tableBucketName The name for the table bucket. 
     */
    override fun tableBucketName(tableBucketName: String) {
      cdkBuilder.tableBucketName(tableBucketName)
    }

    /**
     * The unreferenced file removal settings for your table bucket.
     *
     * Unreferenced file removal identifies and deletes all objects that are not referenced by any
     * table snapshots. For more information, see the [*Amazon S3 User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-table-buckets-maintenance.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-unreferencedfileremoval)
     * @param unreferencedFileRemoval The unreferenced file removal settings for your table bucket. 
     */
    override fun unreferencedFileRemoval(unreferencedFileRemoval: IResolvable) {
      cdkBuilder.unreferencedFileRemoval(unreferencedFileRemoval.let(IResolvable.Companion::unwrap))
    }

    /**
     * The unreferenced file removal settings for your table bucket.
     *
     * Unreferenced file removal identifies and deletes all objects that are not referenced by any
     * table snapshots. For more information, see the [*Amazon S3 User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-table-buckets-maintenance.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-unreferencedfileremoval)
     * @param unreferencedFileRemoval The unreferenced file removal settings for your table bucket. 
     */
    override fun unreferencedFileRemoval(unreferencedFileRemoval: UnreferencedFileRemovalProperty) {
      cdkBuilder.unreferencedFileRemoval(unreferencedFileRemoval.let(UnreferencedFileRemovalProperty.Companion::unwrap))
    }

    /**
     * The unreferenced file removal settings for your table bucket.
     *
     * Unreferenced file removal identifies and deletes all objects that are not referenced by any
     * table snapshots. For more information, see the [*Amazon S3 User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-table-buckets-maintenance.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-unreferencedfileremoval)
     * @param unreferencedFileRemoval The unreferenced file removal settings for your table bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ae291372758725de5441d53931908f77e1f4abe538f65f62c252468a1629df3")
    override
        fun unreferencedFileRemoval(unreferencedFileRemoval: UnreferencedFileRemovalProperty.Builder.() -> Unit):
        Unit = unreferencedFileRemoval(UnreferencedFileRemovalProperty(unreferencedFileRemoval))

    public fun build(): software.amazon.awscdk.services.s3tables.CfnTableBucket = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3tables.CfnTableBucket.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTableBucket {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTableBucket(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnTableBucket):
        CfnTableBucket = CfnTableBucket(cdkObject)

    internal fun unwrap(wrapped: CfnTableBucket):
        software.amazon.awscdk.services.s3tables.CfnTableBucket = wrapped.cdkObject as
        software.amazon.awscdk.services.s3tables.CfnTableBucket
  }

  /**
   * Configuration specifying how data should be encrypted.
   *
   * This structure defines the encryption algorithm and optional KMS key to be used for server-side
   * encryption.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3tables.*;
   * EncryptionConfigurationProperty encryptionConfigurationProperty =
   * EncryptionConfigurationProperty.builder()
   * .kmsKeyArn("kmsKeyArn")
   * .sseAlgorithm("sseAlgorithm")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-tablebucket-encryptionconfiguration.html)
   */
  public interface EncryptionConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the KMS key to use for encryption.
     *
     * This field is required only when `sseAlgorithm` is set to `aws:kms` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-tablebucket-encryptionconfiguration.html#cfn-s3tables-tablebucket-encryptionconfiguration-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The server-side encryption algorithm to use.
     *
     * Valid values are `AES256` for S3-managed encryption keys, or `aws:kms` for AWS KMS-managed
     * encryption keys. If you choose SSE-KMS encryption you must grant the S3 Tables maintenance
     * principal access to your KMS key. For more information, see [Permissions requirements for S3
     * Tables SSE-KMS
     * encryption](https://docs.aws.amazon.com//AmazonS3/latest/userguide/s3-tables-kms-permissions.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-tablebucket-encryptionconfiguration.html#cfn-s3tables-tablebucket-encryptionconfiguration-ssealgorithm)
     */
    public fun sseAlgorithm(): String? = unwrap(this).getSseAlgorithm()

    /**
     * A builder for [EncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key to use for encryption.
       * This field is required only when `sseAlgorithm` is set to `aws:kms` .
       */
      public fun kmsKeyArn(kmsKeyArn: String)

      /**
       * @param sseAlgorithm The server-side encryption algorithm to use.
       * Valid values are `AES256` for S3-managed encryption keys, or `aws:kms` for AWS KMS-managed
       * encryption keys. If you choose SSE-KMS encryption you must grant the S3 Tables maintenance
       * principal access to your KMS key. For more information, see [Permissions requirements for S3
       * Tables SSE-KMS
       * encryption](https://docs.aws.amazon.com//AmazonS3/latest/userguide/s3-tables-kms-permissions.html)
       * .
       */
      public fun sseAlgorithm(sseAlgorithm: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3tables.CfnTableBucket.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3tables.CfnTableBucket.EncryptionConfigurationProperty.builder()

      /**
       * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key to use for encryption.
       * This field is required only when `sseAlgorithm` is set to `aws:kms` .
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      /**
       * @param sseAlgorithm The server-side encryption algorithm to use.
       * Valid values are `AES256` for S3-managed encryption keys, or `aws:kms` for AWS KMS-managed
       * encryption keys. If you choose SSE-KMS encryption you must grant the S3 Tables maintenance
       * principal access to your KMS key. For more information, see [Permissions requirements for S3
       * Tables SSE-KMS
       * encryption](https://docs.aws.amazon.com//AmazonS3/latest/userguide/s3-tables-kms-permissions.html)
       * .
       */
      override fun sseAlgorithm(sseAlgorithm: String) {
        cdkBuilder.sseAlgorithm(sseAlgorithm)
      }

      public fun build():
          software.amazon.awscdk.services.s3tables.CfnTableBucket.EncryptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3tables.CfnTableBucket.EncryptionConfigurationProperty,
    ) : CdkObject(cdkObject),
        EncryptionConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the KMS key to use for encryption.
       *
       * This field is required only when `sseAlgorithm` is set to `aws:kms` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-tablebucket-encryptionconfiguration.html#cfn-s3tables-tablebucket-encryptionconfiguration-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      /**
       * The server-side encryption algorithm to use.
       *
       * Valid values are `AES256` for S3-managed encryption keys, or `aws:kms` for AWS KMS-managed
       * encryption keys. If you choose SSE-KMS encryption you must grant the S3 Tables maintenance
       * principal access to your KMS key. For more information, see [Permissions requirements for S3
       * Tables SSE-KMS
       * encryption](https://docs.aws.amazon.com//AmazonS3/latest/userguide/s3-tables-kms-permissions.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-tablebucket-encryptionconfiguration.html#cfn-s3tables-tablebucket-encryptionconfiguration-ssealgorithm)
       */
      override fun sseAlgorithm(): String? = unwrap(this).getSseAlgorithm()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnTableBucket.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.s3tables.CfnTableBucket.EncryptionConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3tables.CfnTableBucket.EncryptionConfigurationProperty
    }
  }

  /**
   * The unreferenced file removal settings for your table bucket.
   *
   * Unreferenced file removal identifies and deletes all objects that are not referenced by any
   * table snapshots. For more information, see the [*Amazon S3 User
   * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-table-buckets-maintenance.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.s3tables.*;
   * UnreferencedFileRemovalProperty unreferencedFileRemovalProperty =
   * UnreferencedFileRemovalProperty.builder()
   * .noncurrentDays(123)
   * .status("status")
   * .unreferencedDays(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-tablebucket-unreferencedfileremoval.html)
   */
  public interface UnreferencedFileRemovalProperty {
    /**
     * The number of days an object can be noncurrent before Amazon S3 deletes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-tablebucket-unreferencedfileremoval.html#cfn-s3tables-tablebucket-unreferencedfileremoval-noncurrentdays)
     */
    public fun noncurrentDays(): Number? = unwrap(this).getNoncurrentDays()

    /**
     * The status of the unreferenced file removal configuration for your table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-tablebucket-unreferencedfileremoval.html#cfn-s3tables-tablebucket-unreferencedfileremoval-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * The number of days an object must be unreferenced by your table before Amazon S3 marks the
     * object as noncurrent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-tablebucket-unreferencedfileremoval.html#cfn-s3tables-tablebucket-unreferencedfileremoval-unreferenceddays)
     */
    public fun unreferencedDays(): Number? = unwrap(this).getUnreferencedDays()

    /**
     * A builder for [UnreferencedFileRemovalProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param noncurrentDays The number of days an object can be noncurrent before Amazon S3
       * deletes it.
       */
      public fun noncurrentDays(noncurrentDays: Number)

      /**
       * @param status The status of the unreferenced file removal configuration for your table
       * bucket.
       */
      public fun status(status: String)

      /**
       * @param unreferencedDays The number of days an object must be unreferenced by your table
       * before Amazon S3 marks the object as noncurrent.
       */
      public fun unreferencedDays(unreferencedDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3tables.CfnTableBucket.UnreferencedFileRemovalProperty.Builder
          =
          software.amazon.awscdk.services.s3tables.CfnTableBucket.UnreferencedFileRemovalProperty.builder()

      /**
       * @param noncurrentDays The number of days an object can be noncurrent before Amazon S3
       * deletes it.
       */
      override fun noncurrentDays(noncurrentDays: Number) {
        cdkBuilder.noncurrentDays(noncurrentDays)
      }

      /**
       * @param status The status of the unreferenced file removal configuration for your table
       * bucket.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param unreferencedDays The number of days an object must be unreferenced by your table
       * before Amazon S3 marks the object as noncurrent.
       */
      override fun unreferencedDays(unreferencedDays: Number) {
        cdkBuilder.unreferencedDays(unreferencedDays)
      }

      public fun build():
          software.amazon.awscdk.services.s3tables.CfnTableBucket.UnreferencedFileRemovalProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.s3tables.CfnTableBucket.UnreferencedFileRemovalProperty,
    ) : CdkObject(cdkObject),
        UnreferencedFileRemovalProperty {
      /**
       * The number of days an object can be noncurrent before Amazon S3 deletes it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-tablebucket-unreferencedfileremoval.html#cfn-s3tables-tablebucket-unreferencedfileremoval-noncurrentdays)
       */
      override fun noncurrentDays(): Number? = unwrap(this).getNoncurrentDays()

      /**
       * The status of the unreferenced file removal configuration for your table bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-tablebucket-unreferencedfileremoval.html#cfn-s3tables-tablebucket-unreferencedfileremoval-status)
       */
      override fun status(): String? = unwrap(this).getStatus()

      /**
       * The number of days an object must be unreferenced by your table before Amazon S3 marks the
       * object as noncurrent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3tables-tablebucket-unreferencedfileremoval.html#cfn-s3tables-tablebucket-unreferencedfileremoval-unreferenceddays)
       */
      override fun unreferencedDays(): Number? = unwrap(this).getUnreferencedDays()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UnreferencedFileRemovalProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnTableBucket.UnreferencedFileRemovalProperty):
          UnreferencedFileRemovalProperty = CdkObjectWrappers.wrap(cdkObject) as?
          UnreferencedFileRemovalProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UnreferencedFileRemovalProperty):
          software.amazon.awscdk.services.s3tables.CfnTableBucket.UnreferencedFileRemovalProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3tables.CfnTableBucket.UnreferencedFileRemovalProperty
    }
  }
}
