@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataCatalogEncryptionSettings`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * CfnDataCatalogEncryptionSettingsProps cfnDataCatalogEncryptionSettingsProps =
 * CfnDataCatalogEncryptionSettingsProps.builder()
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
public interface CfnDataCatalogEncryptionSettingsProps {
  /**
   * The ID of the Data Catalog in which the settings are created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-catalogid)
   */
  public fun catalogId(): String

  /**
   * Contains configuration information for maintaining Data Catalog security.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-datacatalogencryptionsettings)
   */
  public fun dataCatalogEncryptionSettings(): Any

  /**
   * A builder for [CfnDataCatalogEncryptionSettingsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param catalogId The ID of the Data Catalog in which the settings are created. 
     */
    public fun catalogId(catalogId: String)

    /**
     * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
     * Catalog security. 
     */
    public fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: IResolvable)

    /**
     * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
     * Catalog security. 
     */
    public
        fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty)

    /**
     * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
     * Catalog security. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9c670735f5e91e3f19bc716cee60e3ecba5e15ea526724114ac5021fdcc62e0")
    public
        fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps.Builder =
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps.builder()

    /**
     * @param catalogId The ID of the Data Catalog in which the settings are created. 
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
     * Catalog security. 
     */
    override fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: IResolvable) {
      cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings.let(IResolvable::unwrap))
    }

    /**
     * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
     * Catalog security. 
     */
    override
        fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty) {
      cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings.let(CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty::unwrap))
    }

    /**
     * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
     * Catalog security. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9c670735f5e91e3f19bc716cee60e3ecba5e15ea526724114ac5021fdcc62e0")
    override
        fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.Builder.() -> Unit):
        Unit =
        dataCatalogEncryptionSettings(CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty(dataCatalogEncryptionSettings))

    public fun build(): software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps,
  ) : CdkObject(cdkObject), CfnDataCatalogEncryptionSettingsProps {
    /**
     * The ID of the Data Catalog in which the settings are created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-catalogid)
     */
    override fun catalogId(): String = unwrap(this).getCatalogId()

    /**
     * Contains configuration information for maintaining Data Catalog security.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-datacatalogencryptionsettings)
     */
    override fun dataCatalogEncryptionSettings(): Any =
        unwrap(this).getDataCatalogEncryptionSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnDataCatalogEncryptionSettingsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps):
        CfnDataCatalogEncryptionSettingsProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnDataCatalogEncryptionSettingsProps

    internal fun unwrap(wrapped: CfnDataCatalogEncryptionSettingsProps):
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps
  }
}
