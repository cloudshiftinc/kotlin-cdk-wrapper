package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMLTransform internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun glueVersion(): String? = unwrap(this).getGlueVersion()

  public open fun glueVersion(`value`: String) {
    unwrap(this).setGlueVersion(`value`)
  }

  public open fun inputRecordTables(): Any = unwrap(this).getInputRecordTables()

  public open fun inputRecordTables(`value`: IResolvable) {
    unwrap(this).setInputRecordTables(`value`.let(IResolvable::unwrap))
  }

  public open fun inputRecordTables(`value`: InputRecordTablesProperty) {
    unwrap(this).setInputRecordTables(`value`.let(InputRecordTablesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8d17b09612a6a984b1a4d0528aa1ec658b7e3a3eb5cf7f205100acbfa1318fb7")
  public open fun inputRecordTables(`value`: InputRecordTablesProperty.Builder.() -> Unit): Unit =
      inputRecordTables(InputRecordTablesProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  public open fun maxCapacity(`value`: Number) {
    unwrap(this).setMaxCapacity(`value`)
  }

  public open fun maxRetries(): Number? = unwrap(this).getMaxRetries()

  public open fun maxRetries(`value`: Number) {
    unwrap(this).setMaxRetries(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

  public open fun numberOfWorkers(`value`: Number) {
    unwrap(this).setNumberOfWorkers(`value`)
  }

  public open fun role(): String = unwrap(this).getRole()

  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun timeout(): Number? = unwrap(this).getTimeout()

  public open fun timeout(`value`: Number) {
    unwrap(this).setTimeout(`value`)
  }

  public open fun transformEncryption(): Any? = unwrap(this).getTransformEncryption()

  public open fun transformEncryption(`value`: IResolvable) {
    unwrap(this).setTransformEncryption(`value`.let(IResolvable::unwrap))
  }

  public open fun transformEncryption(`value`: TransformEncryptionProperty) {
    unwrap(this).setTransformEncryption(`value`.let(TransformEncryptionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11ae5be441f598752f9087139ca75baaf4cedb2744d5a4fa806ec59ae9da1d99")
  public open fun transformEncryption(`value`: TransformEncryptionProperty.Builder.() -> Unit): Unit
      = transformEncryption(TransformEncryptionProperty(`value`))

  public open fun transformParameters(): Any = unwrap(this).getTransformParameters()

  public open fun transformParameters(`value`: IResolvable) {
    unwrap(this).setTransformParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun transformParameters(`value`: TransformParametersProperty) {
    unwrap(this).setTransformParameters(`value`.let(TransformParametersProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dcc06b7991decb499cc51d8fae892d0555ecb8b535ff5c779af07e05284ee490")
  public open fun transformParameters(`value`: TransformParametersProperty.Builder.() -> Unit): Unit
      = transformParameters(TransformParametersProperty(`value`))

  public open fun workerType(): String? = unwrap(this).getWorkerType()

  public open fun workerType(`value`: String) {
    unwrap(this).setWorkerType(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun glueVersion(glueVersion: String)

    public fun inputRecordTables(inputRecordTables: IResolvable)

    public fun inputRecordTables(inputRecordTables: InputRecordTablesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fca839ef9d1b62497d77256d22b07512a4a920922f8aa6f37e15f312aaa82c75")
    public fun inputRecordTables(inputRecordTables: InputRecordTablesProperty.Builder.() -> Unit)

    public fun maxCapacity(maxCapacity: Number)

    public fun maxRetries(maxRetries: Number)

    public fun name(name: String)

    public fun numberOfWorkers(numberOfWorkers: Number)

    public fun role(role: String)

    public fun tags(tags: Any)

    public fun timeout(timeout: Number)

    public fun transformEncryption(transformEncryption: IResolvable)

    public fun transformEncryption(transformEncryption: TransformEncryptionProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b4c4be7710e625f57455d8cede56a9d6bb04bd35ce28cec13ebb09d79d53e11")
    public
        fun transformEncryption(transformEncryption: TransformEncryptionProperty.Builder.() -> Unit)

    public fun transformParameters(transformParameters: IResolvable)

    public fun transformParameters(transformParameters: TransformParametersProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fed60572c4823d8272124aedabc053c220a64599b0630ba5a3c181911cfd7ec9")
    public
        fun transformParameters(transformParameters: TransformParametersProperty.Builder.() -> Unit)

    public fun workerType(workerType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnMLTransform.Builder =
        software.amazon.awscdk.services.glue.CfnMLTransform.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun glueVersion(glueVersion: String) {
      cdkBuilder.glueVersion(glueVersion)
    }

    override fun inputRecordTables(inputRecordTables: IResolvable) {
      cdkBuilder.inputRecordTables(inputRecordTables.let(IResolvable::unwrap))
    }

    override fun inputRecordTables(inputRecordTables: InputRecordTablesProperty) {
      cdkBuilder.inputRecordTables(inputRecordTables.let(InputRecordTablesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fca839ef9d1b62497d77256d22b07512a4a920922f8aa6f37e15f312aaa82c75")
    override fun inputRecordTables(inputRecordTables: InputRecordTablesProperty.Builder.() -> Unit):
        Unit = inputRecordTables(InputRecordTablesProperty(inputRecordTables))

    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun numberOfWorkers(numberOfWorkers: Number) {
      cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    override fun transformEncryption(transformEncryption: IResolvable) {
      cdkBuilder.transformEncryption(transformEncryption.let(IResolvable::unwrap))
    }

    override fun transformEncryption(transformEncryption: TransformEncryptionProperty) {
      cdkBuilder.transformEncryption(transformEncryption.let(TransformEncryptionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b4c4be7710e625f57455d8cede56a9d6bb04bd35ce28cec13ebb09d79d53e11")
    override
        fun transformEncryption(transformEncryption: TransformEncryptionProperty.Builder.() -> Unit):
        Unit = transformEncryption(TransformEncryptionProperty(transformEncryption))

    override fun transformParameters(transformParameters: IResolvable) {
      cdkBuilder.transformParameters(transformParameters.let(IResolvable::unwrap))
    }

    override fun transformParameters(transformParameters: TransformParametersProperty) {
      cdkBuilder.transformParameters(transformParameters.let(TransformParametersProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fed60572c4823d8272124aedabc053c220a64599b0630ba5a3c181911cfd7ec9")
    override
        fun transformParameters(transformParameters: TransformParametersProperty.Builder.() -> Unit):
        Unit = transformParameters(TransformParametersProperty(transformParameters))

    override fun workerType(workerType: String) {
      cdkBuilder.workerType(workerType)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnMLTransform = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMLTransform {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMLTransform(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform):
        CfnMLTransform = CfnMLTransform(cdkObject)

    internal fun unwrap(wrapped: CfnMLTransform):
        software.amazon.awscdk.services.glue.CfnMLTransform = wrapped.cdkObject
  }

  public interface GlueTablesProperty {
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    public fun connectionName(): String? = unwrap(this).getConnectionName()

    public fun databaseName(): String

    public fun tableName(): String

    public interface Builder {
      public fun catalogId(catalogId: String)

      public fun connectionName(connectionName: String)

      public fun databaseName(databaseName: String)

      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty.Builder =
          software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty.builder()

      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty,
    ) : GlueTablesProperty {
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      override fun connectionName(): String? = unwrap(this).getConnectionName()

      override fun databaseName(): String = unwrap(this).getDatabaseName()

      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GlueTablesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty):
          GlueTablesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlueTablesProperty):
          software.amazon.awscdk.services.glue.CfnMLTransform.GlueTablesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TransformEncryptionProperty {
    public fun mlUserDataEncryption(): Any? = unwrap(this).getMlUserDataEncryption()

    public fun taskRunSecurityConfigurationName(): String? =
        unwrap(this).getTaskRunSecurityConfigurationName()

    public interface Builder {
      public fun mlUserDataEncryption(mlUserDataEncryption: IResolvable)

      public fun mlUserDataEncryption(mlUserDataEncryption: MLUserDataEncryptionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6581c0127c03889021bdaa631f1ef422965b6cae92da1772aa113a216c632231")
      public
          fun mlUserDataEncryption(mlUserDataEncryption: MLUserDataEncryptionProperty.Builder.() -> Unit)

      public fun taskRunSecurityConfigurationName(taskRunSecurityConfigurationName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty.Builder =
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty.builder()

      override fun mlUserDataEncryption(mlUserDataEncryption: IResolvable) {
        cdkBuilder.mlUserDataEncryption(mlUserDataEncryption.let(IResolvable::unwrap))
      }

      override fun mlUserDataEncryption(mlUserDataEncryption: MLUserDataEncryptionProperty) {
        cdkBuilder.mlUserDataEncryption(mlUserDataEncryption.let(MLUserDataEncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6581c0127c03889021bdaa631f1ef422965b6cae92da1772aa113a216c632231")
      override
          fun mlUserDataEncryption(mlUserDataEncryption: MLUserDataEncryptionProperty.Builder.() -> Unit):
          Unit = mlUserDataEncryption(MLUserDataEncryptionProperty(mlUserDataEncryption))

      override fun taskRunSecurityConfigurationName(taskRunSecurityConfigurationName: String) {
        cdkBuilder.taskRunSecurityConfigurationName(taskRunSecurityConfigurationName)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty,
    ) : TransformEncryptionProperty {
      override fun mlUserDataEncryption(): Any? = unwrap(this).getMlUserDataEncryption()

      override fun taskRunSecurityConfigurationName(): String? =
          unwrap(this).getTaskRunSecurityConfigurationName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TransformEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty):
          TransformEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformEncryptionProperty):
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FindMatchesParametersProperty {
    public fun accuracyCostTradeoff(): Number? = unwrap(this).getAccuracyCostTradeoff()

    public fun enforceProvidedLabels(): Any? = unwrap(this).getEnforceProvidedLabels()

    public fun precisionRecallTradeoff(): Number? = unwrap(this).getPrecisionRecallTradeoff()

    public fun primaryKeyColumnName(): String

    public interface Builder {
      public fun accuracyCostTradeoff(accuracyCostTradeoff: Number)

      public fun enforceProvidedLabels(enforceProvidedLabels: Boolean)

      public fun enforceProvidedLabels(enforceProvidedLabels: IResolvable)

      public fun precisionRecallTradeoff(precisionRecallTradeoff: Number)

      public fun primaryKeyColumnName(primaryKeyColumnName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty.builder()

      override fun accuracyCostTradeoff(accuracyCostTradeoff: Number) {
        cdkBuilder.accuracyCostTradeoff(accuracyCostTradeoff)
      }

      override fun enforceProvidedLabels(enforceProvidedLabels: Boolean) {
        cdkBuilder.enforceProvidedLabels(enforceProvidedLabels)
      }

      override fun enforceProvidedLabels(enforceProvidedLabels: IResolvable) {
        cdkBuilder.enforceProvidedLabels(enforceProvidedLabels.let(IResolvable::unwrap))
      }

      override fun precisionRecallTradeoff(precisionRecallTradeoff: Number) {
        cdkBuilder.precisionRecallTradeoff(precisionRecallTradeoff)
      }

      override fun primaryKeyColumnName(primaryKeyColumnName: String) {
        cdkBuilder.primaryKeyColumnName(primaryKeyColumnName)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty,
    ) : FindMatchesParametersProperty {
      override fun accuracyCostTradeoff(): Number? = unwrap(this).getAccuracyCostTradeoff()

      override fun enforceProvidedLabels(): Any? = unwrap(this).getEnforceProvidedLabels()

      override fun precisionRecallTradeoff(): Number? = unwrap(this).getPrecisionRecallTradeoff()

      override fun primaryKeyColumnName(): String = unwrap(this).getPrimaryKeyColumnName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FindMatchesParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty):
          FindMatchesParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FindMatchesParametersProperty):
          software.amazon.awscdk.services.glue.CfnMLTransform.FindMatchesParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TransformParametersProperty {
    public fun findMatchesParameters(): Any? = unwrap(this).getFindMatchesParameters()

    public fun transformType(): String

    public interface Builder {
      public fun findMatchesParameters(findMatchesParameters: IResolvable)

      public fun findMatchesParameters(findMatchesParameters: FindMatchesParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("055271c8dbf190a4491fabcaa7f3f2e1c134b79e0e44bc9a47180b08b617f409")
      public
          fun findMatchesParameters(findMatchesParameters: FindMatchesParametersProperty.Builder.() -> Unit)

      public fun transformType(transformType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty.Builder =
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty.builder()

      override fun findMatchesParameters(findMatchesParameters: IResolvable) {
        cdkBuilder.findMatchesParameters(findMatchesParameters.let(IResolvable::unwrap))
      }

      override fun findMatchesParameters(findMatchesParameters: FindMatchesParametersProperty) {
        cdkBuilder.findMatchesParameters(findMatchesParameters.let(FindMatchesParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("055271c8dbf190a4491fabcaa7f3f2e1c134b79e0e44bc9a47180b08b617f409")
      override
          fun findMatchesParameters(findMatchesParameters: FindMatchesParametersProperty.Builder.() -> Unit):
          Unit = findMatchesParameters(FindMatchesParametersProperty(findMatchesParameters))

      override fun transformType(transformType: String) {
        cdkBuilder.transformType(transformType)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty,
    ) : TransformParametersProperty {
      override fun findMatchesParameters(): Any? = unwrap(this).getFindMatchesParameters()

      override fun transformType(): String = unwrap(this).getTransformType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TransformParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty):
          TransformParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformParametersProperty):
          software.amazon.awscdk.services.glue.CfnMLTransform.TransformParametersProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface MLUserDataEncryptionProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun mlUserDataEncryptionMode(): String

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)

      public fun mlUserDataEncryptionMode(mlUserDataEncryptionMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty.Builder =
          software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun mlUserDataEncryptionMode(mlUserDataEncryptionMode: String) {
        cdkBuilder.mlUserDataEncryptionMode(mlUserDataEncryptionMode)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty,
    ) : MLUserDataEncryptionProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun mlUserDataEncryptionMode(): String = unwrap(this).getMlUserDataEncryptionMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MLUserDataEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty):
          MLUserDataEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MLUserDataEncryptionProperty):
          software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputRecordTablesProperty {
    public fun glueTables(): Any? = unwrap(this).getGlueTables()

    public interface Builder {
      public fun glueTables(glueTables: IResolvable)

      public fun glueTables(glueTables: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty.Builder =
          software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty.builder()

      override fun glueTables(glueTables: IResolvable) {
        cdkBuilder.glueTables(glueTables.let(IResolvable::unwrap))
      }

      override fun glueTables(glueTables: List<Any>) {
        cdkBuilder.glueTables(glueTables)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty,
    ) : InputRecordTablesProperty {
      override fun glueTables(): Any? = unwrap(this).getGlueTables()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputRecordTablesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty):
          InputRecordTablesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputRecordTablesProperty):
          software.amazon.awscdk.services.glue.CfnMLTransform.InputRecordTablesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
