@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3tables

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTableBucket`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3tables.*;
 * CfnTableBucketProps cfnTableBucketProps = CfnTableBucketProps.builder()
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
public interface CfnTableBucketProps {
  /**
   * Configuration specifying how data should be encrypted.
   *
   * This structure defines the encryption algorithm and optional KMS key to be used for server-side
   * encryption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-encryptionconfiguration)
   */
  public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  /**
   * The name for the table bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-tablebucketname)
   */
  public fun tableBucketName(): String

  /**
   * The unreferenced file removal settings for your table bucket.
   *
   * Unreferenced file removal identifies and deletes all objects that are not referenced by any
   * table snapshots. For more information, see the [*Amazon S3 User
   * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-table-buckets-maintenance.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-unreferencedfileremoval)
   */
  public fun unreferencedFileRemoval(): Any? = unwrap(this).getUnreferencedFileRemoval()

  /**
   * A builder for [CfnTableBucketProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encryptionConfiguration Configuration specifying how data should be encrypted.
     * This structure defines the encryption algorithm and optional KMS key to be used for
     * server-side encryption.
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * @param encryptionConfiguration Configuration specifying how data should be encrypted.
     * This structure defines the encryption algorithm and optional KMS key to be used for
     * server-side encryption.
     */
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnTableBucket.EncryptionConfigurationProperty)

    /**
     * @param encryptionConfiguration Configuration specifying how data should be encrypted.
     * This structure defines the encryption algorithm and optional KMS key to be used for
     * server-side encryption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8872c36183e3f51142ed020467ac33b734e4c5078883349d1845ad198000f2d")
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnTableBucket.EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tableBucketName The name for the table bucket. 
     */
    public fun tableBucketName(tableBucketName: String)

    /**
     * @param unreferencedFileRemoval The unreferenced file removal settings for your table bucket.
     * Unreferenced file removal identifies and deletes all objects that are not referenced by any
     * table snapshots. For more information, see the [*Amazon S3 User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-table-buckets-maintenance.html)
     * .
     */
    public fun unreferencedFileRemoval(unreferencedFileRemoval: IResolvable)

    /**
     * @param unreferencedFileRemoval The unreferenced file removal settings for your table bucket.
     * Unreferenced file removal identifies and deletes all objects that are not referenced by any
     * table snapshots. For more information, see the [*Amazon S3 User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-table-buckets-maintenance.html)
     * .
     */
    public
        fun unreferencedFileRemoval(unreferencedFileRemoval: CfnTableBucket.UnreferencedFileRemovalProperty)

    /**
     * @param unreferencedFileRemoval The unreferenced file removal settings for your table bucket.
     * Unreferenced file removal identifies and deletes all objects that are not referenced by any
     * table snapshots. For more information, see the [*Amazon S3 User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-table-buckets-maintenance.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("868decd12a49aa31338a0cc0eb30961fd2eb7f3ee4b193a1174baacef51fe893")
    public
        fun unreferencedFileRemoval(unreferencedFileRemoval: CfnTableBucket.UnreferencedFileRemovalProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3tables.CfnTableBucketProps.Builder =
        software.amazon.awscdk.services.s3tables.CfnTableBucketProps.builder()

    /**
     * @param encryptionConfiguration Configuration specifying how data should be encrypted.
     * This structure defines the encryption algorithm and optional KMS key to be used for
     * server-side encryption.
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param encryptionConfiguration Configuration specifying how data should be encrypted.
     * This structure defines the encryption algorithm and optional KMS key to be used for
     * server-side encryption.
     */
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnTableBucket.EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(CfnTableBucket.EncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param encryptionConfiguration Configuration specifying how data should be encrypted.
     * This structure defines the encryption algorithm and optional KMS key to be used for
     * server-side encryption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8872c36183e3f51142ed020467ac33b734e4c5078883349d1845ad198000f2d")
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnTableBucket.EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        encryptionConfiguration(CfnTableBucket.EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * @param tableBucketName The name for the table bucket. 
     */
    override fun tableBucketName(tableBucketName: String) {
      cdkBuilder.tableBucketName(tableBucketName)
    }

    /**
     * @param unreferencedFileRemoval The unreferenced file removal settings for your table bucket.
     * Unreferenced file removal identifies and deletes all objects that are not referenced by any
     * table snapshots. For more information, see the [*Amazon S3 User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-table-buckets-maintenance.html)
     * .
     */
    override fun unreferencedFileRemoval(unreferencedFileRemoval: IResolvable) {
      cdkBuilder.unreferencedFileRemoval(unreferencedFileRemoval.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param unreferencedFileRemoval The unreferenced file removal settings for your table bucket.
     * Unreferenced file removal identifies and deletes all objects that are not referenced by any
     * table snapshots. For more information, see the [*Amazon S3 User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-table-buckets-maintenance.html)
     * .
     */
    override
        fun unreferencedFileRemoval(unreferencedFileRemoval: CfnTableBucket.UnreferencedFileRemovalProperty) {
      cdkBuilder.unreferencedFileRemoval(unreferencedFileRemoval.let(CfnTableBucket.UnreferencedFileRemovalProperty.Companion::unwrap))
    }

    /**
     * @param unreferencedFileRemoval The unreferenced file removal settings for your table bucket.
     * Unreferenced file removal identifies and deletes all objects that are not referenced by any
     * table snapshots. For more information, see the [*Amazon S3 User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-table-buckets-maintenance.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("868decd12a49aa31338a0cc0eb30961fd2eb7f3ee4b193a1174baacef51fe893")
    override
        fun unreferencedFileRemoval(unreferencedFileRemoval: CfnTableBucket.UnreferencedFileRemovalProperty.Builder.() -> Unit):
        Unit =
        unreferencedFileRemoval(CfnTableBucket.UnreferencedFileRemovalProperty(unreferencedFileRemoval))

    public fun build(): software.amazon.awscdk.services.s3tables.CfnTableBucketProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3tables.CfnTableBucketProps,
  ) : CdkObject(cdkObject),
      CfnTableBucketProps {
    /**
     * Configuration specifying how data should be encrypted.
     *
     * This structure defines the encryption algorithm and optional KMS key to be used for
     * server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-encryptionconfiguration)
     */
    override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    /**
     * The name for the table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-tablebucketname)
     */
    override fun tableBucketName(): String = unwrap(this).getTableBucketName()

    /**
     * The unreferenced file removal settings for your table bucket.
     *
     * Unreferenced file removal identifies and deletes all objects that are not referenced by any
     * table snapshots. For more information, see the [*Amazon S3 User
     * Guide*](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-table-buckets-maintenance.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablebucket.html#cfn-s3tables-tablebucket-unreferencedfileremoval)
     */
    override fun unreferencedFileRemoval(): Any? = unwrap(this).getUnreferencedFileRemoval()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTableBucketProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnTableBucketProps):
        CfnTableBucketProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTableBucketProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTableBucketProps):
        software.amazon.awscdk.services.s3tables.CfnTableBucketProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3tables.CfnTableBucketProps
  }
}
