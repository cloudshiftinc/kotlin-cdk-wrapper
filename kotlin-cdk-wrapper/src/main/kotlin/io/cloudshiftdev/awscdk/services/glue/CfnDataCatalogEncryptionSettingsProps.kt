@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnDataCatalogEncryptionSettingsProps {
  public fun catalogId(): String

  public fun dataCatalogEncryptionSettings(): Any

  @CdkDslMarker
  public interface Builder {
    public fun catalogId(catalogId: String)

    public fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: IResolvable)

    public
        fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9c670735f5e91e3f19bc716cee60e3ecba5e15ea526724114ac5021fdcc62e0")
    public
        fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps.Builder =
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps.builder()

    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    override fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: IResolvable) {
      cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings.let(IResolvable::unwrap))
    }

    override
        fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty) {
      cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings.let(CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty::unwrap))
    }

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
    override fun catalogId(): String = unwrap(this).getCatalogId()

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
        CfnDataCatalogEncryptionSettingsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataCatalogEncryptionSettingsProps):
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps
  }
}
