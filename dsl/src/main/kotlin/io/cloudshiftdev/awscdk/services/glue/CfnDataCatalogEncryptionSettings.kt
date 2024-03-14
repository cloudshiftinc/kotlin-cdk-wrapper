package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataCatalogEncryptionSettings internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun catalogId(): String = unwrap(this).getCatalogId()

  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
  }

  public open fun dataCatalogEncryptionSettings(): Any =
      unwrap(this).getDataCatalogEncryptionSettings()

  public open fun dataCatalogEncryptionSettings(`value`: IResolvable) {
    unwrap(this).setDataCatalogEncryptionSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun dataCatalogEncryptionSettings(`value`: DataCatalogEncryptionSettingsProperty) {
    unwrap(this).setDataCatalogEncryptionSettings(`value`.let(DataCatalogEncryptionSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("856c1e654ef8c1a683d3e71f73a78187bb1fb5b3a4b37e7c1cabc833f6dc0705")
  public open
      fun dataCatalogEncryptionSettings(`value`: DataCatalogEncryptionSettingsProperty.Builder.() -> Unit):
      Unit = dataCatalogEncryptionSettings(DataCatalogEncryptionSettingsProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun catalogId(catalogId: String) {
    }

    public fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: IResolvable) {
    }

    public
        fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: DataCatalogEncryptionSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75569b14742d1e1d1b732100581f6ec8f9e4012838a4e68540f214adce64afcb")
    public
        fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: DataCatalogEncryptionSettingsProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.Builder =
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.Builder.create(scope,
        id)

    public override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    public override fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: IResolvable) {
      cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings.let(IResolvable::unwrap))
    }

    public override
        fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: DataCatalogEncryptionSettingsProperty) {
      cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings.let(DataCatalogEncryptionSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75569b14742d1e1d1b732100581f6ec8f9e4012838a4e68540f214adce64afcb")
    public override
        fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: DataCatalogEncryptionSettingsProperty.Builder.() -> Unit):
        Unit =
        dataCatalogEncryptionSettings(DataCatalogEncryptionSettingsProperty(dataCatalogEncryptionSettings))

    public fun build(): software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings = wrapped.cdkObject
  }

  public interface EncryptionAtRestProperty {
    public fun catalogEncryptionMode(): String? = unwrap(this).getCatalogEncryptionMode()

    public fun catalogEncryptionServiceRole(): String? =
        unwrap(this).getCatalogEncryptionServiceRole()

    public fun sseAwsKmsKeyId(): String? = unwrap(this).getSseAwsKmsKeyId()

    public interface Builder {
      public fun catalogEncryptionMode(catalogEncryptionMode: String) {
      }

      public fun catalogEncryptionServiceRole(catalogEncryptionServiceRole: String) {
      }

      public fun sseAwsKmsKeyId(sseAwsKmsKeyId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty.builder()

      public override fun catalogEncryptionMode(catalogEncryptionMode: String) {
        cdkBuilder.catalogEncryptionMode(catalogEncryptionMode)
      }

      public override fun catalogEncryptionServiceRole(catalogEncryptionServiceRole: String) {
        cdkBuilder.catalogEncryptionServiceRole(catalogEncryptionServiceRole)
      }

      public override fun sseAwsKmsKeyId(sseAwsKmsKeyId: String) {
        cdkBuilder.sseAwsKmsKeyId(sseAwsKmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty,
    ) : EncryptionAtRestProperty {
      public override fun catalogEncryptionMode(): String? = unwrap(this).getCatalogEncryptionMode()

      public override fun catalogEncryptionServiceRole(): String? =
          unwrap(this).getCatalogEncryptionServiceRole()

      public override fun sseAwsKmsKeyId(): String? = unwrap(this).getSseAwsKmsKeyId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionAtRestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty):
          EncryptionAtRestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionAtRestProperty):
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataCatalogEncryptionSettingsProperty {
    public fun connectionPasswordEncryption(): Any? = unwrap(this).getConnectionPasswordEncryption()

    public fun encryptionAtRest(): Any? = unwrap(this).getEncryptionAtRest()

    public interface Builder {
      public fun connectionPasswordEncryption(connectionPasswordEncryption: IResolvable) {
      }

      public
          fun connectionPasswordEncryption(connectionPasswordEncryption: ConnectionPasswordEncryptionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("535a09664a45134d196d3b8cba6b76e0a3757801bcfba8d545727477b5a1c078")
      public
          fun connectionPasswordEncryption(connectionPasswordEncryption: ConnectionPasswordEncryptionProperty.Builder.() -> Unit) {
      }

      public fun encryptionAtRest(encryptionAtRest: IResolvable) {
      }

      public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfa85bce49148dde4e4efc40ffa3cc4e75ade4f3ca43e59141b5771fa98d3644")
      public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.builder()

      public override fun connectionPasswordEncryption(connectionPasswordEncryption: IResolvable) {
        cdkBuilder.connectionPasswordEncryption(connectionPasswordEncryption.let(IResolvable::unwrap))
      }

      public override
          fun connectionPasswordEncryption(connectionPasswordEncryption: ConnectionPasswordEncryptionProperty) {
        cdkBuilder.connectionPasswordEncryption(connectionPasswordEncryption.let(ConnectionPasswordEncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("535a09664a45134d196d3b8cba6b76e0a3757801bcfba8d545727477b5a1c078")
      public override
          fun connectionPasswordEncryption(connectionPasswordEncryption: ConnectionPasswordEncryptionProperty.Builder.() -> Unit):
          Unit =
          connectionPasswordEncryption(ConnectionPasswordEncryptionProperty(connectionPasswordEncryption))

      public override fun encryptionAtRest(encryptionAtRest: IResolvable) {
        cdkBuilder.encryptionAtRest(encryptionAtRest.let(IResolvable::unwrap))
      }

      public override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty) {
        cdkBuilder.encryptionAtRest(encryptionAtRest.let(EncryptionAtRestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfa85bce49148dde4e4efc40ffa3cc4e75ade4f3ca43e59141b5771fa98d3644")
      public override
          fun encryptionAtRest(encryptionAtRest: EncryptionAtRestProperty.Builder.() -> Unit): Unit
          = encryptionAtRest(EncryptionAtRestProperty(encryptionAtRest))

      public fun build():
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty,
    ) : DataCatalogEncryptionSettingsProperty {
      public override fun connectionPasswordEncryption(): Any? =
          unwrap(this).getConnectionPasswordEncryption()

      public override fun encryptionAtRest(): Any? = unwrap(this).getEncryptionAtRest()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataCatalogEncryptionSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty):
          DataCatalogEncryptionSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataCatalogEncryptionSettingsProperty):
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConnectionPasswordEncryptionProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun returnConnectionPasswordEncrypted(): Any? =
        unwrap(this).getReturnConnectionPasswordEncrypted()

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String) {
      }

      public fun returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted: Boolean) {
      }

      public fun returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty.builder()

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public override
          fun returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted: Boolean) {
        cdkBuilder.returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted)
      }

      public override
          fun returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted: IResolvable) {
        cdkBuilder.returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty,
    ) : ConnectionPasswordEncryptionProperty {
      public override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      public override fun returnConnectionPasswordEncrypted(): Any? =
          unwrap(this).getReturnConnectionPasswordEncrypted()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectionPasswordEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty):
          ConnectionPasswordEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionPasswordEncryptionProperty):
          software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
