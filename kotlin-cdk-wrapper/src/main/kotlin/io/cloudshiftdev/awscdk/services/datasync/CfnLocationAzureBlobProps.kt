@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLocationAzureBlob`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationAzureBlobProps cfnLocationAzureBlobProps = CfnLocationAzureBlobProps.builder()
 * .azureBlobAuthenticationType("azureBlobAuthenticationType")
 * // the properties below are optional
 * .agentArns(List.of("agentArns"))
 * .azureAccessTier("azureAccessTier")
 * .azureBlobContainerUrl("azureBlobContainerUrl")
 * .azureBlobSasConfiguration(AzureBlobSasConfigurationProperty.builder()
 * .azureBlobSasToken("azureBlobSasToken")
 * .build())
 * .azureBlobType("azureBlobType")
 * .cmkSecretConfig(CmkSecretConfigProperty.builder()
 * .kmsKeyArn("kmsKeyArn")
 * .secretArn("secretArn")
 * .build())
 * .customSecretConfig(CustomSecretConfigProperty.builder()
 * .secretAccessRoleArn("secretAccessRoleArn")
 * .secretArn("secretArn")
 * .build())
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html)
 */
public interface CfnLocationAzureBlobProps {
  /**
   * (Optional) Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect with
   * your Azure Blob Storage container.
   *
   * If you are setting up an agentless cross-cloud transfer, you do not need to specify a value for
   * this parameter.
   *
   * You can specify more than one agent. For more information, see [Using multiple agents for your
   * transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
   *
   *
   * Make sure you configure this parameter correctly when you first create your storage location.
   * You cannot add or remove agents from a storage location after you create it.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-agentarns)
   */
  public fun agentArns(): List<String> = unwrap(this).getAgentArns() ?: emptyList()

  /**
   * Specifies the access tier that you want your objects or files transferred into.
   *
   * This only applies when using the location as a transfer destination. For more information, see
   * [Access
   * tiers](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers)
   * .
   *
   * Default: - "HOT"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureaccesstier)
   */
  public fun azureAccessTier(): String? = unwrap(this).getAzureAccessTier()

  /**
   * Specifies the authentication method DataSync uses to access your Azure Blob Storage.
   *
   * DataSync can access blob storage using a shared access signature (SAS).
   *
   * Default: - "SAS"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobauthenticationtype)
   */
  public fun azureBlobAuthenticationType(): String

  /**
   * Specifies the URL of the Azure Blob Storage container involved in your transfer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobcontainerurl)
   */
  public fun azureBlobContainerUrl(): String? = unwrap(this).getAzureBlobContainerUrl()

  /**
   * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
   *
   *
   * If you provide an authentication token using `SasConfiguration` , but do not provide secret
   * configuration details using `CmkSecretConfig` or `CustomSecretConfig` , then DataSync stores the
   * token using your AWS account's secrets manager secret.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobsasconfiguration)
   */
  public fun azureBlobSasConfiguration(): Any? = unwrap(this).getAzureBlobSasConfiguration()

  /**
   * Specifies the type of blob that you want your objects or files to be when transferring them
   * into Azure Blob Storage.
   *
   * Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For more
   * information on blob types, see the [Azure Blob Storage
   * documentation](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs)
   * .
   *
   * Default: - "BLOCK"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobtype)
   */
  public fun azureBlobType(): String? = unwrap(this).getAzureBlobType()

  /**
   * Specifies configuration information for a DataSync-managed secret, such as an authentication
   * token or secret key that DataSync uses to access a specific storage location, with a
   * customer-managed AWS KMS key .
   *
   *
   * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
   * `CreateLocation` request. Do not provide both parameters for the same request.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-cmksecretconfig)
   */
  public fun cmkSecretConfig(): Any? = unwrap(this).getCmkSecretConfig()

  /**
   * Specifies configuration information for a customer-managed Secrets Manager secret where a
   * storage location authentication token or secret key is stored in plain text.
   *
   * This configuration includes the secret ARN, and the ARN for an IAM role that provides access to
   * the secret.
   *
   *
   * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
   * `CreateLocation` request. Do not provide both parameters for the same request.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-customsecretconfig)
   */
  public fun customSecretConfig(): Any? = unwrap(this).getCustomSecretConfig()

  /**
   * Specifies path segments if you want to limit your transfer to a virtual directory in your
   * container (for example, `/my/images` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-subdirectory)
   */
  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   *
   * We recommend creating at least a name tag for your transfer location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLocationAzureBlobProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param agentArns (Optional) Specifies the Amazon Resource Name (ARN) of the DataSync agent
     * that can connect with your Azure Blob Storage container.
     * If you are setting up an agentless cross-cloud transfer, you do not need to specify a value
     * for this parameter.
     *
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     *
     *
     * Make sure you configure this parameter correctly when you first create your storage location.
     * You cannot add or remove agents from a storage location after you create it.
     */
    public fun agentArns(agentArns: List<String>)

    /**
     * @param agentArns (Optional) Specifies the Amazon Resource Name (ARN) of the DataSync agent
     * that can connect with your Azure Blob Storage container.
     * If you are setting up an agentless cross-cloud transfer, you do not need to specify a value
     * for this parameter.
     *
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     *
     *
     * Make sure you configure this parameter correctly when you first create your storage location.
     * You cannot add or remove agents from a storage location after you create it.
     */
    public fun agentArns(vararg agentArns: String)

    /**
     * @param azureAccessTier Specifies the access tier that you want your objects or files
     * transferred into.
     * This only applies when using the location as a transfer destination. For more information,
     * see [Access
     * tiers](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers)
     * .
     */
    public fun azureAccessTier(azureAccessTier: String)

    /**
     * @param azureBlobAuthenticationType Specifies the authentication method DataSync uses to
     * access your Azure Blob Storage. 
     * DataSync can access blob storage using a shared access signature (SAS).
     */
    public fun azureBlobAuthenticationType(azureBlobAuthenticationType: String)

    /**
     * @param azureBlobContainerUrl Specifies the URL of the Azure Blob Storage container involved
     * in your transfer.
     */
    public fun azureBlobContainerUrl(azureBlobContainerUrl: String)

    /**
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage.
     *
     * If you provide an authentication token using `SasConfiguration` , but do not provide secret
     * configuration details using `CmkSecretConfig` or `CustomSecretConfig` , then DataSync stores the
     * token using your AWS account's secrets manager secret.
     */
    public fun azureBlobSasConfiguration(azureBlobSasConfiguration: IResolvable)

    /**
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage.
     *
     * If you provide an authentication token using `SasConfiguration` , but do not provide secret
     * configuration details using `CmkSecretConfig` or `CustomSecretConfig` , then DataSync stores the
     * token using your AWS account's secrets manager secret.
     */
    public
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: CfnLocationAzureBlob.AzureBlobSasConfigurationProperty)

    /**
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage.
     *
     * If you provide an authentication token using `SasConfiguration` , but do not provide secret
     * configuration details using `CmkSecretConfig` or `CustomSecretConfig` , then DataSync stores the
     * token using your AWS account's secrets manager secret.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("958492692d815b712459c1d6eef3188c06fd817e7363d0989e04f6aff912233d")
    public
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: CfnLocationAzureBlob.AzureBlobSasConfigurationProperty.Builder.() -> Unit)

    /**
     * @param azureBlobType Specifies the type of blob that you want your objects or files to be
     * when transferring them into Azure Blob Storage.
     * Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For
     * more information on blob types, see the [Azure Blob Storage
     * documentation](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs)
     * .
     */
    public fun azureBlobType(azureBlobType: String)

    /**
     * @param cmkSecretConfig Specifies configuration information for a DataSync-managed secret,
     * such as an authentication token or secret key that DataSync uses to access a specific storage
     * location, with a customer-managed AWS KMS key .
     *
     * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
     * `CreateLocation` request. Do not provide both parameters for the same request.
     */
    public fun cmkSecretConfig(cmkSecretConfig: IResolvable)

    /**
     * @param cmkSecretConfig Specifies configuration information for a DataSync-managed secret,
     * such as an authentication token or secret key that DataSync uses to access a specific storage
     * location, with a customer-managed AWS KMS key .
     *
     * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
     * `CreateLocation` request. Do not provide both parameters for the same request.
     */
    public fun cmkSecretConfig(cmkSecretConfig: CfnLocationAzureBlob.CmkSecretConfigProperty)

    /**
     * @param cmkSecretConfig Specifies configuration information for a DataSync-managed secret,
     * such as an authentication token or secret key that DataSync uses to access a specific storage
     * location, with a customer-managed AWS KMS key .
     *
     * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
     * `CreateLocation` request. Do not provide both parameters for the same request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cf3d0726ef867e0d4344149ae633091d13b4a08ad199df8508a08c2c186c696")
    public
        fun cmkSecretConfig(cmkSecretConfig: CfnLocationAzureBlob.CmkSecretConfigProperty.Builder.() -> Unit)

    /**
     * @param customSecretConfig Specifies configuration information for a customer-managed Secrets
     * Manager secret where a storage location authentication token or secret key is stored in plain
     * text.
     * This configuration includes the secret ARN, and the ARN for an IAM role that provides access
     * to the secret.
     *
     *
     * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
     * `CreateLocation` request. Do not provide both parameters for the same request.
     */
    public fun customSecretConfig(customSecretConfig: IResolvable)

    /**
     * @param customSecretConfig Specifies configuration information for a customer-managed Secrets
     * Manager secret where a storage location authentication token or secret key is stored in plain
     * text.
     * This configuration includes the secret ARN, and the ARN for an IAM role that provides access
     * to the secret.
     *
     *
     * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
     * `CreateLocation` request. Do not provide both parameters for the same request.
     */
    public
        fun customSecretConfig(customSecretConfig: CfnLocationAzureBlob.CustomSecretConfigProperty)

    /**
     * @param customSecretConfig Specifies configuration information for a customer-managed Secrets
     * Manager secret where a storage location authentication token or secret key is stored in plain
     * text.
     * This configuration includes the secret ARN, and the ARN for an IAM role that provides access
     * to the secret.
     *
     *
     * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
     * `CreateLocation` request. Do not provide both parameters for the same request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63d7dbeb3d34b3ad45b42f5d3789d7e8f1c10294eecef2b8b104b4ec4ca0a1b6")
    public
        fun customSecretConfig(customSecretConfig: CfnLocationAzureBlob.CustomSecretConfigProperty.Builder.() -> Unit)

    /**
     * @param subdirectory Specifies path segments if you want to limit your transfer to a virtual
     * directory in your container (for example, `/my/images` ).
     */
    public fun subdirectory(subdirectory: String)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your transfer location.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your transfer location.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps.builder()

    /**
     * @param agentArns (Optional) Specifies the Amazon Resource Name (ARN) of the DataSync agent
     * that can connect with your Azure Blob Storage container.
     * If you are setting up an agentless cross-cloud transfer, you do not need to specify a value
     * for this parameter.
     *
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     *
     *
     * Make sure you configure this parameter correctly when you first create your storage location.
     * You cannot add or remove agents from a storage location after you create it.
     */
    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    /**
     * @param agentArns (Optional) Specifies the Amazon Resource Name (ARN) of the DataSync agent
     * that can connect with your Azure Blob Storage container.
     * If you are setting up an agentless cross-cloud transfer, you do not need to specify a value
     * for this parameter.
     *
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     *
     *
     * Make sure you configure this parameter correctly when you first create your storage location.
     * You cannot add or remove agents from a storage location after you create it.
     */
    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    /**
     * @param azureAccessTier Specifies the access tier that you want your objects or files
     * transferred into.
     * This only applies when using the location as a transfer destination. For more information,
     * see [Access
     * tiers](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers)
     * .
     */
    override fun azureAccessTier(azureAccessTier: String) {
      cdkBuilder.azureAccessTier(azureAccessTier)
    }

    /**
     * @param azureBlobAuthenticationType Specifies the authentication method DataSync uses to
     * access your Azure Blob Storage. 
     * DataSync can access blob storage using a shared access signature (SAS).
     */
    override fun azureBlobAuthenticationType(azureBlobAuthenticationType: String) {
      cdkBuilder.azureBlobAuthenticationType(azureBlobAuthenticationType)
    }

    /**
     * @param azureBlobContainerUrl Specifies the URL of the Azure Blob Storage container involved
     * in your transfer.
     */
    override fun azureBlobContainerUrl(azureBlobContainerUrl: String) {
      cdkBuilder.azureBlobContainerUrl(azureBlobContainerUrl)
    }

    /**
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage.
     *
     * If you provide an authentication token using `SasConfiguration` , but do not provide secret
     * configuration details using `CmkSecretConfig` or `CustomSecretConfig` , then DataSync stores the
     * token using your AWS account's secrets manager secret.
     */
    override fun azureBlobSasConfiguration(azureBlobSasConfiguration: IResolvable) {
      cdkBuilder.azureBlobSasConfiguration(azureBlobSasConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage.
     *
     * If you provide an authentication token using `SasConfiguration` , but do not provide secret
     * configuration details using `CmkSecretConfig` or `CustomSecretConfig` , then DataSync stores the
     * token using your AWS account's secrets manager secret.
     */
    override
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: CfnLocationAzureBlob.AzureBlobSasConfigurationProperty) {
      cdkBuilder.azureBlobSasConfiguration(azureBlobSasConfiguration.let(CfnLocationAzureBlob.AzureBlobSasConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param azureBlobSasConfiguration Specifies the SAS configuration that allows DataSync to
     * access your Azure Blob Storage.
     *
     * If you provide an authentication token using `SasConfiguration` , but do not provide secret
     * configuration details using `CmkSecretConfig` or `CustomSecretConfig` , then DataSync stores the
     * token using your AWS account's secrets manager secret.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("958492692d815b712459c1d6eef3188c06fd817e7363d0989e04f6aff912233d")
    override
        fun azureBlobSasConfiguration(azureBlobSasConfiguration: CfnLocationAzureBlob.AzureBlobSasConfigurationProperty.Builder.() -> Unit):
        Unit =
        azureBlobSasConfiguration(CfnLocationAzureBlob.AzureBlobSasConfigurationProperty(azureBlobSasConfiguration))

    /**
     * @param azureBlobType Specifies the type of blob that you want your objects or files to be
     * when transferring them into Azure Blob Storage.
     * Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For
     * more information on blob types, see the [Azure Blob Storage
     * documentation](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs)
     * .
     */
    override fun azureBlobType(azureBlobType: String) {
      cdkBuilder.azureBlobType(azureBlobType)
    }

    /**
     * @param cmkSecretConfig Specifies configuration information for a DataSync-managed secret,
     * such as an authentication token or secret key that DataSync uses to access a specific storage
     * location, with a customer-managed AWS KMS key .
     *
     * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
     * `CreateLocation` request. Do not provide both parameters for the same request.
     */
    override fun cmkSecretConfig(cmkSecretConfig: IResolvable) {
      cdkBuilder.cmkSecretConfig(cmkSecretConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param cmkSecretConfig Specifies configuration information for a DataSync-managed secret,
     * such as an authentication token or secret key that DataSync uses to access a specific storage
     * location, with a customer-managed AWS KMS key .
     *
     * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
     * `CreateLocation` request. Do not provide both parameters for the same request.
     */
    override fun cmkSecretConfig(cmkSecretConfig: CfnLocationAzureBlob.CmkSecretConfigProperty) {
      cdkBuilder.cmkSecretConfig(cmkSecretConfig.let(CfnLocationAzureBlob.CmkSecretConfigProperty.Companion::unwrap))
    }

    /**
     * @param cmkSecretConfig Specifies configuration information for a DataSync-managed secret,
     * such as an authentication token or secret key that DataSync uses to access a specific storage
     * location, with a customer-managed AWS KMS key .
     *
     * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
     * `CreateLocation` request. Do not provide both parameters for the same request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cf3d0726ef867e0d4344149ae633091d13b4a08ad199df8508a08c2c186c696")
    override
        fun cmkSecretConfig(cmkSecretConfig: CfnLocationAzureBlob.CmkSecretConfigProperty.Builder.() -> Unit):
        Unit = cmkSecretConfig(CfnLocationAzureBlob.CmkSecretConfigProperty(cmkSecretConfig))

    /**
     * @param customSecretConfig Specifies configuration information for a customer-managed Secrets
     * Manager secret where a storage location authentication token or secret key is stored in plain
     * text.
     * This configuration includes the secret ARN, and the ARN for an IAM role that provides access
     * to the secret.
     *
     *
     * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
     * `CreateLocation` request. Do not provide both parameters for the same request.
     */
    override fun customSecretConfig(customSecretConfig: IResolvable) {
      cdkBuilder.customSecretConfig(customSecretConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customSecretConfig Specifies configuration information for a customer-managed Secrets
     * Manager secret where a storage location authentication token or secret key is stored in plain
     * text.
     * This configuration includes the secret ARN, and the ARN for an IAM role that provides access
     * to the secret.
     *
     *
     * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
     * `CreateLocation` request. Do not provide both parameters for the same request.
     */
    override
        fun customSecretConfig(customSecretConfig: CfnLocationAzureBlob.CustomSecretConfigProperty) {
      cdkBuilder.customSecretConfig(customSecretConfig.let(CfnLocationAzureBlob.CustomSecretConfigProperty.Companion::unwrap))
    }

    /**
     * @param customSecretConfig Specifies configuration information for a customer-managed Secrets
     * Manager secret where a storage location authentication token or secret key is stored in plain
     * text.
     * This configuration includes the secret ARN, and the ARN for an IAM role that provides access
     * to the secret.
     *
     *
     * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
     * `CreateLocation` request. Do not provide both parameters for the same request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63d7dbeb3d34b3ad45b42f5d3789d7e8f1c10294eecef2b8b104b4ec4ca0a1b6")
    override
        fun customSecretConfig(customSecretConfig: CfnLocationAzureBlob.CustomSecretConfigProperty.Builder.() -> Unit):
        Unit =
        customSecretConfig(CfnLocationAzureBlob.CustomSecretConfigProperty(customSecretConfig))

    /**
     * @param subdirectory Specifies path segments if you want to limit your transfer to a virtual
     * directory in your container (for example, `/my/images` ).
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your transfer location.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your transfer location.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps,
  ) : CdkObject(cdkObject),
      CfnLocationAzureBlobProps {
    /**
     * (Optional) Specifies the Amazon Resource Name (ARN) of the DataSync agent that can connect
     * with your Azure Blob Storage container.
     *
     * If you are setting up an agentless cross-cloud transfer, you do not need to specify a value
     * for this parameter.
     *
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * your transfer](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     *
     *
     * Make sure you configure this parameter correctly when you first create your storage location.
     * You cannot add or remove agents from a storage location after you create it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-agentarns)
     */
    override fun agentArns(): List<String> = unwrap(this).getAgentArns() ?: emptyList()

    /**
     * Specifies the access tier that you want your objects or files transferred into.
     *
     * This only applies when using the location as a transfer destination. For more information,
     * see [Access
     * tiers](https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-access-tiers)
     * .
     *
     * Default: - "HOT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureaccesstier)
     */
    override fun azureAccessTier(): String? = unwrap(this).getAzureAccessTier()

    /**
     * Specifies the authentication method DataSync uses to access your Azure Blob Storage.
     *
     * DataSync can access blob storage using a shared access signature (SAS).
     *
     * Default: - "SAS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobauthenticationtype)
     */
    override fun azureBlobAuthenticationType(): String =
        unwrap(this).getAzureBlobAuthenticationType()

    /**
     * Specifies the URL of the Azure Blob Storage container involved in your transfer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobcontainerurl)
     */
    override fun azureBlobContainerUrl(): String? = unwrap(this).getAzureBlobContainerUrl()

    /**
     * Specifies the SAS configuration that allows DataSync to access your Azure Blob Storage.
     *
     *
     * If you provide an authentication token using `SasConfiguration` , but do not provide secret
     * configuration details using `CmkSecretConfig` or `CustomSecretConfig` , then DataSync stores the
     * token using your AWS account's secrets manager secret.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobsasconfiguration)
     */
    override fun azureBlobSasConfiguration(): Any? = unwrap(this).getAzureBlobSasConfiguration()

    /**
     * Specifies the type of blob that you want your objects or files to be when transferring them
     * into Azure Blob Storage.
     *
     * Currently, DataSync only supports moving data into Azure Blob Storage as block blobs. For
     * more information on blob types, see the [Azure Blob Storage
     * documentation](https://docs.aws.amazon.com/https://learn.microsoft.com/en-us/rest/api/storageservices/understanding-block-blobs--append-blobs--and-page-blobs)
     * .
     *
     * Default: - "BLOCK"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-azureblobtype)
     */
    override fun azureBlobType(): String? = unwrap(this).getAzureBlobType()

    /**
     * Specifies configuration information for a DataSync-managed secret, such as an authentication
     * token or secret key that DataSync uses to access a specific storage location, with a
     * customer-managed AWS KMS key .
     *
     *
     * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
     * `CreateLocation` request. Do not provide both parameters for the same request.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-cmksecretconfig)
     */
    override fun cmkSecretConfig(): Any? = unwrap(this).getCmkSecretConfig()

    /**
     * Specifies configuration information for a customer-managed Secrets Manager secret where a
     * storage location authentication token or secret key is stored in plain text.
     *
     * This configuration includes the secret ARN, and the ARN for an IAM role that provides access
     * to the secret.
     *
     *
     * You can use either `CmkSecretConfig` or `CustomSecretConfig` to provide credentials for a
     * `CreateLocation` request. Do not provide both parameters for the same request.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-customsecretconfig)
     */
    override fun customSecretConfig(): Any? = unwrap(this).getCustomSecretConfig()

    /**
     * Specifies path segments if you want to limit your transfer to a virtual directory in your
     * container (for example, `/my/images` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-subdirectory)
     */
    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your transfer location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationazureblob.html#cfn-datasync-locationazureblob-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationAzureBlobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps):
        CfnLocationAzureBlobProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLocationAzureBlobProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationAzureBlobProps):
        software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationAzureBlobProps
  }
}
