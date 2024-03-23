@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Sets the security configuration for a specified catalog.
 *
 * After the configuration has been set, the specified encryption is applied to every catalog write
 * thereafter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * CfnDataCatalogEncryptionSettings cfnDataCatalogEncryptionSettings =
 * CfnDataCatalogEncryptionSettings.Builder.create(this, "MyCfnDataCatalogEncryptionSettings")
 * .catalogId("catalogId")
 * .dataCatalogEncryptionSettings(DataCatalogEncryptionSettingsProperty.builder()
 * .connectionPasswordEncryption(ConnectionPasswordEncryptionProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .returnConnectionPasswordEncrypted(false)
 * .build())
 * .encryptionAtRest(EncryptionAtRestProperty.builder()
 * .catalogEncryptionMode("catalogEncryptionMode")
 * .catalogEncryptionServiceRole("catalogEncryptionServiceRole")
 * .sseAwsKmsKeyId("sseAwsKmsKeyId")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html)
 */
public open class CfnDataCatalogEncryptionSettings(
  cdkObject: software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataCatalogEncryptionSettingsProps,
  ) :
      this(software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDataCatalogEncryptionSettingsProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataCatalogEncryptionSettingsProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDataCatalogEncryptionSettingsProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ID of the Data Catalog in which the settings are created.
   */
  public open fun catalogId(): String = unwrap(this).getCatalogId()

  /**
   * The ID of the Data Catalog in which the settings are created.
   */
  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
  }

  /**
   * Contains configuration information for maintaining Data Catalog security.
   */
  public open fun dataCatalogEncryptionSettings(): Any =
      unwrap(this).getDataCatalogEncryptionSettings()

  /**
   * Contains configuration information for maintaining Data Catalog security.
   */
  public open fun dataCatalogEncryptionSettings(`value`: IResolvable) {
    unwrap(this).setDataCatalogEncryptionSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains configuration information for maintaining Data Catalog security.
   */
  public open fun dataCatalogEncryptionSettings(`value`: DataCatalogEncryptionSettingsProperty) {
    unwrap(this).setDataCatalogEncryptionSettings(`value`.let(DataCatalogEncryptionSettingsProperty::unwrap))
  }

  /**
   * Contains configuration information for maintaining Data Catalog security.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("856c1e654ef8c1a683d3e71f73a78187bb1fb5b3a4b37e7c1cabc833f6dc0705")
  public open
      fun dataCatalogEncryptionSettings(`value`: DataCatalogEncryptionSettingsProperty.Builder.() -> Unit):
      Unit = dataCatalogEncryptionSettings(DataCatalogEncryptionSettingsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnDataCatalogEncryptionSettings].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the Data Catalog in which the settings are created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-catalogid)
     * @param catalogId The ID of the Data Catalog in which the settings are created. 
     */
    public fun catalogId(catalogId: String)

    /**
     * Contains configuration information for maintaining Data Catalog security.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-datacatalogencryptionsettings)
     * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
     * Catalog security. 
     */
    public fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: IResolvable)

    /**
     * Contains configuration information for maintaining Data Catalog security.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-datacatalogencryptionsettings)
     * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
     * Catalog security. 
     */
    public
        fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: DataCatalogEncryptionSettingsProperty)

    /**
     * Contains configuration information for maintaining Data Catalog security.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-datacatalogencryptionsettings)
     * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
     * Catalog security. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75569b14742d1e1d1b732100581f6ec8f9e4012838a4e68540f214adce64afcb")
    public
        fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: DataCatalogEncryptionSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.Builder =
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.Builder.create(scope,
        id)

    /**
     * The ID of the Data Catalog in which the settings are created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-catalogid)
     * @param catalogId The ID of the Data Catalog in which the settings are created. 
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * Contains configuration information for maintaining Data Catalog security.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-datacatalogencryptionsettings)
     * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
     * Catalog security. 
     */
    override fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: IResolvable) {
      cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings.let(IResolvable::unwrap))
    }

    /**
     * Contains configuration information for maintaining Data Catalog security.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-datacatalogencryptionsettings)
     * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
     * Catalog security. 
     */
    override
        fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: DataCatalogEncryptionSettingsProperty) {
      cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings.let(DataCatalogEncryptionSettingsProperty::unwrap))
    }

    /**
     * Contains configuration information for maintaining Data Catalog security.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-datacatalogencryptionsettings)
     * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
     * Catalog security. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75569b14742d1e1d1b732100581f6ec8f9e4012838a4e68540f214adce64afcb")
    override
        fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: DataCatalogEncryptionSettingsProperty.Builder.() -> Unit):
        Unit =
        dataCatalogEncryptionSettings(DataCatalogEncryptionSettingsProperty(dataCatalogEncryptionSettings))

    public fun build(): software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataCatalogEncryptionSettings {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataCatalogEncryptionSettings(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings):
        CfnDataCatalogEncryptionSettings = CfnDataCatalogEncryptionSettings(cdkObject)

    internal fun unwrap(wrapped: CfnDataCatalogEncryptionSettings):
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings = wrapped.cdkObject as
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings
  }

  /**
   * The data structure used by the Data Catalog to encrypt the password as part of
   * `CreateConnection` or `UpdateConnection` and store it in the `ENCRYPTED_PASSWORD` field in the
   * connection properties.
   *
   * You can enable catalog encryption or only password encryption.
   *
   * When a `CreationConnection` request arrives containing a password, the Data Catalog first
   * encrypts the password using your AWS KMS key. It then encrypts the whole connection object again
   * if catalog encryption is also enabled.
   *
   * This encryption requires that you set AWS KMS key permissions to enable or restrict access on
   * the password key according to your security requirements. For example, you might want only
   * administrators to have decrypt permission on the password key.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * ConnectionPasswordEncryptionProperty connectionPasswordEncryptionProperty =
   * ConnectionPasswordEncryptionProperty.builder()
   * .kmsKeyId("kmsKeyId")
   * .returnConnectionPasswordEncrypted(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html)
   */
  public interface ConnectionPasswordEncryptionProperty {
    /**
     * An AWS KMS key that is used to encrypt the connection password.
     *
     * If connection password protection is enabled, the caller of `CreateConnection` and
     * `UpdateConnection` needs at least `kms:Encrypt` permission on the specified AWS KMS key, to
     * encrypt passwords before storing them in the Data Catalog. You can set the decrypt permission to
     * enable or restrict access on the password key according to your security requirements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html#cfn-glue-datacatalogencryptionsettings-connectionpasswordencryption-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * When the `ReturnConnectionPasswordEncrypted` flag is set to "true", passwords remain
     * encrypted in the responses of `GetConnection` and `GetConnections` .
     *
     * This encryption takes effect independently from catalog encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html#cfn-glue-datacatalogencryptionsettings-connectionpasswordencryption-returnconnectionpasswordencrypted)
     */
    public fun returnConnectionPasswordEncrypted(): Any? =
        unwrap(this).getReturnConnectionPasswordEncrypted()

    /**
     * A builder for [ConnectionPasswordEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId An AWS KMS key that is used to encrypt the connection password.
       * If connection password protection is enabled, the caller of `CreateConnection` and
       * `UpdateConnection` needs at least `kms:Encrypt` permission on the specified AWS KMS key, to
       * encrypt passwords before storing them in the Data Catalog. You can set the decrypt permission
       * to enable or restrict access on the password key according to your security requirements.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param returnConnectionPasswordEncrypted When the `ReturnConnectionPasswordEncrypted` flag
       * is set to "true", passwords remain encrypted in the responses of `GetConnection` and
       * `GetConnections` .
       * This encryption takes effect independently from catalog encryption.
       */
      public fun returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted: Boolean)

      /**
       * @param returnConnectionPasswordEncrypted When the `ReturnConnectionPasswordEncrypted` flag
       * is set to "true", passwords remain encrypted in the responses of `GetConnection` and
       * `GetConnections` .
       * This encryption takes effect independently from catalog encryption.
       */
      public fun returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty.builder()

      /**
       * @param kmsKeyId An AWS KMS key that is used to encrypt the connection password.
       * If connection password protection is enabled, the caller of `CreateConnection` and
       * `UpdateConnection` needs at least `kms:Encrypt` permission on the specified AWS KMS key, to
       * encrypt passwords before storing them in the Data Catalog. You can set the decrypt permission
       * to enable or restrict access on the password key according to your security requirements.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param returnConnectionPasswordEncrypted When the `ReturnConnectionPasswordEncrypted` flag
       * is set to "true", passwords remain encrypted in the responses of `GetConnection` and
       * `GetConnections` .
       * This encryption takes effect independently from catalog encryption.
       */
      override fun returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted: Boolean) {
        cdkBuilder.returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted)
      }

      /**
       * @param returnConnectionPasswordEncrypted When the `ReturnConnectionPasswordEncrypted` flag
       * is set to "true", passwords remain encrypted in the responses of `GetConnection` and
       * `GetConnections` .
       * This encryption takes effect independently from catalog encryption.
       */
      override
          fun returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted: IResolvable) {
        cdkBuilder.returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty,
    ) : CdkObject(cdkObject), ConnectionPasswordEncryptionProperty {
      /**
       * An AWS KMS key that is used to encrypt the connection password.
       *
       * If connection password protection is enabled, the caller of `CreateConnection` and
       * `UpdateConnection` needs at least `kms:Encrypt` permission on the specified AWS KMS key, to
       * encrypt passwords before storing them in the Data Catalog. You can set the decrypt permission
       * to enable or restrict access on the password key according to your security requirements.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html#cfn-glue-datacatalogencryptionsettings-connectionpasswordencryption-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * When the `ReturnConnectionPasswordEncrypted` flag is set to "true", passwords remain
       * encrypted in the responses of `GetConnection` and `GetConnections` .
       *
       * This encryption takes effect independently from catalog encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html#cfn-glue-datacatalogencryptionsettings-connectionpasswordencryption-returnconnectionpasswordencrypted)
       */
      override fun returnConnectionPasswordEncrypted(): Any? =
          unwrap(this).getReturnConnectionPasswordEncrypted()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectionPasswordEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty):
          ConnectionPasswordEncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConnectionPasswordEncryptionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionPasswordEncryptionProperty):
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty
    }
  }

  /**
   * Contains configuration information for maintaining Data Catalog security.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * DataCatalogEncryptionSettingsProperty dataCatalogEncryptionSettingsProperty =
   * DataCatalogEncryptionSettingsProperty.builder()
   * .connectionPasswordEncryption(ConnectionPasswordEncryptionProperty.builder()
   * .kmsKeyId("kmsKeyId")
   * .returnConnectionPasswordEncrypted(false)
   * .build())
   * .encryptionAtRest(EncryptionAtRestProperty.builder()
   * .catalogEncryptionMode("catalogEncryptionMode")
   * .catalogEncryptionServiceRole("catalogEncryptionServiceRole")
   * .sseAwsKmsKeyId("sseAwsKmsKeyId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-datacatalogencryptionsettings.html)
   */
  public interface DataCatalogEncryptionSettingsProperty {
    /**
     * When connection password protection is enabled, the Data Catalog uses a customer-provided key
     * to encrypt the password as part of `CreateConnection` or `UpdateConnection` and store it in the
     * `ENCRYPTED_PASSWORD` field in the connection properties.
     *
     * You can enable catalog encryption or only password encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-datacatalogencryptionsettings-connectionpasswordencryption)
     */
    public fun connectionPasswordEncryption(): Any? = unwrap(this).getConnectionPasswordEncryption()

    /**
     * Specifies the encryption-at-rest configuration for the Data Catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-datacatalogencryptionsettings-encryptionatrest)
     */
    public fun encryptionAtRest(): Any? = unwrap(this).getEncryptionAtRest()

    /**
     * A builder for [DataCatalogEncryptionSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectionPasswordEncryption When connection password protection is enabled, the
       * Data Catalog uses a customer-provided key to encrypt the password as part of
       * `CreateConnection` or `UpdateConnection` and store it in the `ENCRYPTED_PASSWORD` field in the
       * connection properties.
       * You can enable catalog encryption or only password encryption.
       */
      public fun connectionPasswordEncryption(connectionPasswordEncryption: IResolvable)

      /**
       * @param connectionPasswordEncryption When connection password protection is enabled, the
       * Data Catalog uses a customer-provided key to encrypt the password as part of
       * `CreateConnection` or `UpdateConnection` and store it in the `ENCRYPTED_PASSWORD` field in the
       * connection properties.
       * You can enable catalog encryption or only password encryption.
       */
      public
          fun connectionPasswordEncryption(connectionPasswordEncryption: ConnectionPasswordEncryptionProperty)

      /**
       * @param connectionPasswordEncryption When connection password protection is enabled, the
       * Data Catalog uses a customer-provided key to encrypt the password as part of
       * `CreateConnection` or `UpdateConnection` and store it in the `ENCRYPTED_PASSWORD` field in the
       * connection properties.
       * You can enable catalog encryption or only password encryption.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("535a09664a45134d196d3b8cba6b76e0a3757801bcfba8d545727477b5a1c078")
      public
          fun connectionPasswordEncryption(connectionPasswordEncryption: ConnectionPasswordEncryptionProperty.Builder.() -> Unit)

      /**
       * @param encryptionAtRest Specifies the encryption-at-rest configuration for the Data
       * Catalog.
       */
      public fun encryptionAtRest(encryptionAtRest: IResolvable)

      /**
       * @param encryptionAtRest Specifies the encryption-at-rest configuration for the Data
       * Catalog.
       */
      public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty)

      /**
       * @param encryptionAtRest Specifies the encryption-at-rest configuration for the Data
       * Catalog.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfa85bce49148dde4e4efc40ffa3cc4e75ade4f3ca43e59141b5771fa98d3644")
      public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.builder()

      /**
       * @param connectionPasswordEncryption When connection password protection is enabled, the
       * Data Catalog uses a customer-provided key to encrypt the password as part of
       * `CreateConnection` or `UpdateConnection` and store it in the `ENCRYPTED_PASSWORD` field in the
       * connection properties.
       * You can enable catalog encryption or only password encryption.
       */
      override fun connectionPasswordEncryption(connectionPasswordEncryption: IResolvable) {
        cdkBuilder.connectionPasswordEncryption(connectionPasswordEncryption.let(IResolvable::unwrap))
      }

      /**
       * @param connectionPasswordEncryption When connection password protection is enabled, the
       * Data Catalog uses a customer-provided key to encrypt the password as part of
       * `CreateConnection` or `UpdateConnection` and store it in the `ENCRYPTED_PASSWORD` field in the
       * connection properties.
       * You can enable catalog encryption or only password encryption.
       */
      override
          fun connectionPasswordEncryption(connectionPasswordEncryption: ConnectionPasswordEncryptionProperty) {
        cdkBuilder.connectionPasswordEncryption(connectionPasswordEncryption.let(ConnectionPasswordEncryptionProperty::unwrap))
      }

      /**
       * @param connectionPasswordEncryption When connection password protection is enabled, the
       * Data Catalog uses a customer-provided key to encrypt the password as part of
       * `CreateConnection` or `UpdateConnection` and store it in the `ENCRYPTED_PASSWORD` field in the
       * connection properties.
       * You can enable catalog encryption or only password encryption.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("535a09664a45134d196d3b8cba6b76e0a3757801bcfba8d545727477b5a1c078")
      override
          fun connectionPasswordEncryption(connectionPasswordEncryption: ConnectionPasswordEncryptionProperty.Builder.() -> Unit):
          Unit =
          connectionPasswordEncryption(ConnectionPasswordEncryptionProperty(connectionPasswordEncryption))

      /**
       * @param encryptionAtRest Specifies the encryption-at-rest configuration for the Data
       * Catalog.
       */
      override fun encryptionAtRest(encryptionAtRest: IResolvable) {
        cdkBuilder.encryptionAtRest(encryptionAtRest.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionAtRest Specifies the encryption-at-rest configuration for the Data
       * Catalog.
       */
      override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty) {
        cdkBuilder.encryptionAtRest(encryptionAtRest.let(EncryptionAtRestProperty::unwrap))
      }

      /**
       * @param encryptionAtRest Specifies the encryption-at-rest configuration for the Data
       * Catalog.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfa85bce49148dde4e4efc40ffa3cc4e75ade4f3ca43e59141b5771fa98d3644")
      override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty.Builder.() -> Unit):
          Unit = encryptionAtRest(EncryptionAtRestProperty(encryptionAtRest))

      public fun build():
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty,
    ) : CdkObject(cdkObject), DataCatalogEncryptionSettingsProperty {
      /**
       * When connection password protection is enabled, the Data Catalog uses a customer-provided
       * key to encrypt the password as part of `CreateConnection` or `UpdateConnection` and store it
       * in the `ENCRYPTED_PASSWORD` field in the connection properties.
       *
       * You can enable catalog encryption or only password encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-datacatalogencryptionsettings-connectionpasswordencryption)
       */
      override fun connectionPasswordEncryption(): Any? =
          unwrap(this).getConnectionPasswordEncryption()

      /**
       * Specifies the encryption-at-rest configuration for the Data Catalog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-datacatalogencryptionsettings-encryptionatrest)
       */
      override fun encryptionAtRest(): Any? = unwrap(this).getEncryptionAtRest()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataCatalogEncryptionSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty):
          DataCatalogEncryptionSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataCatalogEncryptionSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataCatalogEncryptionSettingsProperty):
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty
    }
  }

  /**
   * Specifies the encryption-at-rest configuration for the Data Catalog.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * EncryptionAtRestProperty encryptionAtRestProperty = EncryptionAtRestProperty.builder()
   * .catalogEncryptionMode("catalogEncryptionMode")
   * .catalogEncryptionServiceRole("catalogEncryptionServiceRole")
   * .sseAwsKmsKeyId("sseAwsKmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html)
   */
  public interface EncryptionAtRestProperty {
    /**
     * The encryption-at-rest mode for encrypting Data Catalog data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html#cfn-glue-datacatalogencryptionsettings-encryptionatrest-catalogencryptionmode)
     */
    public fun catalogEncryptionMode(): String? = unwrap(this).getCatalogEncryptionMode()

    /**
     * The role that AWS Glue assumes to encrypt and decrypt the Data Catalog objects on the
     * caller's behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html#cfn-glue-datacatalogencryptionsettings-encryptionatrest-catalogencryptionservicerole)
     */
    public fun catalogEncryptionServiceRole(): String? =
        unwrap(this).getCatalogEncryptionServiceRole()

    /**
     * The ID of the AWS KMS key to use for encryption at rest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html#cfn-glue-datacatalogencryptionsettings-encryptionatrest-sseawskmskeyid)
     */
    public fun sseAwsKmsKeyId(): String? = unwrap(this).getSseAwsKmsKeyId()

    /**
     * A builder for [EncryptionAtRestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogEncryptionMode The encryption-at-rest mode for encrypting Data Catalog data.
       */
      public fun catalogEncryptionMode(catalogEncryptionMode: String)

      /**
       * @param catalogEncryptionServiceRole The role that AWS Glue assumes to encrypt and decrypt
       * the Data Catalog objects on the caller's behalf.
       */
      public fun catalogEncryptionServiceRole(catalogEncryptionServiceRole: String)

      /**
       * @param sseAwsKmsKeyId The ID of the AWS KMS key to use for encryption at rest.
       */
      public fun sseAwsKmsKeyId(sseAwsKmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty.builder()

      /**
       * @param catalogEncryptionMode The encryption-at-rest mode for encrypting Data Catalog data.
       */
      override fun catalogEncryptionMode(catalogEncryptionMode: String) {
        cdkBuilder.catalogEncryptionMode(catalogEncryptionMode)
      }

      /**
       * @param catalogEncryptionServiceRole The role that AWS Glue assumes to encrypt and decrypt
       * the Data Catalog objects on the caller's behalf.
       */
      override fun catalogEncryptionServiceRole(catalogEncryptionServiceRole: String) {
        cdkBuilder.catalogEncryptionServiceRole(catalogEncryptionServiceRole)
      }

      /**
       * @param sseAwsKmsKeyId The ID of the AWS KMS key to use for encryption at rest.
       */
      override fun sseAwsKmsKeyId(sseAwsKmsKeyId: String) {
        cdkBuilder.sseAwsKmsKeyId(sseAwsKmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty,
    ) : CdkObject(cdkObject), EncryptionAtRestProperty {
      /**
       * The encryption-at-rest mode for encrypting Data Catalog data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html#cfn-glue-datacatalogencryptionsettings-encryptionatrest-catalogencryptionmode)
       */
      override fun catalogEncryptionMode(): String? = unwrap(this).getCatalogEncryptionMode()

      /**
       * The role that AWS Glue assumes to encrypt and decrypt the Data Catalog objects on the
       * caller's behalf.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html#cfn-glue-datacatalogencryptionsettings-encryptionatrest-catalogencryptionservicerole)
       */
      override fun catalogEncryptionServiceRole(): String? =
          unwrap(this).getCatalogEncryptionServiceRole()

      /**
       * The ID of the AWS KMS key to use for encryption at rest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html#cfn-glue-datacatalogencryptionsettings-encryptionatrest-sseawskmskeyid)
       */
      override fun sseAwsKmsKeyId(): String? = unwrap(this).getSseAwsKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionAtRestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty):
          EncryptionAtRestProperty = CdkObjectWrappers.wrap(cdkObject) as? EncryptionAtRestProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionAtRestProperty):
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty
    }
  }
}
